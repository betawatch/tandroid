// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n6c implements qw2 {
    public final n6c a;
    public final v73 b;

    public n6c(n6c n6cVar, v73 v73Var) {
        this.a = n6cVar;
        this.b = v73Var;
    }

    public final void a(v73 v73Var) {
        if (this.b == v73Var) {
            sc8.j("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        n6c n6cVar = this.a;
        if (n6cVar != null) {
            n6cVar.a(v73Var);
        }
    }

    @Override // sw2
    public final Object fold(Object obj, eq4 eq4Var) {
        return eq4Var.invoke(obj, this);
    }

    @Override // sw2
    public final qw2 get(rw2 rw2Var) {
        return kud.a(this, rw2Var);
    }

    @Override // qw2
    public final rw2 getKey() {
        return ie7.d;
    }

    @Override // sw2
    public final sw2 minusKey(rw2 rw2Var) {
        return kud.b(this, rw2Var);
    }

    @Override // sw2
    public final sw2 plus(sw2 sw2Var) {
        return kud.c(this, sw2Var);
    }
}
