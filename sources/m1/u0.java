package m1;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import zd.c2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.k implements rd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Serializable serializable, Object obj, int i7) {
        super(1);
        this.b = i7;
        this.c = serializable;
        this.d = obj;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        Object hVar;
        gd.k kVar;
        gd.k kVar2;
        switch (this.b) {
            case 0:
                boolean a10 = kotlin.jvm.internal.j.a((String) obj, ((File) this.c).getName());
                gd.k kVar3 = gd.k.a;
                if (a10) {
                    be.r rVar = (be.r) ((be.s) this.d);
                    Object b10 = rVar.b(kVar3);
                    if (b10 instanceof be.i) {
                        Object obj2 = ((be.j) zd.b0.u(new be.l(rVar, (id.c) null, 0))).a;
                    }
                }
                return kVar3;
            default:
                Throwable th2 = (Throwable) obj;
                ((y) this.c).invoke(th2);
                be.c cVar = (be.c) ((ab.b0) this.d).d;
                cVar.g(th2, false);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = be.c.c;
                    long j3 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.c.b;
                    long j10 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j10, true)) {
                        hVar = new be.h(cVar.m());
                    } else {
                        long j11 = j10 & 1152921504606846975L;
                        be.i iVar = be.j.b;
                        if (j3 < j11) {
                            Object obj3 = be.e.k;
                            be.k kVar4 = (be.k) be.c.h.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                                    hVar = new be.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j12 = be.e.b;
                                    long j13 = andIncrement / j12;
                                    int i7 = (int) (andIncrement % j12);
                                    if (kVar4.c != j13) {
                                        be.k l10 = cVar.l(j13, kVar4);
                                        if (l10 == null) {
                                            continue;
                                        } else {
                                            kVar4 = l10;
                                        }
                                    }
                                    Object z9 = cVar.z(kVar4, i7, andIncrement, obj3);
                                    if (z9 == be.e.m) {
                                        c2 c2Var = obj3 instanceof c2 ? (c2) obj3 : null;
                                        if (c2Var != null) {
                                            c2Var.a(kVar4, i7);
                                        }
                                        cVar.B(andIncrement);
                                        kVar4.i();
                                    } else if (z9 == be.e.o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar4.b();
                                        }
                                    } else {
                                        if (z9 == be.e.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar4.b();
                                        hVar = z9;
                                    }
                                }
                            }
                        }
                        hVar = iVar;
                    }
                    kVar = null;
                    if (hVar instanceof be.i) {
                        hVar = null;
                    }
                    kVar2 = gd.k.a;
                    if (hVar != null) {
                        ((n0) hVar).b.Q(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        kVar = kVar2;
                    }
                } while (kVar != null);
                return kVar2;
        }
    }
}
