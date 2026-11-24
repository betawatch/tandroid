// default package

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k15 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ l15 a;

    public k15(l15 l15Var) {
        this.a = l15Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.a.f()) {
            l15 l15Var = this.a;
            if (l15Var.f) {
                return;
            }
            if (i == 5) {
                l15Var.c("AUTH_CANCELED");
            } else {
                l15Var.a();
            }
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        if (!this.a.f() || (alertDialog = this.a.i) == null) {
            return;
        }
        alertDialog.setMessage(k96.M0(2131742873, null));
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
        l15 l15Var = this.a;
        if (l15Var.f) {
            return;
        }
        l15Var.c(null);
    }
}
