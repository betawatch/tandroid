package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String c(k9.h hVar) {
        hVar.a();
        k9.j jVar = hVar.c;
        String str = jVar.e;
        if (str != null) {
            return str;
        }
        hVar.a();
        String str2 = jVar.b;
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

    public synchronized String b() {
        try {
            if (((String) this.e) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.e;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    public boolean e() {
        int i10;
        synchronized (this) {
            i10 = this.b;
            if (i10 == 0) {
                PackageManager packageManager = ((Context) this.c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    if (!u6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i10 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (u6.b.d()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i10 = this.b;
                    } else {
                        this.b = 2;
                        i10 = 2;
                    }
                }
            }
        }
        return i10 != 0;
    }

    public synchronized void f() {
        PackageInfo d = d(((Context) this.c).getPackageName());
        if (d != null) {
            this.d = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }
}
