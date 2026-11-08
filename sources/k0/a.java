package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import d6.i;
import h6.m;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.id;
import org.telegram.ui.Wallet.v0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                ((x) ((a0) ((i) this.b).b).d).a(i7, charSequence);
                break;
            default:
                v0 v0Var = (v0) this.b;
                if (v0Var.f() && !v0Var.f) {
                    if (i7 != 5) {
                        v0Var.a();
                        break;
                    } else {
                        v0Var.c("AUTH_CANCELED");
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((i) obj).b).d).a;
                if (weakReference.get() != null && ((z) weakReference.get()).n) {
                    z zVar = (z) weakReference.get();
                    if (zVar.u == null) {
                        zVar.u = new androidx.lifecycle.z();
                    }
                    z.h(zVar.u, Boolean.TRUE);
                    break;
                }
                break;
            default:
                v0 v0Var = (v0) obj;
                if (v0Var.f() && (alertDialog = v0Var.i) != null) {
                    alertDialog.setMessage(id.M0(2131743120, null));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i7, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((i) this.b).b).d).a;
                if (weakReference.get() != null) {
                    z zVar = (z) weakReference.get();
                    if (zVar.t == null) {
                        zVar.t = new androidx.lifecycle.z();
                    }
                    z.h(zVar.t, charSequence);
                    break;
                }
                break;
            default:
                v0 v0Var = (v0) this.b;
                if (v0Var.f() && (alertDialog = v0Var.i) != null) {
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
        m mVar;
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                v vVar = null;
                if (cryptoObject != null) {
                    if (cryptoObject.getCipher() != null) {
                        mVar = new m(cryptoObject.getCipher());
                    } else if (cryptoObject.getSignature() != null) {
                        mVar = new m(cryptoObject.getSignature());
                    } else if (cryptoObject.getMac() != null) {
                        mVar = new m(cryptoObject.getMac());
                    }
                    iVar.getClass();
                    if (mVar != null) {
                        Cipher cipher = (Cipher) mVar.c;
                        if (cipher != null) {
                            vVar = new v(cipher);
                        } else {
                            Signature signature = (Signature) mVar.b;
                            if (signature != null) {
                                vVar = new v(signature);
                            } else {
                                Mac mac = (Mac) mVar.d;
                                if (mac != null) {
                                    vVar = new v(mac);
                                }
                            }
                        }
                    }
                    ((x) ((a0) iVar.b).d).b(new u(vVar, 2));
                    break;
                }
                mVar = null;
                iVar.getClass();
                if (mVar != null) {
                }
                ((x) ((a0) iVar.b).d).b(new u(vVar, 2));
            default:
                v0 v0Var = (v0) this.b;
                if (!v0Var.f) {
                    v0Var.c(null);
                    break;
                }
                break;
        }
    }
}
