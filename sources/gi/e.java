package gi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wl0;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends k71 {
    public final /* synthetic */ h P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, nm0 nm0Var, Activity activity, int i10, int i11, ai.e eVar, u6 u6Var) {
        super(nm0Var, activity, i10, i11, true, eVar, u6Var);
        this.P = hVar;
    }

    @Override // org.telegram.ui.Components.k71, s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        h hVar = this.P;
        Activity parentActivity = hVar.getParentActivity();
        int i11 = y6.L6;
        u6Var = ((r2) hVar).resourceProvider;
        q4 q4Var = new q4(parentActivity, i11, 21, 0, false, u6Var);
        q4Var.setHeight(25);
        return new wl0(q4Var);
    }
}
