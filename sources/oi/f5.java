package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f5 implements d1 {
    public final /* synthetic */ o5 a;
    public final /* synthetic */ l5 b;

    public f5(l5 l5Var, o5 o5Var) {
        this.b = l5Var;
        this.a = o5Var;
    }

    @Override // oi.d1
    public final void A(int i7, int i10) {
        e2 e2Var;
        l5 l5Var = this.b;
        a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null || (e2Var = a3Var.a.R3) == null) {
            return;
        }
        e2Var.f(i7, i10);
    }

    @Override // oi.d1
    public final boolean E1(boolean z10) {
        return this.b.u(this.a, z10);
    }

    @Override // oi.d1
    public final /* synthetic */ boolean J(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void b1(CharSequence charSequence) {
        a3 a3Var = this.b.F;
        if (a3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        a3Var.a.w4(charSequence.toString());
    }

    @Override // oi.d1
    public final /* synthetic */ boolean d2(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void e(e1 e1Var) {
        a3 a3Var = this.b.F;
        if (a3Var != null) {
            s3 s3Var = a3Var.a;
            s3.Q1(s3Var, e1Var);
            s3Var.p3.k(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean o() {
        l5 l5Var = this.b;
        a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null) {
            return false;
        }
        return a3Var.a.V4();
    }

    @Override // oi.d1
    public final void r1(final e1 e1Var, final int i7, final int i10) {
        a3 a3Var;
        final i9 textSelectionHelper;
        final int l10;
        l5 l5Var = this.b;
        if (l5Var.H || i7 == i10 || (a3Var = l5Var.F) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == l5Var) && (l10 = l5Var.l(this.a.b)) >= 0) {
            l5Var.post(new Runnable() { // from class: oi.e5
                @Override // java.lang.Runnable
                public final void run() {
                    l5 l5Var2 = f5.this.b;
                    e1 e1Var2 = e1Var;
                    int length = e1Var2.length();
                    int i11 = i10;
                    if (length < i11 || e1Var2.getSelectionStart() == e1Var2.getSelectionEnd() || !textSelectionHelper.j0(l5Var2, l10, i7, i11)) {
                        return;
                    }
                    l5Var2.H = true;
                    e1Var2.setSelection(i11);
                    l5Var2.H = false;
                }
            });
        }
    }

    @Override // oi.d1
    public final void s1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            d6.d(pagetablecell, editable);
        }
        l5 l5Var = this.b;
        l5Var.w.requestLayout();
        a3 a3Var = l5Var.F;
        if (a3Var == null || l5Var.a == null) {
            return;
        }
        a3Var.a();
    }

    @Override // oi.d1
    public final /* synthetic */ void E0() {
    }

    @Override // oi.d1
    public final /* synthetic */ void x0(e1 e1Var) {
    }
}
