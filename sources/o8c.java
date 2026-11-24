// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o8c implements ay2 {
    public final o8c a;
    public final h93 b;

    public o8c(o8c o8cVar, h93 h93Var) {
        this.a = o8cVar;
        this.b = h93Var;
    }

    public final void a(h93 h93Var) {
        if (this.b == h93Var) {
            dq9.m("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        o8c o8cVar = this.a;
        if (o8cVar != null) {
            o8cVar.a(h93Var);
        }
    }

    @Override // cy2
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    @Override // cy2
    public final ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override // ay2
    public final by2 getKey() {
        return kg7.d;
    }

    @Override // cy2
    public final cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    @Override // cy2
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }
}
