package de;

import a8.h7;
import a8.i7;
import androidx.lifecycle.k0;
import be.r;
import be.s;
import ce.w;
import ce.x;
import g6.d0;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import m1.b0;
import m1.e1;
import m1.f1;
import m1.l0;
import m1.n;
import m1.n0;
import m1.u0;
import m1.v0;
import m1.w0;
import q4.q;
import rd.p;
import zd.a0;
import zd.t;
import zd.z;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends kd.j implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ce.d dVar, ce.b bVar, id.c cVar) {
        super(2, cVar);
        this.a = 0;
        this.d = dVar;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kd.j, rd.p] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c((ce.d) this.d, (ce.b) this.e, cVar);
                cVar2.c = obj;
                return cVar2;
            case 1:
                return new c((ka.d) this.d, (q1.e) this.e, this.c, cVar);
            case 2:
                return new c((ka.d) this.c, (q1.e) this.d, (Long) this.e, cVar);
            case 3:
                c cVar3 = new c((b0) this.e, cVar, 3);
                cVar3.c = obj;
                return cVar3;
            case 4:
                c cVar4 = new c((b0) this.d, (p) this.e, cVar);
                cVar4.c = obj;
                return cVar4;
            default:
                c cVar5 = new c((File) this.e, cVar, 5);
                cVar5.c = obj;
                return cVar5;
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 1:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 2:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 3:
                return ((c) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 4:
                return ((c) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            default:
                return ((c) create((s) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        if (r10.a(r11, r13) == r7) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Type inference failed for: r8v15, types: [kd.j, rd.p] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ce.d dVar;
        Object obj2;
        s sVar;
        ae.c cVar;
        int i7 = 11;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 2;
        id.c cVar2 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                gd.k kVar = gd.k.a;
                jd.a aVar = jd.a.a;
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return kVar;
                }
                af.b.c(obj);
                z zVar = (z) this.c;
                ce.d dVar2 = (ce.d) this.d;
                ce.b bVar = (ce.b) this.e;
                id.h hVar = bVar.a;
                int i14 = bVar.b;
                if (i14 == -3) {
                    i14 = -2;
                }
                be.a aVar2 = bVar.c;
                a0 a0Var = a0.b;
                p lVar = new be.l(bVar, cVar2, i12);
                r rVar = new r(zd.b0.r(zVar, hVar), h7.a(i14, aVar2, 4));
                rVar.S(a0Var, rVar, lVar);
                this.b = 1;
                Object c10 = x.c(dVar2, rVar, true, this);
                if (c10 != aVar) {
                    c10 = kVar;
                }
                return c10 == aVar ? aVar : kVar;
            case 1:
                jd.a aVar3 = jd.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    af.b.c(obj);
                    ce.c data = ((ka.d) this.d).c.a.getData();
                    this.b = 1;
                    obj = x.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                q1.b bVar2 = (q1.b) obj;
                if (bVar2 != null) {
                    q1.e key = (q1.e) this.e;
                    kotlin.jvm.internal.j.e(key, "key");
                    Object obj3 = bVar2.a.get(key);
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
                jd.a aVar4 = jd.a.a;
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                q1.d dVar3 = ((ka.d) this.c).c;
                ka.c cVar3 = new ka.c((q1.e) this.d, (Long) this.e, null);
                this.b = 1;
                Object a10 = dVar3.a(new q1.c(cVar3, null, 1), this);
                return a10 == aVar4 ? aVar4 : a10;
            case 3:
                gd.k kVar2 = gd.k.a;
                b0 b0Var = (b0) this.e;
                jd.a aVar5 = jd.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    af.b.c(obj);
                    ce.d dVar4 = (ce.d) this.c;
                    this.c = dVar4;
                    this.b = 1;
                    Object y10 = zd.b0.y(b0Var.c.c(), new m1.m(b0Var, cVar2, i11), this);
                    if (y10 != aVar5) {
                        dVar = dVar4;
                        obj = y10;
                    }
                    return aVar5;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        return kVar2;
                    }
                    obj2 = (m1.c) this.d;
                    dVar = (ce.d) this.c;
                    af.b.c(obj);
                    w wVar = (w) b0Var.h.b;
                    ce.h hVar2 = new ce.h(new gf.g(new q(new wf.b(10, new q(new m1.m(b0Var, cVar2, z11 ? 1 : 0), wVar, z10 ? 1 : 0, i7), new jb.c(2, null, 1)), new ka.b(obj2, cVar2, i12), z9 ? 1 : 0, 12), 17), new n(b0Var, (id.c) null));
                    this.c = null;
                    this.d = null;
                    this.b = 3;
                    if (!(dVar instanceof ce.z)) {
                        throw ((ce.z) dVar).a;
                    }
                    Object B = hVar2.B(dVar, this);
                    if (B != aVar5) {
                        B = kVar2;
                    }
                    if (B != aVar5) {
                        return kVar2;
                    }
                    return aVar5;
                }
                ce.d dVar5 = (ce.d) this.c;
                af.b.c(obj);
                dVar = dVar5;
                obj2 = (e1) obj;
                if (obj2 instanceof m1.c) {
                    m1.c cVar4 = (m1.c) obj2;
                    Object obj5 = cVar4.b;
                    this.c = dVar;
                    this.d = cVar4;
                    this.b = 2;
                    break;
                } else {
                    if (obj2 instanceof f1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (obj2 instanceof w0) {
                        throw ((w0) obj2).b;
                    }
                    if (obj2 instanceof l0) {
                        return kVar2;
                    }
                }
                w wVar2 = (w) b0Var.h.b;
                ce.h hVar22 = new ce.h(new gf.g(new q(new wf.b(10, new q(new m1.m(b0Var, cVar2, z11 ? 1 : 0), wVar2, z10 ? 1 : 0, i7), new jb.c(2, null, 1)), new ka.b(obj2, cVar2, i12), z9 ? 1 : 0, 12), 17), new n(b0Var, (id.c) null));
                this.c = null;
                this.d = null;
                this.b = 3;
                if (!(dVar instanceof ce.z)) {
                }
            case 4:
                b0 b0Var2 = (b0) this.d;
                jd.a aVar6 = jd.a.a;
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                z zVar2 = (z) this.c;
                t a11 = zd.b0.a();
                n0 n0Var = new n0((kd.j) this.e, a11, b0Var2.h.T1(), zVar2.c());
                ab.b0 b0Var3 = b0Var2.l;
                Object b10 = ((be.c) b0Var3.d).b(n0Var);
                if (b10 instanceof be.h) {
                    Throwable th2 = ((be.h) b10).a;
                    if (th2 == null) {
                        throw new be.n("Channel was closed normally");
                    }
                    throw th2;
                }
                if (b10 instanceof be.i) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((d0) b0Var3.e).b).getAndIncrement() == 0) {
                    zd.b0.q((z) b0Var3.b, new be.l(b0Var3, cVar2, i7));
                }
                this.b = 1;
                Object i19 = a11.i(this);
                return i19 == aVar6 ? aVar6 : i19;
            default:
                jd.a aVar7 = jd.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    af.b.c(obj);
                    s sVar2 = (s) this.c;
                    File file = (File) this.e;
                    u0 u0Var = new u0(file, sVar2, i10);
                    Object obj6 = v0.b;
                    File parentFile = file.getParentFile();
                    kotlin.jvm.internal.j.b(parentFile);
                    String key2 = parentFile.getCanonicalFile().getPath();
                    synchronized (v0.b) {
                        try {
                            LinkedHashMap linkedHashMap = v0.c;
                            kotlin.jvm.internal.j.d(key2, "key");
                            Object obj7 = linkedHashMap.get(key2);
                            Object obj8 = obj7;
                            if (obj7 == null) {
                                v0 v0Var = new v0(key2);
                                linkedHashMap.put(key2, v0Var);
                                obj8 = v0Var;
                            }
                            v0 v0Var2 = (v0) obj8;
                            v0Var2.a.add(u0Var);
                            if (v0Var2.a.size() == 1) {
                                v0Var2.startWatching();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    ae.c cVar5 = new ae.c(i12, key2, u0Var);
                    gd.k kVar3 = gd.k.a;
                    this.c = sVar2;
                    this.d = cVar5;
                    this.b = 1;
                    if (((r) sVar2).d.a(this, kVar3) == aVar7) {
                        return aVar7;
                    }
                    sVar = sVar2;
                    cVar = cVar5;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        return gd.k.a;
                    }
                    cVar = (ae.c) this.d;
                    sVar = (s) this.c;
                    af.b.c(obj);
                }
                k0 k0Var = new k0(cVar, i11);
                this.c = null;
                this.d = null;
                this.b = 2;
                if (i7.a(sVar, k0Var, this) == aVar7) {
                    return aVar7;
                }
                return gd.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ka.d dVar, q1.e eVar, Long l10, id.c cVar) {
        super(2, cVar);
        this.a = 2;
        this.c = dVar;
        this.d = eVar;
        this.e = l10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ka.d dVar, q1.e eVar, Object obj, id.c cVar) {
        super(2, cVar);
        this.a = 1;
        this.d = dVar;
        this.e = eVar;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(b0 b0Var, p pVar, id.c cVar) {
        super(2, cVar);
        this.a = 4;
        this.d = b0Var;
        this.e = (kd.j) pVar;
    }
}
