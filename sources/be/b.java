package be;

import c8.x0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.c2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class b implements c2 {
    public Object a = e.p;
    public zd.m b;
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    @Override // zd.c2
    public final void a(ee.r rVar, int i7) {
        zd.m mVar = this.b;
        if (mVar != null) {
            mVar.a(rVar, i7);
        }
    }

    public final Object b(ce.e eVar) {
        k kVar;
        k kVar2;
        Object obj = this.a;
        boolean z10 = true;
        if (obj == e.p || obj == e.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
            c cVar = this.c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.b.get(cVar), true)) {
                long andIncrement = c.c.getAndIncrement(cVar);
                long j3 = e.b;
                long j10 = andIncrement / j3;
                int i7 = (int) (andIncrement % j3);
                if (kVar3.c != j10) {
                    k l10 = cVar.l(j10, kVar3);
                    if (l10 == null) {
                        continue;
                    } else {
                        kVar = l10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z11 = cVar.z(kVar, i7, andIncrement, null);
                ee.t tVar = e.m;
                if (z11 == tVar) {
                    throw new IllegalStateException("unreachable");
                }
                ee.t tVar2 = e.o;
                if (z11 == tVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.b();
                    }
                    kVar3 = kVar;
                } else {
                    if (z11 != e.n) {
                        kVar.b();
                        this.a = z11;
                        return Boolean.valueOf(z10);
                    }
                    zd.m l11 = b0.l(x0.b(eVar));
                    try {
                        this.b = l11;
                        try {
                            Object z12 = cVar.z(kVar, i7, andIncrement, this);
                            if (z12 == tVar) {
                                a(kVar, i7);
                            } else {
                                if (z12 == tVar2) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.b();
                                    }
                                    k kVar4 = (k) c.h.get(cVar);
                                    while (true) {
                                        if (cVar.r(c.b.get(cVar), true)) {
                                            zd.m mVar = this.b;
                                            kotlin.jvm.internal.j.b(mVar);
                                            this.b = null;
                                            this.a = e.l;
                                            Throwable m10 = cVar.m();
                                            if (m10 == null) {
                                                mVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                mVar.resumeWith(b7.h.a(m10));
                                            }
                                        } else {
                                            long andIncrement2 = c.c.getAndIncrement(cVar);
                                            long j11 = e.b;
                                            long j12 = andIncrement2 / j11;
                                            int i10 = (int) (andIncrement2 % j11);
                                            if (kVar4.c != j12) {
                                                kVar2 = cVar.l(j12, kVar4);
                                                if (kVar2 == null) {
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Object z13 = cVar.z(kVar2, i10, andIncrement2, this);
                                            if (z13 == e.m) {
                                                a(kVar2, i10);
                                                break;
                                            }
                                            if (z13 == e.o) {
                                                if (andIncrement2 < cVar.p()) {
                                                    kVar2.b();
                                                }
                                                kVar4 = kVar2;
                                            } else {
                                                if (z13 == e.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                kVar2.b();
                                                this.a = z13;
                                                this.b = null;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.b();
                                    this.a = z12;
                                    this.b = null;
                                }
                                l11.B(Boolean.TRUE, null);
                            }
                            Object r10 = l11.r();
                            jd.a aVar = jd.a.a;
                            return r10;
                        } catch (Throwable th2) {
                            th = th2;
                            l11.A();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            this.a = e.l;
            Throwable m11 = cVar.m();
            if (m11 != null) {
                int i11 = ee.s.a;
                throw m11;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
