package ja;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import h7.w8;
import i7.c7;
import i7.v7;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends uc.i implements bd.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, sc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.a) {
            case 0:
                return new l((m) this.c, (sc.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new l((com.google.firebase.messaging.s) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                l lVar = new l((List) this.d, cVar, 3);
                lVar.c = obj;
                return lVar;
            case 4:
                return new l((com.google.firebase.messaging.s) this.d, cVar, 4);
            case 5:
                return new l((bd.p) this.c, this.d, cVar, 5);
            default:
                return new l((la.k) this.d, cVar, 6);
        }
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((l) create((jd.c0) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
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
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, ld.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0229 -> B:31:0x022d). Please report as a decompilation issue!!! */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        com.google.firebase.messaging.s sVar;
        qc.i iVar;
        AtomicInteger atomicInteger;
        k1.o oVar;
        Object obj2;
        ?? r10;
        Throwable th2;
        k1.o oVar2;
        ld.h hVar;
        Object b12;
        la.k kVar;
        int i10 = this.a;
        int i11 = 0;
        qc.i iVar2 = qc.i.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i10) {
            case 0:
                m mVar = (m) this.c;
                la.h hVar2 = mVar.b;
                tc.a aVar = tc.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    c7.b(obj);
                    ka.c cVar = ka.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c7.b(obj);
                        Boolean G = hVar2.a.G();
                        if (G != null) {
                            booleanValue = G.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            sc.h hVar3 = (sc.h) obj3;
                            com.google.firebase.messaging.s sVar2 = new com.google.firebase.messaging.s(hVar3);
                            Object b13 = u8.g.c().b(q0.class);
                            kotlin.jvm.internal.j.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new a4.d(hVar3));
                            gf.a serviceConnection = (gf.a) sVar2.e;
                            kotlin.jvm.internal.j.e(serviceConnection, "serviceConnection");
                            u8.g gVar = ((r0) ((q0) b13)).a;
                            gVar.a();
                            Context applicationContext = gVar.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            s0.c = sVar2;
                            if (s0.b) {
                                s0.b = false;
                                sVar2.M(1);
                            }
                            u8.g gVar2 = mVar.a;
                            j3.d0 d0Var = new j3.d0(21);
                            gVar2.a();
                            gVar2.j.add(d0Var);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return iVar2;
                    }
                    c7.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((g9.k) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 1:
                tc.a aVar2 = tc.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    c7.b(obj);
                    w wVar = c0.e;
                    Context context = ((c0) this.c).a;
                    wVar.getClass();
                    za.c a10 = c0.f.a(context, w.a[0]);
                    b0 b0Var = new b0((String) obj3, null, i11);
                    this.b = 1;
                    if (a10.d(new n1.c(b0Var, null, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                }
                return iVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                com.google.firebase.messaging.s sVar3 = (com.google.firebase.messaging.s) this.c;
                tc.a aVar3 = tc.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    c7.b(obj);
                    ka.c cVar2 = ka.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
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
                            if (((g9.k) it2.next()).a.a()) {
                                ArrayList f9 = rc.g.f(new ArrayList(new rc.d(new Message[]{com.google.firebase.messaging.s.d(sVar3, arrayList, 2), com.google.firebase.messaging.s.d(sVar3, arrayList, 1)}, true)));
                                o0 o0Var = new o0();
                                if (f9.size() <= 1) {
                                    asList = rc.g.m(f9);
                                } else {
                                    Object[] array = f9.toArray(new Object[0]);
                                    kotlin.jvm.internal.j.e(array, "<this>");
                                    if (array.length > 1) {
                                        Arrays.sort(array, o0Var);
                                    }
                                    asList = Arrays.asList(array);
                                    kotlin.jvm.internal.j.d(asList, "asList(...)");
                                }
                                for (Message message : asList) {
                                    if (((Messenger) sVar3.c) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) sVar3.c;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e10) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
                                            sVar3.J(message);
                                        }
                                    } else {
                                        sVar3.J(message);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return iVar2;
            case 3:
                tc.a aVar4 = tc.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    c7.b(obj);
                    k1.t tVar = (k1.t) this.c;
                    this.b = 1;
                    if (w8.a((List) obj3, tVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                }
                return iVar2;
            case 4:
                com.google.firebase.messaging.s sVar4 = (com.google.firebase.messaging.s) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) sVar4.e;
                tc.a aVar5 = tc.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    c7.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    jd.e0.h(((jd.c0) sVar4.b).c());
                    k1.o oVar3 = (k1.o) sVar4.c;
                    r10 = (ld.b) sVar4.d;
                    this.c = oVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = ld.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ld.b.g;
                    ld.h hVar4 = (ld.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(ld.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) ld.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i17 = od.v.a;
                    throw th2;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    sVar = sVar4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    sVar4 = sVar;
                    r82 = 1;
                    jd.e0.h(((jd.c0) sVar4.b).c());
                    k1.o oVar32 = (k1.o) sVar4.c;
                    r10 = (ld.b) sVar4.d;
                    this.c = oVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = ld.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ld.b.g;
                    ld.h hVar42 = (ld.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(ld.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = ld.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i18 = (int) (andIncrement % j10);
                        if (hVar42.c != j11) {
                            ld.h e11 = r10.e(j11, hVar42);
                            if (e11 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar42 = e11;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        ld.h hVar5 = hVar42;
                        Object o10 = r10.o(hVar5, i18, andIncrement, null);
                        fc.a aVar6 = ld.d.m;
                        if (o10 == aVar6) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        fc.a aVar7 = ld.d.o;
                        if (o10 != aVar7) {
                            iVar = iVar2;
                            if (o10 == ld.d.n) {
                                jd.m l10 = jd.e0.l(v7.b(this));
                                try {
                                    Object o11 = r10.o(hVar5, i18, andIncrement, l10);
                                    if (o11 != aVar6) {
                                        if (o11 != aVar7) {
                                            sVar = sVar4;
                                            oVar2 = oVar32;
                                            hVar5.b();
                                            l10.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar5.b();
                                            }
                                            ld.h hVar6 = (ld.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(ld.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = ld.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i19 = (int) (andIncrement2 % j12);
                                                sVar = sVar4;
                                                oVar2 = oVar32;
                                                if (hVar6.c == j13) {
                                                    hVar = hVar6;
                                                } else {
                                                    ld.h e12 = r10.e(j13, hVar6);
                                                    if (e12 == null) {
                                                        oVar32 = oVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        sVar4 = sVar;
                                                    } else {
                                                        hVar = e12;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i19, andIncrement2, l10);
                                                ld.h hVar7 = hVar;
                                                if (o12 == ld.d.m) {
                                                    l10.b(hVar7, i19);
                                                } else if (o12 == ld.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar7.b();
                                                    }
                                                    oVar32 = oVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar6 = hVar7;
                                                    sVar4 = sVar;
                                                } else {
                                                    if (o12 == ld.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar7.b();
                                                    l10.B(null, o12);
                                                }
                                            }
                                            Throwable th3 = (Throwable) ld.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new ld.i("Channel was closed");
                                            }
                                            l10.resumeWith(c7.a(th3));
                                        }
                                        obj2 = l10.r();
                                        tc.a aVar8 = tc.a.a;
                                    } else {
                                        l10.b(hVar5, i18);
                                    }
                                    sVar = sVar4;
                                    oVar2 = oVar32;
                                    obj2 = l10.r();
                                    tc.a aVar82 = tc.a.a;
                                } catch (Throwable th4) {
                                    l10.A();
                                    throw th4;
                                }
                            } else {
                                sVar = sVar4;
                                oVar2 = oVar32;
                                hVar5.b();
                                obj2 = o10;
                            }
                            if (obj2 != aVar5) {
                                oVar = oVar2;
                                this.c = null;
                                this.b = 2;
                                break;
                            }
                            return aVar5;
                        }
                        if (andIncrement < r10.g()) {
                            hVar5.b();
                        }
                        atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                        hVar42 = hVar5;
                        atomicInteger2 = atomicInteger;
                        r82 = 1;
                        atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                    }
                    th2 = (Throwable) ld.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new ld.i("Channel was closed");
                    }
                    int i172 = od.v.a;
                    throw th2;
                }
                oVar = (k1.o) this.c;
                c7.b(obj);
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                sVar = sVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            case 5:
                tc.a aVar9 = tc.a.a;
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                    return obj;
                }
                c7.b(obj);
                bd.p pVar = (bd.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar9 ? aVar9 : invoke;
            default:
                tc.a aVar10 = tc.a.a;
                int i21 = this.b;
                if (i21 == 0) {
                    c7.b(obj);
                    la.k kVar2 = (la.k) obj3;
                    md.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = md.n.b(data, this);
                    if (b12 == aVar10) {
                        return aVar10;
                    }
                    kVar = kVar2;
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (la.k) this.c;
                    c7.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                la.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
