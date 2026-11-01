package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n41 extends zy {
    public final /* synthetic */ x41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(x41 x41Var, int i10, m41 m41Var) {
        super(5, i10, m41Var);
        this.Y = x41Var;
    }

    @Override // org.telegram.ui.Components.zy
    public final boolean D1() {
        x41 x41Var = this.Y;
        return x41Var.n.getAdapter() == x41Var.w;
    }

    @Override // s4.a0
    public final boolean Y0() {
        return org.telegram.messenger.dd.X;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        View m10;
        x41 x41Var = this.Y;
        if (x41Var.N) {
            return super.o0(i10, eVar, z0Var);
        }
        int i12 = 0;
        if (x41Var.L != null) {
            return 0;
        }
        if (x41Var.M) {
            while (true) {
                i11 = 1;
                if (i12 >= r()) {
                    break;
                }
                m41 m41Var = x41Var.n;
                View q6 = q(i12);
                m41Var.getClass();
                int R = RecyclerView.R(q6);
                if (R < 1) {
                    i11 = R;
                    break;
                }
                i12++;
            }
            if (i11 == 0 && (m10 = x41Var.r.m(i11)) != null && m10.getTop() - i10 > org.telegram.messenger.i0.L(58.0f)) {
                i10 = m10.getTop() - org.telegram.messenger.i0.L(58.0f);
            }
        }
        return super.o0(i10, eVar, z0Var);
    }

    @Override // s4.r, s4.a0, s4.n0
    public final boolean y0() {
        return false;
    }
}
