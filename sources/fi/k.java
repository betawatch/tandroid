package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k extends g51 {
    static {
        g51.setup(new k());
    }

    public static h51 a(int i10, String str, String str2) {
        h51 J = h51.J(k.class);
        J.k = i10;
        J.l = str;
        J.m = str2;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((l) view).a(h51Var.l, h51Var.m, h51Var.k);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new l(context, f6Var, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
