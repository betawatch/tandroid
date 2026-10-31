package bb;

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
import v7.w6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l extends ed.j implements ld.p {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = obj;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.a) {
            case 0:
                return new l((m) this.c, (cd.h) this.d, cVar, 0);
            case 1:
                return new l((c0) this.c, (String) this.d, cVar, 1);
            case 2:
                return new l((ji.f) this.c, (ArrayList) this.d, cVar, 2);
            case 3:
                return new l((db.k) this.d, cVar, 3);
            case 4:
                l lVar = new l((List) this.d, cVar, 4);
                lVar.c = obj;
                return lVar;
            case 5:
                return new l((ji.f) this.d, cVar, 5);
            default:
                return new l((ld.p) this.c, this.d, cVar, 6);
        }
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((l) create((td.c0) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x044f, code lost:
    
        if (r2.b(r19) == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0416, code lost:
    
        if (r5 == r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d4, code lost:
    
        if (r7.invoke(r0, r19) != r4) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, vd.b] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d4 -> B:19:0x01d8). Please report as a decompilation issue!!! */
    @Override // ed.a
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
        ad.j jVar;
        AtomicInteger atomicInteger;
        ji.f fVar;
        k1.n nVar;
        Object obj2;
        ?? r10;
        Throwable th2;
        k1.n nVar2;
        vd.h hVar;
        int i10 = this.a;
        int i11 = 0;
        ad.j jVar2 = ad.j.a;
        Object obj3 = this.d;
        ?? r82 = 1;
        switch (i10) {
            case 0:
                m mVar = (m) this.c;
                db.h hVar2 = mVar.b;
                dd.a aVar = dd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    l9.b.b(obj);
                    cb.c cVar = cb.c.a;
                    this.b = 1;
                    b10 = cVar.b(this);
                    break;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l9.b.b(obj);
                        Boolean r11 = hVar2.a.r();
                        if (r11 != null) {
                            booleanValue = r11.booleanValue();
                        } else {
                            Boolean a2 = hVar2.b.a();
                            booleanValue = a2 != null ? a2.booleanValue() : true;
                        }
                        if (booleanValue) {
                            cd.h hVar3 = (cd.h) obj3;
                            ji.f fVar2 = new ji.f(hVar3);
                            Object b13 = l9.h.c().b(q0.class);
                            kotlin.jvm.internal.i.d(b13, "Firebase.app[SessionLife…erviceBinder::class.java]");
                            Messenger messenger = new Messenger(new android.support.v4.media.session.q(hVar3));
                            a9.d serviceConnection = (a9.d) fVar2.e;
                            kotlin.jvm.internal.i.e(serviceConnection, "serviceConnection");
                            l9.h hVar4 = ((r0) ((q0) b13)).a;
                            hVar4.a();
                            Context applicationContext = hVar4.a.getApplicationContext();
                            Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
                            Log.d("LifecycleServiceBinder", "Binding service to application.");
                            intent.setAction(String.valueOf(Process.myPid()));
                            intent.putExtra("ClientCallbackMessenger", messenger);
                            applicationContext.bindService(intent, serviceConnection, 65);
                            s0.c = fVar2;
                            if (s0.b) {
                                s0.b = false;
                                fVar2.u(1);
                            }
                            l9.h hVar5 = mVar.a;
                            aa.a aVar2 = new aa.a(20);
                            hVar5.a();
                            hVar5.j.add(aVar2);
                        } else {
                            Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                        }
                        return jVar2;
                    }
                    l9.b.b(obj);
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
                return jVar2;
            case 1:
                dd.a aVar3 = dd.a.a;
                int i13 = this.b;
                if (i13 == 0) {
                    l9.b.b(obj);
                    w wVar = c0.e;
                    Context context = ((c0) this.c).a;
                    wVar.getClass();
                    k2.m0 a10 = c0.f.a(context, w.a[0]);
                    b0 b0Var = new b0((String) obj3, null, i11);
                    this.b = 1;
                    if (a10.d(new n1.c(b0Var, null, 1), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                }
                return jVar2;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                ji.f fVar3 = (ji.f) this.c;
                dd.a aVar4 = dd.a.a;
                int i14 = this.b;
                if (i14 == 0) {
                    l9.b.b(obj);
                    cb.c cVar2 = cb.c.a;
                    this.b = 1;
                    b11 = cVar2.b(this);
                    if (b11 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
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
                                ArrayList f7 = bd.i.f(new ArrayList(new bd.f(new Message[]{ji.f.a(fVar3, arrayList, 2), ji.f.a(fVar3, arrayList, 1)}, true)));
                                o0 o0Var = new o0();
                                if (f7.size() <= 1) {
                                    asList = bd.i.m(f7);
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
                                    if (((Messenger) fVar3.c) != null) {
                                        try {
                                            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                            Messenger messenger2 = (Messenger) fVar3.c;
                                            if (messenger2 != null) {
                                                messenger2.send(message);
                                            }
                                        } catch (RemoteException e) {
                                            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e);
                                            fVar3.s(message);
                                        }
                                    } else {
                                        fVar3.s(message);
                                    }
                                }
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
                return jVar2;
            case 3:
                dd.a aVar5 = dd.a.a;
                int i15 = this.b;
                if (i15 == 0) {
                    l9.b.b(obj);
                    db.k kVar2 = (db.k) obj3;
                    wd.b data = kVar2.a.getData();
                    this.c = kVar2;
                    this.b = 1;
                    b12 = wd.n.b(data, this);
                    if (b12 == aVar5) {
                        return aVar5;
                    }
                    kVar = kVar2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (db.k) this.c;
                    l9.b.b(obj);
                    b12 = obj;
                }
                Map unmodifiableMap = DesugarCollections.unmodifiableMap(((n1.b) b12).a);
                kotlin.jvm.internal.i.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
                db.k.a(kVar, new n1.b(new LinkedHashMap(unmodifiableMap), true));
                return jVar2;
            case 4:
                dd.a aVar6 = dd.a.a;
                int i16 = this.b;
                if (i16 == 0) {
                    l9.b.b(obj);
                    k1.s sVar = (k1.s) this.c;
                    this.b = 1;
                    if (w7.g.a((List) obj3, sVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                }
                return jVar2;
            case 5:
                ji.f fVar4 = (ji.f) obj3;
                AtomicInteger atomicInteger2 = (AtomicInteger) fVar4.e;
                dd.a aVar7 = dd.a.a;
                int i17 = this.b;
                if (i17 == 0) {
                    l9.b.b(obj);
                    if (atomicInteger2.get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    td.e0.h(((td.c0) fVar4.b).c());
                    k1.n nVar3 = (k1.n) fVar4.c;
                    r10 = (vd.b) fVar4.d;
                    this.c = nVar3;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = vd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vd.b.g;
                    vd.h hVar6 = (vd.h) atomicReferenceFieldUpdater.get(r10);
                    while (!r10.i(vd.b.b.get(r10), r82)) {
                    }
                    th2 = (Throwable) vd.b.i.get(r10);
                    if (th2 == null) {
                    }
                    int i18 = yd.u.a;
                    throw th2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                    atomicInteger = atomicInteger2;
                    jVar = jVar2;
                    fVar = fVar4;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return jVar;
                    }
                    fVar4 = fVar;
                    atomicInteger2 = atomicInteger;
                    jVar2 = jVar;
                    r82 = 1;
                    td.e0.h(((td.c0) fVar4.b).c());
                    k1.n nVar32 = (k1.n) fVar4.c;
                    r10 = (vd.b) fVar4.d;
                    this.c = nVar32;
                    this.b = r82;
                    r10.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = vd.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vd.b.g;
                    vd.h hVar62 = (vd.h) atomicReferenceFieldUpdater2.get(r10);
                    while (!r10.i(vd.b.b.get(r10), r82)) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(r10);
                        long j10 = vd.d.b;
                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                        long j11 = andIncrement / j10;
                        int i19 = (int) (andIncrement % j10);
                        if (hVar62.c != j11) {
                            vd.h e7 = r10.e(j11, hVar62);
                            if (e7 == null) {
                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                r82 = 1;
                            } else {
                                hVar62 = e7;
                            }
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        vd.h hVar7 = hVar62;
                        Object o10 = r10.o(hVar7, i19, andIncrement, null);
                        ea.a aVar8 = vd.d.m;
                        if (o10 == aVar8) {
                            throw new IllegalStateException("unexpected");
                        }
                        atomicInteger = atomicInteger2;
                        ea.a aVar9 = vd.d.o;
                        if (o10 != aVar9) {
                            jVar = jVar2;
                            if (o10 == vd.d.n) {
                                td.m l4 = td.e0.l(w6.b(this));
                                try {
                                    Object o11 = r10.o(hVar7, i19, andIncrement, l4);
                                    if (o11 != aVar8) {
                                        if (o11 != aVar9) {
                                            fVar = fVar4;
                                            nVar2 = nVar32;
                                            hVar7.b();
                                            l4.B(null, o11);
                                        } else {
                                            if (andIncrement < r10.g()) {
                                                hVar7.b();
                                            }
                                            vd.h hVar8 = (vd.h) atomicReferenceFieldUpdater3.get(r10);
                                            while (!r10.i(vd.b.b.get(r10), true)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
                                                long andIncrement2 = atomicLongFieldUpdater4.getAndIncrement(r10);
                                                long j12 = vd.d.b;
                                                long j13 = andIncrement2 / j12;
                                                int i20 = (int) (andIncrement2 % j12);
                                                fVar = fVar4;
                                                nVar2 = nVar32;
                                                if (hVar8.c == j13) {
                                                    hVar = hVar8;
                                                } else {
                                                    vd.h e10 = r10.e(j13, hVar8);
                                                    if (e10 == null) {
                                                        nVar32 = nVar2;
                                                        atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                        fVar4 = fVar;
                                                    } else {
                                                        hVar = e10;
                                                    }
                                                }
                                                Object o12 = r10.o(hVar, i20, andIncrement2, l4);
                                                vd.h hVar9 = hVar;
                                                if (o12 == vd.d.m) {
                                                    l4.a(hVar9, i20);
                                                } else if (o12 == vd.d.o) {
                                                    if (andIncrement2 < r10.g()) {
                                                        hVar9.b();
                                                    }
                                                    nVar32 = nVar2;
                                                    atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
                                                    hVar8 = hVar9;
                                                    fVar4 = fVar;
                                                } else {
                                                    if (o12 == vd.d.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hVar9.b();
                                                    l4.B(null, o12);
                                                }
                                            }
                                            Throwable th3 = (Throwable) vd.b.i.get(r10);
                                            if (th3 == null) {
                                                th3 = new vd.i("Channel was closed");
                                            }
                                            l4.resumeWith(l9.b.a(th3));
                                        }
                                        obj2 = l4.r();
                                        dd.a aVar10 = dd.a.a;
                                    } else {
                                        l4.a(hVar7, i19);
                                    }
                                    fVar = fVar4;
                                    nVar2 = nVar32;
                                    obj2 = l4.r();
                                    dd.a aVar102 = dd.a.a;
                                } catch (Throwable th4) {
                                    l4.A();
                                    throw th4;
                                }
                            } else {
                                fVar = fVar4;
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
                    th2 = (Throwable) vd.b.i.get(r10);
                    if (th2 == null) {
                        th2 = new vd.i("Channel was closed");
                    }
                    int i182 = yd.u.a;
                    throw th2;
                }
                nVar = (k1.n) this.c;
                l9.b.b(obj);
                atomicInteger = atomicInteger2;
                jVar = jVar2;
                fVar = fVar4;
                obj2 = obj;
                this.c = null;
                this.b = 2;
            default:
                dd.a aVar11 = dd.a.a;
                int i21 = this.b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                    return obj;
                }
                l9.b.b(obj);
                ld.p pVar = (ld.p) this.c;
                this.b = 1;
                Object invoke = pVar.invoke(obj3, this);
                return invoke == aVar11 ? aVar11 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, cd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
        this.d = obj2;
    }
}
