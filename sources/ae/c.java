package ae;

import androidx.lifecycle.k0;
import b8.ib;
import d2.y;
import gi.v5;
import gi.w5;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l1.b0;
import l1.f1;
import l1.g1;
import l1.l0;
import l1.n0;
import l1.u0;
import l1.v0;
import l1.w0;
import l1.x0;
import wd.a0;
import wd.t;
import wd.z;
import x7.n6;
import x7.o6;
import zd.u;
import zd.v;
import zd.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ja.d dVar, p1.e eVar, Long l10, fd.c cVar) {
        super(2, cVar);
        this.a = 2;
        this.c = dVar;
        this.d = eVar;
        this.e = l10;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [hd.j, od.p] */
    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c((zd.c) this.d, (e) this.e, cVar);
                cVar2.c = obj;
                return cVar2;
            case 1:
                return new c((ja.d) this.d, (p1.e) this.e, this.c, cVar);
            case 2:
                return new c((ja.d) this.c, (p1.e) this.d, (Long) this.e, cVar);
            case 3:
                c cVar3 = new c((b0) this.e, cVar, 3);
                cVar3.c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((b0) this.d, (od.p) this.e, cVar);
                cVar4.c = obj;
                return cVar4;
            default:
                c cVar5 = new c((File) this.e, cVar, 5);
                cVar5.c = obj;
                return cVar5;
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            case 1:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            case 2:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            case 3:
                return ((c) create((zd.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            case 4:
                return ((c) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
            default:
                return ((c) create((yd.p) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        if (r9.b(r10, r12) == r6) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Type inference failed for: r7v14, types: [hd.j, od.p] */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zd.c cVar;
        Object obj2;
        yd.p pVar;
        u0 u0Var;
        int i3 = 0;
        int i10 = 2;
        fd.c cVar2 = null;
        int i11 = 1;
        switch (this.a) {
            case 0:
                dd.k kVar = dd.k.a;
                gd.a aVar = gd.a.a;
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return kVar;
                }
                ib.b(obj);
                z zVar = (z) this.c;
                zd.c cVar3 = (zd.c) this.d;
                e eVar = (e) this.e;
                fd.h hVar = eVar.a;
                int i13 = eVar.b;
                if (i13 == -3) {
                    i13 = -2;
                }
                yd.a aVar2 = eVar.c;
                a0 a0Var = a0.b;
                od.p dVar = new d(eVar, cVar2, i3);
                yd.o oVar = new yd.o(wd.b0.r(zVar, hVar), n6.a(i13, aVar2, 4));
                oVar.S(a0Var, oVar, dVar);
                this.b = 1;
                Object c2 = v.c(cVar3, oVar, true, this);
                if (c2 != aVar) {
                    c2 = kVar;
                }
                return c2 == aVar ? aVar : kVar;
            case 1:
                gd.a aVar3 = gd.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    ib.b(obj);
                    zd.b data = ((ja.d) this.d).c.a.getData();
                    this.b = 1;
                    obj = v.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                p1.b bVar = (p1.b) obj;
                if (bVar != null) {
                    p1.e key = (p1.e) this.e;
                    kotlin.jvm.internal.j.e(key, "key");
                    Object obj3 = bVar.a.get(key);
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        obj3 = Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.j.d(obj3, "copyOf(this, size)");
                    }
                    Object obj4 = obj3;
                    if (obj4 != null) {
                        return obj4;
                    }
                }
                return this.c;
            case 2:
                gd.a aVar4 = gd.a.a;
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                p1.d dVar2 = ((ja.d) this.c).c;
                ja.c cVar4 = new ja.c((p1.e) this.d, (Long) this.e, null);
                this.b = 1;
                Object a10 = dVar2.a(new p1.c(cVar4, null, 1), this);
                return a10 == aVar4 ? aVar4 : a10;
            case 3:
                dd.k kVar2 = dd.k.a;
                b0 b0Var = (b0) this.e;
                gd.a aVar5 = gd.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    ib.b(obj);
                    zd.c cVar5 = (zd.c) this.c;
                    this.c = cVar5;
                    this.b = 1;
                    Object y9 = wd.b0.y(b0Var.c.c(), new l1.m(b0Var, cVar2, i10), this);
                    if (y9 != aVar5) {
                        cVar = cVar5;
                        obj = y9;
                    }
                    return aVar5;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        return kVar2;
                    }
                    obj2 = (l1.c) this.d;
                    cVar = (zd.c) this.c;
                    ib.b(obj);
                    zd.g gVar = new zd.g(new v5(new w9.b(7, new ua.b(12, new w9.b(6, new l1.m(b0Var, cVar2, i3), (u) b0Var.h.b), new gb.c(2, null, 1)), new ja.b(obj2, cVar2, i11)), 9), new l1.n(b0Var, (fd.c) null));
                    this.c = null;
                    this.d = null;
                    this.b = 3;
                    if (!(cVar instanceof x)) {
                        throw ((x) cVar).a;
                    }
                    Object U = gVar.U(cVar, this);
                    if (U != aVar5) {
                        U = kVar2;
                    }
                    if (U != aVar5) {
                        return kVar2;
                    }
                    return aVar5;
                }
                zd.c cVar6 = (zd.c) this.c;
                ib.b(obj);
                cVar = cVar6;
                obj2 = (f1) obj;
                if (obj2 instanceof l1.c) {
                    l1.c cVar7 = (l1.c) obj2;
                    Object obj5 = cVar7.b;
                    this.c = cVar;
                    this.d = cVar7;
                    this.b = 2;
                    break;
                } else {
                    if (obj2 instanceof g1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (obj2 instanceof x0) {
                        throw ((x0) obj2).b;
                    }
                    if (obj2 instanceof l0) {
                        return kVar2;
                    }
                }
                zd.g gVar2 = new zd.g(new v5(new w9.b(7, new ua.b(12, new w9.b(6, new l1.m(b0Var, cVar2, i3), (u) b0Var.h.b), new gb.c(2, null, 1)), new ja.b(obj2, cVar2, i11)), 9), new l1.n(b0Var, (fd.c) null));
                this.c = null;
                this.d = null;
                this.b = 3;
                if (!(cVar instanceof x)) {
                }
            case 4:
                b0 b0Var2 = (b0) this.d;
                gd.a aVar6 = gd.a.a;
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                z zVar2 = (z) this.c;
                t a11 = wd.b0.a();
                n0 n0Var = new n0((hd.j) this.e, a11, b0Var2.h.j2(), zVar2.c());
                ui.f fVar = b0Var2.l;
                Object b10 = ((yd.c) fVar.d).b(n0Var);
                if (b10 instanceof yd.h) {
                    Throwable th2 = ((yd.h) b10).a;
                    if (th2 == null) {
                        throw new y("Channel was closed normally");
                    }
                    throw th2;
                }
                if (b10 instanceof yd.i) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((w5) fVar.e).b).getAndIncrement() == 0) {
                    wd.b0.q((z) fVar.b, new d(fVar, cVar2, 10));
                }
                this.b = 1;
                Object i18 = a11.i(this);
                return i18 == aVar6 ? aVar6 : i18;
            default:
                gd.a aVar7 = gd.a.a;
                int i19 = this.b;
                if (i19 == 0) {
                    ib.b(obj);
                    yd.p pVar2 = (yd.p) this.c;
                    File file = (File) this.e;
                    v0 v0Var = new v0(file, pVar2, i3);
                    Object obj6 = w0.b;
                    File parentFile = file.getParentFile();
                    kotlin.jvm.internal.j.b(parentFile);
                    String key2 = parentFile.getCanonicalFile().getPath();
                    synchronized (w0.b) {
                        try {
                            LinkedHashMap linkedHashMap = w0.c;
                            kotlin.jvm.internal.j.d(key2, "key");
                            Object obj7 = linkedHashMap.get(key2);
                            if (obj7 == null) {
                                obj7 = new w0(key2);
                                linkedHashMap.put(key2, obj7);
                            }
                            w0 w0Var = (w0) obj7;
                            w0Var.a.add(v0Var);
                            if (w0Var.a.size() == 1) {
                                w0Var.startWatching();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    u0 u0Var2 = new u0(i3, key2, v0Var);
                    dd.k kVar3 = dd.k.a;
                    this.c = pVar2;
                    this.d = u0Var2;
                    this.b = 1;
                    if (((yd.o) pVar2).d.a(this, kVar3) == aVar7) {
                        return aVar7;
                    }
                    pVar = pVar2;
                    u0Var = u0Var2;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        return dd.k.a;
                    }
                    u0Var = (u0) this.d;
                    pVar = (yd.p) this.c;
                    ib.b(obj);
                }
                k0 k0Var = new k0(u0Var, i10);
                this.c = null;
                this.d = null;
                this.b = 2;
                if (o6.a(pVar, k0Var, this) == aVar7) {
                    return aVar7;
                }
                return dd.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ja.d dVar, p1.e eVar, Object obj, fd.c cVar) {
        super(2, cVar);
        this.a = 1;
        this.d = dVar;
        this.e = eVar;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(b0 b0Var, od.p pVar, fd.c cVar) {
        super(2, cVar);
        this.a = 4;
        this.d = b0Var;
        this.e = (hd.j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zd.c cVar, e eVar, fd.c cVar2) {
        super(2, cVar2);
        this.a = 0;
        this.d = cVar;
        this.e = eVar;
    }
}
