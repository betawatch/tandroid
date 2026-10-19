package com.google.firebase.messaging;

import ai.n6;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.j0;
import androidx.fragment.app.m0;
import androidx.fragment.app.p0;
import be.f0;
import be.g1;
import be.j2;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ei.z3;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import z9.t0;
import z9.z0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class r {
    public static r f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ r(int i10, boolean z10) {
        this.a = i10;
    }

    public static final Message a(r rVar, ArrayList arrayList, int i10) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (((Message) obj2).what == i10) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    public static synchronized r j() {
        r rVar;
        synchronized (r.class) {
            try {
                if (f == null) {
                    f = new r(0);
                }
                rVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public void b(androidx.fragment.app.s sVar) {
        if (((ArrayList) this.b).contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(sVar);
        }
        sVar.v = true;
    }

    public t0 c() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.d) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.e) == null) {
            str = r4.c.u(str, " importance");
        }
        if (((Boolean) this.c) == null) {
            str = r4.c.u(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new t0((String) this.b, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public z0 d() {
        String str = ((Integer) this.d) == null ? " platform" : "";
        if (((String) this.b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.e) == null) {
            str = r4.c.u(str, " buildVersion");
        }
        if (((Boolean) this.c) == null) {
            str = r4.c.u(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.d).intValue(), (String) this.b, (String) this.e, ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public androidx.fragment.app.s e(String str) {
        p0 p0Var = (p0) ((HashMap) this.c).get(str);
        if (p0Var != null) {
            return p0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.s f(String str) {
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                androidx.fragment.app.s sVar = p0Var.c;
                if (!str.equals(sVar.e)) {
                    sVar = sVar.L.c.f(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var);
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (p0 p0Var : ((HashMap) this.c).values()) {
            if (p0Var != null) {
                arrayList.add(p0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List i() {
        ArrayList arrayList;
        if (((ArrayList) this.b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.b)) {
            arrayList = new ArrayList((ArrayList) this.b);
        }
        return arrayList;
    }

    public boolean k(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean l(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void m(p0 p0Var) {
        androidx.fragment.app.s sVar = p0Var.c;
        String str = sVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(sVar.e, p0Var);
        if (j0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + sVar);
        }
    }

    public void n(p0 p0Var) {
        HashMap hashMap = (HashMap) this.c;
        androidx.fragment.app.s sVar = p0Var.c;
        if (sVar.S) {
            ((m0) this.e).f(sVar);
        }
        if (hashMap.get(sVar.e) == p0Var && ((p0) hashMap.put(sVar.e, null)) != null && j0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020d  */
    /* JADX WARN: Type inference failed for: r2v19, types: [de.h, ge.d, ge.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(k1.k kVar) {
        de.b bVar;
        com.google.android.gms.internal.clearcut.e eVar;
        int i10;
        int i11;
        boolean z10;
        k1.k kVar2;
        de.h hVar;
        com.google.android.gms.internal.clearcut.e eVar2;
        long j10;
        boolean z11;
        int i12;
        int i13;
        Object obj;
        Object a2;
        long j11;
        de.h hVar2;
        k1.k kVar3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        de.c cVar;
        k1.k kVar4 = kVar;
        de.b bVar2 = (de.b) this.d;
        bVar2.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = de.b.b;
        boolean z12 = false;
        boolean z13 = true;
        long j12 = 1152921504606846975L;
        boolean z14 = bVar2.i(atomicLongFieldUpdater2.get(bVar2), false) ? false : !bVar2.a(r2 & 1152921504606846975L);
        Object obj2 = de.g.a;
        if (z14) {
            obj = obj2;
        } else {
            com.google.android.gms.internal.clearcut.e eVar3 = de.d.j;
            de.h hVar3 = (de.h) de.b.f.get(bVar2);
            while (true) {
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar2);
                long j13 = andIncrement & j12;
                boolean i14 = bVar2.i(andIncrement, z12);
                int i15 = de.d.b;
                long j14 = i15;
                long j15 = j12;
                long j16 = j13 / j14;
                int i16 = (int) (j13 % j14);
                if (hVar3.c != j16) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = de.b.c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = de.b.f;
                    de.h hVar4 = de.d.a;
                    de.c cVar2 = de.c.a;
                    while (true) {
                        a2 = ge.a.a(hVar3, j16, cVar2);
                        if (!ge.a.d(a2)) {
                            ge.t b10 = ge.a.b(a2);
                            while (true) {
                                ge.t tVar = (ge.t) atomicReferenceFieldUpdater.get(bVar2);
                                z10 = z13;
                                j11 = j16;
                                eVar = eVar3;
                                cVar = cVar2;
                                if (tVar.c >= b10.c) {
                                    break;
                                }
                                if (!b10.j()) {
                                    break;
                                }
                                while (!atomicReferenceFieldUpdater.compareAndSet(bVar2, tVar, b10)) {
                                    if (atomicReferenceFieldUpdater.get(bVar2) != tVar) {
                                        if (b10.f()) {
                                            b10.e();
                                        }
                                        eVar3 = eVar;
                                        z13 = z10;
                                        j16 = j11;
                                        cVar2 = cVar;
                                    }
                                }
                                if (tVar.f()) {
                                    tVar.e();
                                }
                            }
                        } else {
                            z10 = z13;
                            j11 = j16;
                            eVar = eVar3;
                            break;
                        }
                        eVar3 = eVar;
                        z13 = z10;
                        j16 = j11;
                        cVar2 = cVar;
                    }
                    if (ge.a.d(a2)) {
                        bVar2.c();
                        if (hVar3.c * de.d.b < atomicLongFieldUpdater3.get(bVar2)) {
                            hVar3.b();
                            de.h hVar5 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar5;
                            i10 = i15;
                            i11 = i16;
                            kVar3 = null;
                            kVar2 = null;
                            if (kVar3 == null) {
                                hVar = kVar3;
                            } else {
                                if (i14) {
                                    obj = new de.e(bVar.f());
                                    break;
                                }
                                de.b bVar3 = bVar;
                                hVar3 = hVar2;
                                bVar2 = bVar3;
                                eVar3 = eVar;
                                j12 = j15;
                                z13 = z10;
                                z12 = false;
                            }
                        } else {
                            de.h hVar6 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar6;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        }
                    } else {
                        ?? r22 = (de.h) ge.a.b(a2);
                        long j17 = r22.c;
                        if (j17 > j11) {
                            long j18 = de.d.b * j17;
                            AtomicLongFieldUpdater atomicLongFieldUpdater4 = de.b.b;
                            int i17 = i15;
                            int i18 = i16;
                            while (true) {
                                long j19 = atomicLongFieldUpdater4.get(bVar2);
                                long j20 = j19 & j15;
                                if (j20 >= j18) {
                                    de.h hVar7 = hVar3;
                                    bVar = bVar2;
                                    hVar2 = hVar7;
                                    atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                    i11 = i18;
                                    kVar2 = null;
                                    i10 = i17;
                                    break;
                                }
                                de.b bVar4 = bVar2;
                                long j21 = j18;
                                AtomicLongFieldUpdater atomicLongFieldUpdater5 = atomicLongFieldUpdater4;
                                i11 = i18;
                                kVar2 = null;
                                i10 = i17;
                                hVar2 = hVar3;
                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                bVar = bVar4;
                                if (de.b.b.compareAndSet(bVar, j19, (((int) (j19 >> 60)) << 60) + j20)) {
                                    break;
                                }
                                hVar3 = hVar2;
                                bVar2 = bVar;
                                atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                i17 = i10;
                                atomicLongFieldUpdater4 = atomicLongFieldUpdater5;
                                i18 = i11;
                                j18 = j21;
                            }
                            if (j17 * de.d.b < atomicLongFieldUpdater.get(bVar)) {
                                r22.b();
                            }
                            kVar3 = kVar2;
                            if (kVar3 == null) {
                            }
                        } else {
                            de.h hVar8 = hVar3;
                            bVar = bVar2;
                            hVar2 = hVar8;
                            i10 = i15;
                            i11 = i16;
                            kVar2 = null;
                            kVar3 = r22;
                            if (kVar3 == null) {
                            }
                        }
                    }
                } else {
                    de.h hVar9 = hVar3;
                    bVar = bVar2;
                    eVar = eVar3;
                    i10 = i15;
                    i11 = i16;
                    z10 = z13;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i14) {
                    bVar2 = bVar;
                    eVar2 = eVar;
                    j10 = j13;
                    z11 = i14;
                    i12 = 5;
                    i13 = bVar2.p(hVar, i11, kVar4, j10, eVar2, z11);
                } else {
                    bVar2 = bVar;
                    eVar2 = eVar;
                    j10 = j13;
                    z11 = i14;
                    k1.k kVar5 = kVar2;
                    i12 = 5;
                    Object l4 = hVar.l(i11);
                    if (l4 == null) {
                        if (bVar2.a(j10)) {
                            if (hVar.k(i11, kVar5, de.d.d)) {
                                z13 = z10;
                                i13 = z13;
                                Object obj3 = id.i.a;
                                if (i13 == 0) {
                                    hVar.b();
                                    break;
                                }
                                if (i13 == z13) {
                                    break;
                                }
                                if (i13 != 2) {
                                    if (i13 == 3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    if (i13 != 4) {
                                        if (i13 == i12) {
                                            hVar.b();
                                        }
                                        kVar4 = kVar;
                                        hVar3 = hVar;
                                        eVar3 = eVar2;
                                        j12 = j15;
                                        z12 = false;
                                    } else {
                                        if (j10 < de.b.c.get(bVar2)) {
                                            hVar.b();
                                        }
                                        obj = new de.e(bVar2.f());
                                    }
                                } else if (z11) {
                                    hVar.i();
                                    obj = new de.e(bVar2.f());
                                } else {
                                    j2 j2Var = eVar2 instanceof j2 ? (j2) eVar2 : null;
                                    if (j2Var != null) {
                                        j2Var.a(hVar, i11 + i10);
                                    }
                                    hVar.i();
                                    obj = obj2;
                                }
                            }
                        } else if (eVar2 == null) {
                            i13 = 3;
                        } else if (hVar.k(i11, kVar5, eVar2)) {
                            i13 = 2;
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j10, eVar2, z11);
                        Object obj32 = id.i.a;
                        if (i13 == 0) {
                        }
                    } else {
                        if (l4 instanceof j2) {
                            hVar.n(i11, kVar5);
                            if (bVar2.m(l4, kVar4)) {
                                hVar.o(i11, de.d.i);
                                z13 = z10;
                                i13 = 0;
                            } else {
                                com.google.android.gms.internal.clearcut.e eVar4 = de.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, eVar4) != eVar4) {
                                    z13 = z10;
                                    hVar.m(i11, z13);
                                } else {
                                    z13 = z10;
                                }
                                i13 = 5;
                            }
                            Object obj322 = id.i.a;
                            if (i13 == 0) {
                            }
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j10, eVar2, z11);
                        Object obj3222 = id.i.a;
                        if (i13 == 0) {
                        }
                    }
                }
                z13 = z10;
                Object obj32222 = id.i.a;
                if (i13 == 0) {
                }
            }
        }
        i12 = 5;
        if (obj instanceof de.e) {
            Throwable th2 = ((de.e) obj).a;
            if (th2 != null) {
                throw th2;
            }
            throw new b2.z("Channel was closed normally");
        }
        if (obj instanceof de.f) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            f0.q((be.c0) this.b, new ab.l(this, null, i12));
        }
    }

    public df.f p(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        af.h hVar = new af.h((ArrayList) this.b, (ef.b) this.d, (ArrayList) this.c);
        int i10 = 0;
        while (true) {
            int length = str.length();
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                char charAt = str.charAt(i11);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                break;
            }
            hVar.i(str.substring(i10, i11));
            i10 = i11 + 1;
            if (i10 < str.length() && str.charAt(i11) == '\r' && str.charAt(i10) == '\n') {
                i10 = i11 + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            hVar.i(str.substring(i10));
        }
        hVar.f(hVar.n);
        ef.a y3 = hVar.j.y(new qf.b(3, hVar.k, hVar.m));
        Iterator it = hVar.o.iterator();
        while (it.hasNext()) {
            ((ff.a) it.next()).g(y3);
        }
        df.f fVar = (df.f) hVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (it2.hasNext()) {
            throw a1.g.j(it2);
        }
        return fVar;
    }

    public void q(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public void r(int i10) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i10, 0, 0);
        kotlin.jvm.internal.i.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        f0.q(f0.b((kd.h) this.b), new ab.l(this, arrayList, null, 2));
    }

    public Bundle s(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        return bundle != null ? (Bundle) hashMap.put(str, bundle) : (Bundle) hashMap.remove(str);
    }

    public void t(View view) {
        n6 n6Var = (n6) this.e;
        if (((View) this.c) == view) {
            return;
        }
        u(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(n6Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(n6Var);
            if (view.isAttachedToWindow()) {
                u(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((te.b) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void u(ViewTreeObserver viewTreeObserver) {
        z3 z3Var = (z3) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(z3Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(z3Var);
        }
        this.d = viewTreeObserver;
    }

    public Task v(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new te.b(callable, 6));
            this.c = continueWith.continueWith((Executor) this.b, new rb.b(26));
        }
        return continueWith;
    }

    public Task w(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new te.b(callable, 6));
            this.c = continueWithTask.continueWith((Executor) this.b, new rb.b(26));
        }
        return continueWithTask;
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public r(z3 z3Var) {
        this.a = 11;
        this.e = new n6(this, 12);
        this.b = z3Var;
    }

    public r(be.c0 c0Var, k1.m mVar, k1.n nVar) {
        this.a = 5;
        this.b = c0Var;
        this.c = nVar;
        de.a[] aVarArr = de.a.a;
        this.d = new de.b(ConnectionsManager.DEFAULT_DATACENTER_ID);
        this.e = new AtomicInteger(0);
        g1 g1Var = (g1) c0Var.c().get(be.b0.b);
        if (g1Var == null) {
            return;
        }
        g1Var.invokeOnCompletion(new ce.d(1, mVar, this));
    }

    public r(z5 z5Var) {
        int i10 = 3;
        this.a = 3;
        ArrayList arrayList = (ArrayList) z5Var.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) z5Var.d;
        LinkedHashSet linkedHashSet2 = af.h.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(af.h.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        ef.b bVar = (n4.s) z5Var.e;
        bVar = bVar == null ? new pb.a(8) : bVar;
        this.d = bVar;
        this.e = (ArrayList) z5Var.a;
        ArrayList arrayList3 = (ArrayList) z5Var.c;
        this.c = arrayList3;
        bVar.y(new qf.b(i10, arrayList3, Collections.EMPTY_MAP));
    }

    public r(kd.h hVar) {
        this.a = 1;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new a9.d(this, 1);
    }

    public r(ExecutorService executorService) {
        this.a = 12;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new p8.b(this, 10));
    }

    public r(te.b bVar, Object obj, Object obj2, Object[] objArr) {
        this.a = 10;
        this.e = bVar;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public r(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new ArrayList();
                this.c = new HashMap();
                this.d = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public r(lg.e eVar) {
        this.a = 6;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.e = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = AndroidUtilities.dp(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.c = textView2;
        linearLayout.addView(textView2, w7.z5.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(eVar.getContext());
        this.b = z5Var;
        linearLayout.addView(z5Var, w7.z5.n(-1, -2));
        textView2.setGravity(8388611);
        z5Var.setGravity(8388613);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
