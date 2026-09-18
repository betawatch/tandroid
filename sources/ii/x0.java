package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class x0 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new x0());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) j51Var.G;
        s2 s2Var = (s2) j51Var.H;
        y0Var.a = aVar;
        y0Var.v = s2Var;
        y0Var.w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new y0(context, f6Var);
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
