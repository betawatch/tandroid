package gb;

import java.util.Currency;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class r0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder w10 = a4.a.w("Failed parsing '", v, "' as Currency; at path ");
            w10.append(aVar.j());
            throw new db.j(w10.toString(), e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
