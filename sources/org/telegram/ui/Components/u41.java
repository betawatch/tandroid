package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u41 extends pz {
    public final /* synthetic */ d51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u41(d51 d51Var, int i10, t41 t41Var) {
        super(5, i10, t41Var);
        this.Y = d51Var;
    }

    @Override // org.telegram.ui.Components.pz
    public final boolean D1() {
        d51 d51Var = this.Y;
        return d51Var.n.getAdapter() == d51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        d51 d51Var = this.Y;
        if (d51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (d51Var.L != null) {
            return 0;
        }
        if (d51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                t41 t41Var = d51Var.n;
                View q6 = q(i12);
                t41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = d51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
