package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class i extends g51 {
    static {
        g51.setup(new i());
    }

    public static h51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h51 J = h51.J(i.class);
        J.d = i10;
        J.z = i11;
        J.k = i12;
        J.l = charSequence;
        J.m = str;
        return J;
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        ((j) view).a(h51Var.z, h51Var.k, h51Var.l, h51Var.m);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new j(context, f6Var);
    }
}
