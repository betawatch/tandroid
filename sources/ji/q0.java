package ji;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class q0 implements g1 {
    public final /* synthetic */ t0 a;

    public q0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // ji.g1
    public final void C(h1 h1Var) {
        a aVar;
        v3 v3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.a;
        c3 c3Var = t0Var.h;
        if (c3Var == null || (aVar = t0Var.f) == null || (indexOf = (arrayList = (v3Var = c3Var.a).l3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            v3Var.Y2.N(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || v3.w3((a) arrayList.get(i10))) {
            return;
        }
        v3Var.post(new n2(v3Var, (a) arrayList.get(i10), 24));
    }

    @Override // ji.g1
    public final void N(Editable editable) {
        t0 t0Var = this.a;
        a aVar = t0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(editable);
            }
        }
        c3 c3Var = t0Var.h;
        if (c3Var == null || t0Var.f == null) {
            return;
        }
        v3 v3Var = c3Var.a;
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.g();
        }
        v3Var.h3.onContentChanged();
    }

    @Override // ji.g1
    public final /* synthetic */ boolean R(boolean z10) {
        return false;
    }

    @Override // ji.g1
    public final void a(h1 h1Var) {
        c3 c3Var = this.a.h;
        if (c3Var != null) {
            v3 v3Var = c3Var.a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // ji.g1
    public final boolean e() {
        t0 t0Var = this.a;
        c3 c3Var = t0Var.h;
        if (c3Var == null || t0Var.f == null) {
            return false;
        }
        return c3Var.a.R4();
    }

    @Override // ji.g1
    public final boolean h(h1 h1Var) {
        t0 t0Var = this.a;
        if (t0Var.h == null || t0Var.f == null || h1Var.length() != 0) {
            return false;
        }
        t0Var.h.a(t0Var.f);
        return true;
    }

    @Override // ji.g1
    public final /* synthetic */ boolean k(h1 h1Var) {
        return false;
    }

    @Override // ji.g1
    public final void o(h1 h1Var, int i10, int i11) {
        c3 c3Var;
        q9 textSelectionHelper;
        t0 t0Var = this.a;
        if (t0Var.n || i10 == i11 || (c3Var = t0Var.h) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == t0Var) {
            return;
        }
        t0Var.post(new fi.y4(this, h1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // ji.g1
    public final void r() {
        a aVar;
        t0 t0Var = this.a;
        c3 c3Var = t0Var.h;
        if (c3Var == null || (aVar = t0Var.f) == null) {
            return;
        }
        c3Var.a(aVar);
    }

    @Override // ji.g1
    public final void y(CharSequence charSequence) {
        c3 c3Var = this.a.h;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.s4(charSequence.toString());
    }

    @Override // ji.g1
    public final /* synthetic */ void i(int i10, int i11) {
    }
}
