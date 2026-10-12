package k1;

import androidx.lifecycle.k0;
import be.c0;
import be.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;
import v7.g8;
import v7.h8;
import v7.i8;
import w7.l7;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class z implements f {
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final Object s = new Object();
    public final k0 a;
    public final rb.b b;
    public final ee.l c;
    public final String d = ".tmp";
    public final id.g e = h8.a(new k0(this, 1));
    public final ee.n f = new ee.n(b0.a);
    public List h;
    public final com.google.firebase.messaging.s n;

    public z(k0 k0Var, List list, rb.b bVar, c0 c0Var) {
        this.a = k0Var;
        this.b = bVar;
        kd.c cVar = null;
        this.c = new ee.l(new n(this, cVar, 1));
        this.h = jd.g.m(list);
        this.n = new com.google.firebase.messaging.s(c0Var, new m(this, 0), new n(this, cVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [md.i, td.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [md.i, td.p] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(z zVar, j jVar, md.c cVar) {
        p pVar;
        int i10;
        be.t tVar;
        z zVar2;
        Object i11;
        be.s sVar;
        Throwable a2;
        a0 a0Var;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f;
            if ((i12 & TLObject.FLAG_31) != 0) {
                pVar.f = i12 - TLObject.FLAG_31;
                Object obj = pVar.d;
                ld.a aVar = ld.a.a;
                i10 = pVar.f;
                boolean z10 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                be.t tVar2 = pVar.c;
                                z zVar3 = pVar.b;
                                j jVar2 = (j) pVar.a;
                                i8.b(obj);
                                tVar = tVar2;
                                zVar2 = zVar3;
                                jVar = jVar2;
                            } else if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        be.s sVar2 = (be.s) pVar.a;
                        i8.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = i8.a(th);
                        sVar = zVar;
                        a2 = id.f.a(obj);
                        be.t tVar3 = (be.t) sVar;
                        if (a2 != null) {
                        }
                        return id.i.a;
                    }
                    a2 = id.f.a(obj);
                    be.t tVar32 = (be.t) sVar;
                    if (a2 != null) {
                        tVar32.A(obj);
                    } else {
                        tVar32.L(a2);
                    }
                    return id.i.a;
                }
                i8.b(obj);
                tVar = jVar.b;
                try {
                    a0Var = (a0) zVar.f.c();
                } catch (Throwable th3) {
                    th = th3;
                    zVar = tVar;
                    obj = i8.a(th);
                    sVar = zVar;
                    a2 = id.f.a(obj);
                    be.t tVar322 = (be.t) sVar;
                    if (a2 != null) {
                    }
                    return id.i.a;
                }
                if (a0Var instanceof b) {
                    ?? r22 = jVar.a;
                    kd.h hVar = jVar.d;
                    pVar.a = tVar;
                    pVar.f = 1;
                    i11 = zVar.i(r22, hVar, pVar);
                    if (i11 == aVar) {
                    }
                    be.t tVar4 = tVar;
                    obj = i11;
                    sVar = tVar4;
                    a2 = id.f.a(obj);
                    be.t tVar3222 = (be.t) sVar;
                    if (a2 != null) {
                    }
                    return id.i.a;
                }
                if (!(a0Var instanceof h)) {
                    z10 = a0Var instanceof b0;
                }
                if (!z10) {
                    if (a0Var instanceof g) {
                        throw ((g) a0Var).a;
                    }
                    throw new androidx.car.app.j();
                }
                if (a0Var != jVar.c) {
                    throw ((h) a0Var).a;
                }
                pVar.a = jVar;
                pVar.b = zVar;
                pVar.c = tVar;
                pVar.f = 2;
                Object e = zVar.e(pVar);
                zVar2 = zVar;
                if (e == aVar) {
                }
                return aVar;
                ?? r23 = jVar.a;
                kd.h hVar2 = jVar.d;
                pVar.a = tVar;
                pVar.b = null;
                pVar.c = null;
                pVar.f = 3;
                i11 = zVar2.i(r23, hVar2, pVar);
            }
        }
        pVar = new p(zVar, cVar);
        Object obj2 = pVar.d;
        ld.a aVar2 = ld.a.a;
        i10 = pVar.f;
        boolean z102 = true;
        if (i10 == 0) {
        }
        ?? r232 = jVar.a;
        kd.h hVar22 = jVar.d;
        pVar.a = tVar;
        pVar.b = null;
        pVar.c = null;
        pVar.f = 3;
        i11 = zVar2.i(r232, hVar22, pVar);
    }

    @Override // k1.f
    public final Object a(td.p pVar, md.c cVar) {
        be.t a2 = f0.a();
        this.n.o(new j(pVar, a2, (a0) this.f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        ld.a aVar = ld.a.a;
        return h;
    }

    public final File c() {
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
    public final Object d(md.c cVar) {
        q qVar;
        int i10;
        ke.a a2;
        kotlin.jvm.internal.p pVar;
        z zVar;
        kotlin.jvm.internal.p pVar2;
        List list;
        z zVar2;
        kotlin.jvm.internal.p pVar3;
        s sVar;
        Iterator it;
        ke.a aVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.n nVar2;
        q qVar2;
        z zVar3;
        ke.d dVar;
        ke.a aVar2;
        kotlin.jvm.internal.p pVar4;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.r;
            if ((i11 & TLObject.FLAG_31) != 0) {
                qVar.r = i11 - TLObject.FLAG_31;
                Object obj = qVar.h;
                ld.a aVar3 = ld.a.a;
                i10 = qVar.r;
                if (i10 != 0) {
                    i8.b(obj);
                    ee.n nVar3 = this.f;
                    if (!kotlin.jvm.internal.i.a(nVar3.c(), b0.a) && !(nVar3.c() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    a2 = ke.e.a();
                    pVar = new kotlin.jvm.internal.p();
                    qVar.a = this;
                    qVar.b = a2;
                    qVar.c = pVar;
                    qVar.d = pVar;
                    qVar.r = 1;
                    obj = h(qVar);
                    if (obj != aVar3) {
                        zVar = this;
                        pVar2 = pVar;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (ke.a) qVar.d;
                        nVar2 = (kotlin.jvm.internal.n) qVar.c;
                        pVar4 = (kotlin.jvm.internal.p) qVar.b;
                        zVar3 = qVar.a;
                        i8.b(obj);
                        try {
                            nVar2.a = true;
                            ((ke.d) aVar2).e(null);
                            ee.n nVar4 = zVar3.f;
                            Object obj2 = pVar4.a;
                            nVar4.d(new b(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return id.i.a;
                        } catch (Throwable th2) {
                            ((ke.d) aVar2).e(null);
                            throw th2;
                        }
                    }
                    it = qVar.f;
                    sVar = qVar.e;
                    nVar = (kotlin.jvm.internal.n) qVar.d;
                    pVar3 = (kotlin.jvm.internal.p) qVar.c;
                    aVar = (ke.a) qVar.b;
                    zVar2 = qVar.a;
                    i8.b(obj);
                    while (it.hasNext()) {
                        td.p pVar5 = (td.p) it.next();
                        qVar.a = zVar2;
                        qVar.b = aVar;
                        qVar.c = pVar3;
                        qVar.d = nVar;
                        qVar.e = sVar;
                        qVar.f = it;
                        qVar.r = 2;
                        if (pVar5.invoke(sVar, qVar) == aVar3) {
                            break;
                        }
                    }
                    qVar2 = qVar;
                    nVar2 = nVar;
                    pVar2 = pVar3;
                    a2 = aVar;
                    zVar3 = zVar2;
                    zVar3.h = null;
                    qVar2.a = zVar3;
                    qVar2.b = pVar2;
                    qVar2.c = nVar2;
                    qVar2.d = a2;
                    qVar2.e = null;
                    qVar2.f = null;
                    qVar2.r = 3;
                    dVar = (ke.d) a2;
                    if (dVar.d(qVar2) != aVar3) {
                        aVar2 = dVar;
                        pVar4 = pVar2;
                        nVar2.a = true;
                        ((ke.d) aVar2).e(null);
                        ee.n nVar42 = zVar3.f;
                        Object obj22 = pVar4.a;
                        nVar42.d(new b(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return id.i.a;
                    }
                    return aVar3;
                }
                pVar = (kotlin.jvm.internal.p) qVar.d;
                pVar2 = (kotlin.jvm.internal.p) qVar.c;
                a2 = (ke.a) qVar.b;
                zVar = qVar.a;
                i8.b(obj);
                pVar.a = obj;
                kotlin.jvm.internal.n nVar5 = new kotlin.jvm.internal.n();
                s sVar2 = new s(a2, nVar5, pVar2, zVar);
                list = zVar.h;
                if (list != null) {
                    nVar2 = nVar5;
                    qVar2 = qVar;
                    zVar3 = zVar;
                    zVar3.h = null;
                    qVar2.a = zVar3;
                    qVar2.b = pVar2;
                    qVar2.c = nVar2;
                    qVar2.d = a2;
                    qVar2.e = null;
                    qVar2.f = null;
                    qVar2.r = 3;
                    dVar = (ke.d) a2;
                    if (dVar.d(qVar2) != aVar3) {
                    }
                    return aVar3;
                }
                zVar2 = zVar;
                pVar3 = pVar2;
                sVar = sVar2;
                it = list.iterator();
                aVar = a2;
                nVar = nVar5;
                while (it.hasNext()) {
                }
                qVar2 = qVar;
                nVar2 = nVar;
                pVar2 = pVar3;
                a2 = aVar;
                zVar3 = zVar2;
                zVar3.h = null;
                qVar2.a = zVar3;
                qVar2.b = pVar2;
                qVar2.c = nVar2;
                qVar2.d = a2;
                qVar2.e = null;
                qVar2.f = null;
                qVar2.r = 3;
                dVar = (ke.d) a2;
                if (dVar.d(qVar2) != aVar3) {
                }
                return aVar3;
            }
        }
        qVar = new q(this, cVar);
        Object obj3 = qVar.h;
        ld.a aVar32 = ld.a.a;
        i10 = qVar.r;
        if (i10 != 0) {
        }
        pVar.a = obj3;
        kotlin.jvm.internal.n nVar52 = new kotlin.jvm.internal.n();
        s sVar22 = new s(a2, nVar52, pVar2, zVar);
        list = zVar.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(md.c cVar) {
        t tVar;
        int i10;
        z zVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                tVar.d = i11 - TLObject.FLAG_31;
                Object obj = tVar.b;
                ld.a aVar = ld.a.a;
                i10 = tVar.d;
                if (i10 != 0) {
                    i8.b(obj);
                    try {
                        tVar.a = this;
                        tVar.d = 1;
                        if (d(tVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = this;
                        zVar.f.d(new h(th));
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = tVar.a;
                    try {
                        i8.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        zVar.f.d(new h(th));
                        throw th;
                    }
                }
                return id.i.a;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.b;
        ld.a aVar2 = ld.a.a;
        i10 = tVar.d;
        if (i10 != 0) {
        }
        return id.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(md.c cVar) {
        u uVar;
        int i10;
        z zVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                uVar.d = i11 - TLObject.FLAG_31;
                Object obj = uVar.b;
                ld.a aVar = ld.a.a;
                i10 = uVar.d;
                if (i10 != 0) {
                    i8.b(obj);
                    try {
                        uVar.a = this;
                        uVar.d = 1;
                        if (d(uVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = this;
                        zVar.f.d(new h(th));
                        return id.i.a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = uVar.a;
                    try {
                        i8.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        zVar.f.d(new h(th));
                        return id.i.a;
                    }
                }
                return id.i.a;
            }
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.b;
        ld.a aVar2 = ld.a.a;
        i10 = uVar.d;
        if (i10 != 0) {
        }
        return id.i.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [k1.z] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k1.v] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [k1.z] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(md.c cVar) {
        ?? r02;
        int i10;
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                int i11 = vVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    vVar.e = i11 - TLObject.FLAG_31;
                    r02 = vVar;
                    Object obj = r02.c;
                    ld.a aVar = ld.a.a;
                    i10 = r02.e;
                    boolean z10 = true;
                    if (i10 != 0) {
                        i8.b(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(c());
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
                            if (r02.c().exists()) {
                                throw e;
                            }
                            return new n1.b(z10);
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.b;
                        r02 = r02.a;
                        try {
                            i8.b(obj);
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                l7.a(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    l7.a(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            l7.a(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e7) {
            e = e7;
        }
        r02 = new v(this, cVar);
        Object obj2 = r02.c;
        ld.a aVar2 = ld.a.a;
        i10 = r02.e;
        boolean z102 = true;
    }

    @Override // k1.f
    public final ee.b getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(md.c cVar) {
        w wVar;
        int i10;
        z zVar;
        a aVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i11 = wVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                wVar.e = i11 - TLObject.FLAG_31;
                Object obj = wVar.c;
                ld.a aVar2 = ld.a.a;
                i10 = wVar.e;
                if (i10 == 0) {
                    if (i10 == 1) {
                        zVar = (z) wVar.a;
                        try {
                            i8.b(obj);
                            return obj;
                        } catch (a e) {
                            e = e;
                            rb.b bVar = zVar.b;
                            wVar.a = zVar;
                            wVar.b = e;
                            wVar.e = 2;
                            throw e;
                        }
                    }
                    if (i10 == 2) {
                        a aVar3 = (a) wVar.b;
                        z zVar2 = (z) wVar.a;
                        i8.b(obj);
                        try {
                            wVar.a = aVar3;
                            wVar.b = obj;
                            wVar.e = 3;
                            if (zVar2.j(obj, wVar) != aVar2) {
                                return obj;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            aVar = aVar3;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = wVar.b;
                        aVar = (a) wVar.a;
                        try {
                            i8.b(obj);
                            return obj2;
                        } catch (IOException e10) {
                            e = e10;
                        }
                    }
                    g8.a(aVar, e);
                    throw aVar;
                }
                i8.b(obj);
                try {
                    wVar.a = this;
                    wVar.e = 1;
                    Object g10 = g(wVar);
                    if (g10 != aVar2) {
                        return g10;
                    }
                } catch (a e11) {
                    e = e11;
                    zVar = this;
                    rb.b bVar2 = zVar.b;
                    wVar.a = zVar;
                    wVar.b = e;
                    wVar.e = 2;
                    throw e;
                }
                return aVar2;
            }
        }
        wVar = new w(this, cVar);
        Object obj3 = wVar.c;
        ld.a aVar22 = ld.a.a;
        i10 = wVar.e;
        if (i10 == 0) {
        }
        return aVar22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(td.p pVar, kd.h hVar, md.c cVar) {
        x xVar;
        int i10;
        b bVar;
        Object obj;
        z zVar;
        Object obj2;
        Object obj3;
        z zVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.f;
            if ((i11 & TLObject.FLAG_31) != 0) {
                xVar.f = i11 - TLObject.FLAG_31;
                Object obj4 = xVar.d;
                ld.a aVar = ld.a.a;
                i10 = xVar.f;
                kd.c cVar2 = null;
                if (i10 != 0) {
                    i8.b(obj4);
                    b bVar2 = (b) this.f.c();
                    Object obj5 = bVar2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != bVar2.b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = bVar2.a;
                    ab.l lVar = new ab.l(pVar, obj6, cVar2, 6);
                    xVar.a = this;
                    xVar.b = bVar2;
                    xVar.c = obj6;
                    xVar.f = 1;
                    Object w9 = f0.w(hVar, lVar, xVar);
                    if (w9 != aVar) {
                        bVar = bVar2;
                        obj4 = w9;
                        obj = obj6;
                        zVar = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = xVar.b;
                    zVar2 = xVar.a;
                    i8.b(obj4);
                    zVar2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = xVar.c;
                bVar = (b) xVar.b;
                zVar = xVar.a;
                i8.b(obj4);
                obj2 = bVar.a;
                if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.i.a(obj, obj4)) {
                    return obj;
                }
                xVar.a = zVar;
                xVar.b = obj4;
                xVar.c = null;
                xVar.f = 2;
                if (zVar.j(obj4, xVar) != aVar) {
                    obj3 = obj4;
                    zVar2 = zVar;
                    zVar2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                return aVar;
            }
        }
        xVar = new x(this, cVar);
        Object obj42 = xVar.d;
        ld.a aVar2 = ld.a.a;
        i10 = xVar.f;
        kd.c cVar22 = null;
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
    public final Object j(Object obj, md.c cVar) {
        y yVar;
        ?? r32;
        FileOutputStream fileOutputStream;
        z zVar;
        FileOutputStream fileOutputStream2;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i10 = yVar.h;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    yVar.h = i10 - TLObject.FLAG_31;
                    Object obj2 = yVar.e;
                    ld.a aVar = ld.a.a;
                    r32 = yVar.h;
                    id.i iVar = id.i.a;
                    if (r32 != 0) {
                        i8.b(obj2);
                        File c10 = c();
                        File parentFile = c10.getCanonicalFile().getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                            if (!parentFile.isDirectory()) {
                                throw new IOException(kotlin.jvm.internal.i.g(c10, "Unable to create parent directories of "));
                            }
                        }
                        r32 = new File(kotlin.jvm.internal.i.g(this.d, c().getAbsolutePath()));
                        FileOutputStream fileOutputStream3 = new FileOutputStream((File) r32);
                        try {
                            n1.g gVar = n1.g.a;
                            l lVar = new l(fileOutputStream3);
                            yVar.a = this;
                            yVar.b = r32;
                            yVar.c = fileOutputStream3;
                            yVar.d = fileOutputStream3;
                            yVar.h = 1;
                            gVar.b(obj, lVar);
                            if (iVar == aVar) {
                                return aVar;
                            }
                            zVar = this;
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
                        fileOutputStream2 = yVar.d;
                        fileOutputStream = yVar.c;
                        r32 = yVar.b;
                        zVar = yVar.a;
                        try {
                            i8.b(obj2);
                            r32 = r32;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                l7.a(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    l7.a(fileOutputStream, null);
                    if (!r32.renameTo(zVar.c())) {
                        return iVar;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (r32 != 0) {
            }
            fileOutputStream2.getFD().sync();
            l7.a(fileOutputStream, null);
            if (!r32.renameTo(zVar.c())) {
            }
        } catch (IOException e) {
            if (r32.exists()) {
                r32.delete();
            }
            throw e;
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.e;
        ld.a aVar2 = ld.a.a;
        r32 = yVar.h;
        id.i iVar2 = id.i.a;
    }
}
