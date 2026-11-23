package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q6 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new q6());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        j80 j80Var = (j80) view;
        j80Var.setGravity(n41Var.A);
        Object obj = n41Var.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = n41Var.H;
            org.telegram.ui.ActionBar.u6.U(j80Var, intValue, obj2 instanceof org.telegram.ui.ActionBar.i6 ? (org.telegram.ui.ActionBar.i6) obj2 : null);
        } else {
            org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
            j80Var.setTag(R.id.theme_bind, null);
            j80Var.setTextColor((int) n41Var.C);
        }
        j80Var.setTextSize(1, n41Var.B);
        j80Var.setTypeface(n41Var.r ? org.telegram.messenger.g0.o() : null);
        int i7 = n41Var.i;
        j80Var.setPadding(i7, 0, i7, n41Var.k);
        j80Var.setText(n41Var.m);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new w2(2, context, null);
    }
}
