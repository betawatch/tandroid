package bb;

import a8.jd;
import a8.kd;
import a8.pe;
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
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends nd.i implements ud.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, ld.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.a) {
            case 0:
                return new l((m) this.c, (ld.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.q) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((db.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.q) this.d, cVar, 5);
            default:
                return new l((ud.p) this.c, this.d, cVar, 6);
        }
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((l) create((ce.c0) obj, (ld.c) obj2)).invokeSuspend(jd.i.a);
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
    /* JADX WARN: Type inference failed for: r10v3, types: [ee.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d5 -> B:19:0x01d9). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        Object b12;
        db.k kVar;
        jd.i iVar;
        AtomicInteger atomicInteger;
        com.google.firebase.messaging.q qVar;
        k1.n nVar;
        Object obj2;
        ?? r10;
        Throwable th2;
        k1.n nVar2;
        ee.h hVar;
        int i10 = this.a;
        int i11 = 0;
        jd.i iVar2 = jd.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i10) {
            case 0:
                m mVar = (m) this.c;
                db.h hVar2 = mVar.b;
                md.a aVar = md.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    jd.b(obj);
                    cb.c cVar = cb.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jd.b(obj);
                        Boolean R = hVar2.a.R();
                        if (R != null) {
                            booleanValue = R.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            ld.h hVar3 = (ld.h) obj3;
                            com.google.firebase.messaging.q qVar2 = new com.google.firebase.messaging.q();
                            qVar2.a = hVar3;
                            qVar2.c = new LinkedBlockingDeque(20);
                            qVar2.d = new b9.c(qVar2, 1);
                            Object b13 = m9.h.c().b(q0.class);
                            kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new androidx.mediarouter.app.c(hVar3));
                            b9.c serviceConnection = (b9.c) qVar2.d;
                            kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                            m9.h hVar4 = ((r0) ((q0) b13)).a;
                            hVar4.a();
                            Context applicationContext = hVar4.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            s0.c = qVar2;
                            if (s0.b) {
                                s0.b = false;
                                qVar2.C(1);
                            }
                            m9.h hVar5 = mVar.a;
                            ag.w wVar = new ag.w(18);
                            hVar5.a();
                            hVar5.j.add(wVar);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return iVar2;
                    }
                    jd.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((y9.j) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 1:
                md.a aVar2 = md.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    jd.b(obj);
                    w wVar2 = c0.e;
                    Context context = ((c0) this.c).a;
                    wVar2.getClass();
                    jg.s0 a10 = c0.f.a(context, w.a[0]);
                    b0 b0Var = new b0((String) obj3, null, i11);
                    this.b = 1;
                    if (a10.w(new n1.c(b0Var, null, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
                }
                return iVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                com.google.firebase.messaging.q qVar3 = (com.google.firebase.messaging.q) this.c;
                md.a aVar3 = md.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    jd.b(obj);
                    cb.c cVar2 = cb.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
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
                            if (((y9.j) it2.next()).a.a()) {
                                ArrayList f7 = kd.g.f(new ArrayList(new kd.d(new Message[]{com.google.firebase.messaging.q.a(qVar3, arrayList, 2), com.google.firebase.messaging.q.a(qVar3, arrayList, 1)}, true)));
                                o0 o0Var = new o0();
                                if (f7.size() <= 1) {
                                    asList = kd.g.m(f7);
                                } else {
                                    Object[] array = f7.toArray(new Object[0]);
                                    kotlin.jvm.internal.i.e(array, "<this>");
                                    if (array.length > 1) {
                                        Arrays.sort(array, o0Var);
                                    }
                                    asList = Arrays.asList(array);
                                    kotlin.jvm.internal.i.d(asList, "asList(...)");
                                }
                                for (Message message : asList) {
                                    if (((Messenger) qVar3.b) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) qVar3.b;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                                            qVar3.A(message);
                                        }
                                    } else {
                                        qVar3.A(message);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return iVar2;
            case 3:
                md.a aVar4 = md.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    jd.b(obj);
                    db.k kVar2 = (db.k) obj3;
                    fe.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = fe.n.b(data, this);
                    if (b12 == aVar4) {
                        return aVar4;
                    }
                    kVar = kVar2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (db.k) this.c;
                    jd.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                db.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 4:
                md.a aVar5 = md.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    jd.b(obj);
                    k1.s sVar = (k1.s) this.c;
                    this.b = 1;
                    if (kd.a((List) obj3, sVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
                }
                return iVar2;
            case 5:
                com.google.firebase.messaging.q qVar4 = (com.google.firebase.messaging.q) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) qVar4.d;
                md.a aVar6 = md.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    jd.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ce.f0.h(((ce.c0) qVar4.a).c());
                    k1.n nVar3 = (k1.n) qVar4.b;
                    r10 = (ee.b) qVar4.c;
                    this.c = nVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = ee.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.b.g;
                    ee.h hVar6 = (ee.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(ee.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) ee.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i18 = he.u.a;
                    throw th2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    qVar = qVar4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    qVar4 = qVar;
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    r82 = 1;
                    ce.f0.h(((ce.c0) qVar4.a).c());
                    k1.n nVar32 = (k1.n) qVar4.b;
                    r10 = (ee.b) qVar4.c;
                    this.c = nVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = ee.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.b.g;
                    ee.h hVar62 = (ee.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(ee.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = ee.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i19 = (int) (andIncrement % j10);
                        if (hVar62.c != j11) {
                            ee.h e10 = r10.e(j11, hVar62);
                            if (e10 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar62 = e10;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        ee.h hVar7 = hVar62;
                        Object o10 = r10.o(hVar7, i19, andIncrement, null);
                        he.v vVar = ee.d.m;
                        if (o10 == vVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        he.v vVar2 = ee.d.o;
                        if (o10 != vVar2) {
                            iVar = iVar2;
                            if (o10 == ee.d.n) {
                                ce.m l4 = ce.f0.l(pe.b(this));
                                try {
                                    Object o11 = r10.o(hVar7, i19, andIncrement, l4);
                                    if (o11 != vVar) {
                                        if (o11 != vVar2) {
                                            qVar = qVar4;
                                            nVar2 = nVar32;
                                            hVar7.b();
                                            l4.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar7.b();
                                            }
                                            ee.h hVar8 = (ee.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(ee.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = ee.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i20 = (int) (andIncrement2 % j12);
                                                qVar = qVar4;
                                                nVar2 = nVar32;
                                                if (hVar8.c == j13) {
                                                    hVar = hVar8;
                                                } else {
                                                    ee.h e11 = r10.e(j13, hVar8);
                                                    if (e11 == null) {
                                                        nVar32 = nVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        qVar4 = qVar;
                                                    } else {
                                                        hVar = e11;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i20, andIncrement2, l4);
                                                ee.h hVar9 = hVar;
                                                if (o12 == ee.d.m) {
                                                    l4.a(hVar9, i20);
                                                } else if (o12 == ee.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar9.b();
                                                    }
                                                    nVar32 = nVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar8 = hVar9;
                                                    qVar4 = qVar;
                                                } else {
                                                    if (o12 == ee.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar9.b();
                                                    l4.B(null, o12);
                                                }
                                            }
                                            Throwable th3 = (Throwable) ee.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new ee.i("Channel was closed");
                                            }
                                            l4.resumeWith(jd.a(th3));
                                        }
                                        obj2 = l4.r();
                                        md.a aVar7 = md.a.a;
                                    } else {
                                        l4.a(hVar7, i19);
                                    }
                                    qVar = qVar4;
                                    nVar2 = nVar32;
                                    obj2 = l4.r();
                                    md.a aVar72 = md.a.a;
                                } catch (Throwable th4) {
                                    l4.A();
                                    throw th4;
                                }
                            } else {
                                qVar = qVar4;
                                nVar2 = nVar32;
                                hVar7.b();
                                obj2 = o10;
                            }
                            if (obj2 != aVar6) {
                                nVar = nVar2;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar6;
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
                    th2 = (Throwable) ee.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new ee.i("Channel was closed");
                    }
                    int i182 = he.u.a;
                    throw th2;
                }
                nVar = (k1.n) this.c;
                jd.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                qVar = qVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            default:
                md.a aVar8 = md.a.a;
                int i21 = this.b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jd.b(obj);
                    return obj;
                }
                jd.b(obj);
                ud.p pVar = (ud.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar8 ? aVar8 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, ld.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
