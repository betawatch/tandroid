package gb;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        throw new db.j("Expecting number, got: " + hg.k0.D(x10) + "; at path " + aVar.h());
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
