package gb;

import java.math.BigDecimal;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class h0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return fb.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as BigDecimal; at path ");
            v9.append(aVar.j());
            throw new db.j(v9.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
