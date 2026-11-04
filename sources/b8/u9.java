package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class u9 {
    public static final Object a(be.q qVar, be.q qVar2, od.p pVar) {
        Object vVar;
        Object D;
        try {
            kotlin.jvm.internal.u.a(2, pVar);
            vVar = pVar.invoke(qVar2, qVar);
        } catch (Throwable th2) {
            vVar = new wd.v(th2, false);
        }
        gd.a aVar = gd.a.a;
        if (vVar == aVar || (D = qVar.D(vVar)) == wd.b0.e) {
            return aVar;
        }
        if (D instanceof wd.v) {
            throw ((wd.v) D).a;
        }
        return wd.b0.w(D);
    }
}
