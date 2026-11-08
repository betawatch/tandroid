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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class y5 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new y5());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((a6) view).f((a) x31Var.G, (x5) x31Var.H, x31Var.r);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        a6 a6Var = new a6(context, f6Var);
        a6Var.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return a6Var;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
