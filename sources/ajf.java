// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ajf {
    public final Context a;
    public int b;
    public byte c = 0;

    public ajf(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r0.isEmpty() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int a() {
        byte b = this.c;
        if (b != 0) {
            return b;
        }
        Context context = this.a;
        PackageManager packageManager = context.getPackageManager();
        if (s0d.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!ate.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null) {
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            r2 = 2;
            this.c = r2;
            return r2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        r2 = true == ate.a() ? (byte) 2 : (byte) 1;
        this.c = r2;
        return r2;
    }

    public final synchronized int b() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = s0d.a(this.a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }
}
