// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ky7 implements px2 {
    public final /* synthetic */ ro1 a;

    public ky7(ro1 ro1Var) {
        this.a = ro1Var;
    }

    @Override // px2
    public final cy2 getContext() {
        return k34.a;
    }

    @Override // px2
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof sc9;
        ro1 ro1Var = this.a;
        if (z) {
            ro1Var.a(null, ((sc9) obj).a);
        } else {
            ro1Var.a(obj, null);
        }
    }
}
