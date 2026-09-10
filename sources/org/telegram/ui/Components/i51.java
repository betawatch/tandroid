package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i51 extends vz {
    public final /* synthetic */ r51 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(r51 r51Var, int i10, h51 h51Var) {
        super(5, i10, h51Var);
        this.Y = r51Var;
    }

    @Override // org.telegram.ui.Components.vz
    public final boolean D1() {
        r51 r51Var = this.Y;
        return r51Var.n.getAdapter() == r51Var.v;
    }

    @Override // s4.c0
    public final boolean Y0() {
        return LocaleController.isRTL;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        r51 r51Var = this.Y;
        if (r51Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (r51Var.L != null) {
            return 0;
        }
        if (r51Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                h51 h51Var = r51Var.n;
                View q6 = q(i12);
                h51Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = r51Var.r.m(i11)) != null && m10.getTop() - i10 > AndroidUtilities.dp(58.0f)) {
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
