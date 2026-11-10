package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ qr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(qr0 qr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = qr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        sr0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        sr0.j0(this.F.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        sr0 sr0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < sr0Var.n) {
            for (int length = sr0Var.w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = sr0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            sr0Var.w[i7] = (CharSequence) arrayList.remove(0);
            sr0Var.D++;
            i7++;
        }
        sr0Var.w0();
        sr0Var.g0 = (sr0Var.n0 + i7) - 1;
        sr0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
