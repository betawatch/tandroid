package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class b6 implements g1 {
    public final /* synthetic */ g6 a;

    public b6(g6 g6Var) {
        this.a = g6Var;
    }

    @Override // ji.g1
    public final void C(h1 h1Var) {
        a aVar;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || (aVar = g6Var.x) == null) {
            return;
        }
        v3.O1(((d3) d6Var).a, aVar);
    }

    @Override // ji.g1
    public final void N(Editable editable) {
        g6 g6Var = this.a;
        if (g6Var.x == null) {
            return;
        }
        g6Var.w();
        d6 d6Var = g6Var.y;
        if (d6Var != null) {
            v3 v3Var = ((d3) d6Var).a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.h3.onContentChanged();
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

    @Override // ji.g1
    public final /* synthetic */ boolean R(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            v3 v3Var = ((d3) d6Var).a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // ji.g1
    public final boolean e() {
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null) {
            return false;
        }
        return ((d3) d6Var).a.R4();
    }

    @Override // ji.g1
    public final boolean h(h1 h1Var) {
        g6 g6Var = this.a;
        g6Var.f.r();
        h1 h1Var2 = g6Var.f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override // ji.g1
    public final void i(int i10, int i11) {
        g2 g2Var;
        g6 g6Var = this.a;
        d6 d6Var = g6Var.y;
        if (d6Var == null || g6Var.x == null || (g2Var = ((d3) d6Var).a.J3) == null) {
            return;
        }
        g2Var.f(i10, i11);
    }

    @Override // ji.g1
    public final /* synthetic */ boolean k(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void o(h1 h1Var, int i10, int i11) {
        d6 d6Var;
        q9 textSelectionHelper;
        g6 g6Var = this.a;
        if (g6Var.n || i10 == i11 || (d6Var = g6Var.y) == null || (textSelectionHelper = ((d3) d6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new fi.y4(this, h1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ji.g1
    public final void y(CharSequence charSequence) {
        d6 d6Var = this.a.y;
        if (d6Var != null) {
            d3 d3Var = (d3) d6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            d3Var.a.s4(charSequence.toString());
        }
    }

    @Override // ji.g1
    public final void r() {
    }
}
