package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h0 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new h0());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        i0 i0Var = (i0) view;
        a aVar = (a) v51Var.G;
        g0 g0Var = (g0) v51Var.H;
        i0Var.a = aVar;
        i0Var.E = g0Var;
        i0Var.c(aVar);
        i0Var.i();
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        i0 i0Var = new i0(context, i10, f6Var);
        i0Var.setBackground(new d2(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return i0Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
