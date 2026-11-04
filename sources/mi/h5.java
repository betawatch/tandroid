package mi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class h5 implements g1 {
    public final /* synthetic */ q5 a;
    public final /* synthetic */ n5 b;

    public h5(n5 n5Var, q5 q5Var) {
        this.b = n5Var;
        this.a = q5Var;
    }

    @Override // mi.g1
    public final void A(int i3, int i10) {
        g2 g2Var;
        n5 n5Var = this.b;
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null || (g2Var = b3Var.a.R3) == null) {
            return;
        }
        g2Var.f(i3, i10);
    }

    @Override // mi.g1
    public final void B1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            f6.d(pagetablecell, editable);
        }
        n5 n5Var = this.b;
        n5Var.w.requestLayout();
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // mi.g1
    public final /* synthetic */ boolean M0(h1 h1Var) {
        return false;
    }

    @Override // mi.g1
    public final boolean X1(boolean z10) {
        return this.b.u(this.a, z10);
    }

    @Override // mi.g1
    public final /* synthetic */ boolean c0(h1 h1Var) {
        return false;
    }

    @Override // mi.g1
    public final void f(h1 h1Var) {
        b3 b3Var = this.b.F;
        if (b3Var != null) {
            t3 t3Var = b3Var.a;
            t3.Q1(t3Var, h1Var);
            t3Var.p3.E(h1Var, true);
        }
    }

    @Override // mi.g1
    public final void g1(CharSequence charSequence) {
        b3 b3Var = this.b.F;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // mi.g1
    public final void l(final h1 h1Var, final int i3, final int i10) {
        b3 b3Var;
        final h9 textSelectionHelper;
        final int l10;
        n5 n5Var = this.b;
        if (n5Var.H || i3 == i10 || (b3Var = n5Var.F) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == n5Var) && (l10 = n5Var.l(this.a.b)) >= 0) {
            n5Var.post(new Runnable() { // from class: mi.g5
                @Override // java.lang.Runnable
                public final void run() {
                    n5 n5Var2 = h5.this.b;
                    h1 h1Var2 = h1Var;
                    int length = h1Var2.length();
                    int i11 = i10;
                    if (length < i11 || h1Var2.getSelectionStart() == h1Var2.getSelectionEnd() || !textSelectionHelper.j0(n5Var2, l10, i3, i11)) {
                        return;
                    }
                    n5Var2.H = true;
                    h1Var2.setSelection(i11);
                    n5Var2.H = false;
                }
            });
        }
    }

    @Override // mi.g1
    public final boolean m() {
        n5 n5Var = this.b;
        b3 b3Var = n5Var.F;
        if (b3Var == null || n5Var.a == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // mi.g1
    public final /* synthetic */ void w0() {
    }

    @Override // mi.g1
    public final /* synthetic */ void V0(h1 h1Var) {
    }
}
