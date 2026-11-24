// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j35 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ l35 a;

    public j35(l35 l35Var) {
        this.a = l35Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        l35 l35Var = this.a;
        if (!l35Var.f() || l35Var.f) {
            return;
        }
        if (i == 10 || i == 5) {
            l35Var.c("AUTH_CANCELED");
        } else {
            l35Var.a();
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
