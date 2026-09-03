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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
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
    public y5.a m = null;
    public int n = 0;

    public p0(h hVar, com.google.android.gms.common.api.j jVar) {
        this.o = hVar;
        Looper looper = hVar.x.getLooper();
        androidx.biometric.e a2 = jVar.a();
        a0.g gVar = (a0.g) a2.b;
        String str = (String) a2.c;
        String str2 = (String) a2.d;
        b8.a aVar = b8.a.a;
        r3 r3Var = new r3(gVar, null, str, str2, aVar);
        a8.j jVar2 = jVar.c.a;
        b6.m.h(jVar2);
        com.google.android.gms.common.api.c a10 = jVar2.a(jVar.a, looper, r3Var, jVar.d, this, this);
        String str3 = jVar.b;
        if (str3 != null && (a10 instanceof b6.g)) {
            ((b6.g) a10).K = str3;
        }
        if (str3 != null && (a10 instanceof q)) {
            android.support.v4.media.a.v(a10);
            throw null;
        }
        this.b = a10;
        this.c = jVar.e;
        this.d = new h1(3);
        this.i = jVar.g;
        if (!a10.p()) {
            this.j = null;
            return;
        }
        Context context = hVar.e;
        a7.e eVar = hVar.x;
        androidx.biometric.e a11 = jVar.a();
        this.j = new e1(context, eVar, new r3((a0.g) a11.b, null, (String) a11.c, (String) a11.d, aVar));
    }

    public final y5.c a(y5.c[] cVarArr) {
        if (cVarArr == null || cVarArr.length == 0) {
            return null;
        }
        y5.c[] l10 = this.b.l();
        if (l10 == null) {
            l10 = new y5.c[0];
        }
        a0.f fVar = new a0.f(l10.length);
        for (y5.c cVar : l10) {
            fVar.put(cVar.a, Long.valueOf(cVar.e()));
        }
        for (y5.c cVar2 : cVarArr) {
            Long l11 = (Long) fVar.get(cVar2.a);
            if (l11 == null || l11.longValue() < cVar2.e()) {
                return cVar2;
            }
        }
        return null;
    }

    public final void b(y5.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (b6.m.l(aVar, y5.a.e)) {
                this.b.g();
            }
            throw null;
        }
    }

    public final void c(Status status) {
        b6.m.d(this.o.x);
        d(status, null, false);
    }

    public final void d(Status status, Exception exc, boolean z4) {
        b6.m.d(this.o.x);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (!z4 || l1Var.a == 2) {
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
            if (!this.b.h()) {
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
        b6.m.d(hVar.x);
        this.m = null;
        b(y5.a.e);
        a7.e eVar = hVar.x;
        if (this.k) {
            b bVar = this.c;
            eVar.removeMessages(11, bVar);
            eVar.removeMessages(9, bVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            if (a((y5.c[]) b1Var.a.d) != null) {
                it.remove();
            } else {
                try {
                    d1 d1Var = b1Var.a;
                    ((s) ((r) d1Var.e).c).accept(cVar, new TaskCompletionSource());
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
        a7.e eVar = hVar.x;
        b6.m.d(hVar.x);
        this.m = null;
        this.k = true;
        String m9 = this.b.m();
        h1 h1Var = this.d;
        h1Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (m9 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(m9);
        }
        h1Var.b(new Status(20, sb.toString(), null, null), true);
        b bVar = this.c;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, bVar), 5000L);
        eVar.sendMessageDelayed(Message.obtain(eVar, 11, bVar), 120000L);
        ((SparseIntArray) hVar.h.b).clear();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).getClass();
        }
    }

    public final void h() {
        h hVar = this.o;
        a7.e eVar = hVar.x;
        b bVar = this.c;
        eVar.removeMessages(12, bVar);
        eVar.sendMessageDelayed(eVar.obtainMessage(12, bVar), hVar.a);
    }

    public final boolean i(l1 l1Var) {
        if (!(l1Var instanceof w0)) {
            h1 h1Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            l1Var.d(h1Var, cVar.p());
            try {
                l1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        w0 w0Var = (w0) l1Var;
        y5.c a2 = a(w0Var.g(this));
        if (a2 == null) {
            h1 h1Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            l1Var.d(h1Var2, cVar2.p());
            try {
                l1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.b.getClass().getName() + " could not execute call because it requires feature (" + a2.a + ", " + a2.e() + ").");
        if (!this.o.y || !w0Var.f(this)) {
            w0Var.b(new com.google.android.gms.common.api.r(a2));
            return true;
        }
        q0 q0Var = new q0(this.c, a2);
        int indexOf = this.l.indexOf(q0Var);
        if (indexOf >= 0) {
            q0 q0Var2 = (q0) this.l.get(indexOf);
            this.o.x.removeMessages(15, q0Var2);
            a7.e eVar = this.o.x;
            eVar.sendMessageDelayed(Message.obtain(eVar, 15, q0Var2), 5000L);
            return false;
        }
        this.l.add(q0Var);
        a7.e eVar2 = this.o.x;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, q0Var), 5000L);
        a7.e eVar3 = this.o.x;
        eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, q0Var), 120000L);
        y5.a aVar = new y5.a(2, null);
        if (j(aVar)) {
            return false;
        }
        this.o.c(aVar, this.i);
        return false;
    }

    public final boolean j(y5.a aVar) {
        synchronized (h.D) {
        }
        return false;
    }

    public final void k() {
        h hVar = this.o;
        b6.m.d(hVar.x);
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.h() || cVar.e()) {
            return;
        }
        try {
            int f02 = hVar.h.f0(hVar.e, cVar);
            if (f02 != 0) {
                y5.a aVar = new y5.a(f02, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                m(aVar, null);
                return;
            }
            s0 s0Var = new s0(hVar, cVar, this.c);
            if (cVar.p()) {
                e1 e1Var = this.j;
                b6.m.h(e1Var);
                Handler handler = e1Var.c;
                r3 r3Var = e1Var.f;
                c8.a aVar2 = e1Var.i;
                if (aVar2 != null) {
                    aVar2.disconnect();
                }
                r3Var.h = Integer.valueOf(System.identityHashCode(e1Var));
                e1Var.i = (c8.a) e1Var.d.a(e1Var.b, handler.getLooper(), r3Var, (b8.a) r3Var.f, e1Var, e1Var);
                e1Var.j = s0Var;
                Set set = e1Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new androidx.activity.i(e1Var, 12));
                } else {
                    e1Var.i.G();
                }
            }
            try {
                cVar.n(s0Var);
            } catch (SecurityException e6) {
                m(new y5.a(10), e6);
            }
        } catch (IllegalStateException e10) {
            m(new y5.a(10), e10);
        }
    }

    public final void l(l1 l1Var) {
        b6.m.d(this.o.x);
        boolean h = this.b.h();
        LinkedList linkedList = this.a;
        if (h) {
            if (i(l1Var)) {
                h();
                return;
            } else {
                linkedList.add(l1Var);
                return;
            }
        }
        linkedList.add(l1Var);
        y5.a aVar = this.m;
        if (aVar == null || !aVar.e()) {
            k();
        } else {
            m(this.m, null);
        }
    }

    public final void m(y5.a aVar, RuntimeException runtimeException) {
        c8.a aVar2;
        b6.m.d(this.o.x);
        e1 e1Var = this.j;
        if (e1Var != null && (aVar2 = e1Var.i) != null) {
            aVar2.disconnect();
        }
        b6.m.d(this.o.x);
        this.m = null;
        ((SparseIntArray) this.o.h.b).clear();
        b(aVar);
        if ((this.b instanceof d6.c) && aVar.b != 24) {
            h hVar = this.o;
            hVar.b = true;
            a7.e eVar = hVar.x;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (aVar.b == 4) {
            c(h.C);
            return;
        }
        if (this.a.isEmpty()) {
            this.m = aVar;
            return;
        }
        if (runtimeException != null) {
            b6.m.d(this.o.x);
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
        a7.e eVar2 = hVar2.x;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, bVar), 5000L);
    }

    public final void n(y5.a aVar) {
        b6.m.d(this.o.x);
        com.google.android.gms.common.api.c cVar = this.b;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        m(aVar, null);
    }

    public final void o() {
        b6.m.d(this.o.x);
        Status status = h.B;
        c(status);
        this.d.b(status, false);
        for (n nVar : (n[]) this.f.keySet().toArray(new n[0])) {
            l(new j1(nVar, new TaskCompletionSource()));
        }
        b(new y5.a(4));
        com.google.android.gms.common.api.c cVar = this.b;
        if (cVar.h()) {
            cVar.d(new o5.i(this, 6));
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        a7.e eVar = this.o.x;
        if (myLooper == eVar.getLooper()) {
            f();
        } else {
            eVar.post(new androidx.activity.i(this, 10));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(y5.a aVar) {
        m(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        Looper myLooper = Looper.myLooper();
        a7.e eVar = this.o.x;
        if (myLooper == eVar.getLooper()) {
            g(i10);
        } else {
            eVar.post(new androidx.emoji2.text.j(this, i10, 1));
        }
    }
}
