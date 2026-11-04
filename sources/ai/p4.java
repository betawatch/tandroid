package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p4 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new p4());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        s70 s70Var = (s70) view;
        s70Var.setGravity(r31Var.z);
        Object obj = r31Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = r31Var.G;
            org.telegram.ui.ActionBar.r6.V(s70Var, intValue, obj2 instanceof org.telegram.ui.ActionBar.e6 ? (org.telegram.ui.ActionBar.e6) obj2 : null);
        } else {
            org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
            s70Var.setTag(R.id.theme_bind, null);
            s70Var.setTextColor((int) r31Var.B);
        }
        s70Var.setTextSize(1, r31Var.A);
        s70Var.setTypeface(r31Var.q ? org.telegram.messenger.g0.o() : null);
        int i3 = r31Var.i;
        s70Var.setPadding(i3, 0, i3, r31Var.k);
        s70Var.setText(r31Var.l);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e2(2, context, null);
    }
}
