package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class f0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder t10 = aa.d.t("Expecting character, got: ", v, "; at ");
        t10.append(aVar.j());
        throw new la.j(t10.toString());
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        Character ch2 = (Character) obj;
        cVar.r(ch2 == null ? null : String.valueOf(ch2));
    }
}
