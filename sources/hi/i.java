package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i extends t61 {
    static {
        t61.setup(new i());
    }

    public static u61 a(int i10, String str, String str2) {
        u61 K = u61.K(i.class);
        K.k = i10;
        K.l = str;
        K.m = str2;
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((j) view).a(u61Var.l, u61Var.m, u61Var.k);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new j(context, u6Var, false);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }
}
