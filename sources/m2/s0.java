package m2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b8.zb;
import ei.i4;
import g9.s1;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k2.p1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 implements z {
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
    public d2.g S;
    public AudioDeviceInfo T;
    public int U;
    public boolean V;
    public long W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final Context a;
    public long a0;
    public final k4.j b;
    public Handler b0;
    public final l0 c;
    public final b1 d;
    public final e2.t e;
    public final a1 f;
    public final s1 g;
    public final ArrayDeque h;
    public int i;
    public o0 j;
    public final r0 k;
    public final r0 l;
    public l2.k m;
    public x n;
    public p0 o;
    public p0 p;
    public e2.i q;
    public o r;
    public n0 s;
    public h0 t;
    public d2.f u;
    public q0 v;
    public q0 w;
    public d2.y0 x;
    public boolean y;
    public long z;

    public s0(i4 i4Var) {
        int deviceId;
        Context context = (Context) i4Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = d2.f.i;
        this.b = (k4.j) i4Var.d;
        this.i = 0;
        this.r = (j0) i4Var.f;
        l0 l0Var = new l0();
        this.c = l0Var;
        b1 b1Var = new b1();
        b1Var.m = g2.n0.b;
        this.d = b1Var;
        this.e = new e2.t();
        this.f = new a1();
        this.g = g9.i0.v(b1Var, l0Var);
        this.H = 1.0f;
        this.Q = 0;
        this.S = new d2.g();
        d2.y0 y0Var = d2.y0.d;
        this.w = new q0(y0Var, 0L, 0L);
        this.x = y0Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new r0();
        this.l = new r0();
        int i3 = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i3 = deviceId;
        }
        this.U = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i3, ByteBuffer byteBuffer) {
        int i10;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        if (i3 == 20) {
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
            return (int) ((h2.o.e(byteBuffer.get(i21), byteBuffer.limit() - i21 > 1 ? byteBuffer.get(i21 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i3 != 30) {
            switch (i3) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = g2.n0.a;
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
                    switch (i3) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i25 = position2;
                            while (true) {
                                if (i25 <= limit) {
                                    String str2 = g2.n0.a;
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
                            return e3.b.m(new c4.f(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException(p1.i(i3, "Unexpected audio encoding: "));
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return e3.b.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
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

    public final void A(d2.g gVar) {
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
        int i3;
        byte b10;
        int i10;
        int i11;
        zb.p(this.K == null);
        if (byteBuffer.hasRemaining()) {
            if (p0.a(this.p)) {
                int a02 = (int) g2.n0.a0(g2.n0.S(20L), ((n) this.p.e).b, 1000000L, RoundingMode.UP);
                long l10 = l();
                long j10 = a02;
                if (l10 < j10) {
                    p0 p0Var = this.p;
                    int i12 = ((n) p0Var.e).a;
                    int i13 = p0Var.b;
                    int i14 = (int) l10;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i14 < a02) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i11 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 == 4) {
                                float h = g2.n0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                i11 = (int) (h < 0.0f ? (-h) * (-2.14748365E9f) : h * 2.14748365E9f);
                            } else if (i12 == 21) {
                                i3 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            } else if (i12 != 22) {
                                if (i12 == 268435456) {
                                    i3 = (byteBuffer.get() & 255) << 24;
                                    i10 = (byteBuffer.get() & 255) << 16;
                                } else if (i12 == 1342177280) {
                                    i3 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i10 = (byteBuffer.get() & 255) << 8;
                                } else if (i12 == 1610612736) {
                                    i3 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i10 = byteBuffer.get() & 255;
                                } else {
                                    if (i12 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    double max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                    i11 = (int) (max < 0.0d ? (-max) * (-2.147483648E9d) : max * 2.147483647E9d);
                                }
                                i11 = i3 | i10;
                            } else {
                                i3 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b10 = byteBuffer.get();
                            }
                            int i15 = (int) ((i11 * i14) / j10);
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
                            i3 = (byteBuffer.get() & 255) << 16;
                            b10 = byteBuffer.get();
                        }
                        i10 = (b10 & 255) << 24;
                        i11 = i3 | i10;
                        int i152 = (int) ((i11 * i14) / j10);
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

    public final void C(d2.y0 y0Var) {
        if (D()) {
            this.x = y0Var;
            x();
            return;
        }
        d2.y0 y0Var2 = new d2.y0(g2.n0.h(y0Var.a, 0.1f, 8.0f), g2.n0.h(y0Var.b, 0.1f, 8.0f));
        this.x = y0Var2;
        q0 q0Var = new q0(y0Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = q0Var;
        } else {
            this.w = q0Var;
        }
    }

    public final boolean D() {
        p0 p0Var = this.p;
        return p0Var != null && ((n) p0Var.e).j;
    }

    public final void a(long j10) {
        d2.y0 y0Var;
        boolean D = D();
        boolean z10 = false;
        k4.j jVar = this.b;
        if (D) {
            y0Var = d2.y0.d;
        } else {
            if (this.V || !p0.a(this.p)) {
                y0Var = d2.y0.d;
            } else {
                int i3 = ((d2.v) this.p.c).M;
                y0Var = this.x;
                e2.s sVar = (e2.s) jVar.c;
                float f10 = y0Var.a;
                sVar.getClass();
                zb.f(f10 > 0.0f);
                if (sVar.c != f10) {
                    sVar.c = f10;
                    sVar.i = true;
                }
                float f11 = y0Var.b;
                zb.f(f11 > 0.0f);
                if (sVar.d != f11) {
                    sVar.d = f11;
                    sVar.i = true;
                }
            }
            this.x = y0Var;
        }
        d2.y0 y0Var2 = y0Var;
        if (!this.V && p0.a(this.p)) {
            int i10 = ((d2.v) this.p.c).M;
            z10 = this.y;
            ((x0) jVar.b).o = z10;
        }
        this.y = z10;
        this.h.add(new q0(y0Var2, Math.max(0L, j10), g2.n0.Y(((n) this.p.e).b, l())));
        e2.i iVar = (e2.i) this.p.f;
        this.q = iVar;
        iVar.a();
        x xVar = this.n;
        if (xVar != null) {
            xVar.e(this.y);
        }
    }

    public final h0 b(n nVar) {
        try {
            return ((j0) this.r).a(nVar);
        } catch (l e10) {
            w wVar = new w(nVar.b, nVar.c, nVar.a, nVar.f, (d2.v) this.p.c, nVar.e, e10);
            x xVar = this.n;
            if (xVar == null) {
                throw wVar;
            }
            xVar.N(wVar);
            throw wVar;
        }
    }

    public final void c(d2.v vVar, int[] iArr) {
        e2.i iVar;
        d2.v vVar2;
        int i3;
        int i10;
        if (this.s == null && this.a != null) {
            n0 n0Var = new n0(this);
            this.s = n0Var;
            j0 j0Var = (j0) this.r;
            j0Var.f();
            if (j0Var.f == null) {
                j0Var.f = new g2.s(Thread.currentThread());
            }
            j0Var.f.a(n0Var);
        }
        String str = vVar.s;
        int i11 = vVar.K;
        int i12 = vVar.M;
        if ("audio/raw".equals(str)) {
            zb.f(g2.n0.M(i12));
            int u10 = g2.n0.u(i12) * i11;
            g9.f0 f0Var = new g9.f0(4);
            f0Var.d(this.g);
            f0Var.c(this.e);
            e2.m[] mVarArr = (e2.m[]) this.b.a;
            int length = mVarArr.length;
            g9.o.e(length, mVarArr);
            f0Var.e(length);
            System.arraycopy(mVarArr, 0, f0Var.a, f0Var.b, length);
            f0Var.b += length;
            iVar = new e2.i(f0Var.f());
            if (iVar.equals(this.q)) {
                iVar = this.q;
            }
            int i13 = vVar.N;
            int i14 = vVar.O;
            b1 b1Var = this.d;
            b1Var.i = i13;
            b1Var.j = i14;
            this.c.i = iArr;
            e2.j jVar = new e2.j(vVar.L, i11, i12);
            try {
                g9.i0 i0Var = iVar.a;
                if (jVar.equals(e2.j.e)) {
                    throw new e2.l(jVar);
                }
                for (int i15 = 0; i15 < i0Var.size(); i15++) {
                    e2.m mVar = (e2.m) i0Var.get(i15);
                    e2.j d = mVar.d(jVar);
                    if (mVar.isActive()) {
                        zb.p(!d.equals(e2.j.e));
                        jVar = d;
                    }
                }
                int i16 = jVar.b;
                int i17 = jVar.c;
                d2.u a10 = vVar.a();
                a10.L = i17;
                a10.K = jVar.a;
                a10.J = i16;
                vVar2 = new d2.v(a10);
                i3 = u10;
                i10 = g2.n0.u(i17) * i16;
            } catch (e2.l e10) {
                throw new v(e10, vVar);
            }
        } else {
            iVar = new e2.i(s1.e);
            vVar2 = vVar;
            i3 = -1;
            i10 = -1;
        }
        e2.i iVar2 = iVar;
        i i18 = i(vVar2);
        d2.v vVar3 = i18.a;
        try {
            n c2 = ((j0) this.r).c(i18);
            boolean z10 = c2.e;
            if (c2.a == 0) {
                throw new v("Invalid output encoding (isOffload=" + z10 + ")", vVar3);
            }
            if (c2.c == 0) {
                throw new v("Invalid output channel config (isOffload=" + z10 + ")", vVar3);
            }
            this.X = false;
            p0 p0Var = new p0(vVar, vVar2, i3, i10, c2, iVar2);
            if (p()) {
                this.o = p0Var;
            } else {
                this.p = p0Var;
            }
        } catch (h e11) {
            throw new v(e11, vVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10) {
        x xVar;
        x xVar2;
        if (this.K == null) {
            return;
        }
        r0 r0Var = this.l;
        if (((Exception) r0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < r0Var.b)) {
            return;
        }
        int remaining = this.K.remaining();
        try {
            boolean g7 = this.t.g(j10, this.J, this.K);
            this.W = SystemClock.elapsedRealtime();
            r0Var.c = null;
            r0Var.a = -9223372036854775807L;
            r0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Y = false;
                }
                if (this.O && (xVar2 = this.n) != null && !g7 && !this.Y) {
                    xVar2.q();
                }
            }
            if (p0.a(this.p)) {
                this.B += remaining - this.K.remaining();
            }
            if (g7) {
                if (!p0.a(this.p)) {
                    zb.p(this.K == this.I);
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
                y yVar = new y(e10.a, (d2.v) this.p.c, r4);
                xVar = this.n;
                if (xVar != null) {
                    xVar.N(yVar);
                }
                if (!z10) {
                    throw yVar;
                }
                r0Var.a(yVar);
                return;
            }
            r4 = false;
            y yVar2 = new y(e10.a, (d2.v) this.p.c, r4);
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
        e2.i iVar = this.q;
        if (iVar.d() && !iVar.d) {
            iVar.d = true;
            ((e2.m) iVar.b.get(0)).f();
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
            this.w = new q0(this.x, 0L, 0L);
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
            e2.i iVar = (e2.i) this.p.f;
            this.q = iVar;
            iVar.a();
            this.j = null;
            p0 p0Var = this.o;
            if (p0Var != null) {
                this.p = p0Var;
                this.o = null;
            }
            c0.incrementAndGet();
            h0 h0Var = this.t;
            if (h0Var.f.d.getPlayState() == 3) {
                h0Var.a.pause();
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && h0Var.c()) {
                g0 g0Var = h0Var.i;
                g0Var.getClass();
                g0.a(g0Var);
            }
            if (i3 >= 24 && (d0Var = h0Var.e) != null) {
                d0.b(d0Var);
                h0Var.e = null;
            }
            AudioTrack audioTrack = h0Var.a;
            g2.s sVar = h0Var.j;
            Handler q10 = g2.n0.q(null);
            synchronized (h0.t) {
                try {
                    if (h0.u == null) {
                        h0.u = Executors.newSingleThreadScheduledExecutor(new g2.m0(0));
                    }
                    h0.v++;
                    h0.u.schedule(new lg.y(audioTrack, q10, sVar, 6), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.t = null;
        }
        r0 r0Var = this.l;
        r0Var.c = null;
        r0Var.a = -9223372036854775807L;
        r0Var.b = -9223372036854775807L;
        r0 r0Var2 = this.k;
        r0Var2.c = null;
        r0Var2.a = -9223372036854775807L;
        r0Var2.b = -9223372036854775807L;
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
        if (p0.a(this.p)) {
            return g2.n0.Y(((n) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int j10 = e3.b.j(((n) this.p.e).a);
        zb.p(j10 != -2147483647);
        return g2.n0.a0(bufferSizeInFrames, 1000000L, j10, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j10;
        if (!p() || this.F) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), g2.n0.Y(((n) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((q0) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (q0) arrayDeque.remove();
        }
        q0 q0Var = this.w;
        long j11 = min - q0Var.c;
        long B = g2.n0.B(j11, q0Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        k4.j jVar = this.b;
        if (isEmpty) {
            e2.s sVar = (e2.s) jVar.c;
            if (sVar.isActive()) {
                if (sVar.n >= 1024) {
                    long j12 = sVar.m;
                    sVar.j.getClass();
                    long o10 = j12 - (r8.i.o() * (r8.j * r8.b));
                    int i3 = sVar.h.a;
                    int i10 = sVar.g.a;
                    j11 = i3 == i10 ? g2.n0.a0(j11, o10, sVar.n, RoundingMode.DOWN) : g2.n0.a0(j11, o10 * i3, sVar.n * i10, RoundingMode.DOWN);
                } else {
                    j11 = (long) (sVar.c * j11);
                }
            }
            q0 q0Var2 = this.w;
            j10 = q0Var2.b + j11;
            q0Var2.d = j11 - B;
        } else {
            q0 q0Var3 = this.w;
            j10 = q0Var3.b + B + q0Var3.d;
        }
        long j13 = ((x0) jVar.b).q;
        long Y = g2.n0.Y(((n) this.p.e).b, j13) + j10;
        long j14 = this.Z;
        if (j13 > j14) {
            long Y2 = g2.n0.Y(((n) this.p.e).b, j13 - j14);
            this.Z = j13;
            this.a0 += Y2;
            if (this.b0 == null) {
                this.b0 = new Handler(Looper.myLooper());
            }
            this.b0.removeCallbacksAndMessages(null);
            this.b0.postDelayed(new lg.n(this, 9), 100L);
        }
        return Y;
    }

    public final i i(d2.v vVar) {
        i iVar = new i(vVar);
        iVar.b = this.u;
        iVar.d = this.i != 0;
        iVar.c = this.T;
        iVar.e = this.Q;
        iVar.g = this.V;
        iVar.h = -1;
        iVar.f = this.U;
        return new i(iVar);
    }

    public final int j(d2.v vVar) {
        boolean z10;
        if (!g2.n0.M(vVar.M) || vVar.M == 2) {
            z10 = false;
        } else {
            d2.u a10 = vVar.a();
            a10.L = 2;
            vVar = new d2.v(a10);
            z10 = true;
        }
        int i3 = ((j0) this.r).b(i(vVar)).d;
        if (i3 != 1) {
            if (i3 != 2) {
                return 0;
            }
            if (!z10) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!p0.a(this.p)) {
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
    public final boolean m(long j10, int i3, ByteBuffer byteBuffer) {
        long j11;
        long j12;
        long j13;
        ByteBuffer byteBuffer2 = this.I;
        zb.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    n nVar = (n) this.p.e;
                    i((d2.v) this.o.d);
                    if (!((n) this.o.e).equals(nVar)) {
                        s();
                        if (!n()) {
                            f();
                            a(j10);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                h0 h0Var = this.t;
                if (h0Var != null && h0Var.c() && ((n) this.p.e).k) {
                    this.t.e();
                    h0 h0Var2 = this.t;
                    d2.v vVar = (d2.v) this.p.c;
                    h0Var2.d(vVar.N, vVar.O);
                    this.Y = true;
                }
                a(j10);
            }
            return false;
        }
        boolean p10 = p();
        r0 r0Var = this.k;
        if (!p10) {
            try {
            } catch (w e10) {
                if (e10.a) {
                    throw e10;
                }
                r0Var.a(e10);
                return false;
            }
        }
        r0Var.c = null;
        r0Var.a = -9223372036854775807L;
        r0Var.b = -9223372036854775807L;
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
            zb.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!p0.a(this.p) && this.D == 0) {
                    int k10 = k(((n) this.p.e).a, byteBuffer);
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
                p0 p0Var = this.p;
                if (p0.a(p0Var)) {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.z / this.p.a;
                } else {
                    j11 = -9223372036854775807L;
                    j12 = 0;
                    j13 = this.A;
                }
                long Y = g2.n0.Y(((d2.v) p0Var.c).L, j13 - this.d.o) + j14;
                if (!this.E && Math.abs(Y - j10) > 200000) {
                    x xVar = this.n;
                    if (xVar != null) {
                        StringBuilder t10 = a1.g.t(Y, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        t10.append(j10);
                        xVar.N(new l6.m(t10.toString()));
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
                            xVar2.Q();
                        }
                    }
                    return false;
                }
                if (p0.a(this.p)) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i3) + this.A;
                }
                this.I = byteBuffer;
                this.J = i3;
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
        h0 h0Var3 = this.t;
        k0 k0Var = h0Var3.f;
        long b10 = h0Var3.b();
        if (k0Var.v != j11 && b10 > j12) {
            k0Var.b.getClass();
            if (SystemClock.elapsedRealtime() - k0Var.v >= 200) {
                g2.a.l("DefaultAudioSink", "Resetting stalled audio output");
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
        h0 h0Var = this.t;
        h0Var.getClass();
        return l10 > g2.n0.a0(a10, (long) h0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        h0 b10;
        r0 r0Var = this.k;
        if (((Exception) r0Var.c) != null && (c0.get() > 0 || SystemClock.elapsedRealtime() < r0Var.b)) {
            return false;
        }
        try {
            b10 = b((n) this.p.e);
        } catch (w e10) {
            int i3 = ((n) this.p.e).f;
            while (i3 > 1000000) {
                int i10 = i3 / 2;
                p0 p0Var = this.p;
                int i11 = p0Var.b;
                if (i11 == -1) {
                    i11 = 1;
                }
                int i12 = i10 % i11;
                int i13 = i12 != 0 ? (i11 - i12) + i10 : i10;
                m a10 = ((n) p0Var.e).a();
                a10.f = i13;
                n nVar = new n(a10);
                try {
                    b10 = b(nVar);
                    p0 p0Var2 = this.p;
                    this.p = new p0((d2.v) p0Var2.c, (d2.v) p0Var2.d, p0Var2.a, p0Var2.b, nVar, (e2.i) p0Var2.f);
                } catch (w e11) {
                    e10.addSuppressed(e11);
                    i3 = i13;
                }
            }
            if (!((n) this.p.e).e) {
                throw e10;
            }
            this.X = true;
            throw e10;
        }
        this.t = b10;
        o0 o0Var = new o0(this, (n) this.p.e);
        this.j = o0Var;
        b10.j.a(o0Var);
        if (this.t.c()) {
            p0 p0Var3 = this.p;
            if (((n) p0Var3.e).k) {
                h0 h0Var = this.t;
                d2.v vVar = (d2.v) p0Var3.c;
                h0Var.d(vVar.N, vVar.O);
            }
        }
        l2.k kVar = this.m;
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
            int i14 = ((n) this.p.e).a;
            xVar.J(new t0());
            if (z10) {
                this.R = true;
                p0 p0Var4 = this.p;
                m a11 = ((n) p0Var4.e).a();
                a11.h = this.Q;
                this.p = new p0((d2.v) p0Var4.c, (d2.v) p0Var4.d, p0Var4.a, p0Var4.b, new n(a11), (e2.i) p0Var4.f);
                p0 p0Var5 = this.o;
                if (p0Var5 != null) {
                    m a12 = ((n) p0Var5.e).a();
                    a12.h = this.Q;
                    this.o = new p0((d2.v) p0Var5.c, (d2.v) p0Var5.d, p0Var5.a, p0Var5.b, new n(a12), (e2.i) p0Var5.f);
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
            h0 h0Var = this.t;
            k0 k0Var = h0Var.f;
            k0Var.k = 0L;
            k0Var.t = 0;
            k0Var.s = 0;
            k0Var.l = 0L;
            k0Var.y = -9223372036854775807L;
            k0Var.z = -9223372036854775807L;
            if (k0Var.u == -9223372036854775807L) {
                k0Var.h.a(0);
            }
            k0Var.w = k0Var.a();
            if (!h0Var.k || h0Var.c()) {
                h0Var.a.pause();
            }
        }
    }

    public final void r() {
        this.O = true;
        if (p()) {
            h0 h0Var = this.t;
            k0 k0Var = h0Var.f;
            if (k0Var.u != -9223372036854775807L) {
                k0Var.b.getClass();
                k0Var.u = g2.n0.S(SystemClock.elapsedRealtime());
            }
            k0Var.j = g2.n0.Y(k0Var.e, k0Var.a());
            k0Var.h.a(0);
            if (!h0Var.k || h0Var.c()) {
                h0Var.a.play();
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
        h0 h0Var = this.t;
        if (h0Var.k) {
            return;
        }
        h0Var.k = true;
        k0 k0Var = h0Var.f;
        long b10 = h0Var.b();
        k0Var.w = k0Var.a();
        k0Var.b.getClass();
        k0Var.u = g2.n0.S(SystemClock.elapsedRealtime());
        k0Var.x = b10;
        h0Var.a.stop();
        h0Var.p = 0;
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
                e2.i iVar = this.q;
                if (iVar.d()) {
                    ByteBuffer byteBuffer3 = iVar.c[iVar.b()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        iVar.e(e2.m.a);
                        byteBuffer = iVar.c[iVar.b()];
                    }
                } else {
                    byteBuffer = e2.m.a;
                }
                if (byteBuffer.hasRemaining()) {
                    B(byteBuffer);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer4 = this.I;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    e2.i iVar2 = this.q;
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
            p0 p0Var = this.o;
            if (p0Var != null) {
                this.p = p0Var;
                this.o = null;
            }
            try {
                n c2 = ((j0) this.r).c(i((d2.v) this.p.d));
                p0 p0Var2 = this.p;
                this.p = new p0((d2.v) p0Var2.c, (d2.v) p0Var2.d, p0Var2.a, p0Var2.b, c2, (e2.i) p0Var2.f);
            } catch (h e10) {
                throw new IllegalStateException(new v(e10, (d2.v) this.p.c));
            }
        }
        f();
    }

    public final void w() {
        f();
        g9.g0 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((e2.m) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        e2.i iVar = this.q;
        if (iVar != null) {
            g9.i0 i0Var = iVar.a;
            for (int i3 = 0; i3 < i0Var.size(); i3++) {
                e2.m mVar = (e2.m) i0Var.get(i3);
                mVar.e(e2.k.b);
                mVar.reset();
            }
            iVar.b.clear();
            iVar.c = new ByteBuffer[0];
            e2.j jVar = e2.j.e;
            iVar.d = false;
        }
        this.O = false;
        this.X = false;
    }

    public final void x() {
        if (p()) {
            h0 h0Var = this.t;
            d2.y0 y0Var = this.x;
            AudioTrack audioTrack = h0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(g2.n0.h(y0Var.a, 0.1f, h0Var.c)).setPitch(g2.n0.h(y0Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                g2.a.m("AudioTrackAudioOutput", "Failed to set playback params", e10);
            }
            k0 k0Var = h0Var.f;
            k0Var.i = audioTrack.getPlaybackParams().getSpeed();
            k0Var.h.a(0);
            k0Var.k = 0L;
            k0Var.t = 0;
            k0Var.s = 0;
            k0Var.l = 0L;
            k0Var.y = -9223372036854775807L;
            k0Var.z = -9223372036854775807L;
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new d2.y0(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(o oVar) {
        if (oVar.equals(this.r)) {
            return;
        }
        ((j0) this.r).d();
        this.r = oVar;
        n0 n0Var = this.s;
        if (n0Var != null) {
            j0 j0Var = (j0) oVar;
            j0Var.f();
            if (j0Var.f == null) {
                j0Var.f = new g2.s(Thread.currentThread());
            }
            j0Var.f.a(n0Var);
        }
        v();
    }

    public final void z(int i3) {
        if (this.R) {
            if (this.Q != i3) {
                return;
            } else {
                this.R = false;
            }
        }
        if (this.Q != i3) {
            this.Q = i3;
            this.P = i3 != 0;
            v();
        }
    }
}
