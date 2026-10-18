package hb;

import java.math.BigDecimal;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class h0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return gb.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as BigDecimal; at path ");
            v10.append(aVar.j());
            throw new eb.j(v10.toString(), e);
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
