package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class j4 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new j4());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(m61Var.d, m61Var.z, (a8) m61Var.G);
        k4Var.b(m61Var.e, false);
        boolean z11 = m61Var.f;
        if (k4Var.h != z11) {
            k4Var.h = z11;
            k4Var.F.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(m61Var.D);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new k4(context, g6Var);
    }
}
