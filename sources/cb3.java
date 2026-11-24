// default package

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cb3 implements x40 {
    public long A;
    public long B;
    public long C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public float K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public tb0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final mx6 b;
    public boolean b0;
    public final jj1 c;
    public long c0;
    public final e4c d;
    public long d0;
    public final crb e;
    public Handler e0;
    public final crb f;
    public final y79 g;
    public final ArrayDeque h;
    public byte i;
    public ab3 j;
    public final sz0 k;
    public final sz0 l;
    public we8 m;
    public u40 n;
    public ki2 o;
    public ki2 p;
    public k30 q;
    public s10 r;
    public za3 s;
    public j50 t;
    public o00 u;
    public bb3 v;
    public bb3 w;
    public ce8 x;
    public boolean y;
    public long z;

    public cb3(c40 c40Var) {
        int deviceId;
        Context context = (Context) c40Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = o00.i;
        this.b = (mx6) c40Var.d;
        this.i = (byte) 0;
        this.r = (l50) c40Var.f;
        jj1 jj1Var = new jj1();
        this.c = jj1Var;
        e4c e4cVar = new e4c();
        e4cVar.m = hac.b;
        this.d = e4cVar;
        this.e = new crb((byte) 1);
        this.f = new crb((byte) 0);
        this.g = mo5.v(e4cVar, jj1Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new tb0();
        ce8 ce8Var = ce8.d;
        this.w = new bb3(ce8Var, 0L, 0L);
        this.x = ce8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new sz0(this);
        this.l = new sz0(this);
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.X = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int k(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((jse.b(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int position = byteBuffer.position();
                    String str = hac.a;
                    int i14 = byteBuffer.getInt(position);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        i14 = Integer.reverseBytes(i14);
                    }
                    if ((i14 & (-2097152)) == -2097152 && (i6 = (i14 >>> 19) & 3) != 1 && (i7 = (i14 >>> 17) & 3) != 0) {
                        int i15 = (i14 >>> 12) & 15;
                        int i16 = (i14 >>> 10) & 3;
                        if (i15 != 0 && i15 != 15 && i16 != 3) {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        i98.g();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                            if (i5 == -1) {
                                return i5;
                            }
                            i98.g();
                            return 0;
                        }
                    }
                    i5 = -1;
                    if (i5 == -1) {
                    }
                    break;
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i17 = position2;
                            while (true) {
                                if (i17 <= limit) {
                                    String str2 = hac.a;
                                    int i18 = byteBuffer.getInt(i17 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i18 = Integer.reverseBytes(i18);
                                    }
                                    if ((i18 & (-2)) == -126718022) {
                                        i8 = i17 - position2;
                                    } else {
                                        i17++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) << 4;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            return ik7.e(new ye1(16, bArr)).c;
                        case 18:
                            break;
                        default:
                            dq9.m(hg9.j(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return oe3.b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
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
        byte b5 = byteBuffer.get(position4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(position4 + 4) & 7) << 4;
                b2 = byteBuffer.get(position4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(position4 + 4) & 1) << 6;
                b = byteBuffer.get(position4 + 5);
            } else {
                i3 = (byteBuffer.get(position4 + 5) & 7) << 4;
                b2 = byteBuffer.get(position4 + 6);
            }
            i4 = b2 & 60;
            return ((i3 | (i4 >> 2)) + 1) << 5;
        }
        i3 = (byteBuffer.get(position4 + 5) & 1) << 6;
        b = byteBuffer.get(position4 + 4);
        i4 = b & 252;
        return ((i3 | (i4 >> 2)) + 1) << 5;
    }

    public final void A(tb0 tb0Var) {
        if (this.V.equals(tb0Var)) {
            return;
        }
        tb0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = tb0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00e9, code lost:
    
        if (r9 < 0.0d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0183, code lost:
    
        if (r9 < 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r9 < 0.0d) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        r9 = r9 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00eb, code lost:
    
        r9 = (-r9) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d7, code lost:
    
        if (r9 < 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018a, code lost:
    
        r9 = r9 * 2.1474836E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        r9 = (-r9) * (-2.1474836E9f);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        byte b;
        int i2;
        int i3;
        float h;
        float f;
        double max;
        double d;
        jte.p(this.N == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.d()) {
                int b0 = (int) hac.b0(hac.T(20L), ((r10) this.p.e).b, 1000000L, RoundingMode.UP);
                long l = l();
                long j = b0;
                if (l < j) {
                    ki2 ki2Var = this.p;
                    int i4 = ((r10) ki2Var.e).a;
                    int i5 = ki2Var.b;
                    int i6 = (int) l;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < b0) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    h = hac.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                                } else if (i4 == 21) {
                                    i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                } else if (i4 != 22) {
                                    if (i4 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i4 == 1342177280) {
                                        i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                        i2 = (byteBuffer.get() & 255) << 8;
                                    } else if (i4 != 1610612736) {
                                        if (i4 == 1879048192) {
                                            max = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        } else if (i4 == 1895825408) {
                                            h = hac.h(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        } else {
                                            if (i4 != 1912602624) {
                                                rjb.h();
                                                return;
                                            }
                                            max = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        }
                                        i3 = (int) d;
                                    } else {
                                        i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                        i2 = byteBuffer.get() & 255;
                                    }
                                    i3 = i | i2;
                                } else {
                                    i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                    b = byteBuffer.get();
                                }
                                i3 = (int) f;
                            } else {
                                i3 = ((byteBuffer.get() & 255) - 128) << 24;
                            }
                            int i7 = (int) ((i3 * i6) / j);
                            if (i4 != 2) {
                                byteBuffer2.put((byte) (i7 >> 16));
                                byteBuffer2.put((byte) (i7 >> 24));
                            } else if (i4 == 3) {
                                byteBuffer2.put((byte) ((i7 >> 24) + 128));
                            } else if (i4 != 4) {
                                if (i4 == 21) {
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 22) {
                                    byteBuffer2.put((byte) i7);
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 24));
                                } else if (i4 == 268435456) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                } else if (i4 == 1342177280) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                } else if (i4 == 1610612736) {
                                    byteBuffer2.put((byte) (i7 >> 24));
                                    byteBuffer2.put((byte) (i7 >> 16));
                                    byteBuffer2.put((byte) (i7 >> 8));
                                    byteBuffer2.put((byte) i7);
                                } else if (i4 != 1879048192) {
                                    if (i4 == 1895825408) {
                                        byteBuffer2.putInt(Integer.reverseBytes(Float.floatToIntBits(i7 < 0 ? (-i7) / (-2.1474836E9f) : i7 / 2.1474836E9f)));
                                    } else {
                                        if (i4 != 1912602624) {
                                            rjb.h();
                                            return;
                                        }
                                        byteBuffer2.putLong(Long.reverseBytes(Double.doubleToLongBits(i7 < 0 ? (-i7) / (-2.147483648E9d) : i7 / 2.147483647E9d)));
                                    }
                                } else if (i7 < 0) {
                                    byteBuffer2.putDouble((-i7) / (-2.147483648E9d));
                                } else {
                                    byteBuffer2.putDouble(i7 / 2.147483647E9d);
                                }
                            } else if (i7 < 0) {
                                byteBuffer2.putFloat((-i7) / (-2.1474836E9f));
                            } else {
                                byteBuffer2.putFloat(i7 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + i5) {
                                i6++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        int i72 = (int) ((i3 * i6) / j);
                        if (i4 != 2) {
                        }
                        if (byteBuffer.position() != position + i5) {
                        }
                    }
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                    this.N = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.N = byteBuffer2;
        }
    }

    public final void C(ce8 ce8Var) {
        if (E()) {
            this.x = ce8Var;
            x();
            return;
        }
        ce8 ce8Var2 = new ce8(hac.h(ce8Var.a, 0.1f, 8.0f), hac.h(ce8Var.b, 0.1f, 8.0f));
        this.x = ce8Var2;
        bb3 bb3Var = new bb3(ce8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = bb3Var;
        } else {
            this.w = bb3Var;
        }
    }

    public final void D(long j) {
        long j2;
        ki2 ki2Var = this.p;
        this.q = (k30) ki2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((bqb) ki2Var.g) != bqb.a && ki2Var.h != null) {
                ypb ypbVar = new ypb();
                ki2 ki2Var2 = this.p;
                ((bqb) ki2Var2.g).g(ki2Var2.h, ypbVar);
                j2 += ypbVar.e;
            }
        }
        k30 k30Var = this.q;
        m30 m30Var = new m30();
        ki2 ki2Var3 = this.p;
        m30Var.b = (bqb) ki2Var3.g;
        m30Var.c = ki2Var3.h;
        m30Var.a = j2;
        n30 a = m30Var.a();
        y79 y79Var = k30Var.a;
        ArrayList arrayList = k30Var.b;
        arrayList.clear();
        k30Var.d = false;
        for (int i = 0; i < y79Var.d; i++) {
            p30 p30Var = (p30) y79Var.get(i);
            p30Var.c(a);
            if (p30Var.isActive()) {
                m30 m30Var2 = new m30();
                long j3 = a.a;
                m30Var2.a = j3;
                m30Var2.b = a.b;
                m30Var2.c = a.c;
                m30Var2.a = p30Var.g(j3);
                a = m30Var2.a();
                arrayList.add(p30Var);
            }
        }
        k30Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= k30Var.a(); i2++) {
            k30Var.c[i2] = ((p30) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        ki2 ki2Var = this.p;
        return ki2Var != null && ((r10) ki2Var.e).j;
    }

    public final void a(long j) {
        ce8 ce8Var;
        boolean E = E();
        boolean z = false;
        mx6 mx6Var = this.b;
        if (E) {
            ce8Var = ce8.d;
        } else {
            if (this.Y || !this.p.d()) {
                ce8Var = ce8.d;
            } else {
                int i = ((go4) this.p.c).Q;
                ce8Var = this.x;
                nma nmaVar = (nma) mx6Var.d;
                float f = ce8Var.a;
                jte.f(f > 0.0f);
                if (nmaVar.b != f) {
                    nmaVar.b = f;
                    nmaVar.h = true;
                }
                float f2 = ce8Var.b;
                jte.f(f2 > 0.0f);
                if (nmaVar.c != f2) {
                    nmaVar.c = f2;
                    nmaVar.h = true;
                }
            }
            this.x = ce8Var;
        }
        ce8 ce8Var2 = ce8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((go4) this.p.c).Q;
            z = this.y;
            ((nja) mx6Var.c).j = z;
        }
        this.y = z;
        this.h.add(new bb3(ce8Var2, Math.max(0L, j), hac.Z(((r10) this.p.e).b, l())));
        D(j);
        u40 u40Var = this.n;
        if (u40Var != null) {
            u40Var.f(this.y);
        }
    }

    public final j50 b(r10 r10Var) {
        try {
            return ((l50) this.r).a(r10Var);
        } catch (p10 e) {
            t40 t40Var = new t40(r10Var.b, r10Var.c, r10Var.a, r10Var.f, (go4) this.p.c, r10Var.e, e);
            u40 u40Var = this.n;
            if (u40Var == null) {
                throw t40Var;
            }
            u40Var.f0(t40Var);
            throw t40Var;
        }
    }

    public final void c(r40 r40Var) {
        int i;
        k30 k30Var;
        go4 go4Var;
        int i2;
        if (this.s == null && this.a != null) {
            za3 za3Var = new za3(this);
            this.s = za3Var;
            l50 l50Var = (l50) this.r;
            l50Var.f();
            a86 a86Var = l50Var.e;
            if (a86Var == null) {
                a86Var = new a86(Thread.currentThread());
                l50Var.e = a86Var;
            }
            a86Var.a(za3Var);
        }
        go4 go4Var2 = r40Var.a;
        String str = go4Var2.t;
        int i3 = go4Var2.N;
        int i4 = go4Var2.Q;
        if ("audio/raw".equals(str)) {
            jte.f(hac.N(i4));
            int u = hac.u(i4) * i3;
            jo5 jo5Var = new jo5(4);
            jo5Var.d(this.g);
            jo5Var.c(this.e);
            p30[] p30VarArr = (p30[]) this.b.b;
            int length = p30VarArr.length;
            ase.a(length, p30VarArr);
            jo5Var.e(length);
            System.arraycopy(p30VarArr, 0, jo5Var.a, jo5Var.b, length);
            jo5Var.b += length;
            k30 k30Var2 = new k30(jo5Var.f());
            if (k30Var2.equals(this.q)) {
                k30Var2 = this.q;
            }
            int i5 = go4Var2.R;
            int i6 = go4Var2.S;
            e4c e4cVar = this.d;
            e4cVar.i = i5;
            e4cVar.j = i6;
            this.c.i = r40Var.b;
            l30 l30Var = new l30(go4Var2.P, i3, i4);
            try {
                y79 y79Var = k30Var2.a;
                if (l30Var.equals(l30.e)) {
                    throw new o30(l30Var);
                }
                for (int i7 = 0; i7 < y79Var.d; i7++) {
                    p30 p30Var = (p30) y79Var.get(i7);
                    l30 e = p30Var.e(l30Var);
                    if (p30Var.isActive()) {
                        jte.p(!e.equals(l30.e));
                        l30Var = e;
                    }
                }
                int i8 = l30Var.b;
                int i9 = l30Var.c;
                fo4 a = go4Var2.a();
                a.P = i9;
                a.O = l30Var.a;
                a.M = i8;
                a.N = i8 == i3 ? go4Var2.O : -1;
                go4 go4Var3 = new go4(a);
                i = u;
                k30Var = k30Var2;
                i2 = hac.u(i9) * i8;
                go4Var = go4Var3;
            } catch (o30 e2) {
                throw new s40(e2, go4Var2);
            }
        } else {
            ko5 ko5Var = mo5.b;
            i = -1;
            k30Var = new k30(y79.e);
            go4Var = go4Var2;
            i2 = -1;
        }
        n10 i10 = i(go4Var);
        go4 go4Var4 = (go4) i10.a;
        try {
            r10 c = ((l50) this.r).c(i10);
            boolean z = c.e;
            if (c.a == 0) {
                throw new s40("Invalid output encoding (isOffload=" + z + ")", go4Var4);
            }
            if (c.c == 0) {
                throw new s40("Invalid output channel config (isOffload=" + z + ")", go4Var4);
            }
            this.a0 = false;
            bqb bqbVar = r40Var.c;
            rz6 rz6Var = r40Var.d;
            ki2 ki2Var = new ki2(go4Var2, go4Var, i, i2, c, k30Var, bqbVar, rz6Var != null ? rz6Var.a : null);
            if (p()) {
                this.o = ki2Var;
            } else {
                this.p = ki2Var;
            }
        } catch (m10 e3) {
            throw new s40(e3, go4Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        u40 u40Var;
        u40 u40Var2;
        boolean z;
        sz0 sz0Var = this.l;
        if (this.N == null) {
            return;
        }
        if (((Exception) sz0Var.c) != null) {
            ((l50) ((cb3) sz0Var.d).r).getClass();
            synchronized (j50.s) {
                z = j50.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < sz0Var.b) {
                return;
            }
        }
        int remaining = this.N.remaining();
        try {
            boolean g = this.t.g(j, this.M, this.N);
            this.Z = SystemClock.elapsedRealtime();
            sz0Var.c = null;
            sz0Var.a = -9223372036854775807L;
            sz0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.b0 = false;
                }
                if (this.R && (u40Var2 = this.n) != null && !g && !this.b0) {
                    u40Var2.C();
                }
            }
            int remaining2 = remaining - this.N.remaining();
            if (this.p.d()) {
                this.B += remaining2;
            }
            ki2 ki2Var = this.p;
            if (g) {
                if (!ki2Var.d()) {
                    jte.p(this.N == this.L);
                    this.C = ((this.D * this.M) - this.F) + this.C;
                    this.F = 0L;
                }
                this.N = null;
                return;
            }
            if (ki2Var.d() || remaining2 <= 0) {
                return;
            }
            jte.p(this.E > 0);
            long b0 = hac.b0(this.E - this.N.remaining(), this.M * this.D, this.E, RoundingMode.CEILING);
            this.C += b0 - this.F;
            this.F = b0;
        } catch (l10 e) {
            boolean z2 = e.b;
            if (z2) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((r10) this.p.e).e) {
                            this.a0 = true;
                        }
                    }
                }
                w40 w40Var = new w40(e.a, (go4) this.p.c, r2);
                u40Var = this.n;
                if (u40Var != null) {
                    u40Var.f0(w40Var);
                }
                if (!z2) {
                    throw w40Var;
                }
                sz0Var.a(w40Var);
                return;
            }
            r2 = false;
            w40 w40Var2 = new w40(e.a, (go4) this.p.c, r2);
            u40Var = this.n;
            if (u40Var != null) {
            }
            if (!z2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        ByteBuffer byteBuffer;
        if (!this.q.c()) {
            d(Long.MIN_VALUE);
            return this.N == null;
        }
        k30 k30Var = this.q;
        if (k30Var.c() && !k30Var.d) {
            k30Var.d = true;
            ((p30) k30Var.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.b() || ((byteBuffer = this.N) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        e50 e50Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new bb3(this.x, 0L, 0L);
            this.I = 0L;
            this.v = null;
            this.h.clear();
            this.L = null;
            this.M = 0;
            this.N = null;
            this.P = false;
            this.O = false;
            this.Q = false;
            this.d.o = 0L;
            D(-9223372036854775807L);
            this.j = null;
            ki2 ki2Var = this.o;
            if (ki2Var != null) {
                this.p = ki2Var;
                this.o = null;
            }
            j50 j50Var = this.t;
            if (j50Var.e.d.getPlayState() == 3) {
                j50Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && j50Var.c()) {
                i50 i50Var = j50Var.h;
                i50Var.getClass();
                i50Var.a();
            }
            if (i >= 24 && (e50Var = j50Var.d) != null) {
                e50Var.b();
                j50Var.d = null;
            }
            AudioTrack audioTrack = j50Var.a;
            a86 a86Var = j50Var.i;
            Handler q = hac.q(null);
            synchronized (j50.s) {
                ScheduledExecutorService scheduledExecutorService = j50.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new y30((byte) 9));
                    j50.t = scheduledExecutorService;
                }
                j50.u++;
                scheduledExecutorService.schedule(new op6((Object) audioTrack, (Object) q, (Object) a86Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        sz0 sz0Var = this.l;
        sz0Var.c = null;
        sz0Var.a = -9223372036854775807L;
        sz0Var.b = -9223372036854775807L;
        sz0 sz0Var2 = this.k;
        sz0Var2.c = null;
        sz0Var2.a = -9223372036854775807L;
        sz0Var2.b = -9223372036854775807L;
        this.c0 = 0L;
        this.d0 = 0L;
        Handler handler = this.e0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        if (!p()) {
            return -9223372036854775807L;
        }
        if (this.p.d()) {
            return hac.Z(((r10) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = zhe.b(((r10) this.p.e).a);
        jte.p(b != -2147483647);
        return hac.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        if (!p() || this.H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), hac.Z(((r10) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((bb3) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (bb3) arrayDeque.remove();
        }
        bb3 bb3Var = this.w;
        long j2 = min - bb3Var.c;
        long D = hac.D(j2, bb3Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        mx6 mx6Var = this.b;
        if (isEmpty) {
            nma nmaVar = (nma) mx6Var.d;
            if (nmaVar.isActive()) {
                if (nmaVar.m >= 1024) {
                    long j3 = nmaVar.l;
                    nmaVar.i.getClass();
                    long o = j3 - (r8.i.o() * (r8.j * r8.b));
                    int i = nmaVar.g.a;
                    int i2 = nmaVar.f.a;
                    long j4 = nmaVar.m;
                    j2 = i == i2 ? hac.b0(j2, o, j4, RoundingMode.DOWN) : hac.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (nmaVar.b * j2);
                }
            }
            bb3 bb3Var2 = this.w;
            j = bb3Var2.b + j2;
            bb3Var2.d = j2 - D;
        } else {
            bb3 bb3Var3 = this.w;
            j = bb3Var3.b + D + bb3Var3.d;
        }
        long j5 = ((nja) mx6Var.c).l;
        long Z = hac.Z(((r10) this.p.e).b, j5) + j;
        long j6 = this.c0;
        if (j5 > j6) {
            long Z2 = hac.Z(((r10) this.p.e).b, j5 - j6);
            this.c0 = j5;
            this.d0 += Z2;
            Handler handler = this.e0;
            if (handler == null) {
                handler = new Handler(Looper.myLooper());
                this.e0 = handler;
            }
            handler.removeCallbacksAndMessages(null);
            this.e0.postDelayed(new xf2(this, (byte) 24), 100L);
        }
        return Z;
    }

    public final n10 i(go4 go4Var) {
        n10 n10Var = new n10();
        n10Var.a = go4Var;
        n10Var.b = o00.i;
        n10Var.e = 0;
        n10Var.f = -1;
        n10Var.b = this.u;
        n10Var.d = this.i != 0;
        n10Var.c = this.W;
        n10Var.e = this.T;
        n10Var.g = this.Y;
        n10Var.f = this.X;
        n10 n10Var2 = new n10();
        n10Var2.a = (go4) n10Var.a;
        n10Var2.b = (o00) n10Var.b;
        n10Var2.c = (AudioDeviceInfo) n10Var.c;
        n10Var2.d = n10Var.d;
        n10Var2.e = n10Var.e;
        n10Var2.f = n10Var.f;
        n10Var2.g = n10Var.g;
        return n10Var2;
    }

    public final int j(go4 go4Var) {
        boolean z;
        if (!hac.N(go4Var.Q) || go4Var.Q == 2) {
            z = false;
        } else {
            fo4 a = go4Var.a();
            a.P = 2;
            go4Var = new go4(a);
            z = true;
        }
        byte b = ((l50) this.r).b(i(go4Var)).d;
        if (b != 1) {
            if (b != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long l() {
        if (!this.p.d()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (r5 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x008c, code lost:
    
        if (o() == false) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(long j, int i, ByteBuffer byteBuffer) {
        long j2;
        ByteBuffer byteBuffer2 = this.L;
        jte.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    r10 r10Var = (r10) this.p.e;
                    i((go4) this.o.d);
                    if (!((r10) this.o.e).equals(r10Var)) {
                        s();
                        if (!n()) {
                            f();
                            a(j);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                j50 j50Var = this.t;
                if (j50Var != null && j50Var.c() && ((r10) this.p.e).k) {
                    this.t.e();
                    j50 j50Var2 = this.t;
                    go4 go4Var = (go4) this.p.c;
                    j50Var2.d(go4Var.R, go4Var.S);
                    this.b0 = true;
                }
                a(j);
            }
            return false;
        }
        boolean p = p();
        sz0 sz0Var = this.k;
        if (!p) {
            try {
            } catch (t40 e) {
                if (e.a) {
                    throw e;
                }
                sz0Var.a(e);
                return false;
            }
        }
        sz0Var.c = null;
        sz0Var.a = -9223372036854775807L;
        sz0Var.b = -9223372036854775807L;
        if (this.H) {
            this.I = Math.max(0L, j);
            this.G = false;
            this.H = false;
            if (E()) {
                x();
            }
            a(j);
            if (this.R) {
                r();
            }
        }
        if (this.L == null) {
            jte.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.p.d() && this.D == 0) {
                    int k = k(((r10) this.p.e).a, byteBuffer);
                    this.D = k;
                }
                if (this.v != null) {
                    if (e()) {
                        a(j);
                        this.v = null;
                    }
                    return false;
                }
                long j3 = this.I;
                ki2 ki2Var = this.p;
                j2 = -9223372036854775807L;
                long Z = hac.Z(((go4) ki2Var.c).P, (ki2Var.d() ? this.z / this.p.a : this.A) - this.d.o) + j3;
                if (!this.G && Math.abs(Z - j) > 200000) {
                    u40 u40Var = this.n;
                    if (u40Var != null) {
                        StringBuilder o = wi8.o(Z, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        o.append(j);
                        u40Var.f0(new v40(o.toString()));
                    }
                    this.G = true;
                }
                if (this.G) {
                    if (e()) {
                        long j4 = j - Z;
                        this.I += j4;
                        this.G = false;
                        a(j);
                        u40 u40Var2 = this.n;
                        if (u40Var2 != null && j4 != 0) {
                            u40Var2.i0();
                        }
                    }
                    return false;
                }
                if (this.p.d()) {
                    this.z += byteBuffer.remaining();
                } else {
                    this.A = (this.D * i) + this.A;
                }
                this.L = byteBuffer;
                this.M = i;
                this.E = byteBuffer.remaining();
                this.F = 0L;
            }
            return true;
        }
        j2 = -9223372036854775807L;
        u(j);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        j50 j50Var3 = this.t;
        m50 m50Var = j50Var3.e;
        long b = j50Var3.b();
        if (m50Var.v != j2 && b > 0) {
            m50Var.b.getClass();
            if (SystemClock.elapsedRealtime() - m50Var.v >= 200) {
                ncd.f("DefaultAudioSink", "Resetting stalled audio output");
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
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.Q) {
            return false;
        }
        long l = l();
        long a = this.t.a();
        j50 j50Var = this.t;
        j50Var.getClass();
        return l > hac.b0(a, (long) j50Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        int b;
        j50 j50Var;
        boolean z;
        sz0 sz0Var = this.k;
        if (((Exception) sz0Var.c) != null) {
            ((l50) ((cb3) sz0Var.d).r).getClass();
            synchronized (j50.s) {
                z = j50.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < sz0Var.b) {
                return false;
            }
        }
        try {
            j50Var = b((r10) this.p.e);
        } catch (t40 e) {
            r10 r10Var = (r10) this.p.e;
            int i = r10Var.f;
            boolean N = hac.N(r10Var.a);
            ki2 ki2Var = this.p;
            if (N) {
                b = ((r10) ki2Var.e).b * ki2Var.b;
            } else {
                int i2 = ((go4) ki2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = zhe.b(((r10) ki2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            r10 r10Var2 = (r10) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(r10Var2.b, r10Var2.c, r10Var2.a));
            int i3 = this.p.b;
            if (i3 == -1) {
                i3 = 1;
            }
            while (i > max) {
                i = Math.max(max, i / 2);
                int i4 = i % i3;
                if (i4 != 0) {
                    i = (i3 - i4) + i;
                }
                q10 a = ((r10) this.p.e).a();
                a.f = i;
                r10 r10Var3 = new r10(a);
                try {
                    j50 b2 = b(r10Var3);
                    this.p = this.p.c(r10Var3);
                    j50Var = b2;
                } catch (t40 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (!((r10) this.p.e).e) {
                throw e;
            }
            this.a0 = true;
            throw e;
        }
        this.t = j50Var;
        ab3 ab3Var = new ab3(this, (r10) this.p.e);
        this.j = ab3Var;
        j50Var.i.a(ab3Var);
        if (this.t.c()) {
            ki2 ki2Var2 = this.p;
            if (((r10) ki2Var2.e).k) {
                j50 j50Var2 = this.t;
                go4 go4Var = (go4) ki2Var2.c;
                j50Var2.d(go4Var.R, go4Var.S);
            }
        }
        we8 we8Var = this.m;
        if (we8Var != null) {
            this.t.f(we8Var);
        }
        if (p()) {
            this.t.a.setVolume(this.K);
        }
        this.V.getClass();
        AudioDeviceInfo audioDeviceInfo = this.W;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.H = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z2 = audioSessionId != this.T;
        this.T = audioSessionId;
        u40 u40Var = this.n;
        if (u40Var != null) {
            Object obj = this.p.e;
            u40Var.L(new nf5((byte) 14));
            if (z2) {
                this.U = true;
                ki2 ki2Var3 = this.p;
                q10 a2 = ((r10) ki2Var3.e).a();
                a2.h = this.T;
                this.p = ki2Var3.c(new r10(a2));
                ki2 ki2Var4 = this.o;
                if (ki2Var4 != null) {
                    q10 a3 = ((r10) ki2Var4.e).a();
                    a3.h = this.T;
                    this.o = ki2Var4.c(new r10(a3));
                }
                this.n.b(this.T);
            }
        }
        return true;
    }

    public final boolean p() {
        return this.t != null;
    }

    public final void q() {
        this.R = false;
        if (p()) {
            j50 j50Var = this.t;
            m50 m50Var = j50Var.e;
            m50Var.e();
            if (m50Var.u == -9223372036854775807L) {
                m50Var.h.a(0);
            }
            m50Var.w = m50Var.a();
            if (!j50Var.j || j50Var.c()) {
                j50Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            j50 j50Var = this.t;
            m50 m50Var = j50Var.e;
            if (m50Var.u != -9223372036854775807L) {
                m50Var.b.getClass();
                m50Var.u = hac.T(SystemClock.elapsedRealtime());
            }
            m50Var.j = hac.Z(m50Var.e, m50Var.a());
            m50Var.h.a(0);
            if (!j50Var.j || j50Var.c()) {
                j50Var.a.play();
            }
        }
    }

    public final void s() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (this.t.c()) {
            this.Q = false;
        }
        j50 j50Var = this.t;
        if (j50Var.j) {
            return;
        }
        j50Var.j = true;
        m50 m50Var = j50Var.e;
        long b = j50Var.b();
        m50Var.w = m50Var.a();
        m50Var.b.getClass();
        m50Var.u = hac.T(SystemClock.elapsedRealtime());
        m50Var.x = b;
        j50Var.a.stop();
        j50Var.o = 0;
    }

    public final void t() {
        if (!this.O && p() && e()) {
            s();
            this.O = true;
        }
    }

    public final void u(long j) {
        ByteBuffer byteBuffer;
        d(j);
        if (this.N == null) {
            if (!this.q.c()) {
                ByteBuffer byteBuffer2 = this.L;
                if (byteBuffer2 != null) {
                    B(byteBuffer2);
                    d(j);
                    return;
                }
                return;
            }
            while (!this.q.b()) {
                do {
                    k30 k30Var = this.q;
                    if (k30Var.c()) {
                        ByteBuffer byteBuffer3 = k30Var.c[k30Var.a()];
                        if (byteBuffer3.hasRemaining()) {
                            byteBuffer = byteBuffer3;
                        } else {
                            k30Var.d(p30.a);
                            byteBuffer = k30Var.c[k30Var.a()];
                        }
                    } else {
                        byteBuffer = p30.a;
                    }
                    if (byteBuffer.hasRemaining()) {
                        B(byteBuffer);
                        d(j);
                    } else {
                        ByteBuffer byteBuffer4 = this.L;
                        if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                            return;
                        }
                        k30 k30Var2 = this.q;
                        ByteBuffer byteBuffer5 = this.L;
                        if (k30Var2.c() && !k30Var2.d) {
                            k30Var2.d(byteBuffer5);
                        }
                    }
                } while (this.N == null);
                return;
            }
        }
    }

    public final void v() {
        ki2 ki2Var = this.p;
        if (ki2Var != null) {
            ki2 ki2Var2 = this.o;
            if (ki2Var2 != null) {
                this.p = ki2Var2;
                this.o = null;
                ki2Var = ki2Var2;
            }
            try {
                this.p = this.p.c(((l50) this.r).c(i((go4) ki2Var.d)));
            } catch (m10 e) {
                dq9.o(new s40(e, (go4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        ko5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((p30) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        k30 k30Var = this.q;
        if (k30Var != null) {
            y79 y79Var = k30Var.a;
            for (int i = 0; i < y79Var.d; i++) {
                p30 p30Var = (p30) y79Var.get(i);
                p30Var.c(n30.d);
                p30Var.reset();
            }
            k30Var.b.clear();
            k30Var.c = new ByteBuffer[0];
            l30 l30Var = l30.e;
            k30Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            j50 j50Var = this.t;
            ce8 ce8Var = this.x;
            AudioTrack audioTrack = j50Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(hac.h(ce8Var.a, 0.1f, 8.0f)).setPitch(hac.h(ce8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                ncd.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            m50 m50Var = j50Var.e;
            m50Var.i = audioTrack.getPlaybackParams().getSpeed();
            m50Var.h.a(0);
            m50Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new ce8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(s10 s10Var) {
        if (s10Var.equals(this.r)) {
            return;
        }
        ((l50) this.r).d();
        this.r = s10Var;
        za3 za3Var = this.s;
        if (za3Var != null) {
            l50 l50Var = (l50) s10Var;
            l50Var.f();
            a86 a86Var = l50Var.e;
            if (a86Var == null) {
                a86Var = new a86(Thread.currentThread());
                l50Var.e = a86Var;
            }
            a86Var.a(za3Var);
        }
        v();
    }

    public final void z(int i) {
        if (this.U) {
            if (this.T != i) {
                return;
            } else {
                this.U = false;
            }
        }
        if (this.T != i) {
            this.T = i;
            this.S = i != 0;
            v();
        }
    }
}
