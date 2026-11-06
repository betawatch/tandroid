package m1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i1 implements id.f {
    public final i1 a;
    public final b0 b;

    public i1(i1 i1Var, b0 b0Var) {
        this.a = i1Var;
        this.b = b0Var;
    }

    public final void a(b0 b0Var) {
        if (this.b == b0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        i1 i1Var = this.a;
        if (i1Var != null) {
            i1Var.a(b0Var);
        }
    }

    @Override // id.h
    public final Object fold(Object obj, rd.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // id.h
    public final id.f get(id.g gVar) {
        return c8.m0.a(this, gVar);
    }

    @Override // id.f
    public final id.g getKey() {
        return h1.a;
    }

    @Override // id.h
    public final id.h minusKey(id.g gVar) {
        return c8.m0.b(this, gVar);
    }

    @Override // id.h
    public final id.h plus(id.h hVar) {
        return c8.m0.c(this, hVar);
    }
}
