package l1;

import b8.cc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 implements fd.f {
    public final j1 a;
    public final b0 b;

    public j1(j1 j1Var, b0 b0Var) {
        this.a = j1Var;
        this.b = b0Var;
    }

    public final void a(b0 b0Var) {
        if (this.b == b0Var) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        j1 j1Var = this.a;
        if (j1Var != null) {
            j1Var.a(b0Var);
        }
    }

    @Override // fd.h
    public final Object fold(Object obj, od.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // fd.h
    public final fd.f get(fd.g gVar) {
        return cc.a(this, gVar);
    }

    @Override // fd.f
    public final fd.g getKey() {
        return i1.a;
    }

    @Override // fd.h
    public final fd.h minusKey(fd.g gVar) {
        return cc.b(this, gVar);
    }

    @Override // fd.h
    public final fd.h plus(fd.h hVar) {
        return cc.c(this, hVar);
    }
}
