package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sw;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b2 extends sw {
    public final /* synthetic */ d2 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.v6, e6Var), false);
        this.g0 = d2Var;
    }

    @Override // org.telegram.ui.Components.sw
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        j2 j2Var;
        d2 d2Var = this.g0;
        o1 o1Var = d2Var.b;
        c2 c2Var = d2Var.c;
        k2 k2Var = d2Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (k2Var != null && (j2Var = k2Var.f) != null) {
            if (j2Var.getSelectedCategory() != null) {
                o1.x1(o1Var, 0, 0);
                k2Var.f.G1(null);
            }
            k2Var.f.E1();
            k2Var.b();
        }
        if (c2Var != null) {
            c2Var.D(null);
        }
        while (true) {
            if (i12 >= c2Var.y.size()) {
                i11 = -1;
                break;
            }
            i11 = c2Var.y.keyAt(i12);
            if (c2Var.y.valueAt(i12) == i10) {
                break;
            }
            i12++;
        }
        if (i11 >= 0) {
            float f7 = d2Var.n;
            if (f7 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f7 = d2Var.b();
                d2Var.n = f7;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.x1(o1Var, i11, ((int) (f7 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
