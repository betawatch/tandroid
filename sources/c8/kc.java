package c8;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class kc {
    public static ti.n a;

    public static boolean a(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 26 && context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0;
    }
}
