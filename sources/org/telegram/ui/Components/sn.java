package org.telegram.ui.Components;

import android.R;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class sn extends org.telegram.ui.Cells.d6 {
    public final /* synthetic */ tn F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(tn tnVar, Context context, int i10, mn mnVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, mnVar, d6Var);
        this.F = tnVar;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean e() {
        vn vnVar = this.F.d;
        wb1 wb1Var = vnVar.s;
        View F = wb1Var.F(this);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null) {
            int b10 = T.b();
            int i10 = vnVar.M;
            if (i10 == vnVar.J && b10 == (vnVar.t0 + i10) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean f(org.telegram.ui.Cells.d6 d6Var) {
        int b10;
        vn vnVar = this.F.d;
        wb1 wb1Var = vnVar.s;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T == null || (b10 = T.b()) == -1) {
            return false;
        }
        return vnVar.L[b10 - vnVar.t0];
    }

    @Override // org.telegram.ui.Cells.d6
    public final void g(org.telegram.ui.Cells.c6 c6Var, ActionMode actionMode) {
        vn vnVar = this.F.d;
        if (vnVar.n && c6Var.isFocused() && c6Var.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(R.id.copy) == null) {
                return;
            }
            org.telegram.ui.xn.k8(menu, ((org.telegram.ui.xn) vnVar.b.f0).h, false, true, true, true);
        }
    }

    @Override // org.telegram.ui.Cells.d6
    public final void h(org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        vn vnVar = this.F.d;
        if (z10 && vnVar.c0 && !vnVar.b0) {
            Arrays.fill(vnVar.L, false);
            vnVar.s.getChildCount();
            for (int i10 = vnVar.t0; i10 < vnVar.t0 + vnVar.M; i10++) {
                s4.c1 K = vnVar.s.K(i10);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof org.telegram.ui.Cells.d6) {
                        ((org.telegram.ui.Cells.d6) view).r.a(false, true);
                    }
                }
            }
        }
        super.h(d6Var, z10);
        wb1 wb1Var = vnVar.s;
        View F = wb1Var.F(d6Var);
        s4.c1 T = F == null ? null : wb1Var.T(F);
        if (T != null && (b10 = T.b()) != -1) {
            vnVar.L[b10 - vnVar.t0] = z10;
        }
        vnVar.T();
    }

    @Override // org.telegram.ui.Cells.d6
    public final void i(boolean z10) {
        vn.M(this.F.d, this, z10);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void j(org.telegram.ui.Cells.d6 d6Var) {
        vn.N(this.F.d, d6Var);
    }

    @Override // org.telegram.ui.Cells.d6
    public final void k(org.telegram.ui.Cells.c6 c6Var) {
        this.F.d.b.t1(c6Var, true);
    }

    @Override // org.telegram.ui.Cells.d6
    public final boolean l(ArrayList arrayList) {
        vn vnVar = this.F.d;
        if (!arrayList.isEmpty()) {
            vnVar.s.getClass();
            int R = RecyclerView.R(this) - vnVar.t0;
            if (R >= 0) {
                org.telegram.ui.Cells.c6 c6Var = this.d;
                c6Var.getText().replace(c6Var.getSelectionStart(), c6Var.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i10 = R + 1;
                while (!arrayList.isEmpty() && i10 < vnVar.J) {
                    for (int length = vnVar.K.length - 1; length > i10; length--) {
                        CharSequence[] charSequenceArr = vnVar.K;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    vnVar.K[i10] = (CharSequence) arrayList.remove(0);
                    vnVar.M++;
                    i10++;
                }
                vnVar.h0();
                vnVar.k0 = (vnVar.t0 + i10) - 1;
                vnVar.s.setItemAnimator(vnVar.v);
                vnVar.r.l();
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
