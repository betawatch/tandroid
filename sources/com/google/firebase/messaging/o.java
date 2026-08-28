package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.widget.LinearLayout;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.ActionBar.v4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o {
    public int a;
    public int b;
    public final Context c;
    public Object d;
    public Object e;

    public o(Context context) {
        this.b = 0;
        this.c = context;
    }

    public static String c(s8.h hVar) {
        hVar.a();
        s8.j jVar = hVar.c;
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
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized String b() {
        try {
            if (((String) this.e) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.e;
    }

    public PackageInfo d(String str) {
        try {
            return this.c.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean e() {
        int i9;
        synchronized (this) {
            i9 = this.b;
            if (i9 == 0) {
                PackageManager packageManager = this.c.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i9 = 0;
                } else {
                    if (!e6.b.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i9 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (e6.b.d()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i9 = this.b;
                    } else {
                        this.b = 2;
                        i9 = 2;
                    }
                }
            }
        }
        return i9 != 0;
    }

    public synchronized void f() {
        PackageInfo d = d(this.c.getPackageName());
        if (d != null) {
            this.d = Integer.toString(d.versionCode);
            this.e = d.versionName;
        }
    }

    public o(t4 t4Var, Context context, int i9) {
        this.e = t4Var;
        this.c = context;
        this.a = i9;
        int dp = AndroidUtilities.dp(18.0f);
        this.b = dp;
        LinearLayout b10 = v4.b(t4Var.Q, context, null, true, false, false);
        b10.setPadding(dp, 0, dp, 0);
        this.d = b10;
    }
}
