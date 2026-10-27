package li;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class p0 implements f1 {
    public final /* synthetic */ s0 a;

    public p0(s0 s0Var) {
        this.a = s0Var;
    }

    @Override // li.f1
    public final void E(g1 g1Var, int i10, int i11) {
        c3 c3Var;
        s9 textSelectionHelper;
        s0 s0Var = this.a;
        if (s0Var.n || i10 == i11 || (c3Var = s0Var.h) == null || (textSelectionHelper = c3Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.x() && textSelectionHelper.W == s0Var) {
            return;
        }
        s0Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 2));
    }

    @Override // li.f1
    public final void R() {
        a aVar;
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || (aVar = s0Var.f) == null) {
            return;
        }
        c3Var.a(aVar);
    }

    @Override // li.f1
    public final void T(CharSequence charSequence) {
        c3 c3Var = this.a.h;
        if (c3Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        c3Var.a.z4(charSequence.toString());
    }

    @Override // li.f1
    public final void Y(Editable editable) {
        s0 s0Var = this.a;
        a aVar = s0Var.f;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = s0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(editable);
            }
        }
        c3 c3Var = s0Var.h;
        if (c3Var == null || s0Var.f == null) {
            return;
        }
        v3 v3Var = c3Var.a;
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.g();
        }
        v3Var.p3.onContentChanged();
    }

    @Override // li.f1
    public final void b(g1 g1Var) {
        c3 c3Var = this.a.h;
        if (c3Var != null) {
            v3 v3Var = c3Var.a;
            v3.S1(v3Var, g1Var);
            v3Var.p3.s(g1Var, true);
        }
    }

    @Override // li.f1
    public final boolean e() {
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || s0Var.f == null) {
            return false;
        }
        return c3Var.a.Y4();
    }

    @Override // li.f1
    public final /* synthetic */ boolean f0(boolean z10) {
        return false;
    }

    @Override // li.f1
    public final /* synthetic */ boolean g(g1 g1Var) {
        return false;
    }

    @Override // li.f1
    public final boolean o(g1 g1Var) {
        s0 s0Var = this.a;
        if (s0Var.h == null || s0Var.f == null || g1Var.length() != 0) {
            return false;
        }
        s0Var.h.a(s0Var.f);
        return true;
    }

    @Override // li.f1
    public final void t(g1 g1Var) {
        a aVar;
        v3 v3Var;
        ArrayList arrayList;
        int indexOf;
        s0 s0Var = this.a;
        c3 c3Var = s0Var.h;
        if (c3Var == null || (aVar = s0Var.f) == null || (indexOf = (arrayList = (v3Var = c3Var.a).t3).indexOf(aVar)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            v3Var.g3.O(true);
        }
        int i10 = indexOf + 1;
        if (i10 >= arrayList.size() || ((a) arrayList.get(i10)).i || v3.D3((a) arrayList.get(i10))) {
            return;
        }
        v3Var.post(new m2(v3Var, (a) arrayList.get(i10), 24));
    }

    @Override // li.f1
    public final /* synthetic */ void k(int i10, int i11) {
    }
}
