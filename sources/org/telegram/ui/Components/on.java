package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ tn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(tn tnVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        super(context, i10, null, d6Var);
        this.G = tnVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        vn vnVar = this.G.d;
        if (!vnVar.n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) vnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        vn.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        vn.N(this.G.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        vn vnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < vnVar.J) {
            for (int length = vnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = vnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            vnVar.K[i10] = (CharSequence) arrayList.remove(0);
            vnVar.M++;
            i10++;
        }
        vnVar.h0();
        vnVar.k0 = (vnVar.t0 + i10) - 1;
        vnVar.s.setItemAnimator(vnVar.v);
        vnVar.r.l();
        return true;
    }
}
