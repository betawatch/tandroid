package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class tn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ un F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn(un unVar, Context context, int i10, nn nnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, nnVar, d6Var);
        this.F = unVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        wn wnVar = this.F.d;
        wb1 wb1Var = wnVar.s;
        View F = wb1Var.F(this);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = wnVar.M;
            if (i10 == wnVar.J && b10 == (wnVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        wn wnVar = this.F.d;
        wb1 wb1Var = wnVar.s;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return wnVar.L[b10 - wnVar.t0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        wn wnVar = this.F.d;
        if (wnVar.n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wn.k8(menu, ((org.telegram.ui.wn) wnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        wn wnVar = this.F.d;
        if (z10 && wnVar.c0 && !wnVar.b0) {
            Arrays.fill(wnVar.L, false);
            wnVar.s.getChildCount();
            for (int i10 = wnVar.t0; i10 < wnVar.t0 + wnVar.M; i10++) {
                s4.c1 K = wnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = wnVar.s;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            wnVar.L[b10 - wnVar.t0] = z10;
        }
        wnVar.T();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        wn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        wn.N(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        wn wnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            wnVar.s.getClass();
            int R = RecyclerView.R(this) - wnVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < wnVar.J) {
                    for (int length = wnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = wnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    wnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    wnVar.M++;
                    i10++;
                }
                wnVar.h0();
                wnVar.k0 = (wnVar.t0 + i10) - 1;
                wnVar.s.setItemAnimator(wnVar.v);
                wnVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean o() {
        return this.F.d.c0;
    }
}
