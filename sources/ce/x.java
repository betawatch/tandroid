package ce;

import a8.la;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import org.telegram.tgnet.TLObject;
import zd.a1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class x {
    public static final com.google.android.gms.internal.clearcut.e a = new com.google.android.gms.internal.clearcut.e("NONE", 1);
    public static final com.google.android.gms.internal.clearcut.e b = new com.google.android.gms.internal.clearcut.e("PENDING", 1);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, m1.n nVar, Throwable th2, kd.c cVar) {
        f fVar;
        int i7;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i10 = fVar.c;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    fVar.c = i10 - TLObject.FLAG_31;
                    Object obj = fVar.b;
                    Object obj2 = jd.a.a;
                    i7 = fVar.c;
                    if (i7 != 0) {
                        af.b.c(obj);
                        fVar.a = th2;
                        fVar.c = 1;
                        if (nVar.b(zVar, th2, fVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = fVar.a;
                        af.b.c(obj);
                    }
                    return gd.k.a;
                }
            }
            if (i7 != 0) {
            }
            return gd.k.a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                la.a(th3, th2);
            }
            throw th3;
        }
        fVar = new f(cVar);
        Object obj3 = fVar.b;
        Object obj22 = jd.a.a;
        i7 = fVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(c cVar, d dVar, kd.c cVar2) {
        k kVar;
        int i7;
        kotlin.jvm.internal.r rVar;
        Throwable th2;
        a1 a1Var;
        CancellationException cancellationException;
        if (cVar2 instanceof k) {
            kVar = (k) cVar2;
            int i10 = kVar.c;
            if ((i10 & TLObject.FLAG_31) != 0) {
                kVar.c = i10 - TLObject.FLAG_31;
                Object obj = kVar.b;
                jd.a aVar = jd.a.a;
                i7 = kVar.c;
                if (i7 != 0) {
                    af.b.c(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    try {
                        d mVar = new m(dVar, rVar2);
                        kVar.a = rVar2;
                        kVar.c = 1;
                        if (cVar.B(mVar, kVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar = rVar2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = kVar.a;
                    try {
                        af.b.c(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) rVar.a;
                if ((th2 == null && th2.equals(th)) || ((a1Var = (a1) kVar.getContext().get(zd.y.b)) != null && a1Var.isCancelled() && (cancellationException = a1Var.getCancellationException()) != null && cancellationException.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    la.a(th2, th);
                    throw th2;
                }
                la.a(th, th2);
                throw th;
            }
        }
        kVar = new k(cVar2);
        Object obj2 = kVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = kVar.c;
        if (i7 != 0) {
        }
        th2 = (Throwable) rVar.a;
        if (th2 == null) {
        }
        if (th2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.a(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [be.t] */
    /* JADX WARN: Type inference failed for: r9v6, types: [be.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, be.r rVar, boolean z9, kd.c cVar) {
        e eVar;
        int i7;
        be.b bVar;
        be.r rVar2;
        be.b bVar2;
        d dVar2;
        be.r rVar3;
        try {
            if (cVar instanceof e) {
                eVar = (e) cVar;
                int i10 = eVar.f;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    eVar.f = i10 - TLObject.FLAG_31;
                    Object obj = eVar.e;
                    jd.a aVar = jd.a.a;
                    i7 = eVar.f;
                    if (i7 != 0) {
                        af.b.c(obj);
                        if (dVar instanceof z) {
                            throw ((z) dVar).a;
                        }
                        be.c cVar2 = rVar.d;
                        cVar2.getClass();
                        bVar = new be.b(cVar2);
                        rVar3 = rVar;
                        eVar.a = dVar;
                        eVar.b = rVar3;
                        eVar.c = bVar;
                        eVar.d = z9;
                        eVar.f = 1;
                        obj = bVar.b(eVar);
                        if (obj != aVar) {
                        }
                    } else if (i7 == 1) {
                        z9 = eVar.d;
                        bVar2 = eVar.c;
                        ?? r92 = eVar.b;
                        dVar2 = eVar.a;
                        af.b.c(obj);
                        rVar2 = r92;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z9 = eVar.d;
                        bVar2 = eVar.c;
                        ?? r93 = eVar.b;
                        dVar2 = eVar.a;
                        af.b.c(obj);
                        be.r rVar4 = r93;
                        d dVar3 = dVar2;
                        bVar = bVar2;
                        dVar = dVar3;
                        rVar3 = rVar4;
                        eVar.a = dVar;
                        eVar.b = rVar3;
                        eVar.c = bVar;
                        eVar.d = z9;
                        eVar.f = 1;
                        obj = bVar.b(eVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        be.b bVar3 = bVar;
                        dVar2 = dVar;
                        bVar2 = bVar3;
                        rVar2 = rVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z9) {
                                rVar2.cancel(null);
                            }
                            return gd.k.a;
                        }
                        Object obj2 = bVar2.a;
                        com.google.android.gms.internal.clearcut.e eVar2 = be.e.p;
                        if (obj2 == eVar2) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.a = eVar2;
                        if (obj2 == be.e.l) {
                            Throwable n10 = bVar2.c.n();
                            int i11 = ee.s.a;
                            throw n10;
                        }
                        eVar.a = dVar2;
                        eVar.b = rVar2;
                        eVar.c = bVar2;
                        eVar.d = z9;
                        eVar.f = 2;
                        rVar4 = rVar2;
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z9) {
                    CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th2);
                    }
                    rVar.cancel(cancellationException);
                }
                throw th3;
            }
        }
        eVar = new e(cVar);
        Object obj3 = eVar.e;
        jd.a aVar2 = jd.a.a;
        i7 = eVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, kd.c cVar2) {
        s sVar;
        int i7;
        com.google.android.gms.internal.clearcut.e eVar;
        kotlin.jvm.internal.r rVar;
        de.a e10;
        r rVar2;
        Object obj;
        if (cVar2 instanceof s) {
            sVar = (s) cVar2;
            int i10 = sVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                sVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = sVar.c;
                Object obj3 = jd.a.a;
                i7 = sVar.d;
                eVar = de.g.a;
                if (i7 != 0) {
                    af.b.c(obj2);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    rVar3.a = eVar;
                    r rVar4 = new r(rVar3, 0);
                    try {
                        sVar.a = rVar3;
                        sVar.b = rVar4;
                        sVar.d = 1;
                        if (cVar.B(rVar4, sVar) == obj3) {
                            return obj3;
                        }
                        rVar = rVar3;
                    } catch (de.a e11) {
                        rVar = rVar3;
                        e10 = e11;
                        rVar2 = rVar4;
                        if (e10.a != rVar2) {
                        }
                        obj = rVar.a;
                        if (obj == eVar) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar2 = sVar.b;
                    rVar = sVar.a;
                    try {
                        af.b.c(obj2);
                    } catch (de.a e12) {
                        e10 = e12;
                        if (e10.a != rVar2) {
                            throw e10;
                        }
                        obj = rVar.a;
                        if (obj == eVar) {
                        }
                    }
                }
                obj = rVar.a;
                if (obj == eVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        sVar = new s(cVar2);
        Object obj22 = sVar.c;
        Object obj32 = jd.a.a;
        i7 = sVar.d;
        eVar = de.g.a;
        if (i7 != 0) {
        }
        obj = rVar.a;
        if (obj == eVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(c cVar, kd.c cVar2) {
        t tVar;
        int i7;
        kotlin.jvm.internal.r rVar;
        de.a e10;
        r rVar2;
        if (cVar2 instanceof t) {
            tVar = (t) cVar2;
            int i10 = tVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                tVar.d = i10 - TLObject.FLAG_31;
                Object obj = tVar.c;
                Object obj2 = jd.a.a;
                i7 = tVar.d;
                if (i7 != 0) {
                    af.b.c(obj);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    r rVar4 = new r(rVar3, 1);
                    try {
                        tVar.a = rVar3;
                        tVar.b = rVar4;
                        tVar.d = 1;
                        if (cVar.B(rVar4, tVar) == obj2) {
                            return obj2;
                        }
                        rVar = rVar3;
                    } catch (de.a e11) {
                        rVar = rVar3;
                        e10 = e11;
                        rVar2 = rVar4;
                        if (e10.a != rVar2) {
                        }
                        return rVar.a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar2 = tVar.b;
                    rVar = tVar.a;
                    try {
                        af.b.c(obj);
                    } catch (de.a e12) {
                        e10 = e12;
                        if (e10.a != rVar2) {
                            throw e10;
                        }
                        return rVar.a;
                    }
                }
                return rVar.a;
            }
        }
        tVar = new t(cVar2);
        Object obj3 = tVar.c;
        Object obj22 = jd.a.a;
        i7 = tVar.d;
        if (i7 != 0) {
        }
        return rVar.a;
    }
}
