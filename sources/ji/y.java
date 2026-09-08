package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new y());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((z) view).i((a) h51Var.G, (p3) h51Var.H);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        z zVar = new z(context, i10, f6Var);
        zVar.setBackground(new z1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        return zVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
