package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ j9(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                KeyPairGenerator keyPairGenerator = d6.e;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        d6.e = keyPairGenerator;
                    } catch (Exception e) {
                        f8.g(e, true);
                        keyPairGenerator = null;
                    }
                }
                if (keyPairGenerator != null) {
                    try {
                        Locale locale = Locale.getDefault();
                        Locale locale2 = Locale.ENGLISH;
                        Locale.setDefault(locale2);
                        Resources resources = w0.b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = w0.b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        i0.g3(new j9(i10, z10));
                        break;
                    } catch (InvalidAlgorithmParameterException e7) {
                        f8.g(e7, true);
                        return;
                    } catch (Exception e10) {
                        if (e10.getClass().getName().equals("android.security.KeyStoreException")) {
                            return;
                        }
                        f8.g(e10, true);
                        return;
                    }
                }
                break;
            case 1:
                at.e().k(at.Q1, Boolean.valueOf(this.b));
                break;
            case 2:
                boolean z11 = this.b;
                Iterator it = tc.n.iterator();
                while (it.hasNext()) {
                    r20 r20Var = (r20) it.next();
                    if (r20Var != null) {
                        r20Var.a(Boolean.valueOf(z11));
                    }
                }
                break;
            default:
                at.e().k(at.n4, Boolean.FALSE, Boolean.valueOf(this.b));
                break;
        }
    }
}
