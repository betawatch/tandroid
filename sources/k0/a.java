package k0;

import a5.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import xa.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i9, CharSequence charSequence) {
        ((w) ((m) this.a.b).d).a(i9, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((m) this.a.b).d).a;
        if (weakReference.get() == null || !((y) weakReference.get()).n) {
            return;
        }
        y yVar = (y) weakReference.get();
        if (yVar.u == null) {
            yVar.u = new z();
        }
        y.h(yVar.u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i9, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((m) this.a.b).d).a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.t == null) {
                yVar.t = new z();
            }
            y.h(yVar.t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.a;
        j4.c B = e0.b.B(e0.b.e(authenticationResult));
        cVar.getClass();
        u uVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) B.b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((w) ((m) cVar.b).d).b(new t(uVar, 2));
    }
}
