package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
