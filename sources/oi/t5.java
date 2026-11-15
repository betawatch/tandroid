package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class t5 implements d1 {
    public final /* synthetic */ y5 a;

    public t5(y5 y5Var) {
        this.a = y5Var;
    }

    @Override // oi.d1
    public final void I(CharSequence charSequence) {
        v5 v5Var = this.a.E;
        if (v5Var != null) {
            a3 a3Var = (a3) v5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            a3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.d1
    public final void Z(e1 e1Var, int i7, int i10) {
        v5 v5Var;
        h9 textSelectionHelper;
        y5 y5Var = this.a;
        if (y5Var.n || i7 == i10 || (v5Var = y5Var.E) == null || (textSelectionHelper = ((a3) v5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 6));
    }

    @Override // oi.d1
    public final void b0(Editable editable) {
        y5 y5Var = this.a;
        if (y5Var.y == null) {
            return;
        }
        y5Var.w();
        v5 v5Var = y5Var.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).a;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.p3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = y5Var.y.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            y5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            y5Var.invalidate();
            int measuredWidth = y5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (y5Var.g(measuredWidth, y5Var.getPaddingBottom() + y5Var.h.getMeasuredHeight() + y5Var.b.getMeasuredHeight() + y5Var.getPaddingTop()) == y5Var.P) {
                    return;
                }
            }
            y5Var.requestLayout();
        }
    }

    @Override // oi.d1
    public final void d(e1 e1Var) {
        v5 v5Var = this.a.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).a;
            q3.Q1(q3Var, e1Var);
            q3Var.p3.b(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean g() {
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || y5Var.y == null) {
            return false;
        }
        return ((a3) v5Var).a.V4();
    }

    @Override // oi.d1
    public final /* synthetic */ boolean h0(boolean z10) {
        return false;
    }

    @Override // oi.d1
    public final void m(int i7, int i10) {
        d2 d2Var;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || y5Var.y == null || (d2Var = ((a3) v5Var).a.R3) == null) {
            return;
        }
        d2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final boolean o(e1 e1Var) {
        y5 y5Var = this.a;
        y5Var.f.O();
        e1 e1Var2 = y5Var.f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override // oi.d1
    public final /* synthetic */ boolean q0(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void z(e1 e1Var) {
        a aVar;
        y5 y5Var = this.a;
        v5 v5Var = y5Var.E;
        if (v5Var == null || (aVar = y5Var.y) == null) {
            return;
        }
        q3.T1(((a3) v5Var).a, aVar);
    }

    @Override // oi.d1
    public final void B() {
    }
}
