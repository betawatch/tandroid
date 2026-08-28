package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g0 {
    public static final Object a(md.s sVar, md.s sVar2, zc.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            vVar = new hd.v(th, false);
        }
        rc.a aVar = rc.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == hd.f0.e) {
            return aVar;
        }
        if (B instanceof hd.v) {
            throw ((hd.v) B).a;
        }
        return hd.f0.u(B);
    }
}
