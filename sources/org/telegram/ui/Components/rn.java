package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ sn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(sn snVar, Context context, int i10, ln lnVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, lnVar, e6Var);
        this.F = snVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        un unVar = this.F.d;
        ec1 ec1Var = unVar.s;
        View F = ec1Var.F(this);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = unVar.M;
            if (i10 == unVar.J && b10 == (unVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        un unVar = this.F.d;
        ec1 ec1Var = unVar.s;
        View F = ec1Var.F(d6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return unVar.L[b10 - unVar.t0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        un unVar = this.F.d;
        if (unVar.n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bo.k8(menu, ((org.telegram.ui.bo) unVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        un unVar = this.F.d;
        if (z10 && unVar.c0 && !unVar.b0) {
            Arrays.fill(unVar.L, false);
            unVar.s.getChildCount();
            for (int i10 = unVar.t0; i10 < unVar.t0 + unVar.M; i10++) {
                s4.c1 K = unVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        ec1 ec1Var = unVar.s;
        View F = ec1Var.F(d6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            unVar.L[b10 - unVar.t0] = z10;
        }
        unVar.T();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        un.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        un.N(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        un unVar = this.F.d;
        if (!arrayList.isEmpty()) {
            unVar.s.getClass();
            int R = RecyclerView.R(this) - unVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
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

    @Override // org.telegram.ui.Cells.d6
    public final boolean o() {
        return this.F.d.c0;
    }
}
