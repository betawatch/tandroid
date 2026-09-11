package gb;

import java.util.Currency;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
