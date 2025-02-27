package androidx.core.app;

import android.app.ActivityManager;

/* loaded from: classes.dex */
public abstract class ActivityManagerCompat {
    public static boolean isLowRamDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
