// default package

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bq9 implements l01 {
    public final HandlerThread a;
    public final Handler b;
    public final h11 c;
    public final vp9 d;
    public final w01 e;
    public h74 f;
    public aq9 g;
    public boolean h;
    public boolean l;
    public float i = 1.0f;
    public final ArrayDeque j = new ArrayDeque();
    public long k = -1;
    public int m = -1;
    public final ro9 n = new ro9(this, 2);
    public boolean o = true;
    public long p = -1;
    public long q = -1;

    public bq9(int i, TLRPC.InputGroupCall inputGroupCall, int i2, vp9 vp9Var) {
        this.d = vp9Var;
        HandlerThread handlerThread = new HandlerThread("RtmpStreamPlayer");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.c = new h11(i, inputGroupCall, i2, true, new rf2(this, (byte) 6), new yf9(this, (byte) 11));
        this.e = new w01(this, false);
    }

    @Override // l01
    public final void a(float f) {
        h74 h74Var = this.f;
        if (h74Var != null) {
            h74Var.b(new ce8(f));
        }
    }

    @Override // l01
    public final void b(s01 s01Var) {
        int i;
        boolean z;
        xs6 xs6Var;
        is3 y;
        ArrayDeque arrayDeque = this.j;
        if (this.f != null) {
            byte[] bArr = s01Var.c;
            int i2 = s01Var.b;
            long j = s01Var.a;
            pd0 a = pd0.a(s01Var.d, bArr);
            if (a == null || (i = a.c) <= 0) {
                d("bad part " + j);
                return;
            }
            byte[] bArr2 = s01Var.c;
            int i3 = a.b;
            d61 d61Var = new d61(Arrays.copyOfRange(bArr2, i3, i + i3));
            h68 h68Var = new h68(new i98((byte) 29), (byte) 18);
            Object obj = new Object();
            k4f k4fVar = new k4f((byte) 17);
            Uri parse = Uri.parse("tgstream://part/" + j);
            bt6 bt6Var = bt6.g;
            qs6 qs6Var = new qs6();
            ts6 ts6Var = new ts6();
            List list = Collections.EMPTY_LIST;
            ko5 ko5Var = mo5.b;
            y79 y79Var = y79.e;
            vs6 vs6Var = new vs6();
            ys6 ys6Var = ys6.d;
            jte.p(ts6Var.b == null || ts6Var.a != null);
            if (parse != null) {
                us6 us6Var = ts6Var.a != null ? new us6(ts6Var) : null;
                z = false;
                xs6Var = new xs6(parse, null, us6Var, null, list, null, y79Var, -9223372036854775807L);
            } else {
                z = false;
                xs6Var = null;
            }
            bt6 bt6Var2 = new bt6("", new ss6(qs6Var), xs6Var, new ws6(vs6Var), jt6.M, ys6Var);
            bt6Var2.b.getClass();
            boolean z2 = z;
            bt6Var2.b.getClass();
            us6 us6Var2 = bt6Var2.b.c;
            if (us6Var2 == null) {
                y = is3.u;
            } else {
                synchronized (obj) {
                    y = us6Var2.equals(null) ? null : mx6.y(us6Var2);
                    y.getClass();
                }
            }
            wu8 wu8Var = new wu8(bt6Var2, d61Var, h68Var, y, k4fVar, TLObject.FLAG_20, null);
            if (i2 != this.m) {
                StringBuilder sb = new StringBuilder("quality ");
                ts2.v(sb, this.m, " -> ", i2, " at ");
                sb.append(j);
                d(sb.toString());
                this.m = i2;
            }
            boolean isEmpty = arrayDeque.isEmpty();
            h74 h74Var = this.f;
            h74Var.y1();
            List singletonList = Collections.singletonList(wu8Var);
            h74Var.y1();
            h74Var.Q0(h74Var.p.size(), singletonList);
            arrayDeque.addLast(Long.valueOf(j));
            if (!isEmpty) {
                if (this.l) {
                    this.l = z2;
                    this.f.j1(arrayDeque.size() - 1, 0L, z2);
                    return;
                }
                return;
            }
            long j2 = this.k;
            long max = j2 >= 0 ? Math.max(0L, j2 - j) : 0L;
            this.k = -1L;
            this.f.j1(z2 ? 1 : 0, max, z2);
            this.f.a();
        }
    }

    @Override // l01
    public final void c(long j) {
        if (this.f == null) {
            return;
        }
        this.j.clear();
        this.f.t();
        this.k = j;
    }

    @Override // l01
    public final void d(String str) {
        if (e21.a) {
            fc4.b("[RtmpStream] ".concat(str));
        }
    }

    @Override // l01
    public final void e(c01 c01Var) {
        this.c.b(c01Var);
    }

    @Override // l01
    public final void f() {
        vp9 vp9Var = this.d;
        if (vp9Var != null) {
            vp9Var.onRejoinRequested();
        }
    }

    @Override // l01
    public final long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override // l01
    public final ji i(p01 p01Var, o01 o01Var) {
        return this.c.a(p01Var, o01Var);
    }

    @Override // l01
    public final k01 j(Runnable runnable, long j) {
        up9 up9Var = new up9(this, runnable, (byte) 0);
        this.b.postDelayed(up9Var, Math.max(0L, j));
        return new xr8(this, up9Var, (byte) 13);
    }

    public final void k(boolean z) {
        this.b.post(new n28((byte) 9, (Object) this, z));
    }

    public final void l(aq9 aq9Var, Runnable runnable) {
        if (this.b.post(new ak8((Object) this, (Object) aq9Var, (Object) runnable, (byte) 24)) || runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // l01
    public final void g(long j, int i, long j2) {
    }
}
