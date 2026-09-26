package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        WeakReference weakReference = ((v) this.a).a;
        if (weakReference.get() == null || !((x) weakReference.get()).n) {
            return;
        }
        x xVar = (x) weakReference.get();
        if (xVar.u == null) {
            xVar.u = new androidx.lifecycle.z();
        }
        x.h(xVar.u, Boolean.TRUE);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b10;
        t tVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = a0.d(cryptoObject);
            if (d != null) {
                tVar = new t(d);
            } else {
                Signature f7 = a0.f(cryptoObject);
                if (f7 != null) {
                    tVar = new t(f7);
                } else {
                    Mac e = a0.e(cryptoObject);
                    if (e != null) {
                        tVar = new t(e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b10 = b0.b(cryptoObject)) != null) {
                        tVar = new t(b10);
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
        this.a.b(new s(tVar, i11));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
