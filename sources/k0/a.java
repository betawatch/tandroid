package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import bb.c;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.bd;
import org.telegram.ui.Wallet.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i3, CharSequence charSequence) {
        switch (this.a) {
            case 0:
                ((x) ((a0) ((c) this.b).b).d).a(i3, charSequence);
                break;
            default:
                t0 t0Var = (t0) this.b;
                if (t0Var.f() && !t0Var.f) {
                    if (i3 != 5) {
                        t0Var.a();
                        break;
                    } else {
                        t0Var.c("AUTH_CANCELED");
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) obj).b).d).a;
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
                t0 t0Var = (t0) obj;
                if (t0Var.f() && (alertDialog = t0Var.i) != null) {
                    alertDialog.setMessage(bd.M0(2131743127, null));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i3, CharSequence charSequence) {
        AlertDialog alertDialog;
        switch (this.a) {
            case 0:
                WeakReference weakReference = ((x) ((a0) ((c) this.b).b).d).a;
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
                t0 t0Var = (t0) this.b;
                if (t0Var.f() && (alertDialog = t0Var.i) != null) {
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
                c cVar = (c) this.b;
                FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
                v vVar = null;
                if (cryptoObject != null) {
                    if (cryptoObject.getCipher() != null) {
                        a0Var = new a0(cryptoObject.getCipher());
                    } else if (cryptoObject.getSignature() != null) {
                        a0Var = new a0(cryptoObject.getSignature());
                    } else if (cryptoObject.getMac() != null) {
                        a0Var = new a0(cryptoObject.getMac());
                    }
                    cVar.getClass();
                    if (a0Var != null) {
                        Cipher cipher = (Cipher) a0Var.c;
                        if (cipher != null) {
                            vVar = new v(cipher);
                        } else {
                            Signature signature = (Signature) a0Var.b;
                            if (signature != null) {
                                vVar = new v(signature);
                            } else {
                                Mac mac = (Mac) a0Var.d;
                                if (mac != null) {
                                    vVar = new v(mac);
                                }
                            }
                        }
                    }
                    ((x) ((a0) cVar.b).d).b(new u(vVar, 2));
                    break;
                }
                a0Var = null;
                cVar.getClass();
                if (a0Var != null) {
                }
                ((x) ((a0) cVar.b).d).b(new u(vVar, 2));
            default:
                t0 t0Var = (t0) this.b;
                if (!t0Var.f) {
                    t0Var.c(null);
                    break;
                }
                break;
        }
    }
}
