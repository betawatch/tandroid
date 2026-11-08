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
public final class w extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new w());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((x) view).h((a) x31Var.G, (n3) x31Var.H);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        x xVar = new x(i7, context, f6Var);
        xVar.setBackground(new y1(k6.w0(k6.d6, f6Var)));
        return xVar;
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean f() {
        return false;
    }
}
