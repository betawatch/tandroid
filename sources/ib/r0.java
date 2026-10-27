package ib;

import java.util.Currency;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class r0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e) {
            StringBuilder v10 = a1.g.v("Failed parsing '", v, "' as Currency; at path ");
            v10.append(aVar.j());
            throw new fb.j(v10.toString(), e);
        }
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
