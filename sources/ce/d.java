package ce;

import be.j2;
import com.google.firebase.messaging.r;
import de.g;
import de.h;
import id.i;
import j9.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k1.k;
import k1.m;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import td.l;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    @Override // td.l
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
                de.b bVar = (de.b) ((r) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = de.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.b.i;
                com.google.android.gms.internal.clearcut.e eVar2 = de.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, eVar2, th2)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != eVar2) {
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
                    de.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i10 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = de.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        com.google.android.gms.internal.clearcut.e eVar3 = obj2 == null ? de.d.p : de.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, eVar3)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) de.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = de.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = de.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new de.e((Throwable) de.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        de.f fVar = g.a;
                        if (j12 < j14) {
                            Object obj3 = de.d.k;
                            h hVar = (h) de.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(de.b.b.get(bVar), z10)) {
                                    eVar = new de.e((Throwable) de.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = de.d.b;
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
                                    if (o10 == de.d.m) {
                                        j2 j2Var = obj3 instanceof j2 ? (j2) obj3 : null;
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i12);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o10 == de.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o10 == de.d.n) {
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
                    if (eVar instanceof de.f) {
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
