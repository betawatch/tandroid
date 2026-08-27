package ia;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import g7.s8;
import h7.h7;
import h7.k6;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends tc.i implements ad.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, rc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.a) {
            case 0:
                return new m((n) this.c, (rc.h) this.d, cVar, 0);
            case 1:
                return new m((d0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new m((com.google.firebase.messaging.t) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                m mVar = new m((List) this.d, cVar, 3);
                mVar.c = obj;
                return mVar;
            case 4:
                return new m((com.google.firebase.messaging.t) this.d, cVar, 4);
            case 5:
                return new m((ad.p) this.c, this.d, cVar, 5);
            default:
                return new m((ka.k) this.d, cVar, 6);
        }
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((m) create((id.c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0452, code lost:
    
        if (r2.b(r20) == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0419, code lost:
    
        if (r5 == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0229, code lost:
    
        if (r7.invoke(r0, r20) != r4) goto L109;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kd.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0229 -> B:31:0x022d). Please report as a decompilation issue!!! */
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        com.google.firebase.messaging.t tVar;
        pc.i iVar;
        AtomicInteger atomicInteger;
        k1.n nVar;
        Object obj2;
        ?? r10;
        Throwable th;
        k1.n nVar2;
        kd.h hVar;
        Object b12;
        ka.k kVar;
        int i10 = this.a;
        int i11 = 0;
        pc.i iVar2 = pc.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i10) {
            case 0:
                n nVar3 = (n) this.c;
                ka.h hVar2 = nVar3.b;
                sc.a aVar = sc.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    k6.b(obj);
                    ja.c cVar = ja.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k6.b(obj);
                        Boolean b13 = hVar2.a.b();
                        if (b13 != null) {
                            booleanValue = b13.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            rc.h hVar3 = (rc.h) obj3;
                            com.google.firebase.messaging.t tVar2 = new com.google.firebase.messaging.t(hVar3);
                            Object b14 = t8.h.c().b(r0.class);
                            kotlin.jvm.internal.j.d(b14, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new androidx.mediarouter.app.c(hVar3));
                            ef.a serviceConnection = (ef.a) tVar2.e;
                            kotlin.jvm.internal.j.e(serviceConnection, "serviceConnection");
                            t8.h hVar4 = ((s0) ((r0) b14)).a;
                            hVar4.a();
                            Context applicationContext = hVar4.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            t0.c = tVar2;
                            if (t0.b) {
                                t0.b = false;
                                tVar2.M(1);
                            }
                            t8.h hVar5 = nVar3.a;
                            l lVar = new l(i11);
                            hVar5.a();
                            hVar5.j.add(lVar);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return iVar2;
                    }
                    k6.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((f9.k) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 1:
                sc.a aVar2 = sc.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    k6.b(obj);
                    x xVar = d0.e;
                    Context context = ((d0) this.c).a;
                    xVar.getClass();
                    n1.d a3 = d0.f.a(context, x.a[0]);
                    c0 c0Var = new c0((String) obj3, null, i11);
                    this.b = 1;
                    if (a3.c(new n1.c(c0Var, null, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return iVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                com.google.firebase.messaging.t tVar3 = (com.google.firebase.messaging.t) this.c;
                sc.a aVar3 = sc.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    k6.b(obj);
                    ja.c cVar2 = ja.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
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
                            if (((f9.k) it2.next()).a.a()) {
                                ArrayList f10 = qc.g.f(new ArrayList(new qc.d(new Message[]{com.google.firebase.messaging.t.a(tVar3, arrayList, 2), com.google.firebase.messaging.t.a(tVar3, arrayList, 1)}, true)));
                                p0 p0Var = new p0();
                                if (f10.size() <= 1) {
                                    asList = qc.g.m(f10);
                                } else {
                                    Object[] array = f10.toArray(new Object[0]);
                                    kotlin.jvm.internal.j.e(array, "<this>");
                                    if (array.length > 1) {
                                        Arrays.sort(array, p0Var);
                                    }
                                    asList = Arrays.asList(array);
                                    kotlin.jvm.internal.j.d(asList, "asList(...)");
                                }
                                for (Message message : asList) {
                                    if (((Messenger) tVar3.c) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) tVar3.c;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e9) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e9);
                                            tVar3.J(message);
                                        }
                                    } else {
                                        tVar3.J(message);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return iVar2;
            case 3:
                sc.a aVar4 = sc.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    k6.b(obj);
                    k1.s sVar = (k1.s) this.c;
                    this.b = 1;
                    if (s8.a((List) obj3, sVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return iVar2;
            case 4:
                com.google.firebase.messaging.t tVar4 = (com.google.firebase.messaging.t) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) tVar4.e;
                sc.a aVar5 = sc.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    k6.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    id.f0.h(((id.c0) tVar4.b).c());
                    k1.n nVar4 = (k1.n) tVar4.c;
                    r10 = (kd.b) tVar4.d;
                    this.c = nVar4;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = kd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kd.b.g;
                    kd.h hVar6 = (kd.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(kd.b.b.get(r10), r82)) {
                    }
                    th = (Throwable) kd.b.i.get(r10);
                    if (th == null) {
                    }
                    int i17 = nd.u.a;
                    throw th;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    tVar = tVar4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    tVar4 = tVar;
                    r82 = 1;
                    id.f0.h(((id.c0) tVar4.b).c());
                    k1.n nVar42 = (k1.n) tVar4.c;
                    r10 = (kd.b) tVar4.d;
                    this.c = nVar42;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = kd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kd.b.g;
                    kd.h hVar62 = (kd.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(kd.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = kd.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i18 = (int) (andIncrement % j10);
                        if (hVar62.c != j11) {
                            kd.h e10 = r10.e(j11, hVar62);
                            if (e10 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar62 = e10;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        kd.h hVar7 = hVar62;
                        Object o10 = r10.o(hVar7, i18, andIncrement, null);
                        ec.a aVar6 = kd.d.m;
                        if (o10 == aVar6) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        ec.a aVar7 = kd.d.o;
                        if (o10 != aVar7) {
                            iVar = iVar2;
                            if (o10 == kd.d.n) {
                                id.m l10 = id.f0.l(h7.b(this));
                                try {
                                    Object o11 = r10.o(hVar7, i18, andIncrement, l10);
                                    if (o11 != aVar6) {
                                        if (o11 != aVar7) {
                                            tVar = tVar4;
                                            nVar2 = nVar42;
                                            hVar7.b();
                                            l10.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar7.b();
                                            }
                                            kd.h hVar8 = (kd.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(kd.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = kd.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i19 = (int) (andIncrement2 % j12);
                                                tVar = tVar4;
                                                nVar2 = nVar42;
                                                if (hVar8.c == j13) {
                                                    hVar = hVar8;
                                                } else {
                                                    kd.h e11 = r10.e(j13, hVar8);
                                                    if (e11 == null) {
                                                        nVar42 = nVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        tVar4 = tVar;
                                                    } else {
                                                        hVar = e11;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i19, andIncrement2, l10);
                                                kd.h hVar9 = hVar;
                                                if (o12 == kd.d.m) {
                                                    l10.a(hVar9, i19);
                                                } else if (o12 == kd.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar9.b();
                                                    }
                                                    nVar42 = nVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar8 = hVar9;
                                                    tVar4 = tVar;
                                                } else {
                                                    if (o12 == kd.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar9.b();
                                                    l10.B(null, o12);
                                                }
                                            }
                                            Throwable th2 = (Throwable) kd.b.i.get(r10);
                                            if (th2 == null) {
                                                th2 = new kd.i("Channel was closed");
                                            }
                                            l10.resumeWith(k6.a(th2));
                                        }
                                        obj2 = l10.r();
                                        sc.a aVar8 = sc.a.a;
                                    } else {
                                        l10.a(hVar7, i18);
                                    }
                                    tVar = tVar4;
                                    nVar2 = nVar42;
                                    obj2 = l10.r();
                                    sc.a aVar82 = sc.a.a;
                                } catch (Throwable th3) {
                                    l10.A();
                                    throw th3;
                                }
                            } else {
                                tVar = tVar4;
                                nVar2 = nVar42;
                                hVar7.b();
                                obj2 = o10;
                            }
                            if (obj2 != aVar5) {
                                nVar = nVar2;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar5;
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
                    th = (Throwable) kd.b.i.get(r10);
                    if (th == null) {
                        th = new kd.i("Channel was closed");
                    }
                    int i172 = nd.u.a;
                    throw th;
                }
                nVar = (k1.n) this.c;
                k6.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                tVar = tVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            case 5:
                sc.a aVar9 = sc.a.a;
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                    return obj;
                }
                k6.b(obj);
                ad.p pVar = (ad.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar9 ? aVar9 : invoke;
            default:
                sc.a aVar10 = sc.a.a;
                int i21 = this.b;
                if (i21 == 0) {
                    k6.b(obj);
                    ka.k kVar2 = (ka.k) obj3;
                    ld.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = ld.n.b(data, this);
                    if (b12 == aVar10) {
                        return aVar10;
                    }
                    kVar = kVar2;
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (ka.k) this.c;
                    k6.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                ka.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
