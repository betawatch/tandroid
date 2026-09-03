package k0;

import af.d;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o5.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((x) ((d) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((x) ((d) this.a.b).d).a;
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
        WeakReference weakReference = ((x) ((d) this.a.b).d).a;
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
        i iVar = this.a;
        d B = b.B(b.e(authenticationResult));
        iVar.getClass();
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
        ((x) ((d) iVar.b).d).b(new u(vVar, 2));
    }
}
