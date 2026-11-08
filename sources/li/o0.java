package li;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class o0 implements f1 {
    public final /* synthetic */ r0 a;

    public o0(r0 r0Var) {
        this.a = r0Var;
    }

    @Override // li.f1
    public final boolean E(g1 g1Var) {
        r0 r0Var = this.a;
        if (r0Var.h == null || r0Var.f == null || g1Var.length() != 0) {
            return false;
        }
        r0Var.h.a(r0Var.f);
        return true;
    }

    @Override // li.f1
    public final void F(g1 g1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.a;
        b3 b3Var = r0Var.h;
        if (b3Var == null || (aVar = r0Var.f) == null || (indexOf = (arrayList = (t3Var = b3Var.a).s3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            t3Var.f3.O(true);
        }
        int i7 = indexOf + 1;
        if (i7 >= arrayList.size() || ((a) arrayList.get(i7)).i || t3.A3((a) arrayList.get(i7))) {
            return;
        }
        t3Var.post(new m2(t3Var, (a) arrayList.get(i7), 24));
    }

    @Override // li.f1
    public final void T0(CharSequence charSequence) {
        b3 b3Var = this.a.h;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        b3 b3Var = this.a.h;
        if (b3Var != null) {
            t3 t3Var = b3Var.a;
            t3.Q1(t3Var, g1Var);
            t3Var.o3.r(g1Var, true);
        }
    }

    @Override // li.f1
    public final void f1(Editable editable) {
        r0 r0Var = this.a;
        a aVar = r0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = r0Var.d.k2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(editable);
            }
        }
        b3 b3Var = r0Var.h;
        if (b3Var == null || r0Var.f == null) {
            return;
        }
        t3 t3Var = b3Var.a;
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.g();
        }
        t3Var.o3.onContentChanged();
    }

    @Override // li.f1
    public final void l0(g1 g1Var, int i7, int i10) {
        b3 b3Var;
        i9 textSelectionHelper;
        r0 r0Var = this.a;
        if (r0Var.n || i7 == i10 || (b3Var = r0Var.h) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == r0Var) {
            return;
        }
        r0Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 2));
    }

    @Override // li.f1
    public final /* synthetic */ boolean l1(boolean z9) {
        return false;
    }

    @Override // li.f1
    public final boolean m() {
        r0 r0Var = this.a;
        b3 b3Var = r0Var.h;
        if (b3Var == null || r0Var.f == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // li.f1
    public final void r0() {
        a aVar;
        r0 r0Var = this.a;
        b3 b3Var = r0Var.h;
        if (b3Var == null || (aVar = r0Var.f) == null) {
            return;
        }
        b3Var.a(aVar);
    }

    @Override // li.f1
    public final /* synthetic */ boolean s(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final /* synthetic */ void w(int i7, int i10) {
    }
}
