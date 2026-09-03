package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class t {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
