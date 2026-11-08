package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q0 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new q0());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((r0) view).set((t0) x31Var.G);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r0(context);
    }

    @Override // org.telegram.ui.Components.w31
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.G == x31Var2.G;
    }
}
