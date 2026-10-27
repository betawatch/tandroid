package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jv0 extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ mv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(mv0 mv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = mv0Var;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        ov0.e0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        ov0.f0(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        ov0 ov0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.g6 g6Var = this.d;
        g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < ov0Var.n) {
            for (int length = ov0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = ov0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            ov0Var.v[i10] = (CharSequence) arrayList.remove(0);
            ov0Var.y++;
            i10++;
        }
        ov0Var.s0();
        ov0Var.g0 = (ov0Var.n0 + i10) - 1;
        ov0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
    }
}
