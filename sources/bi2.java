// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bi2 implements eja {
    public final /* synthetic */ zh2 a;
    public final /* synthetic */ di2 b;

    public bi2(di2 di2Var, zh2 zh2Var) {
        this.b = di2Var;
        this.a = zh2Var;
    }

    @Override // eja
    public final void k(int i) {
        di2 di2Var = this.b;
        di2Var.t1 = i;
        di2Var.E0(true);
    }

    @Override // eja
    public final void n() {
        int measuredHeight = this.b.n1.getMeasuredHeight();
        zh2 zh2Var = this.a;
        zh2Var.z(0 - zh2Var.getScrollX(), measuredHeight - zh2Var.getScrollY(), false);
    }
}
