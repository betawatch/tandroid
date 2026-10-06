package gb;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
            StringBuilder j3 = hg.c.j(p5, "Lossy conversion from ", " to short; at path ");
            j3.append(aVar.j());
            throw new db.j(j3.toString());
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
