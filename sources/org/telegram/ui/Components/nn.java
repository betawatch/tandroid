package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class nn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ on C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(on onVar, Context context, int i10, in inVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, inVar, f6Var);
        this.C = onVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        qn qnVar = this.C.d;
        jb1 jb1Var = qnVar.s;
        View F = jb1Var.F(this);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = qnVar.J;
            if (i10 == qnVar.G && b10 == (qnVar.q0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        qn qnVar = this.C.d;
        jb1 jb1Var = qnVar.s;
        View F = jb1Var.F(c6Var);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return qnVar.I[b10 - qnVar.q0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(dh.b bVar, ActionMode actionMode) {
        qn qnVar = this.C.d;
        if (qnVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) qnVar.b.c0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        int b10;
        qn qnVar = this.C.d;
        if (z4 && qnVar.W && !qnVar.V) {
            Arrays.fill(qnVar.I, false);
            qnVar.s.getChildCount();
            for (int i10 = qnVar.q0; i10 < qnVar.q0 + qnVar.J; i10++) {
                f2.l1 K = qnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z4);
        jb1 jb1Var = qnVar.s;
        View F = jb1Var.F(c6Var);
        f2.l1 T = F == null ? null : jb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            qnVar.I[b10 - qnVar.q0] = z4;
        }
        qnVar.T();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z4) {
        qn.M(this.C.d, this, z4);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        qn.N(this.C.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(dh.b bVar) {
        this.C.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        qn qnVar = this.C.d;
        if (!arrayList.isEmpty()) {
            qnVar.s.getClass();
            int R = RecyclerView.R(this) - qnVar.q0;
            if (R >= 0) {
                dh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < qnVar.G) {
                    for (int length = qnVar.H.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = qnVar.H;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    qnVar.H[i10] = (CharSequence) arrayList.remove(0);
                    qnVar.J++;
                    i10++;
                }
                qnVar.h0();
                qnVar.h0 = (qnVar.q0 + i10) - 1;
                qnVar.s.setItemAnimator(qnVar.v);
                qnVar.r.l();
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
