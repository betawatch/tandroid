package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class xn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ co G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(co coVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = coVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        fo foVar = this.G.d;
        if (!foVar.n && this.F == 11 && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.sn.n8(menu, ((org.telegram.ui.sn) foVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        fo.P(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fo.Q(this.G.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.G.d.b.w1(b6Var, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
        foVar.k0();
        foVar.k0 = (foVar.t0 + i10) - 1;
        foVar.s.setItemAnimator(foVar.v);
        foVar.r.l();
        return true;
    }
}
