package org.telegram.ui.Wallet;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class d1 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ e1 a;

    public d1(e1 e1Var) {
        this.a = e1Var;
    }

    public final void onAuthenticationError(int i7, CharSequence charSequence) {
        if (this.a.f()) {
            e1 e1Var = this.a;
            if (e1Var.f) {
                return;
            }
            if (i7 == 10 || i7 == 5) {
                e1Var.c("AUTH_CANCELED");
            } else {
                e1Var.a();
            }
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
