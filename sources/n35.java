// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class n35 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ p35 a;

    public n35(p35 p35Var) {
        this.a = p35Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        p35 p35Var = this.a;
        if (!p35Var.f() || p35Var.f) {
            return;
        }
        if (i == 10 || i == 5) {
            p35Var.c("AUTH_CANCELED");
        } else {
            p35Var.a();
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
