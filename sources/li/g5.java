package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g5 implements f1 {
    public final /* synthetic */ p5 a;
    public final /* synthetic */ m5 b;

    public g5(m5 m5Var, p5 p5Var) {
        this.b = m5Var;
        this.a = p5Var;
    }

    @Override // li.f1
    public final /* synthetic */ boolean E(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final void T0(CharSequence charSequence) {
        a3 a3Var = this.b.E;
        if (a3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        a3Var.a.w4(charSequence.toString());
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        a3 a3Var = this.b.E;
        if (a3Var != null) {
            t3 t3Var = a3Var.a;
            t3.Q1(t3Var, g1Var);
            t3Var.o3.r(g1Var, true);
        }
    }

    @Override // li.f1
    public final void f1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            e6.d(pagetablecell, editable);
        }
        m5 m5Var = this.b;
        m5Var.w.requestLayout();
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null) {
            return;
        }
        a3Var.a();
    }

    @Override // li.f1
    public final void l0(final g1 g1Var, final int i7, final int i10) {
        a3 a3Var;
        final i9 textSelectionHelper;
        final int l10;
        m5 m5Var = this.b;
        if (m5Var.G || i7 == i10 || (a3Var = m5Var.E) == null || (textSelectionHelper = a3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == m5Var) && (l10 = m5Var.l(this.a.b)) >= 0) {
            m5Var.post(new Runnable() { // from class: li.f5
                @Override // java.lang.Runnable
                public final void run() {
                    m5 m5Var2 = g5.this.b;
                    g1 g1Var2 = g1Var;
                    int length = g1Var2.length();
                    int i11 = i10;
                    if (length < i11 || g1Var2.getSelectionStart() == g1Var2.getSelectionEnd() || !textSelectionHelper.j0(m5Var2, l10, i7, i11)) {
                        return;
                    }
                    m5Var2.G = true;
                    g1Var2.setSelection(i11);
                    m5Var2.G = false;
                }
            });
        }
    }

    @Override // li.f1
    public final boolean l1(boolean z9) {
        return this.b.u(this.a, z9);
    }

    @Override // li.f1
    public final boolean m() {
        m5 m5Var = this.b;
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null) {
            return false;
        }
        return a3Var.a.V4();
    }

    @Override // li.f1
    public final /* synthetic */ boolean s(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final void w(int i7, int i10) {
        f2 f2Var;
        m5 m5Var = this.b;
        a3 a3Var = m5Var.E;
        if (a3Var == null || m5Var.a == null || (f2Var = a3Var.a.Q3) == null) {
            return;
        }
        f2Var.f(i7, i10);
    }

    @Override // li.f1
    public final /* synthetic */ void r0() {
    }

    @Override // li.f1
    public final /* synthetic */ void F(g1 g1Var) {
    }
}
