// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
