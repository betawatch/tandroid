package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i4 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new i4());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        j4 j4Var = (j4) view;
        j4Var.a(u61Var.d, u61Var.z, (w7) u61Var.G);
        j4Var.b(u61Var.e, false);
        boolean z11 = u61Var.f;
        if (j4Var.h != z11) {
            j4Var.h = z11;
            j4Var.F.a(z11);
            j4Var.invalidate();
        }
        j4Var.setOnCheckboxClick(u61Var.D);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new j4(context, u6Var);
    }
}
