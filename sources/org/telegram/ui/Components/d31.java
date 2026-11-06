package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d31 extends ky {
    public final /* synthetic */ n31 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(n31 n31Var, int i7, c31 c31Var) {
        super(5, i7, c31Var);
        this.Y = n31Var;
    }

    @Override // org.telegram.ui.Components.ky
    public final boolean D1() {
        n31 n31Var = this.Y;
        return n31Var.n.getAdapter() == n31Var.w;
    }

    @Override // v4.b0
    public final boolean Y0() {
        return org.telegram.messenger.hd.a0;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        n31 n31Var = this.Y;
        if (n31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (n31Var.L != null) {
            return 0;
        }
        if (n31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                c31 c31Var = n31Var.n;
                View q10 = q(i11);
                c31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = n31Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, v0Var, a1Var);
    }

    @Override // v4.s, v4.b0, v4.n0
    public final boolean y0() {
        return false;
    }
}
