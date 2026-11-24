// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class eeb extends qx2 implements ps4 {
    private final int arity;

    public eeb(int i, px2 px2Var) {
        super(px2Var);
        this.arity = i;
    }

    @Override // ps4
    public int getArity() {
        return this.arity;
    }

    @Override // og0
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        h79.a.getClass();
        return i79.a(this);
    }
}
