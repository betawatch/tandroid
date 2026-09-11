package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ rn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(rn rnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.G = rnVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        tn tnVar = this.G.d;
        if (!tnVar.n && this.F == 11 && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) tnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        tn.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        tn.N(this.G.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.G.d.b.t1(b6Var, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        tn tnVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < tnVar.J) {
            for (int length = tnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = tnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            tnVar.K[i10] = (CharSequence) arrayList.remove(0);
            tnVar.M++;
            i10++;
        }
        tnVar.h0();
        tnVar.k0 = (tnVar.t0 + i10) - 1;
        tnVar.s.setItemAnimator(tnVar.v);
        tnVar.r.l();
        return true;
    }
}
