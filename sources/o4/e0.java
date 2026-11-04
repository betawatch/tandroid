package o4;

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
import b8.bc;
import b8.v1;
import b8.yd;
import b8.zb;
import ci.u8;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class e0 {
    public static final r1 B = new r1(1);
    public static final f9.t C = bc.a(new c3.q(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final b0 c;
    public final a0 d;
    public final kb.a e;
    public final Context f;
    public final h1 g;
    public final o0 h;
    public final String i;
    public final s1 j;
    public final x k;
    public final Handler l;
    public final g2.e m;
    public final y n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final g9.i0 r;
    public j1 s;
    public l1 t;
    public c0 u;
    public boolean v;
    public final long w;
    public boolean x;
    public final g9.i0 y;
    public final g9.i0 z;

    public e0(x xVar, Context context, String str, d2.e1 e1Var, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, kb.a aVar, Bundle bundle, Bundle bundle2, g2.e eVar, boolean z10, boolean z11) {
        String str2 = str;
        g2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.a + "]");
        this.k = xVar;
        this.f = context;
        this.i = str2;
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.m = eVar;
        this.p = z10;
        this.q = z11;
        h1 h1Var = new h1(this);
        this.g = h1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper B0 = e1Var.B0();
        Handler handler = new Handler(B0);
        this.l = handler;
        this.s = j1.H;
        this.c = new b0(this, B0);
        this.d = new a0(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = build;
        o0 o0Var = new o0(this, build, handler, bundle, z10, i0Var, i0Var2, t.e, t.f, bundle2);
        this.h = o0Var;
        this.j = new s1(Process.myUid(), context.getPackageName(), h1Var, bundle, ((p4.l) o0Var.n.a).c.b);
        l1 l1Var = new l1(e1Var);
        this.t = l1Var;
        g2.n0.W(handler, new m2.s(12, this, l1Var));
        this.w = 3000L;
        this.n = new y(this, 2);
        g2.n0.W(handler, new y(this, 3));
    }

    public static void a(e0 e0Var) {
        synchronized (e0Var.a) {
            try {
                if (e0Var.v) {
                    return;
                }
                q1 R0 = e0Var.t.R0();
                if (!e0Var.c.hasMessages(1)) {
                    q1 q1Var = e0Var.s.c;
                    d2.d1 d1Var = R0.a;
                    int i3 = d1Var.b;
                    d2.d1 d1Var2 = q1Var.a;
                    if (i3 == d1Var2.b && d1Var.e == d1Var2.e && d1Var.h == d1Var2.h && d1Var.i == d1Var2.i) {
                        ui.f fVar = e0Var.g.b;
                        g9.i0 n4 = fVar.n();
                        for (int i10 = 0; i10 < n4.size(); i10++) {
                            v vVar = (v) n4.get(i10);
                            fVar.p(vVar);
                            e0Var.c(vVar, new z(R0, fVar.w(vVar, 16), fVar.w(vVar, 17), vVar));
                        }
                        try {
                            e0Var.h.j.i(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                e0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        return vVar != null && Objects.equals(vVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.k.a.e();
        if (e10 == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                eVar = new e(this, e10, 9);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case hs.W0 /* 85 */:
                                break;
                            case hs.X0 /* 86 */:
                                eVar = new e(this, e10, 6);
                                break;
                            case hs.Y0 /* 87 */:
                                break;
                            case hs.Z0 /* 88 */:
                                break;
                            case hs.a1 /* 89 */:
                                eVar = new e(this, e10, 5);
                                break;
                            case hs.b1 /* 90 */:
                                eVar = new e(this, e10, 4);
                                break;
                            default:
                                return false;
                        }
                    }
                    eVar = new e(this, e10, 3);
                }
                eVar = new e(this, e10, 2);
            } else {
                eVar = new e(this, e10, 1);
            }
            g2.n0.W(this.l, new u8(this, z11, e10, eVar, 7));
            return true;
        }
        eVar = this.t.u() ? new e(this, e10, 7) : new e(this, e10, 8);
        g2.n0.W(this.l, new u8(this, z11, e10, eVar, 7));
        return true;
    }

    public final void c(v vVar, d0 d0Var) {
        int i3;
        h1 h1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.s s6 = h1Var.b.s(vVar);
            if (s6 != null) {
                i3 = s6.e();
            } else if (!h(vVar)) {
                return;
            } else {
                i3 = 0;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                d0Var.d(uVar, i3);
            }
        } catch (DeadObjectException unused) {
            h1Var.b.K(vVar);
        } catch (RemoteException e10) {
            g2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(d0 d0Var) {
        g9.i0 n4 = this.g.b.n();
        for (int i3 = 0; i3 < n4.size(); i3++) {
            c((v) n4.get(i3), d0Var);
        }
        try {
            d0Var.d(this.h.j, 0);
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        g9.i0 n4 = this.g.b.n();
        for (int i3 = 0; i3 < n4.size(); i3++) {
            v vVar = (v) n4.get(i3);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(d2.a1 a1Var) {
        this.c.a(false, false);
        d(new l5.b(a1Var, 16));
        try {
            m0 m0Var = this.h.j;
            d2.p pVar = this.s.s;
            m0Var.m();
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        if (o()) {
            boolean z11 = this.t.m0(16) && this.t.w() != null;
            boolean z12 = this.t.m0(31) || this.t.m0(20);
            v s6 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            zb.p(!false);
            sparseBooleanArray.append(1, true);
            zb.p(!false);
            d2.a1 a1Var = new d2.a1(new d2.t(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    g2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                g2.n0.J(this.t);
                if (z10) {
                    p(s6);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            l9.v vVar2 = new l9.v();
            vVar2.n(unsupportedOperationException);
            vVar2.b(new l9.u(0, vVar2, new androidx.activity.n(this, s6, z10, a1Var)), new k2.g0(this, 2));
        }
    }

    public final boolean h(v vVar) {
        return this.g.b.t(vVar) || this.h.g.t(vVar);
    }

    public final boolean i(v vVar) {
        return Objects.equals(vVar.a.a.a, this.f.getPackageName()) && vVar.b != 0 && new Bundle(vVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.v;
        }
        return z10;
    }

    public final l9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return kb.a.U4(list);
    }

    public final t m(v vVar) {
        g9.i0 i0Var;
        boolean z10 = this.x;
        g9.i0 i0Var2 = null;
        o0 o0Var = this.h;
        if (z10 && k(vVar)) {
            o0Var.getClass();
            o1 o1Var = t.e;
            o1 o1Var2 = o0Var.x;
            o1Var2.getClass();
            d2.a1 a1Var = o0Var.y;
            a1Var.getClass();
            if (o0Var.w.isEmpty()) {
                g9.i0 i0Var3 = o0Var.v;
                g9.i0 q10 = i0Var3 == null ? null : g9.i0.q(i0Var3);
                i0Var = null;
                i0Var2 = q10;
            } else {
                g9.i0 i0Var4 = o0Var.w;
                i0Var = i0Var4 == null ? null : g9.i0.q(i0Var4);
            }
            return new t(o1Var2, a1Var, i0Var2, i0Var);
        }
        this.e.getClass();
        d2.a1 a1Var2 = t.f;
        o1 o1Var3 = t.e;
        t tVar = new t(o1Var3, a1Var2, null, null);
        if (i(vVar)) {
            this.x = true;
            x xVar = this.k;
            g9.i0 i0Var5 = xVar.a.z;
            if (i0Var5.isEmpty()) {
                o0Var.v = xVar.a.y;
            } else {
                o0Var.w = i0Var5;
                o0Var.o0();
            }
            e0 e0Var = o0Var.h;
            int i3 = 0;
            boolean z11 = o0Var.y.a(17) != a1Var2.a(17);
            o0Var.x = o1Var3;
            o0Var.y = a1Var2;
            if (!o0Var.w.isEmpty()) {
                o0Var.o0();
            }
            if (z11) {
                g2.n0.W(e0Var.l, new i0(o0Var, e0Var.t, i3));
                return tVar;
            }
            o0Var.p0(e0Var.t);
        }
        return tVar;
    }

    public final l9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return yd.b(new r1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) v1.a(new l5.b(this, 15)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public final void p(v vVar) {
        s(vVar);
        this.e.getClass();
    }

    public final l9.e0 q(v vVar, List list, final int i3, final long j10) {
        s(vVar);
        this.e.getClass();
        return g2.n0.g0(kb.a.U4(list), new l9.q() { // from class: o4.s
            @Override // l9.q
            public final l9.y apply(Object obj) {
                return yd.b(new w((List) obj, i3, j10));
            }
        });
    }

    public final void r() {
        g2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + g2.n0.a + "] [" + d2.o0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                lg.y yVar = a0Var.a;
                if (yVar != null) {
                    a0Var.removeCallbacks(yVar);
                    a0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    g2.n0.W(this.l, new y(this, 0));
                } catch (Exception e10) {
                    g2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                o0 o0Var = this.h;
                ComponentName componentName = o0Var.p;
                e0 e0Var = o0Var.h;
                p4.q qVar = o0Var.n;
                int i3 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i3 < 31) {
                    if (componentName == null) {
                        ((p4.l) qVar.a).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", e0Var.b);
                        intent.setComponent(componentName);
                        ((p4.l) qVar.a).a.setMediaButtonReceiver(PendingIntent.getBroadcast(e0Var.f, 0, intent, o0.z));
                    }
                }
                androidx.mediarouter.app.f fVar = o0Var.o;
                if (fVar != null) {
                    e0Var.f.unregisterReceiver(fVar);
                }
                b bVar = o0Var.m;
                if (bVar != null && !bVar.f.getAndSet(true)) {
                    bVar.c.execute(new a(bVar, 0));
                }
                p4.l lVar = (p4.l) qVar.a;
                MediaSession mediaSession = lVar.a;
                lVar.f.kill();
                if (i3 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        g2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                lVar.b.a.clear();
                mediaSession.release();
                h1 h1Var = this.g;
                Set set = h1Var.c;
                ui.f fVar2 = h1Var.b;
                g9.i0 n4 = fVar2.n();
                int size = n4.size();
                while (i10 < size) {
                    Object obj = n4.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    fVar2.K(vVar);
                    u uVar = vVar.d;
                    if (uVar != null) {
                        uVar.g();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    u uVar2 = ((v) it.next()).d;
                    if (uVar2 != null) {
                        uVar2.g();
                    }
                }
                set.clear();
                h1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        return (this.x && k(vVar) && (e10 = e()) != null) ? e10 : vVar;
    }

    public final void t() {
        Handler handler = this.l;
        y yVar = this.n;
        handler.removeCallbacks(yVar);
        if (this.q) {
            long j10 = this.w;
            if (j10 > 0) {
                if (this.t.i0() || this.t.d()) {
                    handler.postDelayed(yVar, j10);
                }
            }
        }
    }

    public final void u(l1 l1Var, l1 l1Var2) {
        o0 o0Var = this.h;
        this.t = l1Var2;
        if (l1Var != null) {
            c0 c0Var = this.u;
            c0Var.getClass();
            l1Var.s(c0Var);
        }
        c0 c0Var2 = new c0(this, l1Var2);
        l1Var2.u0(c0Var2);
        this.u = c0Var2;
        try {
            o0Var.j.o(0, l1Var, l1Var2);
        } catch (RemoteException e10) {
            g2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
        if (l1Var == null) {
            ((p4.l) o0Var.n.a).a.setActive(true);
        }
        this.s = new j1(l1Var2.U(), 0, l1Var2.R0(), l1Var2.Q0(), l1Var2.Q0(), 0, l1Var2.g(), l1Var2.m(), l1Var2.E0(), l1Var2.C(), l1Var2.T0(), 0, l1Var2.m0(18) ? l1Var2.h0() : d2.q0.L, l1Var2.m0(22) ? l1Var2.E() : 1.0f, 1.0f, l1Var2.m0(21) ? l1Var2.G() : d2.f.i, 0, l1Var2.m0(28) ? l1Var2.j0() : f2.c.d, l1Var2.I(), l1Var2.m0(23) ? l1Var2.i() : 0, l1Var2.m0(23) && l1Var2.z0(), l1Var2.u(), 1, l1Var2.t0(), l1Var2.h(), l1Var2.i0(), l1Var2.d(), l1Var2.U0(), l1Var2.O0(), l1Var2.X(), l1Var2.z(), l1Var2.m0(30) ? l1Var2.f0() : d2.v1.b, l1Var2.F0());
        f(l1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
