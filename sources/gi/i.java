package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class i extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new i());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        long j3 = h51Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), h51Var.k, h51Var.l, h51Var.n, h51Var.q);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var, false);
    }
}
