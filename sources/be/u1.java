package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 extends kotlin.jvm.internal.h implements td.q {
    public static final u1 a = new u1(3, v1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // td.q
    public final Object b(Object obj, Object obj2, md.c cVar) {
        Object u10;
        v1 v1Var = (v1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v1.a;
        do {
            u10 = v1Var.u();
            if (!(u10 instanceof b1)) {
                throw null;
            }
        } while (v1Var.I(u10) < 0);
        f0.n(v1Var, false, new p1(), 3);
        throw null;
    }
}
