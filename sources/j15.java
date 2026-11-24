// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
