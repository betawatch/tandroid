package id;

import com.google.firebase.messaging.t;
import hd.j2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jd.g;
import jd.h;
import k1.k;
import k1.m;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import oc.i;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends j implements l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i9, Object obj, Object obj2) {
        super(1);
        this.b = i9;
        this.c = obj;
        this.d = obj2;
    }

    @Override // zc.l
    public final Object invoke(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        int i9;
        Object eVar;
        i iVar;
        switch (this.b) {
            case 0:
                ((e) this.c).c.removeCallbacks((androidx.biometric.j) this.d);
                return i.a;
            default:
                Throwable th = (Throwable) obj;
                ((m) this.c).invoke(th);
                jd.b bVar = (jd.b) ((t) this.d).d;
                bVar.getClass();
                AtomicLongFieldUpdater atomicLongFieldUpdater = jd.b.b;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jd.b.i;
                e5.c cVar = jd.d.r;
                while (true) {
                    z10 = true;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, cVar, th)) {
                        z11 = true;
                    } else if (atomicReferenceFieldUpdater.get(bVar) != cVar) {
                        z11 = false;
                    }
                }
                while (true) {
                    long j11 = atomicLongFieldUpdater.get(bVar);
                    int i10 = (int) (j11 >> 60);
                    if (i10 == 0) {
                        j10 = j11 & 1152921504606846975L;
                        i9 = 2;
                    } else if (i10 == 1) {
                        j10 = j11 & 1152921504606846975L;
                        i9 = 3;
                    }
                    jd.b bVar2 = bVar;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
                    boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(bVar2, j11, (i9 << 60) + j10);
                    bVar = bVar2;
                    if (!compareAndSet) {
                        atomicLongFieldUpdater = atomicLongFieldUpdater2;
                    }
                }
                bVar.c();
                if (z11) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = jd.b.j;
                    while (true) {
                        Object obj2 = atomicReferenceFieldUpdater2.get(bVar);
                        e5.c cVar2 = obj2 == null ? jd.d.p : jd.d.q;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj2, cVar2)) {
                            if (atomicReferenceFieldUpdater2.get(bVar) != obj2) {
                                break;
                            }
                        }
                        if (obj2 != null) {
                            s.a(1, obj2);
                            ((l) obj2).invoke((Throwable) jd.b.i.get(bVar));
                        }
                    }
                }
                while (true) {
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = jd.b.c;
                    long j12 = atomicLongFieldUpdater3.get(bVar);
                    long j13 = jd.b.b.get(bVar);
                    if (bVar.i(j13, z10)) {
                        eVar = new jd.e((Throwable) jd.b.i.get(bVar));
                    } else {
                        long j14 = j13 & 1152921504606846975L;
                        jd.f fVar = g.a;
                        if (j12 < j14) {
                            Object obj3 = jd.d.k;
                            h hVar = (h) jd.b.g.get(bVar);
                            while (true) {
                                if (bVar.i(jd.b.b.get(bVar), z10)) {
                                    eVar = new jd.e((Throwable) jd.b.i.get(bVar));
                                } else {
                                    long andIncrement = atomicLongFieldUpdater3.getAndIncrement(bVar);
                                    long j15 = jd.d.b;
                                    long j16 = andIncrement / j15;
                                    int i11 = (int) (andIncrement % j15);
                                    if (hVar.c != j16) {
                                        h e10 = bVar.e(j16, hVar);
                                        if (e10 == null) {
                                            continue;
                                            z10 = true;
                                        } else {
                                            hVar = e10;
                                        }
                                    }
                                    Object o6 = bVar.o(hVar, i11, andIncrement, obj3);
                                    if (o6 == jd.d.m) {
                                        j2 j2Var = obj3 instanceof j2 ? (j2) obj3 : null;
                                        if (j2Var != null) {
                                            j2Var.a(hVar, i11);
                                        }
                                        bVar.q(andIncrement);
                                        hVar.i();
                                    } else if (o6 == jd.d.o) {
                                        if (andIncrement < bVar.g()) {
                                            hVar.b();
                                        }
                                        z10 = true;
                                    } else {
                                        if (o6 == jd.d.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        hVar.b();
                                        eVar = o6;
                                    }
                                }
                            }
                        }
                        eVar = fVar;
                    }
                    if (eVar instanceof jd.f) {
                        eVar = null;
                    }
                    i iVar2 = i.a;
                    if (eVar == null) {
                        iVar = null;
                    } else {
                        k kVar = (k) eVar;
                        if (kVar instanceof k1.j) {
                            ((k1.j) kVar).b.L(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
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
