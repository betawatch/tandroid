package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zm extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(org.telegram.ui.l4 l4Var, Context context, int i7, um umVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, umVar, f6Var);
        this.F = l4Var;
        ((bn) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean e() {
        bn bnVar = (bn) this.F.e;
        org.telegram.ui.e61 e61Var = bnVar.s;
        View F = e61Var.F(this);
        v4.d1 T = F == null ? null : e61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = bnVar.M;
            if (i7 == bnVar.J && b10 == (bnVar.t0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        bn bnVar = (bn) this.F.e;
        org.telegram.ui.e61 e61Var = bnVar.s;
        View F = e61Var.F(a6Var);
        v4.d1 T = F == null ? null : e61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return bnVar.L[b10 - bnVar.t0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        bn bnVar = (bn) this.F.e;
        if (bnVar.n && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.an.A8(menu, ((org.telegram.ui.an) bnVar.b.W1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        int b10;
        bn bnVar = (bn) this.F.e;
        if (z9 && bnVar.c0 && !bnVar.b0) {
            Arrays.fill(bnVar.L, false);
            for (int i7 = bnVar.t0; i7 < bnVar.t0 + bnVar.M; i7++) {
                v4.d1 K = bnVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        org.telegram.ui.e61 e61Var = bnVar.s;
        View F = e61Var.F(a6Var);
        v4.d1 T = F == null ? null : e61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            bnVar.L[b10 - bnVar.t0] = z9;
        }
        bnVar.X();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        bn.Q((bn) this.F.e, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        bn.R((bn) this.F.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((bn) this.F.e).b.h1(z5Var, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        bn bnVar = (bn) this.F.e;
        if (!arrayList.isEmpty()) {
            bnVar.s.getClass();
            int R = RecyclerView.R(this) - bnVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < bnVar.J) {
                    for (int length = bnVar.K.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = bnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    bnVar.K[i7] = (CharSequence) arrayList.remove(0);
                    bnVar.M++;
                    i7++;
                }
                bnVar.n0();
                bnVar.k0 = (bnVar.t0 + i7) - 1;
                bnVar.s.setItemAnimator(bnVar.w);
                bnVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean o() {
        return ((bn) this.F.e).c0;
    }
}
