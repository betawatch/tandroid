package com.google.android.gms.common.api.internal;

import a8.sa;
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
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k0 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
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
    public n6.a m = null;
    public int n = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(g gVar, com.google.android.gms.common.api.j jVar) {
        this.o = gVar;
        Looper looper = gVar.y.getLooper();
        i61 a10 = jVar.a();
        a0.g gVar2 = (a0.g) a10.b;
        String str = (String) a10.c;
        String str2 = (String) a10.d;
        q8.a aVar = q8.a.a;
        ga.d dVar = new ga.d(gVar2, null, str, str2, aVar);
        a9.e eVar = jVar.d.a;
        q6.m.h(eVar);
        com.google.android.gms.common.api.c a11 = eVar.a(jVar.a, looper, dVar, jVar.e, this, this);
        nd0 nd0Var = jVar.c;
        if (nd0Var == null || !(a11 instanceof q6.d)) {
            String str3 = jVar.b;
            if (str3 != null && (a11 instanceof q6.d)) {
                ((q6.d) a11).x = str3;
            }
        } else {
            ((q6.d) a11).y = nd0Var;
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
        com.google.android.gms.internal.cast.y yVar = gVar.y;
        i61 a12 = jVar.a();
        this.j = new w0(context, yVar, new ga.d((a0.g) a12.b, null, (String) a12.c, (String) a12.d, aVar));
    }

    public final void a() {
        Object obj = this.b;
        g gVar = this.o;
        q6.m.d(gVar.y);
        this.m = null;
        i(n6.a.f);
        if (this.k) {
            com.google.android.gms.internal.cast.y yVar = gVar.y;
            a aVar = this.c;
            yVar.removeMessages(11, aVar);
            gVar.y.removeMessages(9, aVar);
            this.k = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            h2.w wVar = ((v0) it.next()).a;
            if (j((n6.c[]) wVar.d) != null) {
                it.remove();
            } else {
                try {
                    ((q) ((p) wVar.e).c).accept(obj, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    ((q6.d) obj).j("DeadObjectException thrown while calling register listener method.");
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

    public final void b(int i7) {
        q6.m.d(this.o.y);
        this.m = null;
        this.k = true;
        String str = ((q6.d) this.b).f;
        z0 z0Var = this.d;
        z0Var.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        z0Var.b(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.c;
        g gVar = this.o;
        com.google.android.gms.internal.cast.y yVar = gVar.y;
        yVar.sendMessageDelayed(Message.obtain(yVar, 9, aVar), 5000L);
        com.google.android.gms.internal.cast.y yVar2 = gVar.y;
        yVar2.sendMessageDelayed(Message.obtain(yVar2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((v0) it.next()).getClass();
        }
    }

    public final boolean c(n6.a aVar) {
        synchronized (g.H) {
            this.o.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            d1 d1Var = (d1) arrayList.get(i7);
            if (!((q6.d) this.b).s()) {
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
                ((q6.d) cVar).j("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        t0 t0Var = (t0) d1Var;
        n6.c j3 = j(t0Var.f(this));
        if (j3 == null) {
            z0 z0Var2 = this.d;
            com.google.android.gms.common.api.c cVar2 = this.b;
            d1Var.c(z0Var2, cVar2.f());
            try {
                d1Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                ((q6.d) cVar2).j("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = j3.a;
        long b10 = j3.b();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b10).length() + 2);
        e2.r(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(b10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        g gVar = this.o;
        if (!gVar.E || !t0Var.g(this)) {
            t0Var.b(new com.google.android.gms.common.api.s(j3));
            return true;
        }
        int h = t0Var.h(this);
        l0 l0Var = new l0(this.c, j3);
        ArrayList arrayList = this.l;
        int indexOf = arrayList.indexOf(l0Var);
        if (indexOf >= 0) {
            l0 l0Var2 = (l0) arrayList.get(indexOf);
            gVar.y.removeMessages(15, l0Var2);
            gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 15, l0Var2), 5000L);
            return false;
        }
        arrayList.add(l0Var);
        gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 15, l0Var), 5000L);
        gVar.y.sendMessageDelayed(Message.obtain(gVar.y, 16, l0Var), 120000L);
        n6.a aVar = new n6.a(1, 2, null, null, Integer.valueOf(h));
        if (c(aVar)) {
            String str2 = j3.a;
            long b11 = j3.b();
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
        String str3 = j3.a;
        long b12 = j3.b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(b12).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(b12);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z10) {
        q6.m.d(this.o.y);
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
        q6.m.d(this.o.y);
        f(status, null, false);
    }

    public final void h() {
        g gVar = this.o;
        com.google.android.gms.internal.cast.y yVar = gVar.y;
        a aVar = this.c;
        yVar.removeMessages(12, aVar);
        com.google.android.gms.internal.cast.y yVar2 = gVar.y;
        yVar2.sendMessageDelayed(yVar2.obtainMessage(12, aVar), gVar.a);
    }

    public final void i(n6.a aVar) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (q6.m.l(aVar, n6.a.f)) {
            q6.d dVar = (q6.d) this.b;
            if (!dVar.s() || dVar.g == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final n6.c j(n6.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            q6.h0 h0Var = ((q6.d) this.b).B;
            n6.c[] cVarArr2 = h0Var == null ? null : h0Var.b;
            if (cVarArr2 == null) {
                cVarArr2 = new n6.c[0];
            }
            a0.f fVar = new a0.f(cVarArr2.length);
            for (n6.c cVar : cVarArr2) {
                fVar.put(cVar.a, Long.valueOf(cVar.b()));
            }
            for (n6.c cVar2 : cVarArr) {
                Long l10 = (Long) fVar.get(cVar2.a);
                if (l10 == null || l10.longValue() < cVar2.b()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void k(n6.a aVar) {
        q6.m.d(this.o.y);
        Object obj = this.b;
        String name = obj.getClass().getName();
        String valueOf = String.valueOf(aVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        ((q6.d) obj).j(sb2.toString());
        l(aVar, null);
    }

    public final void l(n6.a aVar, RuntimeException runtimeException) {
        r8.a aVar2;
        g gVar = this.o;
        q6.m.d(gVar.y);
        w0 w0Var = this.j;
        if (w0Var != null && (aVar2 = w0Var.i) != null) {
            aVar2.a();
        }
        q6.m.d(this.o.y);
        this.m = null;
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.h.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(aVar);
        if ((this.b instanceof s6.e) && aVar.b != 24) {
            gVar.b = true;
            com.google.android.gms.internal.cast.y yVar = gVar.y;
            yVar.sendMessageDelayed(yVar.obtainMessage(19), 300000L);
        }
        int i7 = aVar.b;
        if (i7 == 4) {
            g(g.G);
            return;
        }
        if (i7 == 25) {
            g(g.d(this.c, aVar));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.m = aVar;
            return;
        }
        if (runtimeException != null) {
            q6.m.d(gVar.y);
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
            com.google.android.gms.internal.cast.y yVar2 = gVar.y;
            yVar2.sendMessageDelayed(Message.obtain(yVar2, 9, aVar3), 5000L);
        }
    }

    public final void m(d1 d1Var) {
        q6.m.d(this.o.y);
        boolean s5 = ((q6.d) this.b).s();
        LinkedList linkedList = this.a;
        if (s5) {
            if (e(d1Var)) {
                h();
                return;
            } else {
                linkedList.add(d1Var);
                return;
            }
        }
        linkedList.add(d1Var);
        n6.a aVar = this.m;
        if (aVar == null || !aVar.b()) {
            o();
        } else {
            l(this.m, null);
        }
    }

    public final void n() {
        g gVar = this.o;
        q6.m.d(gVar.y);
        Status status = g.F;
        g(status);
        this.d.b(status, false);
        for (m mVar : (m[]) this.f.keySet().toArray(new m[0])) {
            m(new b1(mVar, new TaskCompletionSource()));
        }
        i(new n6.a(4, null, null));
        if (((q6.d) this.b).s()) {
            gVar.y.post(new sa(new ob.c(this, 13), 20));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        g gVar = this.o;
        q6.m.d(gVar.y);
        com.google.android.gms.common.api.c cVar = this.b;
        q6.d dVar = (q6.d) cVar;
        if (dVar.s() || dVar.t()) {
            return;
        }
        try {
            int l02 = gVar.h.l0(gVar.e, cVar);
            if (l02 != 0) {
                n6.a aVar = new n6.a(l02, null, null);
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
            n0 n0Var = new n0(gVar, cVar, this.c);
            if (cVar.f()) {
                w0 w0Var = this.j;
                q6.m.h(w0Var);
                r8.a aVar3 = w0Var.i;
                if (aVar3 != null) {
                    aVar3.a();
                }
                ga.d dVar2 = w0Var.f;
                dVar2.h = Integer.valueOf(System.identityHashCode(w0Var));
                a9.e eVar = w0Var.d;
                Context context = w0Var.b;
                Handler handler = w0Var.c;
                w0Var.i = (r8.a) eVar.a(context, handler.getLooper(), dVar2, (q8.a) dVar2.f, w0Var, w0Var);
                w0Var.j = n0Var;
                Set set = w0Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new sa(w0Var));
                } else {
                    r8.a aVar4 = w0Var.i;
                    aVar4.getClass();
                    aVar4.h(new q6.c(aVar4));
                }
            }
            try {
                cVar.h(n0Var);
            } catch (SecurityException e10) {
                l(new n6.a(10, null, null), e10);
            }
        } catch (IllegalStateException e11) {
            l(new n6.a(10, null, null), e11);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        g gVar = this.o;
        if (Looper.myLooper() == gVar.y.getLooper()) {
            a();
        } else {
            gVar.y.post(new sa(this, 19));
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        l(aVar, null);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        g gVar = this.o;
        if (Looper.myLooper() == gVar.y.getLooper()) {
            b(i7);
        } else {
            gVar.y.post(new androidx.emoji2.text.j(this, i7, 1));
        }
    }
}
