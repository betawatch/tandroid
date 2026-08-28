package oa;

import java.math.BigDecimal;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class h0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return na.d.i(v);
        } catch (NumberFormatException e10) {
            StringBuilder t10 = aa.d.t("Failed parsing '", v, "' as BigDecimal; at path ");
            t10.append(aVar.j());
            throw new la.j(t10.toString(), e10);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.q((BigDecimal) obj);
    }
}
