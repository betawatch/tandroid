package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t51 extends xz {
    public final /* synthetic */ c61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(c61 c61Var, int i10, s51 s51Var) {
        super(5, i10, s51Var);
        this.Y = c61Var;
    }

    @Override // org.telegram.ui.Components.xz
    public final boolean D1() {
        c61 c61Var = this.Y;
        return c61Var.n.getAdapter() == c61Var.v;
    }

    @Override // s4.b0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        View m10;
        c61 c61Var = this.Y;
        if (c61Var.N) {
            return super.o0(i10, eVar, y0Var);
        }
        int i12 = 0;
        if (c61Var.L != null) {
            return 0;
        }
        if (c61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                s51 s51Var = c61Var.n;
                View q6 = q(i12);
                s51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = c61Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
