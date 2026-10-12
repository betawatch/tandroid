package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h extends k61 {
    static {
        k61.setup(new h());
    }

    public static l61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        l61 J = l61.J(h.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((i) view).a(l61Var.z, l61Var.k, l61Var.l, l61Var.m);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }
}
