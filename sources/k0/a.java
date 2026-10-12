package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k6.h;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ h a;

    public a(h hVar) {
        this.a = hVar;
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        e eVar;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        v vVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                eVar = new e(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                eVar = new e(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                eVar = new e(cryptoObject.getMac());
            }
            h hVar = this.a;
            hVar.getClass();
            if (eVar != null) {
                Cipher cipher = (Cipher) eVar.c;
                if (cipher != null) {
                    vVar = new v(cipher);
                } else {
                    Signature signature = (Signature) eVar.b;
                    if (signature != null) {
                        vVar = new v(signature);
                    } else {
                        Mac mac = (Mac) eVar.d;
                        if (mac != null) {
                            vVar = new v(mac);
                        }
                    }
                }
            }
            ((x) ((e) hVar.b).d).b(new u(vVar, 2));
        }
        eVar = null;
        h hVar2 = this.a;
        hVar2.getClass();
        if (eVar != null) {
        }
        ((x) ((e) hVar2.b).d).b(new u(vVar, 2));
    }
}
