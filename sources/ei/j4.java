package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class j4 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new j4());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(f61Var.d, f61Var.z, (a8) f61Var.G);
        k4Var.b(f61Var.e, false);
        boolean z11 = f61Var.f;
        if (k4Var.f != z11) {
            k4Var.f = z11;
            k4Var.E.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(f61Var.D);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k4(context, d6Var);
    }
}
