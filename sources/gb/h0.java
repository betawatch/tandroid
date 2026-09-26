package gb;

import java.math.BigDecimal;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as BigDecimal; at path ");
            w10.append(aVar.j());
            throw new db.j(w10.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
