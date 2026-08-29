package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class v7 {
    /* JADX WARN: Multi-variable type inference failed */
    public static sc.c a(bd.p pVar, sc.c cVar, sc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof uc.a) {
            return ((uc.a) pVar).create(cVar, cVar2);
        }
        sc.h context = cVar2.getContext();
        return context == sc.i.a ? new tc.b(pVar, cVar2, cVar) : new tc.c(cVar2, context, pVar, cVar);
    }

    public static sc.c b(sc.c cVar) {
        sc.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        uc.c cVar2 = cVar instanceof uc.c ? (uc.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
