// default package

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ef5 extends qg0 {
    public final pa3 i;
    public final l69 j;
    public final ie7 k;
    public final yq3 l;
    public final i2f m;
    public final boolean n;
    public final boolean o;
    public final ta3 p;
    public final long q;
    public wq6 r;
    public vyb s;
    public br6 t;

    static {
        cr6.a("media3.exoplayer.hls");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ef5(br6 br6Var, l69 l69Var, pa3 pa3Var, ie7 ie7Var, yq3 yq3Var, i2f i2fVar, ta3 ta3Var, long j, boolean z, int i) {
        this.t = br6Var;
        this.r = br6Var.c;
        this.j = l69Var;
        this.i = pa3Var;
        this.k = ie7Var;
        this.l = yq3Var;
        this.m = i2fVar;
        this.p = ta3Var;
        this.q = j;
        this.n = z;
        this.o = i;
    }

    public static ye5 u(mm5 mm5Var, long j) {
        ye5 ye5Var = null;
        for (int i = 0; i < mm5Var.size(); i++) {
            ye5 ye5Var2 = (ye5) mm5Var.get(i);
            if (ye5Var2.e > j) {
                break;
            }
            if (ye5Var2.x) {
                ye5Var = ye5Var2;
            }
        }
        return ye5Var;
    }

    @Override // qg0
    public final boolean a(br6 br6Var) {
        br6 i = i();
        xq6 xq6Var = i.b;
        xq6Var.getClass();
        xq6 xq6Var2 = br6Var.b;
        return xq6Var2 != null && xq6Var2.a.equals(xq6Var.a) && xq6Var2.e.equals(xq6Var.e) && Objects.equals(xq6Var2.c, xq6Var.c) && i.c.equals(br6Var.c);
    }

    @Override // qg0
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        kp b = b(rx6Var);
        vq3 vq3Var = new vq3(this.d.c, 0, rx6Var);
        vyb vybVar = this.s;
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        return new ue5(this.i, this.p, this.j, vybVar, this.l, vq3Var, this.m, b, mv6Var, this.k, this.n, this.o ? 1 : 0, uc8Var);
    }

    @Override // qg0
    public final synchronized br6 i() {
        return this.t;
    }

    @Override // qg0
    public final void k() {
        ta3 ta3Var = this.p;
        mv6 mv6Var = ta3Var.h;
        if (mv6Var != null) {
            mv6Var.b();
        }
        av7 av7Var = ta3Var.x;
        if (av7Var != null) {
            throw av7Var;
        }
        Uri uri = ta3Var.I;
        if (uri != null) {
            ta3Var.i(uri);
        }
    }

    @Override // qg0
    public final void m(vyb vybVar) {
        this.s = vybVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        uc8 uc8Var = this.g;
        uc8Var.getClass();
        yq3 yq3Var = this.l;
        yq3Var.u(myLooper, uc8Var);
        yq3Var.a();
        kp b = b(null);
        xq6 xq6Var = i().b;
        xq6Var.getClass();
        Uri uri = xq6Var.a;
        s93 s93Var = this.h;
        s93Var.getClass();
        Handler q = g8c.q(null);
        ta3 ta3Var = this.p;
        ta3Var.n = q;
        ta3Var.f = b;
        ta3Var.r = this;
        ta3Var.s = s93Var;
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        cv7 cv7Var = new cv7(((m63) ta3Var.a.b).createDataSource(), new u63(uri, 1, null, map, 0L, -1L, null, 1), 4, ta3Var.b.o());
        gre.p(ta3Var.h == null);
        mv6 mv6Var = new mv6("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        ta3Var.h = mv6Var;
        mv6Var.r0(cv7Var, ta3Var, ta3Var.c.v3(cv7Var.c));
    }

    @Override // qg0
    public final void q() {
        ta3 ta3Var = this.p;
        HashMap hashMap = ta3Var.d;
        ta3Var.I = null;
        ta3Var.J = null;
        ta3Var.w = null;
        se5 se5Var = ta3Var.y;
        if (se5Var != null) {
            se5Var.f();
        }
        ta3Var.E = null;
        ta3Var.F = null;
        ta3Var.G = null;
        ta3Var.H = null;
        ta3Var.x = null;
        ta3Var.M = -9223372036854775807L;
        ta3Var.h.b0(null);
        ta3Var.h = null;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((sa3) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((ra3) it2.next()).c.b0(null);
            }
        }
        ta3Var.n.removeCallbacksAndMessages(null);
        ta3Var.n = null;
        ta3Var.s = null;
        hashMap.clear();
        this.l.release();
    }

    @Override // qg0
    public final synchronized void t(br6 br6Var) {
        this.t = br6Var;
    }

    public final void v(df5 df5Var) {
        long j;
        lia liaVar;
        long j2;
        long j3;
        long j4;
        boolean z = df5Var.p;
        boolean z2 = df5Var.g;
        mm5 mm5Var = df5Var.r;
        long j5 = df5Var.u;
        long j6 = df5Var.e;
        byte b = df5Var.d;
        long j7 = df5Var.h;
        long i0 = z ? g8c.i0(j7) : -9223372036854775807L;
        long j8 = (b == 2 || b == 1) ? i0 : -9223372036854775807L;
        ta3 ta3Var = this.p;
        ta3Var.w.getClass();
        i2f i2fVar = new i2f((byte) 20);
        if (ta3Var.L) {
            cf5 cf5Var = df5Var.v;
            long j9 = cf5Var.c;
            long j10 = cf5Var.d;
            long j11 = j7 - ta3Var.M;
            boolean z3 = df5Var.o;
            long j12 = z3 ? j11 + j5 : -9223372036854775807L;
            long T = df5Var.p ? g8c.T(g8c.E(this.q)) - (j7 + j5) : 0L;
            long j13 = this.r.a;
            if (j13 != -9223372036854775807L) {
                j2 = g8c.T(j13);
            } else {
                j2 = (j6 != -9223372036854775807L ? j5 - j6 : (j10 == -9223372036854775807L || df5Var.n == -9223372036854775807L) ? j9 != -9223372036854775807L ? j9 : 3 * df5Var.m : j10) + T;
            }
            long j14 = j5 + T;
            long j15 = g8c.j(j2, T, j14);
            wq6 wq6Var = i().c;
            boolean z4 = false;
            boolean z5 = wq6Var.d == -3.4028235E38f && wq6Var.e == -3.4028235E38f && j9 == -9223372036854775807L && j10 == -9223372036854775807L;
            vq6 a = this.r.a();
            a.a = g8c.i0(j15);
            a.d = z5 ? 1.0f : this.r.d;
            a.e = z5 ? 1.0f : this.r.e;
            wq6 wq6Var2 = new wq6(a);
            this.r = wq6Var2;
            if (j6 == -9223372036854775807L) {
                j6 = j14 - g8c.T(wq6Var2.a);
            }
            if (z2) {
                j4 = j6;
            } else {
                ye5 u = u(df5Var.s, j6);
                if (u != null) {
                    j3 = u.e;
                } else if (mm5Var.isEmpty()) {
                    j4 = 0;
                } else {
                    af5 af5Var = (af5) mm5Var.get(g8c.d(mm5Var, Long.valueOf(j6), true));
                    ye5 u2 = u(af5Var.y, j6);
                    j3 = u2 != null ? u2.e : af5Var.e;
                }
                j4 = j3;
            }
            if (b == 2 && df5Var.f) {
                z4 = true;
            }
            liaVar = new lia(j8, i0, j12, df5Var.u, j11, j4, true, !z3, z4, i2fVar, i(), this.r);
        } else {
            if (j6 == -9223372036854775807L || mm5Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((af5) mm5Var.get(g8c.d(mm5Var, Long.valueOf(j6), true))).e;
                }
                j = j6;
            }
            long j16 = df5Var.u;
            liaVar = new lia(j8, i0, j16, j16, 0L, j, true, false, true, i2fVar, i(), null);
        }
        n(liaVar);
    }
}
