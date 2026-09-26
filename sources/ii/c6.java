package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class c6 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new c6());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((e6) view).g((a) v51Var.G, (b6) v51Var.H, v51Var.r);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        e6 e6Var = new e6(context, d6Var);
        e6Var.setBackground(new b2(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, d6Var)));
        return e6Var;
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
