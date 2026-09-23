package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ov0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ rv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov0(rv0 rv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = rv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        tv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        tv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        tv0 tv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < tv0Var.n) {
            for (int length = tv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = tv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            tv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            tv0Var.y++;
            i10++;
        }
        tv0Var.r0();
        tv0Var.g0 = (tv0Var.n0 + i10) - 1;
        tv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
