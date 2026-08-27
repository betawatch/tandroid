package jd;

import a9.o;
import ad.l;
import com.google.firebase.messaging.t;
import id.j2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.j;
import k1.m;
import kd.g;
import kd.h;
import kotlin.jvm.internal.k;
import pc.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends k implements l {
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

    @Override // ad.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        Object eVar;
        i iVar;
        switch (this.b) {
            case 0:
                ((e) this.c).c.removeCallbacks((o) this.d);
                return i.a;
            default:
                Throwable th = (Throwable) obj;
                ((m) this.c).invoke(th);
                kd.b bVar = (kd.b) ((t) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = kd.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kd.b.i;
                ec.a aVar = kd.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, aVar, th)) {
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
                    kd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kd.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        ec.a aVar2 = obj2 == null ? kd.d.p : kd.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, aVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            kotlin.jvm.internal.t.a(1, obj2);
                            ((l) obj2).invoke((Throwable) kd.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = kd.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = kd.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new kd.e((Throwable) kd.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        kd.f fVar = g.a;
                        if (j12 < j14) {
                            Object obj3 = kd.d.k;
                            h hVar = (h) kd.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(kd.b.b.get(bVar), z10)) {
                                    eVar = new kd.e((Throwable) kd.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = kd.d.b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        h e9 = bVar.e(j16, hVar);
                                        if (e9 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e9;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o10 == kd.d.m) {
                                        j2 j2Var = obj3 instanceof j2 ? (j2) obj3 : null;
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == kd.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o10 == kd.d.n) {
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
                    if (eVar instanceof kd.f) {
                        eVar = null;
                    }
                    i iVar2 = i.a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k1.k kVar = (k1.k) eVar;
                        if (kVar instanceof j) {
                            ((j) kVar).b.L(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
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
