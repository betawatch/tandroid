// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
