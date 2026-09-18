package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class y5 implements h1 {
    public final /* synthetic */ d6 a;

    public y5(d6 d6Var) {
        this.a = d6Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        a6 a6Var;
        q9 textSelectionHelper;
        d6 d6Var = this.a;
        if (d6Var.n || i10 == i11 || (a6Var = d6Var.y) == null || (textSelectionHelper = ((e3) a6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            e3 e3Var = (e3) a6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            e3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        d6 d6Var = this.a;
        if (d6Var.x == null) {
            return;
        }
        d6Var.w();
        a6 a6Var = d6Var.y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.h3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = d6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            d6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            d6Var.invalidate();
            int measuredWidth = d6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (d6Var.h(measuredWidth, d6Var.getPaddingBottom() + d6Var.h.getMeasuredHeight() + d6Var.b.getMeasuredHeight() + d6Var.getPaddingTop()) == d6Var.O) {
                    return;
                }
            }
            d6Var.requestLayout();
        }
    }

    @Override // ii.h1
    public final /* synthetic */ boolean X(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).a;
            w3.N1(w3Var, i1Var);
            w3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null) {
            return false;
        }
        return ((e3) a6Var).a.T4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        h2 h2Var;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null || (h2Var = ((e3) a6Var).a.J3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        a aVar;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || (aVar = d6Var.x) == null) {
            return;
        }
        w3.Q1(((e3) a6Var).a, aVar);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final boolean t(i1 i1Var) {
        d6 d6Var = this.a;
        d6Var.f.r();
        i1 i1Var2 = d6Var.f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override // ii.h1
    public final void x() {
    }
}
