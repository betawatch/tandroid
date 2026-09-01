package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ qn C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(qn qnVar, Context context, int i10, kn knVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, knVar, g6Var);
        this.C = qnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        sn snVar = this.C.d;
        kb1 kb1Var = snVar.s;
        View F = kb1Var.F(this);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = snVar.J;
            if (i10 == snVar.G && b10 == (snVar.q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        sn snVar = this.C.d;
        kb1 kb1Var = snVar.s;
        View F = kb1Var.F(c6Var);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return snVar.I[b10 - snVar.q0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(eh.b bVar, ActionMode actionMode) {
        sn snVar = this.C.d;
        if (snVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) snVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        int b10;
        sn snVar = this.C.d;
        if (z4 && snVar.W && !snVar.V) {
            Arrays.fill(snVar.I, false);
            snVar.s.getChildCount();
            for (int i10 = snVar.q0; i10 < snVar.q0 + snVar.J; i10++) {
                f2.m1 K = snVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        kb1 kb1Var = snVar.s;
        View F = kb1Var.F(c6Var);
        f2.m1 T = F == null ? null : kb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            snVar.I[b10 - snVar.q0] = z4;
        }
        snVar.T();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        sn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        sn.N(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(eh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        sn snVar = this.C.d;
        if (!arrayList.isEmpty()) {
            snVar.s.getClass();
            int R = RecyclerView.R(this) - snVar.q0;
            if (R >= 0) {
                eh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < snVar.G) {
                    for (int length = snVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = snVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    snVar.H[i10] = (CharSequence) arrayList.remove(0);
                    snVar.J++;
                    i10++;
                }
                snVar.h0();
                snVar.h0 = (snVar.q0 + i10) - 1;
                snVar.s.setItemAnimator(snVar.v);
                snVar.r.l();
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
