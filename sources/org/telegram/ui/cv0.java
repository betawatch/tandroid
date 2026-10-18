package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ fv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(fv0 fv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = fv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        hv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < hv0Var.n) {
            for (int length = hv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = hv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            hv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            hv0Var.y++;
            i10++;
        }
        hv0Var.r0();
        hv0Var.g0 = (hv0Var.n0 + i10) - 1;
        hv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}
