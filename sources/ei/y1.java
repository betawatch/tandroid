package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kw;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class y1 extends kw {
    public final /* synthetic */ b2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(b2 b2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.v6, d6Var), false);
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
        if (h2Var != null && (g2Var = h2Var.f) != null) {
            if (g2Var.getSelectedCategory() != null) {
                o1.x1(o1Var, 0, 0);
                h2Var.f.G1(null);
            }
            h2Var.f.E1();
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
            o1.x1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
