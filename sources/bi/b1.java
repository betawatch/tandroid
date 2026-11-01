package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class b1 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new b1());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        c1 c1Var = (c1) view;
        a aVar = (a) b51Var.G;
        z2 z2Var = (z2) b51Var.H;
        c1Var.a = aVar;
        c1Var.w = z2Var;
        c1Var.x = dd.X;
        c1Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c1(context, p6Var);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean f() {
        return false;
    }
}
