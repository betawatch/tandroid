package bi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class l6 implements m1 {
    public final /* synthetic */ q6 a;

    public l6(q6 q6Var) {
        this.a = q6Var;
    }

    @Override // bi.m1
    public final void B(Editable editable) {
        q6 q6Var = this.a;
        if (q6Var.y == null) {
            return;
        }
        q6Var.w();
        n6 n6Var = q6Var.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.o3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = q6Var.y.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            q6Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            q6Var.invalidate();
            int measuredWidth = q6Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (q6Var.g(measuredWidth, q6Var.getPaddingBottom() + q6Var.h.getMeasuredHeight() + q6Var.b.getMeasuredHeight() + q6Var.getPaddingTop()) == q6Var.O) {
                    return;
                }
            }
            q6Var.requestLayout();
        }
    }

    @Override // bi.m1
    public final /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // bi.m1
    public final /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    @Override // bi.m1
    public final void b(n1 n1Var) {
        n6 n6Var = this.a.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    @Override // bi.m1
    public final void e(n1 n1Var) {
        a aVar;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || (aVar = q6Var.y) == null) {
            return;
        }
        d4.S1(((m3) n6Var).a, aVar);
    }

    @Override // bi.m1
    public final boolean f() {
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || q6Var.y == null) {
            return false;
        }
        return ((m3) n6Var).a.V4();
    }

    @Override // bi.m1
    public final void h(int i10, int i11) {
        o2 o2Var;
        q6 q6Var = this.a;
        n6 n6Var = q6Var.D;
        if (n6Var == null || q6Var.y == null || (o2Var = ((m3) n6Var).a.Q3) == null) {
            return;
        }
        o2Var.f(i10, i11);
    }

    @Override // bi.m1
    public final void i(n1 n1Var, int i10, int i11) {
        n6 n6Var;
        k9 textSelectionHelper;
        q6 q6Var = this.a;
        if (q6Var.n || i10 == i11 || (n6Var = q6Var.D) == null || (textSelectionHelper = ((m3) n6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        n1Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 4));
    }

    @Override // bi.m1
    public final void w(CharSequence charSequence) {
        n6 n6Var = this.a.D;
        if (n6Var != null) {
            m3 m3Var = (m3) n6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            m3Var.a.w4(charSequence.toString());
        }
    }

    @Override // bi.m1
    public final boolean x(n1 n1Var) {
        q6 q6Var = this.a;
        q6Var.f.N();
        n1 n1Var2 = q6Var.f;
        n1Var2.setSelection(n1Var2.length());
        return true;
    }

    @Override // bi.m1
    public final void r() {
    }
}
