package j7;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class m {
    public static KeyguardManager a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return androidx.biometric.j0.a(context);
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
        return Build.VERSION.SDK_INT >= 23 ? androidx.biometric.j0.b(a2) : androidx.biometric.i0.a(a2);
    }
}
