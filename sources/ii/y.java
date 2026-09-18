package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class y extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new y());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        ((z) view).i((a) x51Var.G, (q3) x51Var.H);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        z zVar = new z(context, i10, e6Var);
        zVar.setBackground(new a2(j6.v0(j6.d6, e6Var)));
        return zVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
