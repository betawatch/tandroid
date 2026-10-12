package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class d6 implements g1 {
    public final /* synthetic */ i6 a;

    public d6(i6 i6Var) {
        this.a = i6Var;
    }

    @Override // ji.g1
    public final /* synthetic */ boolean C(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final /* synthetic */ boolean F0(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public final void U(h1 h1Var, int i10, int i11) {
        f6 f6Var;
        o9 textSelectionHelper;
        i6 i6Var = this.a;
        if (i6Var.n || i10 == i11 || (f6Var = i6Var.y) == null || (textSelectionHelper = ((f3) f6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        f6 f6Var = this.a.y;
        if (f6Var != null) {
            x3 x3Var = ((f3) f6Var).a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.c0(h1Var, true);
        }
    }

    @Override // ji.g1
    public final void g0(CharSequence charSequence) {
        f6 f6Var = this.a.y;
        if (f6Var != null) {
            f3 f3Var = (f3) f6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            f3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ji.g1
    public final boolean h() {
        i6 i6Var = this.a;
        f6 f6Var = i6Var.y;
        if (f6Var == null || i6Var.x == null) {
            return false;
        }
        return ((f3) f6Var).a.T4();
    }

    @Override // ji.g1
    public final boolean l(h1 h1Var) {
        i6 i6Var = this.a;
        i6Var.f.r();
        h1 h1Var2 = i6Var.f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override // ji.g1
    public final void p(int i10, int i11) {
        h2 h2Var;
        i6 i6Var = this.a;
        f6 f6Var = i6Var.y;
        if (f6Var == null || i6Var.x == null || (h2Var = ((f3) f6Var).a.H3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ji.g1
    public final void p0(h1 h1Var) {
        a aVar;
        i6 i6Var = this.a;
        f6 f6Var = i6Var.y;
        if (f6Var == null || (aVar = i6Var.x) == null) {
            return;
        }
        x3.Q1(((f3) f6Var).a, aVar);
    }

    @Override // ji.g1
    public final void s0(Editable editable) {
        i6 i6Var = this.a;
        if (i6Var.x == null) {
            return;
        }
        i6Var.w();
        f6 f6Var = i6Var.y;
        if (f6Var != null) {
            x3 x3Var = ((f3) f6Var).a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = i6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            i6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            i6Var.invalidate();
            int measuredWidth = i6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (i6Var.h(measuredWidth, i6Var.getPaddingBottom() + i6Var.h.getMeasuredHeight() + i6Var.b.getMeasuredHeight() + i6Var.getPaddingTop()) == i6Var.O) {
                    return;
                }
            }
            i6Var.requestLayout();
        }
    }

    @Override // ji.g1
    public final void W() {
    }
}
