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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ao9 implements ez0 {
    public final HandlerThread a;
    public final Handler b;
    public final zz0 c;
    public final un9 d;
    public final pz0 e;
    public y54 f;
    public zn9 g;
    public boolean h;
    public boolean l;
    public float i = 1.0f;
    public final ArrayDeque j = new ArrayDeque();
    public long k = -1;
    public int m = -1;
    public final qm9 n = new qm9(this, 2);
    public boolean o = true;
    public long p = -1;
    public long q = -1;

    public ao9(int i, TLRPC.InputGroupCall inputGroupCall, int i2, un9 un9Var) {
        this.d = un9Var;
        HandlerThread handlerThread = new HandlerThread("RtmpStreamPlayer");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.c = new zz0(i, inputGroupCall, i2, true, new ge2(this, (byte) 6), new wh9(this, (byte) 7));
        this.e = new pz0(this, false);
    }

    @Override // ez0
    public final void a(float f) {
        y54 y54Var = this.f;
        if (y54Var != null) {
            y54Var.b(new zb8(f));
        }
    }

    @Override // ez0
    public final void b(lz0 lz0Var) {
        int i;
        boolean z;
        xq6 xq6Var;
        yq3 v;
        ArrayDeque arrayDeque = this.j;
        if (this.f != null) {
            byte[] bArr = lz0Var.c;
            int i2 = lz0Var.b;
            long j = lz0Var.a;
            pc0 a = pc0.a(lz0Var.d, bArr);
            if (a == null || (i = a.c) <= 0) {
                d("bad part " + j);
                return;
            }
            byte[] bArr2 = lz0Var.c;
            int i3 = a.b;
            w41 w41Var = new w41(Arrays.copyOfRange(bArr2, i3, i + i3));
            k88 k88Var = new k88((Object) new sc8((byte) 28), (byte) 14);
            Object obj = new Object();
            i2f i2fVar = new i2f((byte) 17);
            Uri parse = Uri.parse("tgstream://part/" + j);
            br6 br6Var = br6.g;
            qq6 qq6Var = new qq6();
            tq6 tq6Var = new tq6();
            List list = Collections.EMPTY_LIST;
            km5 km5Var = mm5.b;
            w59 w59Var = w59.e;
            vq6 vq6Var = new vq6();
            yq6 yq6Var = yq6.d;
            gre.p(tq6Var.b == null || tq6Var.a != null);
            if (parse != null) {
                uq6 uq6Var = tq6Var.a != null ? new uq6(tq6Var) : null;
                z = false;
                xq6Var = new xq6(parse, null, uq6Var, null, list, null, w59Var, -9223372036854775807L);
            } else {
                z = false;
                xq6Var = null;
            }
            br6 br6Var2 = new br6("", new sq6(qq6Var), xq6Var, new wq6(vq6Var), jr6.M, yq6Var);
            br6Var2.b.getClass();
            boolean z2 = z;
            br6Var2.b.getClass();
            uq6 uq6Var2 = br6Var2.b.c;
            if (uq6Var2 == null) {
                v = yq3.u;
            } else {
                synchronized (obj) {
                    v = uq6Var2.equals(null) ? null : mv6.v(uq6Var2);
                    v.getClass();
                }
            }
            vs8 vs8Var = new vs8(br6Var2, w41Var, k88Var, v, i2fVar, TLObject.FLAG_20, null);
            if (i2 != this.m) {
                StringBuilder sb = new StringBuilder("quality ");
                ir2.w(sb, this.m, " -> ", i2, " at ");
                sb.append(j);
                d(sb.toString());
                this.m = i2;
            }
            boolean isEmpty = arrayDeque.isEmpty();
            y54 y54Var = this.f;
            y54Var.y1();
            List singletonList = Collections.singletonList(vs8Var);
            y54Var.y1();
            y54Var.Q0(y54Var.p.size(), singletonList);
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

    @Override // ez0
    public final void c(long j) {
        if (this.f == null) {
            return;
        }
        this.j.clear();
        this.f.t();
        this.k = j;
    }

    @Override // ez0
    public final void d(String str) {
        if (w01.a) {
            fa4.b("[RtmpStream] ".concat(str));
        }
    }

    @Override // ez0
    public final void e(vy0 vy0Var) {
        this.c.b(vy0Var);
    }

    @Override // ez0
    public final void f() {
        un9 un9Var = this.d;
        if (un9Var != null) {
            un9Var.onRejoinRequested();
        }
    }

    @Override // ez0
    public final long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override // ez0
    public final jh i(iz0 iz0Var, hz0 hz0Var) {
        return this.c.a(iz0Var, hz0Var);
    }

    @Override // ez0
    public final dz0 j(Runnable runnable, long j) {
        tn9 tn9Var = new tn9(this, runnable, (byte) 0);
        this.b.postDelayed(tn9Var, Math.max(0L, j));
        return new kq8(this, tn9Var, (byte) 12);
    }

    public final void k(boolean z) {
        this.b.post(new k08((byte) 9, (Object) this, z));
    }

    public final void l(zn9 zn9Var, Runnable runnable) {
        if (this.b.post(new gm8(this, zn9Var, runnable, (byte) 21)) || runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // ez0
    public final void g(long j, int i, long j2) {
    }
}
