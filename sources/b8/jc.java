package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class jc {
    /* JADX WARN: Multi-variable type inference failed */
    public static fd.c a(fd.c cVar, fd.c cVar2, od.p pVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof hd.a) {
            return ((hd.a) pVar).create(cVar, cVar2);
        }
        fd.h context = cVar2.getContext();
        return context == fd.i.a ? new gd.b(cVar2, cVar, pVar) : new gd.c(cVar2, context, pVar, cVar);
    }

    public static fd.c b(fd.c cVar) {
        fd.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        hd.c cVar2 = cVar instanceof hd.c ? (hd.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }

    public static Object c(od.p pVar, Object obj, fd.c cVar) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        fd.h context = cVar.getContext();
        Object dVar = context == fd.i.a ? new gd.d(cVar) : new gd.e(cVar, context);
        kotlin.jvm.internal.u.a(2, pVar);
        return pVar.invoke(obj, dVar);
    }
}
