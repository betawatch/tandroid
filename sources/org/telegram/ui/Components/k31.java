package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k31 extends ly {
    public final /* synthetic */ u31 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k31(u31 u31Var, int i7, j31 j31Var) {
        super(5, i7, j31Var);
        this.Y = u31Var;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean D1() {
        u31 u31Var = this.Y;
        return u31Var.n.getAdapter() == u31Var.w;
    }

    @Override // v4.b0
    public final boolean Y0() {
        return org.telegram.messenger.id.a0;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        u31 u31Var = this.Y;
        if (u31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (u31Var.L != null) {
            return 0;
        }
        if (u31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                j31 j31Var = u31Var.n;
                View q10 = q(i11);
                j31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = u31Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
