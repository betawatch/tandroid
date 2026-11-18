package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.l4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(context, i7, null, i6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        rn rnVar = (rn) this.H.e;
        if (!rnVar.n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) rnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        rn.R((rn) this.H.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        rn.S((rn) this.H.e, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void l(bi.u uVar) {
        ((rn) this.H.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean m(ArrayList arrayList) {
        rn rnVar = (rn) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < rnVar.K) {
            for (int length = rnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = rnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rnVar.L[i7] = (CharSequence) arrayList.remove(0);
            rnVar.N++;
            i7++;
        }
        rnVar.n0();
        rnVar.l0 = (rnVar.u0 + i7) - 1;
        rnVar.s.setItemAnimator(rnVar.w);
        rnVar.r.f();
        return true;
    }
}
