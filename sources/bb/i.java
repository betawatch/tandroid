package bb;

import ae.d0;
import ae.g0;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.s;
import com.google.firebase.sessions.SessionLifecycleService;
import fe.u;
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
import k1.n;
import k1.t;
import sd.p;
import v7.a8;
import v7.c9;
import za.a0;
import za.m;
import za.m0;
import za.o0;
import za.p0;
import za.q0;
import za.v;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i extends ld.j implements p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, Object obj2, jd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.a) {
            case 0:
                return new i((l) this.d, cVar, 0);
            case 1:
                i iVar = new i((List) this.d, cVar, 1);
                iVar.c = obj;
                return iVar;
            case 2:
                return new i((s) this.d, cVar, 2);
            case 3:
                return new i((p) this.c, this.d, cVar, 3);
            case 4:
                return new i((m) this.c, (jd.h) this.d, cVar, 4);
            case 5:
                return new i((a0) this.c, (String) this.d, cVar, 5);
            default:
                return new i((oi.f) this.c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((i) create((d0) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        if (r2.b(r21) == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018a, code lost:
    
        if (r6 == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0444, code lost:
    
        if (r6.invoke(r0, r21) != r2) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x046d  */
    /* JADX WARN: Type inference failed for: r10v1, types: [ce.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0444 -> B:109:0x0448). Please report as a decompilation issue!!! */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        l lVar;
        kd.a aVar;
        hd.i iVar;
        AtomicInteger atomicInteger;
        k1.m mVar;
        Object obj2;
        Object obj3;
        ?? r10;
        Throwable th2;
        ce.h hVar;
        Object b11;
        boolean booleanValue;
        Object b12;
        List<Message> asList;
        int i10 = this.a;
        jd.c cVar = null;
        hd.i iVar2 = hd.i.a;
        Object obj4 = this.d;
        ?? r82 = 1;
        ?? r83 = 1;
        switch (i10) {
            case 0:
                kd.a aVar2 = kd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    a8.b(obj);
                    l lVar2 = (l) obj4;
                    de.b data = lVar2.a.getData();
                    this.c = lVar2;
                    this.b = 1;
                    b10 = de.p.b(data, this);
                    if (b10 == aVar2) {
                        return aVar2;
                    }
                    lVar = lVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) this.c;
                    a8.b(obj);
                    b10 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b10).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                l.a(lVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 1:
                kd.a aVar3 = kd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    a8.b(obj);
                    t tVar = (t) this.c;
                    this.b = 1;
                    if (c9.a((List) obj4, tVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                }
                return iVar2;
            case 2:
                s sVar = (s) obj4;
                AtomicInteger atomicInteger2 = (AtomicInteger) sVar.e;
                kd.a aVar4 = kd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    a8.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    g0.h(((d0) sVar.b).c());
                    mVar = (k1.m) sVar.c;
                    r10 = (ce.b) sVar.d;
                    this.c = mVar;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = ce.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ce.b.g;
                    ce.h hVar2 = (ce.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(ce.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) ce.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i14 = u.a;
                    throw th2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                    obj2 = null;
                    aVar = aVar4;
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    aVar4 = aVar;
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    r82 = 1;
                    g0.h(((d0) sVar.b).c());
                    mVar = (k1.m) sVar.c;
                    r10 = (ce.b) sVar.d;
                    this.c = mVar;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = ce.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ce.b.g;
                    ce.h hVar22 = (ce.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(ce.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        kd.a aVar5 = aVar4;
                        long j3 = ce.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j10 = andIncrement / j3;
                        int i15 = (int) (andIncrement % j3);
                        hd.i iVar3 = iVar2;
                        if (hVar22.c != j10) {
                            ce.h e7 = r10.e(j10, hVar22);
                            if (e7 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                iVar2 = iVar3;
                                aVar4 = aVar5;
                                r82 = 1;
                            } else {
                                hVar22 = e7;
                            }
                        }
                        ce.h hVar3 = hVar22;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        String str = "Channel was closed";
                        Object o9 = r10.o(hVar3, i15, andIncrement, null);
                        da.a aVar6 = ce.d.m;
                        if (o9 == aVar6) {
                            throw new IllegalStateException("unexpected");
                        }
                        da.a aVar7 = ce.d.o;
                        if (o9 != aVar7) {
                            atomicInteger = atomicInteger2;
                            if (o9 == ce.d.n) {
                                ae.m l4 = g0.l(w7.h.b(this));
                                try {
                                    Object o10 = r10.o(hVar3, i15, andIncrement, l4);
                                    if (o10 != aVar6) {
                                        if (o10 != aVar7) {
                                            iVar = iVar3;
                                            hVar3.b();
                                            l4.B(null, o10);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar3.b();
                                            }
                                            ce.h hVar4 = (ce.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(ce.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j11 = ce.d.b;
                                                String str2 = str;
                                                long j12 = andIncrement2 / j11;
                                                int i16 = (int) (andIncrement2 % j11);
                                                atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                iVar = iVar3;
                                                if (hVar4.c == j12) {
                                                    hVar = hVar4;
                                                } else {
                                                    ce.h e10 = r10.e(j12, hVar4);
                                                    if (e10 == null) {
                                                        continue;
                                                        str = str2;
                                                        iVar3 = iVar;
                                                    } else {
                                                        hVar = e10;
                                                    }
                                                }
                                                Object o11 = r10.o(hVar, i16, andIncrement2, l4);
                                                ce.h hVar5 = hVar;
                                                if (o11 == ce.d.m) {
                                                    l4.b(hVar5, i16);
                                                } else if (o11 == ce.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar5.b();
                                                    }
                                                    hVar4 = hVar5;
                                                    str = str2;
                                                    iVar3 = iVar;
                                                } else {
                                                    if (o11 == ce.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar5.b();
                                                    l4.B(null, o11);
                                                }
                                            }
                                            Throwable th3 = (Throwable) ce.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new ce.i(str);
                                            }
                                            l4.resumeWith(a8.a(th3));
                                        }
                                        obj3 = l4.r();
                                        kd.a aVar8 = kd.a.a;
                                    } else {
                                        l4.b(hVar3, i15);
                                    }
                                    iVar = iVar3;
                                    obj3 = l4.r();
                                    kd.a aVar82 = kd.a.a;
                                } catch (Throwable th4) {
                                    l4.A();
                                    throw th4;
                                }
                            } else {
                                iVar = iVar3;
                                hVar3.b();
                                obj3 = o9;
                            }
                            aVar = aVar5;
                            if (obj3 != aVar) {
                                obj2 = null;
                                this.c = obj2;
                                this.b = 2;
                                break;
                            }
                            return aVar;
                        }
                        if (andIncrement < r10.g()) {
                            hVar3.b();
                        }
                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                        iVar2 = iVar3;
                        hVar22 = hVar3;
                        aVar4 = aVar5;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                    }
                    th2 = (Throwable) ce.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new ce.i("Channel was closed");
                    }
                    int i142 = u.a;
                    throw th2;
                }
                mVar = (k1.m) this.c;
                a8.b(obj);
                obj2 = null;
                aVar = aVar4;
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                obj3 = obj;
                this.c = obj2;
                this.b = 2;
            case 3:
                kd.a aVar9 = kd.a.a;
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                    return obj;
                }
                a8.b(obj);
                p pVar = (p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj4, this);
                return invoke == aVar9 ? aVar9 : invoke;
            case 4:
                m mVar2 = (m) this.c;
                h hVar6 = mVar2.b;
                kd.a aVar10 = kd.a.a;
                int i18 = this.b;
                if (i18 == 0) {
                    a8.b(obj);
                    ab.c cVar2 = ab.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a8.b(obj);
                        Boolean Y = hVar6.a.Y();
                        if (Y != null) {
                            booleanValue = Y.booleanValue();
                        } else {
                            Boolean a2 = hVar6.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (!booleanValue) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                            return iVar2;
                        }
                        jd.h hVar7 = (jd.h) obj4;
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
                        k9.h hVar9 = mVar2.a;
                        xa.b bVar = new xa.b(16);
                        hVar9.a();
                        hVar9.j.add(bVar);
                        return iVar2;
                    }
                    a8.b(obj);
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
                kd.a aVar11 = kd.a.a;
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                    return iVar2;
                }
                a8.b(obj);
                v vVar = a0.e;
                Context context = ((a0) this.c).a;
                vVar.getClass();
                m2.t a10 = a0.f.a(context, v.a[0]);
                n nVar = new n((String) obj4, cVar, r83 == true ? 1 : 0);
                this.b = 1;
                return a10.c(new n1.c(nVar, null, 1), this) == aVar11 ? aVar11 : iVar2;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                oi.f fVar2 = (oi.f) this.c;
                kd.a aVar12 = kd.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    a8.b(obj);
                    ab.c cVar3 = ab.c.a;
                    this.b = 1;
                    b12 = cVar3.b(this);
                    if (b12 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
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
                            ArrayList f7 = id.g.f(new ArrayList(new id.d(new Message[]{oi.f.a(fVar2, arrayList, 2), oi.f.a(fVar2, arrayList, 1)}, true)));
                            m0 m0Var = new m0();
                            if (f7.size() <= 1) {
                                asList = id.g.m(f7);
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
                                    } catch (RemoteException e11) {
                                        Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e11);
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
    public /* synthetic */ i(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
