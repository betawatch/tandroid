package fi;

import android.content.Context;
import org.telegram.ui.Components.av;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class w1 extends av {
    public final /* synthetic */ z1 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z1 z1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, f6Var), false);
        this.g0 = z1Var;
    }

    @Override // org.telegram.ui.Components.av
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.g0;
        m1 m1Var = z1Var.b;
        y1 y1Var = z1Var.c;
        e2 e2Var = z1Var.f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.h) != null) {
            if (d2Var.getSelectedCategory() != null) {
                m1.z1(m1Var, 0, 0);
                e2Var.h.I1(null);
            }
            e2Var.h.G1();
            e2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i11 >= y1Var.D.size()) {
                i10 = -1;
                break;
            }
            i10 = y1Var.D.keyAt(i11);
            if (y1Var.D.valueAt(i11) == i7) {
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            float f10 = z1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = m1Var.getPaddingTop();
            } else {
                f10 = z1Var.b();
                z1Var.n = f10;
                paddingTop = m1Var.getPaddingTop();
            }
            m1.z1(m1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
