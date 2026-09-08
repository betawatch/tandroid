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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qn extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ rn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(rn rnVar, Context context, int i10, kn knVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, knVar, f6Var);
        this.F = rnVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean d() {
        tn tnVar = this.F.d;
        ec1 ec1Var = tnVar.s;
        View F = ec1Var.F(this);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = tnVar.M;
            if (i10 == tnVar.J && b10 == (tnVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        tn tnVar = this.F.d;
        ec1 ec1Var = tnVar.s;
        View F = ec1Var.F(c6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return tnVar.L[b10 - tnVar.t0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        tn tnVar = this.F.d;
        if (tnVar.n && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.co.k8(menu, ((org.telegram.ui.co) tnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        tn tnVar = this.F.d;
        if (z10 && tnVar.c0 && !tnVar.b0) {
            Arrays.fill(tnVar.L, false);
            tnVar.s.getChildCount();
            for (int i10 = tnVar.t0; i10 < tnVar.t0 + tnVar.M; i10++) {
                s4.c1 K = tnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        ec1 ec1Var = tnVar.s;
        View F = ec1Var.F(c6Var);
        s4.c1 T = F == null ? null : ec1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            tnVar.L[b10 - tnVar.t0] = z10;
        }
        tnVar.T();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        tn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        tn.N(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.b.t1(b6Var, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        tn tnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            tnVar.s.getClass();
            int R = RecyclerView.R(this) - tnVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < tnVar.J) {
                    for (int length = tnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = tnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    tnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    tnVar.M++;
                    i10++;
                }
                tnVar.h0();
                tnVar.k0 = (tnVar.t0 + i10) - 1;
                tnVar.s.setItemAnimator(tnVar.v);
                tnVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean o() {
        return this.F.d.c0;
    }
}
