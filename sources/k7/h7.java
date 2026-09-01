package k7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static final Object a(qd.s sVar, qd.s sVar2, dd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ld.v(th2, false);
        }
        vc.a aVar = vc.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == ld.e0.e) {
            return aVar;
        }
        if (B instanceof ld.v) {
            throw ((ld.v) B).a;
        }
        return ld.e0.u(B);
    }
}
