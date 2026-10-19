package hb;

import java.util.Currency;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public class r0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as Currency; at path ");
            v10.append(aVar.j());
            throw new eb.j(v10.toString(), e);
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
