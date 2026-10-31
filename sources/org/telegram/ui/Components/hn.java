package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ fg.j F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(fg.j jVar, Context context, int i10, cn cnVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, cnVar, p6Var);
        this.F = jVar;
        ((jn) jVar.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        jn jnVar = (jn) this.F.e;
        org.telegram.ui.w71 w71Var = jnVar.s;
        View F = w71Var.F(this);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = jnVar.M;
            if (i10 == jnVar.J && b10 == (jnVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        jn jnVar = (jn) this.F.e;
        org.telegram.ui.w71 w71Var = jnVar.s;
        View F = w71Var.F(e6Var);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return jnVar.L[b10 - jnVar.t0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(ih.b bVar, ActionMode actionMode) {
        jn jnVar = (jn) this.F.e;
        if (jnVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.un.t8(menu, ((org.telegram.ui.un) jnVar.b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        jn jnVar = (jn) this.F.e;
        if (z10 && jnVar.c0 && !jnVar.b0) {
            Arrays.fill(jnVar.L, false);
            for (int i10 = jnVar.t0; i10 < jnVar.t0 + jnVar.M; i10++) {
                s4.c1 K = jnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        org.telegram.ui.w71 w71Var = jnVar.s;
        View F = w71Var.F(e6Var);
        s4.c1 T = F == null ? null : w71Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.L[b10 - jnVar.t0] = z10;
        }
        jnVar.W();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        jn.P((jn) this.F.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        jn.Q((jn) this.F.e, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(ih.b bVar) {
        ((jn) this.F.e).b.g1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        jn jnVar = (jn) this.F.e;
        if (!arrayList.isEmpty()) {
            jnVar.s.getClass();
            int R = RecyclerView.R(this) - jnVar.t0;
            if (R >= 0) {
                ih.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
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
        return false;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean o() {
        return ((jn) this.F.e).c0;
    }
}
