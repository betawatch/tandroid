package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i7) {
        return biometricManager.canAuthenticate(i7);
    }
}
