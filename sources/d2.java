// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
