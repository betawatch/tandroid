package hb;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class q extends eb.u {
    public static final p b = new p(new q(eb.t.b), 0);
    public final eb.t a;

    public q(eb.t tVar) {
        this.a = tVar;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        int x10 = aVar.x();
        int c10 = m1.j.c(x10);
        if (c10 == 5 || c10 == 6) {
            return this.a.a(aVar);
        }
        if (c10 == 8) {
            aVar.t();
            return null;
        }
        throw new eb.j("Expecting number, got: " + i2.d.D(x10) + "; at path " + aVar.h());
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
