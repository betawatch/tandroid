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
import org.telegram.tgnet.TLObject;
import td.c0;
import td.e0;
import v7.t8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z implements f {
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final Object s = new Object();
    public final k0 a;
    public final jb.b b;
    public final r2.y c;
    public final String d = ".tmp";
    public final ad.h e = ib.a.a(new k0(this, 1));
    public final wd.m f = new wd.m(b0.a);
    public List h;
    public final ji.f n;

    public z(k0 k0Var, List list, jb.b bVar, c0 c0Var) {
        this.a = k0Var;
        this.b = bVar;
        cd.c cVar = null;
        this.c = new r2.y(new n(this, cVar, 1), 15);
        this.h = bd.i.m(list);
        this.n = new ji.f(c0Var, new ce.g(this, 1), new n(this, cVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [ed.j, ld.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ed.j, ld.p] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, k kVar, ed.c cVar) {
        p pVar;
        int i10;
        td.t tVar;
        z zVar2;
        Object i11;
        td.s sVar;
        Throwable a2;
        a0 a0Var;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f;
            if ((i12 & TLObject.FLAG_31) != 0) {
                pVar.f = i12 - TLObject.FLAG_31;
                Object obj = pVar.d;
                dd.a aVar = dd.a.a;
                i10 = pVar.f;
                boolean z10 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                td.t tVar2 = pVar.c;
                                z zVar3 = pVar.b;
                                k kVar2 = (k) pVar.a;
                                l9.b.b(obj);
                                tVar = tVar2;
                                zVar2 = zVar3;
                                kVar = kVar2;
                            } else if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        td.s sVar2 = (td.s) pVar.a;
                        l9.b.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = l9.b.a(th);
                        sVar = zVar;
                        a2 = ad.g.a(obj);
                        td.t tVar3 = (td.t) sVar;
                        if (a2 != null) {
                        }
                        return ad.j.a;
                    }
                    a2 = ad.g.a(obj);
                    td.t tVar32 = (td.t) sVar;
                    if (a2 != null) {
                        tVar32.A(obj);
                    } else {
                        tVar32.L(a2);
                    }
                    return ad.j.a;
                }
                l9.b.b(obj);
                tVar = kVar.b;
                try {
                    a0Var = (a0) zVar.f.c();
                } catch (Throwable th3) {
                    th = th3;
                    zVar = tVar;
                    obj = l9.b.a(th);
                    sVar = zVar;
                    a2 = ad.g.a(obj);
                    td.t tVar322 = (td.t) sVar;
                    if (a2 != null) {
                    }
                    return ad.j.a;
                }
                if (a0Var instanceof b) {
                    ?? r22 = kVar.a;
                    cd.h hVar = kVar.d;
                    pVar.a = tVar;
                    pVar.f = 1;
                    i11 = zVar.i(r22, hVar, pVar);
                    if (i11 == aVar) {
                    }
                    td.t tVar4 = tVar;
                    obj = i11;
                    sVar = tVar4;
                    a2 = ad.g.a(obj);
                    td.t tVar3222 = (td.t) sVar;
                    if (a2 != null) {
                    }
                    return ad.j.a;
                }
                if (!(a0Var instanceof h)) {
                    z10 = a0Var instanceof b0;
                }
                if (!z10) {
                    if (a0Var instanceof g) {
                        throw ((g) a0Var).a;
                    }
                    throw new ad.d();
                }
                if (a0Var != kVar.c) {
                    throw ((h) a0Var).a;
                }
                pVar.a = kVar;
                pVar.b = zVar;
                pVar.c = tVar;
                pVar.f = 2;
                Object e = zVar.e(pVar);
                zVar2 = zVar;
                if (e == aVar) {
                }
                return aVar;
                ?? r23 = kVar.a;
                cd.h hVar2 = kVar.d;
                pVar.a = tVar;
                pVar.b = null;
                pVar.c = null;
                pVar.f = 3;
                i11 = zVar2.i(r23, hVar2, pVar);
            }
        }
        pVar = new p(zVar, cVar);
        Object obj2 = pVar.d;
        dd.a aVar2 = dd.a.a;
        i10 = pVar.f;
        boolean z102 = true;
        if (i10 == 0) {
        }
        ?? r232 = kVar.a;
        cd.h hVar22 = kVar.d;
        pVar.a = tVar;
        pVar.b = null;
        pVar.c = null;
        pVar.f = 3;
        i11 = zVar2.i(r232, hVar22, pVar);
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
    public final Object c(ed.c cVar) {
        q qVar;
        int i10;
        ce.a a2;
        kotlin.jvm.internal.p pVar;
        z zVar;
        kotlin.jvm.internal.p pVar2;
        List list;
        z zVar2;
        kotlin.jvm.internal.p pVar3;
        s sVar;
        Iterator it;
        ce.a aVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.n nVar2;
        q qVar2;
        z zVar3;
        ce.d dVar;
        ce.a aVar2;
        kotlin.jvm.internal.p pVar4;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.r;
            if ((i11 & TLObject.FLAG_31) != 0) {
                qVar.r = i11 - TLObject.FLAG_31;
                Object obj = qVar.h;
                dd.a aVar3 = dd.a.a;
                i10 = qVar.r;
                if (i10 != 0) {
                    l9.b.b(obj);
                    wd.m mVar = this.f;
                    if (!kotlin.jvm.internal.i.a(mVar.c(), b0.a) && !(mVar.c() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    a2 = ce.e.a();
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
                        aVar2 = (ce.a) qVar.d;
                        nVar2 = (kotlin.jvm.internal.n) qVar.c;
                        pVar4 = (kotlin.jvm.internal.p) qVar.b;
                        zVar3 = qVar.a;
                        l9.b.b(obj);
                        try {
                            nVar2.a = true;
                            ((ce.d) aVar2).e(null);
                            wd.m mVar2 = zVar3.f;
                            Object obj2 = pVar4.a;
                            mVar2.d(new b(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return ad.j.a;
                        } catch (Throwable th2) {
                            ((ce.d) aVar2).e(null);
                            throw th2;
                        }
                    }
                    it = qVar.f;
                    sVar = qVar.e;
                    nVar = (kotlin.jvm.internal.n) qVar.d;
                    pVar3 = (kotlin.jvm.internal.p) qVar.c;
                    aVar = (ce.a) qVar.b;
                    zVar2 = qVar.a;
                    l9.b.b(obj);
                    while (it.hasNext()) {
                        ld.p pVar5 = (ld.p) it.next();
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
                    dVar = (ce.d) a2;
                    if (dVar.d(qVar2) != aVar3) {
                        aVar2 = dVar;
                        pVar4 = pVar2;
                        nVar2.a = true;
                        ((ce.d) aVar2).e(null);
                        wd.m mVar22 = zVar3.f;
                        Object obj22 = pVar4.a;
                        mVar22.d(new b(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return ad.j.a;
                    }
                    return aVar3;
                }
                pVar = (kotlin.jvm.internal.p) qVar.d;
                pVar2 = (kotlin.jvm.internal.p) qVar.c;
                a2 = (ce.a) qVar.b;
                zVar = qVar.a;
                l9.b.b(obj);
                pVar.a = obj;
                kotlin.jvm.internal.n nVar3 = new kotlin.jvm.internal.n();
                s sVar2 = new s(a2, nVar3, pVar2, zVar);
                list = zVar.h;
                if (list != null) {
                    nVar2 = nVar3;
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
                    dVar = (ce.d) a2;
                    if (dVar.d(qVar2) != aVar3) {
                    }
                    return aVar3;
                }
                zVar2 = zVar;
                pVar3 = pVar2;
                sVar = sVar2;
                it = list.iterator();
                aVar = a2;
                nVar = nVar3;
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
                dVar = (ce.d) a2;
                if (dVar.d(qVar2) != aVar3) {
                }
                return aVar3;
            }
        }
        qVar = new q(this, cVar);
        Object obj3 = qVar.h;
        dd.a aVar32 = dd.a.a;
        i10 = qVar.r;
        if (i10 != 0) {
        }
        pVar.a = obj3;
        kotlin.jvm.internal.n nVar32 = new kotlin.jvm.internal.n();
        s sVar22 = new s(a2, nVar32, pVar2, zVar);
        list = zVar.h;
        if (list != null) {
        }
    }

    @Override // k1.f
    public final Object d(ld.p pVar, ed.c cVar) {
        td.t a2 = e0.a();
        this.n.m(new k(pVar, a2, (a0) this.f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        dd.a aVar = dd.a.a;
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ed.c cVar) {
        t tVar;
        int i10;
        z zVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i11 = tVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                tVar.d = i11 - TLObject.FLAG_31;
                Object obj = tVar.b;
                dd.a aVar = dd.a.a;
                i10 = tVar.d;
                if (i10 != 0) {
                    l9.b.b(obj);
                    try {
                        tVar.a = this;
                        tVar.d = 1;
                        if (c(tVar) == aVar) {
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
                        l9.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        zVar.f.d(new h(th));
                        throw th;
                    }
                }
                return ad.j.a;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.b;
        dd.a aVar2 = dd.a.a;
        i10 = tVar.d;
        if (i10 != 0) {
        }
        return ad.j.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ed.c cVar) {
        u uVar;
        int i10;
        z zVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                uVar.d = i11 - TLObject.FLAG_31;
                Object obj = uVar.b;
                dd.a aVar = dd.a.a;
                i10 = uVar.d;
                if (i10 != 0) {
                    l9.b.b(obj);
                    try {
                        uVar.a = this;
                        uVar.d = 1;
                        if (c(uVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        zVar = this;
                        zVar.f.d(new h(th));
                        return ad.j.a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = uVar.a;
                    try {
                        l9.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        zVar.f.d(new h(th));
                        return ad.j.a;
                    }
                }
                return ad.j.a;
            }
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.b;
        dd.a aVar2 = dd.a.a;
        i10 = uVar.d;
        if (i10 != 0) {
        }
        return ad.j.a;
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
    public final Object g(ed.c cVar) {
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
                    dd.a aVar = dd.a.a;
                    i10 = r02.e;
                    boolean z10 = true;
                    if (i10 != 0) {
                        l9.b.b(obj);
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
                            return new n1.b(z10);
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = r02.b;
                        r02 = r02.a;
                        try {
                            l9.b.b(obj);
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                t8.a(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    t8.a(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            t8.a(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e7) {
            e = e7;
        }
        r02 = new v(this, cVar);
        Object obj2 = r02.c;
        dd.a aVar2 = dd.a.a;
        i10 = r02.e;
        boolean z102 = true;
    }

    @Override // k1.f
    public final wd.b getData() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ed.c cVar) {
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
                dd.a aVar2 = dd.a.a;
                i10 = wVar.e;
                if (i10 == 0) {
                    if (i10 == 1) {
                        zVar = (z) wVar.a;
                        try {
                            l9.b.b(obj);
                            return obj;
                        } catch (a e) {
                            e = e;
                            jb.b bVar = zVar.b;
                            wVar.a = zVar;
                            wVar.b = e;
                            wVar.e = 2;
                            throw e;
                        }
                    }
                    if (i10 == 2) {
                        a aVar3 = (a) wVar.b;
                        z zVar2 = (z) wVar.a;
                        l9.b.b(obj);
                        try {
                            wVar.a = aVar3;
                            wVar.b = obj;
                            wVar.e = 3;
                            if (zVar2.j(wVar, obj) != aVar2) {
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
                            l9.b.b(obj);
                            return obj2;
                        } catch (IOException e10) {
                            e = e10;
                        }
                    }
                    i8.d.a(aVar, e);
                    throw aVar;
                }
                l9.b.b(obj);
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
                    jb.b bVar2 = zVar.b;
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
        dd.a aVar22 = dd.a.a;
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
    public final Object i(ld.p pVar, cd.h hVar, ed.c cVar) {
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
                dd.a aVar = dd.a.a;
                i10 = xVar.f;
                cd.c cVar2 = null;
                if (i10 != 0) {
                    l9.b.b(obj4);
                    b bVar2 = (b) this.f.c();
                    Object obj5 = bVar2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != bVar2.b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = bVar2.a;
                    bb.l lVar = new bb.l(pVar, obj6, cVar2, 6);
                    xVar.a = this;
                    xVar.b = bVar2;
                    xVar.c = obj6;
                    xVar.f = 1;
                    Object w9 = e0.w(hVar, lVar, xVar);
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
                    l9.b.b(obj4);
                    zVar2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = xVar.c;
                bVar = (b) xVar.b;
                zVar = xVar.a;
                l9.b.b(obj4);
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
                if (zVar.j(xVar, obj4) != aVar) {
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
        dd.a aVar2 = dd.a.a;
        i10 = xVar.f;
        cd.c cVar22 = null;
        if (i10 != 0) {
        }
        obj2 = bVar.a;
        if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[Catch: IOException -> 0x00b8, TryCatch #0 {IOException -> 0x00b8, blocks: (B:15:0x0093, B:19:0x00a1, B:20:0x00b7, B:27:0x00bf, B:28:0x00c2, B:38:0x006c, B:24:0x00bd), top: B:7:0x0023, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.StringBuilder] */
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
    public final Object j(ed.c cVar, Object obj) {
        y yVar;
        ?? r32;
        FileOutputStream fileOutputStream;
        Throwable th2;
        z zVar;
        FileOutputStream fileOutputStream2;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i10 = yVar.h;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    yVar.h = i10 - TLObject.FLAG_31;
                    Object obj2 = yVar.e;
                    dd.a aVar = dd.a.a;
                    r32 = yVar.h;
                    ad.j jVar = ad.j.a;
                    if (r32 != 0) {
                        l9.b.b(obj2);
                        File b10 = b();
                        File parentFile = b10.getCanonicalFile().getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                            if (!parentFile.isDirectory()) {
                                throw new IOException(kotlin.jvm.internal.i.g(b10, "Unable to create parent directories of "));
                            }
                        }
                        r32 = new File(kotlin.jvm.internal.i.g(this.d, b().getAbsolutePath()));
                        FileOutputStream fileOutputStream3 = new FileOutputStream((File) r32);
                        try {
                            n1.g gVar = n1.g.a;
                            m mVar = new m(fileOutputStream3);
                            yVar.a = this;
                            yVar.b = r32;
                            yVar.c = fileOutputStream3;
                            yVar.d = fileOutputStream3;
                            yVar.h = 1;
                            gVar.b(obj, mVar);
                            if (jVar == aVar) {
                                return aVar;
                            }
                            zVar = this;
                            fileOutputStream2 = fileOutputStream3;
                            fileOutputStream = fileOutputStream2;
                            r32 = r32;
                        } catch (Throwable th3) {
                            fileOutputStream = fileOutputStream3;
                            th2 = th3;
                            throw th2;
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
                            l9.b.b(obj2);
                            r32 = r32;
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                t8.a(fileOutputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    t8.a(fileOutputStream, null);
                    if (!r32.renameTo(zVar.b())) {
                        return jVar;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (r32 != 0) {
            }
            fileOutputStream2.getFD().sync();
            t8.a(fileOutputStream, null);
            if (!r32.renameTo(zVar.b())) {
            }
        } catch (IOException e) {
            if (r32.exists()) {
                r32.delete();
            }
            throw e;
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.e;
        dd.a aVar2 = dd.a.a;
        r32 = yVar.h;
        ad.j jVar2 = ad.j.a;
    }
}
