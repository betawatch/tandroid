package bi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gw;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n2 extends gw {
    public final /* synthetic */ q2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q2 q2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.v6, f6Var), false);
        this.g0 = q2Var;
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        w2 w2Var;
        q2 q2Var = this.g0;
        w1 w1Var = q2Var.b;
        p2 p2Var = q2Var.c;
        x2 x2Var = q2Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (x2Var != null && (w2Var = x2Var.f) != null) {
            if (w2Var.getSelectedCategory() != null) {
                w1.v1(w1Var, 0, 0);
                x2Var.f.E1(null);
            }
            x2Var.f.C1();
            x2Var.b();
        }
        if (p2Var != null) {
            p2Var.D(null);
        }
        while (true) {
            if (i12 >= p2Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = p2Var.y.keyAt(i12);
            if (p2Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = q2Var.n;
            if (f7 >= 0.0f) {
                paddingTop = w1Var.getPaddingTop();
            } else {
                f7 = q2Var.b();
                q2Var.n = f7;
                paddingTop = w1Var.getPaddingTop();
            }
            w1.v1(w1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
