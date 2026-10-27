package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class xc {
    public static final Object a(he.s sVar, he.s sVar2, ud.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ce.v(th2, false);
        }
        md.a aVar = md.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == ce.f0.e) {
            return aVar;
        }
        if (B instanceof ce.v) {
            throw ((ce.v) B).a;
        }
        return ce.f0.u(B);
    }
}
