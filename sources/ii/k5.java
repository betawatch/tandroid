package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k5 implements h1 {
    public final /* synthetic */ t5 a;
    public final /* synthetic */ q5 b;

    public k5(q5 q5Var, t5 t5Var) {
        this.b = q5Var;
        this.a = t5Var;
    }

    @Override // ii.h1
    public final void E(CharSequence charSequence) {
        d3 d3Var = this.b.E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    @Override // ii.h1
    public final void L(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            j6.d(pagetablecell, editable);
        }
        q5 q5Var = this.b;
        q5Var.v.requestLayout();
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null) {
            return;
        }
        d3Var.a();
    }

    @Override // ii.h1
    public final boolean N(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        d3 d3Var = this.b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.N1(x3Var, i1Var);
            x3Var.f3.r(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        q5 q5Var = this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // ii.h1
    public final void i(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = this.b;
        d3 d3Var = q5Var.E;
        if (d3Var == null || q5Var.a == null || (i2Var = d3Var.a.H3) == null) {
            return;
        }
        i2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean m(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final /* synthetic */ boolean r(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final void x(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final o9 textSelectionHelper;
        final int k10;
        q5 q5Var = this.b;
        if (q5Var.G || i10 == i11 || (d3Var = q5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == q5Var) && (k10 = q5Var.k(this.a.b)) >= 0) {
            q5Var.post(new Runnable() { // from class: ii.j5
                @Override // java.lang.Runnable
                public final void run() {
                    q5 q5Var2 = k5.this.b;
                    i1 i1Var2 = i1Var;
                    int length = i1Var2.length();
                    int i12 = i11;
                    if (length < i12 || i1Var2.getSelectionStart() == i1Var2.getSelectionEnd() || !textSelectionHelper.j0(q5Var2, k10, i10, i12)) {
                        return;
                    }
                    q5Var2.G = true;
                    i1Var2.setSelection(i12);
                    q5Var2.G = false;
                }
            });
        }
    }

    @Override // ii.h1
    public final /* synthetic */ void k(i1 i1Var) {
    }

    @Override // ii.h1
    public final /* synthetic */ void t() {
    }
}
