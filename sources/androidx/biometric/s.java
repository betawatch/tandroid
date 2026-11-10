package androidx.biometric;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class s {
    public static int a(BiometricManager biometricManager, int i7) {
        return biometricManager.canAuthenticate(i7);
    }
}
