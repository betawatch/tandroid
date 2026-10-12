package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.kc1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fo extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ go F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(go goVar, Context context, int i10, yn ynVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, ynVar, c6Var);
        this.F = goVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean d() {
        io ioVar = this.F.d;
        kc1 kc1Var = ioVar.s;
        View F = kc1Var.F(this);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = ioVar.M;
            if (i10 == ioVar.J && b10 == (ioVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        io ioVar = this.F.d;
        kc1 kc1Var = ioVar.s;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return ioVar.L[b10 - ioVar.t0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        io ioVar = this.F.d;
        if (ioVar.n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.fo.n8(menu, ((org.telegram.ui.fo) ioVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        io ioVar = this.F.d;
        if (z10 && ioVar.c0 && !ioVar.b0) {
            Arrays.fill(ioVar.L, false);
            ioVar.s.getChildCount();
            for (int i10 = ioVar.t0; i10 < ioVar.t0 + ioVar.M; i10++) {
                s4.b1 K = ioVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        kc1 kc1Var = ioVar.s;
        View F = kc1Var.F(d6Var);
        s4.b1 T = F == null ? null : kc1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            ioVar.L[b10 - ioVar.t0] = z10;
        }
        ioVar.W();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        io.P(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        io.Q(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.w1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        io ioVar = this.F.d;
        if (!arrayList.isEmpty()) {
            ioVar.s.getClass();
            int R = RecyclerView.R(this) - ioVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < ioVar.J) {
                    for (int length = ioVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = ioVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    ioVar.K[i10] = (CharSequence) arrayList.remove(0);
                    ioVar.M++;
                    i10++;
                }
                ioVar.k0();
                ioVar.k0 = (ioVar.t0 + i10) - 1;
                ioVar.s.setItemAnimator(ioVar.v);
                ioVar.r.l();
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
