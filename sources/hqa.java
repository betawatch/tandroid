// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hqa implements zw2, wx2 {
    public final zw2 a;
    public final mx2 b;

    public hqa(zw2 zw2Var, mx2 mx2Var) {
        this.a = zw2Var;
        this.b = mx2Var;
    }

    @Override // wx2
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.a;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }

    @Override // zw2
    public final mx2 getContext() {
        return this.b;
    }

    @Override // zw2
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
