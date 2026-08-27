package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class h7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static rc.c a(ad.p pVar, rc.c cVar, rc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof tc.a) {
            return ((tc.a) pVar).create(cVar, cVar2);
        }
        rc.h context = cVar2.getContext();
        return context == rc.i.a ? new sc.b(pVar, cVar2, cVar) : new sc.c(cVar2, context, pVar, cVar);
    }

    public static rc.c b(rc.c cVar) {
        rc.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        tc.c cVar2 = cVar instanceof tc.c ? (tc.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
