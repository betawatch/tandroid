package ae;

import be.h;
import gd.i;
import i9.s;
import ie.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import kotlin.jvm.internal.j;
import rd.l;
import zd.i2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d extends j implements l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        super(1);
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        int i10;
        Object eVar;
        i iVar;
        switch (this.b) {
            case 0:
                ((e) this.c).c.removeCallbacks((s) this.d);
                return i.a;
            default:
                Throwable th2 = (Throwable) obj;
                ((g) this.c).invoke(th2);
                be.b bVar = (be.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.i;
                d9.f fVar = be.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, fVar, th2)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != fVar) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(bVar);
                    int i11 = (int) (j10 >> 60);
                    if (i11 == 0) {
                        j3 = j10 & 1152921504606846975L;
                        i10 = 2;
                    } else if (i11 == 1) {
                        j3 = j10 & 1152921504606846975L;
                        i10 = 3;
                    }
                    be.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j10, (i10 << 60) + j3);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        d9.f fVar2 = obj2 == null ? be.d.p : be.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, fVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) be.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = be.b.c;
                    long j11 = atomicLongFieldUpdater3.get(bVar);
                    long j12 = be.b.b.get(bVar);
                    if (bVar.i(j12, z10)) {
                        eVar = new be.e((Throwable) be.b.i.get(bVar));
                    } else {
                        long j13 = j12 & 1152921504606846975L;
                        be.f fVar3 = be.g.a;
                        if (j11 < j13) {
                            Object obj3 = be.d.k;
                            h hVar = (h) be.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(be.b.b.get(bVar), z10)) {
                                    eVar = new be.e((Throwable) be.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = be.d.b;
                                    long j15 = andIncrement / j14;
                                    int i12 = (int) (andIncrement % j14);
                                    if (hVar.c != j15) {
                                        h e7 = bVar.e(j15, hVar);
                                        if (e7 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e7;
                                        }
                                    }
                                    Object o9 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o9 == be.d.m) {
                                        i2 i2Var = obj3 instanceof i2 ? (i2) obj3 : null;
                                        if (i2Var != null) {
                                            i2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o9 == be.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o9 == be.d.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hVar.b();
                                        eVar = o9;
                                    }
                                }
                            }
                        }
                        eVar = fVar3;
                    }
                    if (eVar instanceof be.f) {
                        eVar = null;
                    }
                    i iVar2 = i.a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            ((k1.j) kVar).b.L(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2);
                        }
                        iVar = iVar2;
                    }
                    if (iVar == null) {
                        return iVar2;
                    }
                    z10 = true;
                }
        }
    }
}
