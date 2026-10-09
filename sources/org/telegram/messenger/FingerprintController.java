package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Locale;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class FingerprintController {
    private static final String KEY_ALIAS = "tmessages_passcode";
    private static Boolean hasChangedFingerprints;
    private static KeyPairGenerator keyPairGenerator;
    private static KeyStore keyStore;

    public static boolean checkDeviceFingerprintsChanged() {
        Boolean bool = hasChangedFingerprints;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding").init(2, keyStore.getKey(KEY_ALIAS, null));
            hasChangedFingerprints = Boolean.FALSE;
            return false;
        } catch (KeyPermanentlyInvalidatedException unused) {
            hasChangedFingerprints = Boolean.TRUE;
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            hasChangedFingerprints = Boolean.FALSE;
            return false;
        }
    }

    public static void checkKeyReady() {
        checkKeyReady(true);
    }

    public static void deleteInvalidKey() {
        try {
            getKeyStore().deleteEntry(KEY_ALIAS);
        } catch (KeyStoreException e7) {
            FileLog.e(e7);
        }
        hasChangedFingerprints = null;
        checkKeyReady(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void generateNewKey(boolean z10) {
        KeyPairGenerator keyPairGenerator2 = getKeyPairGenerator();
        if (keyPairGenerator2 != null) {
            try {
                Locale locale = Locale.getDefault();
                setLocale(Locale.ENGLISH);
                keyPairGenerator2.initialize(new KeyGenParameterSpec.Builder(KEY_ALIAS, 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                keyPairGenerator2.generateKeyPair();
                setLocale(locale);
                AndroidUtilities.runOnUIThread(new y3(1, z10));
            } catch (InvalidAlgorithmParameterException e7) {
                FileLog.e(e7);
            } catch (Exception e10) {
                if (e10.getClass().getName().equals("android.security.KeyStoreException")) {
                    return;
                }
                FileLog.e(e10);
            }
        }
    }

    private static KeyPairGenerator getKeyPairGenerator() {
        KeyPairGenerator keyPairGenerator2 = keyPairGenerator;
        if (keyPairGenerator2 != null) {
            return keyPairGenerator2;
        }
        try {
            KeyPairGenerator keyPairGenerator3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator = keyPairGenerator3;
            return keyPairGenerator3;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    private static KeyStore getKeyStore() {
        KeyStore keyStore2 = keyStore;
        if (keyStore2 != null) {
            return keyStore2;
        }
        try {
            KeyStore keyStore3 = KeyStore.getInstance("AndroidKeyStore");
            keyStore = keyStore3;
            keyStore3.load(null);
            return keyStore;
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    public static boolean isKeyReady() {
        try {
            return getKeyStore().containsAlias(KEY_ALIAS);
        } catch (KeyStoreException e7) {
            FileLog.e(e7);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$generateNewKey$0(boolean z10) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didGenerateFingerprintKeyPair, Boolean.valueOf(z10));
    }

    private static void setLocale(Locale locale) {
        Locale.setDefault(locale);
        Resources resources = ApplicationLoader.applicationContext.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void checkKeyReady(boolean z10) {
        boolean z11;
        FingerprintManager fingerprintManager;
        if (isKeyReady() || !AndroidUtilities.isKeyguardSecure()) {
            return;
        }
        boolean z12 = false;
        try {
            fingerprintManager = (FingerprintManager) ApplicationLoader.applicationContext.getSystemService("fingerprint");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (fingerprintManager != null) {
            z11 = fingerprintManager.isHardwareDetected();
            if (z11) {
                return;
            }
            try {
                FingerprintManager fingerprintManager2 = (FingerprintManager) ApplicationLoader.applicationContext.getSystemService("fingerprint");
                if (fingerprintManager2 != null) {
                    z12 = fingerprintManager2.hasEnrolledFingerprints();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (z12) {
                Utilities.globalQueue.postRunnable(new y3(0, z10));
                return;
            }
            return;
        }
        z11 = false;
        if (z11) {
        }
    }
}
