package gb;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class c1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p5 = aVar.p();
            if (p5 <= 65535 && p5 >= -32768) {
                return Short.valueOf((short) p5);
            }
            StringBuilder l4 = i2.g.l(p5, "Lossy conversion from ", " to short; at path ");
            l4.append(aVar.j());
            throw new db.j(l4.toString());
        } catch (NumberFormatException e7) {
            throw new db.j(e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.shortValue());
        }
    }
}
