package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bo extends org.telegram.ui.Cells.c6 {
    public final /* synthetic */ co F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(co coVar, Context context, int i10, vn vnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, vnVar, d6Var);
        this.F = coVar;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean e() {
        fo foVar = this.F.d;
        sa1 sa1Var = foVar.s;
        View F = sa1Var.F(this);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = foVar.M;
            if (i10 == foVar.J && b10 == (foVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean f(org.telegram.ui.Cells.c6 c6Var) {
        int b10;
        fo foVar = this.F.d;
        sa1 sa1Var = foVar.s;
        View F = sa1Var.F(c6Var);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return foVar.L[b10 - foVar.t0];
    }

    @Override // org.telegram.ui.Cells.c6
    public final void g(org.telegram.ui.Cells.b6 b6Var, ActionMode actionMode) {
        fo foVar = this.F.d;
        if (foVar.n && b6Var.isFocused() && b6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.qn.n8(menu, ((org.telegram.ui.qn) foVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.c6
    public final void h(org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        fo foVar = this.F.d;
        if (z10 && foVar.c0 && !foVar.b0) {
            Arrays.fill(foVar.L, false);
            foVar.s.getChildCount();
            for (int i10 = foVar.t0; i10 < foVar.t0 + foVar.M; i10++) {
                s4.b1 K = foVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.c6) {
                        ((org.telegram.ui.Cells.c6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(c6Var, z10);
        sa1 sa1Var = foVar.s;
        View F = sa1Var.F(c6Var);
        s4.b1 T = F == null ? null : sa1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            foVar.L[b10 - foVar.t0] = z10;
        }
        foVar.W();
    }

    @Override // org.telegram.ui.Cells.c6
    public final void i(boolean z10) {
        fo.P(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void j(org.telegram.ui.Cells.c6 c6Var) {
        fo.Q(this.F.d, c6Var);
    }

    @Override // org.telegram.ui.Cells.c6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        this.F.d.b.w1(b6Var, true);
    }

    @Override // org.telegram.ui.Cells.c6
    public final boolean l(ArrayList arrayList) {
        fo foVar = this.F.d;
        if (!arrayList.isEmpty()) {
            foVar.s.getClass();
            int R = RecyclerView.R(this) - foVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.b6 b6Var = this.d;
                b6Var.getText().replace(b6Var.getSelectionStart(), b6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < foVar.J) {
                    for (int length = foVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = foVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    foVar.K[i10] = (CharSequence) arrayList.remove(0);
                    foVar.M++;
                    i10++;
                }
                foVar.k0();
                foVar.k0 = (foVar.t0 + i10) - 1;
                foVar.s.setItemAnimator(foVar.v);
                foVar.r.l();
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
