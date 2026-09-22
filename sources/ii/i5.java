package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i5 implements h1 {
    public final /* synthetic */ r5 a;
    public final /* synthetic */ o5 b;

    public i5(o5 o5Var, r5 r5Var) {
        this.b = o5Var;
        this.a = r5Var;
    }

    @Override // ii.h1
    public final void D(final i1 i1Var, final int i10, final int i11) {
        c3 c3Var;
        final q9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.b;
        if (o5Var.G || i10 == i11 || (c3Var = o5Var.E) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.y() && textSelectionHelper.W == o5Var) && (k10 = o5Var.k(this.a.b)) >= 0) {
            o5Var.post(new Runnable() { // from class: ii.h5
                @Override // java.lang.Runnable
                public final void run() {
                    o5 o5Var2 = i5.this.b;
                    i1 i1Var2 = i1Var;
                    int length = i1Var2.length();
                    int i12 = i11;
                    if (length < i12 || i1Var2.getSelectionStart() == i1Var2.getSelectionEnd() || !textSelectionHelper.k0(o5Var2, k10, i10, i12)) {
                        return;
                    }
                    o5Var2.G = true;
                    i1Var2.setSelection(i12);
                    o5Var2.G = false;
                }
            });
        }
    }

    @Override // ii.h1
    public final void M(CharSequence charSequence) {
        c3 c3Var = this.b.E;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.t4(charSequence.toString());
    }

    @Override // ii.h1
    public final void W(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        o5 o5Var = this.b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return;
        }
        c3Var.a();
    }

    @Override // ii.h1
    public final boolean b0(boolean z10) {
        return this.b.s(this.a, z10);
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        c3 c3Var = this.b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.a;
            w3.M1(w3Var, i1Var);
            w3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        o5 o5Var = this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null) {
            return false;
        }
        return c3Var.a.S4();
    }

    @Override // ii.h1
    public final void j(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.b;
        c3 c3Var = o5Var.E;
        if (c3Var == null || o5Var.a == null || (h2Var = c3Var.a.J3) == null) {
            return;
        }
        h2Var.f(i10, i11);
    }

    @Override // ii.h1
    public final /* synthetic */ boolean q(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final /* synthetic */ boolean t(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final /* synthetic */ void m(i1 i1Var) {
    }

    @Override // ii.h1
    public final /* synthetic */ void x() {
    }
}
