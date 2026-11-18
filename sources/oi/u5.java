package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u5 implements d1 {
    public final /* synthetic */ z5 a;

    public u5(z5 z5Var) {
        this.a = z5Var;
    }

    @Override // oi.d1
    public final void A(int i7, int i10) {
        e2 e2Var;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || z5Var.y == null || (e2Var = ((c3) w5Var).a.R3) == null) {
            return;
        }
        e2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // oi.d1
    public final boolean J(e1 e1Var) {
        z5 z5Var = this.a;
        z5Var.f.O();
        e1 e1Var2 = z5Var.f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override // oi.d1
    public final void b1(CharSequence charSequence) {
        w5 w5Var = this.a.E;
        if (w5Var != null) {
            c3 c3Var = (c3) w5Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            c3Var.a.w4(charSequence.toString());
        }
    }

    @Override // oi.d1
    public final /* synthetic */ boolean d2(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void e(e1 e1Var) {
        w5 w5Var = this.a.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).a;
            s3.Q1(s3Var, e1Var);
            s3Var.p3.k(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean o() {
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || z5Var.y == null) {
            return false;
        }
        return ((c3) w5Var).a.V4();
    }

    @Override // oi.d1
    public final void r1(e1 e1Var, int i7, int i10) {
        w5 w5Var;
        i9 textSelectionHelper;
        z5 z5Var = this.a;
        if (z5Var.n || i7 == i10 || (w5Var = z5Var.E) == null || (textSelectionHelper = ((c3) w5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 6));
    }

    @Override // oi.d1
    public final void s1(Editable editable) {
        z5 z5Var = this.a;
        if (z5Var.y == null) {
            return;
        }
        z5Var.w();
        w5 w5Var = z5Var.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).a;
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.p3.onContentChanged();
        }
        TL_iv.PageBlock pageBlock = z5Var.y.b;
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            z5Var.invalidate();
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            z5Var.invalidate();
            int measuredWidth = z5Var.getMeasuredWidth();
            if (measuredWidth > 0) {
                if (z5Var.g(measuredWidth, z5Var.getPaddingBottom() + z5Var.h.getMeasuredHeight() + z5Var.b.getMeasuredHeight() + z5Var.getPaddingTop()) == z5Var.P) {
                    return;
                }
            }
            z5Var.requestLayout();
        }
    }

    @Override // oi.d1
    public final void x0(e1 e1Var) {
        a aVar;
        z5 z5Var = this.a;
        w5 w5Var = z5Var.E;
        if (w5Var == null || (aVar = z5Var.y) == null) {
            return;
        }
        s3.T1(((c3) w5Var).a, aVar);
    }

    @Override // oi.d1
    public final void E0() {
    }
}
