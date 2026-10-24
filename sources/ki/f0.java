package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f0 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new f0());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        g0 g0Var = (g0) view;
        a aVar = (a) m61Var.G;
        e0 e0Var = (e0) m61Var.H;
        g0Var.a = aVar;
        g0Var.E = e0Var;
        g0Var.c(aVar);
        g0Var.h();
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        g0 g0Var = new g0(context, i10, g6Var);
        g0Var.setBackground(new a2(k6.w0(k6.d6, g6Var)));
        return g0Var;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }
}
