// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nd5 implements au9 {
    public final /* synthetic */ od5 a;

    public nd5(od5 od5Var) {
        this.a = od5Var;
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return this.a.x.Y1;
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // au9
    public final void o(int i) {
        od5 od5Var = this.a;
        pd5 pd5Var = od5Var.x;
        if (i < 0 || i != od5Var.n || od5Var.h) {
            return;
        }
        int i2 = od5Var.f - 1;
        boolean z = pd5Var.t1.getVisibility() == 0;
        od5Var.f();
        if (od5Var.f > i2) {
            pd5Var.J0(i2);
        }
        if (od5Var.d.e() || !pd5Var.n1.S0()) {
            return;
        }
        pd5Var.t1.e(false, z);
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
    }
}
