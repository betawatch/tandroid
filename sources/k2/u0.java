package k2;

import a8.yb;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.p4;
import f9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import jg.f1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u0 implements a0 {
    public static final AtomicInteger c0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public ByteBuffer I;
    public int J;
    public ByteBuffer K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public b2.g S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final a8.h0 b;
    public Handler b0;
    public final n0 c;
    public final d1 d;
    public final c2.v e;
    public final c1 f;
    public final s1 g;
    public final ArrayDeque h;
    public int i;
    public q0 j;
    public final t0 k;
    public final t0 l;
    public j2.j m;
    public y n;
    public r0 o;
    public r0 p;
    public c2.k q;
    public q r;
    public p0 s;
    public j0 t;
    public b2.f u;
    public s0 v;
    public s0 w;
    public b2.a1 x;
    public boolean y;
    public long z;

    public u0(p4 p4Var) {
        int deviceId;
        Context context = (Context) p4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = b2.f.i;
        this.b = (a8.h0) p4Var.d;
        this.i = 0;
        this.r = (l0) p4Var.f;
        n0 n0Var = new n0();
        this.c = n0Var;
        d1 d1Var = new d1();
        d1Var.m = e2.n0.b;
        this.d = d1Var;
        this.e = new c2.v();
        this.f = new c1();
        this.g = f9.i0.z(d1Var, n0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new b2.g();
        b2.a1 a1Var = b2.a1.d;
        this.w = new s0(a1Var, 0L, 0L);
        this.x = a1Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new t0();
        this.l = new t0();
        int i10 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i10 = deviceId;
        }
        this.U = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15;
        int i16;
        int i17;
        if (i10 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i11 = 0;
            } else {
                byte b12 = byteBuffer.get(26);
                int i18 = 28;
                int i19 = 28;
                for (int i20 = 0; i20 < b12; i20++) {
                    i19 += byteBuffer.get(i20 + 27);
                }
                byte b13 = byteBuffer.get(i19 + 26);
                for (int i21 = 0; i21 < b13; i21++) {
                    i18 += byteBuffer.get(i19 + 27 + i21);
                }
                i11 = i19 + i18;
            }
            int i22 = byteBuffer.get(i11 + 26) + 27 + i11;
            return (int) ((f2.q.e(byteBuffer.get(i22), byteBuffer.limit() - i22 > 1 ? byteBuffer.get(i22 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = e2.n0.a;
                    int i23 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i23 = Integer.reverseBytes(i23);
                    }
                    if ((i23 & (-2097152)) == -2097152 && (i15 = (i23 >>> 19) & 3) != 1 && (i16 = (i23 >>> 17) & 3) != 0) {
                        int i24 = (i23 >>> 12) & 15;
                        int i25 = (i23 >>> 10) & 3;
                        if (i24 != 0 && i24 != 15 && i25 != 3) {
                            i14 = 1152;
                            if (i16 != 1) {
                                if (i16 != 2) {
                                    if (i16 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i14 = 384;
                                }
                            } else if (i15 != 3) {
                                i14 = 576;
                            }
                            if (i14 == -1) {
                                return i14;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i14 = -1;
                    if (i14 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i26 = position2;
                            while (true) {
                                if (i26 <= limit) {
                                    String str2 = e2.n0.a;
                                    int i27 = byteBuffer.getInt(i26 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i27 = Integer.reverseBytes(i27);
                                    }
                                    if ((i27 & (-2)) == -126718022) {
                                        i17 = i26 - position2;
                                    } else {
                                        i26++;
                                    }
                                } else {
                                    i17 = -1;
                                }
                            }
                            if (i17 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i17) + (((byteBuffer.get((byteBuffer.position() + i17) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return c3.b.m(new a4.g(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(ic.a.i(i10, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return c3.b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position4 = byteBuffer.position();
        byte b14 = byteBuffer.get(position4);
        if (b14 != -2) {
            if (b14 == -1) {
                i12 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b11 = byteBuffer.get(position4 + 7);
            } else if (b14 != 31) {
                i12 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b10 = byteBuffer.get(position4 + 5);
            } else {
                i12 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b11 = byteBuffer.get(position4 + 6);
            }
            i13 = b11 & 60;
            return (((i13 >> 2) | i12) + 1) * 32;
        }
        i12 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b10 = byteBuffer.get(position4 + 4);
        i13 = b10 & 252;
        return (((i13 >> 2) | i12) + 1) * 32;
    }

    public final void A(b2.g gVar) {
        if (this.S.equals(gVar)) {
            return;
        }
        gVar.getClass();
        if (this.t != null) {
            this.S.getClass();
        }
        this.S = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        byte b10;
        int i11;
        int i12;
        yb.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (r0.a(this.p)) {
                int a02 = (int) e2.n0.a0(e2.n0.S(20L), ((p) this.p.e).b, 1000000L, RoundingMode.UP);
                long l4 = l();
                long j10 = a02;
                if (l4 < j10) {
                    r0 r0Var = this.p;
                    int i13 = ((p) r0Var.e).a;
                    int i14 = r0Var.b;
                    int i15 = (int) l4;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < a02) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i13 == 4) {
                                float h = e2.n0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i12 = (int) (h < 0.0f ? (-h) * (-2.14748365E9f) : h * 2.14748365E9f);
                            } else if (i13 == 21) {
                                i10 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            } else if (i13 != 22) {
                                if (i13 == 268435456) {
                                    i10 = (byteBuffer.get() & 255) << 24;
                                    i11 = (byteBuffer.get() & 255) << 16;
                                } else if (i13 == 1342177280) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i11 = (byteBuffer.get() & 255) << 8;
                                } else if (i13 == 1610612736) {
                                    i10 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i11 = byteBuffer.get() & 255;
                                } else {
                                    if (i13 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i12 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i12 = i10 | i11;
                            } else {
                                i10 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            int i16 = (int) ((i12 * i15) / j10);
                            if (i13 != 2) {
                                byteBuffer2.put((byte) (i16 >> 16));
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i13 == 3) {
                                byteBuffer2.put((byte) (i16 >> 24));
                            } else if (i13 != 4) {
                                if (i13 == 21) {
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i13 == 22) {
                                    byteBuffer2.put((byte) i16);
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 24));
                                } else if (i13 == 268435456) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                } else if (i13 == 1342177280) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                } else if (i13 == 1610612736) {
                                    byteBuffer2.put((byte) (i16 >> 24));
                                    byteBuffer2.put((byte) (i16 >> 16));
                                    byteBuffer2.put((byte) (i16 >> 8));
                                    byteBuffer2.put((byte) i16);
                                } else {
                                    if (i13 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    if (i16 < 0) {
                                        byteBuffer2.putDouble((-i16) / (-2.147483648E9d));
                                    } else {
                                        byteBuffer2.putDouble(i16 / 2.147483647E9d);
                                    }
                                }
                            } else if (i16 < 0) {
                                byteBuffer2.putFloat((-i16) / (-2.14748365E9f));
                            } else {
                                byteBuffer2.putFloat(i16 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() != position + i14) {
                                i15++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i11 = (b10 & 255) << 24;
                        i12 = i10 | i11;
                        int i162 = (int) ((i12 * i15) / j10);
                        if (i13 != 2) {
                        }
                        if (byteBuffer.position() != position + i14) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.K = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.K = byteBuffer2;
        }
    }

    public final void C(b2.a1 a1Var) {
        if (D()) {
            this.x = a1Var;
            x();
            return;
        }
        b2.a1 a1Var2 = new b2.a1(e2.n0.h(a1Var.a, 0.1f, 8.0f), e2.n0.h(a1Var.b, 0.1f, 8.0f));
        this.x = a1Var2;
        s0 s0Var = new s0(a1Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = s0Var;
        } else {
            this.w = s0Var;
        }
    }

    public final boolean D() {
        r0 r0Var = this.p;
        return r0Var != null && ((p) r0Var.e).j;
    }

    public final void a(long j10) {
        b2.a1 a1Var;
        boolean D = D();
        boolean z10 = false;
        a8.h0 h0Var = this.b;
        if (D) {
            a1Var = b2.a1.d;
        } else {
            if (this.V || !r0.a(this.p)) {
                a1Var = b2.a1.d;
            } else {
                int i10 = ((b2.x) this.p.c).M;
                a1Var = this.x;
                c2.u uVar = (c2.u) h0Var.d;
                float f7 = a1Var.a;
                uVar.getClass();
                yb.g(f7 > 0.0f);
                if (uVar.c != f7) {
                    uVar.c = f7;
                    uVar.i = true;
                }
                float f10 = a1Var.b;
                yb.g(f10 > 0.0f);
                if (uVar.d != f10) {
                    uVar.d = f10;
                    uVar.i = true;
                }
            }
            this.x = a1Var;
        }
        b2.a1 a1Var2 = a1Var;
        if (!this.V && r0.a(this.p)) {
            int i11 = ((b2.x) this.p.c).M;
            z10 = this.y;
            ((z0) h0Var.c).o = z10;
        }
        this.y = z10;
        this.h.add(new s0(a1Var2, Math.max(0L, j10), e2.n0.Y(((p) this.p.e).b, l())));
        c2.k kVar = (c2.k) this.p.f;
        this.q = kVar;
        kVar.a();
        y yVar = this.n;
        if (yVar != null) {
            yVar.onSkipSilenceEnabledChanged(this.y);
        }
    }

    public final j0 b(p pVar) {
        try {
            return ((l0) this.r).a(pVar);
        } catch (n e) {
            x xVar = new x(pVar.b, pVar.c, pVar.a, pVar.f, (b2.x) this.p.c, pVar.e, e);
            y yVar = this.n;
            if (yVar == null) {
                throw xVar;
            }
            yVar.r(xVar);
            throw xVar;
        }
    }

    public final void c(b2.x xVar, int[] iArr) {
        c2.k kVar;
        b2.x xVar2;
        int i10;
        int i11;
        if (this.s == null && this.a != null) {
            p0 p0Var = new p0(this);
            this.s = p0Var;
            l0 l0Var = (l0) this.r;
            l0Var.f();
            if (l0Var.f == null) {
                l0Var.f = new e2.r(Thread.currentThread());
            }
            l0Var.f.a(p0Var);
        }
        String str = xVar.s;
        int i12 = xVar.K;
        int i13 = xVar.M;
        if ("audio/raw".equals(str)) {
            yb.g(e2.n0.M(i13));
            int u10 = e2.n0.u(i13) * i12;
            f9.f0 f0Var = new f9.f0(4);
            f0Var.d(this.g);
            f0Var.c(this.e);
            c2.o[] oVarArr = (c2.o[]) this.b.b;
            int length = oVarArr.length;
            f9.o.d(length, oVarArr);
            f0Var.e(length);
            System.arraycopy(oVarArr, 0, f0Var.a, f0Var.b, length);
            f0Var.b += length;
            kVar = new c2.k(f0Var.f());
            if (kVar.equals(this.q)) {
                kVar = this.q;
            }
            int i14 = xVar.N;
            int i15 = xVar.O;
            d1 d1Var = this.d;
            d1Var.i = i14;
            d1Var.j = i15;
            this.c.i = iArr;
            c2.l lVar = new c2.l(xVar.L, i12, i13);
            try {
                f9.i0 i0Var = kVar.a;
                if (lVar.equals(c2.l.e)) {
                    throw new c2.n(lVar);
                }
                for (int i16 = 0; i16 < i0Var.size(); i16++) {
                    c2.o oVar = (c2.o) i0Var.get(i16);
                    c2.l e = oVar.e(lVar);
                    if (oVar.isActive()) {
                        yb.p(!e.equals(c2.l.e));
                        lVar = e;
                    }
                }
                int i17 = lVar.b;
                int i18 = lVar.c;
                b2.w a2 = xVar.a();
                a2.L = i18;
                a2.K = lVar.a;
                a2.J = i17;
                xVar2 = new b2.x(a2);
                i10 = u10;
                i11 = e2.n0.u(i18) * i17;
            } catch (c2.n e10) {
                throw new w(e10, xVar);
            }
        } else {
            kVar = new c2.k(s1.e);
            xVar2 = xVar;
            i10 = -1;
            i11 = -1;
        }
        c2.k kVar2 = kVar;
        k i19 = i(xVar2);
        b2.x xVar3 = i19.a;
        try {
            p c10 = ((l0) this.r).c(i19);
            boolean z10 = c10.e;
            if (c10.a == 0) {
                throw new w("Invalid output encoding (isOffload=" + z10 + ")", xVar3);
            }
            if (c10.c == 0) {
                throw new w("Invalid output channel config (isOffload=" + z10 + ")", xVar3);
            }
            this.X = false;
            r0 r0Var = new r0(xVar, xVar2, i10, i11, c10, kVar2);
            if (p()) {
                this.o = r0Var;
            } else {
                this.p = r0Var;
            }
        } catch (j e11) {
            throw new w(e11, xVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10) {
        y yVar;
        y yVar2;
        if (this.K == null) {
            return;
        }
        t0 t0Var = this.l;
        if (t0Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < t0Var.c)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g7 = this.t.g(j10, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            t0Var.a = null;
            t0Var.b = -9223372036854775807L;
            t0Var.c = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (yVar2 = this.n) != null && !g7 && !this.Y) {
                    yVar2.j();
                }
            }
            if (r0.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g7) {
                if (!r0.a(this.p)) {
                    yb.p(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (i e) {
            boolean z10 = e.b;
            if (z10) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((p) this.p.e).e) {
                            this.X = true;
                        }
                    }
                }
                z zVar = new z(e.a, (b2.x) this.p.c, r4);
                yVar = this.n;
                if (yVar != null) {
                    yVar.r(zVar);
                }
                if (!z10) {
                    throw zVar;
                }
                t0Var.a(zVar);
                return;
            }
            r4 = false;
            z zVar2 = new z(e.a, (b2.x) this.p.c, r4);
            yVar = this.n;
            if (yVar != null) {
            }
            if (!z10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.q.d()) {
            d(Long.MIN_VALUE);
            return this.K == null;
        }
        c2.k kVar = this.q;
        if (kVar.d() && !kVar.d) {
            kVar.d = true;
            ((c2.o) kVar.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        f0 f0Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new s0(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.M = false;
            this.L = false;
            this.N = false;
            this.d.o = 0L;
            c2.k kVar = (c2.k) this.p.f;
            this.q = kVar;
            kVar.a();
            this.j = null;
            r0 r0Var = this.o;
            if (r0Var != null) {
                this.p = r0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            j0 j0Var = this.t;
            if (j0Var.f.d.getPlayState() == 3) {
                j0Var.a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && j0Var.c()) {
                i0 i0Var = j0Var.i;
                i0Var.getClass();
                i0.a(i0Var);
            }
            if (i10 >= 24 && (f0Var = j0Var.e) != null) {
                f0.b(f0Var);
                j0Var.e = null;
            }
            AudioTrack audioTrack = j0Var.a;
            e2.r rVar = j0Var.j;
            Handler q5 = e2.n0.q(null);
            synchronized (j0.t) {
                try {
                    if (j0.u == null) {
                        j0.u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    j0.v++;
                    j0.u.schedule(new f1(audioTrack, q5, rVar, 3), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        t0 t0Var = this.l;
        t0Var.a = null;
        t0Var.b = -9223372036854775807L;
        t0Var.c = -9223372036854775807L;
        t0 t0Var2 = this.k;
        t0Var2.a = null;
        t0Var2.b = -9223372036854775807L;
        t0Var2.c = -9223372036854775807L;
        this.Z = 0L;
        this.a0 = 0L;
        Handler handler = this.b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        if (!p()) {
            return -9223372036854775807L;
        }
        if (r0.a(this.p)) {
            return e2.n0.Y(((p) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j10 = c3.b.j(((p) this.p.e).a);
        yb.p(j10 != -2147483647);
        return e2.n0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), e2.n0.Y(((p) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((s0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (s0) arrayDeque.remove();
        }
        s0 s0Var = this.w;
        long j11 = min - s0Var.c;
        long B = e2.n0.B(j11, s0Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        a8.h0 h0Var = this.b;
        if (isEmpty) {
            c2.u uVar = (c2.u) h0Var.d;
            if (uVar.isActive()) {
                if (uVar.n >= 1024) {
                    long j12 = uVar.m;
                    uVar.j.getClass();
                    long o10 = j12 - (r8.i.o() * (r8.j * r8.b));
                    int i10 = uVar.h.a;
                    int i11 = uVar.g.a;
                    j11 = i10 == i11 ? e2.n0.a0(j11, o10, uVar.n, RoundingMode.DOWN) : e2.n0.a0(j11, o10 * i10, uVar.n * i11, RoundingMode.DOWN);
                } else {
                    j11 = (long) (uVar.c * j11);
                }
            }
            s0 s0Var2 = this.w;
            j10 = s0Var2.b + j11;
            s0Var2.d = j11 - B;
        } else {
            s0 s0Var3 = this.w;
            j10 = s0Var3.b + B + s0Var3.d;
        }
        long j13 = ((z0) h0Var.c).q;
        long Y = e2.n0.Y(((p) this.p.e).b, j13) + j10;
        long j14 = this.Z;
        if (j13 > j14) {
            long Y2 = e2.n0.Y(((p) this.p.e).b, j13 - j14);
            this.Z = j13;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new c(this, 2), 100L);
        }
        return Y;
    }

    public final k i(b2.x xVar) {
        k kVar = new k(xVar);
        kVar.b = this.u;
        kVar.d = this.i != 0;
        kVar.c = this.T;
        kVar.e = this.Q;
        kVar.g = this.V;
        kVar.h = -1;
        kVar.f = this.U;
        return new k(kVar);
    }

    public final int j(b2.x xVar) {
        boolean z10;
        if (!e2.n0.M(xVar.M) || xVar.M == 2) {
            z10 = false;
        } else {
            b2.w a2 = xVar.a();
            a2.L = 2;
            xVar = new b2.x(a2);
            z10 = true;
        }
        int i10 = ((l0) this.r).b(i(xVar)).d;
        if (i10 != 1) {
            if (i10 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!r0.a(this.p)) {
            return this.C;
        }
        long j10 = this.B;
        long j11 = this.p.b;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (r5 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0091, code lost:
    
        if (o() == false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(long j10, int i10, ByteBuffer byteBuffer) {
        long j11;
        long j12;
        long j13;
        ByteBuffer byteBuffer2 = this.I;
        yb.g(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    p pVar = (p) this.p.e;
                    i((b2.x) this.o.d);
                    if (!((p) this.o.e).equals(pVar)) {
                        s();
                        if (!n()) {
                            f();
                            a(j10);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                j0 j0Var = this.t;
                if (j0Var != null && j0Var.c() && ((p) this.p.e).k) {
                    this.t.e();
                    j0 j0Var2 = this.t;
                    b2.x xVar = (b2.x) this.p.c;
                    j0Var2.d(xVar.N, xVar.O);
                    this.Y = true;
                }
                a(j10);
            }
            return false;
        }
        boolean p10 = p();
        t0 t0Var = this.k;
        if (!p10) {
            try {
            } catch (x e) {
                if (e.a) {
                    throw e;
                }
                t0Var.a(e);
                return false;
            }
        }
        t0Var.a = null;
        t0Var.b = -9223372036854775807L;
        t0Var.c = -9223372036854775807L;
        if (this.F) {
            this.G = Math.max(0L, j10);
            this.E = false;
            this.F = false;
            if (D()) {
                x();
            }
            a(j10);
            if (this.O) {
                r();
            }
        }
        if (this.I == null) {
            yb.g(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!r0.a(this.p) && this.D == 0) {
                    int k10 = k(((p) this.p.e).a, byteBuffer);
                    this.D = k10;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j10);
                        this.v = null;
                    }
                    return false;
                }
                long j14 = this.G;
                r0 r0Var = this.p;
                if (r0.a(r0Var)) {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.z / this.p.a;
                } else {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.A;
                }
                long Y = e2.n0.Y(((b2.x) r0Var.c).L, j13 - this.d.o) + j14;
                if (!this.E && Math.abs(Y - j10) > 200000) {
                    y yVar = this.n;
                    if (yVar != null) {
                        StringBuilder t10 = a1.g.t(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        t10.append(j10);
                        yVar.r(new com.google.firebase.messaging.p(t10.toString()));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (e()) {
                        long j15 = j10 - Y;
                        this.G += j15;
                        this.E = false;
                        a(j10);
                        y yVar2 = this.n;
                        if (yVar2 != null && j15 != j12) {
                            yVar2.v();
                        }
                    }
                    return false;
                }
                if (r0.a(this.p)) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i10) + this.A;
                }
                this.I = byteBuffer;
                this.J = i10;
            }
            return true;
        }
        j11 = -9223372036854775807L;
        j12 = 0;
        u(j10);
        if (!this.I.hasRemaining()) {
            this.I = null;
            this.J = 0;
            return true;
        }
        j0 j0Var3 = this.t;
        m0 m0Var = j0Var3.f;
        long b10 = j0Var3.b();
        if (m0Var.v != j11 && b10 > j12) {
            m0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - m0Var.v >= 200) {
                e2.a.l("DefaultAudioSink", "Resetting stalled audio output");
                f();
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        if (!p()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.N) {
            return false;
        }
        long l4 = l();
        long a2 = this.t.a();
        j0 j0Var = this.t;
        j0Var.getClass();
        return l4 > e2.n0.a0(a2, (long) j0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        j0 b10;
        t0 t0Var = this.k;
        if (t0Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < t0Var.c)) {
            return false;
        }
        try {
            b10 = b((p) this.p.e);
        } catch (x e) {
            int i10 = ((p) this.p.e).f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                r0 r0Var = this.p;
                int i12 = r0Var.b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                int i14 = i13 != 0 ? (i12 - i13) + i11 : i11;
                o a2 = ((p) r0Var.e).a();
                a2.f = i14;
                p pVar = new p(a2);
                try {
                    b10 = b(pVar);
                    r0 r0Var2 = this.p;
                    this.p = new r0((b2.x) r0Var2.c, (b2.x) r0Var2.d, r0Var2.a, r0Var2.b, pVar, (c2.k) r0Var2.f);
                } catch (x e10) {
                    e.addSuppressed(e10);
                    i10 = i14;
                }
            }
            if (!((p) this.p.e).e) {
                throw e;
            }
            this.X = true;
            throw e;
        }
        this.t = b10;
        q0 q0Var = new q0(this, (p) this.p.e);
        this.j = q0Var;
        b10.j.a(q0Var);
        if (this.t.c()) {
            r0 r0Var3 = this.p;
            if (((p) r0Var3.e).k) {
                j0 j0Var = this.t;
                b2.x xVar = (b2.x) r0Var3.c;
                j0Var.d(xVar.N, xVar.O);
            }
        }
        j2.j jVar = this.m;
        if (jVar != null) {
            this.t.f(jVar);
        }
        if (p()) {
            this.t.a.setVolume(this.H);
        }
        this.S.getClass();
        AudioDeviceInfo audioDeviceInfo = this.T;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z10 = audioSessionId != this.Q;
        this.Q = audioSessionId;
        y yVar = this.n;
        if (yVar != null) {
            int i15 = ((p) this.p.e).a;
            yVar.D(new v0());
            if (z10) {
                this.R = true;
                r0 r0Var4 = this.p;
                o a10 = ((p) r0Var4.e).a();
                a10.h = this.Q;
                this.p = new r0((b2.x) r0Var4.c, (b2.x) r0Var4.d, r0Var4.a, r0Var4.b, new p(a10), (c2.k) r0Var4.f);
                r0 r0Var5 = this.o;
                if (r0Var5 != null) {
                    o a11 = ((p) r0Var5.e).a();
                    a11.h = this.Q;
                    this.o = new r0((b2.x) r0Var5.c, (b2.x) r0Var5.d, r0Var5.a, r0Var5.b, new p(a11), (c2.k) r0Var5.f);
                }
                this.n.onAudioSessionIdChanged(this.Q);
            }
        }
        return true;
    }

    public final boolean p() {
        return this.t != null;
    }

    public final void q() {
        this.O = false;
        if (p()) {
            j0 j0Var = this.t;
            m0 m0Var = j0Var.f;
            m0Var.k = 0L;
            m0Var.t = 0;
            m0Var.s = 0;
            m0Var.l = 0L;
            m0Var.y = -9223372036854775807L;
            m0Var.z = -9223372036854775807L;
            if (m0Var.u == -9223372036854775807L) {
                m0Var.h.a(0);
            }
            m0Var.w = m0Var.a();
            if (!j0Var.k || j0Var.c()) {
                j0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            j0 j0Var = this.t;
            m0 m0Var = j0Var.f;
            if (m0Var.u != -9223372036854775807L) {
                m0Var.b.getClass();
                m0Var.u = e2.n0.S(SystemClock.elapsedRealtime());
            }
            m0Var.j = e2.n0.Y(m0Var.e, m0Var.a());
            m0Var.h.a(0);
            if (!j0Var.k || j0Var.c()) {
                j0Var.a.play();
            }
        }
    }

    public final void s() {
        if (this.M) {
            return;
        }
        this.M = true;
        if (this.t.c()) {
            this.N = false;
        }
        j0 j0Var = this.t;
        if (j0Var.k) {
            return;
        }
        j0Var.k = true;
        m0 m0Var = j0Var.f;
        long b10 = j0Var.b();
        m0Var.w = m0Var.a();
        m0Var.b.getClass();
        m0Var.u = e2.n0.S(SystemClock.elapsedRealtime());
        m0Var.x = b10;
        j0Var.a.stop();
        j0Var.p = 0;
    }

    public final void t() {
        if (!this.L && p() && e()) {
            s();
            this.L = true;
        }
    }

    public final void u(long j10) {
        ByteBuffer byteBuffer;
        d(j10);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                B(byteBuffer2);
                d(j10);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                c2.k kVar = this.q;
                if (kVar.d()) {
                    ByteBuffer byteBuffer3 = kVar.c[kVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        kVar.e(c2.o.a);
                        byteBuffer = kVar.c[kVar.b()];
                    }
                } else {
                    byteBuffer = c2.o.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c2.k kVar2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (kVar2.d() && !kVar2.d) {
                        kVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void v() {
        if (this.p != null) {
            r0 r0Var = this.o;
            if (r0Var != null) {
                this.p = r0Var;
                this.o = null;
            }
            try {
                p c10 = ((l0) this.r).c(i((b2.x) this.p.d));
                r0 r0Var2 = this.p;
                this.p = new r0((b2.x) r0Var2.c, (b2.x) r0Var2.d, r0Var2.a, r0Var2.b, c10, (c2.k) r0Var2.f);
            } catch (j e) {
                throw new IllegalStateException(new w(e, (b2.x) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        f9.g0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.o) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        c2.k kVar = this.q;
        if (kVar != null) {
            f9.i0 i0Var = kVar.a;
            for (int i10 = 0; i10 < i0Var.size(); i10++) {
                c2.o oVar = (c2.o) i0Var.get(i10);
                oVar.d(c2.m.b);
                oVar.reset();
            }
            kVar.b.clear();
            kVar.c = new ByteBuffer[0];
            c2.l lVar = c2.l.e;
            kVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            j0 j0Var = this.t;
            b2.a1 a1Var = this.x;
            AudioTrack audioTrack = j0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.n0.h(a1Var.a, 0.1f, j0Var.c)).setPitch(e2.n0.h(a1Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m0 m0Var = j0Var.f;
            m0Var.i = audioTrack.getPlaybackParams().getSpeed();
            m0Var.h.a(0);
            m0Var.k = 0L;
            m0Var.t = 0;
            m0Var.s = 0;
            m0Var.l = 0L;
            m0Var.y = -9223372036854775807L;
            m0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new b2.a1(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(q qVar) {
        if (qVar.equals(this.r)) {
            return;
        }
        ((l0) this.r).d();
        this.r = qVar;
        p0 p0Var = this.s;
        if (p0Var != null) {
            l0 l0Var = (l0) qVar;
            l0Var.f();
            if (l0Var.f == null) {
                l0Var.f = new e2.r(Thread.currentThread());
            }
            l0Var.f.a(p0Var);
        }
        v();
    }

    public final void z(int i10) {
        if (this.R) {
            if (this.Q != i10) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i10) {
            this.Q = i10;
            this.P = i10 != 0;
            v();
        }
    }
}
