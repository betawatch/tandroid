// default package

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bi4 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ z8d a;

    public bi4(z8d z8dVar) {
        this.a = z8dVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((w40) this.a.b).c.a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w40) this.a.b).c.a;
        if (weakReference.get() == null || !((mj0) weakReference.get()).l) {
            return;
        }
        mj0 mj0Var = (mj0) weakReference.get();
        rj7 rj7Var = mj0Var.s;
        if (rj7Var == null) {
            rj7Var = new rj7();
            mj0Var.s = rj7Var;
        }
        mj0.f(rj7Var, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((w40) this.a.b).c.a;
        if (weakReference.get() != null) {
            mj0 mj0Var = (mj0) weakReference.get();
            rj7 rj7Var = mj0Var.r;
            if (rj7Var == null) {
                rj7Var = new rj7();
                mj0Var.r = rj7Var;
            }
            mj0.f(rj7Var, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        z8d z8dVar = this.a;
        pm3 f = ci4.f(ci4.b(authenticationResult));
        z8dVar.getClass();
        hj0 hj0Var = null;
        if (f != null) {
            Cipher cipher = (Cipher) f.c;
            if (cipher != null) {
                hj0Var = new hj0(cipher);
            } else {
                Signature signature = (Signature) f.b;
                if (signature != null) {
                    hj0Var = new hj0(signature);
                } else {
                    Mac mac = (Mac) f.d;
                    if (mac != null) {
                        hj0Var = new hj0(mac);
                    }
                }
            }
        }
        ((w40) z8dVar.b).c.b(new gj0(hj0Var, 2));
    }
}
