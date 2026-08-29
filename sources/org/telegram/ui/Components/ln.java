package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ln extends org.telegram.ui.Cells.a6 {
    public final /* synthetic */ mn B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(mn mnVar, Context context, int i10, gn gnVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, gnVar, c6Var);
        this.B = mnVar;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean e() {
        on onVar = this.B.d;
        wa1 wa1Var = onVar.s;
        View F = wa1Var.F(this);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = onVar.I;
            if (i10 == onVar.F && b10 == (onVar.p0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean f(org.telegram.ui.Cells.a6 a6Var) {
        int b10;
        on onVar = this.B.d;
        wa1 wa1Var = onVar.s;
        View F = wa1Var.F(a6Var);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return onVar.H[b10 - onVar.p0];
    }

    @Override // org.telegram.ui.Cells.a6
    public final void g(bh.b bVar, ActionMode actionMode) {
        on onVar = this.B.d;
        if (onVar.n && bVar.isFocused() && bVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.tn.k8(menu, ((org.telegram.ui.tn) onVar.b.b0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.a6
    public final void h(org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        int b10;
        on onVar = this.B.d;
        if (z10 && onVar.V && !onVar.U) {
            Arrays.fill(onVar.H, false);
            onVar.s.getChildCount();
            for (int i10 = onVar.p0; i10 < onVar.p0 + onVar.I; i10++) {
                f2.n1 K = onVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(a6Var, z10);
        wa1 wa1Var = onVar.s;
        View F = wa1Var.F(a6Var);
        f2.n1 T = F == null ? null : wa1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            onVar.H[b10 - onVar.p0] = z10;
        }
        onVar.T();
    }

    @Override // org.telegram.ui.Cells.a6
    public final void i(boolean z10) {
        on.L(this.B.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void j(org.telegram.ui.Cells.a6 a6Var) {
        on.M(this.B.d, a6Var);
    }

    @Override // org.telegram.ui.Cells.a6
    public final void k(bh.b bVar) {
        this.B.d.b.t1(bVar, true);
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean l(ArrayList arrayList) {
        on onVar = this.B.d;
        if (!arrayList.isEmpty()) {
            onVar.s.getClass();
            int R = RecyclerView.R(this) - onVar.p0;
            if (R >= 0) {
                bh.b bVar = this.d;
                bVar.getText().replace(bVar.getSelectionStart(), bVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < onVar.F) {
                    for (int length = onVar.G.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = onVar.G;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    onVar.G[i10] = (CharSequence) arrayList.remove(0);
                    onVar.I++;
                    i10++;
                }
                onVar.h0();
                onVar.g0 = (onVar.p0 + i10) - 1;
                onVar.s.setItemAnimator(onVar.v);
                onVar.r.l();
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.a6
    public final boolean o() {
        return this.B.d.V;
    }
}
