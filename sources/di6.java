// default package

import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class di6 extends i3d {
    public final HashMap l;
    public final HashMap m;

    public di6(rg0 rg0Var) {
        super(new ml6(rg0Var, false));
        this.l = new HashMap();
        this.m = new HashMap();
    }

    @Override // rg0
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        return this.k.c(vz6Var, rx6Var, j);
    }

    @Override // i3d, rg0
    public final asb h() {
        return new ci6(((ml6) this.k).o, (byte) 0);
    }

    @Override // i3d, rg0
    public final boolean j() {
        return false;
    }

    @Override // rg0
    public final void o(xt6 xt6Var) {
        this.k.o(xt6Var);
        vz6 vz6Var = (vz6) this.m.remove(xt6Var);
        if (vz6Var != null) {
            this.l.remove(vz6Var);
        }
    }

    @Override // i3d
    public final vz6 z(vz6 vz6Var) {
        return vz6Var;
    }
}
