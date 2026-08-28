package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ hn B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(hn hnVar, Context context, int i9, bn bnVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, bnVar, b6Var);
        this.B = hnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean d() {
        jn jnVar = this.B.d;
        va1 va1Var = jnVar.s;
        View F = va1Var.F(this);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i9 = jnVar.I;
            if (i9 == jnVar.F && b10 == (jnVar.p0 + i9) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        jn jnVar = this.B.d;
        va1 va1Var = jnVar.s;
        View F = va1Var.F(c6Var);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return jnVar.H[b10 - jnVar.p0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(fh.s sVar, ActionMode actionMode) {
        jn jnVar = this.B.d;
        if (jnVar.n && sVar.isFocused() && sVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.qn.k8(menu, ((org.telegram.ui.qn) jnVar.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        jn jnVar = this.B.d;
        if (z10 && jnVar.V && !jnVar.U) {
            Arrays.fill(jnVar.H, false);
            jnVar.s.getChildCount();
            for (int i9 = jnVar.p0; i9 < jnVar.p0 + jnVar.I; i9++) {
                f2.q1 K = jnVar.s.K(i9);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        va1 va1Var = jnVar.s;
        View F = va1Var.F(c6Var);
        f2.q1 T = F == null ? null : va1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            jnVar.H[b10 - jnVar.p0] = z10;
        }
        jnVar.S();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        jn.L(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        jn.M(this.B.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(fh.s sVar) {
        this.B.d.b.t1(sVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        jn jnVar = this.B.d;
        if (!arrayList.isEmpty()) {
            jnVar.s.getClass();
            int R = RecyclerView.R(this) - jnVar.p0;
            if (R >= 0) {
                fh.s sVar = this.d;
                sVar.getText().replace(sVar.getSelectionStart(), sVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i9 = R + 1;
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
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.B.d.V;
    }
}
