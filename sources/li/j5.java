package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j5 implements f1 {
    public final /* synthetic */ s5 a;
    public final /* synthetic */ p5 b;

    public j5(p5 p5Var, s5 s5Var) {
        this.b = p5Var;
        this.a = s5Var;
    }

    @Override // li.f1
    public final void E(final g1 g1Var, final int i10, final int i11) {
        b3 b3Var;
        final s9 textSelectionHelper;
        final int j10;
        p5 p5Var = this.b;
        if (p5Var.G || i10 == i11 || (b3Var = p5Var.E) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.x() && textSelectionHelper.W == p5Var) && (j10 = p5Var.j(this.a.b)) >= 0) {
            p5Var.post(new Runnable() { // from class: li.i5
                @Override // java.lang.Runnable
                public final void run() {
                    p5 p5Var2 = j5.this.b;
                    g1 g1Var2 = g1Var;
                    int length = g1Var2.length();
                    int i12 = i11;
                    if (length < i12 || g1Var2.getSelectionStart() == g1Var2.getSelectionEnd() || !textSelectionHelper.j0(p5Var2, j10, i10, i12)) {
                        return;
                    }
                    p5Var2.G = true;
                    g1Var2.setSelection(i12);
                    p5Var2.G = false;
                }
            });
        }
    }

    @Override // li.f1
    public final void T(CharSequence charSequence) {
        b3 b3Var = this.b.E;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.z4(charSequence.toString());
    }

    @Override // li.f1
    public final void Y(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        p5 p5Var = this.b;
        p5Var.v.requestLayout();
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null) {
            return;
        }
        b3Var.a();
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        b3 b3Var = this.b.E;
        if (b3Var != null) {
            v3 v3Var = b3Var.a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    @Override // li.f1
    public final boolean e() {
        p5 p5Var = this.b;
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null) {
            return false;
        }
        return b3Var.a.Y4();
    }

    @Override // li.f1
    public final boolean f0(boolean z10) {
        return this.b.r(this.a, z10);
    }

    @Override // li.f1
    public final /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final void k(int i10, int i11) {
        f2 f2Var;
        p5 p5Var = this.b;
        b3 b3Var = p5Var.E;
        if (b3Var == null || p5Var.a == null || (f2Var = b3Var.a.R3) == null) {
            return;
        }
        f2Var.f(i10, i11);
    }

    @Override // li.f1
    public final /* synthetic */ boolean o(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final /* synthetic */ void t(g1 g1Var) {
    }

    @Override // li.f1
    public final /* synthetic */ void R() {
    }
}
