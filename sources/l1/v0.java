package l1;

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import wd.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.k implements od.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Serializable serializable, Object obj, int i3) {
        super(1);
        this.b = i3;
        this.c = serializable;
        this.d = obj;
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        Object hVar;
        dd.k kVar;
        dd.k kVar2;
        switch (this.b) {
            case 0:
                boolean a10 = kotlin.jvm.internal.j.a((String) obj, ((File) this.c).getName());
                dd.k kVar3 = dd.k.a;
                if (a10) {
                    yd.o oVar = (yd.o) ((yd.p) this.d);
                    Object b10 = oVar.b(kVar3);
                    if (b10 instanceof yd.i) {
                        Object obj2 = ((yd.j) wd.b0.u(new ae.d(oVar, (fd.c) null, 11))).a;
                    }
                }
                return kVar3;
            default:
                Throwable th2 = (Throwable) obj;
                ((y) this.c).invoke(th2);
                yd.c cVar = (yd.c) ((ui.f) this.d).d;
                cVar.g(th2, false);
                do {
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = yd.c.c;
                    long j10 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = yd.c.b;
                    long j11 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j11, true)) {
                        hVar = new yd.h(cVar.m());
                    } else {
                        long j12 = j11 & 1152921504606846975L;
                        yd.i iVar = yd.j.b;
                        if (j10 < j12) {
                            Object obj3 = yd.e.k;
                            yd.k kVar4 = (yd.k) yd.c.h.get(cVar);
                            while (true) {
                                if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                                    hVar = new yd.h(cVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                    long j13 = yd.e.b;
                                    long j14 = andIncrement / j13;
                                    int i3 = (int) (andIncrement % j13);
                                    if (kVar4.c != j14) {
                                        yd.k l10 = cVar.l(j14, kVar4);
                                        if (l10 == null) {
                                            continue;
                                        } else {
                                            kVar4 = l10;
                                        }
                                    }
                                    Object z10 = cVar.z(kVar4, i3, andIncrement, obj3);
                                    if (z10 == yd.e.m) {
                                        c2 c2Var = obj3 instanceof c2 ? (c2) obj3 : null;
                                        if (c2Var != null) {
                                            c2Var.a(kVar4, i3);
                                        }
                                        cVar.B(andIncrement);
                                        kVar4.i();
                                    } else if (z10 == yd.e.o) {
                                        if (andIncrement < cVar.p()) {
                                            kVar4.b();
                                        }
                                    } else {
                                        if (z10 == yd.e.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar4.b();
                                        hVar = z10;
                                    }
                                }
                            }
                        }
                        hVar = iVar;
                    }
                    kVar = null;
                    if (hVar instanceof yd.i) {
                        hVar = null;
                    }
                    kVar2 = dd.k.a;
                    if (hVar != null) {
                        ((n0) hVar).b.Q(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        kVar = kVar2;
                    }
                } while (kVar != null);
                return kVar2;
        }
    }
}
