package ei;

import android.app.Activity;
import android.view.ViewGroup;
import ci.u;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import s4.b1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e extends a71 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, mm0 mm0Var, Activity activity, int i10, int i11, u uVar, c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, uVar, c6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.a71, s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = g6.L6;
        c6Var = ((m2) iVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, c6Var);
        m4Var.setHeight(25);
        return new wl0(m4Var);
    }
}
