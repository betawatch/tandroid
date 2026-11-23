package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b41 extends xy {
    public final /* synthetic */ k41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(k41 k41Var, int i7, a41 a41Var) {
        super(5, i7, a41Var);
        this.Y = k41Var;
    }

    @Override // org.telegram.ui.Components.xy
    public final boolean D1() {
        k41 k41Var = this.Y;
        return k41Var.n.getAdapter() == k41Var.w;
    }

    @Override // v4.c0
    public final boolean Y0() {
        return org.telegram.messenger.hd.a0;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        View m10;
        k41 k41Var = this.Y;
        if (k41Var.O) {
            return super.o0(i7, x0Var, c1Var);
        }
        int i11 = 0;
        if (k41Var.M != null) {
            return 0;
        }
        if (k41Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                a41 a41Var = k41Var.n;
                View q10 = q(i11);
                a41Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = k41Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, x0Var, c1Var);
    }

    @Override // v4.t, v4.c0, v4.p0
    public final boolean y0() {
        return false;
    }
}
