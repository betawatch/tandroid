package mi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class p0 implements g1 {
    public final /* synthetic */ s0 a;

    public p0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // mi.g1
    public final void B1(Editable editable) {
        s0 s0Var = this.a;
        a aVar = s0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = s0Var.d.l2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = d6.f(editable);
            }
        }
        c3 c3Var = s0Var.h;
        if (c3Var == null || s0Var.f == null) {
            return;
        }
        t3 t3Var = c3Var.a;
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.g();
        }
        t3Var.p3.onContentChanged();
    }

    @Override // mi.g1
    public final /* synthetic */ boolean M0(h1 h1Var) {
        return false;
    }

    @Override // mi.g1
    public final void V0(h1 h1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || (aVar = s0Var.f) == null || (indexOf = (arrayList = (t3Var = c3Var.a).t3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            t3Var.g3.O(true);
        }
        int i3 = indexOf + 1;
        if (i3 >= arrayList.size() || ((a) arrayList.get(i3)).i || t3.A3((a) arrayList.get(i3))) {
            return;
        }
        t3Var.post(new n2(t3Var, (a) arrayList.get(i3), 24));
    }

    @Override // mi.g1
    public final /* synthetic */ boolean X1(boolean z10) {
        return false;
    }

    @Override // mi.g1
    public final boolean c0(h1 h1Var) {
        s0 s0Var = this.a;
        if (s0Var.h == null || s0Var.f == null || h1Var.length() != 0) {
            return false;
        }
        s0Var.h.a(s0Var.f);
        return true;
    }

    @Override // mi.g1
    public final void f(h1 h1Var) {
        c3 c3Var = this.a.h;
        if (c3Var != null) {
            t3 t3Var = c3Var.a;
            t3.Q1(t3Var, h1Var);
            t3Var.p3.E(h1Var, true);
        }
    }

    @Override // mi.g1
    public final void g1(CharSequence charSequence) {
        c3 c3Var = this.a.h;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.w4(charSequence.toString());
    }

    @Override // mi.g1
    public final void l(h1 h1Var, int i3, int i10) {
        c3 c3Var;
        h9 textSelectionHelper;
        s0 s0Var = this.a;
        if (s0Var.n || i3 == i10 || (c3Var = s0Var.h) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == s0Var) {
            return;
        }
        s0Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 2));
    }

    @Override // mi.g1
    public final boolean m() {
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || s0Var.f == null) {
            return false;
        }
        return c3Var.a.V4();
    }

    @Override // mi.g1
    public final void w0() {
        a aVar;
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || (aVar = s0Var.f) == null) {
            return;
        }
        c3Var.a(aVar);
    }

    @Override // mi.g1
    public final /* synthetic */ void A(int i3, int i10) {
    }
}
