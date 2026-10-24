package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kw;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class y1 extends kw {
    public final /* synthetic */ b2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(b2 b2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, g6Var), false);
        this.g0 = b2Var;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        g2 g2Var;
        b2 b2Var = this.g0;
        o1 o1Var = b2Var.b;
        a2 a2Var = b2Var.c;
        h2 h2Var = b2Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (h2Var != null && (g2Var = h2Var.h) != null) {
            if (g2Var.getSelectedCategory() != null) {
                o1.C1(o1Var, 0, 0);
                h2Var.h.L1(null);
            }
            h2Var.h.J1();
            h2Var.b();
        }
        if (a2Var != null) {
            a2Var.D(null);
        }
        while (true) {
            if (i12 >= a2Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = a2Var.y.keyAt(i12);
            if (a2Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = b2Var.n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = b2Var.b();
                b2Var.n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.C1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
