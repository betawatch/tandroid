package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class in extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ mn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(mn mnVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.C = mnVar;
        this.B = i11;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
        on onVar = this.C.d;
        if (!onVar.n && this.B == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) onVar.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        on.L(this.C.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.C.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(bh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        on onVar = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        bh.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < onVar.F) {
            for (int length = onVar.G.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = onVar.G;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            onVar.G[i10] = (CharSequence) arrayList.remove(0);
            onVar.I++;
            i10++;
        }
        onVar.h0();
        onVar.g0 = (onVar.p0 + i10) - 1;
        onVar.s.setItemAnimator(onVar.v);
        onVar.r.l();
        return true;
    }
}
