package ei;

import android.app.Activity;
import android.view.ViewGroup;
import ci.u;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.z61;
import s4.b1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e extends z61 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, mm0 mm0Var, Activity activity, int i10, int i11, u uVar, c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, uVar, c6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.z61, s4.g0
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
