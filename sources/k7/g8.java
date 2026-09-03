package k7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class g8 {
    /* JADX WARN: Multi-variable type inference failed */
    public static uc.c a(dd.p pVar, uc.c cVar, uc.c cVar2) {
        kotlin.jvm.internal.j.e(pVar, "<this>");
        if (pVar instanceof wc.a) {
            return ((wc.a) pVar).create(cVar, cVar2);
        }
        uc.h context = cVar2.getContext();
        return context == uc.i.a ? new vc.b(pVar, cVar2, cVar) : new vc.c(cVar2, context, pVar, cVar);
    }

    public static uc.c b(uc.c cVar) {
        uc.c intercepted;
        kotlin.jvm.internal.j.e(cVar, "<this>");
        wc.c cVar2 = cVar instanceof wc.c ? (wc.c) cVar : null;
        return (cVar2 == null || (intercepted = cVar2.intercepted()) == null) ? cVar : intercepted;
    }
}
