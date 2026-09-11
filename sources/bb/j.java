package bb;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import ce.o;
import com.google.firebase.messaging.s;
import com.google.firebase.sessions.SessionLifecycleService;
import ee.u;
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
import k2.g0;
import rd.p;
import v7.t7;
import v7.t8;
import za.k0;
import za.m0;
import za.n0;
import za.o0;
import za.y;
import zd.c0;
import zd.e0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j extends kd.j implements p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new j((m) this.d, cVar, 0);
            case 1:
                j jVar = new j((List) this.d, cVar, 1);
                jVar.c = obj;
                return jVar;
            case 2:
                return new j((s) this.d, cVar, 2);
            case 3:
                return new j((p) this.c, this.d, cVar, 3);
            case 4:
                return new j((za.l) this.c, (id.h) this.d, cVar, 4);
            case 5:
                return new j((y) this.c, (String) this.d, cVar, 5);
            default:
                return new j((fg.f) this.c, (ArrayList) this.d, cVar, 6);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((j) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
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
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0443, code lost:
    
        if (r6.invoke(r0, r21) != r2) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x046c  */
    /* JADX WARN: Type inference failed for: r10v1, types: [be.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0443 -> B:109:0x0447). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        m mVar;
        jd.a aVar;
        gd.i iVar;
        AtomicInteger atomicInteger;
        k1.m mVar2;
        Object obj2;
        Object obj3;
        ?? r10;
        Throwable th2;
        be.h hVar;
        Object b11;
        boolean booleanValue;
        Object b12;
        List<Message> asList;
        int i10 = this.a;
        id.c cVar = null;
        gd.i iVar2 = gd.i.a;
        Object obj4 = this.d;
        ?? r82 = 1;
        ?? r83 = 1;
        switch (i10) {
            case 0:
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    t7.b(obj);
                    m mVar3 = (m) obj4;
                    ce.b data = mVar3.a.getData();
                    this.c = mVar3;
                    this.b = 1;
                    b10 = o.b(data, this);
                    if (b10 == aVar2) {
                        return aVar2;
                    }
                    mVar = mVar3;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (m) this.c;
                    t7.b(obj);
                    b10 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b10).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                m.a(mVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 1:
                jd.a aVar3 = jd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    t7.b(obj);
                    t tVar = (t) this.c;
                    this.b = 1;
                    if (w7.i.a((List) obj4, tVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                }
                return iVar2;
            case 2:
                s sVar = (s) obj4;
                AtomicInteger atomicInteger2 = (AtomicInteger) sVar.e;
                jd.a aVar4 = jd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    t7.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    e0.h(((c0) sVar.b).c());
                    mVar2 = (k1.m) sVar.c;
                    r10 = (be.b) sVar.d;
                    this.c = mVar2;
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
                    int i14 = u.a;
                    throw th2;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
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
                    e0.h(((c0) sVar.b).c());
                    mVar2 = (k1.m) sVar.c;
                    r10 = (be.b) sVar.d;
                    this.c = mVar2;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = be.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.b.g;
                    be.h hVar22 = (be.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(be.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        jd.a aVar5 = aVar4;
                        long j3 = be.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j10 = andIncrement / j3;
                        int i15 = (int) (andIncrement % j3);
                        gd.i iVar3 = iVar2;
                        if (hVar22.c != j10) {
                            be.h e7 = r10.e(j10, hVar22);
                            if (e7 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                iVar2 = iVar3;
                                aVar4 = aVar5;
                                r82 = 1;
                            } else {
                                hVar22 = e7;
                            }
                        }
                        be.h hVar3 = hVar22;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        String str = "Channel was closed";
                        Object o9 = r10.o(hVar3, i15, andIncrement, null);
                        d9.f fVar = be.d.m;
                        if (o9 == fVar) {
                            throw new IllegalStateException("unexpected");
                        }
                        d9.f fVar2 = be.d.o;
                        if (o9 != fVar2) {
                            atomicInteger = atomicInteger2;
                            if (o9 == be.d.n) {
                                zd.m l4 = e0.l(t8.b(this));
                                try {
                                    Object o10 = r10.o(hVar3, i15, andIncrement, l4);
                                    if (o10 != fVar) {
                                        if (o10 != fVar2) {
                                            iVar = iVar3;
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
                                                String str2 = str;
                                                long j12 = andIncrement2 / j11;
                                                int i16 = (int) (andIncrement2 % j11);
                                                iVar = iVar3;
                                                atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                if (hVar4.c == j12) {
                                                    hVar = hVar4;
                                                } else {
                                                    be.h e10 = r10.e(j12, hVar4);
                                                    if (e10 == null) {
                                                        continue;
                                                        str = str2;
                                                        iVar3 = iVar;
                                                    } else {
                                                        hVar = e10;
                                                    }
                                                }
                                                Object o11 = r10.o(hVar, i16, andIncrement2, l4);
                                                be.h hVar5 = hVar;
                                                if (o11 == be.d.m) {
                                                    l4.a(hVar5, i16);
                                                } else if (o11 == be.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar5.b();
                                                    }
                                                    hVar4 = hVar5;
                                                    str = str2;
                                                    iVar3 = iVar;
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
                                                th3 = new be.i(str);
                                            }
                                            l4.resumeWith(t7.a(th3));
                                        }
                                        obj3 = l4.r();
                                        jd.a aVar6 = jd.a.a;
                                    } else {
                                        l4.a(hVar3, i15);
                                    }
                                    iVar = iVar3;
                                    obj3 = l4.r();
                                    jd.a aVar62 = jd.a.a;
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
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                        aVar4 = aVar5;
                    }
                    th2 = (Throwable) be.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new be.i("Channel was closed");
                    }
                    int i142 = u.a;
                    throw th2;
                }
                mVar2 = (k1.m) this.c;
                t7.b(obj);
                obj2 = null;
                aVar = aVar4;
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                obj3 = obj;
                this.c = obj2;
                this.b = 2;
            case 3:
                jd.a aVar7 = jd.a.a;
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return obj;
                }
                t7.b(obj);
                p pVar = (p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj4, this);
                return invoke == aVar7 ? aVar7 : invoke;
            case 4:
                za.l lVar = (za.l) this.c;
                i iVar4 = lVar.b;
                jd.a aVar8 = jd.a.a;
                int i18 = this.b;
                if (i18 == 0) {
                    t7.b(obj);
                    ab.c cVar2 = ab.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t7.b(obj);
                        Boolean a2 = iVar4.a.a();
                        if (a2 != null) {
                            booleanValue = a2.booleanValue();
                        } else {
                            Boolean a10 = iVar4.b.a();
                            booleanValue = a10 != null ? a10.booleanValue() : true;
                        }
                        if (!booleanValue) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                            return iVar2;
                        }
                        id.h hVar6 = (id.h) obj4;
                        fg.f fVar3 = new fg.f();
                        fVar3.a = hVar6;
                        fVar3.c = new LinkedBlockingDeque(20);
                        fVar3.d = new a9.d(fVar3, 3);
                        Object b13 = k9.h.c().b(m0.class);
                        kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                        Messenger messenger = new Messenger(new androidx.mediarouter.app.c(hVar6));
                        a9.d serviceConnection = (a9.d) fVar3.d;
                        kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                        k9.h hVar7 = ((n0) ((m0) b13)).a;
                        hVar7.a();
                        Context applicationContext = hVar7.a.getApplicationContext();
                        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                        Log.d("LifecycleServiceBinder", "Binding service to application.");
                        intent.setAction(String.valueOf(Process.myPid()));
                        intent.putExtra("ClientCallbackMessenger", messenger);
                        applicationContext.bindService(intent, serviceConnection, 65);
                        o0.c = fVar3;
                        if (o0.b) {
                            o0.b = false;
                            fVar3.Q(1);
                        }
                        k9.h hVar8 = lVar.a;
                        z9.a aVar9 = new z9.a(6);
                        hVar8.a();
                        hVar8.j.add(aVar9);
                        return iVar2;
                    }
                    t7.b(obj);
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
                jd.a aVar10 = jd.a.a;
                int i19 = this.b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return iVar2;
                }
                t7.b(obj);
                za.u uVar = y.e;
                Context context = ((y) this.c).a;
                uVar.getClass();
                g0 a11 = y.f.a(context, za.u.a[0]);
                n nVar = new n((String) obj4, cVar, r83 == true ? 1 : 0);
                this.b = 1;
                return a11.h(new n1.c(nVar, null, 1), this) == aVar10 ? aVar10 : iVar2;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                fg.f fVar4 = (fg.f) this.c;
                jd.a aVar11 = jd.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    t7.b(obj);
                    ab.c cVar3 = ab.c.a;
                    this.b = 1;
                    b12 = cVar3.b(this);
                    if (b12 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
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
                            ArrayList f7 = hd.g.f(new ArrayList(new hd.d(new Message[]{fg.f.a(fVar4, arrayList, 2), fg.f.a(fVar4, arrayList, 1)}, true)));
                            k0 k0Var = new k0();
                            if (f7.size() <= 1) {
                                asList = hd.g.m(f7);
                            } else {
                                Object[] array = f7.toArray(new Object[0]);
                                kotlin.jvm.internal.i.e(array, "<this>");
                                if (array.length > 1) {
                                    Arrays.sort(array, k0Var);
                                }
                                asList = Arrays.asList(array);
                                kotlin.jvm.internal.i.d(asList, "asList(...)");
                            }
                            for (Message message : asList) {
                                if (((Messenger) fVar4.b) != null) {
                                    try {
                                        Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                        Messenger messenger2 = (Messenger) fVar4.b;
                                        if (messenger2 != null) {
                                            messenger2.send(message);
                                        }
                                    } catch (RemoteException e11) {
                                        Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e11);
                                        fVar4.M(message);
                                    }
                                } else {
                                    fVar4.M(message);
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
    public /* synthetic */ j(Object obj, Object obj2, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }
}
