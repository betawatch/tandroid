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
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public u5.a m = null;
    public int n = 0;

    public p0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        t5.c a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        x7.a aVar = x7.a.a;
        t3 t3Var = new t3(gVar, null, str, str2, aVar);
        b7.d dVar = jVar.c.a;
        x5.l.h(dVar);
        com.google.android.gms.common.api.c a3 = dVar.a(jVar.a, looper, t3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a3 instanceof x5.g)) {
            ((x5.g) a3).J = str3;
        }
        if (str3 != null && (a3 instanceof q)) {
            aa.d.v(a3);
            throw null;
        }
        this.b = a3;
        this.c = jVar.e;
        this.d = new g1(3);
        this.i = jVar.g;
        if (!a3.p()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        c2.u0 u0Var = hVar.x;
        t5.c a10 = jVar.a();
        this.j = new d1(context, u0Var, new t3((a0.g) a10.b, null, (String) a10.c, (String) a10.d, aVar));
    }

    public final u5.c a(u5.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        u5.c[] m10 = this.b.m();
        if (m10 == null) {
            m10 = new u5.c[0];
        }
        a0.f fVar = new a0.f(m10.length);
        for (u5.c cVar : m10) {
            fVar.put(cVar.a, Long.valueOf(cVar.b()));
        }
        for (u5.c cVar2 : cVarArr) {
            Long l10 = (Long) fVar.get(cVar2.a);
            if (l10 == null || l10.longValue() < cVar2.b()) {
                return cVar2;
            }
        }
        return null;
    }

    public final void b(u5.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (x5.l.l(aVar, u5.a.e)) {
                this.b.h();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        x5.l.d(this.o.x);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        x5.l.d(this.o.x);
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
        for (int i9 = 0; i9 < size; i9++) {
            k1 k1Var = (k1) arrayList.get(i9);
            if (!this.b.i()) {
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
        x5.l.d(hVar.x);
        this.m = null;
        b(u5.a.e);
        c2.u0 u0Var = hVar.x;
        if (this.k) {
            b bVar = this.c;
            u0Var.removeMessages(11, bVar);
            u0Var.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            if (a((u5.c[]) b1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    com.google.android.exoplayer2.upstream.t tVar = b1Var.a;
                    ((s) ((r) tVar.e).c).accept(cVar, new TaskCompletionSource());
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

    public final void g(int i9) {
        h hVar = this.o;
        c2.u0 u0Var = hVar.x;
        x5.l.d(hVar.x);
        this.m = null;
        this.k = true;
        String n10 = this.b.n();
        g1 g1Var = this.d;
        g1Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i9 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i9 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (n10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(n10);
        }
        g1Var.b(new Status(20, sb2.toString(), null, null), true);
        b bVar = this.c;
        u0Var.sendMessageDelayed(Message.obtain(u0Var, 9, bVar), 5000L);
        u0Var.sendMessageDelayed(Message.obtain(u0Var, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        c2.u0 u0Var = hVar.x;
        b bVar = this.c;
        u0Var.removeMessages(12, bVar);
        u0Var.sendMessageDelayed(u0Var.obtainMessage(12, bVar), hVar.a);
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
        u5.c a2 = a(w0Var.g(this));
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
            c2.u0 u0Var = this.o.x;
            u0Var.sendMessageDelayed(Message.obtain(u0Var, 15, q0Var2), 5000L);
            return false;
        }
        this.l.add(q0Var);
        c2.u0 u0Var2 = this.o.x;
        u0Var2.sendMessageDelayed(Message.obtain(u0Var2, 15, q0Var), 5000L);
        c2.u0 u0Var3 = this.o.x;
        u0Var3.sendMessageDelayed(Message.obtain(u0Var3, 16, q0Var), 120000L);
        u5.a aVar = new u5.a(2, null);
        if (j(aVar)) {
            return false;
        }
        this.o.c(aVar, this.i);
        return false;
    }

    public final boolean j(u5.a aVar) {
        synchronized (h.C) {
        }
        return false;
    }

    public final void k() {
        h hVar = this.o;
        x5.l.d(hVar.x);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.i() || cVar.f()) {
            return;
        }
        try {
            int n10 = hVar.h.n(hVar.e, cVar);
            if (n10 != 0) {
                u5.a aVar = new u5.a(n10, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            s0 s0Var = new s0(hVar, cVar, this.c);
            if (cVar.p()) {
                d1 d1Var = this.j;
                x5.l.h(d1Var);
                Handler handler = d1Var.c;
                t3 t3Var = d1Var.f;
                y7.a aVar2 = d1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                t3Var.h = Integer.valueOf(System.identityHashCode(d1Var));
                d1Var.i = (y7.a) d1Var.d.a(d1Var.b, handler.getLooper(), t3Var, (x7.a) t3Var.f, d1Var, d1Var);
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
            } catch (SecurityException e10) {
                m(new u5.a(10), e10);
            }
        } catch (IllegalStateException e11) {
            m(new u5.a(10), e11);
        }
    }

    public final void l(k1 k1Var) {
        x5.l.d(this.o.x);
        boolean i9 = this.b.i();
        LinkedList linkedList = this.a;
        if (i9) {
            if (i(k1Var)) {
                h();
                return;
            } else {
                linkedList.add(k1Var);
                return;
            }
        }
        linkedList.add(k1Var);
        u5.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(u5.a aVar, RuntimeException runtimeException) {
        y7.a aVar2;
        x5.l.d(this.o.x);
        d1 d1Var = this.j;
        if (d1Var != null && (aVar2 = d1Var.i) != null) {
            aVar2.disconnect();
        }
        x5.l.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof z5.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            c2.u0 u0Var = hVar.x;
            u0Var.sendMessageDelayed(u0Var.obtainMessage(19), 300000L);
        }
        if (aVar.b == 4) {
            c(h.B);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = aVar;
            return;
        }
        if (runtimeException != null) {
            x5.l.d(this.o.x);
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
        c2.u0 u0Var2 = hVar2.x;
        u0Var2.sendMessageDelayed(Message.obtain(u0Var2, 9, bVar), 5000L);
    }

    public final void n(u5.a aVar) {
        x5.l.d(this.o.x);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.d("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        x5.l.d(this.o.x);
        Status status = h.A;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new i1(nVar, new TaskCompletionSource()));
        }
        b(new u5.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.i()) {
            cVar.j(new xa.c(this, 9));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        c2.u0 u0Var = this.o.x;
        if (myLooper == u0Var.getLooper()) {
            f();
        } else {
            u0Var.post(new androidx.activity.i(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(u5.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i9) {
        Looper myLooper = Looper.myLooper();
        c2.u0 u0Var = this.o.x;
        if (myLooper == u0Var.getLooper()) {
            g(i9);
        } else {
            u0Var.post(new androidx.emoji2.text.i(this, i9, 1));
        }
    }
}
