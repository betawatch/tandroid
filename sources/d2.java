// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class d2 implements kx2 {
    public final lx2 a;

    public d2(lx2 lx2Var) {
        this.a = lx2Var;
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    @Override // mx2
    public kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override // kx2
    public final lx2 getKey() {
        return this.a;
    }

    @Override // mx2
    public mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }
}
