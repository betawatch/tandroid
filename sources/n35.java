// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
