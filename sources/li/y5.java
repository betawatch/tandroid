package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class y5 implements f1 {
    public final /* synthetic */ d6 a;

    public y5(d6 d6Var) {
        this.a = d6Var;
    }

    @Override // li.f1
    public final void E(g1 g1Var, int i10, int i11) {
        a6 a6Var;
        s9 textSelectionHelper;
        d6 d6Var = this.a;
        if (d6Var.n || i10 == i11 || (a6Var = d6Var.y) == null || (textSelectionHelper = ((d3) a6Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        g1Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 6));
    }

    @Override // li.f1
    public final void T(CharSequence charSequence) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            d3 d3Var = (d3) a6Var;
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            d3Var.a.z4(charSequence.toString());
        }
    }

    @Override // li.f1
    public final void Y(Editable editable) {
        d6 d6Var = this.a;
        if (d6Var.x == null) {
            return;
        }
        d6Var.v();
        a6 a6Var = d6Var.y;
        if (a6Var != null) {
            v3 v3Var = ((d3) a6Var).a;
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.p3.onContentChanged();
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
                if (d6Var.g(measuredWidth, d6Var.getPaddingBottom() + d6Var.h.getMeasuredHeight() + d6Var.b.getMeasuredHeight() + d6Var.getPaddingTop()) == d6Var.O) {
                    return;
                }
            }
            d6Var.requestLayout();
        }
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        a6 a6Var = this.a.y;
        if (a6Var != null) {
            v3 v3Var = ((d3) a6Var).a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    @Override // li.f1
    public final boolean e() {
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null) {
            return false;
        }
        return ((d3) a6Var).a.Y4();
    }

    @Override // li.f1
    public final /* synthetic */ boolean f0(boolean z10) {
        return false;
    }

    @Override // li.f1
    public final /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final void k(int i10, int i11) {
        f2 f2Var;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || d6Var.x == null || (f2Var = ((d3) a6Var).a.R3) == null) {
            return;
        }
        f2Var.f(i10, i11);
    }

    @Override // li.f1
    public final boolean o(g1 g1Var) {
        d6 d6Var = this.a;
        d6Var.f.r();
        g1 g1Var2 = d6Var.f;
        g1Var2.setSelection(g1Var2.length());
        return true;
    }

    @Override // li.f1
    public final void t(g1 g1Var) {
        a aVar;
        d6 d6Var = this.a;
        a6 a6Var = d6Var.y;
        if (a6Var == null || (aVar = d6Var.x) == null) {
            return;
        }
        v3.V1(((d3) a6Var).a, aVar);
    }

    @Override // li.f1
    public final void R() {
    }
}
