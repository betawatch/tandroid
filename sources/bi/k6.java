package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k6 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new k6());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        k80 k80Var = (k80) view;
        k80Var.setGravity(l41Var.A);
        Object obj = l41Var.I;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = l41Var.H;
            org.telegram.ui.ActionBar.u6.U(k80Var, intValue, obj2 instanceof org.telegram.ui.ActionBar.i6 ? (org.telegram.ui.ActionBar.i6) obj2 : null);
        } else {
            org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
            k80Var.setTag(R.id.theme_bind, null);
            k80Var.setTextColor((int) l41Var.C);
        }
        k80Var.setTextSize(1, l41Var.B);
        k80Var.setTypeface(l41Var.r ? org.telegram.messenger.g0.o() : null);
        int i7 = l41Var.i;
        k80Var.setPadding(i7, 0, i7, l41Var.k);
        k80Var.setText(l41Var.m);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new q2(2, context, null);
    }
}
