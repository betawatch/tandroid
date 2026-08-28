package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends la.u {
    public static final p b = new p(new q(la.t.b), 0);
    public final la.t a;

    public q(la.t tVar) {
        this.a = tVar;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 == 5 || b10 == 6) {
            return this.a.a(aVar);
        }
        if (b10 == 8) {
            aVar.t();
            return null;
        }
        throw new la.j("Expecting number, got: " + ta.b.k(x10) + "; at path " + aVar.h());
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.q((Number) obj);
    }
}
