package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u51 extends rz {
    public final /* synthetic */ d61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(d61 d61Var, int i10, t51 t51Var) {
        super(5, i10, t51Var);
        this.Y = d61Var;
    }

    @Override // org.telegram.ui.Components.rz
    public final boolean D1() {
        d61 d61Var = this.Y;
        return d61Var.n.getAdapter() == d61Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        d61 d61Var = this.Y;
        if (d61Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (d61Var.L != null) {
            return 0;
        }
        if (d61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                t51 t51Var = d61Var.n;
                View q6 = q(i12);
                t51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = d61Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
