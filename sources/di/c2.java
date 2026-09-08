package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bw;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c2 extends bw {
    public final /* synthetic */ e2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(e2 e2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), false);
        this.g0 = e2Var;
    }

    @Override // org.telegram.ui.Components.bw
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        k2 k2Var;
        e2 e2Var = this.g0;
        p1 p1Var = e2Var.b;
        d2 d2Var = e2Var.c;
        l2 l2Var = e2Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (l2Var != null && (k2Var = l2Var.f) != null) {
            if (k2Var.getSelectedCategory() != null) {
                p1.v1(p1Var, 0, 0);
                l2Var.f.E1(null);
            }
            l2Var.f.C1();
            l2Var.b();
        }
        if (d2Var != null) {
            d2Var.D(null);
        }
        while (true) {
            if (i12 >= d2Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = d2Var.y.keyAt(i12);
            if (d2Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = e2Var.n;
            if (f7 >= 0.0f) {
                paddingTop = p1Var.getPaddingTop();
            } else {
                f7 = e2Var.b();
                e2Var.n = f7;
                paddingTop = p1Var.getPaddingTop();
            }
            p1.v1(p1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
