package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class b6 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new b6());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((d6) view).g((a) y51Var.G, (a6) y51Var.H, y51Var.r);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        d6 d6Var = new d6(context, f6Var);
        d6Var.setBackground(new a2(j6.v0(j6.d6, f6Var)));
        return d6Var;
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
