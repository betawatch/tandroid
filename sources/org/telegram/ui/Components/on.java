package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class on extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(org.telegram.ui.l4 l4Var, Context context, int i7, jn jnVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, jnVar, i6Var);
        this.G = l4Var;
        ((qn) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f() {
        qn qnVar = (qn) this.G.e;
        org.telegram.ui.d61 d61Var = qnVar.s;
        View F = d61Var.F(this);
        v4.f1 T = F == null ? null : d61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = qnVar.N;
            if (i7 == qnVar.K && b10 == (qnVar.u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean g(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        qn qnVar = (qn) this.G.e;
        org.telegram.ui.d61 d61Var = qnVar.s;
        View F = d61Var.F(a6Var);
        v4.f1 T = F == null ? null : d61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return qnVar.M[b10 - qnVar.u0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(bi.u uVar, ActionMode actionMode) {
        qn qnVar = (qn) this.G.e;
        if (qnVar.n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) qnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        int b10;
        qn qnVar = (qn) this.G.e;
        if (z10 && qnVar.d0 && !qnVar.c0) {
            Arrays.fill(qnVar.M, false);
            for (int i7 = qnVar.u0; i7 < qnVar.u0 + qnVar.N; i7++) {
                v4.f1 K = qnVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(a6Var, z10);
        org.telegram.ui.d61 d61Var = qnVar.s;
        View F = d61Var.F(a6Var);
        v4.f1 T = F == null ? null : d61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            qnVar.M[b10 - qnVar.u0] = z10;
        }
        qnVar.Y();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(boolean z10) {
        qn.R((qn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.a6 a6Var) {
        qn.S((qn) this.G.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void l(bi.u uVar) {
        ((qn) this.G.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean m(ArrayList arrayList) {
        qn qnVar = (qn) this.G.e;
        if (!arrayList.isEmpty()) {
            qnVar.s.getClass();
            int R = RecyclerView.R(this) - qnVar.u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < qnVar.K) {
                    for (int length = qnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = qnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    qnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    qnVar.N++;
                    i7++;
                }
                qnVar.n0();
                qnVar.l0 = (qnVar.u0 + i7) - 1;
                qnVar.s.setItemAnimator(qnVar.w);
                qnVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean p() {
        return ((qn) this.G.e).d0;
    }
}
