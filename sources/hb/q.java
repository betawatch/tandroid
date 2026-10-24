package hb;

import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
