package hb;

import java.util.Currency;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
