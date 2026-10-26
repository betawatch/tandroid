package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class x1 extends kw {
    public final /* synthetic */ z1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.v6, u6Var), false);
        this.g0 = z1Var;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        e2 e2Var;
        z1 z1Var = this.g0;
        n1 n1Var = z1Var.b;
        y1 y1Var = z1Var.c;
        f2 f2Var = z1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (f2Var != null && (e2Var = f2Var.h) != null) {
            if (e2Var.getSelectedCategory() != null) {
                n1.C1(n1Var, 0, 0);
                f2Var.h.L1(null);
            }
            f2Var.h.J1();
            f2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i12 >= y1Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = y1Var.y.keyAt(i12);
            if (y1Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = z1Var.n;
            if (f7 >= 0.0f) {
                paddingTop = n1Var.getPaddingTop();
            } else {
                f7 = z1Var.b();
                z1Var.n = f7;
                paddingTop = n1Var.getPaddingTop();
            }
            n1.C1(n1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
