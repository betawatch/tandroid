package gh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v5 extends b51 {
    public final /* synthetic */ x5 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(x5 x5Var, zk0 zk0Var, Context context, int i10, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, context, i10, 0, false, cVar, c6Var);
        this.J = x5Var;
    }

    @Override // org.telegram.ui.Components.b51, f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        x5 x5Var = this.J;
        if (i10 == 0) {
            Context context = x5Var.getContext();
            int i11 = org.telegram.ui.ActionBar.g6.L6;
            c6Var2 = ((org.telegram.ui.ActionBar.e3) x5Var).resourcesProvider;
            return new lk0(new org.telegram.ui.Cells.j4(context, i11, 13, 12, 4, false, false, c6Var2));
        }
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        Context context2 = x5Var.getContext();
        int i12 = org.telegram.ui.ActionBar.g6.L6;
        c6Var = ((org.telegram.ui.ActionBar.e3) x5Var).resourcesProvider;
        return new lk0(new org.telegram.ui.Cells.j4(context2, i12, 13, 12, 4, false, true, c6Var));
    }
}
