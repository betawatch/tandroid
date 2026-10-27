package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yn extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ eo G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(eo eoVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, int i11) {
        super(context, i10, null, u6Var);
        this.G = eoVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        go goVar = this.G.d;
        if (!goVar.n && this.F == 11 && g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wn.t8(menu, ((org.telegram.ui.wn) goVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        go.P(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.G.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.G.d.b.z1(g6Var, true);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        go goVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < goVar.J) {
            for (int length = goVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = goVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            goVar.K[i10] = (CharSequence) arrayList.remove(0);
            goVar.M++;
            i10++;
        }
        goVar.l0();
        goVar.k0 = (goVar.t0 + i10) - 1;
        goVar.s.setItemAnimator(goVar.v);
        goVar.r.l();
        return true;
    }
}
