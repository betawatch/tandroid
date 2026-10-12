package m4;

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
import b2.w1;
import bi.h4;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ji.m5;
import ji.v2;
import v7.q8;
import v7.u6;
import v7.w6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class f0 {
    public static final t1 B = new t1(1);
    public static final d9.u C = w6.a(new a3.s(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final c0 c;
    public final b0 d;
    public final pb.a e;
    public final Context f;
    public final j1 g;
    public final q0 h;
    public final String i;
    public final u1 j;
    public final y k;
    public final Handler l;
    public final e2.d m;
    public final z n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final e9.n0 r;
    public l1 s;
    public n1 t;
    public d0 u;
    public boolean v;
    public final long w;
    public boolean x;
    public final e9.n0 y;
    public final e9.n0 z;

    public f0(y yVar, Context context, String str, b2.g1 g1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "]");
        this.k = yVar;
        this.f = context;
        this.i = str2;
        this.y = n0Var;
        this.z = n0Var2;
        this.r = n0Var3;
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
        q0 q0Var = new q0(this, build, handler, bundle, z10, n0Var, n0Var2, u.e, u.f, bundle2);
        this.h = q0Var;
        this.j = new u1(Process.myUid(), context.getPackageName(), j1Var, bundle, ((n4.n) q0Var.m.b).c.b);
        n1 n1Var = new n1(g1Var);
        this.t = n1Var;
        e2.m0.W(handler, new v2(14, this, n1Var));
        this.w = 3000L;
        this.n = new z(this, 2);
        e2.m0.W(handler, new z(this, 3));
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
                        qi.e eVar = f0Var.g.b;
                        e9.n0 m10 = eVar.m();
                        for (int i11 = 0; i11 < m10.size(); i11++) {
                            w wVar = (w) m10.get(i11);
                            eVar.o(wVar);
                            f0Var.c(wVar, new a0(R0, eVar.u(wVar, 16), eVar.u(wVar, 17), wVar));
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
            e2.m0.W(this.l, new h4(this, z11, e, fVar, 7));
            return true;
        }
        fVar = this.t.t() ? new f(this, e, 7) : new f(this, e, 8);
        e2.m0.W(this.l, new h4(this, z11, e, fVar, 7));
        return true;
    }

    public final void c(w wVar, e0 e0Var) {
        int i10;
        j1 j1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.v q6 = j1Var.b.q(wVar);
            if (q6 != null) {
                i10 = q6.e();
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
            j1Var.b.C(wVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + wVar, e);
        }
    }

    public final void d(e0 e0Var) {
        e9.n0 m10 = this.g.b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            c((w) m10.get(i10), e0Var);
        }
        try {
            e0Var.d(this.h.i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final w e() {
        e9.n0 m10 = this.g.b.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            w wVar = (w) m10.get(i10);
            if (i(wVar)) {
                return wVar;
            }
        }
        return null;
    }

    public final void f(b2.c1 c1Var) {
        this.c.a(false, false);
        d(new m5(c1Var, 3));
        try {
            o0 o0Var = this.h.i;
            b2.q qVar = this.s.s;
            o0Var.k();
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
            u6.p(!false);
            sparseBooleanArray.append(1, true);
            u6.p(!false);
            new b2.c1(new b2.v(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    e2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                e2.m0.J(this.t);
                if (z10) {
                    p(s10);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            j9.v vVar = new j9.v();
            vVar.n(unsupportedOperationException);
            androidx.activity.o oVar = new androidx.activity.o();
            oVar.c = this;
            oVar.b = s10;
            oVar.a = z10;
            vVar.a(new j9.u(0, vVar, oVar), new i2.f0(this, 2));
        }
    }

    public final boolean h(w wVar) {
        return this.g.b.t(wVar) || this.h.f.t(wVar);
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

    public final j9.y l(w wVar, List list) {
        s(wVar);
        this.e.getClass();
        return pb.a.p0(list);
    }

    public final u m(w wVar) {
        e9.n0 n0Var;
        boolean z10 = this.x;
        e9.n0 n0Var2 = null;
        q0 q0Var = this.h;
        if (z10 && k(wVar)) {
            q0Var.getClass();
            q1 q1Var = u.e;
            q1 q1Var2 = q0Var.w;
            q1Var2.getClass();
            b2.c1 c1Var = q0Var.x;
            c1Var.getClass();
            if (q0Var.v.isEmpty()) {
                e9.n0 n0Var3 = q0Var.u;
                e9.n0 u10 = n0Var3 == null ? null : e9.n0.u(n0Var3);
                n0Var = null;
                n0Var2 = u10;
            } else {
                e9.n0 n0Var4 = q0Var.v;
                n0Var = n0Var4 == null ? null : e9.n0.u(n0Var4);
            }
            return new u(q1Var2, c1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.c1 c1Var2 = u.f;
        q1 q1Var3 = u.e;
        u uVar = new u(q1Var3, c1Var2, null, null);
        if (i(wVar)) {
            this.x = true;
            y yVar = this.k;
            e9.n0 n0Var5 = yVar.a.z;
            if (n0Var5.isEmpty()) {
                q0Var.u = yVar.a.y;
            } else {
                q0Var.v = n0Var5;
                q0Var.N();
            }
            f0 f0Var = q0Var.g;
            int i10 = 0;
            boolean z11 = q0Var.x.a(17) != c1Var2.a(17);
            q0Var.w = q1Var3;
            q0Var.x = c1Var2;
            if (!q0Var.v.isEmpty()) {
                q0Var.N();
            }
            if (z11) {
                e2.m0.W(f0Var.l, new j0(q0Var, f0Var.t, i10));
                return uVar;
            }
            q0Var.O(f0Var.t);
        }
        return uVar;
    }

    public final j9.w n(w wVar) {
        s(wVar);
        this.e.getClass();
        return q8.b(new t1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) v7.h0.a(new m5(this, 2)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void p(w wVar) {
        s(wVar);
        this.e.getClass();
    }

    public final j9.e0 q(w wVar, List list, final int i10, final long j10) {
        s(wVar);
        this.e.getClass();
        return e2.m0.g0(pb.a.p0(list), new j9.q() { // from class: m4.t
            @Override // j9.q
            public final j9.y apply(Object obj) {
                return q8.b(new x(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "] [" + b2.q0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                hg.t tVar = b0Var.a;
                if (tVar != null) {
                    b0Var.removeCallbacks(tVar);
                    b0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e2.m0.W(this.l, new z(this, 0));
                } catch (Exception e) {
                    e2.a.m("MediaSessionImpl", "Exception thrown while closing", e);
                }
                q0 q0Var = this.h;
                ComponentName componentName = q0Var.o;
                f0 f0Var = q0Var.g;
                n4.s sVar = q0Var.m;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.n) sVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", f0Var.b);
                        intent.setComponent(componentName);
                        ((n4.n) sVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(f0Var.f, 0, intent, q0.y));
                    }
                }
                androidx.mediarouter.app.f fVar = q0Var.n;
                if (fVar != null) {
                    f0Var.f.unregisterReceiver(fVar);
                }
                b bVar = q0Var.l;
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
                    } catch (Exception e7) {
                        e2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                    }
                }
                mediaSession.setCallback(null);
                nVar.b.a.clear();
                mediaSession.release();
                j1 j1Var = this.g;
                Set set = j1Var.c;
                qi.e eVar = j1Var.b;
                e9.n0 m10 = eVar.m();
                int size = m10.size();
                while (i11 < size) {
                    Object obj = m10.get(i11);
                    i11++;
                    w wVar = (w) obj;
                    eVar.C(wVar);
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
        q0 q0Var = this.h;
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
            q0Var.i.m(0, n1Var, n1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (n1Var == null) {
            ((n4.n) q0Var.m.b).a.setActive(true);
        }
        this.s = new l1(n1Var2.W(), 0, n1Var2.R0(), n1Var2.Q0(), n1Var2.Q0(), 0, n1Var2.h(), n1Var2.l(), n1Var2.D0(), n1Var2.D(), n1Var2.T0(), 0, n1Var2.o0(18) ? n1Var2.i0() : b2.s0.L, n1Var2.o0(22) ? n1Var2.F() : 1.0f, 1.0f, n1Var2.o0(21) ? n1Var2.H() : b2.f.i, 0, n1Var2.o0(28) ? n1Var2.k0() : d2.c.d, n1Var2.J(), n1Var2.o0(23) ? n1Var2.m() : 0, n1Var2.o0(23) && n1Var2.z0(), n1Var2.t(), 1, n1Var2.w0(), n1Var2.d(), n1Var2.j0(), n1Var2.c(), n1Var2.U0(), n1Var2.O0(), n1Var2.Z(), n1Var2.y(), n1Var2.o0(30) ? n1Var2.h0() : w1.b, n1Var2.E0());
        f(n1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
