package h7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class y {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.i0.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean b(Context context) {
        KeyguardManager a2 = a(context);
        if (a2 == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 23 ? androidx.biometric.i0.b(a2) : androidx.biometric.h0.a(a2);
    }
}
