package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class s4 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new s4());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(x51Var.d, x51Var.z, (o8) x51Var.G);
        t4Var.b(x51Var.e, false);
        boolean z11 = x51Var.f;
        if (t4Var.f != z11) {
            t4Var.f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(x51Var.D);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new t4(context, e6Var);
    }
}
