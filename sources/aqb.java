// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class aqb implements hqb {
    public boolean a;
    public final /* synthetic */ zu1 b;

    public aqb(zu1 zu1Var, boolean z) {
        this.b = zu1Var;
        this.a = z;
    }

    @Override // hqb
    public final boolean a() {
        return this.a;
    }

    @Override // hqb
    public final boolean s() {
        return true;
    }

    @Override // hqb
    public final void w(boolean z) {
        boolean z2 = !this.a;
        this.a = z2;
        xu1 xu1Var = this.b.Ba;
        xu1Var.q(xu1Var.f, xu1Var.g, z, Boolean.valueOf(z2), false);
    }
}
