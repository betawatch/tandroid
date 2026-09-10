package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ xn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(xn xnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.G = xnVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        zn znVar = this.G.d;
        if (!znVar.n && this.F == 11 && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) znVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zn.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.G.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.G.d.b.t1(d6Var, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        zn znVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < znVar.J) {
            for (int length = znVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = znVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            znVar.K[i10] = (CharSequence) arrayList.remove(0);
            znVar.M++;
            i10++;
        }
        znVar.h0();
        znVar.k0 = (znVar.t0 + i10) - 1;
        znVar.s.setItemAnimator(znVar.v);
        znVar.r.l();
        return true;
    }
}
