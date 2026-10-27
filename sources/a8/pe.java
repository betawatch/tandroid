package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
