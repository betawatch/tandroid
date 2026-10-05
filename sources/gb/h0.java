package gb;

import java.math.BigDecimal;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        } catch (NumberFormatException e7) {
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as BigDecimal; at path ");
            w10.append(aVar.j());
            throw new db.j(w10.toString(), e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
