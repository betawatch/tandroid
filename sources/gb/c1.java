package gb;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
