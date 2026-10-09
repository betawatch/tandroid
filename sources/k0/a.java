package k0;

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
import pb.c;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        aa.a aVar;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        t tVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                aVar = new aa.a(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                aVar = new aa.a(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                aVar = new aa.a(cryptoObject.getMac());
            }
            c cVar = this.a;
            cVar.getClass();
            if (aVar != null) {
                Cipher cipher = (Cipher) aVar.c;
                if (cipher != null) {
                    tVar = new t(cipher);
                } else {
                    Signature signature = (Signature) aVar.b;
                    if (signature != null) {
                        tVar = new t(signature);
                    } else {
                        Mac mac = (Mac) aVar.d;
                        if (mac != null) {
                            tVar = new t(mac);
                        }
                    }
                }
            }
            ((v) ((aa.a) cVar.b).d).b(new s(tVar, 2));
        }
        aVar = null;
        c cVar2 = this.a;
        cVar2.getClass();
        if (aVar != null) {
        }
        ((v) ((aa.a) cVar2.b).d).b(new s(tVar, 2));
    }
}
