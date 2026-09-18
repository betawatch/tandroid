package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x51;
import s4.c1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class e extends x51 {
    public final /* synthetic */ i N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, ml0 ml0Var, Activity activity, int i10, int i11, v vVar, f6 f6Var) {
        super(ml0Var, activity, i10, i11, true, vVar, f6Var);
        this.N = iVar;
    }

    @Override // org.telegram.ui.Components.x51, s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        i iVar = this.N;
        Activity parentActivity = iVar.getParentActivity();
        int i11 = j6.L6;
        f6Var = ((o2) iVar).resourceProvider;
        l4 l4Var = new l4(parentActivity, i11, 21, 0, false, f6Var);
        l4Var.setHeight(25);
        return new wk0(l4Var);
    }
}
