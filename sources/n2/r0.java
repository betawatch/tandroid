package n2;

import a8.la;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import fi.y3;
import h9.t1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class r0 implements x {
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
    public e2.f S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final h6.m b;
    public Handler b0;
    public final k0 c;
    public final a1 d;
    public final f2.t e;
    public final z0 f;
    public final t1 g;
    public final ArrayDeque h;
    public int i;
    public n0 j;
    public final q0 k;
    public final q0 l;
    public m2.i m;
    public v n;
    public o0 o;
    public o0 p;
    public f2.j q;
    public o r;
    public m0 s;
    public g0 t;
    public e2.e u;
    public p0 v;
    public p0 w;
    public e2.w0 x;
    public boolean y;
    public long z;

    public r0(y3 y3Var) {
        int deviceId;
        Context context = (Context) y3Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = e2.e.i;
        this.b = (h6.m) y3Var.d;
        this.i = 0;
        this.r = (i0) y3Var.f;
        k0 k0Var = new k0();
        this.c = k0Var;
        a1 a1Var = new a1();
        a1Var.m = h2.l0.b;
        this.d = a1Var;
        this.e = new f2.t();
        this.f = new z0();
        this.g = h9.i0.v(a1Var, k0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new e2.f();
        e2.w0 w0Var = e2.w0.d;
        this.w = new p0(w0Var, 0L, 0L);
        this.x = w0Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new q0();
        this.l = new q0();
        int i7 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i7 = deviceId;
        }
        this.U = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i7, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        if (i7 == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i10 = 0;
            } else {
                byte b12 = byteBuffer.get(26);
                int i17 = 28;
                int i18 = 28;
                for (int i19 = 0; i19 < b12; i19++) {
                    i18 += byteBuffer.get(i19 + 27);
                }
                byte b13 = byteBuffer.get(i18 + 26);
                for (int i20 = 0; i20 < b13; i20++) {
                    i17 += byteBuffer.get(i18 + 27 + i20);
                }
                i10 = i18 + i17;
            }
            int i21 = byteBuffer.get(i10 + 26) + 27 + i10;
            return (int) ((i2.o.e(byteBuffer.get(i21), byteBuffer.limit() - i21 > 1 ? byteBuffer.get(i21 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i7 != 30) {
            switch (i7) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = h2.l0.a;
                    int i22 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i22 = Integer.reverseBytes(i22);
                    }
                    if ((i22 & (-2097152)) == -2097152 && (i14 = (i22 >>> 19) & 3) != 1 && (i15 = (i22 >>> 17) & 3) != 0) {
                        int i23 = (i22 >>> 12) & 15;
                        int i24 = (i22 >>> 10) & 3;
                        if (i23 != 0 && i23 != 15 && i24 != 3) {
                            i13 = 1152;
                            if (i15 != 1) {
                                if (i15 != 2) {
                                    if (i15 != 3) {
                                        throw new IllegalArgumentException();
                                    }
                                    i13 = 384;
                                }
                            } else if (i14 != 3) {
                                i13 = 576;
                            }
                            if (i13 == -1) {
                                return i13;
                            }
                            throw new IllegalArgumentException();
                        }
                    }
                    i13 = -1;
                    if (i13 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i7) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i25 = position2;
                            while (true) {
                                if (i25 <= limit) {
                                    String str2 = h2.l0.a;
                                    int i26 = byteBuffer.getInt(i25 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i26 = Integer.reverseBytes(i26);
                                    }
                                    if ((i26 & (-2)) == -126718022) {
                                        i16 = i25 - position2;
                                    } else {
                                        i25++;
                                    }
                                } else {
                                    i16 = -1;
                                }
                            }
                            if (i16 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i16) + (((byteBuffer.get((byteBuffer.position() + i16) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return f3.b.m(new d4.f(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(i5.c.i(i7, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return f3.b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
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
                i11 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b11 = byteBuffer.get(position4 + 7);
            } else if (b14 != 31) {
                i11 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b10 = byteBuffer.get(position4 + 5);
            } else {
                i11 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b11 = byteBuffer.get(position4 + 6);
            }
            i12 = b11 & 60;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b10 = byteBuffer.get(position4 + 4);
        i12 = b10 & 252;
        return (((i12 >> 2) | i11) + 1) * 32;
    }

    public final void A(e2.f fVar) {
        if (this.S.equals(fVar)) {
            return;
        }
        fVar.getClass();
        if (this.t != null) {
            this.S.getClass();
        }
        this.S = fVar;
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
        int i7;
        byte b10;
        int i10;
        int i11;
        la.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (o0.a(this.p)) {
                int a02 = (int) h2.l0.a0(h2.l0.S(20L), ((n) this.p.e).b, 1000000L, RoundingMode.UP);
                long l10 = l();
                long j3 = a02;
                if (l10 < j3) {
                    o0 o0Var = this.p;
                    int i12 = ((n) o0Var.e).a;
                    int i13 = o0Var.b;
                    int i14 = (int) l10;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i14 < a02) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i11 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 == 4) {
                                float h = h2.l0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i11 = (int) (h < 0.0f ? (-h) * (-2.1474836E9f) : h * 2.1474836E9f);
                            } else if (i12 == 21) {
                                i7 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            } else if (i12 != 22) {
                                if (i12 == 268435456) {
                                    i7 = (byteBuffer.get() & 255) << 24;
                                    i10 = (byteBuffer.get() & 255) << 16;
                                } else if (i12 == 1342177280) {
                                    i7 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i10 = (byteBuffer.get() & 255) << 8;
                                } else if (i12 == 1610612736) {
                                    i7 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i10 = byteBuffer.get() & 255;
                                } else {
                                    if (i12 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i11 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i11 = i7 | i10;
                            } else {
                                i7 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            int i15 = (int) ((i11 * i14) / j3);
                            if (i12 != 2) {
                                byteBuffer2.put((byte) (i15 >> 16));
                                byteBuffer2.put((byte) (i15 >> 24));
                            } else if (i12 == 3) {
                                byteBuffer2.put((byte) (i15 >> 24));
                            } else if (i12 != 4) {
                                if (i12 == 21) {
                                    byteBuffer2.put((byte) (i15 >> 8));
                                    byteBuffer2.put((byte) (i15 >> 16));
                                    byteBuffer2.put((byte) (i15 >> 24));
                                } else if (i12 == 22) {
                                    byteBuffer2.put((byte) i15);
                                    byteBuffer2.put((byte) (i15 >> 8));
                                    byteBuffer2.put((byte) (i15 >> 16));
                                    byteBuffer2.put((byte) (i15 >> 24));
                                } else if (i12 == 268435456) {
                                    byteBuffer2.put((byte) (i15 >> 24));
                                    byteBuffer2.put((byte) (i15 >> 16));
                                } else if (i12 == 1342177280) {
                                    byteBuffer2.put((byte) (i15 >> 24));
                                    byteBuffer2.put((byte) (i15 >> 16));
                                    byteBuffer2.put((byte) (i15 >> 8));
                                } else if (i12 == 1610612736) {
                                    byteBuffer2.put((byte) (i15 >> 24));
                                    byteBuffer2.put((byte) (i15 >> 16));
                                    byteBuffer2.put((byte) (i15 >> 8));
                                    byteBuffer2.put((byte) i15);
                                } else {
                                    if (i12 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    if (i15 < 0) {
                                        byteBuffer2.putDouble((-i15) / (-2.147483648E9d));
                                    } else {
                                        byteBuffer2.putDouble(i15 / 2.147483647E9d);
                                    }
                                }
                            } else if (i15 < 0) {
                                byteBuffer2.putFloat((-i15) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i15 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i13) {
                                i14++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i7 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i10 = (b10 & 255) << 24;
                        i11 = i7 | i10;
                        int i152 = (int) ((i11 * i14) / j3);
                        if (i12 != 2) {
                        }
                        if (byteBuffer.position() != position + i13) {
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

    public final void C(e2.w0 w0Var) {
        if (D()) {
            this.x = w0Var;
            x();
            return;
        }
        e2.w0 w0Var2 = new e2.w0(h2.l0.h(w0Var.a, 0.1f, 8.0f), h2.l0.h(w0Var.b, 0.1f, 8.0f));
        this.x = w0Var2;
        p0 p0Var = new p0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = p0Var;
        } else {
            this.w = p0Var;
        }
    }

    public final boolean D() {
        o0 o0Var = this.p;
        return o0Var != null && ((n) o0Var.e).j;
    }

    public final void a(long j3) {
        e2.w0 w0Var;
        boolean D = D();
        boolean z10 = false;
        h6.m mVar = this.b;
        if (D) {
            w0Var = e2.w0.d;
        } else {
            if (this.V || !o0.a(this.p)) {
                w0Var = e2.w0.d;
            } else {
                int i7 = ((e2.u) this.p.c).M;
                w0Var = this.x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.a;
                sVar.getClass();
                la.f(f10 > 0.0f);
                if (sVar.c != f10) {
                    sVar.c = f10;
                    sVar.i = true;
                }
                float f11 = w0Var.b;
                la.f(f11 > 0.0f);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.i = true;
                }
            }
            this.x = w0Var;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && o0.a(this.p)) {
            int i10 = ((e2.u) this.p.c).M;
            z10 = this.y;
            ((w0) mVar.c).o = z10;
        }
        this.y = z10;
        this.h.add(new p0(w0Var2, Math.max(0L, j3), h2.l0.Y(((n) this.p.e).b, l())));
        f2.j jVar = (f2.j) this.p.f;
        this.q = jVar;
        jVar.a();
        v vVar = this.n;
        if (vVar != null) {
            vVar.f(this.y);
        }
    }

    public final g0 b(n nVar) {
        try {
            return ((i0) this.r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.b, nVar.c, nVar.a, nVar.f, (e2.u) this.p.c, nVar.e, e10);
            v vVar = this.n;
            if (vVar == null) {
                throw uVar;
            }
            vVar.Y0(uVar);
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.j jVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.s == null && this.a != null) {
            m0 m0Var = new m0(this);
            this.s = m0Var;
            i0 i0Var = (i0) this.r;
            i0Var.f();
            if (i0Var.f == null) {
                i0Var.f = new h2.r(Thread.currentThread());
            }
            i0Var.f.a(m0Var);
        }
        String str = uVar.s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            la.f(h2.l0.M(i12));
            int u10 = h2.l0.u(i12) * i11;
            h9.f0 f0Var = new h9.f0(4);
            f0Var.d(this.g);
            f0Var.c(this.e);
            f2.n[] nVarArr = (f2.n[]) this.b.b;
            int length = nVarArr.length;
            h9.o.e(length, nVarArr);
            f0Var.e(length);
            System.arraycopy(nVarArr, 0, f0Var.a, f0Var.b, length);
            f0Var.b += length;
            jVar = new f2.j(f0Var.f());
            if (jVar.equals(this.q)) {
                jVar = this.q;
            }
            int i13 = uVar.N;
            int i14 = uVar.O;
            a1 a1Var = this.d;
            a1Var.i = i13;
            a1Var.j = i14;
            this.c.i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var2 = jVar.a;
                if (kVar.equals(f2.k.e)) {
                    throw new f2.m(kVar);
                }
                for (int i15 = 0; i15 < i0Var2.size(); i15++) {
                    f2.n nVar = (f2.n) i0Var2.get(i15);
                    f2.k e10 = nVar.e(kVar);
                    if (nVar.isActive()) {
                        la.p(!e10.equals(f2.k.e));
                        kVar = e10;
                    }
                }
                int i16 = kVar.b;
                int i17 = kVar.c;
                e2.t a10 = uVar.a();
                a10.L = i17;
                a10.K = kVar.a;
                a10.J = i16;
                uVar2 = new e2.u(a10);
                i7 = u10;
                i10 = h2.l0.u(i17) * i16;
            } catch (f2.m e11) {
                throw new t(e11, uVar);
            }
        } else {
            jVar = new f2.j(t1.e);
            uVar2 = uVar;
            i7 = -1;
            i10 = -1;
        }
        f2.j jVar2 = jVar;
        i i18 = i(uVar2);
        e2.u uVar3 = i18.a;
        try {
            n c10 = ((i0) this.r).c(i18);
            boolean z10 = c10.e;
            if (c10.a == 0) {
                throw new t("Invalid output encoding (isOffload=" + z10 + ")", uVar3);
            }
            if (c10.c == 0) {
                throw new t("Invalid output channel config (isOffload=" + z10 + ")", uVar3);
            }
            this.X = false;
            o0 o0Var = new o0(uVar, uVar2, i7, i10, c10, jVar2);
            if (p()) {
                this.o = o0Var;
            } else {
                this.p = o0Var;
            }
        } catch (h e12) {
            throw new t(e12, uVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j3) {
        v vVar;
        v vVar2;
        if (this.K == null) {
            return;
        }
        q0 q0Var = this.l;
        if (((Exception) q0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < q0Var.b)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g10 = this.t.g(j3, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            q0Var.c = null;
            q0Var.a = -9223372036854775807L;
            q0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (vVar2 = this.n) != null && !g10 && !this.Y) {
                    vVar2.a0();
                }
            }
            if (o0.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g10) {
                if (!o0.a(this.p)) {
                    la.p(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (g e10) {
            boolean z10 = e10.b;
            if (z10) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((n) this.p.e).e) {
                            this.X = true;
                        }
                    }
                }
                w wVar = new w(e10.a, (e2.u) this.p.c, r4);
                vVar = this.n;
                if (vVar != null) {
                    vVar.Y0(wVar);
                }
                if (!z10) {
                    throw wVar;
                }
                q0Var.a(wVar);
                return;
            }
            r4 = false;
            w wVar2 = new w(e10.a, (e2.u) this.p.c, r4);
            vVar = this.n;
            if (vVar != null) {
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
        f2.j jVar = this.q;
        if (jVar.d() && !jVar.d) {
            jVar.d = true;
            ((f2.n) jVar.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.c() || ((byteBuffer = this.K) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        c0 c0Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new p0(this.x, 0L, 0L);
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
            f2.j jVar = (f2.j) this.p.f;
            this.q = jVar;
            jVar.a();
            this.j = null;
            o0 o0Var = this.o;
            if (o0Var != null) {
                this.p = o0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            g0 g0Var = this.t;
            if (g0Var.f.d.getPlayState() == 3) {
                g0Var.a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && g0Var.c()) {
                f0 f0Var = g0Var.i;
                f0Var.getClass();
                f0.a(f0Var);
            }
            if (i7 >= 24 && (c0Var = g0Var.e) != null) {
                c0.b(c0Var);
                g0Var.e = null;
            }
            AudioTrack audioTrack = g0Var.a;
            h2.r rVar = g0Var.j;
            Handler q10 = h2.l0.q(null);
            synchronized (g0.t) {
                try {
                    if (g0.u == null) {
                        g0.u = Executors.newSingleThreadScheduledExecutor(new ai.z0(1));
                    }
                    g0.v++;
                    g0.u.schedule(new kg.y(audioTrack, q10, rVar, 14), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        q0 q0Var = this.l;
        q0Var.c = null;
        q0Var.a = -9223372036854775807L;
        q0Var.b = -9223372036854775807L;
        q0 q0Var2 = this.k;
        q0Var2.c = null;
        q0Var2.a = -9223372036854775807L;
        q0Var2.b = -9223372036854775807L;
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
        if (o0.a(this.p)) {
            return h2.l0.Y(((n) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.p.e).a);
        la.p(j3 != -2147483647);
        return h2.l0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), h2.l0.Y(((n) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((p0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (p0) arrayDeque.remove();
        }
        p0 p0Var = this.w;
        long j10 = min - p0Var.c;
        long B = h2.l0.B(j10, p0Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        h6.m mVar = this.b;
        if (isEmpty) {
            f2.s sVar = (f2.s) mVar.d;
            if (sVar.isActive()) {
                if (sVar.n >= 1024) {
                    long j11 = sVar.m;
                    sVar.j.getClass();
                    long o4 = j11 - (r8.i.o() * (r8.j * r8.b));
                    int i7 = sVar.h.a;
                    int i10 = sVar.g.a;
                    j10 = i7 == i10 ? h2.l0.a0(j10, o4, sVar.n, RoundingMode.DOWN) : h2.l0.a0(j10, o4 * i7, sVar.n * i10, RoundingMode.DOWN);
                } else {
                    j10 = (long) (sVar.c * j10);
                }
            }
            p0 p0Var2 = this.w;
            j3 = p0Var2.b + j10;
            p0Var2.d = j10 - B;
        } else {
            p0 p0Var3 = this.w;
            j3 = p0Var3.b + B + p0Var3.d;
        }
        long j12 = ((w0) mVar.c).q;
        long Y = h2.l0.Y(((n) this.p.e).b, j12) + j3;
        long j13 = this.Z;
        if (j12 > j13) {
            long Y2 = h2.l0.Y(((n) this.p.e).b, j12 - j13);
            this.Z = j12;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new kg.i0(this, 23), 100L);
        }
        return Y;
    }

    public final i i(e2.u uVar) {
        i iVar = new i(uVar);
        iVar.b = this.u;
        iVar.d = this.i != 0;
        iVar.c = this.T;
        iVar.e = this.Q;
        iVar.g = this.V;
        iVar.h = -1;
        iVar.f = this.U;
        return new i(iVar);
    }

    public final int j(e2.u uVar) {
        boolean z10;
        if (!h2.l0.M(uVar.M) || uVar.M == 2) {
            z10 = false;
        } else {
            e2.t a10 = uVar.a();
            a10.L = 2;
            uVar = new e2.u(a10);
            z10 = true;
        }
        int i7 = ((i0) this.r).b(i(uVar)).d;
        if (i7 != 1) {
            if (i7 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!o0.a(this.p)) {
            return this.C;
        }
        long j3 = this.B;
        long j10 = this.p.b;
        return ((j3 + j10) - 1) / j10;
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
    public final boolean m(long j3, int i7, ByteBuffer byteBuffer) {
        long j10;
        long j11;
        long j12;
        ByteBuffer byteBuffer2 = this.I;
        la.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    n nVar = (n) this.p.e;
                    i((e2.u) this.o.d);
                    if (!((n) this.o.e).equals(nVar)) {
                        s();
                        if (!n()) {
                            f();
                            a(j3);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                g0 g0Var = this.t;
                if (g0Var != null && g0Var.c() && ((n) this.p.e).k) {
                    this.t.e();
                    g0 g0Var2 = this.t;
                    e2.u uVar = (e2.u) this.p.c;
                    g0Var2.d(uVar.N, uVar.O);
                    this.Y = true;
                }
                a(j3);
            }
            return false;
        }
        boolean p10 = p();
        q0 q0Var = this.k;
        if (!p10) {
            try {
            } catch (u e10) {
                if (e10.a) {
                    throw e10;
                }
                q0Var.a(e10);
                return false;
            }
        }
        q0Var.c = null;
        q0Var.a = -9223372036854775807L;
        q0Var.b = -9223372036854775807L;
        if (this.F) {
            this.G = Math.max(0L, j3);
            this.E = false;
            this.F = false;
            if (D()) {
                x();
            }
            a(j3);
            if (this.O) {
                r();
            }
        }
        if (this.I == null) {
            la.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!o0.a(this.p) && this.D == 0) {
                    int k10 = k(((n) this.p.e).a, byteBuffer);
                    this.D = k10;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j3);
                        this.v = null;
                    }
                    return false;
                }
                long j13 = this.G;
                o0 o0Var = this.p;
                if (o0.a(o0Var)) {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.z / this.p.a;
                } else {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.A;
                }
                long Y = h2.l0.Y(((e2.u) o0Var.c).L, j12 - this.d.o) + j13;
                if (!this.E && Math.abs(Y - j3) > 200000) {
                    v vVar = this.n;
                    if (vVar != null) {
                        StringBuilder t6 = a8.p0.t(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        t6.append(j3);
                        vVar.Y0(new ab.b0(t6.toString()));
                    }
                    this.E = true;
                }
                if (this.E) {
                    if (e()) {
                        long j14 = j3 - Y;
                        this.G += j14;
                        this.E = false;
                        a(j3);
                        v vVar2 = this.n;
                        if (vVar2 != null && j14 != j11) {
                            vVar2.o1();
                        }
                    }
                    return false;
                }
                if (o0.a(this.p)) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i7) + this.A;
                }
                this.I = byteBuffer;
                this.J = i7;
            }
            return true;
        }
        j10 = -9223372036854775807L;
        j11 = 0;
        u(j3);
        if (!this.I.hasRemaining()) {
            this.I = null;
            this.J = 0;
            return true;
        }
        g0 g0Var3 = this.t;
        j0 j0Var = g0Var3.f;
        long b10 = g0Var3.b();
        if (j0Var.v != j10 && b10 > j11) {
            j0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - j0Var.v >= 200) {
                h2.a.l("DefaultAudioSink", "Resetting stalled audio output");
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
        long l10 = l();
        long a10 = this.t.a();
        g0 g0Var = this.t;
        g0Var.getClass();
        return l10 > h2.l0.a0(a10, (long) g0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        g0 b10;
        q0 q0Var = this.k;
        if (((Exception) q0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < q0Var.b)) {
            return false;
        }
        try {
            b10 = b((n) this.p.e);
        } catch (u e10) {
            int i7 = ((n) this.p.e).f;
            while (i7 > 1000000) {
                int i10 = i7 / 2;
                o0 o0Var = this.p;
                int i11 = o0Var.b;
                if (i11 == -1) {
                    i11 = 1;
                }
                int i12 = i10 % i11;
                int i13 = i12 != 0 ? (i11 - i12) + i10 : i10;
                m a10 = ((n) o0Var.e).a();
                a10.f = i13;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    o0 o0Var2 = this.p;
                    this.p = new o0((e2.u) o0Var2.c, (e2.u) o0Var2.d, o0Var2.a, o0Var2.b, nVar, (f2.j) o0Var2.f);
                } catch (u e11) {
                    e10.addSuppressed(e11);
                    i7 = i13;
                }
            }
            if (!((n) this.p.e).e) {
                throw e10;
            }
            this.X = true;
            throw e10;
        }
        this.t = b10;
        n0 n0Var = new n0(this, (n) this.p.e);
        this.j = n0Var;
        b10.j.a(n0Var);
        if (this.t.c()) {
            o0 o0Var3 = this.p;
            if (((n) o0Var3.e).k) {
                g0 g0Var = this.t;
                e2.u uVar = (e2.u) o0Var3.c;
                g0Var.d(uVar.N, uVar.O);
            }
        }
        m2.i iVar = this.m;
        if (iVar != null) {
            this.t.f(iVar);
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
        v vVar = this.n;
        if (vVar != null) {
            int i14 = ((n) this.p.e).a;
            vVar.b0(new s0());
            if (z10) {
                this.R = true;
                o0 o0Var4 = this.p;
                m a11 = ((n) o0Var4.e).a();
                a11.h = this.Q;
                this.p = new o0((e2.u) o0Var4.c, (e2.u) o0Var4.d, o0Var4.a, o0Var4.b, new n(a11), (f2.j) o0Var4.f);
                o0 o0Var5 = this.o;
                if (o0Var5 != null) {
                    m a12 = ((n) o0Var5.e).a();
                    a12.h = this.Q;
                    this.o = new o0((e2.u) o0Var5.c, (e2.u) o0Var5.d, o0Var5.a, o0Var5.b, new n(a12), (f2.j) o0Var5.f);
                }
                this.n.d(this.Q);
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
            g0 g0Var = this.t;
            j0 j0Var = g0Var.f;
            j0Var.k = 0L;
            j0Var.t = 0;
            j0Var.s = 0;
            j0Var.l = 0L;
            j0Var.y = -9223372036854775807L;
            j0Var.z = -9223372036854775807L;
            if (j0Var.u == -9223372036854775807L) {
                j0Var.h.a(0);
            }
            j0Var.w = j0Var.a();
            if (!g0Var.k || g0Var.c()) {
                g0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            g0 g0Var = this.t;
            j0 j0Var = g0Var.f;
            if (j0Var.u != -9223372036854775807L) {
                j0Var.b.getClass();
                j0Var.u = h2.l0.S(SystemClock.elapsedRealtime());
            }
            j0Var.j = h2.l0.Y(j0Var.e, j0Var.a());
            j0Var.h.a(0);
            if (!g0Var.k || g0Var.c()) {
                g0Var.a.play();
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
        g0 g0Var = this.t;
        if (g0Var.k) {
            return;
        }
        g0Var.k = true;
        j0 j0Var = g0Var.f;
        long b10 = g0Var.b();
        j0Var.w = j0Var.a();
        j0Var.b.getClass();
        j0Var.u = h2.l0.S(SystemClock.elapsedRealtime());
        j0Var.x = b10;
        g0Var.a.stop();
        g0Var.p = 0;
    }

    public final void t() {
        if (!this.L && p() && e()) {
            s();
            this.L = true;
        }
    }

    public final void u(long j3) {
        ByteBuffer byteBuffer;
        d(j3);
        if (this.K != null) {
            return;
        }
        if (!this.q.d()) {
            ByteBuffer byteBuffer2 = this.I;
            if (byteBuffer2 != null) {
                B(byteBuffer2);
                d(j3);
                return;
            }
            return;
        }
        while (!this.q.c()) {
            do {
                f2.j jVar = this.q;
                if (jVar.d()) {
                    ByteBuffer byteBuffer3 = jVar.c[jVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        jVar.e(f2.n.a);
                        byteBuffer = jVar.c[jVar.b()];
                    }
                } else {
                    byteBuffer = f2.n.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer);
                    d(j3);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    f2.j jVar2 = this.q;
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
            o0 o0Var = this.o;
            if (o0Var != null) {
                this.p = o0Var;
                this.o = null;
            }
            try {
                n c10 = ((i0) this.r).c(i((e2.u) this.p.d));
                o0 o0Var2 = this.p;
                this.p = new o0((e2.u) o0Var2.c, (e2.u) o0Var2.d, o0Var2.a, o0Var2.b, c10, (f2.j) o0Var2.f);
            } catch (h e10) {
                throw new IllegalStateException(new t(e10, (e2.u) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        h9.g0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((f2.n) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        f2.j jVar = this.q;
        if (jVar != null) {
            h9.i0 i0Var = jVar.a;
            for (int i7 = 0; i7 < i0Var.size(); i7++) {
                f2.n nVar = (f2.n) i0Var.get(i7);
                nVar.d(f2.l.b);
                nVar.reset();
            }
            jVar.b.clear();
            jVar.c = new ByteBuffer[0];
            f2.k kVar = f2.k.e;
            jVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            g0 g0Var = this.t;
            e2.w0 w0Var = this.x;
            AudioTrack audioTrack = g0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.l0.h(w0Var.a, 0.1f, g0Var.c)).setPitch(h2.l0.h(w0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            j0 j0Var = g0Var.f;
            j0Var.i = audioTrack.getPlaybackParams().getSpeed();
            j0Var.h.a(0);
            j0Var.k = 0L;
            j0Var.t = 0;
            j0Var.s = 0;
            j0Var.l = 0L;
            j0Var.y = -9223372036854775807L;
            j0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.r)) {
            return;
        }
        ((i0) this.r).d();
        this.r = oVar;
        m0 m0Var = this.s;
        if (m0Var != null) {
            i0 i0Var = (i0) oVar;
            i0Var.f();
            if (i0Var.f == null) {
                i0Var.f = new h2.r(Thread.currentThread());
            }
            i0Var.f.a(m0Var);
        }
        v();
    }

    public final void z(int i7) {
        if (this.R) {
            if (this.Q != i7) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i7) {
            this.Q = i7;
            this.P = i7 != 0;
            v();
        }
    }
}
