package k1;

import androidx.lifecycle.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k7.n7;
import k7.o7;
import k7.p7;
import ld.f1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d0 implements g {
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final Object s = new Object();
    public final k0 a;
    public final cb.b b;
    public final androidx.biometric.e0 c;
    public final sc.g e;
    public List h;
    public final com.google.firebase.messaging.r n;
    public final String d = ".tmp";
    public final od.m f = new od.m(f0.a);

    public d0(k0 k0Var, List list, cb.b bVar, ld.c0 c0Var) {
        this.a = k0Var;
        this.b = bVar;
        uc.c cVar = null;
        int i10 = 1;
        this.c = new androidx.biometric.e0(new p(this, cVar, i10), 25);
        this.e = o7.a(new k0(this, i10));
        this.h = tc.g.m(list);
        int i11 = 0;
        o oVar = new o(this, i11);
        p pVar = new p(this, cVar, i11);
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r();
        rVar.a = c0Var;
        rVar.b = pVar;
        nd.a[] aVarArr = nd.a.a;
        rVar.c = new nd.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        rVar.d = new AtomicInteger(0);
        f1 f1Var = (f1) c0Var.c().get(ld.b0.b);
        if (f1Var != null) {
            f1Var.invokeOnCompletion(new j(i11, oVar, rVar));
        }
        this.n = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [dd.p, wc.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dd.p, wc.i] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d0 d0Var, l lVar, wc.c cVar) {
        t tVar;
        int i10;
        ld.t tVar2;
        d0 d0Var2;
        Object h;
        ld.s sVar;
        Throwable a2;
        e0 e0Var;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.f;
            if ((i11 & TLObject.FLAG_31) != 0) {
                tVar.f = i11 - TLObject.FLAG_31;
                Object obj = tVar.d;
                vc.a aVar = vc.a.a;
                i10 = tVar.f;
                boolean z4 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                ld.t tVar3 = tVar.c;
                                d0 d0Var3 = tVar.b;
                                l lVar2 = (l) tVar.a;
                                p7.b(obj);
                                tVar2 = tVar3;
                                d0Var2 = d0Var3;
                                lVar = lVar2;
                            } else if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        ld.s sVar2 = (ld.s) tVar.a;
                        p7.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = p7.a(th);
                        sVar = d0Var;
                        a2 = sc.f.a(obj);
                        ld.t tVar4 = (ld.t) sVar;
                        if (a2 != null) {
                        }
                        return sc.i.a;
                    }
                    a2 = sc.f.a(obj);
                    ld.t tVar42 = (ld.t) sVar;
                    if (a2 != null) {
                        tVar42.A(obj);
                    } else {
                        tVar42.L(a2);
                    }
                    return sc.i.a;
                }
                p7.b(obj);
                tVar2 = lVar.b;
                try {
                    e0Var = (e0) d0Var.f.b();
                } catch (Throwable th3) {
                    th = th3;
                    d0Var = tVar2;
                    obj = p7.a(th);
                    sVar = d0Var;
                    a2 = sc.f.a(obj);
                    ld.t tVar422 = (ld.t) sVar;
                    if (a2 != null) {
                    }
                    return sc.i.a;
                }
                if (e0Var instanceof b) {
                    ?? r22 = lVar.a;
                    uc.h hVar = lVar.d;
                    tVar.a = tVar2;
                    tVar.f = 1;
                    h = d0Var.h(r22, hVar, tVar);
                    if (h == aVar) {
                    }
                    ld.t tVar5 = tVar2;
                    obj = h;
                    sVar = tVar5;
                    a2 = sc.f.a(obj);
                    ld.t tVar4222 = (ld.t) sVar;
                    if (a2 != null) {
                    }
                    return sc.i.a;
                }
                if (!(e0Var instanceof i)) {
                    z4 = e0Var instanceof f0;
                }
                if (!z4) {
                    if (e0Var instanceof h) {
                        throw ((h) e0Var).a;
                    }
                    throw new a7.b();
                }
                if (e0Var != lVar.c) {
                    throw ((i) e0Var).a;
                }
                tVar.a = lVar;
                tVar.b = d0Var;
                tVar.c = tVar2;
                tVar.f = 2;
                Object d = d0Var.d(tVar);
                d0Var2 = d0Var;
                if (d == aVar) {
                }
                return aVar;
                ?? r23 = lVar.a;
                uc.h hVar2 = lVar.d;
                tVar.a = tVar2;
                tVar.b = null;
                tVar.c = null;
                tVar.f = 3;
                h = d0Var2.h(r23, hVar2, tVar);
            }
        }
        tVar = new t(d0Var, cVar);
        Object obj2 = tVar.d;
        vc.a aVar2 = vc.a.a;
        i10 = tVar.f;
        boolean z42 = true;
        if (i10 == 0) {
        }
        ?? r232 = lVar.a;
        uc.h hVar22 = lVar.d;
        tVar.a = tVar2;
        tVar.b = null;
        tVar.c = null;
        tVar.f = 3;
        h = d0Var2.h(r232, hVar22, tVar);
    }

    @Override // k1.g
    public final Object C(dd.p pVar, wc.c cVar) {
        ld.t a2 = ld.e0.a();
        this.n.k(new l(pVar, a2, (e0) this.f.b(), cVar.getContext()));
        Object h = a2.h(cVar);
        vc.a aVar = vc.a.a;
        return h;
    }

    public final File b() {
        return (File) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wc.c cVar) {
        u uVar;
        int i10;
        ud.a a2;
        kotlin.jvm.internal.q qVar;
        d0 d0Var;
        kotlin.jvm.internal.q qVar2;
        List list;
        d0 d0Var2;
        kotlin.jvm.internal.q qVar3;
        w wVar;
        Iterator it;
        ud.a aVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.o oVar2;
        u uVar2;
        d0 d0Var3;
        ud.d dVar;
        ud.a aVar2;
        kotlin.jvm.internal.q qVar4;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.r;
            if ((i11 & TLObject.FLAG_31) != 0) {
                uVar.r = i11 - TLObject.FLAG_31;
                Object obj = uVar.h;
                vc.a aVar3 = vc.a.a;
                i10 = uVar.r;
                if (i10 != 0) {
                    p7.b(obj);
                    od.m mVar = this.f;
                    if (!kotlin.jvm.internal.j.a(mVar.b(), f0.a) && !(mVar.b() instanceof i)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    a2 = ud.e.a();
                    qVar = new kotlin.jvm.internal.q();
                    uVar.a = this;
                    uVar.b = a2;
                    uVar.c = qVar;
                    uVar.d = qVar;
                    uVar.r = 1;
                    obj = g(uVar);
                    if (obj != aVar3) {
                        d0Var = this;
                        qVar2 = qVar;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (ud.a) uVar.d;
                        oVar2 = (kotlin.jvm.internal.o) uVar.c;
                        qVar4 = (kotlin.jvm.internal.q) uVar.b;
                        d0Var3 = uVar.a;
                        p7.b(obj);
                        try {
                            oVar2.a = true;
                            ((ud.d) aVar2).e(null);
                            od.m mVar2 = d0Var3.f;
                            Object obj2 = qVar4.a;
                            mVar2.d(new b(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return sc.i.a;
                        } catch (Throwable th2) {
                            ((ud.d) aVar2).e(null);
                            throw th2;
                        }
                    }
                    it = uVar.f;
                    wVar = uVar.e;
                    oVar = (kotlin.jvm.internal.o) uVar.d;
                    qVar3 = (kotlin.jvm.internal.q) uVar.c;
                    aVar = (ud.a) uVar.b;
                    d0Var2 = uVar.a;
                    p7.b(obj);
                    while (it.hasNext()) {
                        dd.p pVar = (dd.p) it.next();
                        uVar.a = d0Var2;
                        uVar.b = aVar;
                        uVar.c = qVar3;
                        uVar.d = oVar;
                        uVar.e = wVar;
                        uVar.f = it;
                        uVar.r = 2;
                        if (pVar.invoke(wVar, uVar) == aVar3) {
                            break;
                        }
                    }
                    uVar2 = uVar;
                    oVar2 = oVar;
                    qVar2 = qVar3;
                    a2 = aVar;
                    d0Var3 = d0Var2;
                    d0Var3.h = null;
                    uVar2.a = d0Var3;
                    uVar2.b = qVar2;
                    uVar2.c = oVar2;
                    uVar2.d = a2;
                    uVar2.e = null;
                    uVar2.f = null;
                    uVar2.r = 3;
                    dVar = (ud.d) a2;
                    if (dVar.d(uVar2) != aVar3) {
                        aVar2 = dVar;
                        qVar4 = qVar2;
                        oVar2.a = true;
                        ((ud.d) aVar2).e(null);
                        od.m mVar22 = d0Var3.f;
                        Object obj22 = qVar4.a;
                        mVar22.d(new b(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return sc.i.a;
                    }
                    return aVar3;
                }
                qVar = (kotlin.jvm.internal.q) uVar.d;
                qVar2 = (kotlin.jvm.internal.q) uVar.c;
                a2 = (ud.a) uVar.b;
                d0Var = uVar.a;
                p7.b(obj);
                qVar.a = obj;
                kotlin.jvm.internal.o oVar3 = new kotlin.jvm.internal.o();
                w wVar2 = new w(a2, oVar3, qVar2, d0Var);
                list = d0Var.h;
                if (list != null) {
                    oVar2 = oVar3;
                    uVar2 = uVar;
                    d0Var3 = d0Var;
                    d0Var3.h = null;
                    uVar2.a = d0Var3;
                    uVar2.b = qVar2;
                    uVar2.c = oVar2;
                    uVar2.d = a2;
                    uVar2.e = null;
                    uVar2.f = null;
                    uVar2.r = 3;
                    dVar = (ud.d) a2;
                    if (dVar.d(uVar2) != aVar3) {
                    }
                    return aVar3;
                }
                d0Var2 = d0Var;
                qVar3 = qVar2;
                wVar = wVar2;
                it = list.iterator();
                aVar = a2;
                oVar = oVar3;
                while (it.hasNext()) {
                }
                uVar2 = uVar;
                oVar2 = oVar;
                qVar2 = qVar3;
                a2 = aVar;
                d0Var3 = d0Var2;
                d0Var3.h = null;
                uVar2.a = d0Var3;
                uVar2.b = qVar2;
                uVar2.c = oVar2;
                uVar2.d = a2;
                uVar2.e = null;
                uVar2.f = null;
                uVar2.r = 3;
                dVar = (ud.d) a2;
                if (dVar.d(uVar2) != aVar3) {
                }
                return aVar3;
            }
        }
        uVar = new u(this, cVar);
        Object obj3 = uVar.h;
        vc.a aVar32 = vc.a.a;
        i10 = uVar.r;
        if (i10 != 0) {
        }
        qVar.a = obj3;
        kotlin.jvm.internal.o oVar32 = new kotlin.jvm.internal.o();
        w wVar22 = new w(a2, oVar32, qVar2, d0Var);
        list = d0Var.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(wc.c cVar) {
        x xVar;
        int i10;
        d0 d0Var;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                xVar.d = i11 - TLObject.FLAG_31;
                Object obj = xVar.b;
                vc.a aVar = vc.a.a;
                i10 = xVar.d;
                if (i10 != 0) {
                    p7.b(obj);
                    try {
                        xVar.a = this;
                        xVar.d = 1;
                        if (c(xVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        d0Var = this;
                        d0Var.f.d(new i(th));
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = xVar.a;
                    try {
                        p7.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        d0Var.f.d(new i(th));
                        throw th;
                    }
                }
                return sc.i.a;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.b;
        vc.a aVar2 = vc.a.a;
        i10 = xVar.d;
        if (i10 != 0) {
        }
        return sc.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(wc.c cVar) {
        y yVar;
        int i10;
        d0 d0Var;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                yVar.d = i11 - TLObject.FLAG_31;
                Object obj = yVar.b;
                vc.a aVar = vc.a.a;
                i10 = yVar.d;
                if (i10 != 0) {
                    p7.b(obj);
                    try {
                        yVar.a = this;
                        yVar.d = 1;
                        if (c(yVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        d0Var = this;
                        d0Var.f.d(new i(th));
                        return sc.i.a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d0Var = yVar.a;
                    try {
                        p7.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        d0Var.f.d(new i(th));
                        return sc.i.a;
                    }
                }
                return sc.i.a;
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.b;
        vc.a aVar2 = vc.a.a;
        i10 = yVar.d;
        if (i10 != 0) {
        }
        return sc.i.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [k1.d0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k1.z] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [k1.d0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(wc.c cVar) {
        ?? r02;
        int i10;
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            if (cVar instanceof z) {
                z zVar = (z) cVar;
                int i11 = zVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    zVar.e = i11 - TLObject.FLAG_31;
                    r02 = zVar;
                    Object obj = r02.c;
                    vc.a aVar = vc.a.a;
                    i10 = r02.e;
                    boolean z4 = true;
                    if (i10 != 0) {
                        p7.b(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                n1.g gVar = n1.g.a;
                                r02.a = this;
                                r02.b = fileInputStream2;
                                r02.e = 1;
                                n1.b a2 = gVar.a(fileInputStream2);
                                if (a2 == aVar) {
                                    return aVar;
                                }
                                fileInputStream = fileInputStream2;
                                obj = a2;
                            } catch (Throwable th3) {
                                fileInputStream = fileInputStream2;
                                th2 = th3;
                                r02 = this;
                                throw th2;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            r02 = this;
                            if (r02.b().exists()) {
                                throw e;
                            }
                            return new n1.b(z4);
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.b;
                        r02 = r02.a;
                        try {
                            p7.b(obj);
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                j7.f0.a(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    j7.f0.a(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            j7.f0.a(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e6) {
            e = e6;
        }
        r02 = new z(this, cVar);
        Object obj2 = r02.c;
        vc.a aVar2 = vc.a.a;
        i10 = r02.e;
        boolean z42 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(wc.c cVar) {
        a0 a0Var;
        int i10;
        d0 d0Var;
        a aVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i11 = a0Var.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                a0Var.e = i11 - TLObject.FLAG_31;
                Object obj = a0Var.c;
                vc.a aVar2 = vc.a.a;
                i10 = a0Var.e;
                if (i10 == 0) {
                    if (i10 == 1) {
                        d0Var = (d0) a0Var.a;
                        try {
                            p7.b(obj);
                            return obj;
                        } catch (a e) {
                            e = e;
                            cb.b bVar = d0Var.b;
                            a0Var.a = d0Var;
                            a0Var.b = e;
                            a0Var.e = 2;
                            throw e;
                        }
                    }
                    if (i10 == 2) {
                        a aVar3 = (a) a0Var.b;
                        d0 d0Var2 = (d0) a0Var.a;
                        p7.b(obj);
                        try {
                            a0Var.a = aVar3;
                            a0Var.b = obj;
                            a0Var.e = 3;
                            if (d0Var2.i(obj, a0Var) != aVar2) {
                                return obj;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            aVar = aVar3;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = a0Var.b;
                        aVar = (a) a0Var.a;
                        try {
                            p7.b(obj);
                            return obj2;
                        } catch (IOException e10) {
                            e = e10;
                        }
                    }
                    n7.a(aVar, e);
                    throw aVar;
                }
                p7.b(obj);
                try {
                    a0Var.a = this;
                    a0Var.e = 1;
                    Object f10 = f(a0Var);
                    if (f10 != aVar2) {
                        return f10;
                    }
                } catch (a e11) {
                    e = e11;
                    d0Var = this;
                    cb.b bVar2 = d0Var.b;
                    a0Var.a = d0Var;
                    a0Var.b = e;
                    a0Var.e = 2;
                    throw e;
                }
                return aVar2;
            }
        }
        a0Var = new a0(this, cVar);
        Object obj3 = a0Var.c;
        vc.a aVar22 = vc.a.a;
        i10 = a0Var.e;
        if (i10 == 0) {
        }
        return aVar22;
    }

    @Override // k1.g
    public final od.b getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(dd.p pVar, uc.h hVar, wc.c cVar) {
        b0 b0Var;
        int i10;
        b bVar;
        Object obj;
        d0 d0Var;
        Object obj2;
        Object obj3;
        d0 d0Var2;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i11 = b0Var.f;
            if ((i11 & TLObject.FLAG_31) != 0) {
                b0Var.f = i11 - TLObject.FLAG_31;
                Object obj4 = b0Var.d;
                vc.a aVar = vc.a.a;
                i10 = b0Var.f;
                if (i10 != 0) {
                    p7.b(obj4);
                    b bVar2 = (b) this.f.b();
                    Object obj5 = bVar2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != bVar2.b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = bVar2.a;
                    c cVar2 = new c(pVar, obj6, (uc.c) null);
                    b0Var.a = this;
                    b0Var.b = bVar2;
                    b0Var.c = obj6;
                    b0Var.f = 1;
                    Object w10 = ld.e0.w(hVar, cVar2, b0Var);
                    if (w10 != aVar) {
                        bVar = bVar2;
                        obj4 = w10;
                        obj = obj6;
                        d0Var = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = b0Var.b;
                    d0Var2 = b0Var.a;
                    p7.b(obj4);
                    d0Var2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = b0Var.c;
                bVar = (b) b0Var.b;
                d0Var = b0Var.a;
                p7.b(obj4);
                obj2 = bVar.a;
                if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.j.a(obj, obj4)) {
                    return obj;
                }
                b0Var.a = d0Var;
                b0Var.b = obj4;
                b0Var.c = null;
                b0Var.f = 2;
                if (d0Var.i(obj4, b0Var) != aVar) {
                    obj3 = obj4;
                    d0Var2 = d0Var;
                    d0Var2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                return aVar;
            }
        }
        b0Var = new b0(this, cVar);
        Object obj42 = b0Var.d;
        vc.a aVar2 = vc.a.a;
        i10 = b0Var.f;
        if (i10 != 0) {
        }
        obj2 = bVar.a;
        if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: IOException -> 0x00b8, TryCatch #0 {IOException -> 0x00b8, blocks: (B:15:0x0093, B:19:0x00a1, B:20:0x00b7, B:27:0x00be, B:28:0x00c1, B:38:0x006c, B:24:0x00bc), top: B:7:0x0023, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, wc.c cVar) {
        c0 c0Var;
        ?? r32;
        FileOutputStream fileOutputStream;
        d0 d0Var;
        FileOutputStream fileOutputStream2;
        try {
            if (cVar instanceof c0) {
                c0Var = (c0) cVar;
                int i10 = c0Var.h;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    c0Var.h = i10 - TLObject.FLAG_31;
                    Object obj2 = c0Var.e;
                    vc.a aVar = vc.a.a;
                    r32 = c0Var.h;
                    sc.i iVar = sc.i.a;
                    if (r32 != 0) {
                        p7.b(obj2);
                        File b10 = b();
                        File parentFile = b10.getCanonicalFile().getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                            if (!parentFile.isDirectory()) {
                                throw new IOException(kotlin.jvm.internal.j.g(b10, "Unable to create parent directories of "));
                            }
                        }
                        r32 = new File(kotlin.jvm.internal.j.g(this.d, b().getAbsolutePath()));
                        FileOutputStream fileOutputStream3 = new FileOutputStream((File) r32);
                        try {
                            n1.g gVar = n1.g.a;
                            n nVar = new n(fileOutputStream3);
                            c0Var.a = this;
                            c0Var.b = r32;
                            c0Var.c = fileOutputStream3;
                            c0Var.d = fileOutputStream3;
                            c0Var.h = 1;
                            gVar.b(obj, nVar);
                            if (iVar == aVar) {
                                return aVar;
                            }
                            d0Var = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                            r32 = r32;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } else {
                        if (r32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileOutputStream2 = c0Var.d;
                        fileOutputStream = c0Var.c;
                        r32 = c0Var.b;
                        d0Var = c0Var.a;
                        try {
                            p7.b(obj2);
                            r32 = r32;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                j7.f0.a(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    j7.f0.a(fileOutputStream, null);
                    if (!r32.renameTo(d0Var.b())) {
                        return iVar;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (r32 != 0) {
            }
            fileOutputStream2.getFD().sync();
            j7.f0.a(fileOutputStream, null);
            if (!r32.renameTo(d0Var.b())) {
            }
        } catch (IOException e) {
            if (r32.exists()) {
                r32.delete();
            }
            throw e;
        }
        c0Var = new c0(this, cVar);
        Object obj22 = c0Var.e;
        vc.a aVar2 = vc.a.a;
        r32 = c0Var.h;
        sc.i iVar2 = sc.i.a;
    }
}
