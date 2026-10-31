package k2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import e9.x1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w0 implements b0 {
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
    public final android.support.v4.media.session.a0 b;
    public Handler b0;
    public final p0 c;
    public final f1 d;
    public final c2.t e;
    public final e1 f;
    public final x1 g;
    public final ArrayDeque h;
    public int i;
    public s0 j;
    public final v0 k;
    public final v0 l;
    public j2.l m;
    public z n;
    public ji.a o;
    public ji.a p;
    public c2.i q;
    public p r;
    public r0 s;
    public j0 t;
    public b2.f u;
    public u0 v;
    public u0 w;
    public b2.z0 x;
    public boolean y;
    public long z;

    public w0(t0 t0Var) {
        int deviceId;
        Context context = (Context) t0Var.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = b2.f.i;
        this.b = (android.support.v4.media.session.a0) t0Var.d;
        this.i = 0;
        this.r = (n0) t0Var.f;
        p0 p0Var = new p0();
        this.c = p0Var;
        f1 f1Var = new f1();
        f1Var.m = e2.l0.b;
        this.d = f1Var;
        this.e = new c2.t();
        this.f = new e1();
        this.g = e9.n0.z(f1Var, p0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new b2.g();
        b2.z0 z0Var = b2.z0.d;
        this.w = new u0(z0Var, 0L, 0L);
        this.x = z0Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new v0();
        this.l = new v0();
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
                    String str = e2.l0.a;
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
                                    String str2 = e2.l0.a;
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
                            throw new IllegalStateException(i0.a.i(i10, "Unexpected audio encoding: "));
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
            return TLObject.FLAG_12;
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
        t6.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (ji.a.a(this.p)) {
                int a02 = (int) e2.l0.a0(e2.l0.S(20L), ((o) this.p.e).b, 1000000L, RoundingMode.UP);
                long l4 = l();
                long j10 = a02;
                if (l4 < j10) {
                    ji.a aVar = this.p;
                    int i13 = ((o) aVar.e).a;
                    int i14 = aVar.b;
                    int i15 = (int) l4;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i15 < a02) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i13 == 4) {
                                float h = e2.l0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
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
        b2.z0 z0Var2 = new b2.z0(e2.l0.h(z0Var.a, 0.1f, 8.0f), e2.l0.h(z0Var.b, 0.1f, 8.0f));
        this.x = z0Var2;
        u0 u0Var = new u0(z0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = u0Var;
        } else {
            this.w = u0Var;
        }
    }

    public final boolean D() {
        ji.a aVar = this.p;
        return aVar != null && ((o) aVar.e).j;
    }

    public final void a(long j10) {
        b2.z0 z0Var;
        boolean D = D();
        boolean z10 = false;
        android.support.v4.media.session.a0 a0Var = this.b;
        if (D) {
            z0Var = b2.z0.d;
        } else {
            if (this.V || !ji.a.a(this.p)) {
                z0Var = b2.z0.d;
            } else {
                int i10 = ((b2.x) this.p.c).M;
                z0Var = this.x;
                c2.s sVar = (c2.s) a0Var.d;
                float f7 = z0Var.a;
                sVar.getClass();
                t6.f(f7 > 0.0f);
                if (sVar.c != f7) {
                    sVar.c = f7;
                    sVar.i = true;
                }
                float f10 = z0Var.b;
                t6.f(f10 > 0.0f);
                if (sVar.d != f10) {
                    sVar.d = f10;
                    sVar.i = true;
                }
            }
            this.x = z0Var;
        }
        b2.z0 z0Var2 = z0Var;
        if (!this.V && ji.a.a(this.p)) {
            int i11 = ((b2.x) this.p.c).M;
            z10 = this.y;
            ((b1) a0Var.c).o = z10;
        }
        this.y = z10;
        this.h.add(new u0(z0Var2, Math.max(0L, j10), e2.l0.Y(((o) this.p.e).b, l())));
        c2.i iVar = (c2.i) this.p.f;
        this.q = iVar;
        iVar.a();
        z zVar = this.n;
        if (zVar != null) {
            zVar.e(this.y);
        }
    }

    public final j0 b(o oVar) {
        try {
            return ((n0) this.r).a(oVar);
        } catch (m e) {
            y yVar = new y(oVar.b, oVar.c, oVar.a, oVar.f, (b2.x) this.p.c, oVar.e, e);
            z zVar = this.n;
            if (zVar == null) {
                throw yVar;
            }
            zVar.P(yVar);
            throw yVar;
        }
    }

    public final void c(b2.x xVar, int[] iArr) {
        c2.i iVar;
        b2.x xVar2;
        int i10;
        int i11;
        if (this.s == null && this.a != null) {
            r0 r0Var = new r0(this);
            this.s = r0Var;
            n0 n0Var = (n0) this.r;
            n0Var.f();
            if (n0Var.f == null) {
                n0Var.f = new e2.r(Thread.currentThread());
            }
            n0Var.f.a(r0Var);
        }
        String str = xVar.s;
        int i12 = xVar.K;
        int i13 = xVar.M;
        if ("audio/raw".equals(str)) {
            t6.f(e2.l0.M(i13));
            int u10 = e2.l0.u(i13) * i12;
            e9.k0 k0Var = new e9.k0(4);
            k0Var.d(this.g);
            k0Var.c(this.e);
            c2.m[] mVarArr = (c2.m[]) this.b.b;
            int length = mVarArr.length;
            e9.s.d(length, mVarArr);
            k0Var.e(length);
            System.arraycopy(mVarArr, 0, k0Var.a, k0Var.b, length);
            k0Var.b += length;
            iVar = new c2.i(k0Var.f());
            if (iVar.equals(this.q)) {
                iVar = this.q;
            }
            int i14 = xVar.N;
            int i15 = xVar.O;
            f1 f1Var = this.d;
            f1Var.i = i14;
            f1Var.j = i15;
            this.c.i = iArr;
            c2.j jVar = new c2.j(xVar.L, i12, i13);
            try {
                e9.n0 n0Var2 = iVar.a;
                if (jVar.equals(c2.j.e)) {
                    throw new c2.l(jVar);
                }
                for (int i16 = 0; i16 < n0Var2.size(); i16++) {
                    c2.m mVar = (c2.m) n0Var2.get(i16);
                    c2.j e = mVar.e(jVar);
                    if (mVar.isActive()) {
                        t6.p(!e.equals(c2.j.e));
                        jVar = e;
                    }
                }
                int i17 = jVar.b;
                int i18 = jVar.c;
                b2.w a2 = xVar.a();
                a2.L = i18;
                a2.K = jVar.a;
                a2.J = i17;
                xVar2 = new b2.x(a2);
                i10 = u10;
                i11 = e2.l0.u(i18) * i17;
            } catch (c2.l e7) {
                throw new x(e7, xVar);
            }
        } else {
            iVar = new c2.i(x1.e);
            xVar2 = xVar;
            i10 = -1;
            i11 = -1;
        }
        c2.i iVar2 = iVar;
        j i19 = i(xVar2);
        b2.x xVar3 = i19.a;
        try {
            o c10 = ((n0) this.r).c(i19);
            boolean z10 = c10.e;
            if (c10.a == 0) {
                throw new x("Invalid output encoding (isOffload=" + z10 + ")", xVar3);
            }
            if (c10.c == 0) {
                throw new x("Invalid output channel config (isOffload=" + z10 + ")", xVar3);
            }
            this.X = false;
            ji.a aVar = new ji.a(xVar, xVar2, i10, i11, c10, iVar2);
            if (p()) {
                this.o = aVar;
            } else {
                this.p = aVar;
            }
        } catch (i e10) {
            throw new x(e10, xVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10) {
        z zVar;
        z zVar2;
        if (this.K == null) {
            return;
        }
        v0 v0Var = this.l;
        if (((Exception) v0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < v0Var.b)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g10 = this.t.g(j10, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            v0Var.c = null;
            v0Var.a = -9223372036854775807L;
            v0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (zVar2 = this.n) != null && !g10 && !this.Y) {
                    zVar2.o();
                }
            }
            if (ji.a.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g10) {
                if (!ji.a.a(this.p)) {
                    t6.p(this.K == this.I);
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
                a0 a0Var = new a0(e.a, (b2.x) this.p.c, r4);
                zVar = this.n;
                if (zVar != null) {
                    zVar.P(a0Var);
                }
                if (!z10) {
                    throw a0Var;
                }
                v0Var.a(a0Var);
                return;
            }
            r4 = false;
            a0 a0Var2 = new a0(e.a, (b2.x) this.p.c, r4);
            zVar = this.n;
            if (zVar != null) {
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
        c2.i iVar = this.q;
        if (iVar.d() && !iVar.d) {
            iVar.d = true;
            ((c2.m) iVar.b.get(0)).f();
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
            this.w = new u0(this.x, 0L, 0L);
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
            c2.i iVar = (c2.i) this.p.f;
            this.q = iVar;
            iVar.a();
            this.j = null;
            ji.a aVar = this.o;
            if (aVar != null) {
                this.p = aVar;
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
            Handler q6 = e2.l0.q(null);
            synchronized (j0.t) {
                try {
                    if (j0.u == null) {
                        j0.u = Executors.newSingleThreadScheduledExecutor(new di.n(1));
                    }
                    j0.v++;
                    j0.u.schedule(new a3.l0(audioTrack, q6, rVar, 27), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        v0 v0Var = this.l;
        v0Var.c = null;
        v0Var.a = -9223372036854775807L;
        v0Var.b = -9223372036854775807L;
        v0 v0Var2 = this.k;
        v0Var2.c = null;
        v0Var2.a = -9223372036854775807L;
        v0Var2.b = -9223372036854775807L;
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
        if (ji.a.a(this.p)) {
            return e2.l0.Y(((o) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j10 = c3.b.j(((o) this.p.e).a);
        t6.p(j10 != -2147483647);
        return e2.l0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), e2.l0.Y(((o) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((u0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (u0) arrayDeque.remove();
        }
        u0 u0Var = this.w;
        long j11 = min - u0Var.c;
        long B = e2.l0.B(j11, u0Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        android.support.v4.media.session.a0 a0Var = this.b;
        if (isEmpty) {
            c2.s sVar = (c2.s) a0Var.d;
            if (sVar.isActive()) {
                if (sVar.n >= 1024) {
                    long j12 = sVar.m;
                    sVar.j.getClass();
                    long o10 = j12 - (r8.i.o() * (r8.j * r8.b));
                    int i10 = sVar.h.a;
                    int i11 = sVar.g.a;
                    j11 = i10 == i11 ? e2.l0.a0(j11, o10, sVar.n, RoundingMode.DOWN) : e2.l0.a0(j11, o10 * i10, sVar.n * i11, RoundingMode.DOWN);
                } else {
                    j11 = (long) (sVar.c * j11);
                }
            }
            u0 u0Var2 = this.w;
            j10 = u0Var2.b + j11;
            u0Var2.d = j11 - B;
        } else {
            u0 u0Var3 = this.w;
            j10 = u0Var3.b + B + u0Var3.d;
        }
        long j13 = ((b1) a0Var.c).q;
        long Y = e2.l0.Y(((o) this.p.e).b, j13) + j10;
        long j14 = this.Z;
        if (j13 > j14) {
            long Y2 = e2.l0.Y(((o) this.p.e).b, j13 - j14);
            this.Z = j13;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new gg.c(this, 21), 100L);
        }
        return Y;
    }

    public final j i(b2.x xVar) {
        j jVar = new j(xVar);
        jVar.b = this.u;
        jVar.d = this.i != 0;
        jVar.c = this.T;
        jVar.e = this.Q;
        jVar.g = this.V;
        jVar.h = -1;
        jVar.f = this.U;
        return new j(jVar);
    }

    public final int j(b2.x xVar) {
        boolean z10;
        if (!e2.l0.M(xVar.M) || xVar.M == 2) {
            z10 = false;
        } else {
            b2.w a2 = xVar.a();
            a2.L = 2;
            xVar = new b2.x(a2);
            z10 = true;
        }
        int i10 = ((n0) this.r).b(i(xVar)).d;
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
        if (!ji.a.a(this.p)) {
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
        t6.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    o oVar = (o) this.p.e;
                    i((b2.x) this.o.d);
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
                j0 j0Var = this.t;
                if (j0Var != null && j0Var.c() && ((o) this.p.e).k) {
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
        boolean p5 = p();
        v0 v0Var = this.k;
        if (!p5) {
            try {
            } catch (y e) {
                if (e.a) {
                    throw e;
                }
                v0Var.a(e);
                return false;
            }
        }
        v0Var.c = null;
        v0Var.a = -9223372036854775807L;
        v0Var.b = -9223372036854775807L;
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
            t6.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!ji.a.a(this.p) && this.D == 0) {
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
                ji.a aVar = this.p;
                if (ji.a.a(aVar)) {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.z / this.p.a;
                } else {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.A;
                }
                long Y = e2.l0.Y(((b2.x) aVar.c).L, j13 - this.d.o) + j14;
                if (!this.E && Math.abs(Y - j10) > 200000) {
                    z zVar = this.n;
                    if (zVar != null) {
                        StringBuilder s10 = a1.g.s(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        s10.append(j10);
                        zVar.P(new j6.l(s10.toString()));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (e()) {
                        long j15 = j10 - Y;
                        this.G += j15;
                        this.E = false;
                        a(j10);
                        z zVar2 = this.n;
                        if (zVar2 != null && j15 != j12) {
                            zVar2.S();
                        }
                    }
                    return false;
                }
                if (ji.a.a(this.p)) {
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
        o0 o0Var = j0Var3.f;
        long b10 = j0Var3.b();
        if (o0Var.v != j11 && b10 > j12) {
            o0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - o0Var.v >= 200) {
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
        return l4 > e2.l0.a0(a2, (long) j0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        j0 b10;
        v0 v0Var = this.k;
        if (((Exception) v0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < v0Var.b)) {
            return false;
        }
        try {
            b10 = b((o) this.p.e);
        } catch (y e) {
            int i10 = ((o) this.p.e).f;
            while (i10 > 1000000) {
                int i11 = i10 / 2;
                ji.a aVar = this.p;
                int i12 = aVar.b;
                if (i12 == -1) {
                    i12 = 1;
                }
                int i13 = i11 % i12;
                int i14 = i13 != 0 ? (i12 - i13) + i11 : i11;
                n a2 = ((o) aVar.e).a();
                a2.f = i14;
                o oVar = new o(a2);
                try {
                    b10 = b(oVar);
                    ji.a aVar2 = this.p;
                    this.p = new ji.a((b2.x) aVar2.c, (b2.x) aVar2.d, aVar2.a, aVar2.b, oVar, (c2.i) aVar2.f);
                } catch (y e7) {
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
        s0 s0Var = new s0(this, (o) this.p.e);
        this.j = s0Var;
        b10.j.a(s0Var);
        if (this.t.c()) {
            ji.a aVar3 = this.p;
            if (((o) aVar3.e).k) {
                j0 j0Var = this.t;
                b2.x xVar = (b2.x) aVar3.c;
                j0Var.d(xVar.N, xVar.O);
            }
        }
        j2.l lVar = this.m;
        if (lVar != null) {
            this.t.f(lVar);
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
        z zVar = this.n;
        if (zVar != null) {
            int i15 = ((o) this.p.e).a;
            zVar.a0(new x0());
            if (z10) {
                this.R = true;
                ji.a aVar4 = this.p;
                n a10 = ((o) aVar4.e).a();
                a10.h = this.Q;
                this.p = new ji.a((b2.x) aVar4.c, (b2.x) aVar4.d, aVar4.a, aVar4.b, new o(a10), (c2.i) aVar4.f);
                ji.a aVar5 = this.o;
                if (aVar5 != null) {
                    n a11 = ((o) aVar5.e).a();
                    a11.h = this.Q;
                    this.o = new ji.a((b2.x) aVar5.c, (b2.x) aVar5.d, aVar5.a, aVar5.b, new o(a11), (c2.i) aVar5.f);
                }
                this.n.a(this.Q);
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
            o0 o0Var = j0Var.f;
            o0Var.k = 0L;
            o0Var.t = 0;
            o0Var.s = 0;
            o0Var.l = 0L;
            o0Var.y = -9223372036854775807L;
            o0Var.z = -9223372036854775807L;
            if (o0Var.u == -9223372036854775807L) {
                o0Var.h.a(0);
            }
            o0Var.w = o0Var.a();
            if (!j0Var.k || j0Var.c()) {
                j0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            j0 j0Var = this.t;
            o0 o0Var = j0Var.f;
            if (o0Var.u != -9223372036854775807L) {
                o0Var.b.getClass();
                o0Var.u = e2.l0.S(SystemClock.elapsedRealtime());
            }
            o0Var.j = e2.l0.Y(o0Var.e, o0Var.a());
            o0Var.h.a(0);
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
        o0 o0Var = j0Var.f;
        long b10 = j0Var.b();
        o0Var.w = o0Var.a();
        o0Var.b.getClass();
        o0Var.u = e2.l0.S(SystemClock.elapsedRealtime());
        o0Var.x = b10;
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
                c2.i iVar = this.q;
                if (iVar.d()) {
                    ByteBuffer byteBuffer3 = iVar.c[iVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        iVar.e(c2.m.a);
                        byteBuffer = iVar.c[iVar.b()];
                    }
                } else {
                    byteBuffer = c2.m.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    c2.i iVar2 = this.q;
                    ByteBuffer byteBuffer5 = this.I;
                    if (iVar2.d() && !iVar2.d) {
                        iVar2.e(byteBuffer5);
                    }
                }
            } while (this.K == null);
            return;
        }
    }

    public final void v() {
        if (this.p != null) {
            ji.a aVar = this.o;
            if (aVar != null) {
                this.p = aVar;
                this.o = null;
            }
            try {
                o c10 = ((n0) this.r).c(i((b2.x) this.p.d));
                ji.a aVar2 = this.p;
                this.p = new ji.a((b2.x) aVar2.c, (b2.x) aVar2.d, aVar2.a, aVar2.b, c10, (c2.i) aVar2.f);
            } catch (i e) {
                throw new IllegalStateException(new x(e, (b2.x) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        e9.l0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((c2.m) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        c2.i iVar = this.q;
        if (iVar != null) {
            e9.n0 n0Var = iVar.a;
            for (int i10 = 0; i10 < n0Var.size(); i10++) {
                c2.m mVar = (c2.m) n0Var.get(i10);
                mVar.d(c2.k.b);
                mVar.reset();
            }
            iVar.b.clear();
            iVar.c = new ByteBuffer[0];
            c2.j jVar = c2.j.e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            j0 j0Var = this.t;
            b2.z0 z0Var = this.x;
            AudioTrack audioTrack = j0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(e2.l0.h(z0Var.a, 0.1f, j0Var.c)).setPitch(e2.l0.h(z0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                e2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            o0 o0Var = j0Var.f;
            o0Var.i = audioTrack.getPlaybackParams().getSpeed();
            o0Var.h.a(0);
            o0Var.k = 0L;
            o0Var.t = 0;
            o0Var.s = 0;
            o0Var.l = 0L;
            o0Var.y = -9223372036854775807L;
            o0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new b2.z0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(p pVar) {
        if (pVar.equals(this.r)) {
            return;
        }
        ((n0) this.r).d();
        this.r = pVar;
        r0 r0Var = this.s;
        if (r0Var != null) {
            n0 n0Var = (n0) pVar;
            n0Var.f();
            if (n0Var.f == null) {
                n0Var.f = new e2.r(Thread.currentThread());
            }
            n0Var.f.a(r0Var);
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
