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
import bi.g2;
import hi.y1;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class b0 {
    public static final r1 B = new r1(1);
    public final Bundle A;
    public final Object a = new Object();
    public final Uri b;
    public final y c;
    public final x d;
    public final na.d e;
    public final Context f;
    public final h1 g;
    public final l0 h;
    public final String i;
    public final s1 j;
    public final t k;
    public final Handler l;
    public final of.b m;
    public final u n;
    public final Handler o;
    public final boolean p;
    public final boolean q;
    public final e9.i0 r;
    public j1 s;
    public l1 t;
    public z u;
    public boolean v;
    public final long w;
    public boolean x;
    public final e9.i0 y;
    public final e9.i0 z;

    public b0(t tVar, Context context, b2.b1 b1Var, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, na.d dVar, Bundle bundle, Bundle bundle2, of.b bVar) {
        e2.a.i("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.1] [" + e2.d0.a + "]");
        this.k = tVar;
        this.f = context;
        this.i = "pip-media-session";
        this.y = i0Var;
        this.z = i0Var2;
        this.r = i0Var3;
        this.e = dVar;
        this.A = bundle2;
        this.m = bVar;
        this.p = true;
        this.q = true;
        h1 h1Var = new h1(this);
        this.g = h1Var;
        this.o = new Handler(Looper.getMainLooper());
        Looper y02 = b1Var.y0();
        Handler handler = new Handler(y02);
        this.l = handler;
        this.s = j1.F;
        this.c = new y(this, y02);
        this.d = new x(this, y02);
        Uri build = new Uri.Builder().scheme(b0.class.getName()).appendPath("pip-media-session").appendPath(String.valueOf(SystemClock.elapsedRealtime())).build();
        this.b = build;
        l0 l0Var = new l0(this, build, handler, bundle, i0Var, i0Var2, p.e, p.f, bundle2);
        this.h = l0Var;
        this.j = new s1(Process.myUid(), context.getPackageName(), h1Var, bundle, ((n4.r) l0Var.k.b).c.b);
        l1 l1Var = new l1(b1Var);
        this.t = l1Var;
        e2.d0.U(handler, new w(2, this, l1Var));
        this.w = 3000L;
        this.n = new u(this, 2);
        e2.d0.U(handler, new u(this, 3));
    }

    public static void a(b0 b0Var) {
        synchronized (b0Var.a) {
            try {
                if (b0Var.v) {
                    return;
                }
                final q1 O0 = b0Var.t.O0();
                if (!b0Var.c.hasMessages(1)) {
                    q1 q1Var = b0Var.s.c;
                    b2.a1 a1Var = O0.a;
                    int i10 = a1Var.b;
                    b2.a1 a1Var2 = q1Var.a;
                    if (i10 == a1Var2.b && a1Var.e == a1Var2.e && a1Var.h == a1Var2.h && a1Var.i == a1Var2.i) {
                        ki.f fVar = b0Var.g.b;
                        e9.i0 r10 = fVar.r();
                        for (int i11 = 0; i11 < r10.size(); i11++) {
                            final r rVar = (r) r10.get(i11);
                            fVar.u(rVar);
                            final boolean A = fVar.A(rVar, 16);
                            final boolean A2 = fVar.A(rVar, 17);
                            b0Var.c(rVar, new a0() { // from class: m4.v
                                @Override // m4.a0
                                public final void d(q qVar, int i12) {
                                    qVar.e(i12, q1.this, A, A2, rVar.c);
                                }
                            });
                        }
                        try {
                            b0Var.h.i.e(0, O0, true, true, 0);
                        } catch (RemoteException e) {
                            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
                        }
                    }
                }
                b0Var.t();
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
        r e = this.k.a.e();
        e.getClass();
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z10) {
            keyCode = 87;
        }
        if (keyCode == 126) {
            bVar = new b(this, e, 7);
        } else if (keyCode != 127) {
            if (keyCode != 272) {
                if (keyCode != 273) {
                    switch (keyCode) {
                        case 85:
                            if (!this.t.u()) {
                                bVar = new b(this, e, 6);
                                break;
                            } else {
                                bVar = new b(this, e, 5);
                                break;
                            }
                        case 86:
                            bVar = new b(this, e, 4);
                            break;
                        case 87:
                            break;
                        case 88:
                            break;
                        case 89:
                            bVar = new b(this, e, 3);
                            break;
                        case 90:
                            bVar = new b(this, e, 2);
                            break;
                        default:
                            return false;
                    }
                }
                bVar = new b(this, e, 1);
            }
            bVar = new b(this, e, 9);
        } else {
            bVar = new b(this, e, 8);
        }
        e2.d0.U(this.l, new g2(this, z11, e, bVar, 5));
        return true;
    }

    public final void c(r rVar, a0 a0Var) {
        int i10;
        h1 h1Var = this.g;
        try {
            com.google.android.gms.common.api.internal.v w10 = h1Var.b.w(rVar);
            if (w10 != null) {
                i10 = w10.e();
            } else if (!h(rVar)) {
                return;
            } else {
                i10 = 0;
            }
            q qVar = rVar.d;
            if (qVar != null) {
                a0Var.d(qVar, i10);
            }
        } catch (DeadObjectException unused) {
            h1Var.b.K(rVar);
        } catch (RemoteException e) {
            e2.a.o("MediaSessionImpl", "Exception in " + rVar, e);
        }
    }

    public final void d(a0 a0Var) {
        e9.i0 r10 = this.g.b.r();
        for (int i10 = 0; i10 < r10.size(); i10++) {
            c((r) r10.get(i10), a0Var);
        }
        try {
            a0Var.d(this.h.i, 0);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
    }

    public final r e() {
        e9.i0 r10 = this.g.b.r();
        for (int i10 = 0; i10 < r10.size(); i10++) {
            r rVar = (r) r10.get(i10);
            if (i(rVar)) {
                return rVar;
            }
        }
        return null;
    }

    public final void f(b2.x0 x0Var) {
        this.c.a(false, false);
        d(new y1(x0Var, 24));
        try {
            j0 j0Var = this.h.i;
            b2.l lVar = this.s.q;
            j0Var.k();
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
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
            tVar.a(new i9.s(0, tVar, new androidx.activity.o(this, s10, z10, x0Var)), new k2.b0(this, 1));
        }
    }

    public final boolean h(r rVar) {
        return this.g.b.z(rVar) || this.h.f.z(rVar);
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
        return na.d.B3(list);
    }

    public final p m(r rVar) {
        boolean z10 = this.x;
        l0 l0Var = this.h;
        if (z10 && k(rVar)) {
            l0Var.getClass();
            o1 o1Var = p.e;
            o1 o1Var2 = l0Var.u;
            o1Var2.getClass();
            b2.x0 x0Var = l0Var.v;
            x0Var.getClass();
            e9.i0 i0Var = l0Var.s;
            e9.i0 v = i0Var == null ? null : e9.i0.v(i0Var);
            e9.i0 i0Var2 = l0Var.t;
            return new p(o1Var2, x0Var, v, i0Var2 != null ? e9.i0.v(i0Var2) : null);
        }
        this.e.getClass();
        b2.x0 x0Var2 = p.f;
        o1 o1Var3 = p.e;
        p pVar = new p(o1Var3, x0Var2, null, null);
        if (i(rVar)) {
            this.x = true;
            t tVar = this.k;
            e9.i0 i0Var3 = tVar.a.z;
            int i10 = 0;
            if (i0Var3.isEmpty()) {
                l0Var.s = tVar.a.y;
            } else {
                l0Var.t = i0Var3;
                Bundle bundle = l0Var.r;
                boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z12 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z11 || bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z12) {
                    ((n4.r) l0Var.k.b).a.setExtras(bundle);
                }
            }
            b0 b0Var = l0Var.g;
            Bundle bundle2 = l0Var.r;
            boolean z13 = l0Var.v.a(17) != x0Var2.a(17);
            l0Var.u = o1Var3;
            l0Var.v = x0Var2;
            if (!l0Var.t.isEmpty()) {
                boolean z14 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
                boolean z15 = bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
                l0Var.M();
                if (bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) != z14 || bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) != z15) {
                    ((n4.r) l0Var.k.b).a.setExtras(bundle2);
                }
            }
            if (z13) {
                e2.d0.U(b0Var.l, new g0(l0Var, b0Var.t, i10));
                return pVar;
            }
            l0Var.N(b0Var.t);
        }
        return pVar;
    }

    public final i9.u n(r rVar) {
        s(rVar);
        this.e.getClass();
        return o8.b(new r1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        i9.c0 c0Var = new i9.c0();
        this.o.post(new w(0, this, c0Var));
        try {
            return ((Boolean) c0Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void p(r rVar) {
        s(rVar);
        this.e.getClass();
    }

    public final i9.c0 q(r rVar, List list, final int i10, final long j3) {
        s(rVar);
        this.e.getClass();
        return e2.d0.d0(na.d.B3(list), new i9.p() { // from class: m4.o
            @Override // i9.p
            public final i9.w apply(Object obj) {
                return o8.b(new s(j3, i10, (List) obj));
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
                x xVar = this.d;
                gg.a0 a0Var = xVar.a;
                if (a0Var != null) {
                    xVar.removeCallbacks(a0Var);
                    xVar.a = null;
                }
                this.l.removeCallbacksAndMessages(null);
                try {
                    e2.d0.U(this.l, new u(this, 0));
                } catch (Exception e) {
                    e2.a.o("MediaSessionImpl", "Exception thrown while closing", e);
                }
                l0 l0Var = this.h;
                ComponentName componentName = l0Var.m;
                b0 b0Var = l0Var.g;
                n4.y yVar = l0Var.k;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = 0;
                if (i10 < 31) {
                    if (componentName == null) {
                        ((n4.r) yVar.b).a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", b0Var.b);
                        intent.setComponent(componentName);
                        ((n4.r) yVar.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(b0Var.f, 0, intent, l0.w));
                    }
                }
                androidx.mediarouter.app.g gVar = l0Var.l;
                if (gVar != null) {
                    b0Var.f.unregisterReceiver(gVar);
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
                    } catch (Exception e7) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                    }
                }
                mediaSession.setCallback(null);
                rVar.b.a.clear();
                mediaSession.release();
                h1 h1Var = this.g;
                Set set = h1Var.c;
                ki.f fVar = h1Var.b;
                e9.i0 r10 = fVar.r();
                int size = r10.size();
                while (i11 < size) {
                    Object obj = r10.get(i11);
                    i11++;
                    r rVar2 = (r) obj;
                    fVar.K(rVar2);
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
                h1Var.a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final r s(r rVar) {
        if (!this.x || !k(rVar)) {
            return rVar;
        }
        r e = e();
        e.getClass();
        return e;
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

    public final void u(l1 l1Var, l1 l1Var2) {
        l0 l0Var = this.h;
        this.t = l1Var2;
        if (l1Var != null) {
            z zVar = this.u;
            e2.d.h(zVar);
            l1Var.D(zVar);
        }
        z zVar2 = new z(this, l1Var2);
        l1Var2.n0(zVar2);
        this.u = zVar2;
        try {
            l0Var.i.m(0, l1Var, l1Var2);
        } catch (RemoteException e) {
            e2.a.f("MediaSessionImpl", "Exception in using media1 API", e);
        }
        if (l1Var == null) {
            ((n4.r) l0Var.k.b).a.setActive(true);
        }
        this.s = new j1(l1Var2.W(), 0, l1Var2.O0(), l1Var2.N0(), l1Var2.N0(), 0, l1Var2.h(), l1Var2.l(), l1Var2.A0(), l1Var2.E(), l1Var2.Q0(), 0, l1Var2.m0(18) ? l1Var2.h0() : b2.n0.K, l1Var2.m0(22) ? l1Var2.G() : 1.0f, l1Var2.m0(21) ? l1Var2.I() : b2.e.h, l1Var2.m0(28) ? l1Var2.j0() : d2.c.d, l1Var2.K(), l1Var2.m0(23) ? l1Var2.m() : 0, l1Var2.m0(23) && l1Var2.x0(), l1Var2.u(), 1, l1Var2.u0(), l1Var2.d(), l1Var2.i0(), l1Var2.c(), l1Var2.R0(), l1Var2.L0(), l1Var2.Z(), l1Var2.z(), l1Var2.m0(30) ? l1Var2.g0() : b2.s1.b, l1Var2.B0());
        f(l1Var2.t());
    }

    public final void v() {
        if (Looper.myLooper() != this.l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }
}
