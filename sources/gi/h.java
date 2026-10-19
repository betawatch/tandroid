package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class h extends f61 {
    static {
        f61.setup(new h());
    }

    public static g61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        g61 J = g61.J(h.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ((i) view).a(g61Var.z, g61Var.k, g61Var.l, g61Var.m);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new i(context, d6Var);
    }
}
