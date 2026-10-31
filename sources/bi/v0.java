package bi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class v0 implements m1 {
    public final /* synthetic */ y0 a;

    public v0(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // bi.m1
    public final void B(Editable editable) {
        y0 y0Var = this.a;
        a aVar = y0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = y0Var.d.k2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = s6.f(editable);
            }
        }
        l3 l3Var = y0Var.h;
        if (l3Var == null || y0Var.f == null) {
            return;
        }
        d4 d4Var = l3Var.a;
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.g();
        }
        d4Var.o3.onContentChanged();
    }

    @Override // bi.m1
    public final /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // bi.m1
    public final /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    @Override // bi.m1
    public final void b(n1 n1Var) {
        l3 l3Var = this.a.h;
        if (l3Var != null) {
            d4 d4Var = l3Var.a;
            d4.P1(d4Var, n1Var);
            d4Var.o3.h(n1Var, true);
        }
    }

    @Override // bi.m1
    public final void e(n1 n1Var) {
        a aVar;
        d4 d4Var;
        ArrayList arrayList;
        int indexOf;
        y0 y0Var = this.a;
        l3 l3Var = y0Var.h;
        if (l3Var == null || (aVar = y0Var.f) == null || (indexOf = (arrayList = (d4Var = l3Var.a).s3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            d4Var.f3.O(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || d4.A3((a) arrayList.get(i10))) {
            return;
        }
        d4Var.post(new v2(d4Var, (a) arrayList.get(i10), 24));
    }

    @Override // bi.m1
    public final boolean f() {
        y0 y0Var = this.a;
        l3 l3Var = y0Var.h;
        if (l3Var == null || y0Var.f == null) {
            return false;
        }
        return l3Var.a.V4();
    }

    @Override // bi.m1
    public final void i(n1 n1Var, int i10, int i11) {
        l3 l3Var;
        k9 textSelectionHelper;
        y0 y0Var = this.a;
        if (y0Var.n || i10 == i11 || (l3Var = y0Var.h) == null || (textSelectionHelper = l3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == y0Var) {
            return;
        }
        y0Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 0));
    }

    @Override // bi.m1
    public final void r() {
        a aVar;
        y0 y0Var = this.a;
        l3 l3Var = y0Var.h;
        if (l3Var == null || (aVar = y0Var.f) == null) {
            return;
        }
        l3Var.a(aVar);
    }

    @Override // bi.m1
    public final void w(CharSequence charSequence) {
        l3 l3Var = this.a.h;
        if (l3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        l3Var.a.w4(charSequence.toString());
    }

    @Override // bi.m1
    public final boolean x(n1 n1Var) {
        y0 y0Var = this.a;
        if (y0Var.h == null || y0Var.f == null || n1Var.length() != 0) {
            return false;
        }
        y0Var.h.a(y0Var.f);
        return true;
    }

    @Override // bi.m1
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
