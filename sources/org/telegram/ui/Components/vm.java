package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vm extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.n4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(org.telegram.ui.n4 n4Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i3, null, e6Var);
        this.H = n4Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
        an anVar = (an) this.H.e;
        if (!anVar.n && this.G == 11 && zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) anVar.b.X1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        an.Q((an) this.H.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.H.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(ai.z zVar) {
        ((an) this.H.e).b.h1(zVar, true);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        ai.z zVar = this.d;
        zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i3 = 0;
        while (!arrayList.isEmpty() && i3 < anVar.K) {
            for (int length = anVar.L.length - 1; length > i3; length--) {
                CharSequence[] charSequenceArr = anVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            anVar.L[i3] = (CharSequence) arrayList.remove(0);
            anVar.N++;
            i3++;
        }
        anVar.n0();
        anVar.l0 = (anVar.u0 + i3) - 1;
        anVar.s.setItemAnimator(anVar.w);
        anVar.r.f();
        return true;
    }
}
