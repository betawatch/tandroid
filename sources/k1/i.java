package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.i2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.k implements bd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        super(1);
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // bd.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        Object eVar;
        qc.i iVar;
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((n) this.c).invoke(th2);
                ld.b bVar = (ld.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ld.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ld.b.i;
                fc.a aVar = ld.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar, th2)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != aVar) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    int i11 = (int) (j11 >> 60);
                    if (i11 == 0) {
                        j10 = j11 & 1152921504606846975L;
                        i10 = 2;
                    } else if (i11 == 1) {
                        j10 = j11 & 1152921504606846975L;
                        i10 = 3;
                    }
                    ld.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ld.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        fc.a aVar2 = obj2 == null ? ld.d.p : ld.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((bd.l) obj2).invoke((Throwable) ld.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ld.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = ld.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new ld.e((Throwable) ld.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        ld.f fVar = ld.g.a;
                        if (j12 < j14) {
                            Object obj3 = ld.d.k;
                            ld.h hVar = (ld.h) ld.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(ld.b.b.get(bVar), z10)) {
                                    eVar = new ld.e((Throwable) ld.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = ld.d.b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        ld.h e10 = bVar.e(j16, hVar);
                                        if (e10 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e10;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o10 == ld.d.m) {
                                        i2 i2Var = obj3 instanceof i2 ? (i2) obj3 : null;
                                        if (i2Var != null) {
                                            i2Var.b(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == ld.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o10 == ld.d.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hVar.b();
                                        eVar = o10;
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof ld.f) {
                        eVar = null;
                    }
                    qc.i iVar2 = qc.i.a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        l lVar = (l) eVar;
                        if (lVar instanceof k) {
                            ((k) lVar).b.L(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        }
                        iVar = iVar2;
                    }
                    if (iVar == null) {
                        return iVar2;
                    }
                    z10 = true;
                }
            default:
                ((kd.d) this.c).c.removeCallbacks((ab.o) this.d);
                return qc.i.a;
        }
    }
}
