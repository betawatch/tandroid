package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import ha.c;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((e) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((e) this.a.b).d).a;
        if (weakReference.get() == null || !((z) weakReference.get()).n) {
            return;
        }
        z zVar = (z) weakReference.get();
        if (zVar.u == null) {
            zVar.u = new androidx.lifecycle.z();
        }
        z.h(zVar.u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((x) ((e) this.a.b).d).a;
        if (weakReference.get() != null) {
            z zVar = (z) weakReference.get();
            if (zVar.t == null) {
                zVar.t = new androidx.lifecycle.z();
            }
            z.h(zVar.t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.a;
        e B = e0.b.B(e0.b.e(authenticationResult));
        cVar.getClass();
        v vVar = null;
        if (B != null) {
            Cipher cipher = (Cipher) B.c;
            if (cipher != null) {
                vVar = new v(cipher);
            } else {
                Signature signature = (Signature) B.b;
                if (signature != null) {
                    vVar = new v(signature);
                } else {
                    Mac mac = (Mac) B.d;
                    if (mac != null) {
                        vVar = new v(mac);
                    }
                }
            }
        }
        ((x) ((e) cVar.b).d).b(new u(vVar, 2));
    }
}
