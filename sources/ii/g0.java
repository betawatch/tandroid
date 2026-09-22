package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new g0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) i51Var.G;
        f0 f0Var = (f0) i51Var.H;
        h0Var.a = aVar;
        h0Var.E = f0Var;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        h0 h0Var = new h0(context, i10, e6Var);
        h0Var.setBackground(new a2(i6.v0(i6.d6, e6Var)));
        return h0Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
