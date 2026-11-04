package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new w3());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        x3 x3Var = (x3) view;
        x3Var.a(r31Var.d, r31Var.z, (f7) r31Var.G);
        x3Var.b(r31Var.e, false);
        boolean z11 = r31Var.f;
        if (x3Var.h != z11) {
            x3Var.h = z11;
            x3Var.G.a(z11);
            x3Var.invalidate();
        }
        x3Var.setOnCheckboxClick(r31Var.D);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x3(context, e6Var);
    }
}
