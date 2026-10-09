package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.qm0;
import s4.d1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e extends c71 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, qm0 qm0Var, Activity activity, int i10, int i11, v vVar, e6 e6Var) {
        super(qm0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.c71, s4.i0
    public final d1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = i6.L6;
        e6Var = ((n2) iVar).resourceProvider;
        m4 m4Var = new m4(parentActivity, i11, 21, 0, false, e6Var);
        m4Var.setHeight(25);
        return new am0(m4Var);
    }
}
