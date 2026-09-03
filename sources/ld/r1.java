package ld;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 extends kotlin.jvm.internal.i implements dd.q {
    public static final r1 a = new r1(3, u1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // dd.q
    public final Object a(Object obj, Object obj2, wc.c cVar) {
        Object u10;
        u1 u1Var = (u1) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.a;
        do {
            u10 = u1Var.u();
            if (!(u10 instanceof a1)) {
                throw null;
            }
        } while (u1Var.I(u10) < 0);
        e0.n(u1Var, false, new p0(u1Var), 3);
        throw null;
    }
}
