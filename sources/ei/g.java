package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g extends m61 {
    public final /* synthetic */ l N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, yl0 yl0Var, Activity activity, int i10, int i11, bi.v vVar, f6 f6Var) {
        super(yl0Var, activity, i10, i11, true, vVar, f6Var);
        this.N = lVar;
    }

    @Override // org.telegram.ui.Components.m61, s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        l lVar = this.N;
        Activity parentActivity = lVar.getParentActivity();
        int i11 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.n2) lVar).resourceProvider;
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i11, 21, 0, false, f6Var);
        n4Var.setHeight(25);
        return new il0(n4Var);
    }
}
