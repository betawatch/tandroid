package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class i extends g61 {
    static {
        g61.setup(new i());
    }

    public static h61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h61 K = h61.K(i.class);
        K.d = i10;
        K.z = i11;
        K.k = i12;
        K.l = charSequence;
        K.m = str;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((j) view).a(h61Var.z, h61Var.k, h61Var.l, h61Var.m);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var);
    }
}
