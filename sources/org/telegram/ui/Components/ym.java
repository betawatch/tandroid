package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.Cells.z5 {
    public final /* synthetic */ org.telegram.ui.n4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(org.telegram.ui.n4 n4Var, Context context, int i3, tm tmVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, tmVar, e6Var);
        this.G = n4Var;
        ((an) n4Var.e).s.getChildCount();
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean e() {
        an anVar = (an) this.G.e;
        org.telegram.ui.u51 u51Var = anVar.s;
        View F = u51Var.F(this);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i3 = anVar.N;
            if (i3 == anVar.K && b10 == (anVar.u0 + i3) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean f(org.telegram.ui.Cells.z5 z5Var) {
        int b10;
        an anVar = (an) this.G.e;
        org.telegram.ui.u51 u51Var = anVar.s;
        View F = u51Var.F(z5Var);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return anVar.M[b10 - anVar.u0];
    }

    @Override // org.telegram.ui.Cells.z5
    public final void g(ai.z zVar, ActionMode actionMode) {
        an anVar = (an) this.G.e;
        if (anVar.n && zVar.isFocused() && zVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.wm.A8(menu, ((org.telegram.ui.wm) anVar.b.X1).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.z5
    public final void h(org.telegram.ui.Cells.z5 z5Var, boolean z10) {
        int b10;
        an anVar = (an) this.G.e;
        if (z10 && anVar.d0 && !anVar.c0) {
            Arrays.fill(anVar.M, false);
            for (int i3 = anVar.u0; i3 < anVar.u0 + anVar.N; i3++) {
                u4.d1 K = anVar.s.K(i3);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(z5Var, z10);
        org.telegram.ui.u51 u51Var = anVar.s;
        View F = u51Var.F(z5Var);
        u4.d1 T = F == null ? null : u51Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            anVar.M[b10 - anVar.u0] = z10;
        }
        anVar.X();
    }

    @Override // org.telegram.ui.Cells.z5
    public final void i(boolean z10) {
        an.Q((an) this.G.e, this, z10);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void j(org.telegram.ui.Cells.z5 z5Var) {
        an.R((an) this.G.e, z5Var);
    }

    @Override // org.telegram.ui.Cells.z5
    public final void k(ai.z zVar) {
        ((an) this.G.e).b.h1(zVar, true);
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean l(ArrayList arrayList) {
        an anVar = (an) this.G.e;
        if (!arrayList.isEmpty()) {
            anVar.s.getClass();
            int R = RecyclerView.R(this) - anVar.u0;
            if (R >= 0) {
                ai.z zVar = this.d;
                zVar.getText().replace(zVar.getSelectionStart(), zVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i3 = R + 1;
                while (!arrayList.isEmpty() && i3 < anVar.K) {
                    for (int length = anVar.L.length - 1; length > i3; length--) {
                        CharSequence[] charSequenceArr = anVar.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    anVar.L[i3] = (CharSequence) arrayList.remove(0);
                    anVar.N++;
                    i3++;
                }
                anVar.n0();
                anVar.l0 = (anVar.u0 + i3) - 1;
                anVar.s.setItemAnimator(anVar.w);
                anVar.r.f();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.z5
    public final boolean o() {
        return ((an) this.G.e).d0;
    }
}
