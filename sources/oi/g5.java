package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g5 implements e1 {
    public final /* synthetic */ p5 a;
    public final /* synthetic */ m5 b;

    public g5(m5 m5Var, p5 p5Var) {
        this.b = m5Var;
        this.a = p5Var;
    }

    @Override // oi.e1
    public final void T(CharSequence charSequence) {
        b3 b3Var = this.b.F;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // oi.e1
    public final void d(f1 f1Var) {
        b3 b3Var = this.b.F;
        if (b3Var != null) {
            t3 t3Var = b3Var.a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.b(f1Var, true);
        }
    }

    @Override // oi.e1
    public final void e0(final f1 f1Var, final int i7, final int i10) {
        b3 b3Var;
        final i9 textSelectionHelper;
        final int l10;
        m5 m5Var = this.b;
        if (m5Var.H || i7 == i10 || (b3Var = m5Var.F) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == m5Var) && (l10 = m5Var.l(this.a.b)) >= 0) {
            m5Var.post(new Runnable() { // from class: oi.f5
                @Override // java.lang.Runnable
                public final void run() {
                    m5 m5Var2 = g5.this.b;
                    f1 f1Var2 = f1Var;
                    int length = f1Var2.length();
                    int i11 = i10;
                    if (length < i11 || f1Var2.getSelectionStart() == f1Var2.getSelectionEnd() || !textSelectionHelper.j0(m5Var2, l10, i7, i11)) {
                        return;
                    }
                    m5Var2.H = true;
                    f1Var2.setSelection(i11);
                    m5Var2.H = false;
                }
            });
        }
    }

    @Override // oi.e1
    public final void g0(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            e6.d(pagetablecell, editable);
        }
        m5 m5Var = this.b;
        m5Var.w.requestLayout();
        b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // oi.e1
    public final boolean i() {
        m5 m5Var = this.b;
        b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // oi.e1
    public final void m(int i7, int i10) {
        g2 g2Var;
        m5 m5Var = this.b;
        b3 b3Var = m5Var.F;
        if (b3Var == null || m5Var.a == null || (g2Var = b3Var.a.R3) == null) {
            return;
        }
        g2Var.f(i7, i10);
    }

    @Override // oi.e1
    public final boolean m0(boolean z10) {
        return this.b.u(this.a, z10);
    }

    @Override // oi.e1
    public final /* synthetic */ boolean o(f1 f1Var) {
        return false;
    }

    @Override // oi.e1
    public final /* synthetic */ boolean t0(f1 f1Var) {
        return false;
    }

    @Override // oi.e1
    public final /* synthetic */ void F() {
    }

    @Override // oi.e1
    public final /* synthetic */ void A(f1 f1Var) {
    }
}
