package be;

import c8.u0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zd.b0;
import zd.c2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        boolean z9 = true;
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
                Object z10 = cVar.z(kVar, i7, andIncrement, null);
                com.google.android.gms.internal.clearcut.e eVar2 = e.m;
                if (z10 == eVar2) {
                    throw new IllegalStateException("unreachable");
                }
                com.google.android.gms.internal.clearcut.e eVar3 = e.o;
                if (z10 == eVar3) {
                    if (andIncrement < cVar.p()) {
                        kVar.b();
                    }
                    kVar3 = kVar;
                } else {
                    if (z10 != e.n) {
                        kVar.b();
                        this.a = z10;
                        return Boolean.valueOf(z9);
                    }
                    zd.m l11 = b0.l(u0.b(eVar));
                    try {
                        this.b = l11;
                        try {
                            Object z11 = cVar.z(kVar, i7, andIncrement, this);
                            if (z11 == eVar2) {
                                a(kVar, i7);
                            } else {
                                if (z11 == eVar3) {
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
                                                mVar.resumeWith(af.b.b(m10));
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
                                            Object z12 = cVar.z(kVar2, i10, andIncrement2, this);
                                            if (z12 == e.m) {
                                                a(kVar2, i10);
                                                break;
                                            }
                                            if (z12 == e.o) {
                                                if (andIncrement2 < cVar.p()) {
                                                    kVar2.b();
                                                }
                                                kVar4 = kVar2;
                                            } else {
                                                if (z12 == e.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                kVar2.b();
                                                this.a = z12;
                                                this.b = null;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.b();
                                    this.a = z11;
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
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
