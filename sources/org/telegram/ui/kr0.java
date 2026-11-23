package org.telegram.ui;

import android.content.Context;
import android.view.ActionMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kr0 extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ nr0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(nr0 nr0Var, Context context, int i7) {
        super(context, i7, null, null);
        this.G = nr0Var;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(boolean z10) {
        pr0.i0(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        pr0.j0(this.G.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean m(ArrayList arrayList) {
        pr0 pr0Var = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < pr0Var.n) {
            for (int length = pr0Var.w.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = pr0Var.w;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            pr0Var.w[i7] = (CharSequence) arrayList.remove(0);
            pr0Var.E++;
            i7++;
        }
        pr0Var.w0();
        pr0Var.h0 = (pr0Var.o0 + i7) - 1;
        pr0Var.b.f();
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(bi.u uVar, ActionMode actionMode) {
    }
}
