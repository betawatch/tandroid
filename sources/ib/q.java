package ib;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q extends fb.u {
    public static final p b = new p(new q(fb.t.b), 0);
    public final fb.t a;

    public q(fb.t tVar) {
        this.a = tVar;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        int x9 = aVar.x();
        int c10 = m1.j.c(x9);
        if (c10 == 5 || c10 == 6) {
            return this.a.a(aVar);
        }
        if (c10 == 8) {
            aVar.t();
            return null;
        }
        throw new fb.j("Expecting number, got: " + ic.a.C(x9) + "; at path " + aVar.h());
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
