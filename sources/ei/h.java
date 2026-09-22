package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class h extends x51 {
    static {
        x51.setup(new h());
    }

    public static y51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        y51 J = y51.J(h.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        ((i) view).a(y51Var.z, y51Var.k, y51Var.l, y51Var.m);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new i(context, f6Var);
    }
}
