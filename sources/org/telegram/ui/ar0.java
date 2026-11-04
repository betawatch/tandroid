package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ar0 extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ dr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(dr0 dr0Var, Context context, int i3) {
        super(context, i3, null, null);
        this.G = dr0Var;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        fr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        fr0.j0(this.G.d, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        fr0 fr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        ai.z zVar = this.d;
        zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i3 = 0;
        while (!arrayList.isEmpty() && i3 < fr0Var.n) {
            for (int length = fr0Var.w.length - 1; length > i3; length--) {
                CharSequence[] charSequenceArr = fr0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            fr0Var.w[i3] = (CharSequence) arrayList.remove(0);
            fr0Var.E++;
            i3++;
        }
        fr0Var.w0();
        fr0Var.h0 = (fr0Var.o0 + i3) - 1;
        fr0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
    }
}
