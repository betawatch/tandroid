package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ org.telegram.ui.l4 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(org.telegram.ui.l4 l4Var, Context context, int i7, tm tmVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, tmVar, h6Var);
        this.F = l4Var;
        ((an) l4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean e() {
        an anVar = (an) this.F.e;
        org.telegram.ui.g61 g61Var = anVar.s;
        View F = g61Var.F(this);
        v4.d1 T = F == null ? null : g61Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i7 = anVar.M;
            if (i7 == anVar.J && b10 == (anVar.t0 + i7) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        an anVar = (an) this.F.e;
        org.telegram.ui.g61 g61Var = anVar.s;
        View F = g61Var.F(a6Var);
        v4.d1 T = F == null ? null : g61Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return anVar.L[b10 - anVar.t0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(org.telegram.ui.Cells.z5 z5Var, ActionMode actionMode) {
        an anVar = (an) this.F.e;
        if (anVar.n && z5Var.isFocused() && z5Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.cn.B8(menu, ((org.telegram.ui.cn) anVar.b.Z1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z9) {
        int b10;
        an anVar = (an) this.F.e;
        if (z9 && anVar.c0 && !anVar.b0) {
            Arrays.fill(anVar.L, false);
            for (int i7 = anVar.t0; i7 < anVar.t0 + anVar.M; i7++) {
                v4.d1 K = anVar.s.K(i7);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z9);
        org.telegram.ui.g61 g61Var = anVar.s;
        View F = g61Var.F(a6Var);
        v4.d1 T = F == null ? null : g61Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            anVar.L[b10 - anVar.t0] = z9;
        }
        anVar.X();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z9) {
        an.Q((an) this.F.e, this, z9);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        an.R((an) this.F.e, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(org.telegram.ui.Cells.z5 z5Var) {
        ((an) this.F.e).b.h1(z5Var, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.F.e;
        if (!arrayList.isEmpty()) {
            anVar.s.getClass();
            int R = RecyclerView.R(this) - anVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.z5 z5Var = this.d;
                z5Var.getText().replace(z5Var.getSelectionStart(), z5Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i7 = R + 1;
                while (!arrayList.isEmpty() && i7 < anVar.J) {
                    for (int length = anVar.K.length - 1; length > i7; length--) {
                        CharSequence[] charSequenceArr = anVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    anVar.K[i7] = (CharSequence) arrayList.remove(0);
                    anVar.M++;
                    i7++;
                }
                anVar.n0();
                anVar.k0 = (anVar.t0 + i7) - 1;
                anVar.s.setItemAnimator(anVar.w);
                anVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean o() {
        return ((an) this.F.e).c0;
    }
}
