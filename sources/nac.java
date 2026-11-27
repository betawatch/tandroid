// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class nac implements kx2 {
    public final nac a;
    public final o83 b;

    public nac(nac nacVar, o83 o83Var) {
        this.a = nacVar;
        this.b = o83Var;
    }

    public final void a(o83 o83Var) {
        if (this.b == o83Var) {
            grb.i("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        nac nacVar = this.a;
        if (nacVar != null) {
            nacVar.a(o83Var);
        }
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    @Override // mx2
    public final kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override // kx2
    public final lx2 getKey() {
        return rg7.d;
    }

    @Override // mx2
    public final mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }
}
