package ii;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class x0 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new x0());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        y0 y0Var = (y0) view;
        a aVar = (a) h51Var.G;
        t2 t2Var = (t2) h51Var.H;
        y0Var.a = aVar;
        y0Var.v = t2Var;
        y0Var.w = LocaleController.isRTL;
        y0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y0(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
