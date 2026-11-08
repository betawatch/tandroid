package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    public void onAuthenticationError(int i7, CharSequence charSequence) {
        this.a.a(i7, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((x) this.a).a;
        if (weakReference.get() == null || !((z) weakReference.get()).n) {
            return;
        }
        z zVar = (z) weakReference.get();
        if (zVar.u == null) {
            zVar.u = new androidx.lifecycle.z();
        }
        z.h(zVar.u, Boolean.TRUE);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b10;
        v vVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = c0.d(cryptoObject);
            if (d != null) {
                vVar = new v(d);
            } else {
                Signature f10 = c0.f(cryptoObject);
                if (f10 != null) {
                    vVar = new v(f10);
                } else {
                    Mac e10 = c0.e(cryptoObject);
                    if (e10 != null) {
                        vVar = new v(e10);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b10 = d0.b(cryptoObject)) != null) {
                        vVar = new v(b10);
                    }
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        int i10 = -1;
        if (i7 >= 30) {
            if (authenticationResult != null) {
                i10 = c.a(authenticationResult);
            }
        } else if (i7 != 29) {
            i10 = 2;
        }
        this.a.b(new u(vVar, i10));
    }

    public void onAuthenticationHelp(int i7, CharSequence charSequence) {
    }
}
