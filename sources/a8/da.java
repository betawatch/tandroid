package a8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
