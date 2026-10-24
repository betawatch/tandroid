package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ co G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(co coVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, i10, null, g6Var);
        this.G = coVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        fo foVar = this.G.d;
        if (!foVar.n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) foVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        fo.P(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        fo.Q(this.G.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.b.z1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < foVar.J) {
            for (int length = foVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = foVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            foVar.K[i10] = (CharSequence) arrayList.remove(0);
            foVar.M++;
            i10++;
        }
        foVar.l0();
        foVar.k0 = (foVar.t0 + i10) - 1;
        foVar.s.setItemAnimator(foVar.v);
        foVar.r.l();
        return true;
    }
}
