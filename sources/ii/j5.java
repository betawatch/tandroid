package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class j5 implements h1 {
    public final /* synthetic */ s5 a;
    public final /* synthetic */ p5 b;

    public j5(p5 p5Var, s5 s5Var) {
        this.b = p5Var;
        this.a = s5Var;
    }

    @Override // ii.h1
    public final void B(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final q9 textSelectionHelper;
        final int k10;
        p5 p5Var = this.b;
        if (p5Var.G || i10 == i11 || (d3Var = p5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == p5Var) && (k10 = p5Var.k(this.a.b)) >= 0) {
            p5Var.post(new Runnable() { // from class: ii.i5
                @Override // java.lang.Runnable
                public final void run() {
                    p5 p5Var2 = j5.this.b;
                    i1 i1Var2 = i1Var;
                    int length = i1Var2.length();
                    int i12 = i11;
                    if (length < i12 || i1Var2.getSelectionStart() == i1Var2.getSelectionEnd() || !textSelectionHelper.k0(p5Var2, k10, i10, i12)) {
                        return;
                    }
                    p5Var2.G = true;
                    i1Var2.setSelection(i12);
                    p5Var2.G = false;
                }
            });
        }
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        d3 d3Var = this.b.E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.t4(charSequence.toString());
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            i6.d(pagetablecell, editable);
        }
        p5 p5Var = this.b;
        p5Var.v.requestLayout();
        d3 d3Var = p5Var.E;
        if (d3Var == null || p5Var.a == null) {
            return;
        }
        d3Var.a();
    }

    @Override // ii.h1
    public final boolean X(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        d3 d3Var = this.b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.M1(x3Var, i1Var);
            x3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        p5 p5Var = this.b;
        d3 d3Var = p5Var.E;
        if (d3Var == null || p5Var.a == null) {
            return false;
        }
        return d3Var.a.S4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        i2 i2Var;
        p5 p5Var = this.b;
        d3 d3Var = p5Var.E;
        if (d3Var == null || p5Var.a == null || (i2Var = d3Var.a.J3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final /* synthetic */ boolean t(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final /* synthetic */ void m(i1 i1Var) {
    }

    @Override // ii.h1
    public final /* synthetic */ void x() {
    }
}
