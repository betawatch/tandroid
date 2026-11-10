package m1;

import a8.ab;
import a8.la;
import java.util.List;
import org.telegram.tgnet.TLObject;
import zd.s1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b0 implements g {
    public final f0 a;
    public final h9.f1 b;
    public final zd.z c;
    public final d6.i d;
    public int f;
    public s1 g;
    public final ui.e i;
    public final ab.b0 l;
    public final ie.d e = new ie.d();
    public final h9.f1 h = new h9.f1(14);
    public final gd.i j = ab.b(new l(this, 1));
    public final gd.i k = ab.b(new l(this, 0));

    public b0(f0 f0Var, List list, h9.f1 f1Var, zd.z zVar) {
        this.a = f0Var;
        this.b = f1Var;
        this.c = zVar;
        id.c cVar = null;
        this.d = new d6.i(new de.c(this, cVar, 3));
        this.i = new ui.e(this, list);
        this.l = new ab.b0(zVar, new y(this, 0), new be.l(this, cVar, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b0 b0Var, kd.c cVar) {
        p pVar;
        int i7;
        ie.d dVar;
        int i10;
        try {
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i11 = pVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    pVar.e = i11 - TLObject.FLAG_31;
                    Object obj = pVar.c;
                    jd.a aVar = jd.a.a;
                    i7 = pVar.e;
                    if (i7 != 0) {
                        af.b.c(obj);
                        dVar = b0Var.e;
                        pVar.a = b0Var;
                        pVar.b = dVar;
                        pVar.e = 1;
                        if (dVar.d(pVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ie.d dVar2 = pVar.b;
                        b0 b0Var2 = pVar.a;
                        af.b.c(obj);
                        dVar = dVar2;
                        b0Var = b0Var2;
                    }
                    i10 = b0Var.f - 1;
                    b0Var.f = i10;
                    if (i10 == 0) {
                        s1 s1Var = b0Var.g;
                        if (s1Var != null) {
                            s1Var.cancel(null);
                        }
                        b0Var.g = null;
                    }
                    dVar.f(null);
                    return gd.k.a;
                }
            }
            i10 = b0Var.f - 1;
            b0Var.f = i10;
            if (i10 == 0) {
            }
            dVar.f(null);
            return gd.k.a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
        pVar = new p(b0Var, cVar);
        Object obj2 = pVar.c;
        jd.a aVar2 = jd.a.a;
        i7 = pVar.e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(8:55|(1:(1:(2:59|60))(3:61|62|63))|64|65|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|67|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b0 b0Var, n0 n0Var, kd.c cVar) {
        q qVar;
        int i7;
        zd.t tVar;
        b0 b0Var2;
        Object c10;
        zd.s sVar;
        Throwable a10;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f;
            if ((i10 & TLObject.FLAG_31) != 0) {
                qVar.f = i10 - TLObject.FLAG_31;
                Object obj = qVar.d;
                jd.a aVar = jd.a.a;
                i7 = qVar.f;
                boolean z9 = true;
                if (i7 == 0) {
                    try {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                zd.t tVar2 = qVar.c;
                                b0 b0Var3 = qVar.b;
                                n0 n0Var2 = (n0) qVar.a;
                                af.b.c(obj);
                                tVar = tVar2;
                                b0Var2 = b0Var3;
                                n0Var = n0Var2;
                            } else if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        zd.s sVar2 = (zd.s) qVar.a;
                        af.b.c(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = af.b.b(th);
                        sVar = b0Var;
                        a10 = gd.g.a(obj);
                        zd.t tVar3 = (zd.t) sVar;
                        if (a10 == null) {
                        }
                        return gd.k.a;
                    }
                    a10 = gd.g.a(obj);
                    zd.t tVar32 = (zd.t) sVar;
                    if (a10 == null) {
                        tVar32.C(obj);
                    } else {
                        tVar32.Q(a10);
                    }
                    return gd.k.a;
                }
                af.b.c(obj);
                tVar = n0Var.b;
                try {
                    e1 T1 = b0Var.h.T1();
                    if (T1 instanceof c) {
                        ?? r22 = n0Var.a;
                        id.h hVar = n0Var.d;
                        qVar.a = tVar;
                        qVar.f = 1;
                        try {
                            c10 = b0Var.g().c(new x(b0Var, hVar, (rd.p) r22, (id.c) null), qVar);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            b0Var = tVar;
                            obj = af.b.b(th);
                            sVar = b0Var;
                            a10 = gd.g.a(obj);
                            zd.t tVar322 = (zd.t) sVar;
                            if (a10 == null) {
                            }
                            return gd.k.a;
                        }
                    } else {
                        if (!(T1 instanceof w0)) {
                            z9 = T1 instanceof f1;
                        }
                        if (!z9) {
                            if (T1 instanceof l0) {
                                throw ((l0) T1).b;
                            }
                            throw new androidx.car.app.j();
                        }
                        if (T1 != n0Var.c) {
                            kotlin.jvm.internal.j.c(T1, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((w0) T1).b;
                        }
                        qVar.a = n0Var;
                        qVar.b = b0Var;
                        qVar.c = tVar;
                        qVar.f = 2;
                        Object h = b0Var.h(qVar);
                        b0Var2 = b0Var;
                        if (h == aVar) {
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    b0Var = tVar;
                    obj = af.b.b(th);
                    sVar = b0Var;
                    a10 = gd.g.a(obj);
                    zd.t tVar3222 = (zd.t) sVar;
                    if (a10 == null) {
                    }
                    return gd.k.a;
                }
                ?? r23 = n0Var.a;
                id.h hVar2 = n0Var.d;
                qVar.a = tVar;
                qVar.b = null;
                qVar.c = null;
                qVar.f = 3;
                c10 = b0Var2.g().c(new x(b0Var2, hVar2, (rd.p) r23, (id.c) null), qVar);
            }
        }
        qVar = new q(b0Var, cVar);
        Object obj2 = qVar.d;
        jd.a aVar2 = jd.a.a;
        i7 = qVar.f;
        boolean z92 = true;
        if (i7 == 0) {
        }
        ?? r232 = n0Var.a;
        id.h hVar22 = n0Var.d;
        qVar.a = tVar;
        qVar.b = null;
        qVar.c = null;
        qVar.f = 3;
        c10 = b0Var2.g().c(new x(b0Var2, hVar22, (rd.p) r232, (id.c) null), qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b0 b0Var, kd.c cVar) {
        r rVar;
        int i7;
        ie.d dVar;
        int i10;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i11 = rVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    rVar.e = i11 - TLObject.FLAG_31;
                    Object obj = rVar.c;
                    jd.a aVar = jd.a.a;
                    i7 = rVar.e;
                    if (i7 != 0) {
                        af.b.c(obj);
                        dVar = b0Var.e;
                        rVar.a = b0Var;
                        rVar.b = dVar;
                        rVar.e = 1;
                        if (dVar.d(rVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ie.d dVar2 = rVar.b;
                        b0 b0Var2 = rVar.a;
                        af.b.c(obj);
                        dVar = dVar2;
                        b0Var = b0Var2;
                    }
                    id.c cVar2 = null;
                    i10 = b0Var.f + 1;
                    b0Var.f = i10;
                    if (i10 == 1) {
                        b0Var.g = zd.b0.q(b0Var.c, new m(b0Var, cVar2, 1));
                    }
                    dVar.f(null);
                    return gd.k.a;
                }
            }
            i10 = b0Var.f + 1;
            b0Var.f = i10;
            if (i10 == 1) {
            }
            dVar.f(null);
            return gd.k.a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
        rVar = new r(b0Var, cVar);
        Object obj2 = rVar.c;
        jd.a aVar2 = jd.a.a;
        i7 = rVar.e;
        if (i7 != 0) {
        }
        id.c cVar22 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b0 b0Var, boolean z9, id.c cVar) {
        t tVar;
        jd.a aVar;
        int i7;
        b0 b0Var2;
        e1 e1Var;
        boolean z10;
        b0 b0Var3;
        gd.e eVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f;
            if ((i10 & TLObject.FLAG_31) != 0) {
                tVar.f = i10 - TLObject.FLAG_31;
                Object obj = tVar.d;
                aVar = jd.a.a;
                i7 = tVar.f;
                if (i7 != 0) {
                    af.b.c(obj);
                    e1 T1 = b0Var.h.T1();
                    if (T1 instanceof f1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    m0 g10 = b0Var.g();
                    tVar.a = b0Var;
                    tVar.b = T1;
                    tVar.c = z9;
                    tVar.f = 1;
                    Object b10 = g10.b(tVar);
                    if (b10 != aVar) {
                        b0Var2 = b0Var;
                        e1Var = T1;
                        obj = b10;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        b0Var3 = tVar.a;
                        af.b.c(obj);
                        eVar = (gd.e) obj;
                        e1 e1Var2 = (e1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return e1Var2;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var3 = tVar.a;
                    af.b.c(obj);
                    eVar = (gd.e) obj;
                    e1 e1Var22 = (e1) eVar.a;
                    if (((Boolean) eVar.b).booleanValue()) {
                        b0Var3.h.h2(e1Var22);
                    }
                    return e1Var22;
                }
                z9 = tVar.c;
                e1Var = tVar.b;
                b0Var2 = tVar.a;
                af.b.c(obj);
                int intValue = ((Number) obj).intValue();
                z10 = e1Var instanceof c;
                int i11 = !z10 ? e1Var.a : -1;
                if (!z10 && intValue == i11) {
                    return e1Var;
                }
                id.c cVar2 = null;
                if (z9) {
                    m0 g11 = b0Var2.g();
                    v vVar = new v(b0Var2, i11, cVar2, 0);
                    tVar.a = b0Var2;
                    tVar.b = null;
                    tVar.f = 3;
                    obj = g11.a(vVar, tVar);
                    if (obj != aVar) {
                        b0Var3 = b0Var2;
                        eVar = (gd.e) obj;
                        e1 e1Var222 = (e1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return e1Var222;
                    }
                } else {
                    m0 g12 = b0Var2.g();
                    u uVar = new u(b0Var2, null);
                    tVar.a = b0Var2;
                    tVar.b = null;
                    tVar.f = 2;
                    obj = g12.c(uVar, tVar);
                    if (obj != aVar) {
                        b0Var3 = b0Var2;
                        eVar = (gd.e) obj;
                        e1 e1Var2222 = (e1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return e1Var2222;
                    }
                }
                return aVar;
            }
        }
        tVar = new t(b0Var, cVar);
        Object obj2 = tVar.d;
        aVar = jd.a.a;
        i7 = tVar.f;
        if (i7 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z10 = e1Var instanceof c;
        if (!z10) {
        }
        if (!z10) {
        }
        id.c cVar22 = null;
        if (z9) {
        }
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140 A[Catch: all -> 0x016d, TryCatch #2 {all -> 0x016d, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #2 {all -> 0x016d, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[Catch: b -> 0x005f, TryCatch #3 {b -> 0x005f, blocks: (B:36:0x005a, B:37:0x00ff, B:40:0x0068, B:41:0x00e0, B:56:0x0085, B:58:0x009f, B:59:0x00a5, B:65:0x008e, B:68:0x00cd), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(b0 b0Var, boolean z9, kd.c cVar) {
        w wVar;
        kotlin.jvm.internal.r rVar;
        b bVar;
        b0 b0Var2;
        boolean z10;
        kotlin.jvm.internal.r rVar2;
        b bVar2;
        Object c10;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.r rVar3;
        Object b10;
        b0 b0Var3;
        int i7;
        Object obj;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i10 = wVar.r;
            if ((i10 & TLObject.FLAG_31) != 0) {
                wVar.r = i10 - TLObject.FLAG_31;
                Object obj2 = wVar.h;
                Object obj3 = jd.a.a;
                id.c cVar2 = null;
                switch (wVar.r) {
                    case 0:
                        af.b.c(obj2);
                        if (!z9) {
                            m0 g10 = b0Var.g();
                            wVar.a = b0Var;
                            wVar.e = z9;
                            wVar.r = 3;
                            obj2 = g10.b(wVar);
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            m0 g11 = b0Var.g();
                            v vVar = new v(b0Var, intValue, cVar2, 1);
                            wVar.a = b0Var;
                            wVar.e = z9;
                            wVar.r = 4;
                            obj2 = g11.a(vVar, wVar);
                            if (obj2 == obj3) {
                            }
                            return (c) obj2;
                        }
                        wVar.a = b0Var;
                        wVar.e = z9;
                        wVar.r = 1;
                        obj2 = b0Var.i(wVar);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        m0 g12 = b0Var.g();
                        wVar.a = b0Var;
                        wVar.b = obj2;
                        wVar.e = z9;
                        wVar.f = hashCode;
                        wVar.r = 2;
                        b10 = g12.b(wVar);
                        if (b10 != obj3) {
                            b0Var3 = b0Var;
                            i7 = hashCode;
                            obj = obj2;
                            obj2 = b10;
                            return new c(obj, i7, ((Number) obj2).intValue());
                        }
                        return obj3;
                    case 1:
                        z9 = wVar.e;
                        b0Var = (b0) wVar.a;
                        af.b.c(obj2);
                        if (obj2 == null) {
                        }
                        m0 g122 = b0Var.g();
                        wVar.a = b0Var;
                        wVar.b = obj2;
                        wVar.e = z9;
                        wVar.f = hashCode;
                        wVar.r = 2;
                        b10 = g122.b(wVar);
                        if (b10 != obj3) {
                        }
                        return obj3;
                    case 2:
                        i7 = wVar.f;
                        z9 = wVar.e;
                        obj = wVar.b;
                        b0Var3 = (b0) wVar.a;
                        try {
                            af.b.c(obj2);
                            return new c(obj, i7, ((Number) obj2).intValue());
                        } catch (b e10) {
                            e = e10;
                            b0Var = b0Var3;
                            rVar = new kotlin.jvm.internal.r();
                            h9.f1 f1Var = b0Var.b;
                            wVar.a = b0Var;
                            wVar.b = e;
                            wVar.c = rVar;
                            wVar.d = rVar;
                            wVar.e = z9;
                            wVar.r = 5;
                            Object invoke = ((rd.l) f1Var.b).invoke(e);
                            if (invoke != obj3) {
                                bVar = e;
                                obj2 = invoke;
                                b0Var2 = b0Var;
                                z10 = z9;
                                rVar2 = rVar;
                                rVar2.a = obj2;
                                kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                                try {
                                    x xVar = new x(rVar, b0Var2, pVar2, (id.c) null);
                                    wVar.a = bVar;
                                    wVar.b = rVar;
                                    wVar.c = pVar2;
                                    wVar.d = null;
                                    wVar.r = 6;
                                    if (z10) {
                                    }
                                    if (c10 != obj3) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar2 = bVar;
                                    la.a(bVar2, th);
                                    throw bVar2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z9 = wVar.e;
                        b0Var = (b0) wVar.a;
                        af.b.c(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        m0 g112 = b0Var.g();
                        v vVar2 = new v(b0Var, intValue2, cVar2, 1);
                        wVar.a = b0Var;
                        wVar.e = z9;
                        wVar.r = 4;
                        obj2 = g112.a(vVar2, wVar);
                        if (obj2 == obj3) {
                        }
                        return (c) obj2;
                    case 4:
                        boolean z11 = wVar.e;
                        af.b.c(obj2);
                        return (c) obj2;
                    case 5:
                        z10 = wVar.e;
                        rVar2 = wVar.d;
                        rVar = (kotlin.jvm.internal.r) wVar.c;
                        bVar = (b) wVar.b;
                        b0Var2 = (b0) wVar.a;
                        af.b.c(obj2);
                        rVar2.a = obj2;
                        kotlin.jvm.internal.p pVar22 = new kotlin.jvm.internal.p();
                        x xVar2 = new x(rVar, b0Var2, pVar22, (id.c) null);
                        wVar.a = bVar;
                        wVar.b = rVar;
                        wVar.c = pVar22;
                        wVar.d = null;
                        wVar.r = 6;
                        if (z10) {
                            c10 = b0Var2.g().c(new e(xVar2, cVar2, 1), wVar);
                        } else {
                            b0Var2.getClass();
                            c10 = xVar2.invoke(wVar);
                        }
                        if (c10 != obj3) {
                            pVar = pVar22;
                            rVar3 = rVar;
                            Object obj4 = rVar3.a;
                            obj3 = new c(obj4, obj4 != null ? obj4.hashCode() : 0, pVar.a);
                        }
                        return obj3;
                    case 6:
                        pVar = (kotlin.jvm.internal.p) wVar.c;
                        rVar3 = (kotlin.jvm.internal.r) wVar.b;
                        bVar2 = (b) wVar.a;
                        try {
                            af.b.c(obj2);
                            Object obj42 = rVar3.a;
                            obj3 = new c(obj42, obj42 != null ? obj42.hashCode() : 0, pVar.a);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            la.a(bVar2, th);
                            throw bVar2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        wVar = new w(b0Var, cVar);
        Object obj22 = wVar.h;
        Object obj32 = jd.a.a;
        id.c cVar22 = null;
        switch (wVar.r) {
        }
    }

    @Override // m1.g
    public final Object a(rd.p pVar, kd.c cVar) {
        i1 i1Var = (i1) cVar.getContext().get(h1.a);
        if (i1Var != null) {
            i1Var.a(this);
        }
        return zd.b0.y(new i1(i1Var, this), new de.c(this, pVar, (id.c) null), cVar);
    }

    public final m0 g() {
        return (m0) this.k.getValue();
    }

    @Override // m1.g
    public final ce.c getData() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.V(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(kd.c cVar) {
        s sVar;
        int i7;
        b0 b0Var;
        int intValue;
        int i10;
        Throwable th2;
        b0 b0Var2;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i11 = sVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    sVar.e = i11 - TLObject.FLAG_31;
                    Object obj = sVar.c;
                    jd.a aVar = jd.a.a;
                    i7 = sVar.e;
                    if (i7 != 0) {
                        af.b.c(obj);
                        m0 g10 = g();
                        sVar.a = this;
                        sVar.e = 1;
                        obj = g10.b(sVar);
                        if (obj != aVar) {
                            b0Var = this;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = sVar.b;
                        b0Var2 = sVar.a;
                        try {
                            af.b.c(obj);
                            return gd.k.a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            b0Var2.h.h2(new w0(i10, th2));
                            throw th2;
                        }
                    }
                    b0Var = sVar.a;
                    af.b.c(obj);
                    intValue = ((Number) obj).intValue();
                    ui.e eVar = b0Var.i;
                    sVar.a = b0Var;
                    sVar.b = intValue;
                    sVar.e = 2;
                }
            }
            ui.e eVar2 = b0Var.i;
            sVar.a = b0Var;
            sVar.b = intValue;
            sVar.e = 2;
        } catch (Throwable th4) {
            i10 = intValue;
            th2 = th4;
            b0Var2 = b0Var;
            b0Var2.h.h2(new w0(i10, th2));
            throw th2;
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.c;
        jd.a aVar2 = jd.a.a;
        i7 = sVar.e;
        if (i7 != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    public final Object i(kd.c cVar) {
        return ((i0) this.j.getValue()).a(new n(3, (id.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z9, kd.c cVar) {
        z zVar;
        int i7;
        kotlin.jvm.internal.p pVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = zVar.b;
                jd.a aVar = jd.a.a;
                i7 = zVar.d;
                if (i7 != 0) {
                    af.b.c(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    i0 i0Var = (i0) this.j.getValue();
                    a0 a0Var = new a0(pVar2, this, obj, z9, null);
                    zVar.a = pVar2;
                    zVar.d = 1;
                    if (i0Var.b(a0Var, zVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = zVar.a;
                    af.b.c(obj2);
                }
                return new Integer(pVar.a);
            }
        }
        zVar = new z(this, cVar);
        Object obj22 = zVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = zVar.d;
        if (i7 != 0) {
        }
        return new Integer(pVar.a);
    }
}
