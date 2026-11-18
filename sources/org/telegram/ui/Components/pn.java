package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(org.telegram.ui.l4 l4Var, Context context, int i7, kn knVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, knVar, i6Var);
        this.G = l4Var;
        ((rn) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean f() {
        rn rnVar = (rn) this.G.e;
        org.telegram.ui.f61 f61Var = rnVar.s;
        View F = f61Var.F(this);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = rnVar.N;
            if (i7 == rnVar.K && b10 == (rnVar.u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean g(org.telegram.ui.Cells.b6 b6Var) {
        int b10;
        rn rnVar = (rn) this.G.e;
        org.telegram.ui.f61 f61Var = rnVar.s;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return rnVar.M[b10 - rnVar.u0];
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        rn rnVar = (rn) this.G.e;
        if (rnVar.n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) rnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        int b10;
        rn rnVar = (rn) this.G.e;
        if (z10 && rnVar.d0 && !rnVar.c0) {
            Arrays.fill(rnVar.M, false);
            for (int i7 = rnVar.u0; i7 < rnVar.u0 + rnVar.N; i7++) {
                v4.f1 K = rnVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(b6Var, z10);
        org.telegram.ui.f61 f61Var = rnVar.s;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            rnVar.M[b10 - rnVar.u0] = z10;
        }
        rnVar.Y();
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        rn.R((rn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        rn.S((rn) this.G.e, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void l(bi.u uVar) {
        ((rn) this.G.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean m(ArrayList arrayList) {
        rn rnVar = (rn) this.G.e;
        if (!arrayList.isEmpty()) {
            rnVar.s.getClass();
            int R = RecyclerView.R(this) - rnVar.u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < rnVar.K) {
                    for (int length = rnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = rnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    rnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    rnVar.N++;
                    i7++;
                }
                rnVar.n0();
                rnVar.l0 = (rnVar.u0 + i7) - 1;
                rnVar.s.setItemAnimator(rnVar.w);
                rnVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean p() {
        return ((rn) this.G.e).d0;
    }
}
