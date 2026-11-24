// default package

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dh5 extends rh0 {
    public final bc3 i;
    public final k6d j;
    public final kg7 k;
    public final is3 l;
    public final k4f m;
    public final boolean n;
    public final boolean o;
    public final fc3 p;
    public final long q;
    public ws6 r;
    public w0c s;
    public bt6 t;

    static {
        ct6.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dh5(bt6 bt6Var, k6d k6dVar, bc3 bc3Var, kg7 kg7Var, is3 is3Var, k4f k4fVar, fc3 fc3Var, long j, boolean z, int i) {
        this.t = bt6Var;
        this.r = bt6Var.c;
        this.j = k6dVar;
        this.i = bc3Var;
        this.k = kg7Var;
        this.l = is3Var;
        this.m = k4fVar;
        this.p = fc3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static xg5 u(mo5 mo5Var, long j) {
        xg5 xg5Var = null;
        for (int i = 0; i < mo5Var.size(); i++) {
            xg5 xg5Var2 = (xg5) mo5Var.get(i);
            if (xg5Var2.e > j) {
                break;
            }
            if (xg5Var2.x) {
                xg5Var = xg5Var2;
            }
        }
        return xg5Var;
    }

    @Override // rh0
    public final boolean a(bt6 bt6Var) {
        bt6 i = i();
        xs6 xs6Var = i.b;
        xs6Var.getClass();
        xs6 xs6Var2 = bt6Var.b;
        return xs6Var2 != null && xs6Var2.a.equals(xs6Var.a) && xs6Var2.e.equals(xs6Var.e) && Objects.equals(xs6Var2.c, xs6Var.c) && i.c.equals(bt6Var.c);
    }

    @Override // rh0
    public final tt6 c(rz6 rz6Var, mx6 mx6Var, long j) {
        kq b = b(rz6Var);
        fs3 fs3Var = new fs3(this.d.c, 0, rz6Var);
        w0c w0cVar = this.s;
        we8 we8Var = this.g;
        we8Var.getClass();
        return new tg5(this.i, this.p, this.j, w0cVar, this.l, fs3Var, this.m, b, mx6Var, this.k, this.n, this.o ? 1 : 0, we8Var);
    }

    @Override // rh0
    public final synchronized bt6 i() {
        return this.t;
    }

    @Override // rh0
    public final void k() {
        fc3 fc3Var = this.p;
        mx6 mx6Var = fc3Var.h;
        if (mx6Var != null) {
            mx6Var.d();
        }
        bx7 bx7Var = fc3Var.x;
        if (bx7Var != null) {
            throw bx7Var;
        }
        Uri uri = fc3Var.I;
        if (uri != null) {
            fc3Var.i(uri);
        }
    }

    @Override // rh0
    public final void m(w0c w0cVar) {
        this.s = w0cVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        we8 we8Var = this.g;
        we8Var.getClass();
        is3 is3Var = this.l;
        is3Var.w(myLooper, we8Var);
        is3Var.a();
        kq b = b(null);
        xs6 xs6Var = i().b;
        xs6Var.getClass();
        Uri uri = xs6Var.a;
        eb3 eb3Var = this.h;
        eb3Var.getClass();
        Handler q = hac.q(null);
        fc3 fc3Var = this.p;
        fc3Var.n = q;
        fc3Var.f = b;
        fc3Var.r = this;
        fc3Var.s = eb3Var;
        Map map = Collections.EMPTY_MAP;
        jte.l(uri, "The uri must be set.");
        dx7 dx7Var = new dx7(((y73) fc3Var.a.b).createDataSource(), new g83(uri, 1, null, map, 0L, -1L, null, 1), 4, fc3Var.b.e());
        jte.p(fc3Var.h == null);
        mx6 mx6Var = new mx6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        fc3Var.h = mx6Var;
        mx6Var.v0(dx7Var, fc3Var, fc3Var.c.v3(dx7Var.c));
    }

    @Override // rh0
    public final void q() {
        fc3 fc3Var = this.p;
        HashMap hashMap = fc3Var.d;
        fc3Var.I = null;
        fc3Var.J = null;
        fc3Var.w = null;
        rg5 rg5Var = fc3Var.y;
        if (rg5Var != null) {
            rg5Var.f();
        }
        fc3Var.E = null;
        fc3Var.F = null;
        fc3Var.G = null;
        fc3Var.H = null;
        fc3Var.x = null;
        fc3Var.M = -9223372036854775807L;
        fc3Var.h.e0(null);
        fc3Var.h = null;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ec3) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((dc3) it2.next()).c.e0(null);
            }
        }
        fc3Var.n.removeCallbacksAndMessages(null);
        fc3Var.n = null;
        fc3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override // rh0
    public final synchronized void t(bt6 bt6Var) {
        this.t = bt6Var;
    }

    public final void v(ch5 ch5Var) {
        long j;
        nka nkaVar;
        long j2;
        long j3;
        long j4;
        boolean z = ch5Var.p;
        boolean z2 = ch5Var.g;
        mo5 mo5Var = ch5Var.r;
        long j5 = ch5Var.u;
        long j6 = ch5Var.e;
        byte b = ch5Var.d;
        long j7 = ch5Var.h;
        long i0 = z ? hac.i0(j7) : -9223372036854775807L;
        long j8 = (b == 2 || b == 1) ? i0 : -9223372036854775807L;
        fc3 fc3Var = this.p;
        fc3Var.w.getClass();
        k4f k4fVar = new k4f((byte) 20);
        if (fc3Var.L) {
            bh5 bh5Var = ch5Var.v;
            long j9 = bh5Var.c;
            long j10 = bh5Var.d;
            long j11 = j7 - fc3Var.M;
            boolean z3 = ch5Var.o;
            long j12 = z3 ? j11 + j5 : -9223372036854775807L;
            long T = ch5Var.p ? hac.T(hac.E(this.q)) - (j7 + j5) : 0L;
            long j13 = this.r.a;
            if (j13 != -9223372036854775807L) {
                j2 = hac.T(j13);
            } else {
                j2 = (j6 != -9223372036854775807L ? j5 - j6 : (j10 == -9223372036854775807L || ch5Var.n == -9223372036854775807L) ? j9 != -9223372036854775807L ? j9 : 3 * ch5Var.m : j10) + T;
            }
            long j14 = j5 + T;
            long j15 = hac.j(j2, T, j14);
            ws6 ws6Var = i().c;
            boolean z4 = false;
            boolean z5 = ws6Var.d == -3.4028235E38f && ws6Var.e == -3.4028235E38f && j9 == -9223372036854775807L && j10 == -9223372036854775807L;
            vs6 a = this.r.a();
            a.a = hac.i0(j15);
            a.d = z5 ? 1.0f : this.r.d;
            a.e = z5 ? 1.0f : this.r.e;
            ws6 ws6Var2 = new ws6(a);
            this.r = ws6Var2;
            if (j6 == -9223372036854775807L) {
                j6 = j14 - hac.T(ws6Var2.a);
            }
            if (z2) {
                j4 = j6;
            } else {
                xg5 u = u(ch5Var.s, j6);
                if (u != null) {
                    j3 = u.e;
                } else if (mo5Var.isEmpty()) {
                    j4 = 0;
                } else {
                    zg5 zg5Var = (zg5) mo5Var.get(hac.d(mo5Var, Long.valueOf(j6), true));
                    xg5 u2 = u(zg5Var.y, j6);
                    j3 = u2 != null ? u2.e : zg5Var.e;
                }
                j4 = j3;
            }
            if (b == 2 && ch5Var.f) {
                z4 = true;
            }
            nkaVar = new nka(j8, i0, j12, ch5Var.u, j11, j4, true, !z3, z4, k4fVar, i(), this.r);
        } else {
            if (j6 == -9223372036854775807L || mo5Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((zg5) mo5Var.get(hac.d(mo5Var, Long.valueOf(j6), true))).e;
                }
                j = j6;
            }
            long j16 = ch5Var.u;
            nkaVar = new nka(j8, i0, j16, j16, 0L, j, true, false, true, k4fVar, i(), null);
        }
        n(nkaVar);
    }
}
