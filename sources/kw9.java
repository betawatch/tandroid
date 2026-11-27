// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
