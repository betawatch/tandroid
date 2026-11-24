// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class c2 implements ay2 {
    public final by2 a;

    public c2(by2 by2Var) {
        this.a = by2Var;
    }

    @Override // cy2
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    @Override // cy2
    public ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override // ay2
    public final by2 getKey() {
        return this.a;
    }

    @Override // cy2
    public cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    @Override // cy2
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }
}
