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
import m.g3;
import m.s3;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class o0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.c b;
    public final b c;
    public final f1 d;
    public final int i;
    public final c1 j;
    public boolean k;
    public final /* synthetic */ h o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public k6.a m = null;
    public int n = 0;

    public o0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        g3 a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        n8.a aVar = n8.a.a;
        s3 s3Var = new s3(gVar, null, str, str2, aVar);
        a8.d dVar = jVar.c.a;
        n6.l.h(dVar);
        com.google.android.gms.common.api.c a10 = dVar.a(jVar.a, looper, s3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a10 instanceof n6.g)) {
            ((n6.g) a10).N = str3;
        }
        if (str3 != null && (a10 instanceof q)) {
            a1.g.z(a10);
            throw null;
        }
        this.b = a10;
        this.c = jVar.e;
        this.d = new f1(3);
        this.i = jVar.g;
        if (!a10.p()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
        g3 a11 = jVar.a();
        this.j = new c1(context, a0Var, new s3((a0.g) a11.b, null, (String) a11.c, (String) a11.d, aVar));
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
            j1 j1Var = (j1) it.next();
            if (!z10 || j1Var.a == 2) {
                if (status != null) {
                    j1Var.a(status);
                } else {
                    j1Var.b(exc);
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
            j1 j1Var = (j1) arrayList.get(i10);
            if (!this.b.j()) {
                return;
            }
            if (i(j1Var)) {
                linkedList.remove(j1Var);
            }
        }
    }

    public final void f() {
        com.google.android.gms.common.api.c cVar = this.b;
        h hVar = this.o;
        n6.l.d(hVar.x);
        this.m = null;
        b(k6.a.e);
        com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
        if (this.k) {
            b bVar = this.c;
            a0Var.removeMessages(11, bVar);
            a0Var.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (a((k6.c[]) a1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    e2.w wVar = a1Var.a;
                    ((r) ((ai.a) wVar.e).c).accept(cVar, new TaskCompletionSource());
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
        com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
        n6.l.d(hVar.x);
        this.m = null;
        this.k = true;
        String n10 = this.b.n();
        f1 f1Var = this.d;
        f1Var.getClass();
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
        f1Var.b(new Status(20, sb2.toString(), null, null), true);
        b bVar = this.c;
        a0Var.sendMessageDelayed(Message.obtain(a0Var, 9, bVar), 5000L);
        a0Var.sendMessageDelayed(Message.obtain(a0Var, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((a1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
        b bVar = this.c;
        a0Var.removeMessages(12, bVar);
        a0Var.sendMessageDelayed(a0Var.obtainMessage(12, bVar), hVar.a);
    }

    public final boolean i(j1 j1Var) {
        if (!(j1Var instanceof v0)) {
            f1 f1Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            j1Var.d(f1Var, cVar.p());
            try {
                j1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        v0 v0Var = (v0) j1Var;
        k6.c a2 = a(v0Var.g(this));
        if (a2 == null) {
            f1 f1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            j1Var.d(f1Var2, cVar2.p());
            try {
                j1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + a2.a + ", " + a2.b() + ").");
        if (!this.o.y || !v0Var.f(this)) {
            v0Var.b(new com.google.android.gms.common.api.r(a2));
            return true;
        }
        p0 p0Var = new p0(this.c, a2);
        int indexOf = this.l.indexOf(p0Var);
        if (indexOf >= 0) {
            p0 p0Var2 = (p0) this.l.get(indexOf);
            this.o.x.removeMessages(15, p0Var2);
            com.google.android.gms.internal.cast.a0 a0Var = this.o.x;
            a0Var.sendMessageDelayed(Message.obtain(a0Var, 15, p0Var2), 5000L);
            return false;
        }
        this.l.add(p0Var);
        com.google.android.gms.internal.cast.a0 a0Var2 = this.o.x;
        a0Var2.sendMessageDelayed(Message.obtain(a0Var2, 15, p0Var), 5000L);
        com.google.android.gms.internal.cast.a0 a0Var3 = this.o.x;
        a0Var3.sendMessageDelayed(Message.obtain(a0Var3, 16, p0Var), 120000L);
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
            int a02 = hVar.h.a0(hVar.e, cVar);
            if (a02 != 0) {
                k6.a aVar = new k6.a(a02, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            r0 r0Var = new r0(hVar, cVar, this.c);
            if (cVar.p()) {
                c1 c1Var = this.j;
                n6.l.h(c1Var);
                Handler handler = c1Var.c;
                s3 s3Var = c1Var.f;
                o8.a aVar2 = c1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                s3Var.h = Integer.valueOf(System.identityHashCode(c1Var));
                c1Var.i = (o8.a) c1Var.d.a(c1Var.b, handler.getLooper(), s3Var, (n8.a) s3Var.f, c1Var, c1Var);
                c1Var.j = r0Var;
                Set set = c1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.activity.i(c1Var, 15));
                } else {
                    c1Var.i.G();
                }
            }
            try {
                cVar.e(r0Var);
            } catch (SecurityException e) {
                m(new k6.a(10), e);
            }
        } catch (IllegalStateException e7) {
            m(new k6.a(10), e7);
        }
    }

    public final void l(j1 j1Var) {
        n6.l.d(this.o.x);
        boolean j10 = this.b.j();
        LinkedList linkedList = this.a;
        if (j10) {
            if (i(j1Var)) {
                h();
                return;
            } else {
                linkedList.add(j1Var);
                return;
            }
        }
        linkedList.add(j1Var);
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
        c1 c1Var = this.j;
        if (c1Var != null && (aVar2 = c1Var.i) != null) {
            aVar2.disconnect();
        }
        n6.l.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof p6.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            com.google.android.gms.internal.cast.a0 a0Var = hVar.x;
            a0Var.sendMessageDelayed(a0Var.obtainMessage(19), 300000L);
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
        com.google.android.gms.internal.cast.a0 a0Var2 = hVar2.x;
        a0Var2.sendMessageDelayed(Message.obtain(a0Var2, 9, bVar), 5000L);
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
            l(new h1(nVar, new TaskCompletionSource()));
        }
        b(new k6.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.j()) {
            cVar.i(new ag.b(this, 9));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.a0 a0Var = this.o.x;
        if (myLooper == a0Var.getLooper()) {
            f();
        } else {
            a0Var.post(new androidx.activity.i(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.a0 a0Var = this.o.x;
        if (myLooper == a0Var.getLooper()) {
            g(i10);
        } else {
            a0Var.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
