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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class p0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.c b;
    public final b c;
    public final g1 d;
    public final int i;
    public final d1 j;
    public boolean k;
    public final /* synthetic */ h o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public k6.a m = null;
    public int n = 0;

    public p0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        m2.t a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        n8.a aVar = n8.a.a;
        p3 p3Var = new p3(gVar, null, str, str2, aVar);
        a8.d dVar = jVar.c.a;
        n6.l.h(dVar);
        com.google.android.gms.common.api.c a10 = dVar.a(jVar.a, looper, p3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a10 instanceof n6.g)) {
            ((n6.g) a10).N = str3;
        }
        if (str3 != null && (a10 instanceof q)) {
            a4.a.y(a10);
            throw null;
        }
        this.b = a10;
        this.c = jVar.e;
        this.d = new g1(3);
        this.i = jVar.g;
        if (!a10.p()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
        m2.t a11 = jVar.a();
        this.j = new d1(context, c0Var, new p3((a0.g) a11.b, null, (String) a11.c, (String) a11.d, aVar));
    }

    public final k6.c a(k6.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        k6.c[] m10 = this.b.m();
        if (m10 == null) {
            m10 = new k6.c[0];
        }
        a0.f fVar = new a0.f(m10.length);
        for (k6.c cVar : m10) {
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
            if (n6.l.l(aVar, k6.a.e)) {
                this.b.h();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        n6.l.d(this.o.x);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        n6.l.d(this.o.x);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            if (!z10 || k1Var.a == 2) {
                if (status != null) {
                    k1Var.a(status);
                } else {
                    k1Var.b(exc);
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
            k1 k1Var = (k1) arrayList.get(i10);
            if (!this.b.j()) {
                return;
            }
            if (i(k1Var)) {
                linkedList.remove(k1Var);
            }
        }
    }

    public final void f() {
        com.google.android.gms.common.api.c cVar = this.b;
        h hVar = this.o;
        n6.l.d(hVar.x);
        this.m = null;
        b(k6.a.e);
        com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
        if (this.k) {
            b bVar = this.c;
            c0Var.removeMessages(11, bVar);
            c0Var.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            if (a((k6.c[]) b1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    e2.u uVar = b1Var.a;
                    ((s) ((r) uVar.e).c).accept(cVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    cVar.d("DeadObjectException thrown while calling register listener method.");
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
        com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
        n6.l.d(hVar.x);
        this.m = null;
        this.k = true;
        String n10 = this.b.n();
        g1 g1Var = this.d;
        g1Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (n10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(n10);
        }
        g1Var.b(new Status(20, sb2.toString(), null, null), true);
        b bVar = this.c;
        c0Var.sendMessageDelayed(Message.obtain(c0Var, 9, bVar), 5000L);
        c0Var.sendMessageDelayed(Message.obtain(c0Var, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
        b bVar = this.c;
        c0Var.removeMessages(12, bVar);
        c0Var.sendMessageDelayed(c0Var.obtainMessage(12, bVar), hVar.a);
    }

    public final boolean i(k1 k1Var) {
        if (!(k1Var instanceof w0)) {
            g1 g1Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            k1Var.d(g1Var, cVar.p());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        w0 w0Var = (w0) k1Var;
        k6.c a2 = a(w0Var.g(this));
        if (a2 == null) {
            g1 g1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            k1Var.d(g1Var2, cVar2.p());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + a2.a + ", " + a2.b() + ").");
        if (!this.o.y || !w0Var.f(this)) {
            w0Var.b(new com.google.android.gms.common.api.r(a2));
            return true;
        }
        q0 q0Var = new q0(this.c, a2);
        int indexOf = this.l.indexOf(q0Var);
        if (indexOf >= 0) {
            q0 q0Var2 = (q0) this.l.get(indexOf);
            this.o.x.removeMessages(15, q0Var2);
            com.google.android.gms.internal.cast.c0 c0Var = this.o.x;
            c0Var.sendMessageDelayed(Message.obtain(c0Var, 15, q0Var2), 5000L);
            return false;
        }
        this.l.add(q0Var);
        com.google.android.gms.internal.cast.c0 c0Var2 = this.o.x;
        c0Var2.sendMessageDelayed(Message.obtain(c0Var2, 15, q0Var), 5000L);
        com.google.android.gms.internal.cast.c0 c0Var3 = this.o.x;
        c0Var3.sendMessageDelayed(Message.obtain(c0Var3, 16, q0Var), 120000L);
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
        n6.l.d(hVar.x);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.j() || cVar.f()) {
            return;
        }
        try {
            int M = hVar.h.M(hVar.e, cVar);
            if (M != 0) {
                k6.a aVar = new k6.a(M, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            s0 s0Var = new s0(hVar, cVar, this.c);
            if (cVar.p()) {
                d1 d1Var = this.j;
                n6.l.h(d1Var);
                Handler handler = d1Var.c;
                p3 p3Var = d1Var.f;
                o8.a aVar2 = d1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                p3Var.h = Integer.valueOf(System.identityHashCode(d1Var));
                d1Var.i = (o8.a) d1Var.d.a(d1Var.b, handler.getLooper(), p3Var, (n8.a) p3Var.f, d1Var, d1Var);
                d1Var.j = s0Var;
                Set set = d1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.activity.i(d1Var, 15));
                } else {
                    d1Var.i.G();
                }
            }
            try {
                cVar.e(s0Var);
            } catch (SecurityException e7) {
                m(new k6.a(10), e7);
            }
        } catch (IllegalStateException e10) {
            m(new k6.a(10), e10);
        }
    }

    public final void l(k1 k1Var) {
        n6.l.d(this.o.x);
        boolean j3 = this.b.j();
        LinkedList linkedList = this.a;
        if (j3) {
            if (i(k1Var)) {
                h();
                return;
            } else {
                linkedList.add(k1Var);
                return;
            }
        }
        linkedList.add(k1Var);
        k6.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(k6.a aVar, RuntimeException runtimeException) {
        o8.a aVar2;
        n6.l.d(this.o.x);
        d1 d1Var = this.j;
        if (d1Var != null && (aVar2 = d1Var.i) != null) {
            aVar2.disconnect();
        }
        n6.l.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof p6.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            com.google.android.gms.internal.cast.c0 c0Var = hVar.x;
            c0Var.sendMessageDelayed(c0Var.obtainMessage(19), 300000L);
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
            n6.l.d(this.o.x);
            d(null, runtimeException, false);
            return;
        }
        if (!this.o.y) {
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
        com.google.android.gms.internal.cast.c0 c0Var2 = hVar2.x;
        c0Var2.sendMessageDelayed(Message.obtain(c0Var2, 9, bVar), 5000L);
    }

    public final void n(k6.a aVar) {
        n6.l.d(this.o.x);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.d("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        n6.l.d(this.o.x);
        Status status = h.E;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new i1(nVar, new TaskCompletionSource()));
        }
        b(new k6.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.j()) {
            cVar.i(new a4.m(this, 11));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.c0 c0Var = this.o.x;
        if (myLooper == c0Var.getLooper()) {
            f();
        } else {
            c0Var.post(new androidx.activity.i(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.c0 c0Var = this.o.x;
        if (myLooper == c0Var.getLooper()) {
            g(i10);
        } else {
            c0Var.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
