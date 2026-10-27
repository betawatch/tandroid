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
import m.r3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public l6.a m = null;
    public int n = 0;

    public o0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        k6.c a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        o8.a aVar = o8.a.a;
        r3 r3Var = new r3(gVar, null, str, str2, aVar);
        b8.d dVar = jVar.c.a;
        o6.l.h(dVar);
        com.google.android.gms.common.api.c a10 = dVar.a(jVar.a, looper, r3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a10 instanceof o6.g)) {
            ((o6.g) a10).N = str3;
        }
        if (str3 != null && (a10 instanceof q)) {
            a1.g.B(a10);
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
        com.google.android.gms.internal.cast.y yVar = hVar.x;
        k6.c a11 = jVar.a();
        this.j = new c1(context, yVar, new r3((a0.g) a11.b, null, (String) a11.c, (String) a11.d, aVar));
    }

    public final l6.c a(l6.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        l6.c[] m10 = this.b.m();
        if (m10 == null) {
            m10 = new l6.c[0];
        }
        a0.f fVar = new a0.f(m10.length);
        for (l6.c cVar : m10) {
            fVar.put(cVar.a, Long.valueOf(cVar.b()));
        }
        for (l6.c cVar2 : cVarArr) {
            Long l4 = (Long) fVar.get(cVar2.a);
            if (l4 == null || l4.longValue() < cVar2.b()) {
                return cVar2;
            }
        }
        return null;
    }

    public final void b(l6.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (o6.l.l(aVar, l6.a.e)) {
                this.b.f();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        o6.l.d(this.o.x);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z10) {
        o6.l.d(this.o.x);
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
            if (!this.b.i()) {
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
        o6.l.d(hVar.x);
        this.m = null;
        b(l6.a.e);
        com.google.android.gms.internal.cast.y yVar = hVar.x;
        if (this.k) {
            b bVar = this.c;
            yVar.removeMessages(11, bVar);
            yVar.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (a((l6.c[]) a1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    e2.w wVar = a1Var.a;
                    ((r) ((bi.a) wVar.e).c).accept(cVar, new TaskCompletionSource());
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
        com.google.android.gms.internal.cast.y yVar = hVar.x;
        o6.l.d(hVar.x);
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
        yVar.sendMessageDelayed(Message.obtain(yVar, 9, bVar), 5000L);
        yVar.sendMessageDelayed(Message.obtain(yVar, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((a1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        com.google.android.gms.internal.cast.y yVar = hVar.x;
        b bVar = this.c;
        yVar.removeMessages(12, bVar);
        yVar.sendMessageDelayed(yVar.obtainMessage(12, bVar), hVar.a);
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
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        v0 v0Var = (v0) j1Var;
        l6.c a2 = a(v0Var.g(this));
        if (a2 == null) {
            f1 f1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            j1Var.d(f1Var2, cVar2.p());
            try {
                j1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
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
            com.google.android.gms.internal.cast.y yVar = this.o.x;
            yVar.sendMessageDelayed(Message.obtain(yVar, 15, p0Var2), 5000L);
            return false;
        }
        this.l.add(p0Var);
        com.google.android.gms.internal.cast.y yVar2 = this.o.x;
        yVar2.sendMessageDelayed(Message.obtain(yVar2, 15, p0Var), 5000L);
        com.google.android.gms.internal.cast.y yVar3 = this.o.x;
        yVar3.sendMessageDelayed(Message.obtain(yVar3, 16, p0Var), 120000L);
        l6.a aVar = new l6.a(2, null);
        if (j(aVar)) {
            return false;
        }
        this.o.c(aVar, this.i);
        return false;
    }

    public final boolean j(l6.a aVar) {
        synchronized (h.G) {
        }
        return false;
    }

    public final void k() {
        h hVar = this.o;
        o6.l.d(hVar.x);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.i() || cVar.d()) {
            return;
        }
        try {
            int T = hVar.h.T(hVar.e, cVar);
            if (T != 0) {
                l6.a aVar = new l6.a(T, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            r0 r0Var = new r0(hVar, cVar, this.c);
            if (cVar.p()) {
                c1 c1Var = this.j;
                o6.l.h(c1Var);
                Handler handler = c1Var.c;
                r3 r3Var = c1Var.f;
                p8.a aVar2 = c1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                r3Var.h = Integer.valueOf(System.identityHashCode(c1Var));
                c1Var.i = (p8.a) c1Var.d.a(c1Var.b, handler.getLooper(), r3Var, (o8.a) r3Var.f, c1Var, c1Var);
                c1Var.j = r0Var;
                Set set = c1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new a5.d(c1Var, 15));
                } else {
                    c1Var.i.G();
                }
            }
            try {
                cVar.h(r0Var);
            } catch (SecurityException e) {
                m(new l6.a(10), e);
            }
        } catch (IllegalStateException e10) {
            m(new l6.a(10), e10);
        }
    }

    public final void l(j1 j1Var) {
        o6.l.d(this.o.x);
        boolean i10 = this.b.i();
        LinkedList linkedList = this.a;
        if (i10) {
            if (i(j1Var)) {
                h();
                return;
            } else {
                linkedList.add(j1Var);
                return;
            }
        }
        linkedList.add(j1Var);
        l6.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(l6.a aVar, RuntimeException runtimeException) {
        p8.a aVar2;
        o6.l.d(this.o.x);
        c1 c1Var = this.j;
        if (c1Var != null && (aVar2 = c1Var.i) != null) {
            aVar2.disconnect();
        }
        o6.l.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof q6.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            com.google.android.gms.internal.cast.y yVar = hVar.x;
            yVar.sendMessageDelayed(yVar.obtainMessage(19), 300000L);
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
            o6.l.d(this.o.x);
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
        com.google.android.gms.internal.cast.y yVar2 = hVar2.x;
        yVar2.sendMessageDelayed(Message.obtain(yVar2, 9, bVar), 5000L);
    }

    public final void n(l6.a aVar) {
        o6.l.d(this.o.x);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        o6.l.d(this.o.x);
        Status status = h.E;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new h1(nVar, new TaskCompletionSource()));
        }
        b(new l6.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.i()) {
            cVar.g(new rb.c(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.y yVar = this.o.x;
        if (myLooper == yVar.getLooper()) {
            f();
        } else {
            yVar.post(new a5.d(this, 13));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(l6.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        com.google.android.gms.internal.cast.y yVar = this.o.x;
        if (myLooper == yVar.getLooper()) {
            g(i10);
        } else {
            yVar.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
