package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e1 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ f1 a;

    public e1(f1 f1Var) {
        this.a = f1Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.a.f()) {
            f1 f1Var = this.a;
            if (f1Var.f) {
                return;
            }
            if (i7 == 10 || i7 == 5) {
                f1Var.c("AUTH_CANCELED");
            } else {
                f1Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
