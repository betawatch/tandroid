package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class un extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ vn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un(vn vnVar, Context context, int i10, on onVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, onVar, d6Var);
        this.F = vnVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        xn xnVar = this.F.d;
        xb1 xb1Var = xnVar.s;
        View F = xb1Var.F(this);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = xnVar.M;
            if (i10 == xnVar.J && b10 == (xnVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        xn xnVar = this.F.d;
        xb1 xb1Var = xnVar.s;
        View F = xb1Var.F(d6Var);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return xnVar.L[b10 - xnVar.t0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        xn xnVar = this.F.d;
        if (xnVar.n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.yn.k8(menu, ((org.telegram.ui.yn) xnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        xn xnVar = this.F.d;
        if (z10 && xnVar.c0 && !xnVar.b0) {
            Arrays.fill(xnVar.L, false);
            xnVar.s.getChildCount();
            for (int i10 = xnVar.t0; i10 < xnVar.t0 + xnVar.M; i10++) {
                s4.c1 K = xnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        xb1 xb1Var = xnVar.s;
        View F = xb1Var.F(d6Var);
        s4.c1 T = F == null ? null : xb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            xnVar.L[b10 - xnVar.t0] = z10;
        }
        xnVar.R();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        xn.K(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        xn.L(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.s1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        xn xnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            xnVar.s.getClass();
            int R = RecyclerView.R(this) - xnVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < xnVar.J) {
                    for (int length = xnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = xnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    xnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    xnVar.M++;
                    i10++;
                }
                xnVar.h0();
                xnVar.k0 = (xnVar.t0 + i10) - 1;
                xnVar.s.setItemAnimator(xnVar.v);
                xnVar.r.l();
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
