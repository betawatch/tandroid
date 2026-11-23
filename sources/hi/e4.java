package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e4 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new e4());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        f4 f4Var = (f4) view;
        f4Var.a(n41Var.d, n41Var.A, (x7) n41Var.H);
        f4Var.b(n41Var.e, false);
        boolean z11 = n41Var.f;
        if (f4Var.h != z11) {
            f4Var.h = z11;
            f4Var.G.a(z11);
            f4Var.invalidate();
        }
        f4Var.setOnCheckboxClick(n41Var.E);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f4(context, i6Var);
    }
}
