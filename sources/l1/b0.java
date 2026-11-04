package l1;

import b8.gb;
import b8.hb;
import b8.ib;
import gi.w5;
import java.util.List;
import org.telegram.tgnet.TLObject;
import wd.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 implements g {
    public final f0 a;
    public final w5 b;
    public final wd.z c;
    public final z6.c d;
    public int f;
    public s1 g;
    public final za.p i;
    public final dd.i j;
    public final dd.i k;
    public final ui.f l;
    public final fe.d e = new fe.d();
    public final hi.d h = new hi.d(7);

    public b0(f0 f0Var, List list, w5 w5Var, wd.z zVar) {
        this.a = f0Var;
        this.b = w5Var;
        this.c = zVar;
        fd.c cVar = null;
        this.d = new z6.c((od.p) new ae.c(this, cVar, 3));
        za.p pVar = new za.p();
        pVar.d = this;
        pVar.a = new fe.d();
        pVar.b = wd.b0.a();
        pVar.c = ed.g.l(list);
        this.i = pVar;
        this.j = hb.b(new l(this, 1));
        this.k = hb.b(new l(this, 0));
        this.l = new ui.f(zVar, new y(this, 0), new ae.d(this, cVar, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b0 b0Var, hd.c cVar) {
        p pVar;
        int i3;
        fe.d dVar;
        int i10;
        try {
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i11 = pVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    pVar.e = i11 - TLObject.FLAG_31;
                    Object obj = pVar.c;
                    gd.a aVar = gd.a.a;
                    i3 = pVar.e;
                    if (i3 != 0) {
                        ib.b(obj);
                        dVar = b0Var.e;
                        pVar.a = b0Var;
                        pVar.b = dVar;
                        pVar.e = 1;
                        if (dVar.d(pVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fe.d dVar2 = pVar.b;
                        b0 b0Var2 = pVar.a;
                        ib.b(obj);
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
                    return dd.k.a;
                }
            }
            i10 = b0Var.f - 1;
            b0Var.f = i10;
            if (i10 == 0) {
            }
            dVar.f(null);
            return dd.k.a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
        pVar = new p(b0Var, cVar);
        Object obj2 = pVar.c;
        gd.a aVar2 = gd.a.a;
        i3 = pVar.e;
        if (i3 != 0) {
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
    /* JADX WARN: Type inference failed for: r2v3, types: [hd.j, od.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [hd.j, od.p] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b0 b0Var, n0 n0Var, hd.c cVar) {
        q qVar;
        int i3;
        wd.t tVar;
        b0 b0Var2;
        Object b10;
        wd.s sVar;
        Throwable a10;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f;
            if ((i10 & TLObject.FLAG_31) != 0) {
                qVar.f = i10 - TLObject.FLAG_31;
                Object obj = qVar.d;
                gd.a aVar = gd.a.a;
                i3 = qVar.f;
                boolean z10 = true;
                if (i3 == 0) {
                    try {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                wd.t tVar2 = qVar.c;
                                b0 b0Var3 = qVar.b;
                                n0 n0Var2 = (n0) qVar.a;
                                ib.b(obj);
                                tVar = tVar2;
                                b0Var2 = b0Var3;
                                n0Var = n0Var2;
                            } else if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        wd.s sVar2 = (wd.s) qVar.a;
                        ib.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = ib.a(th);
                        sVar = b0Var;
                        a10 = dd.g.a(obj);
                        wd.t tVar3 = (wd.t) sVar;
                        if (a10 == null) {
                        }
                        return dd.k.a;
                    }
                    a10 = dd.g.a(obj);
                    wd.t tVar32 = (wd.t) sVar;
                    if (a10 == null) {
                        tVar32.C(obj);
                    } else {
                        tVar32.Q(a10);
                    }
                    return dd.k.a;
                }
                ib.b(obj);
                tVar = n0Var.b;
                try {
                    f1 j22 = b0Var.h.j2();
                    if (j22 instanceof c) {
                        ?? r22 = n0Var.a;
                        fd.h hVar = n0Var.d;
                        qVar.a = tVar;
                        qVar.f = 1;
                        try {
                            b10 = b0Var.g().b(new x(b0Var, hVar, (od.p) r22, (fd.c) null), qVar);
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            b0Var = tVar;
                            obj = ib.a(th);
                            sVar = b0Var;
                            a10 = dd.g.a(obj);
                            wd.t tVar322 = (wd.t) sVar;
                            if (a10 == null) {
                            }
                            return dd.k.a;
                        }
                    } else {
                        if (!(j22 instanceof x0)) {
                            z10 = j22 instanceof g1;
                        }
                        if (!z10) {
                            if (j22 instanceof l0) {
                                throw ((l0) j22).b;
                            }
                            throw new androidx.car.app.j();
                        }
                        if (j22 != n0Var.c) {
                            kotlin.jvm.internal.j.c(j22, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((x0) j22).b;
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
                    obj = ib.a(th);
                    sVar = b0Var;
                    a10 = dd.g.a(obj);
                    wd.t tVar3222 = (wd.t) sVar;
                    if (a10 == null) {
                    }
                    return dd.k.a;
                }
                ?? r23 = n0Var.a;
                fd.h hVar2 = n0Var.d;
                qVar.a = tVar;
                qVar.b = null;
                qVar.c = null;
                qVar.f = 3;
                b10 = b0Var2.g().b(new x(b0Var2, hVar2, (od.p) r23, (fd.c) null), qVar);
            }
        }
        qVar = new q(b0Var, cVar);
        Object obj2 = qVar.d;
        gd.a aVar2 = gd.a.a;
        i3 = qVar.f;
        boolean z102 = true;
        if (i3 == 0) {
        }
        ?? r232 = n0Var.a;
        fd.h hVar22 = n0Var.d;
        qVar.a = tVar;
        qVar.b = null;
        qVar.c = null;
        qVar.f = 3;
        b10 = b0Var2.g().b(new x(b0Var2, hVar22, (od.p) r232, (fd.c) null), qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b0 b0Var, hd.c cVar) {
        r rVar;
        int i3;
        fe.d dVar;
        int i10;
        try {
            if (cVar instanceof r) {
                rVar = (r) cVar;
                int i11 = rVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    rVar.e = i11 - TLObject.FLAG_31;
                    Object obj = rVar.c;
                    gd.a aVar = gd.a.a;
                    i3 = rVar.e;
                    if (i3 != 0) {
                        ib.b(obj);
                        dVar = b0Var.e;
                        rVar.a = b0Var;
                        rVar.b = dVar;
                        rVar.e = 1;
                        if (dVar.d(rVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fe.d dVar2 = rVar.b;
                        b0 b0Var2 = rVar.a;
                        ib.b(obj);
                        dVar = dVar2;
                        b0Var = b0Var2;
                    }
                    fd.c cVar2 = null;
                    i10 = b0Var.f + 1;
                    b0Var.f = i10;
                    if (i10 == 1) {
                        b0Var.g = wd.b0.q(b0Var.c, new m(b0Var, cVar2, 1));
                    }
                    dVar.f(null);
                    return dd.k.a;
                }
            }
            i10 = b0Var.f + 1;
            b0Var.f = i10;
            if (i10 == 1) {
            }
            dVar.f(null);
            return dd.k.a;
        } catch (Throwable th2) {
            dVar.f(null);
            throw th2;
        }
        rVar = new r(b0Var, cVar);
        Object obj2 = rVar.c;
        gd.a aVar2 = gd.a.a;
        i3 = rVar.e;
        if (i3 != 0) {
        }
        fd.c cVar22 = null;
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
    public static final Object e(b0 b0Var, boolean z10, fd.c cVar) {
        t tVar;
        gd.a aVar;
        int i3;
        b0 b0Var2;
        f1 f1Var;
        boolean z11;
        b0 b0Var3;
        dd.e eVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f;
            if ((i10 & TLObject.FLAG_31) != 0) {
                tVar.f = i10 - TLObject.FLAG_31;
                Object obj = tVar.d;
                aVar = gd.a.a;
                i3 = tVar.f;
                if (i3 != 0) {
                    ib.b(obj);
                    f1 j22 = b0Var.h.j2();
                    if (j22 instanceof g1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    m0 g7 = b0Var.g();
                    tVar.a = b0Var;
                    tVar.b = j22;
                    tVar.c = z10;
                    tVar.f = 1;
                    Object d = g7.d(tVar);
                    if (d != aVar) {
                        b0Var2 = b0Var;
                        f1Var = j22;
                        obj = d;
                    }
                    return aVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        b0Var3 = tVar.a;
                        ib.b(obj);
                        eVar = (dd.e) obj;
                        f1 f1Var2 = (f1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return f1Var2;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var3 = tVar.a;
                    ib.b(obj);
                    eVar = (dd.e) obj;
                    f1 f1Var22 = (f1) eVar.a;
                    if (((Boolean) eVar.b).booleanValue()) {
                        b0Var3.h.t2(f1Var22);
                    }
                    return f1Var22;
                }
                z10 = tVar.c;
                f1Var = tVar.b;
                b0Var2 = tVar.a;
                ib.b(obj);
                int intValue = ((Number) obj).intValue();
                z11 = f1Var instanceof c;
                int i11 = !z11 ? f1Var.a : -1;
                if (!z11 && intValue == i11) {
                    return f1Var;
                }
                fd.c cVar2 = null;
                if (z10) {
                    m0 g10 = b0Var2.g();
                    v vVar = new v(b0Var2, i11, cVar2, 0);
                    tVar.a = b0Var2;
                    tVar.b = null;
                    tVar.f = 3;
                    obj = g10.c(vVar, tVar);
                    if (obj != aVar) {
                        b0Var3 = b0Var2;
                        eVar = (dd.e) obj;
                        f1 f1Var222 = (f1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return f1Var222;
                    }
                } else {
                    m0 g11 = b0Var2.g();
                    u uVar = new u(b0Var2, null);
                    tVar.a = b0Var2;
                    tVar.b = null;
                    tVar.f = 2;
                    obj = g11.b(uVar, tVar);
                    if (obj != aVar) {
                        b0Var3 = b0Var2;
                        eVar = (dd.e) obj;
                        f1 f1Var2222 = (f1) eVar.a;
                        if (((Boolean) eVar.b).booleanValue()) {
                        }
                        return f1Var2222;
                    }
                }
                return aVar;
            }
        }
        tVar = new t(b0Var, cVar);
        Object obj2 = tVar.d;
        aVar = gd.a.a;
        i3 = tVar.f;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z11 = f1Var instanceof c;
        if (!z11) {
        }
        if (!z11) {
        }
        fd.c cVar22 = null;
        if (z10) {
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
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #3 {all -> 0x016d, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[Catch: b -> 0x005f, TryCatch #0 {b -> 0x005f, blocks: (B:36:0x005a, B:37:0x00ff, B:40:0x0068, B:41:0x00e0, B:56:0x0085, B:58:0x009f, B:59:0x00a5, B:65:0x008e, B:68:0x00cd), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(b0 b0Var, boolean z10, hd.c cVar) {
        w wVar;
        kotlin.jvm.internal.r rVar;
        b bVar;
        b0 b0Var2;
        boolean z11;
        kotlin.jvm.internal.r rVar2;
        b bVar2;
        Object b10;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.r rVar3;
        Object d;
        b0 b0Var3;
        int i3;
        Object obj;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i10 = wVar.r;
            if ((i10 & TLObject.FLAG_31) != 0) {
                wVar.r = i10 - TLObject.FLAG_31;
                Object obj2 = wVar.h;
                Object obj3 = gd.a.a;
                fd.c cVar2 = null;
                switch (wVar.r) {
                    case 0:
                        ib.b(obj2);
                        if (!z10) {
                            m0 g7 = b0Var.g();
                            wVar.a = b0Var;
                            wVar.e = z10;
                            wVar.r = 3;
                            obj2 = g7.d(wVar);
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            m0 g10 = b0Var.g();
                            v vVar = new v(b0Var, intValue, cVar2, 1);
                            wVar.a = b0Var;
                            wVar.e = z10;
                            wVar.r = 4;
                            obj2 = g10.c(vVar, wVar);
                            if (obj2 == obj3) {
                            }
                            return (c) obj2;
                        }
                        wVar.a = b0Var;
                        wVar.e = z10;
                        wVar.r = 1;
                        obj2 = b0Var.i(wVar);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        m0 g11 = b0Var.g();
                        wVar.a = b0Var;
                        wVar.b = obj2;
                        wVar.e = z10;
                        wVar.f = hashCode;
                        wVar.r = 2;
                        d = g11.d(wVar);
                        if (d != obj3) {
                            b0Var3 = b0Var;
                            i3 = hashCode;
                            obj = obj2;
                            obj2 = d;
                            return new c(obj, i3, ((Number) obj2).intValue());
                        }
                        return obj3;
                    case 1:
                        z10 = wVar.e;
                        b0Var = (b0) wVar.a;
                        ib.b(obj2);
                        if (obj2 == null) {
                        }
                        m0 g112 = b0Var.g();
                        wVar.a = b0Var;
                        wVar.b = obj2;
                        wVar.e = z10;
                        wVar.f = hashCode;
                        wVar.r = 2;
                        d = g112.d(wVar);
                        if (d != obj3) {
                        }
                        return obj3;
                    case 2:
                        i3 = wVar.f;
                        z10 = wVar.e;
                        obj = wVar.b;
                        b0Var3 = (b0) wVar.a;
                        try {
                            ib.b(obj2);
                            return new c(obj, i3, ((Number) obj2).intValue());
                        } catch (b e10) {
                            e = e10;
                            b0Var = b0Var3;
                            rVar = new kotlin.jvm.internal.r();
                            w5 w5Var = b0Var.b;
                            wVar.a = b0Var;
                            wVar.b = e;
                            wVar.c = rVar;
                            wVar.d = rVar;
                            wVar.e = z10;
                            wVar.r = 5;
                            Object invoke = ((od.l) w5Var.b).invoke(e);
                            if (invoke != obj3) {
                                bVar = e;
                                obj2 = invoke;
                                b0Var2 = b0Var;
                                z11 = z10;
                                rVar2 = rVar;
                                rVar2.a = obj2;
                                kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                                try {
                                    x xVar = new x(rVar, b0Var2, pVar2, (fd.c) null);
                                    wVar.a = bVar;
                                    wVar.b = rVar;
                                    wVar.c = pVar2;
                                    wVar.d = null;
                                    wVar.r = 6;
                                    if (z11) {
                                    }
                                    if (b10 != obj3) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bVar2 = bVar;
                                    gb.a(bVar2, th);
                                    throw bVar2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z10 = wVar.e;
                        b0Var = (b0) wVar.a;
                        ib.b(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        m0 g102 = b0Var.g();
                        v vVar2 = new v(b0Var, intValue2, cVar2, 1);
                        wVar.a = b0Var;
                        wVar.e = z10;
                        wVar.r = 4;
                        obj2 = g102.c(vVar2, wVar);
                        if (obj2 == obj3) {
                        }
                        return (c) obj2;
                    case 4:
                        boolean z12 = wVar.e;
                        ib.b(obj2);
                        return (c) obj2;
                    case 5:
                        z11 = wVar.e;
                        rVar2 = wVar.d;
                        rVar = (kotlin.jvm.internal.r) wVar.c;
                        bVar = (b) wVar.b;
                        b0Var2 = (b0) wVar.a;
                        ib.b(obj2);
                        rVar2.a = obj2;
                        kotlin.jvm.internal.p pVar22 = new kotlin.jvm.internal.p();
                        x xVar2 = new x(rVar, b0Var2, pVar22, (fd.c) null);
                        wVar.a = bVar;
                        wVar.b = rVar;
                        wVar.c = pVar22;
                        wVar.d = null;
                        wVar.r = 6;
                        if (z11) {
                            b10 = b0Var2.g().b(new e(xVar2, cVar2, 1), wVar);
                        } else {
                            b0Var2.getClass();
                            b10 = xVar2.invoke(wVar);
                        }
                        if (b10 != obj3) {
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
                            ib.b(obj2);
                            Object obj42 = rVar3.a;
                            obj3 = new c(obj42, obj42 != null ? obj42.hashCode() : 0, pVar.a);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            gb.a(bVar2, th);
                            throw bVar2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        wVar = new w(b0Var, cVar);
        Object obj22 = wVar.h;
        Object obj32 = gd.a.a;
        fd.c cVar22 = null;
        switch (wVar.r) {
        }
    }

    @Override // l1.g
    public final Object a(od.p pVar, hd.c cVar) {
        j1 j1Var = (j1) cVar.getContext().get(i1.a);
        if (j1Var != null) {
            j1Var.a(this);
        }
        return wd.b0.y(new j1(j1Var, this), new ae.c(this, pVar, (fd.c) null), cVar);
    }

    public final m0 g() {
        return (m0) this.k.getValue();
    }

    @Override // l1.g
    public final zd.b getData() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.A(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(hd.c cVar) {
        s sVar;
        int i3;
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
                    gd.a aVar = gd.a.a;
                    i3 = sVar.e;
                    if (i3 != 0) {
                        ib.b(obj);
                        m0 g7 = g();
                        sVar.a = this;
                        sVar.e = 1;
                        obj = g7.d(sVar);
                        if (obj != aVar) {
                            b0Var = this;
                        }
                        return aVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = sVar.b;
                        b0Var2 = sVar.a;
                        try {
                            ib.b(obj);
                            return dd.k.a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            b0Var2.h.t2(new x0(i10, th2));
                            throw th2;
                        }
                    }
                    b0Var = sVar.a;
                    ib.b(obj);
                    intValue = ((Number) obj).intValue();
                    za.p pVar = b0Var.i;
                    sVar.a = b0Var;
                    sVar.b = intValue;
                    sVar.e = 2;
                }
            }
            za.p pVar2 = b0Var.i;
            sVar.a = b0Var;
            sVar.b = intValue;
            sVar.e = 2;
        } catch (Throwable th4) {
            i10 = intValue;
            th2 = th4;
            b0Var2 = b0Var;
            b0Var2.h.t2(new x0(i10, th2));
            throw th2;
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.c;
        gd.a aVar2 = gd.a.a;
        i3 = sVar.e;
        if (i3 != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    public final Object i(hd.c cVar) {
        return ((i0) this.j.getValue()).a(new n(3, (fd.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z10, hd.c cVar) {
        z zVar;
        int i3;
        kotlin.jvm.internal.p pVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i10 = zVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                zVar.d = i10 - TLObject.FLAG_31;
                Object obj2 = zVar.b;
                gd.a aVar = gd.a.a;
                i3 = zVar.d;
                if (i3 != 0) {
                    ib.b(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    i0 i0Var = (i0) this.j.getValue();
                    a0 a0Var = new a0(pVar2, this, obj, z10, null);
                    zVar.a = pVar2;
                    zVar.d = 1;
                    if (i0Var.b(a0Var, zVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = zVar.a;
                    ib.b(obj2);
                }
                return new Integer(pVar.a);
            }
        }
        zVar = new z(this, cVar);
        Object obj22 = zVar.b;
        gd.a aVar2 = gd.a.a;
        i3 = zVar.d;
        if (i3 != 0) {
        }
        return new Integer(pVar.a);
    }
}
