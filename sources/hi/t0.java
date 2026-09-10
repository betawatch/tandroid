package hi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t0 implements j1 {
    public final /* synthetic */ w0 a;

    public t0(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // hi.j1
    public final void D(CharSequence charSequence) {
        g3 g3Var = this.a.h;
        if (g3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        g3Var.a.s4(charSequence.toString());
    }

    @Override // hi.j1
    public final /* synthetic */ boolean F(k1 k1Var) {
        return false;
    }

    @Override // hi.j1
    public final void G(Editable editable) {
        w0 w0Var = this.a;
        a aVar = w0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = w0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(editable);
            }
        }
        g3 g3Var = w0Var.h;
        if (g3Var == null || w0Var.f == null) {
            return;
        }
        z3 z3Var = g3Var.a;
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.g();
        }
        z3Var.h3.onContentChanged();
    }

    @Override // hi.j1
    public final /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // hi.j1
    public final boolean P(k1 k1Var) {
        w0 w0Var = this.a;
        if (w0Var.h == null || w0Var.f == null || k1Var.length() != 0) {
            return false;
        }
        w0Var.h.a(w0Var.f);
        return true;
    }

    @Override // hi.j1
    public final void b(k1 k1Var) {
        g3 g3Var = this.a.h;
        if (g3Var != null) {
            z3 z3Var = g3Var.a;
            z3.L1(z3Var, k1Var);
            z3Var.h3.C(k1Var, true);
        }
    }

    @Override // hi.j1
    public final boolean f() {
        w0 w0Var = this.a;
        g3 g3Var = w0Var.h;
        if (g3Var == null || w0Var.f == null) {
            return false;
        }
        return g3Var.a.R4();
    }

    @Override // hi.j1
    public final void r(k1 k1Var, int i10, int i11) {
        g3 g3Var;
        s9 textSelectionHelper;
        w0 w0Var = this.a;
        if (w0Var.n || i10 == i11 || (g3Var = w0Var.h) == null || (textSelectionHelper = g3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == w0Var) {
            return;
        }
        w0Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // hi.j1
    public final void t() {
        a aVar;
        w0 w0Var = this.a;
        g3 g3Var = w0Var.h;
        if (g3Var == null || (aVar = w0Var.f) == null) {
            return;
        }
        g3Var.a(aVar);
    }

    @Override // hi.j1
    public final void x(k1 k1Var) {
        a aVar;
        z3 z3Var;
        ArrayList arrayList;
        int indexOf;
        w0 w0Var = this.a;
        g3 g3Var = w0Var.h;
        if (g3Var == null || (aVar = w0Var.f) == null || (indexOf = (arrayList = (z3Var = g3Var.a).l3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            z3Var.Y2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || z3.w3((a) arrayList.get(i10))) {
            return;
        }
        z3Var.post(new r2(z3Var, (a) arrayList.get(i10), 24));
    }

    @Override // hi.j1
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
