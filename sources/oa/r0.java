package oa;

import java.util.Currency;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class r0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as Currency; at path ");
            t10.append(aVar.j());
            throw new la.j(t10.toString(), e10);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.r(((Currency) obj).getCurrencyCode());
    }
}
