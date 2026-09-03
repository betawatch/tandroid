package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static BiometricPrompt.CryptoObject a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject b(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject c(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    public static Cipher d(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static Mac e(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static Signature f(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
