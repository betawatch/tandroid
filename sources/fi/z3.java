package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new z3());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        a4 a4Var = (a4) view;
        a4Var.a(r31Var.d, r31Var.z, (e7) r31Var.G);
        a4Var.b(r31Var.e, false);
        boolean z10 = r31Var.f;
        if (a4Var.h != z10) {
            a4Var.h = z10;
            a4Var.F.a(z10);
            a4Var.invalidate();
        }
        a4Var.setOnCheckboxClick(r31Var.D);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a4(context, f6Var);
    }
}
