package lh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x1 extends mv {
    public final /* synthetic */ z1 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.v6, c6Var), false);
        this.e0 = z1Var;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.e0;
        o1 o1Var = z1Var.b;
        y1 y1Var = z1Var.c;
        e2 e2Var = z1Var.f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.f) != null) {
            if (d2Var.getSelectedCategory() != null) {
                o1.w1(o1Var, 0, 0);
                e2Var.f.F1(null);
            }
            e2Var.f.D1();
            e2Var.b();
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
            float f10 = z1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f10 = z1Var.b();
                z1Var.n = f10;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.w1(o1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
