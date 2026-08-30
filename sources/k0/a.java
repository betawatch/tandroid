package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.a0;
import androidx.biometric.e;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o5.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((y) ((e) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((y) ((e) this.a.b).d).a;
        if (weakReference.get() == null || !((a0) weakReference.get()).n) {
            return;
        }
        a0 a0Var = (a0) weakReference.get();
        if (a0Var.u == null) {
            a0Var.u = new z();
        }
        a0.h(a0Var.u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((y) ((e) this.a.b).d).a;
        if (weakReference.get() != null) {
            a0 a0Var = (a0) weakReference.get();
            if (a0Var.t == null) {
                a0Var.t = new z();
            }
            a0.h(a0Var.t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i iVar = this.a;
        e B = b.B(b.e(authenticationResult));
        iVar.getClass();
        w wVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.c;
            if (cipher != null) {
                wVar = new w(cipher);
            } else {
                Signature signature = (Signature) B.b;
                if (signature != null) {
                    wVar = new w(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        wVar = new w(mac);
                    }
                }
            }
        }
        ((y) ((e) iVar.b).d).b(new v(wVar, 2));
    }
}
