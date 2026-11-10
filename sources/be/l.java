package be;

import android.util.Log;
import c8.l9;
import g6.d0;
import gb.c1;
import gb.d1;
import gb.f1;
import gb.k0;
import gb.o0;
import gb.s0;
import gb.u0;
import gb.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.b0;
import m1.n0;
import org.json.JSONException;
import org.json.JSONObject;
import zd.z;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [kd.j, rd.p] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                l lVar = new l((u) this.d, cVar, 0);
                lVar.c = obj;
                return lVar;
            case 1:
                l lVar2 = new l((ce.b) this.d, cVar, 1);
                lVar2.c = obj;
                return lVar2;
            case 2:
                l lVar3 = new l((ce.b) this.d, cVar, 2);
                lVar3.c = obj;
                return lVar3;
            case 3:
                l lVar4 = new l((ce.d) this.d, cVar, 3);
                lVar4.c = obj;
                return lVar4;
            case 4:
                return new l((gb.o) this.c, (y0) this.d, cVar, 4);
            case 5:
                return new l((f1) this.c, (k0) this.d, cVar, 5);
            case 6:
                l lVar5 = new l((jb.d) this.d, cVar, 6);
                lVar5.c = obj;
                return lVar5;
            case 7:
                return new l((ka.d) this.c, (rd.l) this.d, cVar, 7);
            case 8:
                l lVar6 = new l((List) this.d, cVar, 8);
                lVar6.c = obj;
                return lVar6;
            case 9:
                return new l((rd.p) this.c, (m1.c) this.d, cVar);
            case 10:
                l lVar7 = new l((b0) this.d, cVar, 10);
                lVar7.c = obj;
                return lVar7;
            default:
                return new l((ab.b0) this.d, cVar, 11);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 1:
                return ((l) create((s) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 2:
                return ((l) create((ce.d) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 3:
                return ((l) create(obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 4:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 5:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 6:
                return ((l) create((JSONObject) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 7:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 8:
                return ((l) create((m1.j) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 9:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            case 10:
                return ((l) create((n0) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
            default:
                return ((l) create((z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x03b3, code lost:
    
        if (r0.a(r6, r19) == r4) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x03fe, code lost:
    
        if (gb.f1.a(r3, r0, r2, r19) == r4) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x046c, code lost:
    
        if (r3.b(r19) == r4) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0434, code lost:
    
        if (r5 == r4) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x054a, code lost:
    
        if (r2 == r3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x054d, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x055a, code lost:
    
        if (r2 == jd.a.a) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0194, code lost:
    
        if (r3.invoke(r2, r19) != r0) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05a0  */
    /* JADX WARN: Type inference failed for: r2v48, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11, types: [be.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12, types: [be.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [be.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0194 -> B:8:0x0198). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gd.k kVar;
        Object b10;
        Object invoke;
        Object b11;
        boolean booleanValue;
        Integer num;
        Boolean bool;
        Double d;
        Integer num2;
        jb.p pVar;
        jb.i iVar;
        Integer num3;
        Double d2;
        Boolean bool2;
        Object a10;
        gd.k kVar2;
        l lVar;
        Object obj2;
        ?? r92;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar;
        k kVar3;
        int i7 = this.a;
        Object obj3 = this.d;
        gd.k kVar4 = gd.k.a;
        ?? r82 = 1;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                try {
                    if (i10 == 0) {
                        af.b.c(obj);
                        u uVar = (u) obj3;
                        this.b = 1;
                        kVar = kVar4;
                        try {
                            if (uVar.a(this, kVar) == aVar) {
                                return aVar;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            b10 = af.b.b(th);
                            return new j(b10 instanceof gd.f ? kVar : new h(gd.g.a(b10)));
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        kVar = kVar4;
                    }
                    b10 = kVar;
                } catch (Throwable th3) {
                    th = th3;
                    kVar = kVar4;
                }
                return new j(b10 instanceof gd.f ? kVar : new h(gd.g.a(b10)));
            case 1:
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    af.b.c(obj);
                    s sVar = (s) this.c;
                    ce.b bVar = (ce.b) obj3;
                    this.b = 1;
                    switch (bVar.d) {
                        case 0:
                            invoke = ((de.c) bVar.e).invoke(sVar, this);
                            break;
                        default:
                            invoke = ((ce.c) bVar.e).B(new de.l(sVar), this);
                            jd.a aVar3 = jd.a.a;
                            if (invoke != aVar3) {
                                invoke = kVar4;
                                break;
                            }
                            break;
                    }
                    if (invoke == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 2:
                jd.a aVar4 = jd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    af.b.c(obj);
                    ce.d dVar = (ce.d) this.c;
                    this.b = 1;
                    Object B = ((ce.c) ((ce.b) obj3).e).B(dVar, this);
                    if (B != aVar4) {
                        B = kVar4;
                    }
                    if (B == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 3:
                jd.a aVar5 = jd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    af.b.c(obj);
                    Object obj4 = this.c;
                    this.b = 1;
                    if (((ce.d) obj3).a(obj4, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 4:
                gb.o oVar = (gb.o) this.c;
                jb.l lVar2 = oVar.b;
                jd.a aVar6 = jd.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    af.b.c(obj);
                    hb.c cVar2 = hb.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        Boolean a11 = lVar2.a.a();
                        if (a11 != null) {
                            booleanValue = a11.booleanValue();
                        } else {
                            Boolean a12 = lVar2.b.a();
                            booleanValue = a12 != null ? a12.booleanValue() : true;
                        }
                        if (booleanValue) {
                            o9.g gVar = oVar.a;
                            g2.c cVar3 = new g2.c(2);
                            gVar.a();
                            gVar.j.add(cVar3);
                        } else {
                            kd.g.a(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return kVar4;
                    }
                    af.b.c(obj);
                    b11 = obj;
                }
                Collection values = ((Map) b11).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((aa.j) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                kd.g.a(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return kVar4;
            case 5:
                k0 k0Var = (k0) obj3;
                f1 f1Var = (f1) this.c;
                jd.a aVar7 = jd.a.a;
                int i15 = this.b;
                try {
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e10.getMessage());
                    if (f1Var.e(k0Var)) {
                        o0 a13 = f1Var.b.a(k0Var.a);
                        f1Var.h = k0.a(k0Var, a13, null, null, 4);
                        u0 u0Var = (u0) f1Var.c;
                        zd.b0.q(zd.b0.b(u0Var.e), new s0(u0Var, a13, null));
                        String str = a13.a;
                        c1 c1Var = c1.b;
                        this.b = 2;
                        break;
                    }
                }
                if (i15 == 0) {
                    af.b.c(obj);
                    m1.g gVar2 = f1Var.e;
                    d1 d1Var = new d1(f1Var, null, 1);
                    this.b = 1;
                    break;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        return kVar4;
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 6:
                jb.d dVar2 = (jb.d) obj3;
                jd.a aVar8 = jd.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    af.b.c(obj);
                    JSONObject jSONObject = (JSONObject) this.c;
                    Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                    if (jSONObject.has("app_quality")) {
                        Object obj5 = jSONObject.get("app_quality");
                        kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj5;
                        try {
                            bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                            try {
                                d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                                try {
                                    num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                } catch (JSONException e11) {
                                    e = e11;
                                    num3 = null;
                                }
                                try {
                                    num2 = num3;
                                    d = d2;
                                    bool = bool2;
                                    num = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                } catch (JSONException e12) {
                                    e = e12;
                                    kd.g.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num2 = num3;
                                    d = d2;
                                    bool = bool2;
                                    num = null;
                                    pVar = dVar2.e;
                                    if (num == null) {
                                    }
                                    iVar = new jb.i(bool, d, num2, new Integer(num == null ? num.intValue() : jb.d.g), new Long(dVar2.a.a().c));
                                    this.b = 1;
                                    if (pVar.c(iVar, this) == aVar8) {
                                    }
                                    return kVar4;
                                }
                            } catch (JSONException e13) {
                                e = e13;
                                num3 = null;
                                d2 = null;
                            }
                        } catch (JSONException e14) {
                            e = e14;
                            num3 = null;
                            d2 = null;
                            bool2 = null;
                        }
                    } else {
                        num = null;
                        bool = null;
                        d = null;
                        num2 = null;
                    }
                    pVar = dVar2.e;
                    iVar = new jb.i(bool, d, num2, new Integer(num == null ? num.intValue() : jb.d.g), new Long(dVar2.a.a().c));
                    this.b = 1;
                    if (pVar.c(iVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 7:
                ka.d dVar3 = (ka.d) this.c;
                ThreadLocal threadLocal = dVar3.b;
                Object obj6 = jd.a.a;
                int i17 = this.b;
                try {
                    if (i17 == 0) {
                        af.b.c(obj);
                        Object obj7 = threadLocal.get();
                        Boolean bool3 = Boolean.TRUE;
                        if (kotlin.jvm.internal.j.a(obj7, bool3)) {
                            throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        }
                        threadLocal.set(bool3);
                        q1.d dVar4 = dVar3.c;
                        ka.b bVar2 = new ka.b((rd.l) obj3, null, 0);
                        this.b = 1;
                        a10 = dVar4.a(new q1.c(bVar2, null, 1), this);
                        if (a10 == obj6) {
                            return obj6;
                        }
                    } else {
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        a10 = obj;
                    }
                    obj6 = (q1.b) a10;
                    return obj6;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 8:
                jd.a aVar9 = jd.a.a;
                int i18 = this.b;
                if (i18 == 0) {
                    af.b.c(obj);
                    m1.j jVar = (m1.j) this.c;
                    this.b = 1;
                    if (l9.a((List) obj3, jVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            case 9:
                jd.a aVar10 = jd.a.a;
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                ?? r22 = (kd.j) this.c;
                Object obj8 = ((m1.c) obj3).b;
                this.b = 1;
                Object invoke2 = r22.invoke(obj8, this);
                return invoke2 == aVar10 ? aVar10 : invoke2;
            case 10:
                jd.a aVar11 = jd.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    af.b.c(obj);
                    n0 n0Var = (n0) this.c;
                    this.b = 1;
                    if (b0.c((b0) obj3, n0Var, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar4;
            default:
                ab.b0 b0Var = (ab.b0) obj3;
                jd.a aVar12 = jd.a.a;
                int i21 = this.b;
                if (i21 == 0) {
                    af.b.c(obj);
                    if (((AtomicInteger) ((d0) b0Var.e).b).get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    zd.b0.g(((z) b0Var.b).c());
                    l lVar3 = (l) b0Var.c;
                    r92 = (c) b0Var.d;
                    this.c = lVar3;
                    this.b = r82;
                    r92.getClass();
                    atomicLongFieldUpdater = c.b;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
                    k kVar5 = (k) atomicReferenceFieldUpdater.get(r92);
                    while (!r92.r(atomicLongFieldUpdater.get(r92), r82)) {
                    }
                    Throwable n10 = r92.n();
                    int i22 = ee.s.a;
                    throw n10;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    kVar2 = kVar4;
                    kVar4 = kVar2;
                    if (((AtomicInteger) ((d0) b0Var.e).b).decrementAndGet() == 0) {
                        return kVar4;
                    }
                    r82 = 1;
                    zd.b0.g(((z) b0Var.b).c());
                    l lVar32 = (l) b0Var.c;
                    r92 = (c) b0Var.d;
                    this.c = lVar32;
                    this.b = r82;
                    r92.getClass();
                    atomicLongFieldUpdater = c.b;
                    AtomicLongFieldUpdater atomicLongFieldUpdater22 = c.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c.h;
                    k kVar52 = (k) atomicReferenceFieldUpdater2.get(r92);
                    while (!r92.r(atomicLongFieldUpdater.get(r92), r82)) {
                        long andIncrement = atomicLongFieldUpdater22.getAndIncrement(r92);
                        long j3 = e.b;
                        c cVar4 = r92;
                        long j10 = andIncrement / j3;
                        int i23 = (int) (andIncrement % j3);
                        l lVar4 = lVar32;
                        if (kVar52.c == j10) {
                            cVar = cVar4;
                        } else {
                            cVar = cVar4;
                            k l10 = cVar.l(j10, kVar52);
                            if (l10 == null) {
                                r92 = cVar;
                                lVar32 = lVar4;
                                r82 = 1;
                            } else {
                                kVar52 = l10;
                            }
                        }
                        r92 = cVar;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        k kVar6 = kVar52;
                        Object z9 = r92.z(kVar6, i23, andIncrement, null);
                        com.google.android.gms.internal.clearcut.e eVar = e.m;
                        if (z9 == eVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        com.google.android.gms.internal.clearcut.e eVar2 = e.o;
                        if (z9 != eVar2) {
                            if (z9 == e.n) {
                                zd.m l11 = zd.b0.l(c8.u0.b(this));
                                kVar2 = kVar4;
                                try {
                                    Object z10 = r92.z(kVar6, i23, andIncrement, l11);
                                    if (z10 == eVar) {
                                        l11.a(kVar6, i23);
                                    } else if (z10 != eVar2) {
                                        kVar6.b();
                                        l11.B(z10, null);
                                    } else {
                                        if (andIncrement < r92.p()) {
                                            kVar6.b();
                                        }
                                        k kVar7 = (k) atomicReferenceFieldUpdater3.get(r92);
                                        while (true) {
                                            if (r92.r(atomicLongFieldUpdater.get(r92), true)) {
                                                l11.resumeWith(af.b.b(r92.n()));
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater22.getAndIncrement(r92);
                                                long j11 = e.b;
                                                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                                long j12 = andIncrement2 / j11;
                                                int i24 = (int) (andIncrement2 % j11);
                                                if (kVar7.c == j12) {
                                                    kVar3 = kVar7;
                                                } else {
                                                    k l12 = r92.l(j12, kVar7);
                                                    if (l12 == null) {
                                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    } else {
                                                        kVar3 = l12;
                                                    }
                                                }
                                                Object z11 = r92.z(kVar3, i24, andIncrement2, l11);
                                                k kVar8 = kVar3;
                                                if (z11 == e.m) {
                                                    l11.a(kVar8, i24);
                                                } else if (z11 == e.o) {
                                                    if (andIncrement2 < r92.p()) {
                                                        kVar8.b();
                                                    }
                                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                    kVar7 = kVar8;
                                                } else {
                                                    if (z11 == e.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar8.b();
                                                    l11.B(z11, null);
                                                }
                                            }
                                        }
                                    }
                                    obj2 = l11.r();
                                    jd.a aVar13 = jd.a.a;
                                } catch (Throwable th4) {
                                    l11.A();
                                    throw th4;
                                }
                            } else {
                                kVar2 = kVar4;
                                kVar6.b();
                                obj2 = z9;
                            }
                            if (obj2 != aVar12) {
                                lVar = lVar4;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar12;
                        }
                        if (andIncrement < r92.p()) {
                            kVar6.b();
                        }
                        kVar52 = kVar6;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                        lVar32 = lVar4;
                    }
                    Throwable n102 = r92.n();
                    int i222 = ee.s.a;
                    throw n102;
                }
                l lVar5 = (l) this.c;
                af.b.c(obj);
                lVar = lVar5;
                kVar2 = kVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(rd.p pVar, m1.c cVar, id.c cVar2) {
        super(2, cVar2);
        this.a = 9;
        this.c = (kd.j) pVar;
        this.d = cVar;
    }
}
