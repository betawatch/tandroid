package k0;

import a4.m;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import e0.b;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ m a;

    public a(m mVar) {
        this.a = mVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((aa.a) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((aa.a) this.a.b).d).a;
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
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        WeakReference weakReference = ((w) ((aa.a) this.a.b).d).a;
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
        m mVar = this.a;
        aa.a L = b.L(b.f(authenticationResult));
        mVar.getClass();
        u uVar = null;
        if (L != null) {
            Cipher cipher = (Cipher) L.c;
            if (cipher != null) {
                uVar = new u(cipher);
            } else {
                Signature signature = (Signature) L.b;
                if (signature != null) {
                    uVar = new u(signature);
                } else {
                    Mac mac = (Mac) L.d;
                    if (mac != null) {
                        uVar = new u(mac);
                    }
                }
            }
        }
        ((w) ((aa.a) mVar.b).d).b(new t(uVar, 2));
    }
}
