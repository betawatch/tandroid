package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ln extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int C;
    public final /* synthetic */ pn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(pn pnVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.D = pnVar;
        this.C = i11;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        rn rnVar = this.D.d;
        if (!rnVar.n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) rnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        rn.M(this.D.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.D.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(eh.b bVar) {
        this.D.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        rn rnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < rnVar.G) {
            for (int length = rnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = rnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rnVar.H[i10] = (CharSequence) arrayList.remove(0);
            rnVar.J++;
            i10++;
        }
        rnVar.h0();
        rnVar.h0 = (rnVar.q0 + i10) - 1;
        rnVar.s.setItemAnimator(rnVar.v);
        rnVar.r.l();
        return true;
    }
}
