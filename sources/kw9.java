// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kw9 extends qie {
    public final /* synthetic */ ow9 a;

    public kw9(ow9 ow9Var) {
        this.a = ow9Var;
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        ow9 ow9Var = this.a;
        return ((lw9) ow9Var.n.get(i)).equals(ow9Var.r.get(i2));
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        ow9 ow9Var = this.a;
        return ((lw9) ow9Var.n.get(i)).a.h == ((lw9) ow9Var.r.get(i2)).a.h;
    }

    @Override // qie
    public final int c() {
        return this.a.r.size();
    }

    @Override // qie
    public final int d() {
        return this.a.n.size();
    }
}
