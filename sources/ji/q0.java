package ji;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class q0 implements g1 {
    public final /* synthetic */ t0 a;

    public q0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // ji.g1
    public final void C(Editable editable) {
        t0 t0Var = this.a;
        a aVar = t0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = k6.f(editable);
            }
        }
        e3 e3Var = t0Var.h;
        if (e3Var == null || t0Var.f == null) {
            return;
        }
        x3 x3Var = e3Var.a;
        h2 h2Var = x3Var.H3;
        if (h2Var != null) {
            h2Var.g();
        }
        x3Var.f3.onContentChanged();
    }

    @Override // ji.g1
    public final /* synthetic */ boolean E(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        e3 e3Var = this.a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.a;
            x3.N1(x3Var, h1Var);
            x3Var.f3.V(h1Var, true);
        }
    }

    @Override // ji.g1
    public final boolean d() {
        t0 t0Var = this.a;
        e3 e3Var = t0Var.h;
        if (e3Var == null || t0Var.f == null) {
            return false;
        }
        return e3Var.a.T4();
    }

    @Override // ji.g1
    public final boolean e(h1 h1Var) {
        t0 t0Var = this.a;
        if (t0Var.h == null || t0Var.f == null || h1Var.length() != 0) {
            return false;
        }
        t0Var.h.a(t0Var.f);
        return true;
    }

    @Override // ji.g1
    public final /* synthetic */ boolean m(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void q(h1 h1Var, int i10, int i11) {
        e3 e3Var;
        o9 textSelectionHelper;
        t0 t0Var = this.a;
        if (t0Var.n || i10 == i11 || (e3Var = t0Var.h) == null || (textSelectionHelper = e3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == t0Var) {
            return;
        }
        t0Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ji.g1
    public final void r() {
        a aVar;
        t0 t0Var = this.a;
        e3 e3Var = t0Var.h;
        if (e3Var == null || (aVar = t0Var.f) == null) {
            return;
        }
        e3Var.a(aVar);
    }

    @Override // ji.g1
    public final void y(CharSequence charSequence) {
        e3 e3Var = this.a.h;
        if (e3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        e3Var.a.u4(charSequence.toString());
    }

    @Override // ji.g1
    public final void z(h1 h1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.a;
        e3 e3Var = t0Var.h;
        if (e3Var == null || (aVar = t0Var.f) == null || (indexOf = (arrayList = (x3Var = e3Var.a).j3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            x3Var.W2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || x3.y3((a) arrayList.get(i10))) {
            return;
        }
        x3Var.post(new o2(x3Var, (a) arrayList.get(i10), 24));
    }

    @Override // ji.g1
    public final /* synthetic */ void f(int i10, int i11) {
    }
}
