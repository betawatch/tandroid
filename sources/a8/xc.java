package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
