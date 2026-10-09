package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h extends o61 {
    static {
        o61.setup(new h());
    }

    public static p61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        p61 J = p61.J(h.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((i) view).a(p61Var.z, p61Var.k, p61Var.l, p61Var.m);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new i(context, e6Var);
    }
}
