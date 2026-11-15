package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class en extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.l4 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, i7, null, e6Var);
        this.H = l4Var;
        this.G = i10;
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(bi.u uVar, ActionMode actionMode) {
        jn jnVar = (jn) this.H.e;
        if (!jnVar.n && this.G == 11 && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) jnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(boolean z10) {
        jn.R((jn) this.H.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.H.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void l(bi.u uVar) {
        ((jn) this.H.e).b.h1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean m(ArrayList arrayList) {
        jn jnVar = (jn) this.H.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        bi.u uVar = this.d;
        uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < jnVar.K) {
            for (int length = jnVar.L.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = jnVar.L;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            jnVar.L[i7] = (CharSequence) arrayList.remove(0);
            jnVar.N++;
            i7++;
        }
        jnVar.n0();
        jnVar.l0 = (jnVar.u0 + i7) - 1;
        jnVar.s.setItemAnimator(jnVar.w);
        jnVar.r.f();
        return true;
    }
}
