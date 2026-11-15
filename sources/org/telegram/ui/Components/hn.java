package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hn extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(org.telegram.ui.l4 l4Var, Context context, int i7, cn cnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, cnVar, e6Var);
        this.G = l4Var;
        ((jn) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f() {
        jn jnVar = (jn) this.G.e;
        org.telegram.ui.b61 b61Var = jnVar.s;
        View F = b61Var.F(this);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = jnVar.N;
            if (i7 == jnVar.K && b10 == (jnVar.u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean g(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        jn jnVar = (jn) this.G.e;
        org.telegram.ui.b61 b61Var = jnVar.s;
        View F = b61Var.F(z5Var);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return jnVar.M[b10 - jnVar.u0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(bi.u uVar, ActionMode actionMode) {
        jn jnVar = (jn) this.G.e;
        if (jnVar.n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.an.C8(menu, ((org.telegram.ui.an) jnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        jn jnVar = (jn) this.G.e;
        if (z10 && jnVar.d0 && !jnVar.c0) {
            Arrays.fill(jnVar.M, false);
            for (int i7 = jnVar.u0; i7 < jnVar.u0 + jnVar.N; i7++) {
                v4.e1 K = jnVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(z5Var, z10);
        org.telegram.ui.b61 b61Var = jnVar.s;
        View F = b61Var.F(z5Var);
        v4.e1 T = F == null ? null : b61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.M[b10 - jnVar.u0] = z10;
        }
        jnVar.Y();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(boolean z10) {
        jn.R((jn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        jn.S((jn) this.G.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void l(bi.u uVar) {
        ((jn) this.G.e).b.h1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean m(ArrayList arrayList) {
        jn jnVar = (jn) this.G.e;
        if (!arrayList.isEmpty()) {
            jnVar.s.getClass();
            int R = RecyclerView.R(this) - jnVar.u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
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
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean p() {
        return ((jn) this.G.e).d0;
    }
}
