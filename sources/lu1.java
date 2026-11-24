// default package

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
