package k1;

import androidx.lifecycle.k0;
import h7.i6;
import h7.j6;
import h7.j8;
import h7.k6;
import id.c0;
import id.f0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z implements f {
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final Object s = new Object();
    public final k0 a;
    public final w9.d b;
    public final k5.i c;
    public final String d = ".tmp";
    public final pc.g e = j6.a(new k0(this, 1));
    public final ld.m f = new ld.m(b0.a);
    public List h;
    public final com.google.firebase.messaging.t n;

    public z(k0 k0Var, List list, w9.d dVar, c0 c0Var) {
        this.a = k0Var;
        this.b = dVar;
        rc.c cVar = null;
        this.c = new k5.i(new n(this, cVar, 1), 23);
        this.h = qc.g.m(list);
        this.n = new com.google.firebase.messaging.t(c0Var, new m(this, 0), new n(this, cVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [ad.p, tc.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ad.p, tc.i] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, j jVar, tc.c cVar) {
        p pVar;
        int i10;
        id.t tVar;
        z zVar2;
        Object i11;
        id.s sVar;
        Throwable a2;
        a0 a0Var;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f;
            if ((i12 & TLObject.FLAG_31) != 0) {
                pVar.f = i12 - TLObject.FLAG_31;
                Object obj = pVar.d;
                sc.a aVar = sc.a.a;
                i10 = pVar.f;
                boolean z10 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                id.t tVar2 = pVar.c;
                                z zVar3 = pVar.b;
                                j jVar2 = (j) pVar.a;
                                k6.b(obj);
                                tVar = tVar2;
                                zVar2 = zVar3;
                                jVar = jVar2;
                            } else if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        id.s sVar2 = (id.s) pVar.a;
                        k6.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th) {
                        th = th;
                        obj = k6.a(th);
                        sVar = zVar;
                        a2 = pc.f.a(obj);
                        id.t tVar3 = (id.t) sVar;
                        if (a2 != null) {
                        }
                        return pc.i.a;
                    }
                    a2 = pc.f.a(obj);
                    id.t tVar32 = (id.t) sVar;
                    if (a2 != null) {
                        tVar32.A(obj);
                    } else {
                        tVar32.L(a2);
                    }
                    return pc.i.a;
                }
                k6.b(obj);
                tVar = jVar.b;
                try {
                    a0Var = (a0) zVar.f.b();
                } catch (Throwable th2) {
                    th = th2;
                    zVar = tVar;
                    obj = k6.a(th);
                    sVar = zVar;
                    a2 = pc.f.a(obj);
                    id.t tVar322 = (id.t) sVar;
                    if (a2 != null) {
                    }
                    return pc.i.a;
                }
                if (a0Var instanceof b) {
                    ?? r22 = jVar.a;
                    rc.h hVar = jVar.d;
                    pVar.a = tVar;
                    pVar.f = 1;
                    i11 = zVar.i(r22, hVar, pVar);
                    if (i11 == aVar) {
                    }
                    id.t tVar4 = tVar;
                    obj = i11;
                    sVar = tVar4;
                    a2 = pc.f.a(obj);
                    id.t tVar3222 = (id.t) sVar;
                    if (a2 != null) {
                    }
                    return pc.i.a;
                }
                if (!(a0Var instanceof h)) {
                    z10 = a0Var instanceof b0;
                }
                if (!z10) {
                    if (a0Var instanceof g) {
                        throw ((g) a0Var).a;
                    }
                    throw new a7.c();
                }
                if (a0Var != jVar.c) {
                    throw ((h) a0Var).a;
                }
                pVar.a = jVar;
                pVar.b = zVar;
                pVar.c = tVar;
                pVar.f = 2;
                Object e9 = zVar.e(pVar);
                zVar2 = zVar;
                if (e9 == aVar) {
                }
                return aVar;
                ?? r23 = jVar.a;
                rc.h hVar2 = jVar.d;
                pVar.a = tVar;
                pVar.b = null;
                pVar.c = null;
                pVar.f = 3;
                i11 = zVar2.i(r23, hVar2, pVar);
            }
        }
        pVar = new p(zVar, cVar);
        Object obj2 = pVar.d;
        sc.a aVar2 = sc.a.a;
        i10 = pVar.f;
        boolean z102 = true;
        if (i10 == 0) {
        }
        ?? r232 = jVar.a;
        rc.h hVar22 = jVar.d;
        pVar.a = tVar;
        pVar.b = null;
        pVar.c = null;
        pVar.f = 3;
        i11 = zVar2.i(r232, hVar22, pVar);
    }

    public final File b() {
        return (File) this.e.a();
    }

    @Override // k1.f
    public final Object c(ad.p pVar, tc.c cVar) {
        id.t a2 = f0.a();
        this.n.E(new j(pVar, a2, (a0) this.f.b(), cVar.getContext()));
        Object h = a2.h(cVar);
        sc.a aVar = sc.a.a;
        return h;
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
    public final Object d(tc.c cVar) {
        q qVar;
        int i10;
        rd.a a2;
        kotlin.jvm.internal.q qVar2;
        z zVar;
        kotlin.jvm.internal.q qVar3;
        List list;
        z zVar2;
        kotlin.jvm.internal.q qVar4;
        s sVar;
        Iterator it;
        rd.a aVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.o oVar2;
        q qVar5;
        z zVar3;
        rd.d dVar;
        rd.a aVar2;
        kotlin.jvm.internal.q qVar6;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.r;
            if ((i11 & TLObject.FLAG_31) != 0) {
                qVar.r = i11 - TLObject.FLAG_31;
                Object obj = qVar.h;
                sc.a aVar3 = sc.a.a;
                i10 = qVar.r;
                if (i10 != 0) {
                    k6.b(obj);
                    ld.m mVar = this.f;
                    if (!kotlin.jvm.internal.j.a(mVar.b(), b0.a) && !(mVar.b() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    a2 = rd.e.a();
                    qVar2 = new kotlin.jvm.internal.q();
                    qVar.a = this;
                    qVar.b = a2;
                    qVar.c = qVar2;
                    qVar.d = qVar2;
                    qVar.r = 1;
                    obj = h(qVar);
                    if (obj != aVar3) {
                        zVar = this;
                        qVar3 = qVar2;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (rd.a) qVar.d;
                        oVar2 = (kotlin.jvm.internal.o) qVar.c;
                        qVar6 = (kotlin.jvm.internal.q) qVar.b;
                        zVar3 = qVar.a;
                        k6.b(obj);
                        try {
                            oVar2.a = true;
                            ((rd.d) aVar2).e(null);
                            ld.m mVar2 = zVar3.f;
                            Object obj2 = qVar6.a;
                            mVar2.d(new b(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return pc.i.a;
                        } catch (Throwable th) {
                            ((rd.d) aVar2).e(null);
                            throw th;
                        }
                    }
                    it = qVar.f;
                    sVar = qVar.e;
                    oVar = (kotlin.jvm.internal.o) qVar.d;
                    qVar4 = (kotlin.jvm.internal.q) qVar.c;
                    aVar = (rd.a) qVar.b;
                    zVar2 = qVar.a;
                    k6.b(obj);
                    while (it.hasNext()) {
                        ad.p pVar = (ad.p) it.next();
                        qVar.a = zVar2;
                        qVar.b = aVar;
                        qVar.c = qVar4;
                        qVar.d = oVar;
                        qVar.e = sVar;
                        qVar.f = it;
                        qVar.r = 2;
                        if (pVar.invoke(sVar, qVar) == aVar3) {
                            break;
                        }
                    }
                    qVar5 = qVar;
                    oVar2 = oVar;
                    qVar3 = qVar4;
                    a2 = aVar;
                    zVar3 = zVar2;
                    zVar3.h = null;
                    qVar5.a = zVar3;
                    qVar5.b = qVar3;
                    qVar5.c = oVar2;
                    qVar5.d = a2;
                    qVar5.e = null;
                    qVar5.f = null;
                    qVar5.r = 3;
                    dVar = (rd.d) a2;
                    if (dVar.d(qVar5) != aVar3) {
                        aVar2 = dVar;
                        qVar6 = qVar3;
                        oVar2.a = true;
                        ((rd.d) aVar2).e(null);
                        ld.m mVar22 = zVar3.f;
                        Object obj22 = qVar6.a;
                        mVar22.d(new b(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return pc.i.a;
                    }
                    return aVar3;
                }
                qVar2 = (kotlin.jvm.internal.q) qVar.d;
                qVar3 = (kotlin.jvm.internal.q) qVar.c;
                a2 = (rd.a) qVar.b;
                zVar = qVar.a;
                k6.b(obj);
                qVar2.a = obj;
                kotlin.jvm.internal.o oVar3 = new kotlin.jvm.internal.o();
                s sVar2 = new s(a2, oVar3, qVar3, zVar);
                list = zVar.h;
                if (list != null) {
                    oVar2 = oVar3;
                    qVar5 = qVar;
                    zVar3 = zVar;
                    zVar3.h = null;
                    qVar5.a = zVar3;
                    qVar5.b = qVar3;
                    qVar5.c = oVar2;
                    qVar5.d = a2;
                    qVar5.e = null;
                    qVar5.f = null;
                    qVar5.r = 3;
                    dVar = (rd.d) a2;
                    if (dVar.d(qVar5) != aVar3) {
                    }
                    return aVar3;
                }
                zVar2 = zVar;
                qVar4 = qVar3;
                sVar = sVar2;
                it = list.iterator();
                aVar = a2;
                oVar = oVar3;
                while (it.hasNext()) {
                }
                qVar5 = qVar;
                oVar2 = oVar;
                qVar3 = qVar4;
                a2 = aVar;
                zVar3 = zVar2;
                zVar3.h = null;
                qVar5.a = zVar3;
                qVar5.b = qVar3;
                qVar5.c = oVar2;
                qVar5.d = a2;
                qVar5.e = null;
                qVar5.f = null;
                qVar5.r = 3;
                dVar = (rd.d) a2;
                if (dVar.d(qVar5) != aVar3) {
                }
                return aVar3;
            }
        }
        qVar = new q(this, cVar);
        Object obj3 = qVar.h;
        sc.a aVar32 = sc.a.a;
        i10 = qVar.r;
        if (i10 != 0) {
        }
        qVar2.a = obj3;
        kotlin.jvm.internal.o oVar32 = new kotlin.jvm.internal.o();
        s sVar22 = new s(a2, oVar32, qVar3, zVar);
        list = zVar.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(tc.c cVar) {
        t tVar;
        int i10;
        z zVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                tVar.d = i11 - TLObject.FLAG_31;
                Object obj = tVar.b;
                sc.a aVar = sc.a.a;
                i10 = tVar.d;
                if (i10 != 0) {
                    k6.b(obj);
                    try {
                        tVar.a = this;
                        tVar.d = 1;
                        if (d(tVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
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
                        k6.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        zVar.f.d(new h(th));
                        throw th;
                    }
                }
                return pc.i.a;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = tVar.d;
        if (i10 != 0) {
        }
        return pc.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(tc.c cVar) {
        u uVar;
        int i10;
        z zVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                uVar.d = i11 - TLObject.FLAG_31;
                Object obj = uVar.b;
                sc.a aVar = sc.a.a;
                i10 = uVar.d;
                if (i10 != 0) {
                    k6.b(obj);
                    try {
                        uVar.a = this;
                        uVar.d = 1;
                        if (d(uVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        zVar = this;
                        zVar.f.d(new h(th));
                        return pc.i.a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = uVar.a;
                    try {
                        k6.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        zVar.f.d(new h(th));
                        return pc.i.a;
                    }
                }
                return pc.i.a;
            }
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.b;
        sc.a aVar2 = sc.a.a;
        i10 = uVar.d;
        if (i10 != 0) {
        }
        return pc.i.a;
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
    public final Object g(tc.c cVar) {
        ?? r02;
        int i10;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                int i11 = vVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    vVar.e = i11 - TLObject.FLAG_31;
                    r02 = vVar;
                    Object obj = r02.c;
                    sc.a aVar = sc.a.a;
                    i10 = r02.e;
                    boolean z10 = true;
                    if (i10 != 0) {
                        k6.b(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(b());
                            try {
                                n1.h hVar = n1.h.a;
                                r02.a = this;
                                r02.b = fileInputStream2;
                                r02.e = 1;
                                n1.b a2 = hVar.a(fileInputStream2);
                                if (a2 == aVar) {
                                    return aVar;
                                }
                                fileInputStream = fileInputStream2;
                                obj = a2;
                            } catch (Throwable th2) {
                                fileInputStream = fileInputStream2;
                                th = th2;
                                r02 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e9) {
                            e = e9;
                            r02 = this;
                            if (r02.b().exists()) {
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
                            k6.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                j8.a(fileInputStream, th);
                                throw th4;
                            }
                        }
                    }
                    j8.a(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            j8.a(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e10) {
            e = e10;
        }
        r02 = new v(this, cVar);
        Object obj2 = r02.c;
        sc.a aVar2 = sc.a.a;
        i10 = r02.e;
        boolean z102 = true;
    }

    @Override // k1.f
    public final ld.b getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(tc.c cVar) {
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
                sc.a aVar2 = sc.a.a;
                i10 = wVar.e;
                if (i10 == 0) {
                    if (i10 == 1) {
                        zVar = (z) wVar.a;
                        try {
                            k6.b(obj);
                            return obj;
                        } catch (a e9) {
                            e = e9;
                            w9.d dVar = zVar.b;
                            wVar.a = zVar;
                            wVar.b = e;
                            wVar.e = 2;
                            throw e;
                        }
                    }
                    if (i10 == 2) {
                        a aVar3 = (a) wVar.b;
                        z zVar2 = (z) wVar.a;
                        k6.b(obj);
                        try {
                            wVar.a = aVar3;
                            wVar.b = obj;
                            wVar.e = 3;
                            if (zVar2.j(obj, wVar) != aVar2) {
                                return obj;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            aVar = aVar3;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = wVar.b;
                        aVar = (a) wVar.a;
                        try {
                            k6.b(obj);
                            return obj2;
                        } catch (IOException e11) {
                            e = e11;
                        }
                    }
                    i6.a(aVar, e);
                    throw aVar;
                }
                k6.b(obj);
                try {
                    wVar.a = this;
                    wVar.e = 1;
                    Object g10 = g(wVar);
                    if (g10 != aVar2) {
                        return g10;
                    }
                } catch (a e12) {
                    e = e12;
                    zVar = this;
                    w9.d dVar2 = zVar.b;
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
        sc.a aVar22 = sc.a.a;
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
    public final Object i(ad.p pVar, rc.h hVar, tc.c cVar) {
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
                sc.a aVar = sc.a.a;
                i10 = xVar.f;
                rc.c cVar2 = null;
                if (i10 != 0) {
                    k6.b(obj4);
                    b bVar2 = (b) this.f.b();
                    Object obj5 = bVar2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != bVar2.b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = bVar2.a;
                    ia.m mVar = new ia.m(pVar, obj6, cVar2, 5);
                    xVar.a = this;
                    xVar.b = bVar2;
                    xVar.c = obj6;
                    xVar.f = 1;
                    Object w10 = f0.w(hVar, mVar, xVar);
                    if (w10 != aVar) {
                        bVar = bVar2;
                        obj4 = w10;
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
                    k6.b(obj4);
                    zVar2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = xVar.c;
                bVar = (b) xVar.b;
                zVar = xVar.a;
                k6.b(obj4);
                obj2 = bVar.a;
                if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.j.a(obj, obj4)) {
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
        sc.a aVar2 = sc.a.a;
        i10 = xVar.f;
        rc.c cVar22 = null;
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
    public final Object j(Object obj, tc.c cVar) {
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
                    sc.a aVar = sc.a.a;
                    r32 = yVar.h;
                    pc.i iVar = pc.i.a;
                    if (r32 != 0) {
                        k6.b(obj2);
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
                            n1.h hVar = n1.h.a;
                            l lVar = new l(fileOutputStream3);
                            yVar.a = this;
                            yVar.b = r32;
                            yVar.c = fileOutputStream3;
                            yVar.d = fileOutputStream3;
                            yVar.h = 1;
                            hVar.b(obj, lVar);
                            if (iVar == aVar) {
                                return aVar;
                            }
                            zVar = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                            r32 = r32;
                        } catch (Throwable th) {
                            th = th;
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
                            k6.b(obj2);
                            r32 = r32;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                j8.a(fileOutputStream, th);
                                throw th3;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    j8.a(fileOutputStream, null);
                    if (!r32.renameTo(zVar.b())) {
                        return iVar;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (r32 != 0) {
            }
            fileOutputStream2.getFD().sync();
            j8.a(fileOutputStream, null);
            if (!r32.renameTo(zVar.b())) {
            }
        } catch (IOException e9) {
            if (r32.exists()) {
                r32.delete();
            }
            throw e9;
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.e;
        sc.a aVar2 = sc.a.a;
        r32 = yVar.h;
        pc.i iVar2 = pc.i.a;
    }
}
