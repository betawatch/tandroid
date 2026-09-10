package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wn extends org.telegram.ui.Cells.e6 {
    public final /* synthetic */ xn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(xn xnVar, Context context, int i10, rn rnVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, rnVar, f6Var);
        this.F = xnVar;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean e() {
        zn znVar = this.F.d;
        ic1 ic1Var = znVar.s;
        View F = ic1Var.F(this);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = znVar.M;
            if (i10 == znVar.J && b10 == (znVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean f(org.telegram.ui.Cells.e6 e6Var) {
        int b10;
        zn znVar = this.F.d;
        ic1 ic1Var = znVar.s;
        View F = ic1Var.F(e6Var);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return znVar.L[b10 - znVar.t0];
    }

    @Override // org.telegram.ui.Cells.e6
    public final void g(org.telegram.ui.Cells.d6 d6Var, ActionMode actionMode) {
        zn znVar = this.F.d;
        if (znVar.n && d6Var.isFocused() && d6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.eo.k8(menu, ((org.telegram.ui.eo) znVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.e6
    public final void h(org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        zn znVar = this.F.d;
        if (z10 && znVar.c0 && !znVar.b0) {
            Arrays.fill(znVar.L, false);
            znVar.s.getChildCount();
            for (int i10 = znVar.t0; i10 < znVar.t0 + znVar.M; i10++) {
                s4.c1 K = znVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(e6Var, z10);
        ic1 ic1Var = znVar.s;
        View F = ic1Var.F(e6Var);
        s4.c1 T = F == null ? null : ic1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            znVar.L[b10 - znVar.t0] = z10;
        }
        znVar.T();
    }

    @Override // org.telegram.ui.Cells.e6
    public final void i(boolean z10) {
        zn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void j(org.telegram.ui.Cells.e6 e6Var) {
        zn.N(this.F.d, e6Var);
    }

    @Override // org.telegram.ui.Cells.e6
    public final void k(org.telegram.ui.Cells.d6 d6Var) {
        this.F.d.b.t1(d6Var, true);
    }

    @Override // org.telegram.ui.Cells.e6
    public final boolean l(ArrayList arrayList) {
        zn znVar = this.F.d;
        if (!arrayList.isEmpty()) {
            znVar.s.getClass();
            int R = RecyclerView.R(this) - znVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.d6 d6Var = this.d;
                d6Var.getText().replace(d6Var.getSelectionStart(), d6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < znVar.J) {
                    for (int length = znVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = znVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    znVar.K[i10] = (CharSequence) arrayList.remove(0);
                    znVar.M++;
                    i10++;
                }
                znVar.h0();
                znVar.k0 = (znVar.t0 + i10) - 1;
                znVar.s.setItemAnimator(znVar.v);
                znVar.r.l();
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
