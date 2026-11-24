// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class loa implements px2, my2 {
    public final px2 a;
    public final cy2 b;

    public loa(px2 px2Var, cy2 cy2Var) {
        this.a = px2Var;
        this.b = cy2Var;
    }

    @Override // my2
    public final my2 getCallerFrame() {
        px2 px2Var = this.a;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }

    @Override // px2
    public final cy2 getContext() {
        return this.b;
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
