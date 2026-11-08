package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i7) {
        return biometricManager.canAuthenticate(i7);
    }
}
