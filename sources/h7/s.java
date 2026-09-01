package h7;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.biometric.c0;
import androidx.biometric.d0;
import androidx.biometric.e0;
import androidx.biometric.w;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class s {
    public static r a;

    public static w a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b10 = c0.b("androidxBiometric", 3);
            c0.d(b10);
            c0.e(b10);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            c0.c(keyGenerator, c0.a(b10));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new w(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e6) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e6);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(w wVar) {
        IdentityCredential identityCredential;
        if (wVar == null) {
            return null;
        }
        Cipher cipher = wVar.b;
        if (cipher != null) {
            return d0.b(cipher);
        }
        Signature signature = wVar.a;
        if (signature != null) {
            return d0.a(signature);
        }
        Mac mac = wVar.c;
        if (mac != null) {
            return d0.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = wVar.d) == null) {
            return null;
        }
        return e0.a(identityCredential);
    }

    public static synchronized q c(o oVar) {
        q qVar;
        synchronized (s.class) {
            try {
                if (a == null) {
                    a = new r(0);
                }
                qVar = (q) a.F(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
