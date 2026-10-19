package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class j4 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new j4());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        k4 k4Var = (k4) view;
        k4Var.a(g61Var.d, g61Var.z, (a8) g61Var.G);
        k4Var.b(g61Var.e, false);
        boolean z11 = g61Var.f;
        if (k4Var.f != z11) {
            k4Var.f = z11;
            k4Var.E.a(z11);
            k4Var.invalidate();
        }
        k4Var.setOnCheckboxClick(g61Var.D);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k4(context, d6Var);
    }
}
