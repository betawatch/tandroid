package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j31 extends ly {
    public final /* synthetic */ t31 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(t31 t31Var, int i7, i31 i31Var) {
        super(5, i7, i31Var);
        this.Y = t31Var;
    }

    @Override // org.telegram.ui.Components.ly
    public final boolean D1() {
        t31 t31Var = this.Y;
        return t31Var.n.getAdapter() == t31Var.w;
    }

    @Override // v4.b0
    public final boolean Y0() {
        return org.telegram.messenger.id.a0;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int i10;
        View m10;
        t31 t31Var = this.Y;
        if (t31Var.N) {
            return super.o0(i7, v0Var, a1Var);
        }
        int i11 = 0;
        if (t31Var.L != null) {
            return 0;
        }
        if (t31Var.M) {
            while (true) {
                i10 = 1;
                if (i11 >= r()) {
                    break;
                }
                i31 i31Var = t31Var.n;
                View q10 = q(i11);
                i31Var.getClass();
                int R = RecyclerView.R(q10);
                if (R < 1) {
                    i10 = R;
                    break;
                }
                i11++;
            }
            if (i10 == 0 && (m10 = t31Var.r.m(i10)) != null && m10.getTop() - i7 > org.telegram.messenger.g0.L(58.0f)) {
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
