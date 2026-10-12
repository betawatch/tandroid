package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ ew0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw0(ew0 ew0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = ew0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        gw0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        gw0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        gw0 gw0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < gw0Var.n) {
            for (int length = gw0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = gw0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            gw0Var.v[i10] = (CharSequence) arrayList.remove(0);
            gw0Var.y++;
            i10++;
        }
        gw0Var.r0();
        gw0Var.g0 = (gw0Var.n0 + i10) - 1;
        gw0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
