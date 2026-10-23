package hb;

import i2.o1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        throw new eb.j("Expecting number, got: " + o1.E(x10) + "; at path " + aVar.h());
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
