package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k51 extends oz {
    public final /* synthetic */ t51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(t51 t51Var, int i10, j51 j51Var) {
        super(5, i10, j51Var);
        this.Y = t51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        t51 t51Var = this.Y;
        return t51Var.n.getAdapter() == t51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        t51 t51Var = this.Y;
        if (t51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (t51Var.L != null) {
            return 0;
        }
        if (t51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                j51 j51Var = t51Var.n;
                View q6 = q(i12);
                j51Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = t51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.s, s4.c0, s4.o0
    public final boolean y0() {
        return false;
    }
}
