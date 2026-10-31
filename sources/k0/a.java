package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.t;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.biometric.y;
import androidx.lifecycle.z;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k6.h;
import org.telegram.messenger.cd;
import org.telegram.ui.Wallet.u0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                ((w) ((a0) ((h) this.b).b).d).a(i10, charSequence);
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (u0Var.f() && !u0Var.f) {
                    if (i10 != 5) {
                        u0Var.a();
                        break;
                    } else {
                        u0Var.c("AUTH_CANCELED");
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                WeakReference weakReference = ((w) ((a0) ((h) obj).b).d).a;
                if (weakReference.get() != null && ((y) weakReference.get()).n) {
                    y yVar = (y) weakReference.get();
                    if (yVar.u == null) {
                        yVar.u = new z();
                    }
                    y.h(yVar.u, Boolean.TRUE);
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) obj;
                if (u0Var.f() && (alertDialog = u0Var.i) != null) {
                    alertDialog.setMessage(cd.L0(2131743143, null));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.a) {
            case 0:
                WeakReference weakReference = ((w) ((a0) ((h) this.b).b).d).a;
                if (weakReference.get() != null) {
                    y yVar = (y) weakReference.get();
                    if (yVar.t == null) {
                        yVar.t = new z();
                    }
                    y.h(yVar.t, charSequence);
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (u0Var.f() && (alertDialog = u0Var.i) != null) {
                    alertDialog.setMessage(charSequence);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        a0 a0Var;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                u uVar = null;
                if (cryptoObject != null) {
                    if (cryptoObject.getCipher() != null) {
                        a0Var = new a0(cryptoObject.getCipher());
                    } else if (cryptoObject.getSignature() != null) {
                        a0Var = new a0(cryptoObject.getSignature());
                    } else if (cryptoObject.getMac() != null) {
                        a0Var = new a0(cryptoObject.getMac());
                    }
                    hVar.getClass();
                    if (a0Var != null) {
                        Cipher cipher = (Cipher) a0Var.c;
                        if (cipher != null) {
                            uVar = new u(cipher);
                        } else {
                            Signature signature = (Signature) a0Var.b;
                            if (signature != null) {
                                uVar = new u(signature);
                            } else {
                                Mac mac = (Mac) a0Var.d;
                                if (mac != null) {
                                    uVar = new u(mac);
                                }
                            }
                        }
                    }
                    ((w) ((a0) hVar.b).d).b(new t(uVar, 2));
                    break;
                }
                a0Var = null;
                hVar.getClass();
                if (a0Var != null) {
                }
                ((w) ((a0) hVar.b).d).b(new t(uVar, 2));
            default:
                u0 u0Var = (u0) this.b;
                if (!u0Var.f) {
                    u0Var.c(null);
                    break;
                }
                break;
        }
    }
}
