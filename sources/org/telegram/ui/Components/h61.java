package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h61 extends xz {
    public final /* synthetic */ q61 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(q61 q61Var, int i10, g61 g61Var) {
        super(5, i10, g61Var);
        this.Y = q61Var;
    }

    @Override // org.telegram.ui.Components.xz
    public final boolean E1() {
        q61 q61Var = this.Y;
        return q61Var.n.getAdapter() == q61Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int i11;
        View m10;
        q61 q61Var = this.Y;
        if (q61Var.N) {
            return super.o0(i10, eVar, b1Var);
        }
        int i12 = 0;
        if (q61Var.L != null) {
            return 0;
        }
        if (q61Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                g61 g61Var = q61Var.n;
                View q5 = q(i12);
                g61Var.getClass();
                int R = RecyclerView.R(q5);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = q61Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
                i10 = m10.getTop() - AndroidUtilities.dp(58.0f);
            }
        }
        return super.o0(i10, eVar, b1Var);
    }

    @Override // s4.t, s4.c0, s4.p0
    public final boolean y0() {
        return false;
    }
}
