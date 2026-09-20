package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ sn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(sn snVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, i10, null, f6Var);
        this.G = snVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        un unVar = this.G.d;
        if (!unVar.n && this.F == 11 && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        un.M(this.G.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        un.N(this.G.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.G.d.b.t1(d6Var, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        un unVar = this.G.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.d6 d6Var = this.d;
        d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i10 = 0;
        while (!arrayList.isEmpty() && i10 < unVar.J) {
            for (int length = unVar.K.length - 1; length > i10; length--) {
                CharSequence[] charSequenceArr = unVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            unVar.K[i10] = (CharSequence) arrayList.remove(0);
            unVar.M++;
            i10++;
        }
        unVar.h0();
        unVar.k0 = (unVar.t0 + i10) - 1;
        unVar.s.setItemAnimator(unVar.v);
        unVar.r.l();
        return true;
    }
}
