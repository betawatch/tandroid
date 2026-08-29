package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s6 {
    public static final Object a(od.t tVar, od.t tVar2, bd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(tVar2, tVar);
        } catch (Throwable th2) {
            vVar = new jd.v(th2, false);
        }
        tc.a aVar = tc.a.a;
        if (vVar == aVar || (B = tVar.B(vVar)) == jd.e0.e) {
            return aVar;
        }
        if (B instanceof jd.v) {
            throw ((jd.v) B).a;
        }
        return jd.e0.u(B);
    }
}
