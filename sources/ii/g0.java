package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class g0 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new g0());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        h0 h0Var = (h0) view;
        a aVar = (a) w51Var.G;
        f0 f0Var = (f0) w51Var.H;
        h0Var.a = aVar;
        h0Var.E = f0Var;
        h0Var.c(aVar);
        h0Var.i();
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        h0 h0Var = new h0(context, i10, f6Var);
        h0Var.setBackground(new a2(j6.v0(j6.d6, f6Var)));
        return h0Var;
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
