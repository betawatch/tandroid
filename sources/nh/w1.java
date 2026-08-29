package nh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w1 extends tv {
    public final /* synthetic */ y1 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var), false);
        this.c0 = y1Var;
    }

    @Override // org.telegram.ui.Components.tv
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.c0;
        n1 n1Var = y1Var.b;
        x1 x1Var = y1Var.c;
        d2 d2Var = y1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.f) != null) {
            if (c2Var.getSelectedCategory() != null) {
                n1.w1(n1Var, 0, 0);
                d2Var.f.F1(null);
            }
            d2Var.f.D1();
            d2Var.b();
        }
        if (x1Var != null) {
            x1Var.D(null);
        }
        while (true) {
            if (i12 >= x1Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = x1Var.y.keyAt(i12);
            if (x1Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f9 = y1Var.n;
            if (f9 >= 0.0f) {
                paddingTop = n1Var.getPaddingTop();
            } else {
                f9 = y1Var.b();
                y1Var.n = f9;
                paddingTop = n1Var.getPaddingTop();
            }
            n1.w1(n1Var, i11, ((int) (f9 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
