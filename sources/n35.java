// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
