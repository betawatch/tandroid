package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class v5 implements e1 {
    public final /* synthetic */ a6 a;

    public v5(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // oi.e1
    public final void A(int i7, int i10) {
        g2 g2Var;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || a6Var.y == null || (g2Var = ((d3) x5Var).a.R3) == null) {
            return;
        }
        g2Var.f(i7, i10);
    }

    @Override // oi.e1
    public final /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // oi.e1
    public final boolean J(f1 f1Var) {
        a6 a6Var = this.a;
        a6Var.f.O();
        f1 f1Var2 = a6Var.f;
        f1Var2.setSelection(f1Var2.length());
        return true;
    }

    @Override // oi.e1
    public final void b1(CharSequence charSequence) {
        x5 x5Var = this.a.E;
        if (x5Var != null) {
            d3 d3Var = (d3) x5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            d3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.e1
    public final /* synthetic */ boolean d2(f1 f1Var) {
        return false;
    }

    @Override // oi.e1
    public final void e(f1 f1Var) {
        x5 x5Var = this.a.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.k(f1Var, true);
        }
    }

    @Override // oi.e1
    public final boolean o() {
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || a6Var.y == null) {
            return false;
        }
        return ((d3) x5Var).a.V4();
    }

    @Override // oi.e1
    public final void r1(f1 f1Var, int i7, int i10) {
        x5 x5Var;
        j9 textSelectionHelper;
        a6 a6Var = this.a;
        if (a6Var.n || i7 == i10 || (x5Var = a6Var.E) == null || (textSelectionHelper = ((d3) x5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        f1Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 6));
    }

    @Override // oi.e1
    public final void s1(Editable editable) {
        a6 a6Var = this.a;
        if (a6Var.y == null) {
            return;
        }
        a6Var.w();
        x5 x5Var = a6Var.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = a6Var.y.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            a6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            a6Var.invalidate();
            int measuredWidth = a6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (a6Var.g(measuredWidth, a6Var.getPaddingBottom() + a6Var.h.getMeasuredHeight() + a6Var.b.getMeasuredHeight() + a6Var.getPaddingTop()) == a6Var.P) {
                    return;
                }
            }
            a6Var.requestLayout();
        }
    }

    @Override // oi.e1
    public final void x0(f1 f1Var) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.E;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return;
        }
        t3.T1(((d3) x5Var).a, aVar);
    }

    @Override // oi.e1
    public final void E0() {
    }
}
