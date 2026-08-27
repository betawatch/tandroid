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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
    public v5.a m = null;
    public int n = 0;

    public p0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        u2.b a2 = jVar.a();
        a0.g gVar = (a0.g) a2.c;
        String str = (String) a2.b;
        String str2 = (String) a2.d;
        y7.a aVar = y7.a.a;
        t3 t3Var = new t3(gVar, null, str, str2, aVar);
        a6.b bVar = jVar.c.a;
        y5.l.h(bVar);
        com.google.android.gms.common.api.c a3 = bVar.a(jVar.a, looper, t3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a3 instanceof y5.g)) {
            ((y5.g) a3).J = str3;
        }
        if (str3 != null && (a3 instanceof q)) {
            a9.p.t(a3);
            throw null;
        }
        this.b = a3;
        this.c = jVar.e;
        this.d = new g1(3);
        this.i = jVar.g;
        if (!a3.o()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        c2.t0 t0Var = hVar.x;
        u2.b a10 = jVar.a();
        this.j = new d1(context, t0Var, new t3((a0.g) a10.c, null, (String) a10.b, (String) a10.d, aVar));
    }

    public final v5.c a(v5.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        v5.c[] l10 = this.b.l();
        if (l10 == null) {
            l10 = new v5.c[0];
        }
        a0.f fVar = new a0.f(l10.length);
        for (v5.c cVar : l10) {
            fVar.put(cVar.a, Long.valueOf(cVar.b()));
        }
        for (v5.c cVar2 : cVarArr) {
            Long l11 = (Long) fVar.get(cVar2.a);
            if (l11 == null || l11.longValue() < cVar2.b()) {
                return cVar2;
            }
        }
        return null;
    }

    public final void b(v5.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (y5.l.l(aVar, v5.a.e)) {
                this.b.f();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        y5.l.d(this.o.x);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        y5.l.d(this.o.x);
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
            if (!this.b.h()) {
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
        y5.l.d(hVar.x);
        this.m = null;
        b(v5.a.e);
        c2.t0 t0Var = hVar.x;
        if (this.k) {
            b bVar = this.c;
            t0Var.removeMessages(11, bVar);
            t0Var.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            if (a((v5.c[]) b1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    com.google.android.exoplayer2.upstream.t tVar = b1Var.a;
                    ((s) ((r) tVar.e).c).accept(cVar, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    cVar.c("DeadObjectException thrown while calling register listener method.");
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
        c2.t0 t0Var = hVar.x;
        y5.l.d(hVar.x);
        this.m = null;
        this.k = true;
        String m10 = this.b.m();
        g1 g1Var = this.d;
        g1Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (m10 != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(m10);
        }
        g1Var.b(new Status(20, sb2.toString(), null, null), true);
        b bVar = this.c;
        t0Var.sendMessageDelayed(Message.obtain(t0Var, 9, bVar), 5000L);
        t0Var.sendMessageDelayed(Message.obtain(t0Var, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        c2.t0 t0Var = hVar.x;
        b bVar = this.c;
        t0Var.removeMessages(12, bVar);
        t0Var.sendMessageDelayed(t0Var.obtainMessage(12, bVar), hVar.a);
    }

    public final boolean i(k1 k1Var) {
        if (!(k1Var instanceof w0)) {
            g1 g1Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            k1Var.d(g1Var, cVar.o());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        w0 w0Var = (w0) k1Var;
        v5.c a2 = a(w0Var.g(this));
        if (a2 == null) {
            g1 g1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            k1Var.d(g1Var2, cVar2.o());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
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
            c2.t0 t0Var = this.o.x;
            t0Var.sendMessageDelayed(Message.obtain(t0Var, 15, q0Var2), 5000L);
            return false;
        }
        this.l.add(q0Var);
        c2.t0 t0Var2 = this.o.x;
        t0Var2.sendMessageDelayed(Message.obtain(t0Var2, 15, q0Var), 5000L);
        c2.t0 t0Var3 = this.o.x;
        t0Var3.sendMessageDelayed(Message.obtain(t0Var3, 16, q0Var), 120000L);
        v5.a aVar = new v5.a(2, null);
        if (j(aVar)) {
            return false;
        }
        this.o.c(aVar, this.i);
        return false;
    }

    public final boolean j(v5.a aVar) {
        synchronized (h.C) {
        }
        return false;
    }

    public final void k() {
        h hVar = this.o;
        y5.l.d(hVar.x);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.h() || cVar.d()) {
            return;
        }
        try {
            int m10 = hVar.h.m(hVar.e, cVar);
            if (m10 != 0) {
                v5.a aVar = new v5.a(m10, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            s0 s0Var = new s0(hVar, cVar, this.c);
            if (cVar.o()) {
                d1 d1Var = this.j;
                y5.l.h(d1Var);
                Handler handler = d1Var.c;
                t3 t3Var = d1Var.f;
                z7.a aVar2 = d1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                t3Var.h = Integer.valueOf(System.identityHashCode(d1Var));
                d1Var.i = (z7.a) d1Var.d.a(d1Var.b, handler.getLooper(), t3Var, (y7.a) t3Var.f, d1Var, d1Var);
                d1Var.j = s0Var;
                Set set = d1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new a8.b(d1Var, 15));
                } else {
                    d1Var.i.G();
                }
            }
            try {
                cVar.p(s0Var);
            } catch (SecurityException e9) {
                m(new v5.a(10), e9);
            }
        } catch (IllegalStateException e10) {
            m(new v5.a(10), e10);
        }
    }

    public final void l(k1 k1Var) {
        y5.l.d(this.o.x);
        boolean h = this.b.h();
        LinkedList linkedList = this.a;
        if (h) {
            if (i(k1Var)) {
                h();
                return;
            } else {
                linkedList.add(k1Var);
                return;
            }
        }
        linkedList.add(k1Var);
        v5.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(v5.a aVar, RuntimeException runtimeException) {
        z7.a aVar2;
        y5.l.d(this.o.x);
        d1 d1Var = this.j;
        if (d1Var != null && (aVar2 = d1Var.i) != null) {
            aVar2.disconnect();
        }
        y5.l.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof a6.d) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            c2.t0 t0Var = hVar.x;
            t0Var.sendMessageDelayed(t0Var.obtainMessage(19), 300000L);
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
            y5.l.d(this.o.x);
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
        c2.t0 t0Var2 = hVar2.x;
        t0Var2.sendMessageDelayed(Message.obtain(t0Var2, 9, bVar), 5000L);
    }

    public final void n(v5.a aVar) {
        y5.l.d(this.o.x);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        y5.l.d(this.o.x);
        Status status = h.A;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new i1(nVar, new TaskCompletionSource()));
        }
        b(new v5.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.h()) {
            cVar.g(new k5.i(this, 8));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        c2.t0 t0Var = this.o.x;
        if (myLooper == t0Var.getLooper()) {
            f();
        } else {
            t0Var.post(new a8.b(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(v5.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        c2.t0 t0Var = this.o.x;
        if (myLooper == t0Var.getLooper()) {
            g(i10);
        } else {
            t0Var.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
