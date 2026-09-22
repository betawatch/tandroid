package gb;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public class b1 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            int p5 = aVar.p();
            if (p5 <= 255 && p5 >= -128) {
                return Byte.valueOf((byte) p5);
            }
            StringBuilder k10 = hg.k0.k(p5, "Lossy conversion from ", " to byte; at path ");
            k10.append(aVar.j());
            throw new db.j(k10.toString());
        } catch (NumberFormatException e) {
            throw new db.j(e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.i();
        } else {
            bVar.o(r4.byteValue());
        }
    }
}
