package c8;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class nd {
    public static wi.m a;

    public static boolean a(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }
}
