package k0;

import a8.h0;
import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.s;
import androidx.biometric.t;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import rb.c;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((v) ((h0) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((v) ((h0) this.a.b).d).a;
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
        WeakReference weakReference = ((v) ((h0) this.a.b).d).a;
        if (weakReference.get() != null) {
            x xVar = (x) weakReference.get();
            if (xVar.t == null) {
                xVar.t = new z();
            }
            x.h(xVar.t, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        h0 h0Var;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        t tVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                h0Var = new h0(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                h0Var = new h0(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                h0Var = new h0(cryptoObject.getMac());
            }
            c cVar = this.a;
            cVar.getClass();
            if (h0Var != null) {
                Cipher cipher = (Cipher) h0Var.c;
                if (cipher != null) {
                    tVar = new t(cipher);
                } else {
                    Signature signature = (Signature) h0Var.b;
                    if (signature != null) {
                        tVar = new t(signature);
                    } else {
                        Mac mac = (Mac) h0Var.d;
                        if (mac != null) {
                            tVar = new t(mac);
                        }
                    }
                }
            }
            ((v) ((h0) cVar.b).d).b(new s(tVar, 2));
        }
        h0Var = null;
        c cVar2 = this.a;
        cVar2.getClass();
        if (h0Var != null) {
        }
        ((v) ((h0) cVar2.b).d).b(new s(tVar, 2));
    }
}
