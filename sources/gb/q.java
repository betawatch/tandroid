package gb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class q extends db.u {
    public static final p b = new p(new q(db.t.b), 0);
    public final db.t a;

    public q(db.t tVar) {
        this.a = tVar;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 == 5 || c10 == 6) {
            return this.a.a(aVar);
        }
        if (c10 == 8) {
            aVar.t();
            return null;
        }
        throw new db.j("Expecting number, got: " + hg.c.D(x10) + "; at path " + aVar.h());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
