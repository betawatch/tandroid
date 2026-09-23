package ei;

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
public final class j extends g51 {
    static {
        g51.setup(new j());
    }

    public static h51 a(int i10, String str, String str2) {
        h51 J = h51.J(j.class);
        J.k = i10;
        J.l = str;
        J.m = str2;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((k) view).a(h51Var.l, h51Var.m, h51Var.k);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new k(context, d6Var, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
