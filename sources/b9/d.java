package b9;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d implements a9.a {
    public final qb.a a;

    public d(qb.a aVar) {
        this.a = aVar;
    }

    @Override // a9.a
    public final void a(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void b(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void c(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override // a9.a
    public final void d(f fVar) {
        q6.m.h(fVar, "channel must not be null");
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
