package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.c b;
    public final b c;
    public final h1 d;
    public final int i;
    public final e1 j;
    public boolean k;
    public final /* synthetic */ h o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public k6.a m = null;
    public int n = 0;

    public q0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.y.getLooper();
        li.k a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        n8.a aVar = n8.a.a;
        p3 p3Var = new p3(gVar, null, str, str2, aVar);
        a8.d dVar = jVar.c.a;
        n6.l.g(dVar);
        com.google.android.gms.common.api.c a10 = dVar.a(jVar.a, looper, p3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a10 instanceof n6.g)) {
            ((n6.g) a10).N = str3;
        }
        if (str3 != null && (a10 instanceof q)) {
            a1.g.y(a10);
            throw null;
        }
        this.b = a10;
        this.c = jVar.e;
        this.d = new h1(3);
        this.i = jVar.g;
        if (!a10.q()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        com.google.android.gms.internal.cast.z zVar = hVar.y;
        li.k a11 = jVar.a();
        this.j = new e1(context, zVar, new p3((a0.g) a11.b, null, (String) a11.c, (String) a11.d, aVar));
    }

    public final k6.c a(k6.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        k6.c[] n10 = this.b.n();
        if (n10 == null) {
            n10 = new k6.c[0];
        }
        a0.f fVar = new a0.f(n10.length);
        for (k6.c cVar : n10) {
            fVar.put(cVar.a, Long.valueOf(cVar.b()));
        }
        for (k6.c cVar2 : cVarArr) {
            Long l4 = (Long) fVar.get(cVar2.a);
            if (l4 == null || l4.longValue() < cVar2.b()) {
                return cVar2;
            }
        }
        return null;
    }

    public final void b(k6.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (n6.l.k(aVar, k6.a.e)) {
                this.b.i();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        n6.l.c(this.o.y);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        n6.l.c(this.o.y);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (!z10 || l1Var.a == 2) {
                if (status != null) {
                    l1Var.a(status);
                } else {
                    l1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1Var = (l1) arrayList.get(i10);
            if (!this.b.k()) {
                return;
            }
            if (i(l1Var)) {
                linkedList.remove(l1Var);
            }
        }
    }

    public final void f() {
        com.google.android.gms.common.api.c cVar = this.b;
        h hVar = this.o;
        n6.l.c(hVar.y);
        this.m = null;
        b(k6.a.e);
        com.google.android.gms.internal.cast.z zVar = hVar.y;
        if (this.k) {
            b bVar = this.c;
            zVar.removeMessages(11, bVar);
            zVar.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            c1 c1Var = (c1) it.next();
            if (a((k6.c[]) c1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    e2.w wVar = c1Var.a;
                    ((s) ((r) wVar.e).c).accept(cVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    cVar.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i10) {
        h hVar = this.o;
        com.google.android.gms.internal.cast.z zVar = hVar.y;
        n6.l.c(hVar.y);
        this.m = null;
        this.k = true;
        String o10 = this.b.o();
        h1 h1Var = this.d;
        h1Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (o10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(o10);
        }
        h1Var.b(new Status(20, sb2.toString(), null, null), true);
        b bVar = this.c;
        zVar.sendMessageDelayed(Message.obtain(zVar, 9, bVar), 5000L);
        zVar.sendMessageDelayed(Message.obtain(zVar, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((c1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        com.google.android.gms.internal.cast.z zVar = hVar.y;
        b bVar = this.c;
        zVar.removeMessages(12, bVar);
        zVar.sendMessageDelayed(zVar.obtainMessage(12, bVar), hVar.a);
    }

    public final boolean i(l1 l1Var) {
        if (!(l1Var instanceof x0)) {
            h1 h1Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            l1Var.d(h1Var, cVar.q());
            try {
                l1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        x0 x0Var = (x0) l1Var;
        k6.c a2 = a(x0Var.g(this));
        if (a2 == null) {
            h1 h1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            l1Var.d(h1Var2, cVar2.q());
            try {
                l1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + a2.a + ", " + a2.b() + ").");
        if (!this.o.D || !x0Var.f(this)) {
            x0Var.b(new com.google.android.gms.common.api.r(a2));
            return true;
        }
        r0 r0Var = new r0(this.c, a2);
        int indexOf = this.l.indexOf(r0Var);
        if (indexOf >= 0) {
            r0 r0Var2 = (r0) this.l.get(indexOf);
            this.o.y.removeMessages(15, r0Var2);
            com.google.android.gms.internal.cast.z zVar = this.o.y;
            zVar.sendMessageDelayed(Message.obtain(zVar, 15, r0Var2), 5000L);
            return false;
        }
        this.l.add(r0Var);
        com.google.android.gms.internal.cast.z zVar2 = this.o.y;
        zVar2.sendMessageDelayed(Message.obtain(zVar2, 15, r0Var), 5000L);
        com.google.android.gms.internal.cast.z zVar3 = this.o.y;
        zVar3.sendMessageDelayed(Message.obtain(zVar3, 16, r0Var), 120000L);
        k6.a aVar = new k6.a(2, null);
        if (j(aVar)) {
            return false;
        }
        this.o.c(aVar, this.i);
        return false;
    }

    public final boolean j(k6.a aVar) {
        synchronized (h.G) {
        }
        return false;
    }

    public final void k() {
        h hVar = this.o;
        n6.l.c(hVar.y);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.k() || cVar.g()) {
            return;
        }
        try {
            int Q0 = hVar.h.Q0(hVar.e, cVar);
            if (Q0 != 0) {
                k6.a aVar = new k6.a(Q0, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            t0 t0Var = new t0(hVar, cVar, this.c);
            if (cVar.q()) {
                e1 e1Var = this.j;
                n6.l.g(e1Var);
                Handler handler = e1Var.c;
                p3 p3Var = e1Var.f;
                o8.a aVar2 = e1Var.i;
                if (aVar2 != null) {
                    aVar2.j();
                }
                p3Var.h = Integer.valueOf(System.identityHashCode(e1Var));
                e1Var.i = (o8.a) e1Var.d.a(e1Var.b, handler.getLooper(), p3Var, (n8.a) p3Var.f, e1Var, e1Var);
                e1Var.j = t0Var;
                Set set = e1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.activity.i(e1Var, 14));
                } else {
                    e1Var.i.H();
                }
            }
            try {
                cVar.f(t0Var);
            } catch (SecurityException e) {
                m(new k6.a(10), e);
            }
        } catch (IllegalStateException e7) {
            m(new k6.a(10), e7);
        }
    }

    public final void l(l1 l1Var) {
        n6.l.c(this.o.y);
        boolean k10 = this.b.k();
        LinkedList linkedList = this.a;
        if (k10) {
            if (i(l1Var)) {
                h();
                return;
            } else {
                linkedList.add(l1Var);
                return;
            }
        }
        linkedList.add(l1Var);
        k6.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(k6.a aVar, RuntimeException runtimeException) {
        o8.a aVar2;
        n6.l.c(this.o.y);
        e1 e1Var = this.j;
        if (e1Var != null && (aVar2 = e1Var.i) != null) {
            aVar2.j();
        }
        n6.l.c(this.o.y);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof p6.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            com.google.android.gms.internal.cast.z zVar = hVar.y;
            zVar.sendMessageDelayed(zVar.obtainMessage(19), 300000L);
        }
        if (aVar.b == 4) {
            c(h.F);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = aVar;
            return;
        }
        if (runtimeException != null) {
            n6.l.c(this.o.y);
            d(null, runtimeException, false);
            return;
        }
        if (!this.o.D) {
            c(h.d(this.c, aVar));
            return;
        }
        d(h.d(this.c, aVar), null, true);
        if (this.a.isEmpty() || j(aVar) || this.o.c(aVar, this.i)) {
            return;
        }
        if (aVar.b == 18) {
            this.k = true;
        }
        if (!this.k) {
            c(h.d(this.c, aVar));
            return;
        }
        h hVar2 = this.o;
        b bVar = this.c;
        com.google.android.gms.internal.cast.z zVar2 = hVar2.y;
        zVar2.sendMessageDelayed(Message.obtain(zVar2, 9, bVar), 5000L);
    }

    public final void n(k6.a aVar) {
        n6.l.c(this.o.y);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.e("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        n6.l.c(this.o.y);
        Status status = h.E;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new j1(nVar, new TaskCompletionSource()));
        }
        b(new k6.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.k()) {
            cVar.a(new k6.h(this, 16));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.z zVar = this.o.y;
        if (myLooper == zVar.getLooper()) {
            f();
        } else {
            zVar.post(new androidx.activity.i(this, 12));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.z zVar = this.o.y;
        if (myLooper == zVar.getLooper()) {
            g(i10);
        } else {
            zVar.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
