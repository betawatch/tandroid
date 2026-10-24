package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u0 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ v0 a;

    public u0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        v0 v0Var = this.a;
        if (!v0Var.f() || v0Var.f) {
            return;
        }
        if (i10 == 5) {
            v0Var.c("AUTH_CANCELED");
        } else {
            v0Var.a();
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        v0 v0Var = this.a;
        if (!v0Var.f() || (alertDialog = v0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        v0 v0Var = this.a;
        if (!v0Var.f() || (alertDialog = v0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        v0 v0Var = this.a;
        if (v0Var.f) {
            return;
        }
        v0Var.c(null);
    }
}
