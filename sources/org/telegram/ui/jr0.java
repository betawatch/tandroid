package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ mr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(mr0 mr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = mr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        or0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        or0.j0(this.F.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        or0 or0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < or0Var.n) {
            for (int length = or0Var.w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = or0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            or0Var.w[i7] = (CharSequence) arrayList.remove(0);
            or0Var.D++;
            i7++;
        }
        or0Var.w0();
        or0Var.g0 = (or0Var.n0 + i7) - 1;
        or0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
