package bi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class fc extends k71 {
    public final /* synthetic */ dd P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(dd ddVar, nm0 nm0Var, Activity activity, int i10, int i11, ai.e eVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(nm0Var, activity, i10, i11, true, eVar, u6Var);
        this.P = ddVar;
    }

    @Override // org.telegram.ui.Components.k71, s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        dd ddVar = this.P;
        Activity parentActivity = ddVar.getParentActivity();
        int i11 = org.telegram.ui.ActionBar.y6.L6;
        u6Var = ((org.telegram.ui.ActionBar.r2) ddVar).resourceProvider;
        org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(parentActivity, i11, 21, 0, false, u6Var);
        q4Var.setHeight(25);
        return new wl0(q4Var);
    }
}
