package a8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class da {
    public static final Object a(ee.q qVar, ee.q qVar2, rd.p pVar) {
        Object vVar;
        Object D;
        try {
            kotlin.jvm.internal.u.a(2, pVar);
            vVar = pVar.invoke(qVar2, qVar);
        } catch (Throwable th2) {
            vVar = new zd.v(th2, false);
        }
        jd.a aVar = jd.a.a;
        if (vVar == aVar || (D = qVar.D(vVar)) == zd.b0.e) {
            return aVar;
        }
        if (D instanceof zd.v) {
            throw ((zd.v) D).a;
        }
        return zd.b0.w(D);
    }
}
