package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o0 extends t61 {
    static {
        t61.setup(new o0());
    }

    public static u61 a(String str, CharSequence charSequence, int i10) {
        u61 K = u61.K(o0.class);
        K.b = false;
        K.z = i10;
        K.l = str;
        K.m = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((p0) view).a(u61Var.l, u61Var.m, u61Var.z);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new p0(context, 0, u6Var);
    }
}
