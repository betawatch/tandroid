package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                Signature f7 = b0.f(cryptoObject);
                if (f7 != null) {
                    uVar = new u(f7);
                } else {
                    Mac e7 = b0.e(cryptoObject);
                    if (e7 != null) {
                        uVar = new u(e7);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b10 = c0.b(cryptoObject)) != null) {
                        uVar = new u(b10);
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
        this.a.b(new t(uVar, i11));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
