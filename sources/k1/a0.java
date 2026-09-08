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
import v7.r7;
import v7.s7;
import v7.t7;
import w7.i6;
import zd.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a0 implements f {
    public static final LinkedHashSet r = new LinkedHashSet();
    public static final Object s = new Object();
    public final k0 a;
    public final ob.a b;
    public final a4.m c;
    public final String d = ".tmp";
    public final gd.g e = s7.a(new k0(this, 1));
    public final ce.n f = new ce.n(c0.a);
    public List h;
    public final com.google.firebase.messaging.s n;

    public a0(k0 k0Var, List list, ob.a aVar, zd.c0 c0Var) {
        this.a = k0Var;
        this.b = aVar;
        id.c cVar = null;
        this.c = new a4.m(new m(this, cVar, 1), 10);
        this.h = hd.g.m(list);
        this.n = new com.google.firebase.messaging.s(c0Var, new ie.g(this, 1), new m(this, cVar, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a0 a0Var, j jVar, kd.c cVar) {
        q qVar;
        int i10;
        zd.t tVar;
        a0 a0Var2;
        Object i11;
        zd.s sVar;
        Throwable a2;
        b0 b0Var;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f;
            if ((i12 & TLObject.FLAG_31) != 0) {
                qVar.f = i12 - TLObject.FLAG_31;
                Object obj = qVar.d;
                jd.a aVar = jd.a.a;
                i10 = qVar.f;
                boolean z10 = true;
                if (i10 == 0) {
                    try {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                zd.t tVar2 = qVar.c;
                                a0 a0Var3 = qVar.b;
                                j jVar2 = (j) qVar.a;
                                t7.b(obj);
                                tVar = tVar2;
                                a0Var2 = a0Var3;
                                jVar = jVar2;
                            } else if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        zd.s sVar2 = (zd.s) qVar.a;
                        t7.b(obj);
                        sVar = sVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = t7.a(th);
                        sVar = a0Var;
                        a2 = gd.f.a(obj);
                        zd.t tVar3 = (zd.t) sVar;
                        if (a2 != null) {
                        }
                        return gd.i.a;
                    }
                    a2 = gd.f.a(obj);
                    zd.t tVar32 = (zd.t) sVar;
                    if (a2 != null) {
                        tVar32.A(obj);
                    } else {
                        tVar32.L(a2);
                    }
                    return gd.i.a;
                }
                t7.b(obj);
                tVar = jVar.b;
                try {
                    b0Var = (b0) a0Var.f.c();
                } catch (Throwable th3) {
                    th = th3;
                    a0Var = tVar;
                    obj = t7.a(th);
                    sVar = a0Var;
                    a2 = gd.f.a(obj);
                    zd.t tVar322 = (zd.t) sVar;
                    if (a2 != null) {
                    }
                    return gd.i.a;
                }
                if (b0Var instanceof b) {
                    ?? r22 = jVar.a;
                    id.h hVar = jVar.d;
                    qVar.a = tVar;
                    qVar.f = 1;
                    i11 = a0Var.i(r22, hVar, qVar);
                    if (i11 == aVar) {
                    }
                    zd.t tVar4 = tVar;
                    obj = i11;
                    sVar = tVar4;
                    a2 = gd.f.a(obj);
                    zd.t tVar3222 = (zd.t) sVar;
                    if (a2 != null) {
                    }
                    return gd.i.a;
                }
                if (!(b0Var instanceof h)) {
                    z10 = b0Var instanceof c0;
                }
                if (!z10) {
                    if (b0Var instanceof g) {
                        throw ((g) b0Var).a;
                    }
                    throw new androidx.car.app.j();
                }
                if (b0Var != jVar.c) {
                    throw ((h) b0Var).a;
                }
                qVar.a = jVar;
                qVar.b = a0Var;
                qVar.c = tVar;
                qVar.f = 2;
                Object d = a0Var.d(qVar);
                a0Var2 = a0Var;
                if (d == aVar) {
                }
                return aVar;
                ?? r23 = jVar.a;
                id.h hVar2 = jVar.d;
                qVar.a = tVar;
                qVar.b = null;
                qVar.c = null;
                qVar.f = 3;
                i11 = a0Var2.i(r23, hVar2, qVar);
            }
        }
        qVar = new q(a0Var, cVar);
        Object obj2 = qVar.d;
        jd.a aVar2 = jd.a.a;
        i10 = qVar.f;
        boolean z102 = true;
        if (i10 == 0) {
        }
        ?? r232 = jVar.a;
        id.h hVar22 = jVar.d;
        qVar.a = tVar;
        qVar.b = null;
        qVar.c = null;
        qVar.f = 3;
        i11 = a0Var2.i(r232, hVar22, qVar);
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
    public final Object c(kd.c cVar) {
        r rVar;
        int i10;
        ie.a a2;
        kotlin.jvm.internal.p pVar;
        a0 a0Var;
        kotlin.jvm.internal.p pVar2;
        List list;
        a0 a0Var2;
        kotlin.jvm.internal.p pVar3;
        t tVar;
        Iterator it;
        ie.a aVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.n nVar2;
        r rVar2;
        a0 a0Var3;
        ie.d dVar;
        ie.a aVar2;
        kotlin.jvm.internal.p pVar4;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i11 = rVar.r;
            if ((i11 & TLObject.FLAG_31) != 0) {
                rVar.r = i11 - TLObject.FLAG_31;
                Object obj = rVar.h;
                jd.a aVar3 = jd.a.a;
                i10 = rVar.r;
                if (i10 != 0) {
                    t7.b(obj);
                    ce.n nVar3 = this.f;
                    if (!kotlin.jvm.internal.i.a(nVar3.c(), c0.a) && !(nVar3.c() instanceof h)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    a2 = ie.e.a();
                    pVar = new kotlin.jvm.internal.p();
                    rVar.a = this;
                    rVar.b = a2;
                    rVar.c = pVar;
                    rVar.d = pVar;
                    rVar.r = 1;
                    obj = g(rVar);
                    if (obj != aVar3) {
                        a0Var = this;
                        pVar2 = pVar;
                    }
                    return aVar3;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (ie.a) rVar.d;
                        nVar2 = (kotlin.jvm.internal.n) rVar.c;
                        pVar4 = (kotlin.jvm.internal.p) rVar.b;
                        a0Var3 = rVar.a;
                        t7.b(obj);
                        try {
                            nVar2.a = true;
                            ((ie.d) aVar2).e(null);
                            ce.n nVar4 = a0Var3.f;
                            Object obj2 = pVar4.a;
                            nVar4.d(new b(obj2, obj2 == null ? obj2.hashCode() : 0));
                            return gd.i.a;
                        } catch (Throwable th2) {
                            ((ie.d) aVar2).e(null);
                            throw th2;
                        }
                    }
                    it = rVar.f;
                    tVar = rVar.e;
                    nVar = (kotlin.jvm.internal.n) rVar.d;
                    pVar3 = (kotlin.jvm.internal.p) rVar.c;
                    aVar = (ie.a) rVar.b;
                    a0Var2 = rVar.a;
                    t7.b(obj);
                    while (it.hasNext()) {
                        rd.p pVar5 = (rd.p) it.next();
                        rVar.a = a0Var2;
                        rVar.b = aVar;
                        rVar.c = pVar3;
                        rVar.d = nVar;
                        rVar.e = tVar;
                        rVar.f = it;
                        rVar.r = 2;
                        if (pVar5.invoke(tVar, rVar) == aVar3) {
                            break;
                        }
                    }
                    rVar2 = rVar;
                    nVar2 = nVar;
                    pVar2 = pVar3;
                    a2 = aVar;
                    a0Var3 = a0Var2;
                    a0Var3.h = null;
                    rVar2.a = a0Var3;
                    rVar2.b = pVar2;
                    rVar2.c = nVar2;
                    rVar2.d = a2;
                    rVar2.e = null;
                    rVar2.f = null;
                    rVar2.r = 3;
                    dVar = (ie.d) a2;
                    if (dVar.d(rVar2) != aVar3) {
                        aVar2 = dVar;
                        pVar4 = pVar2;
                        nVar2.a = true;
                        ((ie.d) aVar2).e(null);
                        ce.n nVar42 = a0Var3.f;
                        Object obj22 = pVar4.a;
                        nVar42.d(new b(obj22, obj22 == null ? obj22.hashCode() : 0));
                        return gd.i.a;
                    }
                    return aVar3;
                }
                pVar = (kotlin.jvm.internal.p) rVar.d;
                pVar2 = (kotlin.jvm.internal.p) rVar.c;
                a2 = (ie.a) rVar.b;
                a0Var = rVar.a;
                t7.b(obj);
                pVar.a = obj;
                kotlin.jvm.internal.n nVar5 = new kotlin.jvm.internal.n();
                t tVar2 = new t(a2, nVar5, pVar2, a0Var);
                list = a0Var.h;
                if (list != null) {
                    nVar2 = nVar5;
                    rVar2 = rVar;
                    a0Var3 = a0Var;
                    a0Var3.h = null;
                    rVar2.a = a0Var3;
                    rVar2.b = pVar2;
                    rVar2.c = nVar2;
                    rVar2.d = a2;
                    rVar2.e = null;
                    rVar2.f = null;
                    rVar2.r = 3;
                    dVar = (ie.d) a2;
                    if (dVar.d(rVar2) != aVar3) {
                    }
                    return aVar3;
                }
                a0Var2 = a0Var;
                pVar3 = pVar2;
                tVar = tVar2;
                it = list.iterator();
                aVar = a2;
                nVar = nVar5;
                while (it.hasNext()) {
                }
                rVar2 = rVar;
                nVar2 = nVar;
                pVar2 = pVar3;
                a2 = aVar;
                a0Var3 = a0Var2;
                a0Var3.h = null;
                rVar2.a = a0Var3;
                rVar2.b = pVar2;
                rVar2.c = nVar2;
                rVar2.d = a2;
                rVar2.e = null;
                rVar2.f = null;
                rVar2.r = 3;
                dVar = (ie.d) a2;
                if (dVar.d(rVar2) != aVar3) {
                }
                return aVar3;
            }
        }
        rVar = new r(this, cVar);
        Object obj3 = rVar.h;
        jd.a aVar32 = jd.a.a;
        i10 = rVar.r;
        if (i10 != 0) {
        }
        pVar.a = obj3;
        kotlin.jvm.internal.n nVar52 = new kotlin.jvm.internal.n();
        t tVar22 = new t(a2, nVar52, pVar2, a0Var);
        list = a0Var.h;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(kd.c cVar) {
        u uVar;
        int i10;
        a0 a0Var;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i11 = uVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                uVar.d = i11 - TLObject.FLAG_31;
                Object obj = uVar.b;
                jd.a aVar = jd.a.a;
                i10 = uVar.d;
                if (i10 != 0) {
                    t7.b(obj);
                    try {
                        uVar.a = this;
                        uVar.d = 1;
                        if (c(uVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var = this;
                        a0Var.f.d(new h(th));
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = uVar.a;
                    try {
                        t7.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        a0Var.f.d(new h(th));
                        throw th;
                    }
                }
                return gd.i.a;
            }
        }
        uVar = new u(this, cVar);
        Object obj2 = uVar.b;
        jd.a aVar2 = jd.a.a;
        i10 = uVar.d;
        if (i10 != 0) {
        }
        return gd.i.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(kd.c cVar) {
        v vVar;
        int i10;
        a0 a0Var;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i11 = vVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                vVar.d = i11 - TLObject.FLAG_31;
                Object obj = vVar.b;
                jd.a aVar = jd.a.a;
                i10 = vVar.d;
                if (i10 != 0) {
                    t7.b(obj);
                    try {
                        vVar.a = this;
                        vVar.d = 1;
                        if (c(vVar) == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var = this;
                        a0Var.f.d(new h(th));
                        return gd.i.a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = vVar.a;
                    try {
                        t7.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        a0Var.f.d(new h(th));
                        return gd.i.a;
                    }
                }
                return gd.i.a;
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.b;
        jd.a aVar2 = jd.a.a;
        i10 = vVar.d;
        if (i10 != 0) {
        }
        return gd.i.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14, types: [k1.a0] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [k1.w] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [k1.a0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(kd.c cVar) {
        ?? r02;
        int i10;
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            if (cVar instanceof w) {
                w wVar = (w) cVar;
                int i11 = wVar.e;
                if ((i11 & TLObject.FLAG_31) != 0) {
                    wVar.e = i11 - TLObject.FLAG_31;
                    r02 = wVar;
                    Object obj = r02.c;
                    jd.a aVar = jd.a.a;
                    i10 = r02.e;
                    boolean z10 = true;
                    if (i10 != 0) {
                        t7.b(obj);
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
                        } catch (FileNotFoundException e7) {
                            e = e7;
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
                            t7.b(obj);
                        } catch (Throwable th4) {
                            th2 = th4;
                            try {
                                throw th2;
                            } catch (Throwable th5) {
                                i6.a(fileInputStream, th2);
                                throw th5;
                            }
                        }
                    }
                    i6.a(fileInputStream, null);
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            i6.a(fileInputStream, null);
            return obj;
        } catch (FileNotFoundException e10) {
            e = e10;
        }
        r02 = new w(this, cVar);
        Object obj2 = r02.c;
        jd.a aVar2 = jd.a.a;
        i10 = r02.e;
        boolean z102 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(kd.c cVar) {
        x xVar;
        int i10;
        a0 a0Var;
        a aVar;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.e;
            if ((i11 & TLObject.FLAG_31) != 0) {
                xVar.e = i11 - TLObject.FLAG_31;
                Object obj = xVar.c;
                jd.a aVar2 = jd.a.a;
                i10 = xVar.e;
                if (i10 == 0) {
                    if (i10 == 1) {
                        a0Var = (a0) xVar.a;
                        try {
                            t7.b(obj);
                            return obj;
                        } catch (a e7) {
                            e = e7;
                            ob.a aVar3 = a0Var.b;
                            xVar.a = a0Var;
                            xVar.b = e;
                            xVar.e = 2;
                            throw e;
                        }
                    }
                    if (i10 == 2) {
                        a aVar4 = (a) xVar.b;
                        a0 a0Var2 = (a0) xVar.a;
                        t7.b(obj);
                        try {
                            xVar.a = aVar4;
                            xVar.b = obj;
                            xVar.e = 3;
                            if (a0Var2.j(obj, xVar) != aVar2) {
                                return obj;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            aVar = aVar4;
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = xVar.b;
                        aVar = (a) xVar.a;
                        try {
                            t7.b(obj);
                            return obj2;
                        } catch (IOException e11) {
                            e = e11;
                        }
                    }
                    r7.a(aVar, e);
                    throw aVar;
                }
                t7.b(obj);
                try {
                    xVar.a = this;
                    xVar.e = 1;
                    Object f7 = f(xVar);
                    if (f7 != aVar2) {
                        return f7;
                    }
                } catch (a e12) {
                    e = e12;
                    a0Var = this;
                    ob.a aVar32 = a0Var.b;
                    xVar.a = a0Var;
                    xVar.b = e;
                    xVar.e = 2;
                    throw e;
                }
                return aVar2;
            }
        }
        xVar = new x(this, cVar);
        Object obj3 = xVar.c;
        jd.a aVar22 = jd.a.a;
        i10 = xVar.e;
        if (i10 == 0) {
        }
        return aVar22;
    }

    @Override // k1.f
    public final ce.b getData() {
        return this.c;
    }

    @Override // k1.f
    public final Object h(rd.p pVar, kd.c cVar) {
        zd.t a2 = e0.a();
        this.n.e(new j(pVar, a2, (b0) this.f.c(), cVar.getContext()));
        Object h = a2.h(cVar);
        jd.a aVar = jd.a.a;
        return h;
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
    public final Object i(rd.p pVar, id.h hVar, kd.c cVar) {
        y yVar;
        int i10;
        b bVar;
        Object obj;
        a0 a0Var;
        Object obj2;
        Object obj3;
        a0 a0Var2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.f;
            if ((i11 & TLObject.FLAG_31) != 0) {
                yVar.f = i11 - TLObject.FLAG_31;
                Object obj4 = yVar.d;
                jd.a aVar = jd.a.a;
                i10 = yVar.f;
                id.c cVar2 = null;
                if (i10 != 0) {
                    t7.b(obj4);
                    b bVar2 = (b) this.f.c();
                    Object obj5 = bVar2.a;
                    if ((obj5 != null ? obj5.hashCode() : 0) != bVar2.b) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    Object obj6 = bVar2.a;
                    bb.j jVar = new bb.j(pVar, obj6, cVar2, 3);
                    yVar.a = this;
                    yVar.b = bVar2;
                    yVar.c = obj6;
                    yVar.f = 1;
                    Object w10 = e0.w(hVar, jVar, yVar);
                    if (w10 != aVar) {
                        bVar = bVar2;
                        obj4 = w10;
                        obj = obj6;
                        a0Var = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = yVar.b;
                    a0Var2 = yVar.a;
                    t7.b(obj4);
                    a0Var2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                obj = yVar.c;
                bVar = (b) yVar.b;
                a0Var = yVar.a;
                t7.b(obj4);
                obj2 = bVar.a;
                if ((obj2 == null ? obj2.hashCode() : 0) == bVar.b) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.i.a(obj, obj4)) {
                    return obj;
                }
                yVar.a = a0Var;
                yVar.b = obj4;
                yVar.c = null;
                yVar.f = 2;
                if (a0Var.j(obj4, yVar) != aVar) {
                    obj3 = obj4;
                    a0Var2 = a0Var;
                    a0Var2.f.d(new b(obj3, obj3 != null ? obj3.hashCode() : 0));
                    return obj3;
                }
                return aVar;
            }
        }
        yVar = new y(this, cVar);
        Object obj42 = yVar.d;
        jd.a aVar2 = jd.a.a;
        i10 = yVar.f;
        id.c cVar22 = null;
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
    public final Object j(Object obj, kd.c cVar) {
        z zVar;
        ?? r32;
        FileOutputStream fileOutputStream;
        a0 a0Var;
        FileOutputStream fileOutputStream2;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i10 = zVar.h;
                if ((i10 & TLObject.FLAG_31) != 0) {
                    zVar.h = i10 - TLObject.FLAG_31;
                    Object obj2 = zVar.e;
                    jd.a aVar = jd.a.a;
                    r32 = zVar.h;
                    gd.i iVar = gd.i.a;
                    if (r32 != 0) {
                        t7.b(obj2);
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
                            l lVar = new l(fileOutputStream3);
                            zVar.a = this;
                            zVar.b = r32;
                            zVar.c = fileOutputStream3;
                            zVar.d = fileOutputStream3;
                            zVar.h = 1;
                            gVar.b(obj, lVar);
                            if (iVar == aVar) {
                                return aVar;
                            }
                            a0Var = this;
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
                        fileOutputStream2 = zVar.d;
                        fileOutputStream = zVar.c;
                        r32 = zVar.b;
                        a0Var = zVar.a;
                        try {
                            t7.b(obj2);
                            r32 = r32;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                i6.a(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    i6.a(fileOutputStream, null);
                    if (!r32.renameTo(a0Var.b())) {
                        return iVar;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (r32 != 0) {
            }
            fileOutputStream2.getFD().sync();
            i6.a(fileOutputStream, null);
            if (!r32.renameTo(a0Var.b())) {
            }
        } catch (IOException e7) {
            if (r32.exists()) {
                r32.delete();
            }
            throw e7;
        }
        zVar = new z(this, cVar);
        Object obj22 = zVar.e;
        jd.a aVar2 = jd.a.a;
        r32 = zVar.h;
        gd.i iVar2 = gd.i.a;
    }
}
