package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.i2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements dd.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        super(1);
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // dd.l
    public final Object invoke(Object obj) {
        boolean z4;
        boolean z10;
        long j10;
        int i10;
        Object eVar;
        sc.i iVar;
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((o) this.c).invoke(th2);
                nd.b bVar = (nd.b) ((com.google.firebase.messaging.r) this.d).c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = nd.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.b.i;
                o3.c cVar = nd.d.r;
                while (true) {
                    z4 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, cVar, th2)) {
                        z10 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != cVar) {
                        z10 = false;
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
                    nd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z10) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        o3.c cVar2 = obj2 == null ? nd.d.p : nd.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, cVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((dd.l) obj2).invoke((Throwable) nd.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = nd.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = nd.b.b.get(bVar);
                    if (bVar.i(j13, z4)) {
                        eVar = new nd.e((Throwable) nd.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        nd.f fVar = nd.g.a;
                        if (j12 < j14) {
                            Object obj3 = nd.d.k;
                            nd.h hVar = (nd.h) nd.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(nd.b.b.get(bVar), z4)) {
                                    eVar = new nd.e((Throwable) nd.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = nd.d.b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        nd.h e = bVar.e(j16, hVar);
                                        if (e == null) {
                                            continue;
                                            z4 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o10 == nd.d.m) {
                                        i2 i2Var = obj3 instanceof i2 ? (i2) obj3 : null;
                                        if (i2Var != null) {
                                            i2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == nd.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z4 = true;
                                    } else {
                                        if (o10 == nd.d.n) {
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
                    if (eVar instanceof nd.f) {
                        eVar = null;
                    }
                    sc.i iVar2 = sc.i.a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        m mVar = (m) eVar;
                        if (mVar instanceof l) {
                            ((l) mVar).b.L(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        }
                        iVar = iVar2;
                    }
                    if (iVar == null) {
                        return iVar2;
                    }
                    z4 = true;
                }
            default:
                ((md.d) this.c).c.removeCallbacks((androidx.biometric.j) this.d);
                return sc.i.a;
        }
    }
}
