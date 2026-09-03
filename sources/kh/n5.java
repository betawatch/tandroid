package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n5 extends w51 {
    public final /* synthetic */ p5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(p5 p5Var, rl0 rl0Var, Context context, int i10, dg.r1 r1Var, f6 f6Var) {
        super(rl0Var, context, i10, 0, false, r1Var, f6Var);
        this.K = p5Var;
    }

    @Override // org.telegram.ui.Components.w51, f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        p5 p5Var = this.K;
        if (i10 == 0) {
            Context context = p5Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.g3) p5Var).resourcesProvider;
            return new dl0(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, f6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = p5Var.getContext();
        int i12 = j6.L6;
        f6Var = ((org.telegram.ui.ActionBar.g3) p5Var).resourcesProvider;
        return new dl0(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, f6Var));
    }
}
