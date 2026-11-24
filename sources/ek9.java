// default package

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ek9 implements me9 {
    public final /* synthetic */ nk9 a;
    public final /* synthetic */ kk9 b;

    public ek9(kk9 kk9Var, nk9 nk9Var) {
        this.b = kk9Var;
        this.a = nk9Var;
    }

    @Override // me9
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    @Override // me9
    public final void M(CharSequence charSequence) {
        kg9 kg9Var = this.b.F;
        if (kg9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        kg9Var.a.u4(charSequence.toString());
    }

    @Override // me9
    public final void S(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            fhb.d(pagetablecell, editable);
        }
        kk9 kk9Var = this.b;
        kk9Var.w.requestLayout();
        kg9 kg9Var = kk9Var.F;
        if (kg9Var == null || kk9Var.a == null) {
            return;
        }
        kg9Var.a();
    }

    @Override // me9
    public final boolean Z(boolean z) {
        return this.b.u(this.a, z);
    }

    @Override // me9
    public final void d(ne9 ne9Var) {
        kg9 kg9Var = this.b.F;
        if (kg9Var != null) {
            ch9 ch9Var = kg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override // me9
    public final boolean i() {
        kk9 kk9Var = this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var == null || kk9Var.a == null) {
            return false;
        }
        return kg9Var.a.V4();
    }

    @Override // me9
    public final void k(int i, int i2) {
        of9 of9Var;
        kk9 kk9Var = this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var == null || kk9Var.a == null || (of9Var = kg9Var.a.R3) == null) {
            return;
        }
        of9Var.f(i, i2);
    }

    @Override // me9
    public final void r(final ne9 ne9Var, final int i, final int i2) {
        kg9 kg9Var;
        final gkb textSelectionHelper;
        final int m;
        kk9 kk9Var = this.b;
        if (kk9Var.H || i == i2 || (kg9Var = kk9Var.F) == null || (textSelectionHelper = kg9Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (!(textSelectionHelper.w() && textSelectionHelper.W == kk9Var) && (m = kk9Var.m(this.a.b)) >= 0) {
            kk9Var.post(new Runnable() { // from class: dk9
                @Override // java.lang.Runnable
                public final void run() {
                    kk9 kk9Var2 = ek9.this.b;
                    ne9 ne9Var2 = ne9Var;
                    int length = ne9Var2.length();
                    int i3 = i2;
                    if (length < i3 || ne9Var2.getSelectionStart() == ne9Var2.getSelectionEnd() || !textSelectionHelper.i0(kk9Var2, m, i, i3)) {
                        return;
                    }
                    kk9Var2.H = true;
                    ne9Var2.setSelection(i3);
                    kk9Var2.H = false;
                }
            });
        }
    }

    @Override // me9
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override // me9
    public final void H() {
    }

    @Override // me9
    public final void W(ne9 ne9Var) {
    }
}
