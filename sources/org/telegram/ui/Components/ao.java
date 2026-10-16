package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ao extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ go G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(go goVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, i10, null, c6Var);
        this.G = goVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        io ioVar = this.G.d;
        if (!ioVar.n && this.F == 11 && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) ioVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        io.P(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        io.Q(this.G.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.G.d.b.w1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        io ioVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.c6 c6Var = this.d;
        c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < ioVar.J) {
            for (int length = ioVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = ioVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            ioVar.K[i10] = (CharSequence) arrayList.remove(0);
            ioVar.M++;
            i10++;
        }
        ioVar.k0();
        ioVar.k0 = (ioVar.t0 + i10) - 1;
        ioVar.s.setItemAnimator(ioVar.v);
        ioVar.r.l();
        return true;
    }
}
