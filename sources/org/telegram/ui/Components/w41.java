package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class w41 extends oz {
    public final /* synthetic */ f51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(f51 f51Var, int i10, v41 v41Var) {
        super(5, i10, v41Var);
        this.Y = f51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        f51 f51Var = this.Y;
        return f51Var.n.getAdapter() == f51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        f51 f51Var = this.Y;
        if (f51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (f51Var.L != null) {
            return 0;
        }
        if (f51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                v41 v41Var = f51Var.n;
                View q6 = q(i12);
                v41Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = f51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
