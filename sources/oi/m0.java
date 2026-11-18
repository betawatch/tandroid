package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class m0 implements d1 {
    public final /* synthetic */ p0 a;

    public m0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // oi.d1
    public final void E0() {
        a aVar;
        p0 p0Var = this.a;
        b3 b3Var = p0Var.h;
        if (b3Var == null || (aVar = p0Var.f) == null) {
            return;
        }
        b3Var.a(aVar);
    }

    @Override // oi.d1
    public final /* synthetic */ boolean E1(boolean z10) {
        return false;
    }

    @Override // oi.d1
    public final boolean J(e1 e1Var) {
        p0 p0Var = this.a;
        if (p0Var.h == null || p0Var.f == null || e1Var.length() != 0) {
            return false;
        }
        p0Var.h.a(p0Var.f);
        return true;
    }

    @Override // oi.d1
    public final void b1(CharSequence charSequence) {
        b3 b3Var = this.a.h;
        if (b3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        b3Var.a.w4(charSequence.toString());
    }

    @Override // oi.d1
    public final /* synthetic */ boolean d2(e1 e1Var) {
        return false;
    }

    @Override // oi.d1
    public final void e(e1 e1Var) {
        b3 b3Var = this.a.h;
        if (b3Var != null) {
            s3 s3Var = b3Var.a;
            s3.Q1(s3Var, e1Var);
            s3Var.p3.k(e1Var, true);
        }
    }

    @Override // oi.d1
    public final boolean o() {
        p0 p0Var = this.a;
        b3 b3Var = p0Var.h;
        if (b3Var == null || p0Var.f == null) {
            return false;
        }
        return b3Var.a.V4();
    }

    @Override // oi.d1
    public final void r1(e1 e1Var, int i7, int i10) {
        b3 b3Var;
        j9 textSelectionHelper;
        p0 p0Var = this.a;
        if (p0Var.n || i7 == i10 || (b3Var = p0Var.h) == null || (textSelectionHelper = b3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == p0Var) {
            return;
        }
        p0Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 2));
    }

    @Override // oi.d1
    public final void s1(Editable editable) {
        p0 p0Var = this.a;
        a aVar = p0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = p0Var.d.q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = b6.f(editable);
            }
        }
        b3 b3Var = p0Var.h;
        if (b3Var == null || p0Var.f == null) {
            return;
        }
        s3 s3Var = b3Var.a;
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.g();
        }
        s3Var.p3.onContentChanged();
    }

    @Override // oi.d1
    public final void x0(e1 e1Var) {
        a aVar;
        s3 s3Var;
        ArrayList arrayList;
        int indexOf;
        p0 p0Var = this.a;
        b3 b3Var = p0Var.h;
        if (b3Var == null || (aVar = p0Var.f) == null || (indexOf = (arrayList = (s3Var = b3Var.a).t3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            s3Var.g3.O(true);
        }
        int i7 = indexOf + 1;
        if (i7 >= arrayList.size() || ((a) arrayList.get(i7)).i || s3.A3((a) arrayList.get(i7))) {
            return;
        }
        s3Var.post(new l2(s3Var, (a) arrayList.get(i7), 24));
    }

    @Override // oi.d1
    public final /* synthetic */ void A(int i7, int i10) {
    }
}
