// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
