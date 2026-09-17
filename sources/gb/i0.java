package gb;

import java.math.BigInteger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class i0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            fb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e7) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as BigInteger; at path ");
            v9.append(aVar.j());
            throw new db.j(v9.toString(), e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
