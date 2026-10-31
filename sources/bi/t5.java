package bi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class t5 implements m1 {
    public final /* synthetic */ c6 a;
    public final /* synthetic */ z5 b;

    public t5(z5 z5Var, c6 c6Var) {
        this.b = z5Var;
        this.a = c6Var;
    }

    @Override // bi.m1
    public final void B(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            w6.d(pagetablecell, editable);
        }
        z5 z5Var = this.b;
        z5Var.w.requestLayout();
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null) {
            return;
        }
        k3Var.a();
    }

    @Override // bi.m1
    public final boolean H(boolean z10) {
        return this.b.u(this.a, z10);
    }

    @Override // bi.m1
    public final /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    @Override // bi.m1
    public final void b(n1 n1Var) {
        k3 k3Var = this.b.E;
        if (k3Var != null) {
            d4 d4Var = k3Var.a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    @Override // bi.m1
    public final boolean f() {
        z5 z5Var = this.b;
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null) {
            return false;
        }
        return k3Var.a.V4();
    }

    @Override // bi.m1
    public final void h(int i10, int i11) {
        o2 o2Var;
        z5 z5Var = this.b;
        k3 k3Var = z5Var.E;
        if (k3Var == null || z5Var.a == null || (o2Var = k3Var.a.Q3) == null) {
            return;
        }
        o2Var.f(i10, i11);
    }

    @Override // bi.m1
    public final void i(final n1 n1Var, final int i10, final int i11) {
        k3 k3Var;
        final k9 textSelectionHelper;
        final int l4;
        z5 z5Var = this.b;
        if (z5Var.G || i10 == i11 || (k3Var = z5Var.E) == null || (textSelectionHelper = k3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == z5Var) && (l4 = z5Var.l(this.a.b)) >= 0) {
            z5Var.post(new Runnable() { // from class: bi.s5
                @Override // java.lang.Runnable
                public final void run() {
                    z5 z5Var2 = t5.this.b;
                    n1 n1Var2 = n1Var;
                    int length = n1Var2.length();
                    int i12 = i11;
                    if (length < i12 || n1Var2.getSelectionStart() == n1Var2.getSelectionEnd() || !textSelectionHelper.j0(z5Var2, l4, i10, i12)) {
                        return;
                    }
                    z5Var2.G = true;
                    n1Var2.setSelection(i12);
                    z5Var2.G = false;
                }
            });
        }
    }

    @Override // bi.m1
    public final void w(CharSequence charSequence) {
        k3 k3Var = this.b.E;
        if (k3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        k3Var.a.w4(charSequence.toString());
    }

    @Override // bi.m1
    public final /* synthetic */ boolean x(n1 n1Var) {
        return false;
    }

    @Override // bi.m1
    public final /* synthetic */ void r() {
    }

    @Override // bi.m1
    public final /* synthetic */ void e(n1 n1Var) {
    }
}
