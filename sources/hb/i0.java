package hb;

import java.math.BigInteger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class i0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            gb.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigInteger; at path ");
            v10.append(aVar.j());
            throw new eb.j(v10.toString(), e);
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
