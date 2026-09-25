package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ pv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv0(pv0 pv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = pv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        rv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        rv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        rv0 rv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < rv0Var.n) {
            for (int length = rv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = rv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            rv0Var.y++;
            i10++;
        }
        rv0Var.r0();
        rv0Var.g0 = (rv0Var.n0 + i10) - 1;
        rv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
