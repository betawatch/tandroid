// default package

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lu1 extends jia {
    public boolean N0;
    public final /* synthetic */ mu1 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.O0 = mu1Var;
        this.N0 = true;
    }

    @Override // jia
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = gl.L(4.0f) + getTextWidth();
            mu1 mu1Var = this.O0;
            mu1Var.V2 = L;
            NumberTextView numberTextView = mu1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
