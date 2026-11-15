package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o31 extends py {
    public final /* synthetic */ x31 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(x31 x31Var, int i7, n31 n31Var) {
        super(5, i7, n31Var);
        this.Y = x31Var;
    }

    @Override // org.telegram.ui.Components.py
    public final boolean D1() {
        x31 x31Var = this.Y;
        return x31Var.n.getAdapter() == x31Var.w;
    }

    @Override // v4.b0
    public final boolean Y0() {
        return org.telegram.messenger.hd.a0;
    }

    @Override // v4.s, v4.b0, v4.o0
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        int i10;
        View m10;
        x31 x31Var = this.Y;
        if (x31Var.O) {
            return super.o0(i7, w0Var, b1Var);
        }
        int i11 = 0;
        if (x31Var.M != null) {
            return 0;
        }
        if (x31Var.N) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                n31 n31Var = x31Var.n;
                View q10 = q(i11);
                n31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = x31Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
                i7 = m10.getTop() - org.telegram.messenger.g0.L(58.0f);
            }
        }
        return super.o0(i7, w0Var, b1Var);
    }

    @Override // v4.s, v4.b0, v4.o0
    public final boolean y0() {
        return false;
    }
}
