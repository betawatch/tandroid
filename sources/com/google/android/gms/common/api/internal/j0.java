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
import m.o3;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.c b;
    public final a c;
    public final z0 d;
    public final int i;
    public final w0 j;
    public boolean k;
    public final /* synthetic */ g o;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList l = new ArrayList();
    public m6.a m = null;
    public int n = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(g gVar, com.google.android.gms.common.api.j jVar) {
        this.o = gVar;
        Looper looper = gVar.y.getLooper();
        k4.j a10 = jVar.a();
        a0.g gVar2 = (a0.g) a10.a;
        String str = (String) a10.b;
        String str2 = (String) a10.c;
        p8.a aVar = p8.a.a;
        o3 o3Var = new o3(gVar2, null, str, str2, aVar);
        a6.b bVar = jVar.d.a;
        p6.m.g(bVar);
        com.google.android.gms.common.api.c a11 = bVar.a(jVar.a, looper, o3Var, jVar.e, this, this);
        y00 y00Var = jVar.c;
        if (y00Var == null || !(a11 instanceof p6.d)) {
            String str3 = jVar.b;
            if (str3 != null && (a11 instanceof p6.d)) {
                ((p6.d) a11).x = str3;
            }
        } else {
            ((p6.d) a11).y = y00Var;
        }
        this.b = a11;
        this.c = jVar.f;
        this.d = new z0(2);
        this.i = jVar.h;
        if (!a11.f()) {
            this.j = null;
            return;
        }
        Context context = gVar.e;
        com.google.android.gms.internal.cast.z zVar = gVar.y;
        k4.j a12 = jVar.a();
        this.j = new w0(context, zVar, new o3((a0.g) a12.a, null, (String) a12.b, (String) a12.c, aVar));
    }

    public final void a() {
        Object obj = this.b;
        g gVar = this.o;
        p6.m.c(gVar.y);
        this.m = null;
        i(m6.a.f);
        if (this.k) {
            com.google.android.gms.internal.cast.z zVar = gVar.y;
            a aVar = this.c;
            zVar.removeMessages(11, aVar);
            gVar.y.removeMessages(9, aVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            g2.x xVar = ((v0) it.next()).a;
            if (j((m6.c[]) xVar.d) != null) {
                it.remove();
            } else {
                try {
                    ((p) ((ci.a) xVar.e).c).accept(obj, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    ((p6.d) obj).h("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e10) {
                    e = e10;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e11) {
                    e = e11;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i3) {
        p6.m.c(this.o.y);
        this.m = null;
        this.k = true;
        String str = ((p6.d) this.b).f;
        z0 z0Var = this.d;
        z0Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        z0Var.b(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.c;
        g gVar = this.o;
        com.google.android.gms.internal.cast.z zVar = gVar.y;
        zVar.sendMessageDelayed(Message.obtain(zVar, 9, aVar), 5000L);
        com.google.android.gms.internal.cast.z zVar2 = gVar.y;
        zVar2.sendMessageDelayed(Message.obtain(zVar2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((v0) it.next()).getClass();
        }
    }

    public final boolean c(m6.a aVar) {
        synchronized (g.H) {
            this.o.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            d1 d1Var = (d1) arrayList.get(i3);
            if (!((p6.d) this.b).r()) {
                return;
            }
            if (e(d1Var)) {
                linkedList.remove(d1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(d1 d1Var) {
        if (!(d1Var instanceof t0)) {
            z0 z0Var = this.d;
            com.google.android.gms.common.api.c cVar = this.b;
            d1Var.c(z0Var, cVar.f());
            try {
                d1Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                ((p6.d) cVar).h("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        t0 t0Var = (t0) d1Var;
        m6.c j10 = j(t0Var.f(this));
        if (j10 == null) {
            z0 z0Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            d1Var.c(z0Var2, cVar2.f());
            try {
                d1Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                ((p6.d) cVar2).h("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j10.a;
        long b10 = j10.b();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b10).length() + 2);
        com.google.android.recaptcha.internal.a.s(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(b10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        g gVar = this.o;
        if (!gVar.E || !t0Var.g(this)) {
            t0Var.b(new com.google.android.gms.common.api.r(j10));
            return true;
        }
        int h = t0Var.h(this);
        k0 k0Var = new k0(this.c, j10);
        ArrayList arrayList = this.l;
        int indexOf = arrayList.indexOf(k0Var);
        if (indexOf >= 0) {
            k0 k0Var2 = (k0) arrayList.get(indexOf);
            gVar.y.removeMessages(15, k0Var2);
            gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 15, k0Var2), 5000L);
            return false;
        }
        arrayList.add(k0Var);
        gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 15, k0Var), 5000L);
        gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 16, k0Var), 120000L);
        m6.a aVar = new m6.a(1, 2, null, null, Integer.valueOf(h));
        if (c(aVar)) {
            String str2 = j10.a;
            long b11 = j10.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(b11).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(b11);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!gVar.g(aVar, this.i)) {
            return false;
        }
        String str3 = j10.a;
        long b12 = j10.b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(b12).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(b12);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z10) {
        p6.m.c(this.o.y);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            if (!z10 || d1Var.a == 2) {
                if (status != null) {
                    d1Var.a(status);
                } else {
                    d1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        p6.m.c(this.o.y);
        f(status, null, false);
    }

    public final void h() {
        g gVar = this.o;
        com.google.android.gms.internal.cast.z zVar = gVar.y;
        a aVar = this.c;
        zVar.removeMessages(12, aVar);
        com.google.android.gms.internal.cast.z zVar2 = gVar.y;
        zVar2.sendMessageDelayed(zVar2.obtainMessage(12, aVar), gVar.a);
    }

    public final void i(m6.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (p6.m.k(aVar, m6.a.f)) {
            p6.d dVar = (p6.d) this.b;
            if (!dVar.r() || dVar.g == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final m6.c j(m6.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            p6.h0 h0Var = ((p6.d) this.b).B;
            m6.c[] cVarArr2 = h0Var == null ? null : h0Var.b;
            if (cVarArr2 == null) {
                cVarArr2 = new m6.c[0];
            }
            a0.f fVar = new a0.f(cVarArr2.length);
            for (m6.c cVar : cVarArr2) {
                fVar.put(cVar.a, Long.valueOf(cVar.b()));
            }
            for (m6.c cVar2 : cVarArr) {
                Long l10 = (Long) fVar.get(cVar2.a);
                if (l10 == null || l10.longValue() < cVar2.b()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void k(m6.a aVar) {
        p6.m.c(this.o.y);
        Object obj = this.b;
        String name = obj.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        ((p6.d) obj).h(sb2.toString());
        l(aVar, null);
    }

    public final void l(m6.a aVar, RuntimeException runtimeException) {
        q8.a aVar2;
        g gVar = this.o;
        p6.m.c(gVar.y);
        w0 w0Var = this.j;
        if (w0Var != null && (aVar2 = w0Var.i) != null) {
            aVar2.a();
        }
        p6.m.c(this.o.y);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(aVar);
        if ((this.b instanceof r6.e) && aVar.b != 24) {
            gVar.b = true;
            com.google.android.gms.internal.cast.z zVar = gVar.y;
            zVar.sendMessageDelayed(zVar.obtainMessage(19), 300000L);
        }
        int i3 = aVar.b;
        if (i3 == 4) {
            g(g.G);
            return;
        }
        if (i3 == 25) {
            g(g.d(this.c, aVar));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.m = aVar;
            return;
        }
        if (runtimeException != null) {
            p6.m.c(gVar.y);
            f(null, runtimeException, false);
            return;
        }
        if (!gVar.E) {
            g(g.d(this.c, aVar));
            return;
        }
        a aVar3 = this.c;
        f(g.d(aVar3, aVar), null, true);
        if (linkedList.isEmpty() || c(aVar) || gVar.g(aVar, this.i)) {
            return;
        }
        if (aVar.b == 18) {
            this.k = true;
        }
        if (!this.k) {
            g(g.d(aVar3, aVar));
        } else {
            com.google.android.gms.internal.cast.z zVar2 = gVar.y;
            zVar2.sendMessageDelayed(Message.obtain(zVar2, 9, aVar3), 5000L);
        }
    }

    public final void m(d1 d1Var) {
        p6.m.c(this.o.y);
        boolean r5 = ((p6.d) this.b).r();
        LinkedList linkedList = this.a;
        if (r5) {
            if (e(d1Var)) {
                h();
                return;
            } else {
                linkedList.add(d1Var);
                return;
            }
        }
        linkedList.add(d1Var);
        m6.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            o();
        } else {
            l(this.m, null);
        }
    }

    public final void n() {
        g gVar = this.o;
        p6.m.c(gVar.y);
        Status status = g.F;
        g(status);
        this.d.b(status, false);
        for (m mVar : (m[]) this.f.keySet().toArray(new m[0])) {
            m(new b1(mVar, new TaskCompletionSource()));
        }
        i(new m6.a(4, null, null));
        if (((p6.d) this.b).r()) {
            gVar.y.post(new a3.o(new android.support.v4.media.c(this, 11), 16));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        g gVar = this.o;
        p6.m.c(gVar.y);
        com.google.android.gms.common.api.c cVar = this.b;
        p6.d dVar = (p6.d) cVar;
        if (dVar.r() || dVar.s()) {
            return;
        }
        try {
            int h12 = gVar.h.h1(gVar.e, cVar);
            if (h12 != 0) {
                m6.a aVar = new m6.a(h12, null, null);
                String name = cVar.getClass().getName();
                String aVar2 = aVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + aVar2.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(aVar2);
                Log.w("GoogleApiManager", sb2.toString());
                l(aVar, null);
                return;
            }
            m0 m0Var = new m0(gVar, cVar, this.c);
            if (cVar.f()) {
                w0 w0Var = this.j;
                p6.m.g(w0Var);
                q8.a aVar3 = w0Var.i;
                if (aVar3 != null) {
                    aVar3.a();
                }
                o3 o3Var = w0Var.f;
                o3Var.g = Integer.valueOf(System.identityHashCode(w0Var));
                a6.b bVar = w0Var.d;
                Context context = w0Var.b;
                Handler handler = w0Var.c;
                w0Var.i = (q8.a) bVar.a(context, handler.getLooper(), o3Var, (p8.a) o3Var.f, w0Var, w0Var);
                w0Var.j = m0Var;
                Set set = w0Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new a3.o(w0Var));
                } else {
                    q8.a aVar4 = w0Var.i;
                    aVar4.getClass();
                    aVar4.c(new p6.c(aVar4));
                }
            }
            try {
                cVar.c(m0Var);
            } catch (SecurityException e10) {
                l(new m6.a(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            l(new m6.a(10, null, null), e11);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        g gVar = this.o;
        if (Looper.myLooper() == gVar.y.getLooper()) {
            a();
        } else {
            gVar.y.post(new a3.o(this, 15));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(m6.a aVar) {
        l(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i3) {
        g gVar = this.o;
        if (Looper.myLooper() == gVar.y.getLooper()) {
            b(i3);
        } else {
            gVar.y.post(new androidx.emoji2.text.j(this, i3, 1));
        }
    }
}
