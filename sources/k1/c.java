package k1;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import j$.util.DesugarCollections;
import j7.s8;
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
import k7.g8;
import k7.p7;
import la.l0;
import la.n0;
import la.o0;
import la.p0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends wc.i implements dd.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dd.p pVar, Object obj, uc.c cVar) {
        super(2, cVar);
        this.a = 2;
        this.d = pVar;
        this.c = obj;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c((List) this.d, cVar, 0);
                cVar2.c = obj;
                return cVar2;
            case 1:
                return new c((com.google.firebase.messaging.r) this.d, cVar, 1);
            case 2:
                return new c((dd.p) this.d, this.c, cVar);
            case 3:
                return new c((la.l) this.c, (uc.h) this.d, cVar, 3);
            case 4:
                return new c((la.z) this.c, (String) this.d, cVar, 4);
            case 5:
                return new c((rf.f) this.c, (ArrayList) this.d, cVar, 5);
            default:
                return new c((na.k) this.d, cVar, 6);
        }
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((c) create((ld.c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x020f, code lost:
    
        if (r2.b(r21) == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d7, code lost:
    
        if (r7 == r9) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x047e, code lost:
    
        if (r7.invoke(r0, r21) != r2) goto L199;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a7  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, nd.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x047e -> B:121:0x0482). Please report as a decompilation issue!!! */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vc.a aVar;
        sc.i iVar;
        AtomicInteger atomicInteger;
        p pVar;
        Object obj2;
        Object obj3;
        ?? r10;
        Throwable th2;
        nd.h hVar;
        Object b10;
        boolean booleanValue;
        Object b11;
        List<Message> asList;
        Object b12;
        na.k kVar;
        int i10 = this.a;
        uc.c cVar = null;
        sc.i iVar2 = sc.i.a;
        Object obj4 = this.d;
        ?? r82 = 1;
        ?? r83 = 1;
        switch (i10) {
            case 0:
                vc.a aVar2 = vc.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    p7.b(obj);
                    w wVar = (w) this.c;
                    this.b = 1;
                    if (s8.a((List) obj4, wVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                }
                return iVar2;
            case 1:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) obj4;
                AtomicInteger atomicInteger2 = (AtomicInteger) rVar.d;
                vc.a aVar3 = vc.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    p7.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    ld.e0.h(((ld.c0) rVar.a).c());
                    pVar = (p) rVar.b;
                    r10 = (nd.b) rVar.c;
                    this.c = pVar;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = nd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nd.b.g;
                    nd.h hVar2 = (nd.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(nd.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) nd.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i13 = qd.u.a;
                    throw th2;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                    obj2 = null;
                    aVar = aVar3;
                    atomicInteger = atomicInteger2;
                    iVar = iVar2;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return iVar;
                    }
                    aVar3 = aVar;
                    atomicInteger2 = atomicInteger;
                    iVar2 = iVar;
                    r82 = 1;
                    ld.e0.h(((ld.c0) rVar.a).c());
                    pVar = (p) rVar.b;
                    r10 = (nd.b) rVar.c;
                    this.c = pVar;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = nd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nd.b.g;
                    nd.h hVar22 = (nd.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(nd.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        vc.a aVar4 = aVar3;
                        long j10 = nd.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i14 = (int) (andIncrement % j10);
                        sc.i iVar3 = iVar2;
                        if (hVar22.c != j11) {
                            nd.h e = r10.e(j11, hVar22);
                            if (e == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                iVar2 = iVar3;
                                aVar3 = aVar4;
                                r82 = 1;
                            } else {
                                hVar22 = e;
                            }
                        }
                        nd.h hVar3 = hVar22;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        String str = "Channel was closed";
                        Object o10 = r10.o(hVar3, i14, andIncrement, null);
                        o3.c cVar2 = nd.d.m;
                        if (o10 == cVar2) {
                            throw new IllegalStateException("unexpected");
                        }
                        o3.c cVar3 = nd.d.o;
                        if (o10 != cVar3) {
                            atomicInteger = atomicInteger2;
                            if (o10 == nd.d.n) {
                                ld.m l10 = ld.e0.l(g8.b(this));
                                try {
                                    Object o11 = r10.o(hVar3, i14, andIncrement, l10);
                                    if (o11 != cVar2) {
                                        if (o11 != cVar3) {
                                            iVar = iVar3;
                                            hVar3.b();
                                            l10.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar3.b();
                                            }
                                            nd.h hVar4 = (nd.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(nd.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = nd.d.b;
                                                String str2 = str;
                                                long j13 = andIncrement2 / j12;
                                                int i15 = (int) (andIncrement2 % j12);
                                                iVar = iVar3;
                                                atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                if (hVar4.c == j13) {
                                                    hVar = hVar4;
                                                } else {
                                                    nd.h e6 = r10.e(j13, hVar4);
                                                    if (e6 == null) {
                                                        continue;
                                                        str = str2;
                                                        iVar3 = iVar;
                                                    } else {
                                                        hVar = e6;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i15, andIncrement2, l10);
                                                nd.h hVar5 = hVar;
                                                if (o12 == nd.d.m) {
                                                    l10.a(hVar5, i15);
                                                } else if (o12 == nd.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar5.b();
                                                    }
                                                    hVar4 = hVar5;
                                                    str = str2;
                                                    iVar3 = iVar;
                                                } else {
                                                    if (o12 == nd.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar5.b();
                                                    l10.B(null, o12);
                                                }
                                            }
                                            Throwable th3 = (Throwable) nd.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new nd.i(str);
                                            }
                                            l10.resumeWith(p7.a(th3));
                                        }
                                        obj3 = l10.r();
                                        vc.a aVar5 = vc.a.a;
                                    } else {
                                        l10.a(hVar3, i14);
                                    }
                                    iVar = iVar3;
                                    obj3 = l10.r();
                                    vc.a aVar52 = vc.a.a;
                                } catch (Throwable th4) {
                                    l10.A();
                                    throw th4;
                                }
                            } else {
                                iVar = iVar3;
                                hVar3.b();
                                obj3 = o10;
                            }
                            aVar = aVar4;
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
                        aVar3 = aVar4;
                    }
                    th2 = (Throwable) nd.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new nd.i("Channel was closed");
                    }
                    int i132 = qd.u.a;
                    throw th2;
                }
                pVar = (p) this.c;
                p7.b(obj);
                obj2 = null;
                aVar = aVar3;
                atomicInteger = atomicInteger2;
                iVar = iVar2;
                obj3 = obj;
                this.c = obj2;
                this.b = 2;
            case 2:
                vc.a aVar6 = vc.a.a;
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                    return obj;
                }
                p7.b(obj);
                Object obj5 = this.c;
                this.b = 1;
                Object invoke = ((dd.p) obj4).invoke(obj5, this);
                return invoke == aVar6 ? aVar6 : invoke;
            case 3:
                la.l lVar = (la.l) this.c;
                na.h hVar6 = lVar.b;
                vc.a aVar7 = vc.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    p7.b(obj);
                    ma.c cVar4 = ma.c.a;
                    this.b = 1;
                    b10 = cVar4.b(this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p7.b(obj);
                        Boolean b13 = hVar6.a.b();
                        if (b13 != null) {
                            booleanValue = b13.booleanValue();
                        } else {
                            Boolean a2 = hVar6.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (!booleanValue) {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                            return iVar2;
                        }
                        uc.h hVar7 = (uc.h) obj4;
                        rf.f fVar = new rf.f(hVar7);
                        Object b14 = w8.g.c().b(n0.class);
                        kotlin.jvm.internal.j.d(b14, "Firebase.app[SessionLife…erviceBinder::class.java]");
                        Messenger messenger = new Messenger(new androidx.mediarouter.app.d(hVar7));
                        hf.a serviceConnection = (hf.a) fVar.e;
                        kotlin.jvm.internal.j.e(serviceConnection, "serviceConnection");
                        w8.g gVar = ((o0) ((n0) b14)).a;
                        gVar.a();
                        Context applicationContext = gVar.a.getApplicationContext();
                        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                        Log.d("LifecycleServiceBinder", "Binding service to application.");
                        intent.setAction(String.valueOf(Process.myPid()));
                        intent.putExtra("ClientCallbackMessenger", messenger);
                        applicationContext.bindService(intent, serviceConnection, 65);
                        p0.c = fVar;
                        if (p0.b) {
                            p0.b = false;
                            fVar.F(1);
                        }
                        w8.g gVar2 = lVar.a;
                        k3.e eVar = new k3.e(20);
                        gVar2.a();
                        gVar2.j.add(eVar);
                        return iVar2;
                    }
                    p7.b(obj);
                    b10 = obj;
                }
                Collection values = ((Map) b10).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((i9.k) it.next()).a.a()) {
                            this.b = 2;
                            break;
                        }
                    }
                }
                Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
                return iVar2;
            case 4:
                vc.a aVar8 = vc.a.a;
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                    return iVar2;
                }
                p7.b(obj);
                la.v vVar = la.z.e;
                Context context = ((la.z) this.c).a;
                vVar.getClass();
                bb.b a10 = la.z.f.a(context, la.v.a[0]);
                q qVar = new q((String) obj4, cVar, r83 == true ? 1 : 0);
                this.b = 1;
                return a10.C(new n1.c(qVar, null, 1), this) == aVar8 ? aVar8 : iVar2;
            case 5:
                ArrayList arrayList = (ArrayList) obj4;
                rf.f fVar2 = (rf.f) this.c;
                vc.a aVar9 = vc.a.a;
                int i19 = this.b;
                if (i19 == 0) {
                    p7.b(obj);
                    ma.c cVar5 = ma.c.a;
                    this.b = 1;
                    b11 = cVar5.b(this);
                    if (b11 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p7.b(obj);
                    b11 = obj;
                }
                Map map = (Map) b11;
                if (map.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return iVar2;
                }
                Collection values2 = map.values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    Iterator it2 = values2.iterator();
                    while (it2.hasNext()) {
                        if (((i9.k) it2.next()).a.a()) {
                            ArrayList f10 = tc.g.f(new ArrayList(new tc.d(new Message[]{rf.f.k(fVar2, arrayList, 2), rf.f.k(fVar2, arrayList, 1)}, true)));
                            l0 l0Var = new l0();
                            if (f10.size() <= 1) {
                                asList = tc.g.m(f10);
                            } else {
                                Object[] array = f10.toArray(new Object[0]);
                                kotlin.jvm.internal.j.e(array, "<this>");
                                if (array.length > 1) {
                                    Arrays.sort(array, l0Var);
                                }
                                asList = Arrays.asList(array);
                                kotlin.jvm.internal.j.d(asList, "asList(...)");
                            }
                            for (Message message : asList) {
                                if (((Messenger) fVar2.c) != null) {
                                    try {
                                        Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                        Messenger messenger2 = (Messenger) fVar2.c;
                                        if (messenger2 != null) {
                                            messenger2.send(message);
                                        }
                                    } catch (RemoteException e10) {
                                        Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e10);
                                        fVar2.E(message);
                                    }
                                } else {
                                    fVar2.E(message);
                                }
                            }
                            return iVar2;
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                return iVar2;
            default:
                vc.a aVar10 = vc.a.a;
                int i20 = this.b;
                if (i20 == 0) {
                    p7.b(obj);
                    na.k kVar2 = (na.k) obj4;
                    od.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = od.n.b(data, this);
                    if (b12 == aVar10) {
                        return aVar10;
                    }
                    kVar = kVar2;
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (na.k) this.c;
                    p7.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.j.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                na.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return iVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }
}
