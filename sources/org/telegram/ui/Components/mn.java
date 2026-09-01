package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int C;
    public final /* synthetic */ qn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(qn qnVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.D = qnVar;
        this.C = i11;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        sn snVar = this.D.d;
        if (!snVar.n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) snVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        sn.M(this.D.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        sn.N(this.D.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(eh.b bVar) {
        this.D.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        sn snVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < snVar.G) {
            for (int length = snVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = snVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            snVar.H[i10] = (CharSequence) arrayList.remove(0);
            snVar.J++;
            i10++;
        }
        snVar.h0();
        snVar.h0 = (snVar.q0 + i10) - 1;
        snVar.s.setItemAnimator(snVar.v);
        snVar.r.l();
        return true;
    }
}
