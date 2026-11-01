package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class i0 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new i0());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        j0 j0Var = (j0) view;
        a aVar = (a) b51Var.G;
        h0 h0Var = (h0) b51Var.H;
        j0Var.a = aVar;
        j0Var.E = h0Var;
        j0Var.c(aVar);
        j0Var.j();
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        j0 j0Var = new j0(i10, context, p6Var);
        j0Var.setBackground(new h2(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
        return j0Var;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
