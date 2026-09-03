package androidx.biometric;

import android.security.keystore.KeyGenParameterSpec;
import javax.crypto.KeyGenerator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static KeyGenParameterSpec a(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }

    public static KeyGenParameterSpec.Builder b(String str, int i10) {
        return new KeyGenParameterSpec.Builder(str, i10);
    }

    public static void c(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) {
        keyGenerator.init(keyGenParameterSpec);
    }

    public static void d(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes("CBC");
    }

    public static void e(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings("PKCS7Padding");
    }
}
