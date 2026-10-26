package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class co extends org.telegram.ui.Cells.h6 {
    public final /* synthetic */ eo F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(eo eoVar, Context context, int i10, wn wnVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, wnVar, u6Var);
        this.F = eoVar;
        eoVar.d.s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean e() {
        go goVar = this.F.d;
        org.telegram.ui.za1 za1Var = goVar.s;
        View F = za1Var.F(this);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = goVar.M;
            if (i10 == goVar.J && b10 == (goVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean f(org.telegram.ui.Cells.h6 h6Var) {
        int b10;
        go goVar = this.F.d;
        org.telegram.ui.za1 za1Var = goVar.s;
        View F = za1Var.F(h6Var);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return goVar.L[b10 - goVar.t0];
    }

    @Override // org.telegram.ui.Cells.h6
    public final void g(org.telegram.ui.Cells.g6 g6Var, ActionMode actionMode) {
        go goVar = this.F.d;
        if (goVar.n && g6Var.isFocused() && g6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.un.r8(menu, ((org.telegram.ui.un) goVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.h6
    public final void h(org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        int b10;
        go goVar = this.F.d;
        if (z10 && goVar.c0 && !goVar.b0) {
            Arrays.fill(goVar.L, false);
            for (int i10 = goVar.t0; i10 < goVar.t0 + goVar.M; i10++) {
                s4.e1 K = goVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(h6Var, z10);
        org.telegram.ui.za1 za1Var = goVar.s;
        View F = za1Var.F(h6Var);
        s4.e1 T = F == null ? null : za1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            goVar.L[b10 - goVar.t0] = z10;
        }
        goVar.W();
    }

    @Override // org.telegram.ui.Cells.h6
    public final void i(boolean z10) {
        go.P(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void j(org.telegram.ui.Cells.h6 h6Var) {
        go.Q(this.F.d, h6Var);
    }

    @Override // org.telegram.ui.Cells.h6
    public final void k(org.telegram.ui.Cells.g6 g6Var) {
        this.F.d.b.y1(g6Var, true);
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean l(ArrayList arrayList) {
        go goVar = this.F.d;
        if (!arrayList.isEmpty()) {
            goVar.s.getClass();
            int R = RecyclerView.R(this) - goVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.g6 g6Var = this.d;
                g6Var.getText().replace(g6Var.getSelectionStart(), g6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < goVar.J) {
                    for (int length = goVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = goVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    goVar.K[i10] = (CharSequence) arrayList.remove(0);
                    goVar.M++;
                    i10++;
                }
                goVar.l0();
                goVar.k0 = (goVar.t0 + i10) - 1;
                goVar.s.setItemAnimator(goVar.v);
                goVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.h6
    public final boolean o() {
        return this.F.d.c0;
    }
}
