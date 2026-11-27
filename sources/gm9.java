// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class gm9 implements cg9 {
    public final /* synthetic */ km9 a;

    public gm9(km9 km9Var) {
        this.a = km9Var;
    }

    @Override // cg9
    public final boolean F(dg9 dg9Var) {
        dg9 dg9Var2 = this.a.f;
        dg9Var2.O();
        dg9Var2.setSelection(dg9Var2.length());
        return true;
    }

    @Override // cg9
    public final void M(CharSequence charSequence) {
        hm9 hm9Var = this.a.E;
        if (hm9Var != null) {
            zh9 zh9Var = (zh9) hm9Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            zh9Var.a.v4(charSequence.toString());
        }
    }

    @Override // cg9
    public final void Q(Editable editable) {
        km9 km9Var = this.a;
        if (km9Var.y != null) {
            km9Var.v();
            hm9 hm9Var = km9Var.E;
            if (hm9Var != null) {
                pi9 pi9Var = ((zh9) hm9Var).a;
                ch9 ch9Var = pi9Var.R3;
                if (ch9Var != null) {
                    ch9Var.g();
                }
                pi9Var.p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = km9Var.y.b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                km9Var.invalidate();
                return;
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                km9Var.invalidate();
                int measuredWidth = km9Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (km9Var.e(measuredWidth, km9Var.getPaddingBottom() + km9Var.h.getMeasuredHeight() + km9Var.b.getMeasuredHeight() + km9Var.getPaddingTop()) == km9Var.P) {
                        return;
                    }
                }
                km9Var.requestLayout();
            }
        }
    }

    @Override // cg9
    public final void U(dg9 dg9Var) {
        mk0 mk0Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var == null || (mk0Var = km9Var.y) == null) {
            return;
        }
        ((zh9) hm9Var).a.U3(mk0Var);
    }

    @Override // cg9
    public final boolean W(boolean z) {
        return false;
    }

    @Override // cg9
    public final void e(dg9 dg9Var) {
        hm9 hm9Var = this.a.E;
        if (hm9Var != null) {
            pi9 pi9Var = ((zh9) hm9Var).a;
            pi9Var.j4(dg9Var);
            pi9Var.p3.j(dg9Var, true);
        }
    }

    @Override // cg9
    public final boolean i() {
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var == null || km9Var.y == null) {
            return false;
        }
        return ((zh9) hm9Var).a.W4();
    }

    @Override // cg9
    public final void l(int i, int i2) {
        ch9 ch9Var;
        km9 km9Var = this.a;
        hm9 hm9Var = km9Var.E;
        if (hm9Var == null || km9Var.y == null || (ch9Var = ((zh9) hm9Var).a.R3) == null) {
            return;
        }
        ch9Var.f(i, i2);
    }

    @Override // cg9
    public final void s(dg9 dg9Var, int i, int i2) {
        hm9 hm9Var;
        amb textSelectionHelper;
        km9 km9Var = this.a;
        if (km9Var.n || i == i2 || (hm9Var = km9Var.E) == null || (textSelectionHelper = ((zh9) hm9Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        dg9Var.post(new hz0(this, dg9Var, i2, textSelectionHelper, i, (byte) 7));
    }

    @Override // cg9
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    @Override // cg9
    public final void G() {
    }
}
