package a9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements z8.a {
    public final kb.a a;

    public d(kb.a aVar) {
        this.a = aVar;
    }

    @Override // z8.a
    public final void a(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override // z8.a
    public final void b(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override // z8.a
    public final void c(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override // z8.a
    public final void d(f fVar) {
        p6.m.h(fVar, "channel must not be null");
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
