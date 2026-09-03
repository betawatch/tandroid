package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ int C;
    public final /* synthetic */ nn D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(nn nnVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.D = nnVar;
        this.C = i11;
    }

    @Override // org.telegram.ui.Cells.b6
    public final void g(dh.b bVar, ActionMode actionMode) {
        pn pnVar = this.D.d;
        if (!pnVar.n && this.C == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) pnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(boolean z4) {
        pn.M(this.D.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(org.telegram.ui.Cells.b6 b6Var) {
        pn.N(this.D.d, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(dh.b bVar) {
        this.D.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean l(ArrayList arrayList) {
        pn pnVar = this.D.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        dh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < pnVar.G) {
            for (int length = pnVar.H.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = pnVar.H;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            pnVar.H[i10] = (CharSequence) arrayList.remove(0);
            pnVar.J++;
            i10++;
        }
        pnVar.h0();
        pnVar.h0 = (pnVar.q0 + i10) - 1;
        pnVar.s.setItemAnimator(pnVar.v);
        pnVar.r.l();
        return true;
    }
}
