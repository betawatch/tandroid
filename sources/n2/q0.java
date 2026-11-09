package n2;

import a8.ia;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import di.i4;
import h9.t1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class q0 implements x {
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
    public final j0 c;
    public final z0 d;
    public final f2.t e;
    public final y0 f;
    public final t1 g;
    public final ArrayDeque h;
    public int i;
    public m0 j;
    public final p0 k;
    public final p0 l;
    public m2.j m;
    public v n;
    public n0 o;
    public n0 p;
    public f2.j q;
    public o r;
    public l0 s;
    public f0 t;
    public e2.e u;
    public o0 v;
    public o0 w;
    public e2.w0 x;
    public boolean y;
    public long z;

    public q0(i4 i4Var) {
        int deviceId;
        Context context = (Context) i4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = e2.e.i;
        this.b = (h6.m) i4Var.d;
        this.i = 0;
        this.r = (h0) i4Var.f;
        j0 j0Var = new j0();
        this.c = j0Var;
        z0 z0Var = new z0();
        z0Var.m = h2.m0.b;
        this.d = z0Var;
        this.e = new f2.t();
        this.f = new y0();
        this.g = h9.i0.v(z0Var, j0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new e2.f();
        e2.w0 w0Var = e2.w0.d;
        this.w = new o0(w0Var, 0L, 0L);
        this.x = w0Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new p0();
        this.l = new p0();
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
                    String str = h2.m0.a;
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
                                    String str2 = h2.m0.a;
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
                            throw new IllegalStateException(jg.g.j(i7, "Unexpected audio encoding: "));
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
        ia.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (n0.a(this.p)) {
                int a02 = (int) h2.m0.a0(h2.m0.S(20L), ((n) this.p.e).b, 1000000L, RoundingMode.UP);
                long l10 = l();
                long j3 = a02;
                if (l10 < j3) {
                    n0 n0Var = this.p;
                    int i12 = ((n) n0Var.e).a;
                    int i13 = n0Var.b;
                    int i14 = (int) l10;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i14 < a02) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i11 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 == 4) {
                                float h = h2.m0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i11 = (int) (h < 0.0f ? (-h) * (-2.14748365E9f) : h * 2.14748365E9f);
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
                                byteBuffer2.putFloat((-i15) / (-2.14748365E9f));
                            } else {
                                byteBuffer2.putFloat(i15 / 2.14748365E9f);
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
        e2.w0 w0Var2 = new e2.w0(h2.m0.h(w0Var.a, 0.1f, 8.0f), h2.m0.h(w0Var.b, 0.1f, 8.0f));
        this.x = w0Var2;
        o0 o0Var = new o0(w0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = o0Var;
        } else {
            this.w = o0Var;
        }
    }

    public final boolean D() {
        n0 n0Var = this.p;
        return n0Var != null && ((n) n0Var.e).j;
    }

    public final void a(long j3) {
        e2.w0 w0Var;
        boolean D = D();
        boolean z9 = false;
        h6.m mVar = this.b;
        if (D) {
            w0Var = e2.w0.d;
        } else {
            if (this.V || !n0.a(this.p)) {
                w0Var = e2.w0.d;
            } else {
                int i7 = ((e2.u) this.p.c).M;
                w0Var = this.x;
                f2.s sVar = (f2.s) mVar.d;
                float f10 = w0Var.a;
                sVar.getClass();
                ia.f(f10 > 0.0f);
                if (sVar.c != f10) {
                    sVar.c = f10;
                    sVar.i = true;
                }
                float f11 = w0Var.b;
                ia.f(f11 > 0.0f);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.i = true;
                }
            }
            this.x = w0Var;
        }
        e2.w0 w0Var2 = w0Var;
        if (!this.V && n0.a(this.p)) {
            int i10 = ((e2.u) this.p.c).M;
            z9 = this.y;
            ((v0) mVar.c).o = z9;
        }
        this.y = z9;
        this.h.add(new o0(w0Var2, Math.max(0L, j3), h2.m0.Y(((n) this.p.e).b, l())));
        f2.j jVar = (f2.j) this.p.f;
        this.q = jVar;
        jVar.a();
        v vVar = this.n;
        if (vVar != null) {
            vVar.f(this.y);
        }
    }

    public final f0 b(n nVar) {
        try {
            return ((h0) this.r).a(nVar);
        } catch (l e10) {
            u uVar = new u(nVar.b, nVar.c, nVar.a, nVar.f, (e2.u) this.p.c, nVar.e, e10);
            v vVar = this.n;
            if (vVar == null) {
                throw uVar;
            }
            vVar.U0(uVar);
            throw uVar;
        }
    }

    public final void c(e2.u uVar, int[] iArr) {
        f2.j jVar;
        e2.u uVar2;
        int i7;
        int i10;
        if (this.s == null && this.a != null) {
            l0 l0Var = new l0(this);
            this.s = l0Var;
            h0 h0Var = (h0) this.r;
            h0Var.f();
            if (h0Var.f == null) {
                h0Var.f = new h2.r(Thread.currentThread());
            }
            h0Var.f.a(l0Var);
        }
        String str = uVar.s;
        int i11 = uVar.K;
        int i12 = uVar.M;
        if ("audio/raw".equals(str)) {
            ia.f(h2.m0.M(i12));
            int u10 = h2.m0.u(i12) * i11;
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
            z0 z0Var = this.d;
            z0Var.i = i13;
            z0Var.j = i14;
            this.c.i = iArr;
            f2.k kVar = new f2.k(uVar.L, i11, i12);
            try {
                h9.i0 i0Var = jVar.a;
                if (kVar.equals(f2.k.e)) {
                    throw new f2.m(kVar);
                }
                for (int i15 = 0; i15 < i0Var.size(); i15++) {
                    f2.n nVar = (f2.n) i0Var.get(i15);
                    f2.k e10 = nVar.e(kVar);
                    if (nVar.isActive()) {
                        ia.p(!e10.equals(f2.k.e));
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
                i10 = h2.m0.u(i17) * i16;
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
            n c10 = ((h0) this.r).c(i18);
            boolean z9 = c10.e;
            if (c10.a == 0) {
                throw new t("Invalid output encoding (isOffload=" + z9 + ")", uVar3);
            }
            if (c10.c == 0) {
                throw new t("Invalid output channel config (isOffload=" + z9 + ")", uVar3);
            }
            this.X = false;
            n0 n0Var = new n0(uVar, uVar2, i7, i10, c10, jVar2);
            if (p()) {
                this.o = n0Var;
            } else {
                this.p = n0Var;
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
        p0 p0Var = this.l;
        if (((Exception) p0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < p0Var.b)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g10 = this.t.g(j3, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            p0Var.c = null;
            p0Var.a = -9223372036854775807L;
            p0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (vVar2 = this.n) != null && !g10 && !this.Y) {
                    vVar2.W();
                }
            }
            if (n0.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g10) {
                if (!n0.a(this.p)) {
                    ia.p(this.K == this.I);
                    this.C = (this.D * this.J) + this.C;
                }
                this.K = null;
            }
        } catch (g e10) {
            boolean z9 = e10.b;
            if (z9) {
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
                    vVar.U0(wVar);
                }
                if (!z9) {
                    throw wVar;
                }
                p0Var.a(wVar);
                return;
            }
            r4 = false;
            w wVar2 = new w(e10.a, (e2.u) this.p.c, r4);
            vVar = this.n;
            if (vVar != null) {
            }
            if (!z9) {
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
        b0 b0Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Y = false;
            this.D = 0;
            this.w = new o0(this.x, 0L, 0L);
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
            n0 n0Var = this.o;
            if (n0Var != null) {
                this.p = n0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            f0 f0Var = this.t;
            if (f0Var.f.d.getPlayState() == 3) {
                f0Var.a.pause();
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 29 && f0Var.c()) {
                e0 e0Var = f0Var.i;
                e0Var.getClass();
                e0.a(e0Var);
            }
            if (i7 >= 24 && (b0Var = f0Var.e) != null) {
                b0.b(b0Var);
                f0Var.e = null;
            }
            AudioTrack audioTrack = f0Var.a;
            h2.r rVar = f0Var.j;
            Handler q10 = h2.m0.q(null);
            synchronized (f0.t) {
                try {
                    if (f0.u == null) {
                        f0.u = Executors.newSingleThreadScheduledExecutor(new h2.l0(0));
                    }
                    f0.v++;
                    f0.u.schedule(new l2.z0(audioTrack, q10, rVar, 10), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        p0 p0Var = this.l;
        p0Var.c = null;
        p0Var.a = -9223372036854775807L;
        p0Var.b = -9223372036854775807L;
        p0 p0Var2 = this.k;
        p0Var2.c = null;
        p0Var2.a = -9223372036854775807L;
        p0Var2.b = -9223372036854775807L;
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
        if (n0.a(this.p)) {
            return h2.m0.Y(((n) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j3 = f3.b.j(((n) this.p.e).a);
        ia.p(j3 != -2147483647);
        return h2.m0.a0(bufferSizeInFrames, 1000000L, j3, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j3;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), h2.m0.Y(((n) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((o0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (o0) arrayDeque.remove();
        }
        o0 o0Var = this.w;
        long j10 = min - o0Var.c;
        long B = h2.m0.B(j10, o0Var.a.a);
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
                    j10 = i7 == i10 ? h2.m0.a0(j10, o4, sVar.n, RoundingMode.DOWN) : h2.m0.a0(j10, o4 * i7, sVar.n * i10, RoundingMode.DOWN);
                } else {
                    j10 = (long) (sVar.c * j10);
                }
            }
            o0 o0Var2 = this.w;
            j3 = o0Var2.b + j10;
            o0Var2.d = j10 - B;
        } else {
            o0 o0Var3 = this.w;
            j3 = o0Var3.b + B + o0Var3.d;
        }
        long j12 = ((v0) mVar.c).q;
        long Y = h2.m0.Y(((n) this.p.e).b, j12) + j3;
        long j13 = this.Z;
        if (j12 > j13) {
            long Y2 = h2.m0.Y(((n) this.p.e).b, j12 - j13);
            this.Z = j12;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new l2.a0(this, 12), 100L);
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
        boolean z9;
        if (!h2.m0.M(uVar.M) || uVar.M == 2) {
            z9 = false;
        } else {
            e2.t a10 = uVar.a();
            a10.L = 2;
            uVar = new e2.u(a10);
            z9 = true;
        }
        int i7 = ((h0) this.r).b(i(uVar)).d;
        if (i7 != 1) {
            if (i7 != 2) {
                return 0;
            }
            if (!z9) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!n0.a(this.p)) {
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
        ia.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
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
                f0 f0Var = this.t;
                if (f0Var != null && f0Var.c() && ((n) this.p.e).k) {
                    this.t.e();
                    f0 f0Var2 = this.t;
                    e2.u uVar = (e2.u) this.p.c;
                    f0Var2.d(uVar.N, uVar.O);
                    this.Y = true;
                }
                a(j3);
            }
            return false;
        }
        boolean p10 = p();
        p0 p0Var = this.k;
        if (!p10) {
            try {
            } catch (u e10) {
                if (e10.a) {
                    throw e10;
                }
                p0Var.a(e10);
                return false;
            }
        }
        p0Var.c = null;
        p0Var.a = -9223372036854775807L;
        p0Var.b = -9223372036854775807L;
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
            ia.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!n0.a(this.p) && this.D == 0) {
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
                n0 n0Var = this.p;
                if (n0.a(n0Var)) {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.z / this.p.a;
                } else {
                    j10 = -9223372036854775807L;
                    j11 = 0;
                    j12 = this.A;
                }
                long Y = h2.m0.Y(((e2.u) n0Var.c).L, j12 - this.d.o) + j13;
                if (!this.E && Math.abs(Y - j3) > 200000) {
                    v vVar = this.n;
                    if (vVar != null) {
                        StringBuilder t6 = a8.p0.t(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        t6.append(j3);
                        vVar.U0(new ab.a0(t6.toString()));
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
                            vVar2.c1();
                        }
                    }
                    return false;
                }
                if (n0.a(this.p)) {
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
        f0 f0Var3 = this.t;
        i0 i0Var = f0Var3.f;
        long b10 = f0Var3.b();
        if (i0Var.v != j10 && b10 > j11) {
            i0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - i0Var.v >= 200) {
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
        f0 f0Var = this.t;
        f0Var.getClass();
        return l10 > h2.m0.a0(a10, (long) f0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        f0 b10;
        p0 p0Var = this.k;
        if (((Exception) p0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < p0Var.b)) {
            return false;
        }
        try {
            b10 = b((n) this.p.e);
        } catch (u e10) {
            int i7 = ((n) this.p.e).f;
            while (i7 > 1000000) {
                int i10 = i7 / 2;
                n0 n0Var = this.p;
                int i11 = n0Var.b;
                if (i11 == -1) {
                    i11 = 1;
                }
                int i12 = i10 % i11;
                int i13 = i12 != 0 ? (i11 - i12) + i10 : i10;
                m a10 = ((n) n0Var.e).a();
                a10.f = i13;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    n0 n0Var2 = this.p;
                    this.p = new n0((e2.u) n0Var2.c, (e2.u) n0Var2.d, n0Var2.a, n0Var2.b, nVar, (f2.j) n0Var2.f);
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
        m0 m0Var = new m0(this, (n) this.p.e);
        this.j = m0Var;
        b10.j.a(m0Var);
        if (this.t.c()) {
            n0 n0Var3 = this.p;
            if (((n) n0Var3.e).k) {
                f0 f0Var = this.t;
                e2.u uVar = (e2.u) n0Var3.c;
                f0Var.d(uVar.N, uVar.O);
            }
        }
        m2.j jVar = this.m;
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
        boolean z9 = audioSessionId != this.Q;
        this.Q = audioSessionId;
        v vVar = this.n;
        if (vVar != null) {
            int i14 = ((n) this.p.e).a;
            vVar.Y(new r0());
            if (z9) {
                this.R = true;
                n0 n0Var4 = this.p;
                m a11 = ((n) n0Var4.e).a();
                a11.h = this.Q;
                this.p = new n0((e2.u) n0Var4.c, (e2.u) n0Var4.d, n0Var4.a, n0Var4.b, new n(a11), (f2.j) n0Var4.f);
                n0 n0Var5 = this.o;
                if (n0Var5 != null) {
                    m a12 = ((n) n0Var5.e).a();
                    a12.h = this.Q;
                    this.o = new n0((e2.u) n0Var5.c, (e2.u) n0Var5.d, n0Var5.a, n0Var5.b, new n(a12), (f2.j) n0Var5.f);
                }
                this.n.c(this.Q);
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
            f0 f0Var = this.t;
            i0 i0Var = f0Var.f;
            i0Var.k = 0L;
            i0Var.t = 0;
            i0Var.s = 0;
            i0Var.l = 0L;
            i0Var.y = -9223372036854775807L;
            i0Var.z = -9223372036854775807L;
            if (i0Var.u == -9223372036854775807L) {
                i0Var.h.a(0);
            }
            i0Var.w = i0Var.a();
            if (!f0Var.k || f0Var.c()) {
                f0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            f0 f0Var = this.t;
            i0 i0Var = f0Var.f;
            if (i0Var.u != -9223372036854775807L) {
                i0Var.b.getClass();
                i0Var.u = h2.m0.S(SystemClock.elapsedRealtime());
            }
            i0Var.j = h2.m0.Y(i0Var.e, i0Var.a());
            i0Var.h.a(0);
            if (!f0Var.k || f0Var.c()) {
                f0Var.a.play();
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
        f0 f0Var = this.t;
        if (f0Var.k) {
            return;
        }
        f0Var.k = true;
        i0 i0Var = f0Var.f;
        long b10 = f0Var.b();
        i0Var.w = i0Var.a();
        i0Var.b.getClass();
        i0Var.u = h2.m0.S(SystemClock.elapsedRealtime());
        i0Var.x = b10;
        f0Var.a.stop();
        f0Var.p = 0;
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
            n0 n0Var = this.o;
            if (n0Var != null) {
                this.p = n0Var;
                this.o = null;
            }
            try {
                n c10 = ((h0) this.r).c(i((e2.u) this.p.d));
                n0 n0Var2 = this.p;
                this.p = new n0((e2.u) n0Var2.c, (e2.u) n0Var2.d, n0Var2.a, n0Var2.b, c10, (f2.j) n0Var2.f);
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
            f0 f0Var = this.t;
            e2.w0 w0Var = this.x;
            AudioTrack audioTrack = f0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(h2.m0.h(w0Var.a, 0.1f, f0Var.c)).setPitch(h2.m0.h(w0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                h2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            i0 i0Var = f0Var.f;
            i0Var.i = audioTrack.getPlaybackParams().getSpeed();
            i0Var.h.a(0);
            i0Var.k = 0L;
            i0Var.t = 0;
            i0Var.s = 0;
            i0Var.l = 0L;
            i0Var.y = -9223372036854775807L;
            i0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new e2.w0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.r)) {
            return;
        }
        ((h0) this.r).d();
        this.r = oVar;
        l0 l0Var = this.s;
        if (l0Var != null) {
            h0 h0Var = (h0) oVar;
            h0Var.f();
            if (h0Var.f == null) {
                h0Var.f = new h2.r(Thread.currentThread());
            }
            h0Var.f.a(l0Var);
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
