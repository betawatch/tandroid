package gb;

import java.util.Currency;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
