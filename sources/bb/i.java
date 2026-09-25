package bb;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import ce.o;
import com.google.firebase.messaging.t;
import com.google.firebase.sessions.SessionLifecycleService;
import ee.u;
import ee.v;
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
import k1.m;
import rd.p;
import v7.u7;
import za.a0;
import za.m0;
import za.n;
import za.o0;
import za.p0;
import za.q0;
import za.w;
import zd.c0;
import zd.e0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class i extends kd.j implements p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new i((l) this.d, cVar, 0);
            case 1:
                i iVar = new i((List) this.d, cVar, 1);
                iVar.c = obj;
                return iVar;
            case 2:
                return new i((t) this.d, cVar, 2);
            case 3:
                return new i((p) this.c, this.d, cVar, 3);
            case 4:
                return new i((n) this.c, (id.h) this.d, cVar, 4);
            case 5:
                return new i((a0) this.c, (String) this.d, cVar, 5);
            default:
                return new i((oi.f) this.c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((i) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        if (r2.b(r20) == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018a, code lost:
    
        if (r6 == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0449, code lost:
    
        if (r6.invoke(r0, r20) != r4) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0471  */
    /* JADX WARN: Type inference failed for: r10v1, types: [be.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0449 -> B:109:0x044d). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        l lVar;
        t tVar;
        gd.i iVar;
        AtomicInteger atomicInteger;
        m mVar;
        Object obj2;
        ?? r10;
        Throwable th2;
        m mVar2;
        be.h hVar;
        Object b11;
        boolean booleanValue;
        Object b12;
        List<Message> asList;
        int i10 = this.a;
        id.c cVar = null;
        int i11 = 0;
        gd.i iVar2 = gd.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        ?? r83 = 1;
        switch (i10) {
            case 0:
                jd.a aVar = jd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    u7.b(obj);
                    l lVar2 = (l) obj3;
                    ce.b data = lVar2.a.getData();
                    this.c = lVar2;
                    this.b = 1;
                    b10 = o.b(data, this);
                    if (b10 == aVar) {
                        return aVar;
                    }
                    lVar = lVar2;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) this.c;
                    u7.b(obj);
                    b10 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b10).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                l.a(lVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 1:
                jd.a aVar2 = jd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    u7.b(obj);
                    k1.t tVar2 = (k1.t) this.c;
                    this.b = 1;
                    if (w7.i.a((List) obj3, tVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                }
                return iVar2;
            case 2:
                t tVar3 = (t) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) tVar3.e;
                jd.a aVar3 = jd.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    u7.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    e0.h(((c0) tVar3.b).c());
                    m mVar3 = (m) tVar3.c;
                    r10 = (be.b) tVar3.d;
                    this.c = mVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = be.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be.b.g;
                    be.h hVar2 = (be.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(be.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) be.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i15 = u.a;
                    throw th2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    tVar = tVar3;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    tVar3 = tVar;
                    r82 = 1;
                    e0.h(((c0) tVar3.b).c());
                    m mVar32 = (m) tVar3.c;
                    r10 = (be.b) tVar3.d;
                    this.c = mVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.b.g;
                    be.h hVar22 = (be.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(be.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j3 = be.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j10 = andIncrement / j3;
                        int i16 = (int) (andIncrement % j3);
                        if (hVar22.c != j10) {
                            be.h e = r10.e(j10, hVar22);
                            if (e == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar22 = e;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        be.h hVar3 = hVar22;
                        Object o9 = r10.o(hVar3, i16, andIncrement, null);
                        v vVar = be.d.m;
                        if (o9 == vVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        v vVar2 = be.d.o;
                        if (o9 != vVar2) {
                            iVar = iVar2;
                            if (o9 == be.d.n) {
                                zd.m l4 = e0.l(w7.g.b(this));
                                try {
                                    Object o10 = r10.o(hVar3, i16, andIncrement, l4);
                                    if (o10 != vVar) {
                                        if (o10 != vVar2) {
                                            mVar2 = mVar32;
                                            tVar = tVar3;
                                            hVar3.b();
                                            l4.B(null, o10);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar3.b();
                                            }
                                            be.h hVar4 = (be.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(be.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j11 = be.d.b;
                                                long j12 = andIncrement2 / j11;
                                                int i17 = (int) (andIncrement2 % j11);
                                                mVar2 = mVar32;
                                                tVar = tVar3;
                                                if (hVar4.c == j12) {
                                                    hVar = hVar4;
                                                } else {
                                                    be.h e7 = r10.e(j12, hVar4);
                                                    if (e7 == null) {
                                                        mVar32 = mVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        tVar3 = tVar;
                                                    } else {
                                                        hVar = e7;
                                                    }
                                                }
                                                Object o11 = r10.o(hVar, i17, andIncrement2, l4);
                                                be.h hVar5 = hVar;
                                                if (o11 == be.d.m) {
                                                    l4.a(hVar5, i17);
                                                } else if (o11 == be.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar5.b();
                                                    }
                                                    hVar4 = hVar5;
                                                    tVar3 = tVar;
                                                    mVar32 = mVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                } else {
                                                    if (o11 == be.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar5.b();
                                                    l4.B(null, o11);
                                                }
                                            }
                                            Throwable th3 = (Throwable) be.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new be.i("Channel was closed");
                                            }
                                            l4.resumeWith(u7.a(th3));
                                        }
                                        obj2 = l4.r();
                                        jd.a aVar4 = jd.a.a;
                                    } else {
                                        l4.a(hVar3, i16);
                                    }
                                    mVar2 = mVar32;
                                    tVar = tVar3;
                                    obj2 = l4.r();
                                    jd.a aVar42 = jd.a.a;
                                } catch (Throwable th4) {
                                    l4.A();
                                    throw th4;
                                }
                            } else {
                                mVar2 = mVar32;
                                tVar = tVar3;
                                hVar3.b();
                                obj2 = o9;
                            }
                            if (obj2 != aVar3) {
                                mVar = mVar2;
                                cVar = null;
                                this.c = cVar;
                                this.b = 2;
                                break;
                            }
                            return aVar3;
                        }
                        if (andIncrement < r10.g()) {
                            hVar3.b();
                        }
                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                        hVar22 = hVar3;
                        atomicInteger2 = atomicInteger;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                    }
                    th2 = (Throwable) be.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new be.i("Channel was closed");
                    }
                    int i152 = u.a;
                    throw th2;
                }
                mVar = (m) this.c;
                u7.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                tVar = tVar3;
                obj2 = obj;
                this.c = cVar;
                this.b = 2;
            case 3:
                jd.a aVar5 = jd.a.a;
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    return obj;
                }
                u7.b(obj);
                p pVar = (p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar5 ? aVar5 : invoke;
            case 4:
                n nVar = (n) this.c;
                h hVar6 = nVar.b;
                jd.a aVar6 = jd.a.a;
                int i19 = this.b;
                if (i19 == 0) {
                    u7.b(obj);
                    ab.c cVar2 = ab.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u7.b(obj);
                        Boolean h = hVar6.a.h();
                        if (h != null) {
                            booleanValue = h.booleanValue();
                        } else {
                            Boolean a2 = hVar6.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (!booleanValue) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                            return iVar2;
                        }
                        id.h hVar7 = (id.h) obj3;
                        oi.f fVar = new oi.f();
                        fVar.a = hVar7;
                        fVar.c = new LinkedBlockingDeque(20);
                        fVar.d = new a9.d(fVar, 3);
                        Object b13 = k9.h.c().b(o0.class);
                        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                        Messenger messenger = new Messenger(new androidx.mediarouter.app.c(hVar7));
                        a9.d serviceConnection = (a9.d) fVar.d;
                        kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                        k9.h hVar8 = ((p0) ((o0) b13)).a;
                        hVar8.a();
                        Context applicationContext = hVar8.a.getApplicationContext();
                        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                        Log.d("LifecycleServiceBinder", "Binding service to application.");
                        intent.setAction(String.valueOf(Process.myPid()));
                        intent.putExtra("ClientCallbackMessenger", messenger);
                        applicationContext.bindService(intent, serviceConnection, 65);
                        q0.c = fVar;
                        if (q0.b) {
                            q0.b = false;
                            fVar.N(1);
                        }
                        k9.h hVar9 = nVar.a;
                        za.m mVar4 = new za.m(i11);
                        hVar9.a();
                        hVar9.j.add(mVar4);
                        return iVar2;
                    }
                    u7.b(obj);
                    b11 = obj;
                }
                Collection values = ((Map) b11).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((w9.j) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 5:
                jd.a aVar7 = jd.a.a;
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    return iVar2;
                }
                u7.b(obj);
                w wVar = a0.e;
                Context context = ((a0) this.c).a;
                wVar.getClass();
                k2.u a10 = a0.f.a(context, w.a[0]);
                k1.n nVar2 = new k1.n((String) obj3, cVar, r83 == true ? 1 : 0);
                this.b = 1;
                return a10.a(new n1.c(nVar2, null, 1), this) == aVar7 ? aVar7 : iVar2;
            default:
                ArrayList arrayList = (ArrayList) obj3;
                oi.f fVar2 = (oi.f) this.c;
                jd.a aVar8 = jd.a.a;
                int i21 = this.b;
                if (i21 == 0) {
                    u7.b(obj);
                    ab.c cVar3 = ab.c.a;
                    this.b = 1;
                    b12 = cVar3.b(this);
                    if (b12 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    b12 = obj;
                }
                Map map = (Map) b12;
                if (map.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return iVar2;
                }
                Collection values2 = map.values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    Iterator it2 = values2.iterator();
                    while (it2.hasNext()) {
                        if (((w9.j) it2.next()).a.a()) {
                            ArrayList f7 = hd.g.f(new ArrayList(new hd.d(new Message[]{oi.f.a(fVar2, arrayList, 2), oi.f.a(fVar2, arrayList, 1)}, true)));
                            m0 m0Var = new m0();
                            if (f7.size() <= 1) {
                                asList = hd.g.m(f7);
                            } else {
                                Object[] array = f7.toArray(new Object[0]);
                                kotlin.jvm.internal.i.e(array, "<this>");
                                if (array.length > 1) {
                                    Arrays.sort(array, m0Var);
                                }
                                asList = Arrays.asList(array);
                                kotlin.jvm.internal.i.d(asList, "asList(...)");
                            }
                            for (Message message : asList) {
                                if (((Messenger) fVar2.b) != null) {
                                    try {
                                        Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                        Messenger messenger2 = (Messenger) fVar2.b;
                                        if (messenger2 != null) {
                                            messenger2.send(message);
                                        }
                                    } catch (RemoteException e10) {
                                        Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
                                        fVar2.L(message);
                                    }
                                } else {
                                    fVar2.L(message);
                                }
                            }
                            return iVar2;
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                return iVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }
}
