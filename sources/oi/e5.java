package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class e5 implements d1 {
    public final /* synthetic */ n5 a;
    public final /* synthetic */ k5 b;

    public e5(k5 k5Var, n5 n5Var) {
        this.b = k5Var;
        this.a = n5Var;
    }

    @Override // oi.d1
    public final void I(CharSequence charSequence) {
        y2 y2Var = this.b.F;
        if (y2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        y2Var.a.w4(charSequence.toString());
    }

    @Override // oi.d1
    public final void Z(final e1 e1Var, final int i7, final int i10) {
        y2 y2Var;
        final h9 textSelectionHelper;
        final int l10;
        k5 k5Var = this.b;
        if (k5Var.H || i7 == i10 || (y2Var = k5Var.F) == null || (textSelectionHelper = y2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == k5Var) && (l10 = k5Var.l(this.a.b)) >= 0) {
            k5Var.post(new Runnable() { // from class: oi.d5
                @Override // java.lang.Runnable
                public final void run() {
                    k5 k5Var2 = e5.this.b;
                    e1 e1Var2 = e1Var;
                    int length = e1Var2.length();
                    int i11 = i10;
                    if (length < i11 || e1Var2.getSelectionStart() == e1Var2.getSelectionEnd() || !textSelectionHelper.j0(k5Var2, l10, i7, i11)) {
                        return;
                    }
                    k5Var2.H = true;
                    e1Var2.setSelection(i11);
                    k5Var2.H = false;
                }
            });
        }
    }

    @Override // oi.d1
    public final void b0(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            c6.d(pagetablecell, editable);
        }
        k5 k5Var = this.b;
        k5Var.w.requestLayout();
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null) {
            return;
        }
        y2Var.a();
    }

    @Override // oi.d1
    public final void d(e1 e1Var) {
        y2 y2Var = this.b.F;
        if (y2Var != null) {
            q3 q3Var = y2Var.a;
            q3.Q1(q3Var, e1Var);
            q3Var.p3.b(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean g() {
        k5 k5Var = this.b;
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null) {
            return false;
        }
        return y2Var.a.V4();
    }

    @Override // oi.d1
    public final boolean h0(boolean z10) {
        return this.b.u(this.a, z10);
    }

    @Override // oi.d1
    public final void m(int i7, int i10) {
        d2 d2Var;
        k5 k5Var = this.b;
        y2 y2Var = k5Var.F;
        if (y2Var == null || k5Var.a == null || (d2Var = y2Var.a.R3) == null) {
            return;
        }
        d2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final /* synthetic */ boolean o(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final /* synthetic */ boolean q0(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final /* synthetic */ void B() {
    }

    @Override // oi.d1
    public final /* synthetic */ void z(e1 e1Var) {
    }
}
