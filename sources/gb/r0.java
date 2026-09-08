package gb;

import java.util.Currency;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class r0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e7) {
            StringBuilder v9 = a4.a.v("Failed parsing '", v, "' as Currency; at path ");
            v9.append(aVar.j());
            throw new db.j(v9.toString(), e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
