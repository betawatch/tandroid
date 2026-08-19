package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public abstract class zzaa {
    private static volatile UserManager zzdc;
    private static volatile boolean zzdd = !zzf();

    public static boolean zze(Context context) {
        return zzf() && !zzf(context);
    }

    private static boolean zzf() {
        return Build.VERSION.SDK_INT >= 24;
    }

    private static boolean zzf(Context context) {
        boolean isUserUnlocked;
        Object systemService;
        boolean z = zzdd;
        if (z) {
            return z;
        }
        UserManager userManager = zzdc;
        if (userManager == null) {
            synchronized (zzaa.class) {
                try {
                    userManager = zzdc;
                    if (userManager == null) {
                        systemService = context.getSystemService((Class<Object>) UserManager.class);
                        UserManager userManager2 = (UserManager) systemService;
                        zzdc = userManager2;
                        if (userManager2 == null) {
                            zzdd = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                } finally {
                }
            }
        }
        isUserUnlocked = userManager.isUserUnlocked();
        zzdd = isUserUnlocked;
        if (isUserUnlocked) {
            zzdc = null;
        }
        return isUserUnlocked;
    }
}
