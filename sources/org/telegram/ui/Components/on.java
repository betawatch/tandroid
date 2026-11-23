package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.l4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, i7, null, h6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        tn tnVar = (tn) this.H.e;
        if (!tnVar.n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) tnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        tn.R((tn) this.H.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.H.e, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void l(bi.u uVar) {
        ((tn) this.H.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean m(ArrayList arrayList) {
        tn tnVar = (tn) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < tnVar.K) {
            for (int length = tnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = tnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            tnVar.L[i7] = (CharSequence) arrayList.remove(0);
            tnVar.N++;
            i7++;
        }
        tnVar.n0();
        tnVar.l0 = (tnVar.u0 + i7) - 1;
        tnVar.s.setItemAnimator(tnVar.w);
        tnVar.r.f();
        return true;
    }
}
