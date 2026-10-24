package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class z51 extends xz {
    public final /* synthetic */ i61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z51(i61 i61Var, int i10, y51 y51Var) {
        super(5, i10, y51Var);
        this.Y = i61Var;
    }

    @Override // org.telegram.ui.Components.xz
    public final boolean D1() {
        i61 i61Var = this.Y;
        return i61Var.n.getAdapter() == i61Var.v;
    }

    @Override // s4.b0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int i11;
        View m10;
        i61 i61Var = this.Y;
        if (i61Var.N) {
            return super.o0(i10, eVar, y0Var);
        }
        int i12 = 0;
        if (i61Var.L != null) {
            return 0;
        }
        if (i61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                y51 y51Var = i61Var.n;
                View q6 = q(i12);
                y51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = i61Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
