package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ fv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(fv0 fv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = fv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        hv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        hv0.e0(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        hv0 hv0Var = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
        hv0Var.d0 = (hv0Var.k0 + i10) - 1;
        hv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
    }
}
