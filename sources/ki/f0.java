package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f0 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new f0());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) f61Var.G;
        e0 e0Var = (e0) f61Var.H;
        g0Var.a = aVar;
        g0Var.E = e0Var;
        g0Var.c(aVar);
        g0Var.i();
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        g0 g0Var = new g0(context, i10, d6Var);
        g0Var.setBackground(new a2(h6.w0(h6.d6, d6Var)));
        return g0Var;
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
