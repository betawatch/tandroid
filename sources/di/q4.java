package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q4 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new q4());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(m61Var.d, m61Var.z, (k8) m61Var.G);
        r4Var.b(m61Var.e, false);
        boolean z11 = m61Var.f;
        if (r4Var.f != z11) {
            r4Var.f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(m61Var.D);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r4(context, c6Var);
    }
}
