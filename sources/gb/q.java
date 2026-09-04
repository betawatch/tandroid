package gb;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        throw new db.j("Expecting number, got: " + i2.g.E(x10) + "; at path " + aVar.h());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
