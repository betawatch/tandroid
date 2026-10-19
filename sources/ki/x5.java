package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class x5 implements g1 {
    public final /* synthetic */ c6 a;

    public x5(c6 c6Var) {
        this.a = c6Var;
    }

    @Override // ki.g1
    public final void G(Editable editable) {
        c6 c6Var = this.a;
        if (c6Var.x == null) {
            return;
        }
        c6Var.w();
        z5 z5Var = c6Var.y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = c6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            c6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            c6Var.invalidate();
            int measuredWidth = c6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (c6Var.h(measuredWidth, c6Var.getPaddingBottom() + c6Var.h.getMeasuredHeight() + c6Var.b.getMeasuredHeight() + c6Var.getPaddingTop()) == c6Var.O) {
                    return;
                }
            }
            c6Var.requestLayout();
        }
    }

    @Override // ki.g1
    public final /* synthetic */ boolean M(boolean z10) {
        return false;
    }

    @Override // ki.g1
    public final /* synthetic */ boolean P(h1 h1Var) {
        return false;
    }

    @Override // ki.g1
    public final void R(h1 h1Var, int i10, int i11) {
        z5 z5Var;
        n9 textSelectionHelper;
        c6 c6Var = this.a;
        if (c6Var.n || i10 == i11 || (z5Var = c6Var.y) == null || (textSelectionHelper = ((e3) z5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ki.g1
    public final void c(h1 h1Var) {
        z5 z5Var = this.a.y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).a;
            w3.N1(w3Var, h1Var);
            w3Var.f3.o(h1Var, true);
        }
    }

    @Override // ki.g1
    public final boolean e() {
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || c6Var.x == null) {
            return false;
        }
        return ((e3) z5Var).a.T4();
    }

    @Override // ki.g1
    public final void f(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || c6Var.x == null || (h2Var = ((e3) z5Var).a.H3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ki.g1
    public final void k(h1 h1Var) {
        a aVar;
        c6 c6Var = this.a;
        z5 z5Var = c6Var.y;
        if (z5Var == null || (aVar = c6Var.x) == null) {
            return;
        }
        w3.Q1(((e3) z5Var).a, aVar);
    }

    @Override // ki.g1
    public final boolean s(h1 h1Var) {
        c6 c6Var = this.a;
        c6Var.f.r();
        h1 h1Var2 = c6Var.f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override // ki.g1
    public final void x(CharSequence charSequence) {
        z5 z5Var = this.a.y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            e3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ki.g1
    public final void o() {
    }
}
