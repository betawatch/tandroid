package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class r0 implements h1 {
    public final /* synthetic */ u0 a;

    public r0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        d3 d3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.a;
        if (u0Var.n || i10 == i11 || (d3Var = u0Var.h) == null || (textSelectionHelper = d3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == u0Var) {
            return;
        }
        u0Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        d3 d3Var = this.a.h;
        if (d3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        d3Var.a.u4(charSequence.toString());
    }

    @Override // ii.h1
    public final void U(Editable editable) {
        u0 u0Var = this.a;
        a aVar = u0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(editable);
            }
        }
        d3 d3Var = u0Var.h;
        if (d3Var == null || u0Var.f == null) {
            return;
        }
        w3 w3Var = d3Var.a;
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.g();
        }
        w3Var.h3.onContentChanged();
    }

    @Override // ii.h1
    public final /* synthetic */ boolean X(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        d3 d3Var = this.a.h;
        if (d3Var != null) {
            w3 w3Var = d3Var.a;
            w3.N1(w3Var, i1Var);
            w3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        u0 u0Var = this.a;
        d3 d3Var = u0Var.h;
        if (d3Var == null || u0Var.f == null) {
            return false;
        }
        return d3Var.a.T4();
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        a aVar;
        w3 w3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.a;
        d3 d3Var = u0Var.h;
        if (d3Var == null || (aVar = u0Var.f) == null || (indexOf = (arrayList = (w3Var = d3Var.a).l3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            w3Var.Y2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || w3.y3((a) arrayList.get(i10))) {
            return;
        }
        w3Var.post(new o2(w3Var, (a) arrayList.get(i10), 24));
    }

    @Override // ii.h1
    public final /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    @Override // ii.h1
    public final boolean t(i1 i1Var) {
        u0 u0Var = this.a;
        if (u0Var.h == null || u0Var.f == null || i1Var.length() != 0) {
            return false;
        }
        u0Var.h.a(u0Var.f);
        return true;
    }

    @Override // ii.h1
    public final void x() {
        a aVar;
        u0 u0Var = this.a;
        d3 d3Var = u0Var.h;
        if (d3Var == null || (aVar = u0Var.f) == null) {
            return;
        }
        d3Var.a(aVar);
    }

    @Override // ii.h1
    public final /* synthetic */ void j(int i10, int i11) {
    }
}
