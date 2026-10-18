package ki;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class q0 implements g1 {
    public final /* synthetic */ t0 a;

    public q0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // ki.g1
    public final void D(CharSequence charSequence) {
        d3 d3Var = this.a.h;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    @Override // ki.g1
    public final void M(Editable editable) {
        t0 t0Var = this.a;
        a aVar = t0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = e6.f(editable);
            }
        }
        d3 d3Var = t0Var.h;
        if (d3Var == null || t0Var.f == null) {
            return;
        }
        w3 w3Var = d3Var.a;
        h2 h2Var = w3Var.H3;
        if (h2Var != null) {
            h2Var.g();
        }
        w3Var.f3.onContentChanged();
    }

    @Override // ki.g1
    public final /* synthetic */ boolean Q(boolean z10) {
        return false;
    }

    @Override // ki.g1
    public final /* synthetic */ boolean R(h1 h1Var) {
        return false;
    }

    @Override // ki.g1
    public final void V(h1 h1Var, int i10, int i11) {
        d3 d3Var;
        n9 textSelectionHelper;
        t0 t0Var = this.a;
        if (t0Var.n || i10 == i11 || (d3Var = t0Var.h) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == t0Var) {
            return;
        }
        t0Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ki.g1
    public final void c(h1 h1Var) {
        d3 d3Var = this.a.h;
        if (d3Var != null) {
            w3 w3Var = d3Var.a;
            w3.N1(w3Var, h1Var);
            w3Var.f3.n(h1Var, true);
        }
    }

    @Override // ki.g1
    public final boolean f() {
        t0 t0Var = this.a;
        d3 d3Var = t0Var.h;
        if (d3Var == null || t0Var.f == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // ki.g1
    public final void l(h1 h1Var) {
        a aVar;
        w3 w3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.a;
        d3 d3Var = t0Var.h;
        if (d3Var == null || (aVar = t0Var.f) == null || (indexOf = (arrayList = (w3Var = d3Var.a).j3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            w3Var.W2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || w3.y3((a) arrayList.get(i10))) {
            return;
        }
        w3Var.post(new o2(w3Var, (a) arrayList.get(i10), 24));
    }

    @Override // ki.g1
    public final void m() {
        a aVar;
        t0 t0Var = this.a;
        d3 d3Var = t0Var.h;
        if (d3Var == null || (aVar = t0Var.f) == null) {
            return;
        }
        d3Var.a(aVar);
    }

    @Override // ki.g1
    public final boolean w(h1 h1Var) {
        t0 t0Var = this.a;
        if (t0Var.h == null || t0Var.f == null || h1Var.length() != 0) {
            return false;
        }
        t0Var.h.a(t0Var.f);
        return true;
    }

    @Override // ki.g1
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
