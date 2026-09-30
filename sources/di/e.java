package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yl0;
import s4.c1;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class e extends l61 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, yl0 yl0Var, Activity activity, int i10, int i11, v vVar, d6 d6Var) {
        super(yl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.l61, s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = h6.L6;
        d6Var = ((m2) iVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, d6Var);
        m4Var.setHeight(25);
        return new il0(m4Var);
    }
}
