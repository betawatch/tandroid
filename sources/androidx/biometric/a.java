package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i9, CharSequence charSequence) {
        this.a.a(i9, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((w) this.a).a;
        if (weakReference.get() == null || !((y) weakReference.get()).n) {
            return;
        }
        y yVar = (y) weakReference.get();
        if (yVar.u == null) {
            yVar.u = new androidx.lifecycle.z();
        }
        y.h(yVar.u, Boolean.TRUE);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b10;
        u uVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = b0.d(cryptoObject);
            if (d != null) {
                uVar = new u(d);
            } else {
                Signature f10 = b0.f(cryptoObject);
                if (f10 != null) {
                    uVar = new u(f10);
                } else {
                    Mac e10 = b0.e(cryptoObject);
                    if (e10 != null) {
                        uVar = new u(e10);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b10 = c0.b(cryptoObject)) != null) {
                        uVar = new u(b10);
                    }
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        int i10 = -1;
        if (i9 >= 30) {
            if (authenticationResult != null) {
                i10 = c.a(authenticationResult);
            }
        } else if (i9 != 29) {
            i10 = 2;
        }
        this.a.b(new t(uVar, i10));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i9, CharSequence charSequence) {
    }
}
