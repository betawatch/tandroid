package li;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class e0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new e0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        f0 f0Var = (f0) view;
        a aVar = (a) x31Var.G;
        d0 d0Var = (d0) x31Var.H;
        f0Var.a = aVar;
        f0Var.E = d0Var;
        f0Var.c(aVar);
        f0Var.h();
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        f0 f0Var = new f0(i7, context, f6Var);
        f0Var.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return f0Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
