package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
