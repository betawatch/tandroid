package hi;

import android.content.Context;
import org.telegram.ui.Components.ov;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class w1 extends ov {
    public final /* synthetic */ y1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(y1 y1Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, h6Var), false);
        this.h0 = y1Var;
    }

    @Override // org.telegram.ui.Components.ov
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        c2 c2Var;
        y1 y1Var = this.h0;
        o1 o1Var = y1Var.b;
        x1 x1Var = y1Var.c;
        d2 d2Var = y1Var.f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (d2Var != null && (c2Var = d2Var.h) != null) {
            if (c2Var.getSelectedCategory() != null) {
                o1.z1(o1Var, 0, 0);
                d2Var.h.I1(null);
            }
            d2Var.h.G1();
            d2Var.b();
        }
        if (x1Var != null) {
            x1Var.D(null);
        }
        while (true) {
            if (i11 >= x1Var.E.size()) {
                i10 = -1;
                break;
            }
            i10 = x1Var.E.keyAt(i11);
            if (x1Var.E.valueAt(i11) == i7) {
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            float f10 = y1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f10 = y1Var.b();
                y1Var.n = f10;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.z1(o1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
