package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class a6 implements h1 {
    public final /* synthetic */ f6 a;

    public a6(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // ii.h1
    public final void B(Editable editable) {
        f6 f6Var = this.a;
        if (f6Var.x == null) {
            return;
        }
        f6Var.w();
        c6 c6Var = f6Var.y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.o3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = f6Var.x.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            f6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            f6Var.invalidate();
            int measuredWidth = f6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (f6Var.h(measuredWidth, f6Var.getPaddingBottom() + f6Var.h.getMeasuredHeight() + f6Var.b.getMeasuredHeight() + f6Var.getPaddingTop()) == f6Var.O) {
                    return;
                }
            }
            f6Var.requestLayout();
        }
    }

    @Override // ii.h1
    public final /* synthetic */ boolean C(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public final void b(i1 i1Var) {
        c6 c6Var = this.a.y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).a;
            x3.N1(x3Var, i1Var);
            x3Var.o3.P(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean e() {
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || f6Var.x == null) {
            return false;
        }
        return ((f3) c6Var).a.T4();
    }

    @Override // ii.h1
    public final void f(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || f6Var.x == null || (i2Var = ((f3) c6Var).a.Q3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final void l(i1 i1Var) {
        a aVar;
        f6 f6Var = this.a;
        c6 c6Var = f6Var.y;
        if (c6Var == null || (aVar = f6Var.x) == null) {
            return;
        }
        x3.Q1(((f3) c6Var).a, aVar);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean n(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final boolean p(i1 i1Var) {
        f6 f6Var = this.a;
        f6Var.f.r();
        i1 i1Var2 = f6Var.f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override // ii.h1
    public final void t(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        q9 textSelectionHelper;
        f6 f6Var = this.a;
        if (f6Var.n || i10 == i11 || (c6Var = f6Var.y) == null || (textSelectionHelper = ((f3) c6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // ii.h1
    public final void w(CharSequence charSequence) {
        c6 c6Var = this.a.y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            f3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ii.h1
    public final void r() {
    }
}
