package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static BiometricPrompt.CryptoObject a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
