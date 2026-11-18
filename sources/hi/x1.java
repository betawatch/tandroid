package hi;

import android.content.Context;
import org.telegram.ui.Components.lv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class x1 extends lv {
    public final /* synthetic */ z1 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i6Var), false);
        this.h0 = z1Var;
    }

    @Override // org.telegram.ui.Components.lv
    public final boolean h(int i7) {
        int i10;
        int paddingTop;
        d2 d2Var;
        z1 z1Var = this.h0;
        o1 o1Var = z1Var.b;
        y1 y1Var = z1Var.c;
        e2 e2Var = z1Var.f;
        int i11 = 0;
        if (this.d) {
            return false;
        }
        if (e2Var != null && (d2Var = e2Var.h) != null) {
            if (d2Var.getSelectedCategory() != null) {
                o1.z1(o1Var, 0, 0);
                e2Var.h.I1(null);
            }
            e2Var.h.G1();
            e2Var.b();
        }
        if (y1Var != null) {
            y1Var.D(null);
        }
        while (true) {
            if (i11 >= y1Var.E.size()) {
                i10 = -1;
                break;
            }
            i10 = y1Var.E.keyAt(i11);
            if (y1Var.E.valueAt(i11) == i7) {
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            float f10 = z1Var.n;
            if (f10 >= 0.0f) {
                paddingTop = o1Var.getPaddingTop();
            } else {
                f10 = z1Var.b();
                z1Var.n = f10;
                paddingTop = o1Var.getPaddingTop();
            }
            o1.z1(o1Var, i10, ((int) (f10 + paddingTop)) - org.telegram.messenger.g0.L(102.0f));
        }
        return true;
    }
}
