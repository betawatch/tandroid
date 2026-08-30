package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i10, CharSequence charSequence) {
        this.a.a(i10, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((y) this.a).a;
        if (weakReference.get() == null || !((a0) weakReference.get()).n) {
            return;
        }
        a0 a0Var = (a0) weakReference.get();
        if (a0Var.u == null) {
            a0Var.u = new androidx.lifecycle.z();
        }
        a0.h(a0Var.u, Boolean.TRUE);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b10;
        w wVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = d0.d(cryptoObject);
            if (d != null) {
                wVar = new w(d);
            } else {
                Signature f10 = d0.f(cryptoObject);
                if (f10 != null) {
                    wVar = new w(f10);
                } else {
                    Mac e = d0.e(cryptoObject);
                    if (e != null) {
                        wVar = new w(e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b10 = e0.b(cryptoObject)) != null) {
                        wVar = new w(b10);
                    }
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        int i11 = -1;
        if (i10 >= 30) {
            if (authenticationResult != null) {
                i11 = c.a(authenticationResult);
            }
        } else if (i10 != 29) {
            i11 = 2;
        }
        this.a.b(new v(wVar, i11));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
