package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n6 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new n6());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        m80 m80Var = (m80) view;
        m80Var.setGravity(o41Var.A);
        Object obj = o41Var.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = o41Var.H;
            org.telegram.ui.ActionBar.t6.U(m80Var, intValue, obj2 instanceof org.telegram.ui.ActionBar.h6 ? (org.telegram.ui.ActionBar.h6) obj2 : null);
        } else {
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
            m80Var.setTag(R.id.theme_bind, null);
            m80Var.setTextColor((int) o41Var.C);
        }
        m80Var.setTextSize(1, o41Var.B);
        m80Var.setTypeface(o41Var.r ? org.telegram.messenger.g0.o() : null);
        int i7 = o41Var.i;
        m80Var.setPadding(i7, 0, i7, o41Var.k);
        m80Var.setText(o41Var.m);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new u2(2, context, null);
    }
}
