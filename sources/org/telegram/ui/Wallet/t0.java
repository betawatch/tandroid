package org.telegram.ui.Wallet;

import android.app.AlertDialog;
import android.hardware.fingerprint.FingerprintManager;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class t0 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ u0 a;

    public t0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i10, CharSequence charSequence) {
        u0 u0Var = this.a;
        if (!u0Var.f() || u0Var.f) {
            return;
        }
        if (i10 == 5) {
            u0Var.c("AUTH_CANCELED");
        } else {
            u0Var.a();
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        AlertDialog alertDialog;
        u0 u0Var = this.a;
        if (!u0Var.f() || (alertDialog = u0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(LocaleController.getString(R.string.WalletFingerprintRetry));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i10, CharSequence charSequence) {
        AlertDialog alertDialog;
        u0 u0Var = this.a;
        if (!u0Var.f() || (alertDialog = u0Var.i) == null) {
            return;
        }
        alertDialog.setMessage(charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        u0 u0Var = this.a;
        if (u0Var.f) {
            return;
        }
        u0Var.c(null);
    }
}
