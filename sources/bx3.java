// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bx3 extends mz3 {
    public final /* synthetic */ ex3 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx3(ex3 ex3Var, Context context, ylb ylbVar) {
        super(context, ylbVar, false, false, false, true, 0, null, cmb.v0(cmb.u6, ylbVar), false);
        this.g0 = ex3Var;
    }

    @Override // mz3
    public final boolean h(int i) {
        int i2;
        int paddingTop;
        hx3 hx3Var;
        ex3 ex3Var = this.g0;
        uw3 uw3Var = ex3Var.b;
        dx3 dx3Var = ex3Var.c;
        ix3 ix3Var = ex3Var.f;
        int i3 = 0;
        if (this.d) {
            return false;
        }
        if (ix3Var != null && (hx3Var = ix3Var.h) != null) {
            if (hx3Var.getSelectedCategory() != null) {
                int i4 = uw3.q3;
                uw3Var.z1(0, 0);
                ix3Var.h.I1(null);
            }
            ix3Var.h.G1();
            ix3Var.b();
        }
        if (dx3Var != null) {
            dx3Var.D(null);
        }
        while (true) {
            if (i3 >= dx3Var.E.size()) {
                i2 = -1;
                break;
            }
            i2 = dx3Var.E.keyAt(i3);
            if (dx3Var.E.valueAt(i3) == i) {
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            float f = ex3Var.n;
            if (f >= 0.0f) {
                paddingTop = uw3Var.getPaddingTop();
            } else {
                f = ex3Var.b();
                ex3Var.n = f;
                paddingTop = uw3Var.getPaddingTop();
            }
            int L = ((int) (f + paddingTop)) - gm.L(102.0f);
            int i5 = uw3.q3;
            uw3Var.z1(i2, L);
        }
        return true;
    }
}
