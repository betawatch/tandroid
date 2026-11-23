package b9;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
