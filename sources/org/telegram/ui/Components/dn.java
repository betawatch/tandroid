package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ int B;
    public final /* synthetic */ hn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(hn hnVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(context, i9, null, b6Var);
        this.C = hnVar;
        this.B = i10;
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(fh.s sVar, ActionMode actionMode) {
        jn jnVar = this.C.d;
        if (!jnVar.n && this.B == 11 && sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) jnVar.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        jn.L(this.C.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        jn.M(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(fh.s sVar) {
        this.C.d.b.t1(sVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        jn jnVar = this.C.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        fh.s sVar = this.d;
        sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i9 = 0;
        while (!arrayList.isEmpty() && i9 < jnVar.F) {
            for (int length = jnVar.G.length - 1; length > i9; length--) {
                CharSequence[] charSequenceArr = jnVar.G;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.G[i9] = (CharSequence) arrayList.remove(0);
            jnVar.I++;
            i9++;
        }
        jnVar.g0();
        jnVar.g0 = (jnVar.p0 + i9) - 1;
        jnVar.s.setItemAnimator(jnVar.v);
        jnVar.r.l();
        return true;
    }
}
