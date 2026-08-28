package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class z0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        cVar.p((Boolean) obj);
    }
}
