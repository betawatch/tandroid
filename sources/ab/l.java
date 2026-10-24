package ab;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.w0;
import v7.i8;
import v7.u8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class l extends md.i implements td.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, kd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.a) {
            case 0:
                return new l((m) this.c, (kd.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.r) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((cb.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.r) this.d, cVar, 5);
            default:
                return new l((td.p) this.c, this.d, cVar, 6);
        }
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((l) create((be.c0) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0451, code lost:
    
        if (r2.b(r19) == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0418, code lost:
    
        if (r5 == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d5, code lost:
    
        if (r7.invoke(r0, r19) != r4) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Type inference failed for: r10v3, types: [de.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d5 -> B:19:0x01d9). Please report as a decompilation issue!!! */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        Object b12;
        cb.k kVar;
        id.i iVar;
        AtomicInteger atomicInteger;
        com.google.firebase.messaging.r rVar;
        k1.n nVar;
        Object obj2;
        ?? r10;
        Throwable th2;
        k1.n nVar2;
        de.h hVar;
        int i10 = this.a;
        int i11 = 0;
        id.i iVar2 = id.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i10) {
            case 0:
                m mVar = (m) this.c;
                cb.h hVar2 = mVar.b;
                ld.a aVar = ld.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    i8.b(obj);
                    bb.c cVar = bb.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8.b(obj);
                        Boolean k10 = hVar2.a.k();
                        if (k10 != null) {
                            booleanValue = k10.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            kd.h hVar3 = (kd.h) obj3;
                            com.google.firebase.messaging.r rVar2 = new com.google.firebase.messaging.r(hVar3);
                            Object b13 = l9.h.c().b(r0.class);
                            kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new o0(hVar3));
                            a9.d serviceConnection = (a9.d) rVar2.e;
                            kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                            l9.h hVar4 = ((s0) ((r0) b13)).a;
                            hVar4.a();
                            Context applicationContext = hVar4.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            t0.c = rVar2;
                            if (t0.b) {
                                t0.b = false;
                                rVar2.r(1);
                            }
                            l9.h hVar5 = mVar.a;
                            aa.a aVar2 = new aa.a(6);
                            hVar5.a();
                            hVar5.j.add(aVar2);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return iVar2;
                    }
                    i8.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((x9.j) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 1:
                ld.a aVar3 = ld.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    i8.b(obj);
                    w wVar = c0.e;
                    Context context = ((c0) this.c).a;
                    wVar.getClass();
                    w0 a10 = c0.f.a(context, w.a[0]);
                    b0 b0Var = new b0((String) obj3, null, i11);
                    this.b = 1;
                    if (a10.b(new n1.c(b0Var, null, 1), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                }
                return iVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                com.google.firebase.messaging.r rVar3 = (com.google.firebase.messaging.r) this.c;
                ld.a aVar4 = ld.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    i8.b(obj);
                    bb.c cVar2 = bb.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    b11 = obj;
                }
                Map map = (Map) b11;
                if (map.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                } else {
                    Collection values2 = map.values();
                    if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                        Iterator it2 = values2.iterator();
                        while (it2.hasNext()) {
                            if (((x9.j) it2.next()).a.a()) {
                                ArrayList f7 = jd.g.f(new ArrayList(new jd.d(new Message[]{com.google.firebase.messaging.r.a(rVar3, arrayList, 2), com.google.firebase.messaging.r.a(rVar3, arrayList, 1)}, true)));
                                p0 p0Var = new p0();
                                if (f7.size() <= 1) {
                                    asList = jd.g.m(f7);
                                } else {
                                    Object[] array = f7.toArray(new Object[0]);
                                    kotlin.jvm.internal.i.e(array, "<this>");
                                    if (array.length > 1) {
                                        Arrays.sort(array, p0Var);
                                    }
                                    asList = Arrays.asList(array);
                                    kotlin.jvm.internal.i.d(asList, "asList(...)");
                                }
                                for (Message message : asList) {
                                    if (((Messenger) rVar3.c) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) rVar3.c;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                                            rVar3.q(message);
                                        }
                                    } else {
                                        rVar3.q(message);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return iVar2;
            case 3:
                ld.a aVar5 = ld.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    i8.b(obj);
                    cb.k kVar2 = (cb.k) obj3;
                    ee.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = ee.n.b(data, this);
                    if (b12 == aVar5) {
                        return aVar5;
                    }
                    kVar = kVar2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (cb.k) this.c;
                    i8.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                cb.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 4:
                ld.a aVar6 = ld.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    i8.b(obj);
                    k1.s sVar = (k1.s) this.c;
                    this.b = 1;
                    if (u8.a((List) obj3, sVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                }
                return iVar2;
            case 5:
                com.google.firebase.messaging.r rVar4 = (com.google.firebase.messaging.r) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) rVar4.e;
                ld.a aVar7 = ld.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    i8.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    be.f0.h(((be.c0) rVar4.b).c());
                    k1.n nVar3 = (k1.n) rVar4.c;
                    r10 = (de.b) rVar4.d;
                    this.c = nVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = de.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.b.g;
                    de.h hVar6 = (de.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(de.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) de.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i18 = ge.u.a;
                    throw th2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    rVar = rVar4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    rVar4 = rVar;
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    r82 = 1;
                    be.f0.h(((be.c0) rVar4.b).c());
                    k1.n nVar32 = (k1.n) rVar4.c;
                    r10 = (de.b) rVar4.d;
                    this.c = nVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = de.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = de.b.g;
                    de.h hVar62 = (de.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(de.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = de.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i19 = (int) (andIncrement % j10);
                        if (hVar62.c != j11) {
                            de.h e7 = r10.e(j11, hVar62);
                            if (e7 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar62 = e7;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        de.h hVar7 = hVar62;
                        Object o10 = r10.o(hVar7, i19, andIncrement, null);
                        com.google.android.gms.internal.clearcut.e eVar = de.d.m;
                        if (o10 == eVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        com.google.android.gms.internal.clearcut.e eVar2 = de.d.o;
                        if (o10 != eVar2) {
                            iVar = iVar2;
                            if (o10 == de.d.n) {
                                be.m l4 = be.f0.l(w7.n.b(this));
                                try {
                                    Object o11 = r10.o(hVar7, i19, andIncrement, l4);
                                    if (o11 != eVar) {
                                        if (o11 != eVar2) {
                                            rVar = rVar4;
                                            nVar2 = nVar32;
                                            hVar7.b();
                                            l4.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar7.b();
                                            }
                                            de.h hVar8 = (de.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(de.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = de.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i20 = (int) (andIncrement2 % j12);
                                                rVar = rVar4;
                                                nVar2 = nVar32;
                                                if (hVar8.c == j13) {
                                                    hVar = hVar8;
                                                } else {
                                                    de.h e10 = r10.e(j13, hVar8);
                                                    if (e10 == null) {
                                                        nVar32 = nVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        rVar4 = rVar;
                                                    } else {
                                                        hVar = e10;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i20, andIncrement2, l4);
                                                de.h hVar9 = hVar;
                                                if (o12 == de.d.m) {
                                                    l4.a(hVar9, i20);
                                                } else if (o12 == de.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar9.b();
                                                    }
                                                    nVar32 = nVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar8 = hVar9;
                                                    rVar4 = rVar;
                                                } else {
                                                    if (o12 == de.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar9.b();
                                                    l4.B(null, o12);
                                                }
                                            }
                                            Throwable th3 = (Throwable) de.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new de.i("Channel was closed");
                                            }
                                            l4.resumeWith(i8.a(th3));
                                        }
                                        obj2 = l4.r();
                                        ld.a aVar8 = ld.a.a;
                                    } else {
                                        l4.a(hVar7, i19);
                                    }
                                    rVar = rVar4;
                                    nVar2 = nVar32;
                                    obj2 = l4.r();
                                    ld.a aVar82 = ld.a.a;
                                } catch (Throwable th4) {
                                    l4.A();
                                    throw th4;
                                }
                            } else {
                                rVar = rVar4;
                                nVar2 = nVar32;
                                hVar7.b();
                                obj2 = o10;
                            }
                            if (obj2 != aVar7) {
                                nVar = nVar2;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar7;
                        }
                        if (andIncrement < r10.g()) {
                            hVar7.b();
                        }
                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                        hVar62 = hVar7;
                        atomicInteger2 = atomicInteger;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                    }
                    th2 = (Throwable) de.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new de.i("Channel was closed");
                    }
                    int i182 = ge.u.a;
                    throw th2;
                }
                nVar = (k1.n) this.c;
                i8.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                rVar = rVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            default:
                ld.a aVar9 = ld.a.a;
                int i21 = this.b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    return obj;
                }
                i8.b(obj);
                td.p pVar = (td.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar9 ? aVar9 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
