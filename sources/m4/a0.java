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
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import b2.s1;
import bi.e4;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ji.b5;
import ji.k5;
import v7.l8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class a0 {
    public static final p1 B = new p1(1);
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final x c;
    public final w d;
    public final ob.a e;
    public final Context f;
    public final f1 g;
    public final k0 h;
    public final String i;
    public final q1 j;
    public final t k;
    public final Handler l;
    public final n4.y m;
    public final u n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final e9.i0 r;
    public h1 s;
    public j1 t;
    public y u;
    public boolean v;
    public final long w;
    public boolean x;
    public final e9.i0 y;
    public final e9.i0 z;

    public a0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, ob.a aVar, Bundle bundle, Bundle bundle2, n4.y yVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.a + "]");
        this.k = tVar;
        this.f = context;
        this.i = "pip-media-session";
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = aVar;
        this.A = bundle2;
        this.m = yVar;
        this.p = true;
        this.q = true;
        f1 f1Var = new f1(this);
        this.g = f1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.l = handler;
        this.s = h1.F;
        this.c = new x(this, y02);
        this.d = new w(this, y02);
        Uri build = new Uri.Builder().scheme(a0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        k0 k0Var = new k0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f, bundle2);
        this.h = k0Var;
        this.j = new q1(Process.myUid(), context.getPackageName(), f1Var, bundle, ((n4.r) k0Var.k.b).c.b);
        j1 j1Var = new j1(b1Var);
        this.t = j1Var;
        e2.d0.U(handler, new b5(7, this, j1Var));
        this.w = 3000L;
        this.n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(a0 a0Var) {
        synchronized (a0Var.a) {
            try {
                if (a0Var.v) {
                    return;
                }
                final o1 O0 = a0Var.t.O0();
                if (!a0Var.c.hasMessages(1)) {
                    o1 o1Var = a0Var.s.c;
                    b2.a1 a1Var = O0.a;
                    int i10 = a1Var.b;
                    b2.a1 a1Var2 = o1Var.a;
                    if (i10 == a1Var2.b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.i == a1Var2.i) {
                        fg.f fVar = a0Var.g.b;
                        e9.i0 t10 = fVar.t();
                        for (int i11 = 0; i11 < t10.size(); i11++) {
                            final r rVar = (r) t10.get(i11);
                            fVar.w(rVar);
                            final boolean C = fVar.C(rVar, 16);
                            final boolean C2 = fVar.C(rVar, 17);
                            a0Var.c(rVar, new z() { // from class: m4.v
                                @Override // m4.z
                                public final void e(q qVar, int i12) {
                                    qVar.e(i12, o1.this, C, C2, rVar.c);
                                }
                            });
                        }
                        try {
                            a0Var.h.i.e(0, O0, true, true, 0);
                        } catch (RemoteException e7) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
                        }
                    }
                }
                a0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(r rVar) {
        return rVar != null && Objects.equals(rVar.a.a.a, "com.android.systemui");
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        b bVar;
        r e7 = this.k.a.e();
        e7.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            bVar = new b(this, e7, 7);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.t.u()) {
                                bVar = new b(this, e7, 6);
                                break;
                            } else {
                                bVar = new b(this, e7, 5);
                                break;
                            }
                        case 86:
                            bVar = new b(this, e7, 4);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            bVar = new b(this, e7, 3);
                            break;
                        case 90:
                            bVar = new b(this, e7, 2);
                            break;
                        default:
                            return false;
                    }
                }
                bVar = new b(this, e7, 1);
            }
            bVar = new b(this, e7, 9);
        } else {
            bVar = new b(this, e7, 8);
        }
        e2.d0.U(this.l, new e4(this, z11, e7, bVar, 6));
        return true;
    }

    public final void c(r rVar, z zVar) {
        int i10;
        f1 f1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.v y3 = f1Var.b.y(rVar);
            if (y3 != null) {
                i10 = y3.e();
            } else if (!h(rVar)) {
                return;
            } else {
                i10 = 0;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                zVar.e(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            f1Var.b.N(rVar);
        } catch (RemoteException e7) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e7);
        }
    }

    public final void d(z zVar) {
        e9.i0 t10 = this.g.b.t();
        for (int i10 = 0; i10 < t10.size(); i10++) {
            c((r) t10.get(i10), zVar);
        }
        try {
            zVar.e(this.h.i, 0);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final r e() {
        e9.i0 t10 = this.g.b.t();
        for (int i10 = 0; i10 < t10.size(); i10++) {
            r rVar = (r) t10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.c.a(false, false);
        d(new k5(x0Var, 3));
        try {
            i0 i0Var = this.h.i;
            b2.l lVar = this.s.q;
            i0Var.k();
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
    }

    public final void g(r rVar, boolean z10) {
        if (o()) {
            boolean z11 = this.t.m0(16) && this.t.w() != null;
            boolean z12 = this.t.m0(31) || this.t.m0(20);
            r s10 = s(rVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            e2.d.g(!false);
            sparseBooleanArray.append(1, true);
            e2.d.g(!false);
            b2.x0 x0Var = new b2.x0(new b2.q(sparseBooleanArray));
            if (z11 || !z12) {
                if (!z11) {
                    e2.a.n("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
                }
                e2.d0.H(this.t);
                if (z10) {
                    p(s10);
                    return;
                }
                return;
            }
            this.e.getClass();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            i9.t tVar = new i9.t();
            tVar.n(unsupportedOperationException);
            tVar.a(new i9.s(0, tVar, new androidx.activity.o(this, s10, z10, x0Var)), new k2.a0(this, 1));
        }
    }

    public final boolean h(r rVar) {
        return this.g.b.B(rVar) || this.h.f.B(rVar);
    }

    public final boolean i(r rVar) {
        return Objects.equals(rVar.a.a.a, this.f.getPackageName()) && rVar.b != 0 && new Bundle(rVar.e).getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.a) {
            z10 = this.v;
        }
        return z10;
    }

    public final i9.w l(r rVar, List list) {
        s(rVar);
        this.e.getClass();
        return ob.a.w3(list);
    }

    public final p m(r rVar) {
        boolean z10 = this.x;
        k0 k0Var = this.h;
        if (z10 && k(rVar)) {
            k0Var.getClass();
            m1 m1Var = p.e;
            m1 m1Var2 = k0Var.u;
            m1Var2.getClass();
            b2.x0 x0Var = k0Var.v;
            x0Var.getClass();
            e9.i0 i0Var = k0Var.s;
            e9.i0 v = i0Var == null ? null : e9.i0.v(i0Var);
            e9.i0 i0Var2 = k0Var.t;
            return new p(m1Var2, x0Var, v, i0Var2 != null ? e9.i0.v(i0Var2) : null);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f;
        m1 m1Var3 = p.e;
        p pVar = new p(m1Var3, x0Var2, null, null);
        if (i(rVar)) {
            this.x = true;
            t tVar = this.k;
            e9.i0 i0Var3 = tVar.a.z;
            int i10 = 0;
            if (i0Var3.isEmpty()) {
                k0Var.s = tVar.a.y;
            } else {
                k0Var.t = i0Var3;
                Bundle bundle = k0Var.r;
                boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z11 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z12) {
                    ((n4.r) k0Var.k.b).a.setExtras(bundle);
                }
            }
            a0 a0Var = k0Var.g;
            Bundle bundle2 = k0Var.r;
            boolean z13 = k0Var.v.a(17) != x0Var2.a(17);
            k0Var.u = m1Var3;
            k0Var.v = x0Var2;
            if (!k0Var.t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                k0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) k0Var.k.b).a.setExtras(bundle2);
                }
            }
            if (z13) {
                e2.d0.U(a0Var.l, new f0(k0Var, a0Var.t, i10));
                return pVar;
            }
            k0Var.N(a0Var.t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return l8.b(new p1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        i9.c0 c0Var = new i9.c0();
        this.o.post(new b5(5, this, c0Var));
        try {
            return ((Boolean) c0Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public final void p(r rVar) {
        s(rVar);
        this.e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.e.getClass();
        return e2.d0.d0(ob.a.w3(list), new i9.p() { // from class: m4.o
            @Override // i9.p
            public final i9.w apply(Object obj) {
                return l8.b(new s(j3, i10, (List) obj));
            }
        });
    }

    public final void r() {
        e2.a.i("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.a + "] [" + b2.l0.b() + "]");
        synchronized (this.a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                w wVar = this.d;
                hg.t tVar = wVar.a;
                if (tVar != null) {
                    wVar.removeCallbacks(tVar);
                    wVar.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.l, new u(this, 0));
                } catch (Exception e7) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e7);
                }
                k0 k0Var = this.h;
                ComponentName componentName = k0Var.m;
                a0 a0Var = k0Var.g;
                n4.y yVar = k0Var.k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", a0Var.b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(a0Var.f, 0, intent, k0.w));
                    }
                }
                androidx.mediarouter.app.g gVar = k0Var.l;
                if (gVar != null) {
                    a0Var.f.unregisterReceiver(gVar);
                }
                n4.r rVar = (n4.r) yVar.b;
                MediaSession mediaSession = rVar.a;
                rVar.f.kill();
                if (i10 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e10) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                    }
                }
                mediaSession.setCallback(null);
                rVar.b.a.clear();
                mediaSession.release();
                f1 f1Var = this.g;
                Set set = f1Var.c;
                fg.f fVar = f1Var.b;
                e9.i0 t10 = fVar.t();
                int size = t10.size();
                while (i11 < size) {
                    Object obj = t10.get(i11);
                    i11++;
                    r rVar2 = (r) obj;
                    fVar.N(rVar2);
                    q qVar = rVar2.d;
                    if (qVar != null) {
                        qVar.f();
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    q qVar2 = ((r) it.next()).d;
                    if (qVar2 != null) {
                        qVar2.f();
                    }
                }
                set.clear();
                f1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (!this.x || !k(rVar)) {
            return rVar;
        }
        r e7 = e();
        e7.getClass();
        return e7;
    }

    public final void t() {
        Handler handler = this.l;
        u uVar = this.n;
        handler.removeCallbacks(uVar);
        if (this.q) {
            long j3 = this.w;
            if (j3 > 0) {
                if (this.t.i0() || this.t.c()) {
                    handler.postDelayed(uVar, j3);
                }
            }
        }
    }

    public final void u(j1 j1Var, j1 j1Var2) {
        k0 k0Var = this.h;
        this.t = j1Var2;
        if (j1Var != null) {
            y yVar = this.u;
            e2.d.h(yVar);
            j1Var.D(yVar);
        }
        y yVar2 = new y(this, j1Var2);
        j1Var2.n0(yVar2);
        this.u = yVar2;
        try {
            k0Var.i.m(0, j1Var, j1Var2);
        } catch (RemoteException e7) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e7);
        }
        if (j1Var == null) {
            ((n4.r) k0Var.k.b).a.setActive(true);
        }
        this.s = new h1(j1Var2.W(), 0, j1Var2.O0(), j1Var2.N0(), j1Var2.N0(), 0, j1Var2.h(), j1Var2.l(), j1Var2.A0(), j1Var2.E(), j1Var2.Q0(), 0, j1Var2.m0(18) ? j1Var2.h0() : b2.n0.K, j1Var2.m0(22) ? j1Var2.G() : 1.0f, j1Var2.m0(21) ? j1Var2.I() : b2.e.h, j1Var2.m0(28) ? j1Var2.j0() : d2.c.d, j1Var2.K(), j1Var2.m0(23) ? j1Var2.m() : 0, j1Var2.m0(23) && j1Var2.x0(), j1Var2.u(), 1, j1Var2.u0(), j1Var2.d(), j1Var2.i0(), j1Var2.c(), j1Var2.R0(), j1Var2.L0(), j1Var2.Z(), j1Var2.z(), j1Var2.m0(30) ? j1Var2.g0() : s1.b, j1Var2.B0());
        f(j1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
