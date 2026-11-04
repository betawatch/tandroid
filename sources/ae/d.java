package ae;

import android.util.Log;
import b8.ib;
import b8.jc;
import b8.rd;
import be.s;
import be.t;
import d2.t1;
import db.b1;
import db.c1;
import db.e1;
import db.j0;
import db.n0;
import db.r0;
import db.t0;
import db.x0;
import gi.w5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l1.b0;
import org.json.JSONException;
import org.json.JSONObject;
import wd.z;
import yd.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [hd.j, od.p] */
    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                d dVar = new d((e) this.d, cVar, 0);
                dVar.c = obj;
                return dVar;
            case 1:
                d dVar2 = new d((e) this.d, cVar, 1);
                dVar2.c = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((zd.c) this.d, cVar, 2);
                dVar3.c = obj;
                return dVar3;
            case 3:
                return new d((db.n) this.c, (x0) this.d, cVar, 3);
            case 4:
                return new d((e1) this.c, (j0) this.d, cVar, 4);
            case 5:
                d dVar4 = new d((gb.d) this.d, cVar, 5);
                dVar4.c = obj;
                return dVar4;
            case 6:
                return new d((ja.d) this.c, (od.l) this.d, cVar, 6);
            case 7:
                d dVar5 = new d((List) this.d, cVar, 7);
                dVar5.c = obj;
                return dVar5;
            case 8:
                return new d((od.p) this.c, (l1.c) this.d, cVar);
            case 9:
                d dVar6 = new d((b0) this.d, cVar, 9);
                dVar6.c = obj;
                return dVar6;
            case 10:
                return new d((ui.f) this.d, cVar, 10);
            default:
                d dVar7 = new d((r) this.d, cVar, 11);
                dVar7.c = obj;
                return dVar7;
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((d) create((z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x03e9, code lost:
    
        if (r0.a(r6, r18) == r4) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0434, code lost:
    
        if (db.e1.a(r3, r0, r2, r18) == r4) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x04a2, code lost:
    
        if (r3.b(r18) == r4) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x046a, code lost:
    
        if (r5 == r4) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0577, code lost:
    
        if (r2 == gd.a.a) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x057a, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0591, code lost:
    
        if (r2 == r3) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ca, code lost:
    
        if (r3.invoke(r2, r18) != r0) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Type inference failed for: r2v39, types: [hd.j, od.p] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, yd.c] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, yd.c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, yd.c] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01ca -> B:28:0x01ce). Please report as a decompilation issue!!! */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object U;
        Object b10;
        boolean booleanValue;
        Integer num;
        Boolean bool;
        Double d;
        Integer num2;
        gb.p pVar;
        gb.i iVar;
        Integer num3;
        Double d10;
        Boolean bool2;
        Object a10;
        Object obj2;
        d dVar;
        Object obj3;
        ?? r9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        yd.c cVar;
        yd.k kVar;
        Object a11;
        int i3 = this.a;
        Object obj4 = this.d;
        Object obj5 = dd.k.a;
        ?? r82 = 1;
        switch (i3) {
            case 0:
                gd.a aVar = gd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    ib.b(obj);
                    yd.p pVar2 = (yd.p) this.c;
                    e eVar = (e) obj4;
                    this.b = 1;
                    switch (eVar.d) {
                        case 0:
                            U = ((zd.b) eVar.e).U(new o(pVar2), this);
                            gd.a aVar2 = gd.a.a;
                            if (U != aVar2) {
                                U = obj5;
                                break;
                            }
                            break;
                        default:
                            U = ((c) eVar.e).invoke(pVar2, this);
                            break;
                    }
                    if (U == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 1:
                gd.a aVar3 = gd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    ib.b(obj);
                    zd.c cVar2 = (zd.c) this.c;
                    this.b = 1;
                    Object U2 = ((zd.b) ((e) obj4).e).U(cVar2, this);
                    if (U2 != aVar3) {
                        U2 = obj5;
                    }
                    if (U2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 2:
                gd.a aVar4 = gd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    ib.b(obj);
                    Object obj6 = this.c;
                    this.b = 1;
                    if (((zd.c) obj4).b(obj6, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 3:
                db.n nVar = (db.n) this.c;
                gb.l lVar = nVar.b;
                gd.a aVar5 = gd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    ib.b(obj);
                    eb.c cVar3 = eb.c.a;
                    this.b = 1;
                    b10 = cVar3.b(this);
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        Boolean b11 = lVar.a.b();
                        if (b11 != null) {
                            booleanValue = b11.booleanValue();
                        } else {
                            Boolean b12 = lVar.b.b();
                            booleanValue = b12 != null ? b12.booleanValue() : true;
                        }
                        if (booleanValue) {
                            n9.h hVar = nVar.a;
                            t1 t1Var = new t1(8);
                            hVar.a();
                            hVar.j.add(t1Var);
                        } else {
                            hd.g.a(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return obj5;
                    }
                    ib.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((z9.i) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                hd.g.a(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return obj5;
            case 4:
                j0 j0Var = (j0) obj4;
                e1 e1Var = (e1) this.c;
                gd.a aVar6 = gd.a.a;
                int i14 = this.b;
                try {
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e10.getMessage());
                    if (e1Var.e(j0Var)) {
                        n0 a12 = e1Var.b.a(j0Var.a);
                        e1Var.h = j0.a(j0Var, a12, null, null, 4);
                        t0 t0Var = (t0) e1Var.c;
                        wd.b0.q(wd.b0.b(t0Var.e), new r0(t0Var, a12, null));
                        String str = a12.a;
                        b1 b1Var = b1.b;
                        this.b = 2;
                        break;
                    }
                }
                if (i14 == 0) {
                    ib.b(obj);
                    l1.g gVar = e1Var.e;
                    c1 c1Var = new c1(e1Var, null, 1);
                    this.b = 1;
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        return obj5;
                    }
                    ib.b(obj);
                }
                return obj5;
            case 5:
                gb.d dVar2 = (gb.d) obj4;
                gd.a aVar7 = gd.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    ib.b(obj);
                    JSONObject jSONObject = (JSONObject) this.c;
                    Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                    if (jSONObject.has("app_quality")) {
                        Object obj7 = jSONObject.get("app_quality");
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj7;
                        try {
                            bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                            try {
                                d10 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                                try {
                                    num3 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                } catch (JSONException e11) {
                                    e = e11;
                                    num3 = null;
                                }
                            } catch (JSONException e12) {
                                e = e12;
                                num3 = null;
                                d10 = null;
                            }
                        } catch (JSONException e13) {
                            e = e13;
                            num3 = null;
                            d10 = null;
                            bool2 = null;
                        }
                        try {
                            num2 = num3;
                            d = d10;
                            bool = bool2;
                            num = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                        } catch (JSONException e14) {
                            e = e14;
                            hd.g.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num2 = num3;
                            d = d10;
                            bool = bool2;
                            num = null;
                            pVar = dVar2.e;
                            if (num == null) {
                            }
                            iVar = new gb.i(bool, d, num2, new Integer(num == null ? num.intValue() : gb.d.g), new Long(dVar2.a.a().c));
                            this.b = 1;
                            if (pVar.c(iVar, this) == aVar7) {
                            }
                            return obj5;
                        }
                    } else {
                        num = null;
                        bool = null;
                        d = null;
                        num2 = null;
                    }
                    pVar = dVar2.e;
                    iVar = new gb.i(bool, d, num2, new Integer(num == null ? num.intValue() : gb.d.g), new Long(dVar2.a.a().c));
                    this.b = 1;
                    if (pVar.c(iVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 6:
                ja.d dVar3 = (ja.d) this.c;
                ThreadLocal threadLocal = dVar3.b;
                Object obj8 = gd.a.a;
                int i16 = this.b;
                try {
                    if (i16 == 0) {
                        ib.b(obj);
                        Object obj9 = threadLocal.get();
                        Boolean bool3 = Boolean.TRUE;
                        if (kotlin.jvm.internal.j.a(obj9, bool3)) {
                            throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        }
                        threadLocal.set(bool3);
                        p1.d dVar4 = dVar3.c;
                        ja.b bVar = new ja.b((od.l) obj4, null, 0);
                        this.b = 1;
                        a10 = dVar4.a(new p1.c(bVar, null, 1), this);
                        if (a10 == obj8) {
                            return obj8;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        a10 = obj;
                    }
                    obj8 = (p1.b) a10;
                    return obj8;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 7:
                gd.a aVar8 = gd.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    ib.b(obj);
                    l1.j jVar = (l1.j) this.c;
                    this.b = 1;
                    if (rd.a((List) obj4, jVar, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 8:
                gd.a aVar9 = gd.a.a;
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                ?? r22 = (hd.j) this.c;
                Object obj10 = ((l1.c) obj4).b;
                this.b = 1;
                Object invoke = r22.invoke(obj10, this);
                return invoke == aVar9 ? aVar9 : invoke;
            case 9:
                gd.a aVar10 = gd.a.a;
                int i19 = this.b;
                if (i19 == 0) {
                    ib.b(obj);
                    l1.n0 n0Var = (l1.n0) this.c;
                    this.b = 1;
                    if (b0.c((b0) obj4, n0Var, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return obj5;
            case 10:
                ui.f fVar = (ui.f) obj4;
                gd.a aVar11 = gd.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    ib.b(obj);
                    if (((AtomicInteger) ((w5) fVar.e).b).get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    wd.b0.g(((z) fVar.b).c());
                    d dVar5 = (d) fVar.c;
                    r9 = (yd.c) fVar.d;
                    this.c = dVar5;
                    this.b = r82;
                    r9.getClass();
                    atomicLongFieldUpdater = yd.c.b;
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = yd.c.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.c.h;
                    yd.k kVar2 = (yd.k) atomicReferenceFieldUpdater.get(r9);
                    while (!r9.r(atomicLongFieldUpdater.get(r9), r82)) {
                    }
                    Throwable n4 = r9.n();
                    int i21 = s.a;
                    throw n4;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    obj2 = obj5;
                    obj5 = obj2;
                    if (((AtomicInteger) ((w5) fVar.e).b).decrementAndGet() == 0) {
                        return obj5;
                    }
                    r82 = 1;
                    wd.b0.g(((z) fVar.b).c());
                    d dVar52 = (d) fVar.c;
                    r9 = (yd.c) fVar.d;
                    this.c = dVar52;
                    this.b = r82;
                    r9.getClass();
                    atomicLongFieldUpdater = yd.c.b;
                    AtomicLongFieldUpdater atomicLongFieldUpdater22 = yd.c.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = yd.c.h;
                    yd.k kVar22 = (yd.k) atomicReferenceFieldUpdater2.get(r9);
                    while (!r9.r(atomicLongFieldUpdater.get(r9), r82)) {
                        long andIncrement = atomicLongFieldUpdater22.getAndIncrement(r9);
                        long j10 = yd.e.b;
                        yd.c cVar4 = r9;
                        long j11 = andIncrement / j10;
                        int i22 = (int) (andIncrement % j10);
                        d dVar6 = dVar52;
                        if (kVar22.c == j11) {
                            cVar = cVar4;
                        } else {
                            cVar = cVar4;
                            yd.k l10 = cVar.l(j11, kVar22);
                            if (l10 == null) {
                                r9 = cVar;
                                dVar52 = dVar6;
                                r82 = 1;
                            } else {
                                kVar22 = l10;
                            }
                        }
                        r9 = cVar;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        yd.k kVar3 = kVar22;
                        Object z10 = r9.z(kVar3, i22, andIncrement, null);
                        t tVar = yd.e.m;
                        if (z10 == tVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        t tVar2 = yd.e.o;
                        if (z10 != tVar2) {
                            obj2 = obj5;
                            if (z10 == yd.e.n) {
                                wd.m l11 = wd.b0.l(jc.b(this));
                                try {
                                    Object z11 = r9.z(kVar3, i22, andIncrement, l11);
                                    if (z11 == tVar) {
                                        l11.a(kVar3, i22);
                                    } else if (z11 != tVar2) {
                                        kVar3.b();
                                        l11.B(z11, null);
                                    } else {
                                        if (andIncrement < r9.p()) {
                                            kVar3.b();
                                        }
                                        yd.k kVar4 = (yd.k) atomicReferenceFieldUpdater3.get(r9);
                                        while (true) {
                                            if (r9.r(atomicLongFieldUpdater.get(r9), true)) {
                                                l11.resumeWith(ib.a(r9.n()));
                                            } else {
                                                long andIncrement2 = atomicLongFieldUpdater22.getAndIncrement(r9);
                                                long j12 = yd.e.b;
                                                long j13 = andIncrement2 / j12;
                                                int i23 = (int) (andIncrement2 % j12);
                                                if (kVar4.c == j13) {
                                                    kVar = kVar4;
                                                } else {
                                                    yd.k l12 = r9.l(j13, kVar4);
                                                    if (l12 != null) {
                                                        kVar = l12;
                                                    }
                                                }
                                                Object z12 = r9.z(kVar, i23, andIncrement2, l11);
                                                yd.k kVar5 = kVar;
                                                if (z12 == yd.e.m) {
                                                    l11.a(kVar5, i23);
                                                } else if (z12 == yd.e.o) {
                                                    if (andIncrement2 < r9.p()) {
                                                        kVar5.b();
                                                    }
                                                    kVar4 = kVar5;
                                                } else {
                                                    if (z12 == yd.e.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar5.b();
                                                    l11.B(z12, null);
                                                }
                                            }
                                        }
                                    }
                                    obj3 = l11.r();
                                    gd.a aVar12 = gd.a.a;
                                } catch (Throwable th2) {
                                    l11.A();
                                    throw th2;
                                }
                            } else {
                                kVar3.b();
                                obj3 = z10;
                            }
                            if (obj3 != aVar11) {
                                dVar = dVar6;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar11;
                        }
                        if (andIncrement < r9.p()) {
                            kVar3.b();
                        }
                        kVar22 = kVar3;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                        dVar52 = dVar6;
                    }
                    Throwable n42 = r9.n();
                    int i212 = s.a;
                    throw n42;
                }
                d dVar7 = (d) this.c;
                ib.b(obj);
                dVar = dVar7;
                obj2 = obj5;
                obj3 = obj;
                this.c = null;
                this.b = 2;
            default:
                gd.a aVar13 = gd.a.a;
                int i24 = this.b;
                try {
                    if (i24 == 0) {
                        ib.b(obj);
                        r rVar = (r) obj4;
                        this.b = 1;
                        if (rVar.a(this, obj5) == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i24 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                    }
                    a11 = obj5;
                } catch (Throwable th3) {
                    a11 = ib.a(th3);
                }
                if (a11 instanceof dd.f) {
                    obj5 = new yd.h(dd.g.a(a11));
                }
                return new yd.j(obj5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(od.p pVar, l1.c cVar, fd.c cVar2) {
        super(2, cVar2);
        this.a = 8;
        this.c = (hd.j) pVar;
        this.d = cVar;
    }
}
