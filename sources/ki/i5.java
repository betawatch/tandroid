package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class i5 implements g1 {
    public final /* synthetic */ r5 a;
    public final /* synthetic */ o5 b;

    public i5(o5 o5Var, r5 r5Var) {
        this.b = o5Var;
        this.a = r5Var;
    }

    @Override // ki.g1
    public final void G(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            g6.d(pagetablecell, editable);
        }
        o5 o5Var = this.b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return;
        }
        c3Var.a();
    }

    @Override // ki.g1
    public final boolean M(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ki.g1
    public final /* synthetic */ boolean P(h1 h1Var) {
        return false;
    }

    @Override // ki.g1
    public final void R(final h1 h1Var, final int i10, final int i11) {
        c3 c3Var;
        final n9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.b;
        if (o5Var.G || i10 == i11 || (c3Var = o5Var.E) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == o5Var) && (k10 = o5Var.k(this.a.b)) >= 0) {
            o5Var.post(new Runnable() { // from class: ki.h5
                @Override // java.lang.Runnable
                public final void run() {
                    o5 o5Var2 = i5.this.b;
                    h1 h1Var2 = h1Var;
                    int length = h1Var2.length();
                    int i12 = i11;
                    if (length < i12 || h1Var2.getSelectionStart() == h1Var2.getSelectionEnd() || !textSelectionHelper.j0(o5Var2, k10, i10, i12)) {
                        return;
                    }
                    o5Var2.G = true;
                    h1Var2.setSelection(i12);
                    o5Var2.G = false;
                }
            });
        }
    }

    @Override // ki.g1
    public final void c(h1 h1Var) {
        c3 c3Var = this.b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.a;
            w3.N1(w3Var, h1Var);
            w3Var.f3.o(h1Var, true);
        }
    }

    @Override // ki.g1
    public final boolean e() {
        o5 o5Var = this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return false;
        }
        return c3Var.a.T4();
    }

    @Override // ki.g1
    public final void f(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null || (h2Var = c3Var.a.H3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ki.g1
    public final /* synthetic */ boolean s(h1 h1Var) {
        return false;
    }

    @Override // ki.g1
    public final void x(CharSequence charSequence) {
        c3 c3Var = this.b.E;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.u4(charSequence.toString());
    }

    @Override // ki.g1
    public final /* synthetic */ void k(h1 h1Var) {
    }

    @Override // ki.g1
    public final /* synthetic */ void o() {
    }
}
