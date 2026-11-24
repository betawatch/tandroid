// default package

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class b9d {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, z4f z4fVar) {
        Bundle bundle;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str = z4fVar.a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (z4fVar.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(a);
            } catch (RemoteException | IllegalArgumentException e) {
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                acquireUnstableContentProviderClient.release();
                if (bundle != null) {
                    Intent intent2 = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            StringBuilder sb = new StringBuilder(str.length() + 72);
                            sb.append("Dynamic lookup for intent failed for action ");
                            sb.append(str);
                            sb.append(" but has possible resolution");
                            Log.w("ServiceBindIntentUtils", sb.toString());
                            throw new q8d(new ot2(25, pendingIntent, null));
                        }
                    }
                }
                if (intent == null) {
                    Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new Intent(str).setPackage(z4fVar.b) : intent;
    }
}
