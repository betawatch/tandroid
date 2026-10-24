package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ gv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(gv0 gv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = gv0Var;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        iv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        iv0.e0(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        iv0 iv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < iv0Var.n) {
            for (int length = iv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = iv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            iv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            iv0Var.y++;
            i10++;
        }
        iv0Var.r0();
        iv0Var.g0 = (iv0Var.n0 + i10) - 1;
        iv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
    }
}
