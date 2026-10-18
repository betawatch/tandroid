package gi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class m3 extends s61 {
    public final /* synthetic */ u3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(u3 u3Var, im0 im0Var, Activity activity, int i10, int i11, ai.q qVar, d6 d6Var) {
        super(im0Var, activity, i10, i11, true, qVar, d6Var);
        this.N = u3Var;
    }

    @Override // org.telegram.ui.Components.s61, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        u3 u3Var = this.N;
        Activity parentActivity = u3Var.getParentActivity();
        int i11 = h6.L6;
        d6Var = ((org.telegram.ui.ActionBar.n2) u3Var).resourceProvider;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, d6Var);
        l4Var.setHeight(25);
        return new sl0(l4Var);
    }
}
