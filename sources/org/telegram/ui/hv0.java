package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ kv0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(kv0 kv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.C = kv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        mv0.d0(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        mv0.e0(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        mv0 mv0Var = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        eh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
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
        mv0Var.r0();
        mv0Var.d0 = (mv0Var.k0 + i10) - 1;
        mv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
    }
}
