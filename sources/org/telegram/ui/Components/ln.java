package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ln extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.l4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, null, i6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(bi.u uVar, ActionMode actionMode) {
        qn qnVar = (qn) this.H.e;
        if (!qnVar.n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) qnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(boolean z10) {
        qn.R((qn) this.H.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.H.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void l(bi.u uVar) {
        ((qn) this.H.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean m(ArrayList arrayList) {
        qn qnVar = (qn) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < qnVar.K) {
            for (int length = qnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = qnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            qnVar.L[i7] = (CharSequence) arrayList.remove(0);
            qnVar.N++;
            i7++;
        }
        qnVar.n0();
        qnVar.l0 = (qnVar.u0 + i7) - 1;
        qnVar.s.setItemAnimator(qnVar.w);
        qnVar.r.f();
        return true;
    }
}
