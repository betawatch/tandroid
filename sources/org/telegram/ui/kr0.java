package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class kr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ nr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = nr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        pr0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        pr0.j0(this.F.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        pr0 pr0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < pr0Var.n) {
            for (int length = pr0Var.w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = pr0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            pr0Var.w[i7] = (CharSequence) arrayList.remove(0);
            pr0Var.D++;
            i7++;
        }
        pr0Var.w0();
        pr0Var.g0 = (pr0Var.n0 + i7) - 1;
        pr0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
