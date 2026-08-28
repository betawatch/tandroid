package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static qc.c a(qc.c cVar, qc.c cVar2, zc.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof sc.a) {
            return ((sc.a) pVar).create(cVar, cVar2);
        }
        qc.h context = cVar2.getContext();
        return context == qc.i.a ? new rc.b(cVar2, cVar, pVar) : new rc.c(cVar2, context, pVar, cVar);
    }

    public static qc.c b(qc.c cVar) {
        qc.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        sc.c cVar2 = cVar instanceof sc.c ? (sc.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
