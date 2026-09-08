package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m5 implements g1 {
    public final /* synthetic */ v5 a;
    public final /* synthetic */ s5 b;

    public m5(s5 s5Var, v5 v5Var) {
        this.b = s5Var;
        this.a = v5Var;
    }

    @Override // ji.g1
    public final void N(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            k6.d(pagetablecell, editable);
        }
        s5 s5Var = this.b;
        s5Var.v.requestLayout();
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // ji.g1
    public final boolean R(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        b3 b3Var = this.b.E;
        if (b3Var != null) {
            v3 v3Var = b3Var.a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // ji.g1
    public final boolean e() {
        s5 s5Var = this.b;
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null) {
            return false;
        }
        return b3Var.a.R4();
    }

    @Override // ji.g1
    public final /* synthetic */ boolean h(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void i(int i10, int i11) {
        g2 g2Var;
        s5 s5Var = this.b;
        b3 b3Var = s5Var.E;
        if (b3Var == null || s5Var.a == null || (g2Var = b3Var.a.J3) == null) {
            return;
        }
        g2Var.f(i10, i11);
    }

    @Override // ji.g1
    public final /* synthetic */ boolean k(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void o(final h1 h1Var, final int i10, final int i11) {
        b3 b3Var;
        final q9 textSelectionHelper;
        final int k10;
        s5 s5Var = this.b;
        if (s5Var.G || i10 == i11 || (b3Var = s5Var.E) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == s5Var) && (k10 = s5Var.k(this.a.b)) >= 0) {
            s5Var.post(new Runnable() { // from class: ji.l5
                @Override // java.lang.Runnable
                public final void run() {
                    s5 s5Var2 = m5.this.b;
                    h1 h1Var2 = h1Var;
                    int length = h1Var2.length();
                    int i12 = i11;
                    if (length < i12 || h1Var2.getSelectionStart() == h1Var2.getSelectionEnd() || !textSelectionHelper.k0(s5Var2, k10, i10, i12)) {
                        return;
                    }
                    s5Var2.G = true;
                    h1Var2.setSelection(i12);
                    s5Var2.G = false;
                }
            });
        }
    }

    @Override // ji.g1
    public final void y(CharSequence charSequence) {
        b3 b3Var = this.b.E;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.s4(charSequence.toString());
    }

    @Override // ji.g1
    public final /* synthetic */ void r() {
    }

    @Override // ji.g1
    public final /* synthetic */ void C(h1 h1Var) {
    }
}
