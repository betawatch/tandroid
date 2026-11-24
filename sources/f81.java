// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f81 implements f59 {
    public final /* synthetic */ r59 a;
    public final /* synthetic */ g81 b;

    public f81(g81 g81Var, r59 r59Var) {
        this.b = g81Var;
        this.a = r59Var;
    }

    @Override // f59
    public final void g(int i, View view) {
        w81 w81Var = this.b.f;
        r59 r59Var = this.a;
        h81 h81Var = (h81) r59Var.getAdapter();
        p81 p81Var = (p81) h81Var.e.get(i);
        if (view instanceof sha) {
            int i2 = w81.H;
            w81Var.c(p81Var, (r81) h81Var, r59Var);
        } else {
            l81 l81Var = w81Var.G;
            if (l81Var != null) {
                l81Var.h(p81Var.c, p81Var.d, false);
            }
        }
    }
}
