// default package

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cg4 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ i4d a;

    public cg4(i4d i4dVar) {
        this.a = i4dVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((u40) this.a.a).c.a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((u40) this.a.a).c.a;
        if (weakReference.get() == null || !((lj0) weakReference.get()).l) {
            return;
        }
        lj0 lj0Var = (lj0) weakReference.get();
        hh7 hh7Var = lj0Var.s;
        if (hh7Var == null) {
            hh7Var = new hh7();
            lj0Var.s = hh7Var;
        }
        lj0.f(hh7Var, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((u40) this.a.a).c.a;
        if (weakReference.get() != null) {
            lj0 lj0Var = (lj0) weakReference.get();
            hh7 hh7Var = lj0Var.r;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.r = hh7Var;
            }
            lj0.f(hh7Var, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        i4d i4dVar = this.a;
        xl3 f = dg4.f(dg4.b(authenticationResult));
        i4dVar.getClass();
        gj0 gj0Var = null;
        if (f != null) {
            Cipher cipher = (Cipher) f.c;
            if (cipher != null) {
                gj0Var = new gj0(cipher);
            } else {
                Signature signature = (Signature) f.b;
                if (signature != null) {
                    gj0Var = new gj0(signature);
                } else {
                    Mac mac = (Mac) f.d;
                    if (mac != null) {
                        gj0Var = new gj0(mac);
                    }
                }
            }
        }
        ((u40) i4dVar.a).c.b(new fj0(gj0Var, 2));
    }
}
