package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public abstract class a {
    public static volatile UserManager a;
    public static volatile boolean b;

    static {
        b = !(Build.VERSION.SDK_INT >= 24);
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        boolean z10 = b;
        if (!z10) {
            UserManager userManager = a;
            if (userManager == null) {
                synchronized (a.class) {
                    try {
                        userManager = a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            a = userManager2;
                            if (userManager2 == null) {
                                b = true;
                                z10 = true;
                            } else {
                                userManager = userManager2;
                            }
                        }
                    } finally {
                    }
                }
            }
            z10 = userManager.isUserUnlocked();
            b = z10;
            if (z10) {
                a = null;
            }
        }
        return !z10;
    }
}
