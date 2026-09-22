package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class x0 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new x0());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) i51Var.G;
        s2 s2Var = (s2) i51Var.H;
        y0Var.a = aVar;
        y0Var.v = s2Var;
        y0Var.w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
