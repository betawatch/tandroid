package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
