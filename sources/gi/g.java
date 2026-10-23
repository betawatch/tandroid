package gi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class g extends b71 {
    public final /* synthetic */ l P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, mm0 mm0Var, Activity activity, int i10, int i11, ai.q qVar, g6 g6Var) {
        super(mm0Var, activity, i10, i11, true, qVar, g6Var);
        this.P = lVar;
    }

    @Override // org.telegram.ui.Components.b71, s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        l lVar = this.P;
        Activity parentActivity = lVar.getParentActivity();
        int i11 = k6.L6;
        g6Var = ((org.telegram.ui.ActionBar.o2) lVar).resourceProvider;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, g6Var);
        l4Var.setHeight(25);
        return new wl0(l4Var);
    }
}
