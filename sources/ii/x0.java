package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class x0 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new x0());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) y51Var.G;
        s2 s2Var = (s2) y51Var.H;
        y0Var.a = aVar;
        y0Var.v = s2Var;
        y0Var.w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new y0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.x51
    public final boolean isClickable() {
        return false;
    }
}
