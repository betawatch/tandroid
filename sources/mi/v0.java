package mi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class v0 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new v0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        w0 w0Var = (w0) view;
        a aVar = (a) r31Var.G;
        r2 r2Var = (r2) r31Var.H;
        w0Var.a = aVar;
        w0Var.w = r2Var;
        w0Var.x = bd.a0;
        w0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return false;
    }
}
