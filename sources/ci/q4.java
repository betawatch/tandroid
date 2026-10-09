package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class q4 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new q4());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        r4 r4Var = (r4) view;
        r4Var.a(p61Var.d, p61Var.z, (l8) p61Var.G);
        r4Var.b(p61Var.e, false);
        boolean z11 = p61Var.f;
        if (r4Var.f != z11) {
            r4Var.f = z11;
            r4Var.E.a(z11);
            r4Var.invalidate();
        }
        r4Var.setOnCheckboxClick(p61Var.D);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new r4(context, e6Var);
    }
}
