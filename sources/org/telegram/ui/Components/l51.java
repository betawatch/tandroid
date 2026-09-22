package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l51 extends oz {
    public final /* synthetic */ u51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(u51 u51Var, int i10, k51 k51Var) {
        super(5, i10, k51Var);
        this.Y = u51Var;
    }

    @Override // org.telegram.ui.Components.oz
    public final boolean D1() {
        u51 u51Var = this.Y;
        return u51Var.n.getAdapter() == u51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        u51 u51Var = this.Y;
        if (u51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (u51Var.L != null) {
            return 0;
        }
        if (u51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                k51 k51Var = u51Var.n;
                View q6 = q(i12);
                k51Var.getClass();
                int S = RecyclerView.S(q6);
                if (S < 1) {
                    i11 = S;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = u51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
