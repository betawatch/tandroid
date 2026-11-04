package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h4 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String b(n9.h hVar) {
        hVar.a();
        n9.k kVar = hVar.c;
        String str = kVar.e;
        if (str != null) {
            return str;
        }
        hVar.a();
        String str2 = kVar.b;
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
            if (((String) this.c) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.c;
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
            return ((Context) this.d).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i3;
        synchronized (this) {
            i3 = this.b;
            if (i3 == 0) {
                PackageManager packageManager = ((Context) this.d).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i3 = 0;
                } else {
                    if (!w6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i3 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (w6.b.d()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i3 = this.b;
                    } else {
                        this.b = 2;
                        i3 = 2;
                    }
                }
            }
        }
        return i3 != 0;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.d).getPackageName());
        if (d != null) {
            this.c = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }
}
