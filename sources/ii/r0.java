package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class r0 implements h1 {
    public final /* synthetic */ u0 a;

    public r0(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // ii.h1
    public final void B(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.a;
        if (u0Var.n || i10 == i11 || (e3Var = u0Var.h) == null || (textSelectionHelper = e3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == u0Var) {
            return;
        }
        u0Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ii.h1
    public final void K(CharSequence charSequence) {
        e3 e3Var = this.a.h;
        if (e3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        e3Var.a.t4(charSequence.toString());
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
                ((TL_iv.pageBlockDetails) pageBlock).title = g6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var == null || u0Var.f == null) {
            return;
        }
        x3 x3Var = e3Var.a;
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.g();
        }
        x3Var.h3.onContentChanged();
    }

    @Override // ii.h1
    public final /* synthetic */ boolean X(boolean z10) {
        return false;
    }

    @Override // ii.h1
    public final void c(i1 i1Var) {
        e3 e3Var = this.a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.a;
            x3.M1(x3Var, i1Var);
            x3Var.h3.t(i1Var, true);
        }
    }

    @Override // ii.h1
    public final boolean f() {
        u0 u0Var = this.a;
        e3 e3Var = u0Var.h;
        if (e3Var == null || u0Var.f == null) {
            return false;
        }
        return e3Var.a.S4();
    }

    @Override // ii.h1
    public final void m(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.a;
        e3 e3Var = u0Var.h;
        if (e3Var == null || (aVar = u0Var.f) == null || (indexOf = (arrayList = (x3Var = e3Var.a).l3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            x3Var.Y2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || x3.x3((a) arrayList.get(i10))) {
            return;
        }
        x3Var.post(new p2(x3Var, (a) arrayList.get(i10), 24));
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
        e3 e3Var = u0Var.h;
        if (e3Var == null || (aVar = u0Var.f) == null) {
            return;
        }
        e3Var.a(aVar);
    }

    @Override // ii.h1
    public final /* synthetic */ void j(int i10, int i11) {
    }
}
