// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
