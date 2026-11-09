package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ int F;
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(org.telegram.ui.l4 l4Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, i7, null, g6Var);
        this.G = l4Var;
        this.F = i10;
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        bn bnVar = (bn) this.G.e;
        if (!bnVar.n && this.F == 11 && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) bnVar.b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        bn.Q((bn) this.G.e, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.G.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.G.e).b.h1(z5Var, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        bn bnVar = (bn) this.G.e;
        if (arrayList.isEmpty()) {
            return false;
        }
        org.telegram.ui.Cells.z5 z5Var = this.d;
        z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
        int i7 = 0;
        while (!arrayList.isEmpty() && i7 < bnVar.J) {
            for (int length = bnVar.K.length - 1; length > i7; length--) {
                CharSequence[] charSequenceArr = bnVar.K;
                charSequenceArr[length] = charSequenceArr[length - 1];
            }
            bnVar.K[i7] = (CharSequence) arrayList.remove(0);
            bnVar.M++;
            i7++;
        }
        bnVar.n0();
        bnVar.k0 = (bnVar.t0 + i7) - 1;
        bnVar.s.setItemAnimator(bnVar.w);
        bnVar.r.f();
        return true;
    }
}
