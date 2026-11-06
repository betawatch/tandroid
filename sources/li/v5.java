package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class v5 implements f1 {
    public final /* synthetic */ a6 a;

    public v5(a6 a6Var) {
        this.a = a6Var;
    }

    @Override // li.f1
    public final boolean E(g1 g1Var) {
        a6 a6Var = this.a;
        a6Var.f.N();
        g1 g1Var2 = a6Var.f;
        g1Var2.setSelection(g1Var2.length());
        return true;
    }

    @Override // li.f1
    public final void F(g1 g1Var) {
        a aVar;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || (aVar = a6Var.y) == null) {
            return;
        }
        t3.T1(((c3) x5Var).a, aVar);
    }

    @Override // li.f1
    public final void T0(CharSequence charSequence) {
        x5 x5Var = this.a.D;
        if (x5Var != null) {
            c3 c3Var = (c3) x5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            c3Var.a.w4(charSequence.toString());
        }
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        x5 x5Var = this.a.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).a;
            t3.Q1(t3Var, g1Var);
            t3Var.o3.r(g1Var, true);
        }
    }

    @Override // li.f1
    public final void f1(Editable editable) {
        a6 a6Var = this.a;
        if (a6Var.y == null) {
            return;
        }
        a6Var.w();
        x5 x5Var = a6Var.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).a;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.o3.onContentChanged();
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
                if (a6Var.g(measuredWidth, a6Var.getPaddingBottom() + a6Var.h.getMeasuredHeight() + a6Var.b.getMeasuredHeight() + a6Var.getPaddingTop()) == a6Var.O) {
                    return;
                }
            }
            a6Var.requestLayout();
        }
    }

    @Override // li.f1
    public final void l0(g1 g1Var, int i7, int i10) {
        x5 x5Var;
        i9 textSelectionHelper;
        a6 a6Var = this.a;
        if (a6Var.n || i7 == i10 || (x5Var = a6Var.D) == null || (textSelectionHelper = ((c3) x5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        g1Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 6));
    }

    @Override // li.f1
    public final /* synthetic */ boolean l1(boolean z9) {
        return false;
    }

    @Override // li.f1
    public final boolean m() {
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || a6Var.y == null) {
            return false;
        }
        return ((c3) x5Var).a.V4();
    }

    @Override // li.f1
    public final /* synthetic */ boolean s(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final void w(int i7, int i10) {
        f2 f2Var;
        a6 a6Var = this.a;
        x5 x5Var = a6Var.D;
        if (x5Var == null || a6Var.y == null || (f2Var = ((c3) x5Var).a.Q3) == null) {
            return;
        }
        f2Var.f(i7, i10);
    }

    @Override // li.f1
    public final void r0() {
    }
}
