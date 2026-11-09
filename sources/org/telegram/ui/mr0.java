package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ pr0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(pr0 pr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.F = pr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        rr0.i0(this.F.d, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        rr0.j0(this.F.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        rr0 rr0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < rr0Var.n) {
            for (int length = rr0Var.w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = rr0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            rr0Var.w[i7] = (CharSequence) arrayList.remove(0);
            rr0Var.D++;
            i7++;
        }
        rr0Var.w0();
        rr0Var.g0 = (rr0Var.n0 + i7) - 1;
        rr0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
    }
}
