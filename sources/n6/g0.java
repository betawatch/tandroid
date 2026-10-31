package n6;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final boolean c;

    public g0(String str, String str2, boolean z10) {
        l.e(str);
        this.a = str;
        l.e(str2);
        this.b = str2;
        this.c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context) {
        Bundle bundle;
        PendingIntent pendingIntent;
        ContentProviderClient acquireUnstableContentProviderClient;
        Intent intent = null;
        String str = this.a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(d);
            } catch (RemoteException e) {
                e = e;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e7) {
                e = e7;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                try {
                } catch (RemoteException e10) {
                    e = e10;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                }
                if (bundle == null && (intent = (Intent) bundle.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                    throw new z(new k6.a(25, pendingIntent));
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        return intent == null ? new Intent(str).setPackage(this.b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return l.k(this.a, g0Var.a) && l.k(this.b, g0Var.b) && l.k(null, null) && this.c == g0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        l.g(null);
        throw null;
    }
}
