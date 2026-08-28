package ha;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import g7.g7;
import g7.y5;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends sc.i implements zc.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        this.c = obj;
        this.d = obj2;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.a) {
            case 0:
                return new l((m) this.c, (qc.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.t) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((ja.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.c = obj;
                return lVar;
            case 5:
                return new l((com.google.firebase.messaging.t) this.d, cVar, 5);
            default:
                return new l((zc.p) this.c, this.d, cVar, 6);
        }
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((l) create((hd.c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0459, code lost:
    
        if (r2.b(r20) == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0420, code lost:
    
        if (r5 == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01dc, code lost:
    
        if (r7.invoke(r0, r20) != r4) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, jd.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01dc -> B:19:0x01e0). Please report as a decompilation issue!!! */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        Object b12;
        ja.k kVar;
        com.google.firebase.messaging.t tVar;
        oc.i iVar;
        AtomicInteger atomicInteger;
        k1.n nVar;
        Object obj2;
        ?? r10;
        Throwable th;
        k1.n nVar2;
        jd.h hVar;
        int i9 = this.a;
        int i10 = 0;
        oc.i iVar2 = oc.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i9) {
            case 0:
                m mVar = (m) this.c;
                ja.h hVar2 = mVar.b;
                rc.a aVar = rc.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    y5.b(obj);
                    ia.c cVar = ia.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.b(obj);
                        Boolean H = hVar2.a.H();
                        if (H != null) {
                            booleanValue = H.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            qc.h hVar3 = (qc.h) obj3;
                            com.google.firebase.messaging.t tVar2 = new com.google.firebase.messaging.t(hVar3);
                            Object b13 = s8.h.c().b(q0.class);
                            kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new androidx.mediarouter.app.d(hVar3));
                            df.a serviceConnection = (df.a) tVar2.e;
                            kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                            s8.h hVar4 = ((r0) ((q0) b13)).a;
                            hVar4.a();
                            Context applicationContext = hVar4.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            s0.c = tVar2;
                            if (s0.b) {
                                s0.b = false;
                                tVar2.M(1);
                            }
                            s8.h hVar5 = mVar.a;
                            h9.a aVar2 = new h9.a(4);
                            hVar5.a();
                            hVar5.j.add(aVar2);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return iVar2;
                    }
                    y5.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((e9.k) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 1:
                rc.a aVar3 = rc.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    y5.b(obj);
                    w wVar = c0.e;
                    Context context = ((c0) this.c).a;
                    wVar.getClass();
                    android.support.v4.media.c a3 = c0.f.a(context, w.a[0]);
                    b0 b0Var = new b0((String) obj3, null, i10);
                    this.b = 1;
                    if (a3.e(new n1.c(b0Var, null, 1), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                return iVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                com.google.firebase.messaging.t tVar3 = (com.google.firebase.messaging.t) this.c;
                rc.a aVar4 = rc.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    y5.b(obj);
                    ia.c cVar2 = ia.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
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
                            if (((e9.k) it2.next()).a.a()) {
                                ArrayList f10 = pc.g.f(new ArrayList(new pc.d(new Message[]{com.google.firebase.messaging.t.a(tVar3, arrayList, 2), com.google.firebase.messaging.t.a(tVar3, arrayList, 1)}, true)));
                                o0 o0Var = new o0();
                                if (f10.size() <= 1) {
                                    asList = pc.g.m(f10);
                                } else {
                                    Object[] array = f10.toArray(new Object[0]);
                                    kotlin.jvm.internal.i.e(array, "<this>");
                                    if (array.length > 1) {
                                        Arrays.sort(array, o0Var);
                                    }
                                    asList = Arrays.asList(array);
                                    kotlin.jvm.internal.i.d(asList, "asList(...)");
                                }
                                for (Message message : asList) {
                                    if (((Messenger) tVar3.c) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) tVar3.c;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e10) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
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
                rc.a aVar5 = rc.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    y5.b(obj);
                    ja.k kVar2 = (ja.k) obj3;
                    kd.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = kd.n.b(data, this);
                    if (b12 == aVar5) {
                        return aVar5;
                    }
                    kVar = kVar2;
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (ja.k) this.c;
                    y5.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                ja.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
            case 4:
                rc.a aVar6 = rc.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    y5.b(obj);
                    k1.s sVar = (k1.s) this.c;
                    this.b = 1;
                    if (g7.g.a((List) obj3, sVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                return iVar2;
            case 5:
                com.google.firebase.messaging.t tVar4 = (com.google.firebase.messaging.t) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) tVar4.e;
                rc.a aVar7 = rc.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    y5.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    hd.f0.h(((hd.c0) tVar4.b).c());
                    k1.n nVar3 = (k1.n) tVar4.c;
                    r10 = (jd.b) tVar4.d;
                    this.c = nVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = jd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jd.b.g;
                    jd.h hVar6 = (jd.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(jd.b.b.get(r10), r82)) {
                    }
                    th = (Throwable) jd.b.i.get(r10);
                    if (th == null) {
                    }
                    int i17 = md.u.a;
                    throw th;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
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
                    hd.f0.h(((hd.c0) tVar4.b).c());
                    k1.n nVar32 = (k1.n) tVar4.c;
                    r10 = (jd.b) tVar4.d;
                    this.c = nVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = jd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = jd.b.g;
                    jd.h hVar62 = (jd.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(jd.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = jd.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i18 = (int) (andIncrement % j10);
                        if (hVar62.c != j11) {
                            jd.h e11 = r10.e(j11, hVar62);
                            if (e11 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar62 = e11;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        jd.h hVar7 = hVar62;
                        Object o6 = r10.o(hVar7, i18, andIncrement, null);
                        e5.c cVar3 = jd.d.m;
                        if (o6 == cVar3) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        e5.c cVar4 = jd.d.o;
                        if (o6 != cVar4) {
                            iVar = iVar2;
                            if (o6 == jd.d.n) {
                                hd.m l10 = hd.f0.l(g7.b(this));
                                try {
                                    Object o9 = r10.o(hVar7, i18, andIncrement, l10);
                                    if (o9 != cVar3) {
                                        if (o9 != cVar4) {
                                            tVar = tVar4;
                                            nVar2 = nVar32;
                                            hVar7.b();
                                            l10.B(null, o9);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar7.b();
                                            }
                                            jd.h hVar8 = (jd.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(jd.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = jd.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i19 = (int) (andIncrement2 % j12);
                                                tVar = tVar4;
                                                nVar2 = nVar32;
                                                if (hVar8.c == j13) {
                                                    hVar = hVar8;
                                                } else {
                                                    jd.h e12 = r10.e(j13, hVar8);
                                                    if (e12 == null) {
                                                        nVar32 = nVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        tVar4 = tVar;
                                                    } else {
                                                        hVar = e12;
                                                    }
                                                }
                                                Object o10 = r10.o(hVar, i19, andIncrement2, l10);
                                                jd.h hVar9 = hVar;
                                                if (o10 == jd.d.m) {
                                                    l10.a(hVar9, i19);
                                                } else if (o10 == jd.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar9.b();
                                                    }
                                                    nVar32 = nVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar8 = hVar9;
                                                    tVar4 = tVar;
                                                } else {
                                                    if (o10 == jd.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar9.b();
                                                    l10.B(null, o10);
                                                }
                                            }
                                            Throwable th2 = (Throwable) jd.b.i.get(r10);
                                            if (th2 == null) {
                                                th2 = new jd.i("Channel was closed");
                                            }
                                            l10.resumeWith(y5.a(th2));
                                        }
                                        obj2 = l10.r();
                                        rc.a aVar8 = rc.a.a;
                                    } else {
                                        l10.a(hVar7, i18);
                                    }
                                    tVar = tVar4;
                                    nVar2 = nVar32;
                                    obj2 = l10.r();
                                    rc.a aVar82 = rc.a.a;
                                } catch (Throwable th3) {
                                    l10.A();
                                    throw th3;
                                }
                            } else {
                                tVar = tVar4;
                                nVar2 = nVar32;
                                hVar7.b();
                                obj2 = o6;
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
                    th = (Throwable) jd.b.i.get(r10);
                    if (th == null) {
                        th = new jd.i("Channel was closed");
                    }
                    int i172 = md.u.a;
                    throw th;
                }
                nVar = (k1.n) this.c;
                y5.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                tVar = tVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            default:
                rc.a aVar9 = rc.a.a;
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                    return obj;
                }
                y5.b(obj);
                zc.p pVar = (zc.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar9 ? aVar9 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        this.d = obj;
    }
}
