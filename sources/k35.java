// default package

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k35 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ l35 a;

    public k35(l35 l35Var) {
        this.a = l35Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            l35 l35Var = this.a;
            if (l35Var.f) {
                return;
            }
            if (i == 5) {
                l35Var.c("AUTH_CANCELED");
            } else {
                l35Var.a();
            }
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (!this.a.f() || (alertDialog = this.a.i) == null) {
            return;
        }
        alertDialog.setMessage(jb6.M0(2131742799, null));
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
        l35 l35Var = this.a;
        if (l35Var.f) {
            return;
        }
        l35Var.c(null);
    }
}
