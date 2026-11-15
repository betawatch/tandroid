package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class m0 implements d1 {
    public final /* synthetic */ p0 a;

    public m0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // oi.d1
    public final void B() {
        a aVar;
        p0 p0Var = this.a;
        z2 z2Var = p0Var.h;
        if (z2Var == null || (aVar = p0Var.f) == null) {
            return;
        }
        z2Var.a(aVar);
    }

    @Override // oi.d1
    public final void I(CharSequence charSequence) {
        z2 z2Var = this.a.h;
        if (z2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        z2Var.a.w4(charSequence.toString());
    }

    @Override // oi.d1
    public final void Z(e1 e1Var, int i7, int i10) {
        z2 z2Var;
        h9 textSelectionHelper;
        p0 p0Var = this.a;
        if (p0Var.n || i7 == i10 || (z2Var = p0Var.h) == null || (textSelectionHelper = z2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == p0Var) {
            return;
        }
        p0Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 2));
    }

    @Override // oi.d1
    public final void b0(Editable editable) {
        p0 p0Var = this.a;
        a aVar = p0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = p0Var.d.q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = a6.f(editable);
            }
        }
        z2 z2Var = p0Var.h;
        if (z2Var == null || p0Var.f == null) {
            return;
        }
        q3 q3Var = z2Var.a;
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.g();
        }
        q3Var.p3.onContentChanged();
    }

    @Override // oi.d1
    public final void d(e1 e1Var) {
        z2 z2Var = this.a.h;
        if (z2Var != null) {
            q3 q3Var = z2Var.a;
            q3.Q1(q3Var, e1Var);
            q3Var.p3.b(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean g() {
        p0 p0Var = this.a;
        z2 z2Var = p0Var.h;
        if (z2Var == null || p0Var.f == null) {
            return false;
        }
        return z2Var.a.V4();
    }

    @Override // oi.d1
    public final /* synthetic */ boolean h0(boolean z10) {
        return false;
    }

    @Override // oi.d1
    public final boolean o(e1 e1Var) {
        p0 p0Var = this.a;
        if (p0Var.h == null || p0Var.f == null || e1Var.length() != 0) {
            return false;
        }
        p0Var.h.a(p0Var.f);
        return true;
    }

    @Override // oi.d1
    public final /* synthetic */ boolean q0(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void z(e1 e1Var) {
        a aVar;
        q3 q3Var;
        ArrayList arrayList;
        int indexOf;
        p0 p0Var = this.a;
        z2 z2Var = p0Var.h;
        if (z2Var == null || (aVar = p0Var.f) == null || (indexOf = (arrayList = (q3Var = z2Var.a).t3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            q3Var.g3.O(true);
        }
        int i7 = indexOf + 1;
        if (i7 >= arrayList.size() || ((a) arrayList.get(i7)).i || q3.A3((a) arrayList.get(i7))) {
            return;
        }
        q3Var.post(new k2(q3Var, (a) arrayList.get(i7), 24));
    }

    @Override // oi.d1
    public final /* synthetic */ void m(int i7, int i10) {
    }
}
