package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class en extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ fg.j G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(fg.j jVar, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(context, i10, null, p6Var);
        this.G = jVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        jn jnVar = (jn) this.G.e;
        if (!jnVar.n && this.F == 11 && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.un.t8(menu, ((org.telegram.ui.un) jnVar.b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        jn.P((jn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.G.e, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(ih.b bVar) {
        ((jn) this.G.e).b.g1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        jn jnVar = (jn) this.G.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        ih.b bVar = this.d;
        bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < jnVar.J) {
            for (int length = jnVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = jnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.K[i10] = (CharSequence) arrayList.remove(0);
            jnVar.M++;
            i10++;
        }
        jnVar.l0();
        jnVar.k0 = (jnVar.t0 + i10) - 1;
        jnVar.s.setItemAnimator(jnVar.w);
        jnVar.r.f();
        return true;
    }
}
