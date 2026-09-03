package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ pn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(pn pnVar, Context context, int i10, jn jnVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, jnVar, g6Var);
        this.C = pnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        rn rnVar = this.C.d;
        qb1 qb1Var = rnVar.s;
        View F = qb1Var.F(this);
        f2.m1 T = F == null ? null : qb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = rnVar.J;
            if (i10 == rnVar.G && b10 == (rnVar.q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        rn rnVar = this.C.d;
        qb1 qb1Var = rnVar.s;
        View F = qb1Var.F(c6Var);
        f2.m1 T = F == null ? null : qb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return rnVar.I[b10 - rnVar.q0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        rn rnVar = this.C.d;
        if (rnVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) rnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        int b10;
        rn rnVar = this.C.d;
        if (z4 && rnVar.W && !rnVar.V) {
            Arrays.fill(rnVar.I, false);
            rnVar.s.getChildCount();
            for (int i10 = rnVar.q0; i10 < rnVar.q0 + rnVar.J; i10++) {
                f2.m1 K = rnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        qb1 qb1Var = rnVar.s;
        View F = qb1Var.F(c6Var);
        f2.m1 T = F == null ? null : qb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            rnVar.I[b10 - rnVar.q0] = z4;
        }
        rnVar.T();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        rn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        rn.N(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(eh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        rn rnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            rnVar.s.getClass();
            int R = RecyclerView.R(this) - rnVar.q0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < rnVar.G) {
                    for (int length = rnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = rnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    rnVar.J++;
                    i10++;
                }
                rnVar.h0();
                rnVar.h0 = (rnVar.q0 + i10) - 1;
                rnVar.s.setItemAnimator(rnVar.v);
                rnVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.C.d.W;
    }
}
