package hi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b6 implements j1 {
    public final /* synthetic */ g6 a;

    public b6(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // hi.j1
    public final void D(CharSequence charSequence) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            h3 h3Var = (h3) d6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            h3Var.a.s4(charSequence.toString());
        }
    }

    @Override // hi.j1
    public final /* synthetic */ boolean F(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public final void G(Editable editable) {
        g6 g6Var = this.a;
        if (g6Var.x == null) {
            return;
        }
        g6Var.w();
        d6 d6Var = g6Var.y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.h3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = g6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            g6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            g6Var.invalidate();
            int measuredWidth = g6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (g6Var.h(measuredWidth, g6Var.getPaddingBottom() + g6Var.h.getMeasuredHeight() + g6Var.b.getMeasuredHeight() + g6Var.getPaddingTop()) == g6Var.O) {
                    return;
                }
            }
            g6Var.requestLayout();
        }
    }

    @Override // hi.j1
    public final /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // hi.j1
    public final boolean P(k1 k1Var) {
        g6 g6Var = this.a;
        g6Var.f.r();
        k1 k1Var2 = g6Var.f;
        k1Var2.setSelection(k1Var2.length());
        return true;
    }

    @Override // hi.j1
    public final void b(k1 k1Var) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).a;
            z3.L1(z3Var, k1Var);
            z3Var.h3.C(k1Var, true);
        }
    }

    @Override // hi.j1
    public final boolean f() {
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null) {
            return false;
        }
        return ((h3) d6Var).a.R4();
    }

    @Override // hi.j1
    public final void h(int i10, int i11) {
        k2 k2Var;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null || (k2Var = ((h3) d6Var).a.J3) == null) {
            return;
        }
        k2Var.f(i10, i11);
    }

    @Override // hi.j1
    public final void r(k1 k1Var, int i10, int i11) {
        d6 d6Var;
        s9 textSelectionHelper;
        g6 g6Var = this.a;
        if (g6Var.n || i10 == i11 || (d6Var = g6Var.y) == null || (textSelectionHelper = ((h3) d6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        k1Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // hi.j1
    public final void x(k1 k1Var) {
        a aVar;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || (aVar = g6Var.x) == null) {
            return;
        }
        z3.O1(((h3) d6Var).a, aVar);
    }

    @Override // hi.j1
    public final void t() {
    }
}
