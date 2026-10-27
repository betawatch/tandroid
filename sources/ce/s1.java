package ce;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 extends kotlin.jvm.internal.h implements ud.q {
    public static final s1 a = new s1(3, v1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // ud.q
    public final Object a(Object obj, Object obj2, nd.c cVar) {
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
