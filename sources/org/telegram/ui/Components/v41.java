package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v41 extends oz {
    public final /* synthetic */ e51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(e51 e51Var, int i10, u41 u41Var) {
        super(5, i10, u41Var);
        this.Y = e51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        e51 e51Var = this.Y;
        return e51Var.n.getAdapter() == e51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        e51 e51Var = this.Y;
        if (e51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (e51Var.L != null) {
            return 0;
        }
        if (e51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                u41 u41Var = e51Var.n;
                View q6 = q(i12);
                u41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = e51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
