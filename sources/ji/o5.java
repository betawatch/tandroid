package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class o5 implements g1 {
    public final /* synthetic */ x5 a;
    public final /* synthetic */ u5 b;

    public o5(u5 u5Var, x5 x5Var) {
        this.b = u5Var;
        this.a = x5Var;
    }

    @Override // ji.g1
    public final void C(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            m6.d(pagetablecell, editable);
        }
        u5 u5Var = this.b;
        u5Var.v.requestLayout();
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null) {
            return;
        }
        d3Var.a();
    }

    @Override // ji.g1
    public final boolean E(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        d3 d3Var = this.b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // ji.g1
    public final boolean d() {
        u5 u5Var = this.b;
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // ji.g1
    public final /* synthetic */ boolean e(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void f(int i10, int i11) {
        h2 h2Var;
        u5 u5Var = this.b;
        d3 d3Var = u5Var.E;
        if (d3Var == null || u5Var.a == null || (h2Var = d3Var.a.H3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ji.g1
    public final /* synthetic */ boolean m(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void q(final h1 h1Var, final int i10, final int i11) {
        d3 d3Var;
        final o9 textSelectionHelper;
        final int k10;
        u5 u5Var = this.b;
        if (u5Var.G || i10 == i11 || (d3Var = u5Var.E) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == u5Var) && (k10 = u5Var.k(this.a.b)) >= 0) {
            u5Var.post(new Runnable() { // from class: ji.n5
                @Override // java.lang.Runnable
                public final void run() {
                    u5 u5Var2 = o5.this.b;
                    h1 h1Var2 = h1Var;
                    int length = h1Var2.length();
                    int i12 = i11;
                    if (length < i12 || h1Var2.getSelectionStart() == h1Var2.getSelectionEnd() || !textSelectionHelper.j0(u5Var2, k10, i10, i12)) {
                        return;
                    }
                    u5Var2.G = true;
                    h1Var2.setSelection(i12);
                    u5Var2.G = false;
                }
            });
        }
    }

    @Override // ji.g1
    public final void y(CharSequence charSequence) {
        d3 d3Var = this.b.E;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    @Override // ji.g1
    public final /* synthetic */ void z(h1 h1Var) {
    }

    @Override // ji.g1
    public final /* synthetic */ void r() {
    }
}
