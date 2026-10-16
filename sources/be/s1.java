package be;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 extends kotlin.jvm.internal.h implements td.q {
    public static final s1 a = new s1(3, v1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

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
        f0.n(v1Var, false, new q0(v1Var), 3);
        throw null;
    }
}
