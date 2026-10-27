package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class m {
    public static void a(BiometricPrompt.Builder builder, int i10) {
        builder.setAllowedAuthenticators(i10);
    }
}
