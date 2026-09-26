package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class z5 implements h1 {
    public final /* synthetic */ e6 a;

    public z5(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        b6 b6Var;
        q9 textSelectionHelper;
        e6 e6Var = this.a;
        if (e6Var.n || i10 == i11 || (b6Var = e6Var.y) == null || (textSelectionHelper = ((f3) b6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        b6 b6Var = this.a.y;
        if (b6Var != null) {
            f3 f3Var = (f3) b6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            f3Var.a.t4(charSequence.toString());
        }
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        e6 e6Var = this.a;
        if (e6Var.x == null) {
            return;
        }
        e6Var.w();
        b6 b6Var = e6Var.y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.h3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = e6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            e6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            e6Var.invalidate();
            int measuredWidth = e6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (e6Var.h(measuredWidth, e6Var.getPaddingBottom() + e6Var.h.getMeasuredHeight() + e6Var.b.getMeasuredHeight() + e6Var.getPaddingTop()) == e6Var.O) {
                    return;
                }
            }
            e6Var.requestLayout();
        }
    }

    @Override // ii.h1
    public final /* synthetic */ boolean X(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        b6 b6Var = this.a.y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).a;
            x3.M1(x3Var, i1Var);
            x3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || e6Var.x == null) {
            return false;
        }
        return ((f3) b6Var).a.S4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        i2 i2Var;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || e6Var.x == null || (i2Var = ((f3) b6Var).a.J3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        a aVar;
        e6 e6Var = this.a;
        b6 b6Var = e6Var.y;
        if (b6Var == null || (aVar = e6Var.x) == null) {
            return;
        }
        x3.P1(((f3) b6Var).a, aVar);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final boolean t(i1 i1Var) {
        e6 e6Var = this.a;
        e6Var.f.r();
        i1 i1Var2 = e6Var.f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override // ii.h1
    public final void x() {
    }
}
