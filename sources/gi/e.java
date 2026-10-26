package gi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vl0;
import s4.e1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e extends j71 {
    public final /* synthetic */ h P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, mm0 mm0Var, Activity activity, int i10, int i11, ai.e eVar, u6 u6Var) {
        super(mm0Var, activity, i10, i11, true, eVar, u6Var);
        this.P = hVar;
    }

    @Override // org.telegram.ui.Components.j71, s4.h0
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
        return new vl0(q4Var);
    }
}
