package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ i9(int i10, boolean z10) {
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
                        i0.g3(new i9(i10, z10));
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
                zs.e().k(zs.Q1, Boolean.valueOf(this.b));
                break;
            case 2:
                boolean z11 = this.b;
                Iterator it = sc.n.iterator();
                while (it.hasNext()) {
                    q20 q20Var = (q20) it.next();
                    if (q20Var != null) {
                        q20Var.a(Boolean.valueOf(z11));
                    }
                }
                break;
            default:
                zs.e().k(zs.n4, Boolean.FALSE, Boolean.valueOf(this.b));
                break;
        }
    }
}
