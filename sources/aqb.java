// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
