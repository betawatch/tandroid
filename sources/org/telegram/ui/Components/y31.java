package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class y31 extends vy {
    public final /* synthetic */ h41 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(h41 h41Var, int i7, x31 x31Var) {
        super(5, i7, x31Var);
        this.Y = h41Var;
    }

    @Override // org.telegram.ui.Components.vy
    public final boolean D1() {
        h41 h41Var = this.Y;
        return h41Var.n.getAdapter() == h41Var.w;
    }

    @Override // v4.c0
    public final boolean Y0() {
        return org.telegram.messenger.gd.a0;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int i10;
        View m10;
        h41 h41Var = this.Y;
        if (h41Var.O) {
            return super.o0(i7, x0Var, c1Var);
        }
        int i11 = 0;
        if (h41Var.M != null) {
            return 0;
        }
        if (h41Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                x31 x31Var = h41Var.n;
                View q10 = q(i11);
                x31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = h41Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
