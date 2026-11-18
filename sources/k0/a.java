package k0;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.a0;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.x;
import androidx.biometric.z;
import h6.m;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ob.c;
import org.telegram.messenger.gd;
import org.telegram.ui.Wallet.e1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((x) ((a0) ((c) this.b).b).d).a(i7, charSequence);
                break;
            default:
                e1 e1Var = (e1) this.b;
                if (e1Var.f() && !e1Var.f) {
                    if (i7 != 5) {
                        e1Var.a();
                        break;
                    } else {
                        e1Var.c("AUTH_CANCELED");
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
                e1 e1Var = (e1) obj;
                if (e1Var.f() && (alertDialog = e1Var.i) != null) {
                    alertDialog.setMessage(gd.M0(2131742878, null));
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
                e1 e1Var = (e1) this.b;
                if (e1Var.f() && (alertDialog = e1Var.i) != null) {
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
                c cVar = (c) this.b;
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
                    cVar.getClass();
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
                    ((x) ((a0) cVar.b).d).b(new u(vVar, 2));
                    break;
                }
                mVar = null;
                cVar.getClass();
                if (mVar != null) {
                }
                ((x) ((a0) cVar.b).d).b(new u(vVar, 2));
            default:
                e1 e1Var = (e1) this.b;
                if (!e1Var.f) {
                    e1Var.c(null);
                    break;
                }
                break;
        }
    }
}
