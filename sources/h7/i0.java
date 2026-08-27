package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static final Object a(nd.s sVar, nd.s sVar2, ad.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.t.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th) {
            vVar = new id.v(th, false);
        }
        sc.a aVar = sc.a.a;
        if (vVar == aVar || (B = sVar.B(vVar)) == id.f0.e) {
            return aVar;
        }
        if (B instanceof id.v) {
            throw ((id.v) B).a;
        }
        return id.f0.u(B);
    }
}
