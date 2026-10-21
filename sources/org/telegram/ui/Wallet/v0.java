package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class v0 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ w0 a;

    public v0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        w0 w0Var = this.a;
        if (!w0Var.f() || w0Var.f) {
            return;
        }
        if (i10 == 5) {
            w0Var.c("AUTH_CANCELED");
        } else {
            w0Var.a();
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        w0 w0Var = this.a;
        if (!w0Var.f() || (alertDialog = w0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        w0 w0Var = this.a;
        if (!w0Var.f() || (alertDialog = w0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        w0 w0Var = this.a;
        if (w0Var.f) {
            return;
        }
        w0Var.c(null);
    }
}
