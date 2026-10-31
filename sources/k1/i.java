package k1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.j2;
import td.z1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.j implements ld.l {
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

    @Override // ld.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        Object eVar;
        ad.j jVar;
        switch (this.b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((ce.g) this.c).invoke(th2);
                vd.b bVar = (vd.b) ((ji.f) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = vd.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vd.b.i;
                ea.a aVar = vd.d.r;
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
                    vd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vd.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        ea.a aVar2 = obj2 == null ? vd.d.p : vd.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((ld.l) obj2).invoke((Throwable) vd.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = vd.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = vd.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new vd.e((Throwable) vd.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        vd.f fVar = vd.g.a;
                        if (j12 < j14) {
                            Object obj3 = vd.d.k;
                            vd.h hVar = (vd.h) vd.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(vd.b.b.get(bVar), z10)) {
                                    eVar = new vd.e((Throwable) vd.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = vd.d.b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        vd.h e = bVar.e(j16, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o10 == vd.d.m) {
                                        j2 j2Var = obj3 instanceof j2 ? (j2) obj3 : null;
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == vd.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o10 == vd.d.n) {
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
                    if (eVar instanceof vd.f) {
                        eVar = null;
                    }
                    ad.j jVar2 = ad.j.a;
                    if (eVar == null) {
                        jVar = null;
                    } else {
                        l lVar = (l) eVar;
                        if (lVar instanceof k) {
                            ((k) lVar).b.L(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        }
                        jVar = jVar2;
                    }
                    if (jVar == null) {
                        return jVar2;
                    }
                    z10 = true;
                }
            default:
                ((ud.d) this.c).c.removeCallbacks((z1) this.d);
                return ad.j.a;
        }
    }
}
