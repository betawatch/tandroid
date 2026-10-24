package k0;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.e;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import qb.c;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        ((w) ((e) this.a.b).d).a(i10, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((w) ((e) this.a.b).d).a;
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
        WeakReference weakReference = ((w) ((e) this.a.b).d).a;
        if (weakReference.get() != null) {
            y yVar = (y) weakReference.get();
            if (yVar.t == null) {
                yVar.t = new z();
            }
            y.h(yVar.t, charSequence);
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
        u uVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                eVar = new e(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                eVar = new e(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                eVar = new e(cryptoObject.getMac());
            }
            c cVar = this.a;
            cVar.getClass();
            if (eVar != null) {
                Cipher cipher = (Cipher) eVar.c;
                if (cipher != null) {
                    uVar = new u(cipher);
                } else {
                    Signature signature = (Signature) eVar.b;
                    if (signature != null) {
                        uVar = new u(signature);
                    } else {
                        Mac mac = (Mac) eVar.d;
                        if (mac != null) {
                            uVar = new u(mac);
                        }
                    }
                }
            }
            ((w) ((e) cVar.b).d).b(new t(uVar, 2));
        }
        eVar = null;
        c cVar2 = this.a;
        cVar2.getClass();
        if (eVar != null) {
        }
        ((w) ((e) cVar2.b).d).b(new t(uVar, 2));
    }
}
