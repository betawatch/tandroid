// default package

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class by7 extends TwoStepVerificationActivity {
    public final /* synthetic */ h24 e0;

    public by7(h24 h24Var) {
        this.e0 = h24Var;
    }

    @Override // org.telegram.ui.TwoStepVerificationActivity, org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        h24 h24Var = this.e0;
        if ((((iu4) h24Var.c) != null || ((c05) h24Var.d) != null) && !h24Var.b) {
            h24Var.f();
        }
        super.onFragmentDestroy();
    }
}
