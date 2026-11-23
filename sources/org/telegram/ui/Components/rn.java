package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class rn extends org.telegram.ui.Cells.b6 {
    public final /* synthetic */ org.telegram.ui.l4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(org.telegram.ui.l4 l4Var, Context context, int i7, mn mnVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, mnVar, h6Var);
        this.G = l4Var;
        ((tn) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean f() {
        tn tnVar = (tn) this.G.e;
        org.telegram.ui.f61 f61Var = tnVar.s;
        View F = f61Var.F(this);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = tnVar.N;
            if (i7 == tnVar.K && b10 == (tnVar.u0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean g(org.telegram.ui.Cells.b6 b6Var) {
        int b10;
        tn tnVar = (tn) this.G.e;
        org.telegram.ui.f61 f61Var = tnVar.s;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return tnVar.M[b10 - tnVar.u0];
    }

    @Override // org.telegram.ui.Cells.b6
    public final void h(bi.u uVar, ActionMode actionMode) {
        tn tnVar = (tn) this.G.e;
        if (tnVar.n && uVar.isFocused() && uVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.bn.C8(menu, ((org.telegram.ui.bn) tnVar.b.a2).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.b6
    public final void i(org.telegram.ui.Cells.b6 b6Var, boolean z10) {
        int b10;
        tn tnVar = (tn) this.G.e;
        if (z10 && tnVar.d0 && !tnVar.c0) {
            Arrays.fill(tnVar.M, false);
            for (int i7 = tnVar.u0; i7 < tnVar.u0 + tnVar.N; i7++) {
                v4.f1 K = tnVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(b6Var, z10);
        org.telegram.ui.f61 f61Var = tnVar.s;
        View F = f61Var.F(b6Var);
        v4.f1 T = F == null ? null : f61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            tnVar.M[b10 - tnVar.u0] = z10;
        }
        tnVar.Y();
    }

    @Override // org.telegram.ui.Cells.b6
    public final void j(boolean z10) {
        tn.R((tn) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void k(org.telegram.ui.Cells.b6 b6Var) {
        tn.S((tn) this.G.e, b6Var);
    }

    @Override // org.telegram.ui.Cells.b6
    public final void l(bi.u uVar) {
        ((tn) this.G.e).b.i1(uVar, true);
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean m(ArrayList arrayList) {
        tn tnVar = (tn) this.G.e;
        if (!arrayList.isEmpty()) {
            tnVar.s.getClass();
            int R = RecyclerView.R(this) - tnVar.u0;
            if (R >= 0) {
                bi.u uVar = this.d;
                uVar.getText().replace(uVar.getSelectionStart(), uVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < tnVar.K) {
                    for (int length = tnVar.L.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = tnVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    tnVar.L[i7] = (CharSequence) arrayList.remove(0);
                    tnVar.N++;
                    i7++;
                }
                tnVar.n0();
                tnVar.l0 = (tnVar.u0 + i7) - 1;
                tnVar.s.setItemAnimator(tnVar.w);
                tnVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.b6
    public final boolean p() {
        return ((tn) this.G.e).d0;
    }
}
