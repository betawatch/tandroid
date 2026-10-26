package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ kv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = kv0Var;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        mv0.e0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        mv0.f0(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < mv0Var.n) {
            for (int length = mv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = mv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            mv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            mv0Var.y++;
            i10++;
        }
        mv0Var.s0();
        mv0Var.g0 = (mv0Var.n0 + i10) - 1;
        mv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
    }
}
