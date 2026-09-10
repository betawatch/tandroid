package hi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l5 implements j1 {
    public final /* synthetic */ u5 a;
    public final /* synthetic */ r5 b;

    public l5(r5 r5Var, u5 u5Var) {
        this.b = r5Var;
        this.a = u5Var;
    }

    @Override // hi.j1
    public final void D(CharSequence charSequence) {
        f3 f3Var = this.b.E;
        if (f3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        f3Var.a.s4(charSequence.toString());
    }

    @Override // hi.j1
    public final /* synthetic */ boolean F(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public final void G(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            l6.d(pagetablecell, editable);
        }
        r5 r5Var = this.b;
        r5Var.v.requestLayout();
        f3 f3Var = r5Var.E;
        if (f3Var == null || r5Var.a == null) {
            return;
        }
        f3Var.a();
    }

    @Override // hi.j1
    public final boolean H(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // hi.j1
    public final /* synthetic */ boolean P(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public final void b(k1 k1Var) {
        f3 f3Var = this.b.E;
        if (f3Var != null) {
            z3 z3Var = f3Var.a;
            z3.L1(z3Var, k1Var);
            z3Var.h3.C(k1Var, true);
        }
    }

    @Override // hi.j1
    public final boolean f() {
        r5 r5Var = this.b;
        f3 f3Var = r5Var.E;
        if (f3Var == null || r5Var.a == null) {
            return false;
        }
        return f3Var.a.R4();
    }

    @Override // hi.j1
    public final void h(int i10, int i11) {
        k2 k2Var;
        r5 r5Var = this.b;
        f3 f3Var = r5Var.E;
        if (f3Var == null || r5Var.a == null || (k2Var = f3Var.a.J3) == null) {
            return;
        }
        k2Var.f(i10, i11);
    }

    @Override // hi.j1
    public final void r(final k1 k1Var, final int i10, final int i11) {
        f3 f3Var;
        final s9 textSelectionHelper;
        final int k10;
        r5 r5Var = this.b;
        if (r5Var.G || i10 == i11 || (f3Var = r5Var.E) == null || (textSelectionHelper = f3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == r5Var) && (k10 = r5Var.k(this.a.b)) >= 0) {
            r5Var.post(new Runnable() { // from class: hi.k5
                @Override // java.lang.Runnable
                public final void run() {
                    r5 r5Var2 = l5.this.b;
                    k1 k1Var2 = k1Var;
                    int length = k1Var2.length();
                    int i12 = i11;
                    if (length < i12 || k1Var2.getSelectionStart() == k1Var2.getSelectionEnd() || !textSelectionHelper.k0(r5Var2, k10, i10, i12)) {
                        return;
                    }
                    r5Var2.G = true;
                    k1Var2.setSelection(i12);
                    r5Var2.G = false;
                }
            });
        }
    }

    @Override // hi.j1
    public final /* synthetic */ void t() {
    }

    @Override // hi.j1
    public final /* synthetic */ void x(k1 k1Var) {
    }
}
