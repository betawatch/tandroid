package org.telegram.messenger;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c9(int i3, boolean z10) {
        this.a = i3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 1;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                KeyPairGenerator keyPairGenerator = sr.f;
                if (keyPairGenerator == null) {
                    try {
                        keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        sr.f = keyPairGenerator;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        keyPairGenerator = null;
                    }
                }
                if (keyPairGenerator != null) {
                    try {
                        Locale locale = Locale.getDefault();
                        Locale locale2 = Locale.ENGLISH;
                        Locale.setDefault(locale2);
                        Resources resources = t0.b.getResources();
                        Configuration configuration = resources.getConfiguration();
                        configuration.setLocale(locale2);
                        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                        keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("tmessages_passcode", 3).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setUserAuthenticationRequired(true).build());
                        keyPairGenerator.generateKeyPair();
                        Locale.setDefault(locale);
                        Resources resources2 = t0.b.getResources();
                        Configuration configuration2 = resources2.getConfiguration();
                        configuration2.setLocale(locale);
                        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
                        g0.h3(new c9(i3, z10));
                        break;
                    } catch (InvalidAlgorithmParameterException e11) {
                        a8.g(e11, true);
                        return;
                    } catch (Exception e12) {
                        if (e12.getClass().getName().equals("android.security.KeyStoreException")) {
                            return;
                        }
                        a8.g(e12, true);
                        return;
                    }
                }
                break;
            case 1:
                hs.e().k(hs.Q1, Boolean.valueOf(this.b));
                break;
            case 2:
                boolean z11 = this.b;
                Iterator it = lc.n.iterator();
                while (it.hasNext()) {
                    u10 u10Var = (u10) it.next();
                    if (u10Var != null) {
                        u10Var.a(Boolean.valueOf(z11));
                    }
                }
                break;
            default:
                hs.e().k(hs.n4, Boolean.FALSE, Boolean.valueOf(this.b));
                break;
        }
    }
}
