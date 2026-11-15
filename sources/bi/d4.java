package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d4 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new d4());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        z70 z70Var = (z70) view;
        z70Var.setGravity(b41Var.z);
        Object obj = b41Var.H;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b41Var.G;
            org.telegram.ui.ActionBar.q6.U(z70Var, intValue, obj2 instanceof org.telegram.ui.ActionBar.e6 ? (org.telegram.ui.ActionBar.e6) obj2 : null);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = org.telegram.ui.ActionBar.q6.a;
            z70Var.setTag(R.id.theme_bind, null);
            z70Var.setTextColor((int) b41Var.B);
        }
        z70Var.setTextSize(1, b41Var.A);
        z70Var.setTypeface(b41Var.q ? org.telegram.messenger.g0.o() : null);
        int i7 = b41Var.i;
        z70Var.setPadding(i7, 0, i7, b41Var.k);
        z70Var.setText(b41Var.l);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w1(2, context, null);
    }
}
