// default package

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gh5 extends rg0 {
    public final ib3 i;
    public final z8d j;
    public final rg7 k;
    public final pr3 l;
    public final z6f m;
    public final boolean n;
    public final boolean o;
    public final mb3 p;
    public final long q;
    public at6 r;
    public v2c s;
    public ft6 t;

    static {
        gt6.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gh5(ft6 ft6Var, z8d z8dVar, ib3 ib3Var, rg7 rg7Var, pr3 pr3Var, z6f z6fVar, mb3 mb3Var, long j, boolean z, int i) {
        this.t = ft6Var;
        this.r = ft6Var.c;
        this.j = z8dVar;
        this.i = ib3Var;
        this.k = rg7Var;
        this.l = pr3Var;
        this.m = z6fVar;
        this.p = mb3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static ah5 u(po5 po5Var, long j) {
        ah5 ah5Var = null;
        for (int i = 0; i < po5Var.size(); i++) {
            ah5 ah5Var2 = (ah5) po5Var.get(i);
            if (ah5Var2.e > j) {
                break;
            }
            if (ah5Var2.x) {
                ah5Var = ah5Var2;
            }
        }
        return ah5Var;
    }

    @Override // rg0
    public final boolean a(ft6 ft6Var) {
        ft6 i = i();
        bt6 bt6Var = i.b;
        bt6Var.getClass();
        bt6 bt6Var2 = ft6Var.b;
        return bt6Var2 != null && bt6Var2.a.equals(bt6Var.a) && bt6Var2.e.equals(bt6Var.e) && Objects.equals(bt6Var2.c, bt6Var.c) && i.c.equals(ft6Var.c);
    }

    @Override // rg0
    public final xt6 c(vz6 vz6Var, rx6 rx6Var, long j) {
        lp b = b(vz6Var);
        mr3 mr3Var = new mr3(this.d.c, 0, vz6Var);
        v2c v2cVar = this.s;
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        return new wg5(this.i, this.p, this.j, v2cVar, this.l, mr3Var, this.m, b, rx6Var, this.k, this.n, this.o ? 1 : 0, ig8Var);
    }

    @Override // rg0
    public final synchronized ft6 i() {
        return this.t;
    }

    @Override // rg0
    public final void k() {
        mb3 mb3Var = this.p;
        rx6 rx6Var = mb3Var.h;
        if (rx6Var != null) {
            rx6Var.g();
        }
        hy7 hy7Var = mb3Var.x;
        if (hy7Var != null) {
            throw hy7Var;
        }
        Uri uri = mb3Var.I;
        if (uri != null) {
            mb3Var.j(uri);
        }
    }

    @Override // rg0
    public final void m(v2c v2cVar) {
        this.s = v2cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        ig8 ig8Var = this.g;
        ig8Var.getClass();
        pr3 pr3Var = this.l;
        pr3Var.w(myLooper, ig8Var);
        pr3Var.a();
        lp b = b(null);
        bt6 bt6Var = i().b;
        bt6Var.getClass();
        Uri uri = bt6Var.a;
        la3 la3Var = this.h;
        la3Var.getClass();
        Handler q = gcc.q(null);
        mb3 mb3Var = this.p;
        mb3Var.n = q;
        mb3Var.f = b;
        mb3Var.r = this;
        mb3Var.s = la3Var;
        Map map = Collections.EMPTY_MAP;
        yve.l(uri, "The uri must be set.");
        jy7 jy7Var = new jy7(((f73) mb3Var.a.b).createDataSource(), new n73(uri, 1, null, map, 0L, -1L, null, 1), 4, mb3Var.b.c());
        yve.p(mb3Var.h == null);
        rx6 rx6Var = new rx6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        mb3Var.h = rx6Var;
        rx6Var.w0(jy7Var, mb3Var, mb3Var.c.v3(jy7Var.c));
    }

    @Override // rg0
    public final void q() {
        mb3 mb3Var = this.p;
        HashMap hashMap = mb3Var.d;
        mb3Var.I = null;
        mb3Var.J = null;
        mb3Var.w = null;
        ug5 ug5Var = mb3Var.y;
        if (ug5Var != null) {
            ug5Var.f();
        }
        mb3Var.E = null;
        mb3Var.F = null;
        mb3Var.G = null;
        mb3Var.H = null;
        mb3Var.x = null;
        mb3Var.M = -9223372036854775807L;
        mb3Var.h.g0(null);
        mb3Var.h = null;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((lb3) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((kb3) it2.next()).c.g0(null);
            }
        }
        mb3Var.n.removeCallbacksAndMessages(null);
        mb3Var.n = null;
        mb3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override // rg0
    public final synchronized void t(ft6 ft6Var) {
        this.t = ft6Var;
    }

    public final void v(fh5 fh5Var) {
        long j;
        gma gmaVar;
        long j2;
        long j3;
        long j4;
        boolean z = fh5Var.p;
        boolean z2 = fh5Var.g;
        po5 po5Var = fh5Var.r;
        long j5 = fh5Var.u;
        long j6 = fh5Var.e;
        byte b = fh5Var.d;
        long j7 = fh5Var.h;
        long i0 = z ? gcc.i0(j7) : -9223372036854775807L;
        long j8 = (b == 2 || b == 1) ? i0 : -9223372036854775807L;
        mb3 mb3Var = this.p;
        mb3Var.w.getClass();
        z6f z6fVar = new z6f((byte) 20);
        if (mb3Var.L) {
            eh5 eh5Var = fh5Var.v;
            long j9 = eh5Var.c;
            long j10 = eh5Var.d;
            long j11 = j7 - mb3Var.M;
            boolean z3 = fh5Var.o;
            long j12 = z3 ? j11 + j5 : -9223372036854775807L;
            long T = fh5Var.p ? gcc.T(gcc.E(this.q)) - (j7 + j5) : 0L;
            long j13 = this.r.a;
            if (j13 != -9223372036854775807L) {
                j2 = gcc.T(j13);
            } else {
                j2 = (j6 != -9223372036854775807L ? j5 - j6 : (j10 == -9223372036854775807L || fh5Var.n == -9223372036854775807L) ? j9 != -9223372036854775807L ? j9 : 3 * fh5Var.m : j10) + T;
            }
            long j14 = j5 + T;
            long j15 = gcc.j(j2, T, j14);
            at6 at6Var = i().c;
            boolean z4 = false;
            boolean z5 = at6Var.d == -3.4028235E38f && at6Var.e == -3.4028235E38f && j9 == -9223372036854775807L && j10 == -9223372036854775807L;
            zs6 a = this.r.a();
            a.a = gcc.i0(j15);
            a.d = z5 ? 1.0f : this.r.d;
            a.e = z5 ? 1.0f : this.r.e;
            at6 at6Var2 = new at6(a);
            this.r = at6Var2;
            if (j6 == -9223372036854775807L) {
                j6 = j14 - gcc.T(at6Var2.a);
            }
            if (z2) {
                j4 = j6;
            } else {
                ah5 u = u(fh5Var.s, j6);
                if (u != null) {
                    j3 = u.e;
                } else if (po5Var.isEmpty()) {
                    j4 = 0;
                } else {
                    ch5 ch5Var = (ch5) po5Var.get(gcc.d(po5Var, Long.valueOf(j6), true));
                    ah5 u2 = u(ch5Var.y, j6);
                    j3 = u2 != null ? u2.e : ch5Var.e;
                }
                j4 = j3;
            }
            if (b == 2 && fh5Var.f) {
                z4 = true;
            }
            gmaVar = new gma(j8, i0, j12, fh5Var.u, j11, j4, true, !z3, z4, z6fVar, i(), this.r);
        } else {
            if (j6 == -9223372036854775807L || po5Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((ch5) po5Var.get(gcc.d(po5Var, Long.valueOf(j6), true))).e;
                }
                j = j6;
            }
            long j16 = fh5Var.u;
            gmaVar = new gma(j8, i0, j16, j16, 0L, j, true, false, true, z6fVar, i(), null);
        }
        n(gmaVar);
    }
}
