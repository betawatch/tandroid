package m4;

import ai.x9;
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
import b2.v1;
import ig.d2;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.q8;
import v7.u6;
import v7.w6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class f0 {
    public static final s1 B = new s1(1);
    public static final d9.u C = w6.a(new a3.s(5));
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final c0 c;
    public final b0 d;
    public final pb.a e;
    public final Context f;
    public final i1 g;
    public final p0 h;
    public final String i;
    public final t1 j;
    public final x k;
    public final Handler l;
    public final e2.d m;
    public final y n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final e9.n0 r;
    public k1 s;
    public m1 t;
    public d0 u;
    public boolean v;
    public final long w;
    public boolean x;
    public final e9.n0 y;
    public final e9.n0 z;

    public f0(x xVar, Context context, String str, b2.f1 f1Var, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, pb.a aVar, Bundle bundle, Bundle bundle2, e2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        e2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "]");
        this.k = xVar;
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
        i1 i1Var = new i1(this);
        this.g = i1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper A0 = f1Var.A0();
        Handler handler = new Handler(A0);
        this.l = handler;
        this.s = k1.H;
        this.c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.b = build;
        p0 p0Var = new p0(this, build, handler, bundle, z10, n0Var, n0Var2, t.e, t.f, bundle2);
        this.h = p0Var;
        this.j = new t1(Process.myUid(), context.getPackageName(), i1Var, bundle, ((n4.n) p0Var.m.b).c.b);
        m1 m1Var = new m1(f1Var);
        this.t = m1Var;
        e2.m0.W(handler, new hi.t(28, this, m1Var));
        this.w = 3000L;
        this.n = new y(this, 2);
        e2.m0.W(handler, new y(this, 3));
    }

    public static void a(f0 f0Var) {
        synchronized (f0Var.a) {
            try {
                if (f0Var.v) {
                    return;
                }
                r1 R0 = f0Var.t.R0();
                if (!f0Var.c.hasMessages(1)) {
                    r1 r1Var = f0Var.s.c;
                    b2.e1 e1Var = R0.a;
                    int i10 = e1Var.b;
                    b2.e1 e1Var2 = r1Var.a;
                    if (i10 == e1Var2.b && e1Var.e == e1Var2.e && e1Var.h == e1Var2.h && e1Var.i == e1Var2.i) {
                        qi.e eVar = f0Var.g.b;
                        e9.n0 p5 = eVar.p();
                        for (int i11 = 0; i11 < p5.size(); i11++) {
                            v vVar = (v) p5.get(i11);
                            eVar.r(vVar);
                            f0Var.c(vVar, new a0(R0, eVar.x(vVar, 16), eVar.x(vVar, 17), vVar));
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

    public static boolean k(v vVar) {
        return vVar != null && Objects.equals(vVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e = this.k.a.e();
        if (e == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode != 79) {
            if (keyCode == 126) {
                eVar = new e(this, e, 9);
            } else if (keyCode != 127) {
                if (keyCode != 272) {
                    if (keyCode != 273) {
                        switch (keyCode) {
                            case 85:
                                break;
                            case 86:
                                eVar = new e(this, e, 6);
                                break;
                            case 87:
                                break;
                            case 88:
                                break;
                            case 89:
                                eVar = new e(this, e, 5);
                                break;
                            case 90:
                                eVar = new e(this, e, 4);
                                break;
                            default:
                                return false;
                        }
                    }
                    eVar = new e(this, e, 3);
                }
                eVar = new e(this, e, 2);
            } else {
                eVar = new e(this, e, 1);
            }
            e2.m0.W(this.l, new x9(this, z11, e, eVar, 7));
            return true;
        }
        eVar = this.t.t() ? new e(this, e, 7) : new e(this, e, 8);
        e2.m0.W(this.l, new x9(this, z11, e, eVar, 7));
        return true;
    }

    public final void c(v vVar, e0 e0Var) {
        int i10;
        i1 i1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.u t10 = i1Var.b.t(vVar);
            if (t10 != null) {
                i10 = t10.e();
            } else if (!h(vVar)) {
                return;
            } else {
                i10 = 0;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                e0Var.e(uVar, i10);
            }
        } catch (DeadObjectException unused) {
            i1Var.b.E(vVar);
        } catch (RemoteException e) {
            e2.a.m("MediaSessionImpl", "Exception in " + vVar, e);
        }
    }

    public final void d(e0 e0Var) {
        e9.n0 p5 = this.g.b.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            c((v) p5.get(i10), e0Var);
        }
        try {
            e0Var.e(this.h.i, 0);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final v e() {
        e9.n0 p5 = this.g.b.p();
        for (int i10 = 0; i10 < p5.size(); i10++) {
            v vVar = (v) p5.get(i10);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(b2.b1 b1Var) {
        this.c.a(false, false);
        d(new j5.b(b1Var, 12));
        try {
            n0 n0Var = this.h.i;
            b2.p pVar = this.s.s;
            n0Var.k();
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final void g(v vVar, boolean z10) {
        if (o()) {
            boolean z11 = this.t.o0(16) && this.t.v() != null;
            boolean z12 = this.t.o0(31) || this.t.o0(20);
            v s10 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            u6.p(!false);
            sparseBooleanArray.append(1, true);
            u6.p(!false);
            new b2.b1(new b2.u(sparseBooleanArray));
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
            j9.v vVar2 = new j9.v();
            vVar2.n(unsupportedOperationException);
            androidx.activity.o oVar = new androidx.activity.o();
            oVar.c = this;
            oVar.b = s10;
            oVar.a = z10;
            vVar2.a(new j9.u(0, vVar2, oVar), new i2.f0(this, 2));
        }
    }

    public final boolean h(v vVar) {
        return this.g.b.w(vVar) || this.h.f.w(vVar);
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

    public final j9.y l(v vVar, List list) {
        s(vVar);
        this.e.getClass();
        return pb.a.p0(list);
    }

    public final t m(v vVar) {
        e9.n0 n0Var;
        boolean z10 = this.x;
        e9.n0 n0Var2 = null;
        p0 p0Var = this.h;
        if (z10 && k(vVar)) {
            p0Var.getClass();
            p1 p1Var = t.e;
            p1 p1Var2 = p0Var.w;
            p1Var2.getClass();
            b2.b1 b1Var = p0Var.x;
            b1Var.getClass();
            if (p0Var.v.isEmpty()) {
                e9.n0 n0Var3 = p0Var.u;
                e9.n0 u10 = n0Var3 == null ? null : e9.n0.u(n0Var3);
                n0Var = null;
                n0Var2 = u10;
            } else {
                e9.n0 n0Var4 = p0Var.v;
                n0Var = n0Var4 == null ? null : e9.n0.u(n0Var4);
            }
            return new t(p1Var2, b1Var, n0Var2, n0Var);
        }
        this.e.getClass();
        b2.b1 b1Var2 = t.f;
        p1 p1Var3 = t.e;
        t tVar = new t(p1Var3, b1Var2, null, null);
        if (i(vVar)) {
            this.x = true;
            x xVar = this.k;
            e9.n0 n0Var5 = xVar.a.z;
            if (n0Var5.isEmpty()) {
                p0Var.u = xVar.a.y;
            } else {
                p0Var.v = n0Var5;
                p0Var.N();
            }
            f0 f0Var = p0Var.g;
            int i10 = 0;
            boolean z11 = p0Var.x.a(17) != b1Var2.a(17);
            p0Var.w = p1Var3;
            p0Var.x = b1Var2;
            if (!p0Var.v.isEmpty()) {
                p0Var.N();
            }
            if (z11) {
                e2.m0.W(f0Var.l, new j0(p0Var, f0Var.t, i10));
                return tVar;
            }
            p0Var.O(f0Var.t);
        }
        return tVar;
    }

    public final j9.w n(v vVar) {
        s(vVar);
        this.e.getClass();
        return q8.b(new s1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        try {
            return ((Boolean) v7.h0.a(new j5.b(this, 11)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void p(v vVar) {
        s(vVar);
        this.e.getClass();
    }

    public final j9.e0 q(v vVar, List list, final int i10, final long j10) {
        s(vVar);
        this.e.getClass();
        return e2.m0.g0(pb.a.p0(list), new j9.q() { // from class: m4.s
            @Override // j9.q
            public final j9.y apply(Object obj) {
                return q8.b(new w(j10, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + e2.m0.a + "] [" + b2.p0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                d2 d2Var = b0Var.a;
                if (d2Var != null) {
                    b0Var.removeCallbacks(d2Var);
                    b0Var.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e2.m0.W(this.l, new y(this, 0));
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
                androidx.mediarouter.app.f fVar = p0Var.n;
                if (fVar != null) {
                    f0Var.f.unregisterReceiver(fVar);
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
                    } catch (Exception e7) {
                        e2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                    }
                }
                mediaSession.setCallback(null);
                nVar.b.a.clear();
                mediaSession.release();
                i1 i1Var = this.g;
                Set set = i1Var.c;
                qi.e eVar = i1Var.b;
                e9.n0 p5 = eVar.p();
                int size = p5.size();
                while (i11 < size) {
                    Object obj = p5.get(i11);
                    i11++;
                    v vVar = (v) obj;
                    eVar.E(vVar);
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
                i1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e;
        return (this.x && k(vVar) && (e = e()) != null) ? e : vVar;
    }

    public final void t() {
        Handler handler = this.l;
        y yVar = this.n;
        handler.removeCallbacks(yVar);
        if (this.q) {
            long j10 = this.w;
            if (j10 > 0) {
                if (this.t.j0() || this.t.c()) {
                    handler.postDelayed(yVar, j10);
                }
            }
        }
    }

    public final void u(m1 m1Var, m1 m1Var2) {
        p0 p0Var = this.h;
        this.t = m1Var2;
        if (m1Var != null) {
            d0 d0Var = this.u;
            d0Var.getClass();
            m1Var.C(d0Var);
        }
        d0 d0Var2 = new d0(this, m1Var2);
        m1Var2.p0(d0Var2);
        this.u = d0Var2;
        try {
            p0Var.i.m(0, m1Var, m1Var2);
        } catch (RemoteException e) {
            e2.a.d("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (m1Var == null) {
            ((n4.n) p0Var.m.b).a.setActive(true);
        }
        this.s = new k1(m1Var2.W(), 0, m1Var2.R0(), m1Var2.Q0(), m1Var2.Q0(), 0, m1Var2.h(), m1Var2.l(), m1Var2.D0(), m1Var2.D(), m1Var2.T0(), 0, m1Var2.o0(18) ? m1Var2.i0() : b2.r0.L, m1Var2.o0(22) ? m1Var2.F() : 1.0f, 1.0f, m1Var2.o0(21) ? m1Var2.H() : b2.f.i, 0, m1Var2.o0(28) ? m1Var2.k0() : d2.c.d, m1Var2.J(), m1Var2.o0(23) ? m1Var2.m() : 0, m1Var2.o0(23) && m1Var2.z0(), m1Var2.t(), 1, m1Var2.w0(), m1Var2.d(), m1Var2.j0(), m1Var2.c(), m1Var2.U0(), m1Var2.O0(), m1Var2.Z(), m1Var2.y(), m1Var2.o0(30) ? m1Var2.h0() : v1.b, m1Var2.E0());
        f(m1Var2.s());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
