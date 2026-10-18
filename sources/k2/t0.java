package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ci.o4;
import e9.x1;
import ei.bc;
import ig.e2;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class t0 implements z {
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
    public final androidx.biometric.e b;
    public Handler b0;
    public final m0 c;
    public final c1 d;
    public final c2.u e;
    public final b1 f;
    public final x1 g;
    public final ArrayDeque h;
    public int i;
    public p0 j;
    public final s0 k;
    public final s0 l;
    public j2.k m;
    public x n;
    public q0 o;
    public q0 p;
    public c2.j q;
    public p r;
    public o0 s;
    public i0 t;
    public b2.f u;
    public r0 v;
    public r0 w;
    public b2.z0 x;
    public boolean y;
    public long z;

    public t0(o4 o4Var) {
        int deviceId;
        Context context = (Context) o4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = b2.f.i;
        this.b = (androidx.biometric.e) o4Var.d;
        this.i = 0;
        this.r = (k0) o4Var.f;
        m0 m0Var = new m0();
        this.c = m0Var;
        c1 c1Var = new c1();
        c1Var.m = e2.m0.b;
        this.d = c1Var;
        this.e = new c2.u();
        this.f = new b1();
        this.g = e9.n0.z(c1Var, m0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new b2.g();
        b2.z0 z0Var = b2.z0.d;
        this.w = new r0(z0Var, 0L, 0L);
        this.x = z0Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new s0();
        this.l = new s0();
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
                    String str = e2.m0.a;
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
                                    String str2 = e2.m0.a;
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
                            throw new IllegalStateException(i2.d.j(i10, "Unexpected audio encoding: "));
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
        u6.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (q0.a(this.p)) {
                int a02 = (int) e2.m0.a0(e2.m0.S(20L), ((o) this.p.e).b, 1000000L, RoundingMode.UP);
                long l4 = l();
                long j10 = a02;
                if (l4 < j10) {
                    q0 q0Var = this.p;
                    int i13 = ((o) q0Var.e).a;
                    int i14 = q0Var.b;
                    int i15 = (int) l4;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < a02) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i13 == 4) {
                                float h = e2.m0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
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

    public final void C(b2.z0 z0Var) {
        if (D()) {
            this.x = z0Var;
            x();
            return;
        }
        b2.z0 z0Var2 = new b2.z0(e2.m0.h(z0Var.a, 0.1f, 8.0f), e2.m0.h(z0Var.b, 0.1f, 8.0f));
        this.x = z0Var2;
        r0 r0Var = new r0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = r0Var;
        } else {
            this.w = r0Var;
        }
    }

    public final boolean D() {
        q0 q0Var = this.p;
        return q0Var != null && ((o) q0Var.e).j;
    }

    public final void a(long j10) {
        b2.z0 z0Var;
        boolean D = D();
        boolean z10 = false;
        androidx.biometric.e eVar = this.b;
        if (D) {
            z0Var = b2.z0.d;
        } else {
            if (this.V || !q0.a(this.p)) {
                z0Var = b2.z0.d;
            } else {
                int i10 = ((b2.w) this.p.c).M;
                z0Var = this.x;
                c2.t tVar = (c2.t) eVar.d;
                float f7 = z0Var.a;
                tVar.getClass();
                u6.g(f7 > 0.0f);
                if (tVar.c != f7) {
                    tVar.c = f7;
                    tVar.i = true;
                }
                float f10 = z0Var.b;
                u6.g(f10 > 0.0f);
                if (tVar.d != f10) {
                    tVar.d = f10;
                    tVar.i = true;
                }
            }
            this.x = z0Var;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && q0.a(this.p)) {
            int i11 = ((b2.w) this.p.c).M;
            z10 = this.y;
            ((y0) eVar.c).o = z10;
        }
        this.y = z10;
        this.h.add(new r0(z0Var2, Math.max(0L, j10), e2.m0.Y(((o) this.p.e).b, l())));
        c2.j jVar = (c2.j) this.p.f;
        this.q = jVar;
        jVar.a();
        x xVar = this.n;
        if (xVar != null) {
            xVar.onSkipSilenceEnabledChanged(this.y);
        }
    }

    public final i0 b(o oVar) {
        try {
            return ((k0) this.r).a(oVar);
        } catch (m e) {
            w wVar = new w(oVar.b, oVar.c, oVar.a, oVar.f, (b2.w) this.p.c, oVar.e, e);
            x xVar = this.n;
            if (xVar == null) {
                throw wVar;
            }
            xVar.I(wVar);
            throw wVar;
        }
    }

    public final void c(b2.w wVar, int[] iArr) {
        c2.j jVar;
        b2.w wVar2;
        int i10;
        int i11;
        if (this.s == null && this.a != null) {
            o0 o0Var = new o0(this);
            this.s = o0Var;
            k0 k0Var = (k0) this.r;
            k0Var.f();
            if (k0Var.f == null) {
                k0Var.f = new e2.r(Thread.currentThread());
            }
            k0Var.f.a(o0Var);
        }
        String str = wVar.s;
        int i12 = wVar.K;
        int i13 = wVar.M;
        if ("audio/raw".equals(str)) {
            u6.g(e2.m0.M(i13));
            int u10 = e2.m0.u(i13) * i12;
            e9.k0 k0Var2 = new e9.k0(4);
            k0Var2.d(this.g);
            k0Var2.c(this.e);
            c2.n[] nVarArr = (c2.n[]) this.b.b;
            int length = nVarArr.length;
            e9.s.d(length, nVarArr);
            k0Var2.e(length);
            System.arraycopy(nVarArr, 0, k0Var2.a, k0Var2.b, length);
            k0Var2.b += length;
            jVar = new c2.j(k0Var2.f());
            if (jVar.equals(this.q)) {
                jVar = this.q;
            }
            int i14 = wVar.N;
            int i15 = wVar.O;
            c1 c1Var = this.d;
            c1Var.i = i14;
            c1Var.j = i15;
            this.c.i = iArr;
            c2.k kVar = new c2.k(wVar.L, i12, i13);
            try {
                e9.n0 n0Var = jVar.a;
                if (kVar.equals(c2.k.e)) {
                    throw new c2.m(kVar);
                }
                for (int i16 = 0; i16 < n0Var.size(); i16++) {
                    c2.n nVar = (c2.n) n0Var.get(i16);
                    c2.k e = nVar.e(kVar);
                    if (nVar.isActive()) {
                        u6.p(!e.equals(c2.k.e));
                        kVar = e;
                    }
                }
                int i17 = kVar.b;
                int i18 = kVar.c;
                b2.v a2 = wVar.a();
                a2.L = i18;
                a2.K = kVar.a;
                a2.J = i17;
                wVar2 = new b2.w(a2);
                i10 = u10;
                i11 = e2.m0.u(i18) * i17;
            } catch (c2.m e7) {
                throw new v(e7, wVar);
            }
        } else {
            jVar = new c2.j(x1.e);
            wVar2 = wVar;
            i10 = -1;
            i11 = -1;
        }
        c2.j jVar2 = jVar;
        j i19 = i(wVar2);
        b2.w wVar3 = i19.a;
        try {
            o c10 = ((k0) this.r).c(i19);
            boolean z10 = c10.e;
            if (c10.a == 0) {
                throw new v("Invalid output encoding (isOffload=" + z10 + ")", wVar3);
            }
            if (c10.c == 0) {
                throw new v("Invalid output channel config (isOffload=" + z10 + ")", wVar3);
            }
            this.X = false;
            q0 q0Var = new q0(wVar, wVar2, i10, i11, c10, jVar2);
            if (p()) {
                this.o = q0Var;
            } else {
                this.p = q0Var;
            }
        } catch (i e10) {
            throw new v(e10, wVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10) {
        x xVar;
        x xVar2;
        if (this.K == null) {
            return;
        }
        s0 s0Var = this.l;
        if (s0Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < s0Var.c)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g10 = this.t.g(j10, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            s0Var.a = null;
            s0Var.b = -9223372036854775807L;
            s0Var.c = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (xVar2 = this.n) != null && !g10 && !this.Y) {
                    xVar2.k();
                }
            }
            if (q0.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g10) {
                if (!q0.a(this.p)) {
                    u6.p(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (h e) {
            boolean z10 = e.b;
            if (z10) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((o) this.p.e).e) {
                            this.X = true;
                        }
                    }
                }
                y yVar = new y(e.a, (b2.w) this.p.c, r4);
                xVar = this.n;
                if (xVar != null) {
                    xVar.I(yVar);
                }
                if (!z10) {
                    throw yVar;
                }
                s0Var.a(yVar);
                return;
            }
            r4 = false;
            y yVar2 = new y(e.a, (b2.w) this.p.c, r4);
            xVar = this.n;
            if (xVar != null) {
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
        c2.j jVar = this.q;
        if (jVar.d() && !jVar.d) {
            jVar.d = true;
            ((c2.n) jVar.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        d0 d0Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new r0(this.x, 0L, 0L);
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
            c2.j jVar = (c2.j) this.p.f;
            this.q = jVar;
            jVar.a();
            this.j = null;
            q0 q0Var = this.o;
            if (q0Var != null) {
                this.p = q0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            i0 i0Var = this.t;
            if (i0Var.f.d.getPlayState() == 3) {
                i0Var.a.pause();
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29 && i0Var.c()) {
                h0 h0Var = i0Var.i;
                h0Var.getClass();
                h0.a(h0Var);
            }
            if (i10 >= 24 && (d0Var = i0Var.e) != null) {
                d0.b(d0Var);
                i0Var.e = null;
            }
            AudioTrack audioTrack = i0Var.a;
            e2.r rVar = i0Var.j;
            Handler q6 = e2.m0.q(null);
            synchronized (i0.t) {
                try {
                    if (i0.u == null) {
                        i0.u = Executors.newSingleThreadScheduledExecutor(new e2.l0(0));
                    }
                    i0.v++;
                    i0.u.schedule(new e2(audioTrack, q6, rVar, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        s0 s0Var = this.l;
        s0Var.a = null;
        s0Var.b = -9223372036854775807L;
        s0Var.c = -9223372036854775807L;
        s0 s0Var2 = this.k;
        s0Var2.a = null;
        s0Var2.b = -9223372036854775807L;
        s0Var2.c = -9223372036854775807L;
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
        if (q0.a(this.p)) {
            return e2.m0.Y(((o) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.p.e).a);
        u6.p(j10 != -2147483647);
        return e2.m0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), e2.m0.Y(((o) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((r0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (r0) arrayDeque.remove();
        }
        r0 r0Var = this.w;
        long j11 = min - r0Var.c;
        long B = e2.m0.B(j11, r0Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        androidx.biometric.e eVar = this.b;
        if (isEmpty) {
            c2.t tVar = (c2.t) eVar.d;
            if (tVar.isActive()) {
                if (tVar.n >= 1024) {
                    long j12 = tVar.m;
                    tVar.j.getClass();
                    long o10 = j12 - (r8.i.o() * (r8.j * r8.b));
                    int i10 = tVar.h.a;
                    int i11 = tVar.g.a;
                    j11 = i10 == i11 ? e2.m0.a0(j11, o10, tVar.n, RoundingMode.DOWN) : e2.m0.a0(j11, o10 * i10, tVar.n * i11, RoundingMode.DOWN);
                } else {
                    j11 = (long) (tVar.c * j11);
                }
            }
            r0 r0Var2 = this.w;
            j10 = r0Var2.b + j11;
            r0Var2.d = j11 - B;
        } else {
            r0 r0Var3 = this.w;
            j10 = r0Var3.b + B + r0Var3.d;
        }
        long j13 = ((y0) eVar.c).q;
        long Y = e2.m0.Y(((o) this.p.e).b, j13) + j10;
        long j14 = this.Z;
        if (j13 > j14) {
            long Y2 = e2.m0.Y(((o) this.p.e).b, j13 - j14);
            this.Z = j13;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new bc(this, 28), 100L);
        }
        return Y;
    }

    public final j i(b2.w wVar) {
        j jVar = new j(wVar);
        jVar.b = this.u;
        jVar.d = this.i != 0;
        jVar.c = this.T;
        jVar.e = this.Q;
        jVar.g = this.V;
        jVar.h = -1;
        jVar.f = this.U;
        return new j(jVar);
    }

    public final int j(b2.w wVar) {
        boolean z10;
        if (!e2.m0.M(wVar.M) || wVar.M == 2) {
            z10 = false;
        } else {
            b2.v a2 = wVar.a();
            a2.L = 2;
            wVar = new b2.w(a2);
            z10 = true;
        }
        int i10 = ((k0) this.r).b(i(wVar)).d;
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
        if (!q0.a(this.p)) {
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
        u6.g(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    o oVar = (o) this.p.e;
                    i((b2.w) this.o.d);
                    if (!((o) this.o.e).equals(oVar)) {
                        s();
                        if (!n()) {
                            f();
                            a(j10);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                i0 i0Var = this.t;
                if (i0Var != null && i0Var.c() && ((o) this.p.e).k) {
                    this.t.e();
                    i0 i0Var2 = this.t;
                    b2.w wVar = (b2.w) this.p.c;
                    i0Var2.d(wVar.N, wVar.O);
                    this.Y = true;
                }
                a(j10);
            }
            return false;
        }
        boolean p5 = p();
        s0 s0Var = this.k;
        if (!p5) {
            try {
            } catch (w e) {
                if (e.a) {
                    throw e;
                }
                s0Var.a(e);
                return false;
            }
        }
        s0Var.a = null;
        s0Var.b = -9223372036854775807L;
        s0Var.c = -9223372036854775807L;
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
            u6.g(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!q0.a(this.p) && this.D == 0) {
                    int k10 = k(((o) this.p.e).a, byteBuffer);
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
                q0 q0Var = this.p;
                if (q0.a(q0Var)) {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.z / this.p.a;
                } else {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.A;
                }
                long Y = e2.m0.Y(((b2.w) q0Var.c).L, j13 - this.d.o) + j14;
                if (!this.E && Math.abs(Y - j10) > 200000) {
                    x xVar = this.n;
                    if (xVar != null) {
                        StringBuilder t10 = a1.g.t(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        t10.append(j10);
                        xVar.I(new com.google.firebase.messaging.q(t10.toString()));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (e()) {
                        long j15 = j10 - Y;
                        this.G += j15;
                        this.E = false;
                        a(j10);
                        x xVar2 = this.n;
                        if (xVar2 != null && j15 != j12) {
                            xVar2.L();
                        }
                    }
                    return false;
                }
                if (q0.a(this.p)) {
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
        i0 i0Var3 = this.t;
        l0 l0Var = i0Var3.f;
        long b10 = i0Var3.b();
        if (l0Var.v != j11 && b10 > j12) {
            l0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - l0Var.v >= 200) {
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
        i0 i0Var = this.t;
        i0Var.getClass();
        return l4 > e2.m0.a0(a2, (long) i0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        i0 b10;
        s0 s0Var = this.k;
        if (s0Var.a != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < s0Var.c)) {
            return false;
        }
        try {
            b10 = b((o) this.p.e);
        } catch (w e) {
            int i10 = ((o) this.p.e).f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                q0 q0Var = this.p;
                int i12 = q0Var.b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                int i14 = i13 != 0 ? (i12 - i13) + i11 : i11;
                n a2 = ((o) q0Var.e).a();
                a2.f = i14;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    q0 q0Var2 = this.p;
                    this.p = new q0((b2.w) q0Var2.c, (b2.w) q0Var2.d, q0Var2.a, q0Var2.b, oVar, (c2.j) q0Var2.f);
                } catch (w e7) {
                    e.addSuppressed(e7);
                    i10 = i14;
                }
            }
            if (!((o) this.p.e).e) {
                throw e;
            }
            this.X = true;
            throw e;
        }
        this.t = b10;
        p0 p0Var = new p0(this, (o) this.p.e);
        this.j = p0Var;
        b10.j.a(p0Var);
        if (this.t.c()) {
            q0 q0Var3 = this.p;
            if (((o) q0Var3.e).k) {
                i0 i0Var = this.t;
                b2.w wVar = (b2.w) q0Var3.c;
                i0Var.d(wVar.N, wVar.O);
            }
        }
        j2.k kVar = this.m;
        if (kVar != null) {
            this.t.f(kVar);
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
        x xVar = this.n;
        if (xVar != null) {
            int i15 = ((o) this.p.e).a;
            xVar.P(new u0());
            if (z10) {
                this.R = true;
                q0 q0Var4 = this.p;
                n a10 = ((o) q0Var4.e).a();
                a10.h = this.Q;
                this.p = new q0((b2.w) q0Var4.c, (b2.w) q0Var4.d, q0Var4.a, q0Var4.b, new o(a10), (c2.j) q0Var4.f);
                q0 q0Var5 = this.o;
                if (q0Var5 != null) {
                    n a11 = ((o) q0Var5.e).a();
                    a11.h = this.Q;
                    this.o = new q0((b2.w) q0Var5.c, (b2.w) q0Var5.d, q0Var5.a, q0Var5.b, new o(a11), (c2.j) q0Var5.f);
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
            i0 i0Var = this.t;
            l0 l0Var = i0Var.f;
            l0Var.k = 0L;
            l0Var.t = 0;
            l0Var.s = 0;
            l0Var.l = 0L;
            l0Var.y = -9223372036854775807L;
            l0Var.z = -9223372036854775807L;
            if (l0Var.u == -9223372036854775807L) {
                l0Var.h.a(0);
            }
            l0Var.w = l0Var.a();
            if (!i0Var.k || i0Var.c()) {
                i0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            i0 i0Var = this.t;
            l0 l0Var = i0Var.f;
            if (l0Var.u != -9223372036854775807L) {
                l0Var.b.getClass();
                l0Var.u = e2.m0.S(SystemClock.elapsedRealtime());
            }
            l0Var.j = e2.m0.Y(l0Var.e, l0Var.a());
            l0Var.h.a(0);
            if (!i0Var.k || i0Var.c()) {
                i0Var.a.play();
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
        i0 i0Var = this.t;
        if (i0Var.k) {
            return;
        }
        i0Var.k = true;
        l0 l0Var = i0Var.f;
        long b10 = i0Var.b();
        l0Var.w = l0Var.a();
        l0Var.b.getClass();
        l0Var.u = e2.m0.S(SystemClock.elapsedRealtime());
        l0Var.x = b10;
        i0Var.a.stop();
        i0Var.p = 0;
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
                c2.j jVar = this.q;
                if (jVar.d()) {
                    ByteBuffer byteBuffer3 = jVar.c[jVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        jVar.e(c2.n.a);
                        byteBuffer = jVar.c[jVar.b()];
                    }
                } else {
                    byteBuffer = c2.n.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c2.j jVar2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (jVar2.d() && !jVar2.d) {
                        jVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void v() {
        if (this.p != null) {
            q0 q0Var = this.o;
            if (q0Var != null) {
                this.p = q0Var;
                this.o = null;
            }
            try {
                o c10 = ((k0) this.r).c(i((b2.w) this.p.d));
                q0 q0Var2 = this.p;
                this.p = new q0((b2.w) q0Var2.c, (b2.w) q0Var2.d, q0Var2.a, q0Var2.b, c10, (c2.j) q0Var2.f);
            } catch (i e) {
                throw new IllegalStateException(new v(e, (b2.w) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        c2.j jVar = this.q;
        if (jVar != null) {
            e9.n0 n0Var = jVar.a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.n nVar = (c2.n) n0Var.get(i10);
                nVar.d(c2.l.b);
                nVar.reset();
            }
            jVar.b.clear();
            jVar.c = new ByteBuffer[0];
            c2.k kVar = c2.k.e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            i0 i0Var = this.t;
            b2.z0 z0Var = this.x;
            AudioTrack audioTrack = i0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.m0.h(z0Var.a, 0.1f, i0Var.c)).setPitch(e2.m0.h(z0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            l0 l0Var = i0Var.f;
            l0Var.i = audioTrack.getPlaybackParams().getSpeed();
            l0Var.h.a(0);
            l0Var.k = 0L;
            l0Var.t = 0;
            l0Var.s = 0;
            l0Var.l = 0L;
            l0Var.y = -9223372036854775807L;
            l0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.r)) {
            return;
        }
        ((k0) this.r).d();
        this.r = pVar;
        o0 o0Var = this.s;
        if (o0Var != null) {
            k0 k0Var = (k0) pVar;
            k0Var.f();
            if (k0Var.f == null) {
                k0Var.f = new e2.r(Thread.currentThread());
            }
            k0Var.f.a(o0Var);
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
