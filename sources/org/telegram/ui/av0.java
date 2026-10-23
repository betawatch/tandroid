package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class av0 extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ dv0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(dv0 dv0Var, Context context, int i10) {
        super(context, i10, null, null);
        this.F = dv0Var;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        fv0.d0(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fv0.e0(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        fv0 fv0Var = this.F.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.b6 b6Var = this.d;
        b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < fv0Var.n) {
            for (int length = fv0Var.v.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = fv0Var.v;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fv0Var.v[i10] = (CharSequence) arrayList.remove(0);
            fv0Var.y++;
            i10++;
        }
        fv0Var.r0();
        fv0Var.g0 = (fv0Var.n0 + i10) - 1;
        fv0Var.b.l();
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
    }
}
