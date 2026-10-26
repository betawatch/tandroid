package ib;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
