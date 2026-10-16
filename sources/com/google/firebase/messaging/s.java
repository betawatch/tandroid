package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import be.f0;
import be.g1;
import be.j2;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import di.f4;
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
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.a6;
import p4.s0;
import z9.t0;
import z9.z0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class s {
    public static s f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public static final Message a(s sVar, ArrayList arrayList, int i10) {
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

    public static synchronized s j() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f == null) {
                    f = new s(0);
                }
                sVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public void b(androidx.fragment.app.r rVar) {
        if (((ArrayList) this.b).contains(rVar)) {
            throw new IllegalStateException("Fragment already added: " + rVar);
        }
        synchronized (((ArrayList) this.b)) {
            ((ArrayList) this.b).add(rVar);
        }
        rVar.v = true;
    }

    public t0 c() {
        String str = ((String) this.b) == null ? " processName" : "";
        if (((Integer) this.d) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.e) == null) {
            str = t8.b.u(str, " importance");
        }
        if (((Boolean) this.c) == null) {
            str = t8.b.u(str, " defaultProcess");
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
            str = t8.b.u(str, " buildVersion");
        }
        if (((Boolean) this.c) == null) {
            str = t8.b.u(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new z0(((Integer) this.d).intValue(), (String) this.b, (String) this.e, ((Boolean) this.c).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public androidx.fragment.app.r e(String str) {
        o0 o0Var = (o0) ((HashMap) this.c).get(str);
        if (o0Var != null) {
            return o0Var.c;
        }
        return null;
    }

    public androidx.fragment.app.r f(String str) {
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                androidx.fragment.app.r rVar = o0Var.c;
                if (!str.equals(rVar.e)) {
                    rVar = rVar.L.c.f(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.c);
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

    public void m(o0 o0Var) {
        androidx.fragment.app.r rVar = o0Var.c;
        String str = rVar.e;
        HashMap hashMap = (HashMap) this.c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void n(o0 o0Var) {
        HashMap hashMap = (HashMap) this.c;
        androidx.fragment.app.r rVar = o0Var.c;
        if (rVar.S) {
            ((l0) this.e).f(rVar);
        }
        if (hashMap.get(rVar.e) == o0Var && ((o0) hashMap.put(rVar.e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
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
        a6.i iVar;
        int i10;
        int i11;
        boolean z10;
        k1.k kVar2;
        de.h hVar;
        a6.i iVar2;
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
            a6.i iVar3 = de.d.j;
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
                                iVar = iVar3;
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
                                        iVar3 = iVar;
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
                            iVar = iVar3;
                            break;
                        }
                        iVar3 = iVar;
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
                                iVar3 = iVar;
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
                    iVar = iVar3;
                    i10 = i15;
                    i11 = i16;
                    z10 = z13;
                    kVar2 = null;
                    hVar = hVar9;
                }
                hVar.n(i11, kVar4);
                if (i14) {
                    bVar2 = bVar;
                    iVar2 = iVar;
                    j10 = j13;
                    z11 = i14;
                    i12 = 5;
                    i13 = bVar2.p(hVar, i11, kVar4, j10, iVar2, z11);
                } else {
                    bVar2 = bVar;
                    iVar2 = iVar;
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
                                        iVar3 = iVar2;
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
                                    j2 j2Var = iVar2 instanceof j2 ? (j2) iVar2 : null;
                                    if (j2Var != null) {
                                        j2Var.a(hVar, i11 + i10);
                                    }
                                    hVar.i();
                                    obj = obj2;
                                }
                            }
                        } else if (iVar2 == null) {
                            i13 = 3;
                        } else if (hVar.k(i11, kVar5, iVar2)) {
                            i13 = 2;
                        }
                        z13 = z10;
                        i13 = bVar2.p(hVar, i11, kVar4, j10, iVar2, z11);
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
                                a6.i iVar4 = de.d.k;
                                if (hVar.f.getAndSet((i11 * 2) + 1, iVar4) != iVar4) {
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
                        i13 = bVar2.p(hVar, i11, kVar4, j10, iVar2, z11);
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
            throw new b2.a0("Channel was closed normally");
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
        ef.a F = hVar.j.F(new qf.b(3, hVar.k, hVar.m));
        Iterator it = hVar.o.iterator();
        while (it.hasNext()) {
            ((ff.a) it.next()).g(F);
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
        bi.j2 j2Var = (bi.j2) this.e;
        if (((View) this.c) == view) {
            return;
        }
        u(null);
        View view2 = (View) this.c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(j2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(j2Var);
            if (view.isAttachedToWindow()) {
                u(view.getViewTreeObserver());
            }
        }
        this.c = view;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((w4) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void u(ViewTreeObserver viewTreeObserver) {
        f4 f4Var = (f4) this.b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(f4Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(f4Var);
        }
        this.d = viewTreeObserver;
    }

    public Task v(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new v0.k(callable));
            this.c = continueWith.continueWith((Executor) this.b, new rb.b(26));
        }
        return continueWith;
    }

    public Task w(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new v0.k(callable));
            this.c = continueWithTask.continueWith((Executor) this.b, new rb.b(26));
        }
        return continueWithTask;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s(f4 f4Var) {
        this.a = 11;
        this.e = new bi.j2(this, 11);
        this.b = f4Var;
    }

    public s(be.c0 c0Var, k1.m mVar, k1.n nVar) {
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

    public s(z5 z5Var) {
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
        bVar.F(new qf.b(i10, arrayList3, Collections.EMPTY_MAP));
    }

    public s(kd.h hVar) {
        this.a = 1;
        this.b = hVar;
        this.d = new LinkedBlockingDeque(20);
        this.e = new a9.d(this, 1);
    }

    public s(ExecutorService executorService) {
        this.a = 12;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new s0(this, 11));
    }

    public s(w4 w4Var, Object obj, Object obj2, Object[] objArr) {
        this.a = 10;
        this.e = w4Var;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public s(int i10) {
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

    public s(lg.e eVar) {
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
        a6 a6Var = new a6(eVar.getContext());
        this.b = a6Var;
        linearLayout.addView(a6Var, w7.z5.n(-1, -2));
        textView2.setGravity(8388611);
        a6Var.setGravity(8388613);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }
}
