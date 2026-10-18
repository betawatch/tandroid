package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s51 extends xz {
    public final /* synthetic */ b61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(b61 b61Var, int i10, r51 r51Var) {
        super(5, i10, r51Var);
        this.Y = b61Var;
    }

    @Override // org.telegram.ui.Components.xz
    public final boolean D1() {
        b61 b61Var = this.Y;
        return b61Var.n.getAdapter() == b61Var.v;
    }

    @Override // s4.b0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        View m10;
        b61 b61Var = this.Y;
        if (b61Var.N) {
            return super.o0(i10, eVar, y0Var);
        }
        int i12 = 0;
        if (b61Var.L != null) {
            return 0;
        }
        if (b61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                r51 r51Var = b61Var.n;
                View q6 = q(i12);
                r51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = b61Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, y0Var);
    }

    @Override // s4.s, s4.b0, s4.n0
    public final boolean y0() {
        return false;
    }
}
