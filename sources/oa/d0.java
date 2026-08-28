package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class d0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() != 9) {
            return Float.valueOf((float) aVar.o());
        }
        aVar.t();
        return null;
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            cVar.i();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        cVar.q(number);
    }
}
