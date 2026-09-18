package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class nn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ sn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(context, i10, null, e6Var);
        this.G = snVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        un unVar = this.G.d;
        if (!unVar.n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        un.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        un.N(this.G.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        un unVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < unVar.J) {
            for (int length = unVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = unVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            unVar.K[i10] = (CharSequence) arrayList.remove(0);
            unVar.M++;
            i10++;
        }
        unVar.h0();
        unVar.k0 = (unVar.t0 + i10) - 1;
        unVar.s.setItemAnimator(unVar.v);
        unVar.r.l();
        return true;
    }
}
