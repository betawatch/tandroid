package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class n0 implements e1 {
    public final /* synthetic */ q0 a;

    public n0(q0 q0Var) {
        this.a = q0Var;
    }

    @Override // oi.e1
    public final void E0() {
        a aVar;
        q0 q0Var = this.a;
        c3 c3Var = q0Var.h;
        if (c3Var == null || (aVar = q0Var.f) == null) {
            return;
        }
        c3Var.a(aVar);
    }

    @Override // oi.e1
    public final /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // oi.e1
    public final boolean J(f1 f1Var) {
        q0 q0Var = this.a;
        if (q0Var.h == null || q0Var.f == null || f1Var.length() != 0) {
            return false;
        }
        q0Var.h.a(q0Var.f);
        return true;
    }

    @Override // oi.e1
    public final void b1(CharSequence charSequence) {
        c3 c3Var = this.a.h;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.w4(charSequence.toString());
    }

    @Override // oi.e1
    public final /* synthetic */ boolean d2(f1 f1Var) {
        return false;
    }

    @Override // oi.e1
    public final void e(f1 f1Var) {
        c3 c3Var = this.a.h;
        if (c3Var != null) {
            t3 t3Var = c3Var.a;
            t3.Q1(t3Var, f1Var);
            t3Var.p3.k(f1Var, true);
        }
    }

    @Override // oi.e1
    public final boolean o() {
        q0 q0Var = this.a;
        c3 c3Var = q0Var.h;
        if (c3Var == null || q0Var.f == null) {
            return false;
        }
        return c3Var.a.V4();
    }

    @Override // oi.e1
    public final void r1(f1 f1Var, int i7, int i10) {
        c3 c3Var;
        j9 textSelectionHelper;
        q0 q0Var = this.a;
        if (q0Var.n || i7 == i10 || (c3Var = q0Var.h) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == q0Var) {
            return;
        }
        q0Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 2));
    }

    @Override // oi.e1
    public final void s1(Editable editable) {
        q0 q0Var = this.a;
        a aVar = q0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = q0Var.d.q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(editable);
            }
        }
        c3 c3Var = q0Var.h;
        if (c3Var == null || q0Var.f == null) {
            return;
        }
        t3 t3Var = c3Var.a;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.g();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // oi.e1
    public final void x0(f1 f1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.a;
        c3 c3Var = q0Var.h;
        if (c3Var == null || (aVar = q0Var.f) == null || (indexOf = (arrayList = (t3Var = c3Var.a).t3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            t3Var.g3.O(true);
        }
        int i7 = indexOf + 1;
        if (i7 >= arrayList.size() || ((a) arrayList.get(i7)).i || t3.A3((a) arrayList.get(i7))) {
            return;
        }
        t3Var.post(new n2(t3Var, (a) arrayList.get(i7), 24));
    }

    @Override // oi.e1
    public final /* synthetic */ void A(int i7, int i10) {
    }
}
