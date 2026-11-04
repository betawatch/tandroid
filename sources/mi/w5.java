package mi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class w5 implements g1 {
    public final /* synthetic */ b6 a;

    public w5(b6 b6Var) {
        this.a = b6Var;
    }

    @Override // mi.g1
    public final void A(int i3, int i10) {
        g2 g2Var;
        b6 b6Var = this.a;
        y5 y5Var = b6Var.E;
        if (y5Var == null || b6Var.y == null || (g2Var = ((d3) y5Var).a.R3) == null) {
            return;
        }
        g2Var.f(i3, i10);
    }

    @Override // mi.g1
    public final void B1(Editable editable) {
        b6 b6Var = this.a;
        if (b6Var.y == null) {
            return;
        }
        b6Var.w();
        y5 y5Var = b6Var.E;
        if (y5Var != null) {
            t3 t3Var = ((d3) y5Var).a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.p3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = b6Var.y.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            b6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            b6Var.invalidate();
            int measuredWidth = b6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (b6Var.g(measuredWidth, b6Var.getPaddingBottom() + b6Var.h.getMeasuredHeight() + b6Var.b.getMeasuredHeight() + b6Var.getPaddingTop()) == b6Var.P) {
                    return;
                }
            }
            b6Var.requestLayout();
        }
    }

    @Override // mi.g1
    public final /* synthetic */ boolean M0(h1 h1Var) {
        return false;
    }

    @Override // mi.g1
    public final void V0(h1 h1Var) {
        a aVar;
        b6 b6Var = this.a;
        y5 y5Var = b6Var.E;
        if (y5Var == null || (aVar = b6Var.y) == null) {
            return;
        }
        t3.T1(((d3) y5Var).a, aVar);
    }

    @Override // mi.g1
    public final /* synthetic */ boolean X1(boolean z10) {
        return false;
    }

    @Override // mi.g1
    public final boolean c0(h1 h1Var) {
        b6 b6Var = this.a;
        b6Var.f.N();
        h1 h1Var2 = b6Var.f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override // mi.g1
    public final void f(h1 h1Var) {
        y5 y5Var = this.a.E;
        if (y5Var != null) {
            t3 t3Var = ((d3) y5Var).a;
            t3.Q1(t3Var, h1Var);
            t3Var.p3.E(h1Var, true);
        }
    }

    @Override // mi.g1
    public final void g1(CharSequence charSequence) {
        y5 y5Var = this.a.E;
        if (y5Var != null) {
            d3 d3Var = (d3) y5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            d3Var.a.w4(charSequence.toString());
        }
    }

    @Override // mi.g1
    public final void l(h1 h1Var, int i3, int i10) {
        y5 y5Var;
        h9 textSelectionHelper;
        b6 b6Var = this.a;
        if (b6Var.n || i3 == i10 || (y5Var = b6Var.E) == null || (textSelectionHelper = ((d3) y5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 6));
    }

    @Override // mi.g1
    public final boolean m() {
        b6 b6Var = this.a;
        y5 y5Var = b6Var.E;
        if (y5Var == null || b6Var.y == null) {
            return false;
        }
        return ((d3) y5Var).a.V4();
    }

    @Override // mi.g1
    public final void w0() {
    }
}
