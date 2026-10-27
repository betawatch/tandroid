package m4;

import a8.ac;
import a8.qd;
import a8.w9;
import a8.yb;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import bi.s9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class f0 {
    public static final t1 B = new t1(1);
    public static final e9.t C = ac.a(new a3.s(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final c0 c;
    public final b0 d;
    public final qb.a e;
    public final Context f;
    public final j1 g;
    public final p0 h;
    public final String i;
    public final u1 j;
    public final y k;
    public final Handler l;
    public final e2.d m;
    public final z n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final f9.i0 r;
    public l1 s;
    public n1 t;
    public d0 u;
    public boolean v;
    public final long w;
    public boolean x;
    public final f9.i0 y;
    public final f9.i0 z;

    public f0(y yVar, Context context, String str, b2.g1 g1Var, f9.i0 i0Var, f9.i0 i0Var2, f9.i0 i0Var3, qb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.n0.a + "]");
        this.k = yVar;
        this.f = context;
        this.i = str2;
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.m = dVar;
        this.p = z10;
        this.q = z11;
        j1 j1Var = new j1(this);
        this.g = j1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper A0 = g1Var.A0();
        Handler handler = new Handler(A0);
        this.l = handler;
        this.s = l1.H;
        this.c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, i0Var, i0Var2, u.e, u.f, bundle2);
        this.h = p0Var;
        this.j = new u1(Process.myUid(), context.getPackageName(), j1Var, bundle, ((n4.n) p0Var.m.b).c.b);
        n1 n1Var = new n1(g1Var);
        this.t = n1Var;
        e2.n0.W(handler, new k2.e0(10, this, n1Var));
        this.w = 3000L;
        this.n = new z(this, 2);
        e2.n0.W(handler, new z(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.a) {
            try {
                if (f0Var.v) {
                    return;
                }
                s1 R0 = f0Var.t.R0();
                if (!f0Var.c.hasMessages(1)) {
                    s1 s1Var = f0Var.s.c;
                    b2.f1 f1Var = R0.a;
                    int i10 = f1Var.b;
                    b2.f1 f1Var2 = s1Var.a;
                    if (i10 == f1Var2.b && f1Var.e == f1Var2.e && f1Var.h == f1Var2.h && f1Var.i == f1Var2.i) {
                        com.google.firebase.messaging.q qVar = f0Var.g.b;
                        f9.i0 k10 = qVar.k();
                        for (int i11 = 0; i11 < k10.size(); i11++) {
                            w wVar = (w) k10.get(i11);
                            qVar.n(wVar);
                            f0Var.c(wVar, new a0(R0, qVar.v(wVar, 16), qVar.v(wVar, 17), wVar));
                        }
                        try {
                            f0Var.h.i.f(0, R0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                f0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(w wVar) {
        return wVar != null && Objects.equals(wVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        f fVar;
        w e = this.k.a.e();
        if (e == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                fVar = new f(this, e, 9);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case 85:
                                break;
                            case 86:
                                fVar = new f(this, e, 6);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                fVar = new f(this, e, 5);
                                break;
                            case 90:
                                fVar = new f(this, e, 4);
                                break;
                            default:
                                return false;
                        }
                    }
                    fVar = new f(this, e, 3);
                }
                fVar = new f(this, e, 2);
            } else {
                fVar = new f(this, e, 1);
            }
            e2.n0.W(this.l, new s9(this, z11, e, fVar, 7));
            return true;
        }
        fVar = this.t.t() ? new f(this, e, 7) : new f(this, e, 8);
        e2.n0.W(this.l, new s9(this, z11, e, fVar, 7));
        return true;
    }

    public final void c(w wVar, e0 e0Var) {
        int i10;
        j1 j1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.u p10 = j1Var.b.p(wVar);
            if (p10 != null) {
                i10 = p10.e();
            } else if (!h(wVar)) {
                return;
            } else {
                i10 = 0;
            }
            v vVar = wVar.d;
            if (vVar != null) {
                e0Var.d(vVar, i10);
            }
        } catch (DeadObjectException unused) {
            j1Var.b.B(wVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
        }
    }

    public final void d(e0 e0Var) {
        f9.i0 k10 = this.g.b.k();
        for (int i10 = 0; i10 < k10.size(); i10++) {
            c((w) k10.get(i10), e0Var);
        }
        try {
            e0Var.d(this.h.i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final w e() {
        f9.i0 k10 = this.g.b.k();
        for (int i10 = 0; i10 < k10.size(); i10++) {
            w wVar = (w) k10.get(i10);
            if (i(wVar)) {
                return wVar;
            }
        }
        return null;
    }

    public final void f(b2.c1 c1Var) {
        this.c.a(false, false);
        d(new jg.e1(c1Var, 16));
        try {
            n0 n0Var = this.h.i;
            b2.q qVar = this.s.s;
            n0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(w wVar, boolean z10) {
        if (o()) {
            boolean z11 = this.t.o0(16) && this.t.v() != null;
            boolean z12 = this.t.o0(31) || this.t.o0(20);
            w s10 = s(wVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            yb.p(!false);
            sparseBooleanArray.append(1, true);
            yb.p(!false);
            new b2.c1(new b2.v(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                e2.n0.J(this.t);
                if (z10) {
                    p(s10);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            k9.v vVar = new k9.v();
            vVar.n(unsupportedOperationException);
            androidx.activity.n nVar = new androidx.activity.n();
            nVar.c = this;
            nVar.b = s10;
            nVar.a = z10;
            vVar.a(new k9.u(0, vVar, nVar), new i2.h0(this, 2));
        }
    }

    public final boolean h(w wVar) {
        return this.g.b.u(wVar) || this.h.f.u(wVar);
    }

    public final boolean i(w wVar) {
        return Objects.equals(wVar.a.a.a, this.f.getPackageName()) && wVar.b != 0 && new Bundle(wVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.v;
        }
        return z10;
    }

    public final k9.y l(w wVar, List list) {
        s(wVar);
        this.e.getClass();
        return qb.a.t4(list);
    }

    public final u m(w wVar) {
        f9.i0 i0Var;
        boolean z10 = this.x;
        f9.i0 i0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(wVar)) {
            p0Var.getClass();
            q1 q1Var = u.e;
            q1 q1Var2 = p0Var.w;
            q1Var2.getClass();
            b2.c1 c1Var = p0Var.x;
            c1Var.getClass();
            if (p0Var.v.isEmpty()) {
                f9.i0 i0Var3 = p0Var.u;
                f9.i0 u10 = i0Var3 == null ? null : f9.i0.u(i0Var3);
                i0Var = null;
                i0Var2 = u10;
            } else {
                f9.i0 i0Var4 = p0Var.v;
                i0Var = i0Var4 == null ? null : f9.i0.u(i0Var4);
            }
            return new u(q1Var2, c1Var, i0Var2, i0Var);
        }
        this.e.getClass();
        b2.c1 c1Var2 = u.f;
        q1 q1Var3 = u.e;
        u uVar = new u(q1Var3, c1Var2, null, null);
        if (i(wVar)) {
            this.x = true;
            y yVar = this.k;
            f9.i0 i0Var5 = yVar.a.z;
            if (i0Var5.isEmpty()) {
                p0Var.u = yVar.a.y;
            } else {
                p0Var.v = i0Var5;
                p0Var.N();
            }
            f0 f0Var = p0Var.g;
            int i10 = 0;
            boolean z11 = p0Var.x.a(17) != c1Var2.a(17);
            p0Var.w = q1Var3;
            p0Var.x = c1Var2;
            if (!p0Var.v.isEmpty()) {
                p0Var.N();
            }
            if (z11) {
                e2.n0.W(f0Var.l, new j0(p0Var, f0Var.t, i10));
                return uVar;
            }
            p0Var.O(f0Var.t);
        }
        return uVar;
    }

    public final k9.w n(w wVar) {
        s(wVar);
        this.e.getClass();
        return qd.b(new t1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) w9.a(new jg.e1(this, 15)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void p(w wVar) {
        s(wVar);
        this.e.getClass();
    }

    public final k9.e0 q(w wVar, List list, final int i10, final long j10) {
        s(wVar);
        this.e.getClass();
        return e2.n0.g0(qb.a.t4(list), new k9.q() { // from class: m4.t
            @Override // k9.q
            public final k9.y apply(Object obj) {
                return qd.b(new x(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.n0.a + "] [" + b2.q0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                jg.f1 f1Var = b0Var.a;
                if (f1Var != null) {
                    b0Var.removeCallbacks(f1Var);
                    b0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e2.n0.W(this.l, new z(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                p0 p0Var = this.h;
                ComponentName componentName = p0Var.o;
                f0 f0Var = p0Var.g;
                n4.s sVar = p0Var.m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f, 0, intent, p0.y));
                    }
                }
                androidx.mediarouter.app.g gVar = p0Var.n;
                if (gVar != null) {
                    f0Var.f.unregisterReceiver(gVar);
                }
                b bVar = p0Var.l;
                if (bVar != null && !bVar.f.getAndSet(true)) {
                    bVar.c.execute(new a(bVar, 0));
                }
                n4.n nVar = (n4.n) sVar.b;
                MediaSession mediaSession = nVar.a;
                nVar.f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e10) {
                        e2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                    }
                }
                mediaSession.setCallback(null);
                nVar.b.a.clear();
                mediaSession.release();
                j1 j1Var = this.g;
                Set set = j1Var.c;
                com.google.firebase.messaging.q qVar = j1Var.b;
                f9.i0 k10 = qVar.k();
                int size = k10.size();
                while (i11 < size) {
                    Object obj = k10.get(i11);
                    i11++;
                    w wVar = (w) obj;
                    qVar.B(wVar);
                    v vVar = wVar.d;
                    if (vVar != null) {
                        vVar.g();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    v vVar2 = ((w) it.next()).d;
                    if (vVar2 != null) {
                        vVar2.g();
                    }
                }
                set.clear();
                j1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w s(w wVar) {
        w e;
        return (this.x && k(wVar) && (e = e()) != null) ? e : wVar;
    }

    public final void t() {
        Handler handler = this.l;
        z zVar = this.n;
        handler.removeCallbacks(zVar);
        if (this.q) {
            long j10 = this.w;
            if (j10 > 0) {
                if (this.t.j0() || this.t.c()) {
                    handler.postDelayed(zVar, j10);
                }
            }
        }
    }

    public final void u(n1 n1Var, n1 n1Var2) {
        p0 p0Var = this.h;
        this.t = n1Var2;
        if (n1Var != null) {
            d0 d0Var = this.u;
            d0Var.getClass();
            n1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, n1Var2);
        n1Var2.p0(d0Var2);
        this.u = d0Var2;
        try {
            p0Var.i.m(0, n1Var, n1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (n1Var == null) {
            ((n4.n) p0Var.m.b).a.setActive(true);
        }
        this.s = new l1(n1Var2.W(), 0, n1Var2.R0(), n1Var2.Q0(), n1Var2.Q0(), 0, n1Var2.h(), n1Var2.l(), n1Var2.D0(), n1Var2.D(), n1Var2.T0(), 0, n1Var2.o0(18) ? n1Var2.i0() : b2.s0.L, n1Var2.o0(22) ? n1Var2.F() : 1.0f, 1.0f, n1Var2.o0(21) ? n1Var2.H() : b2.f.i, 0, n1Var2.o0(28) ? n1Var2.k0() : d2.c.d, n1Var2.J(), n1Var2.o0(23) ? n1Var2.m() : 0, n1Var2.o0(23) && n1Var2.z0(), n1Var2.t(), 1, n1Var2.w0(), n1Var2.d(), n1Var2.j0(), n1Var2.c(), n1Var2.U0(), n1Var2.O0(), n1Var2.Z(), n1Var2.y(), n1Var2.o0(30) ? n1Var2.h0() : b2.w1.b, n1Var2.E0());
        f(n1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
