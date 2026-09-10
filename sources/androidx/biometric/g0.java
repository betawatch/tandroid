package androidx.biometric;

import android.app.KeyguardManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class g0 {
    public static boolean a(KeyguardManager keyguardManager) {
        return keyguardManager.isKeyguardSecure();
    }
}
