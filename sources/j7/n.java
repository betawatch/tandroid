package j7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class n {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.k0.a(context);
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
        return Build.VERSION.SDK_INT >= 23 ? androidx.biometric.k0.b(a2) : androidx.biometric.j0.a(a2);
    }
}
