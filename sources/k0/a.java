package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.s;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import pb.c;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((aa.a) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((aa.a) this.a.b).d).a;
        if (weakReference.get() == null || !((x) weakReference.get()).n) {
            return;
        }
        x xVar = (x) weakReference.get();
        if (xVar.u == null) {
            xVar.u = new z();
        }
        x.h(xVar.u, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((v) ((aa.a) this.a.b).d).a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.t == null) {
                xVar.t = new z();
            }
            x.h(xVar.t, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        c cVar = this.a;
        aa.a L = b.L(b.f(authenticationResult));
        cVar.getClass();
        t tVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.c;
            if (cipher != null) {
                tVar = new t(cipher);
            } else {
                Signature signature = (Signature) L.b;
                if (signature != null) {
                    tVar = new t(signature);
                } else {
                    Mac mac = (Mac) L.d;
                    if (mac != null) {
                        tVar = new t(mac);
                    }
                }
            }
        }
        ((v) ((aa.a) cVar.b).d).b(new s(tVar, 2));
    }
}
