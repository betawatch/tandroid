package de;

import ce.j2;
import com.google.firebase.messaging.q;
import ee.g;
import ee.h;
import he.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.i;
import k1.k;
import k1.m;
import k9.u;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import ud.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // ud.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        Object eVar;
        i iVar;
        switch (this.b) {
            case 0:
                ((e) this.c).c.removeCallbacks((u) this.d);
                return i.a;
            default:
                Throwable th2 = (Throwable) obj;
                ((m) this.c).invoke(th2);
                ee.b bVar = (ee.b) ((q) this.d).c;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = ee.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.b.i;
                v vVar = ee.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, th2)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
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
                    ee.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        v vVar2 = obj2 == null ? ee.d.p : ee.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, vVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) ee.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = ee.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = ee.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new ee.e((Throwable) ee.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        ee.f fVar = g.a;
                        if (j12 < j14) {
                            Object obj3 = ee.d.k;
                            h hVar = (h) ee.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(ee.b.b.get(bVar), z10)) {
                                    eVar = new ee.e((Throwable) ee.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = ee.d.b;
                                    long j16 = andIncrement / j15;
                                    int i12 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        h e = bVar.e(j16, hVar);
                                        if (e == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e;
                                        }
                                    }
                                    Object o10 = bVar.o(hVar, i12, andIncrement, obj3);
                                    if (o10 == ee.d.m) {
                                        j2 j2Var = obj3 instanceof j2 ? (j2) obj3 : null;
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == ee.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o10 == ee.d.n) {
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
                    if (eVar instanceof ee.f) {
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
