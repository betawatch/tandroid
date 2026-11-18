package b9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class d implements a9.a {
    public final qb.a a;

    public d(qb.a aVar) {
        this.a = aVar;
    }

    @Override // a9.a
    public final void a(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void b(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void c(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void d(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
