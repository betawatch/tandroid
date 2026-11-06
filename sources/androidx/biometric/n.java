package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(BiometricPrompt.Builder builder, int i7) {
        builder.setAllowedAuthenticators(i7);
    }
}
