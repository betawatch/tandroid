package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b10;
        v vVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = c0.d(cryptoObject);
            if (d != null) {
                vVar = new v(d);
            } else {
                Signature f9 = c0.f(cryptoObject);
                if (f9 != null) {
                    vVar = new v(f9);
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
        int i10 = Build.VERSION.SDK_INT;
        int i11 = -1;
        if (i10 >= 30) {
            if (authenticationResult != null) {
                i11 = c.a(authenticationResult);
            }
        } else if (i10 != 29) {
            i11 = 2;
        }
        this.a.b(new u(vVar, i11));
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
