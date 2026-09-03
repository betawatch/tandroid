package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
