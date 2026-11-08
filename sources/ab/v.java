package ab;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class v {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String b(o9.g gVar) {
        gVar.a();
        o9.i iVar = gVar.c;
        String str = iVar.e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.d) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.d;
    }

    public synchronized int c() {
        PackageInfo d;
        try {
            if (this.a == 0 && (d = d("com.google.android.gms")) != null) {
                this.a = d.versionCode;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.a;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i7;
        synchronized (this) {
            i7 = this.b;
            if (i7 == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i7 = 0;
                } else {
                    if (!x6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i7 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (x6.b.d()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i7 = this.b;
                    } else {
                        this.b = 2;
                        i7 = 2;
                    }
                }
            }
        }
        return i7 != 0;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.c).getPackageName());
        if (d != null) {
            this.d = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }
}
