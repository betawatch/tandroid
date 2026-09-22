package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
