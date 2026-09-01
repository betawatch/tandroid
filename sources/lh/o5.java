package lh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o5 extends x51 {
    public final /* synthetic */ q5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(q5 q5Var, tl0 tl0Var, Context context, int i10, eg.p1 p1Var, g6 g6Var) {
        super(tl0Var, context, i10, 0, false, p1Var, g6Var);
        this.K = q5Var;
    }

    @Override // org.telegram.ui.Components.x51, f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        q5 q5Var = this.K;
        if (i10 == 0) {
            Context context = q5Var.getContext();
            int i11 = k6.L6;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) q5Var).resourcesProvider;
            return new fl0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, g6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = q5Var.getContext();
        int i12 = k6.L6;
        g6Var = ((org.telegram.ui.ActionBar.h3) q5Var).resourcesProvider;
        return new fl0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, g6Var));
    }
}
