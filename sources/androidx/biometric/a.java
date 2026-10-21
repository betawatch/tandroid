package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class a extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ d a;

    public a(d dVar) {
        this.a = dVar;
    }

    public void onAuthenticationError(int i10, CharSequence charSequence) {
        this.a.a(i10, charSequence);
    }

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
                    Mac e = b0.e(cryptoObject);
                    if (e != null) {
                        uVar = new u(e);
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

    public void onAuthenticationHelp(int i10, CharSequence charSequence) {
    }
}
