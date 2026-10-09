package ae;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 extends kotlin.jvm.internal.h implements sd.q {
    public static final t1 a = new t1(3, w1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // sd.q
    public final Object c(Object obj, Object obj2, ld.c cVar) {
        Object u10;
        w1 w1Var = (w1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.a;
        do {
            u10 = w1Var.u();
            if (!(u10 instanceof c1)) {
                throw null;
            }
        } while (w1Var.I(u10) < 0);
        g0.n(w1Var, false, new r0(w1Var), 3);
        throw null;
    }
}
