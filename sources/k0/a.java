package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.a0;
import androidx.biometric.e;
import androidx.biometric.v;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import y5.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ h a;

    public a(h hVar) {
        this.a = hVar;
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
        h hVar = this.a;
        e B = e0.b.B(e0.b.e(authenticationResult));
        hVar.getClass();
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
        ((y) ((e) hVar.b).d).b(new v(wVar, 2));
    }
}
