package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class d1 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            return Integer.valueOf(aVar.p());
        } catch (NumberFormatException e10) {
            throw new la.j(e10);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (((Number) obj) == null) {
            cVar.i();
        } else {
            cVar.o(r4.intValue());
        }
    }
}
