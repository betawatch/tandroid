package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ sn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(sn snVar, Context context, int i10, ln lnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, lnVar, f6Var);
        this.F = snVar;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        un unVar = this.F.d;
        fc1 fc1Var = unVar.s;
        View G = fc1Var.G(this);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null) {
            int b10 = U.b();
            int i10 = unVar.M;
            if (i10 == unVar.J && b10 == (unVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        un unVar = this.F.d;
        fc1 fc1Var = unVar.s;
        View G = fc1Var.G(e6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U == null || (b10 = U.b()) == -1) {
            return false;
        }
        return unVar.L[b10 - unVar.t0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        un unVar = this.F.d;
        if (unVar.n && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.zn.k8(menu, ((org.telegram.ui.zn) unVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        un unVar = this.F.d;
        if (z10 && unVar.c0 && !unVar.b0) {
            Arrays.fill(unVar.L, false);
            unVar.s.getChildCount();
            for (int i10 = unVar.t0; i10 < unVar.t0 + unVar.M; i10++) {
                s4.c1 L = unVar.s.L(i10);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        fc1 fc1Var = unVar.s;
        View G = fc1Var.G(e6Var);
        s4.c1 U = G == null ? null : fc1Var.U(G);
        if (U != null && (b10 = U.b()) != -1) {
            unVar.L[b10 - unVar.t0] = z10;
        }
        unVar.T();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        un.N(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.b.t1(d6Var, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        un unVar = this.F.d;
        if (!arrayList.isEmpty()) {
            unVar.s.getClass();
            int S = RecyclerView.S(this) - unVar.t0;
            if (S >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = S + 1;
                while (!arrayList.isEmpty() && i10 < unVar.J) {
                    for (int length = unVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = unVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    unVar.K[i10] = (CharSequence) arrayList.remove(0);
                    unVar.M++;
                    i10++;
                }
                unVar.h0();
                unVar.k0 = (unVar.t0 + i10) - 1;
                unVar.s.setItemAnimator(unVar.v);
                unVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean o() {
        return this.F.d.c0;
    }
}
