// default package

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class o35 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ p35 a;

    public o35(p35 p35Var) {
        this.a = p35Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            p35 p35Var = this.a;
            if (p35Var.f) {
                return;
            }
            if (i == 5) {
                p35Var.c("AUTH_CANCELED");
            } else {
                p35Var.a();
            }
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (!this.a.f() || (alertDialog = this.a.i) == null) {
            return;
        }
        alertDialog.setMessage(ob6.M0(2131742767, null));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        AlertDialog alertDialog;
        if (!this.a.f() || (alertDialog = this.a.i) == null) {
            return;
        }
        alertDialog.setMessage(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        p35 p35Var = this.a;
        if (p35Var.f) {
            return;
        }
        p35Var.c(null);
    }
}
