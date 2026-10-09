package be;

import ae.k2;
import ce.h;
import hd.i;
import i9.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import je.g;
import k1.k;
import kotlin.jvm.internal.j;
import sd.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    @Override // sd.l
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
                ce.b bVar = (ce.b) ((com.google.firebase.messaging.s) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ce.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ce.b.i;
                da.a aVar = ce.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar, th2)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != aVar) {
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
                    ce.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j10, (i10 << 60) + j3);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ce.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        da.a aVar2 = obj2 == null ? ce.d.p : ce.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) ce.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ce.b.c;
                    long j11 = atomicLongFieldUpdater3.get(bVar);
                    long j12 = ce.b.b.get(bVar);
                    if (bVar.i(j12, z10)) {
                        eVar = new ce.e((Throwable) ce.b.i.get(bVar));
                    } else {
                        long j13 = j12 & 1152921504606846975L;
                        ce.f fVar = ce.g.a;
                        if (j11 < j13) {
                            Object obj3 = ce.d.k;
                            h hVar = (h) ce.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(ce.b.b.get(bVar), z10)) {
                                    eVar = new ce.e((Throwable) ce.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j14 = ce.d.b;
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
                                    if (o9 == ce.d.m) {
                                        k2 k2Var = obj3 instanceof k2 ? (k2) obj3 : null;
                                        if (k2Var != null) {
                                            k2Var.b(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o9 == ce.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o9 == ce.d.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hVar.b();
                                        eVar = o9;
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof ce.f) {
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
