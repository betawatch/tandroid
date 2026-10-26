package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class pe {
    /* JADX WARN: Multi-variable type inference failed */
    public static ld.c a(ld.c cVar, ld.c cVar2, ud.p pVar) {
        kotlin.jvm.internal.i.e(pVar, "<this>");
        if (pVar instanceof nd.a) {
            return ((nd.a) pVar).create(cVar, cVar2);
        }
        ld.h context = cVar2.getContext();
        return context == ld.i.a ? new md.b(cVar2, cVar, pVar) : new md.c(cVar2, context, pVar, cVar);
    }

    public static ld.c b(ld.c cVar) {
        ld.c intercepted;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        nd.c cVar2 = cVar instanceof nd.c ? (nd.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
