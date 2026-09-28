package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ un G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(un unVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = unVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        wn wnVar = this.G.d;
        if (!wnVar.n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) wnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        wn.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        wn.N(this.G.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        wn wnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < wnVar.J) {
            for (int length = wnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = wnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            wnVar.K[i10] = (CharSequence) arrayList.remove(0);
            wnVar.M++;
            i10++;
        }
        wnVar.h0();
        wnVar.k0 = (wnVar.t0 + i10) - 1;
        wnVar.s.setItemAnimator(wnVar.v);
        wnVar.r.l();
        return true;
    }
}
