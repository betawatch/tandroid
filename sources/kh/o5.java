package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o5 extends w51 {
    public final /* synthetic */ q5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(q5 q5Var, sl0 sl0Var, Context context, int i10, dg.r1 r1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(sl0Var, context, i10, 0, false, r1Var, f6Var);
        this.K = q5Var;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        q5 q5Var = this.K;
        if (i10 == 0) {
            Context context = q5Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.g3) q5Var).resourcesProvider;
            return new el0(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = q5Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.g3) q5Var).resourcesProvider;
        return new el0(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
