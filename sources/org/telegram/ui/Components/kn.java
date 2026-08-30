package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int C;
    public final /* synthetic */ on D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(on onVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.D = onVar;
        this.C = i11;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(dh.b bVar, ActionMode actionMode) {
        qn qnVar = this.D.d;
        if (!qnVar.n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) qnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        qn.M(this.D.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.D.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(dh.b bVar) {
        this.D.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        qn qnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < qnVar.G) {
            for (int length = qnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = qnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            qnVar.H[i10] = (CharSequence) arrayList.remove(0);
            qnVar.J++;
            i10++;
        }
        qnVar.h0();
        qnVar.h0 = (qnVar.q0 + i10) - 1;
        qnVar.s.setItemAnimator(qnVar.v);
        qnVar.r.l();
        return true;
    }
}
