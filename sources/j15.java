// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j15 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ l15 a;

    public j15(l15 l15Var) {
        this.a = l15Var;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        l15 l15Var = this.a;
        if (!l15Var.f() || l15Var.f) {
            return;
        }
        if (i == 10 || i == 5) {
            l15Var.c("AUTH_CANCELED");
        } else {
            l15Var.a();
        }
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.a.c(null);
    }
}
