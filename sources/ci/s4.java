package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class s4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new s4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(i51Var.d, i51Var.z, (o8) i51Var.G);
        t4Var.b(i51Var.e, false);
        boolean z11 = i51Var.f;
        if (t4Var.f != z11) {
            t4Var.f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(i51Var.D);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new t4(context, e6Var);
    }
}
