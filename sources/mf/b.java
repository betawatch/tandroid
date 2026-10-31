package mf;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.view.WindowManager;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b {
    public static final int[] a = new int[2];

    public static int a(Context context) {
        Typeface typeface = i0.a;
        if (Settings.canDrawOverlays(context)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) == 0) ? 1 : -2;
        }
        return -1;
    }

    public static WindowManager.LayoutParams b(Context context, boolean z10) {
        int i10;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        if (!z10) {
            Typeface typeface = i0.a;
            if (Settings.canDrawOverlays(context)) {
                i10 = Build.VERSION.SDK_INT >= 26 ? 2038 : 2003;
                layoutParams.type = i10;
                layoutParams.flags = 520;
                return layoutParams;
            }
        }
        i10 = 2;
        layoutParams.type = i10;
        layoutParams.flags = 520;
        return layoutParams;
    }
}
