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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ja3 implements y30 {
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
    public va0 V;
    public AudioDeviceInfo W;
    public int X;
    public boolean Y;
    public long Z;
    public final Context a;
    public boolean a0;
    public final rx6 b;
    public boolean b0;
    public final ki1 c;
    public long c0;
    public final e6c d;
    public long d0;
    public final btb e;
    public Handler e0;
    public final btb f;
    public final j99 g;
    public final ArrayDeque h;
    public byte i;
    public ha3 j;
    public final ty0 k;
    public final ty0 l;
    public ig8 m;
    public v30 n;
    public oh2 o;
    public oh2 p;
    public l20 q;
    public t00 r;
    public ga3 s;
    public l40 t;
    public oz u;
    public ia3 v;
    public ia3 w;
    public of8 x;
    public boolean y;
    public long z;

    public ja3(d30 d30Var) {
        int deviceId;
        Context context = (Context) d30Var.b;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = oz.i;
        this.b = (rx6) d30Var.d;
        this.i = (byte) 0;
        this.r = (n40) d30Var.f;
        ki1 ki1Var = new ki1();
        this.c = ki1Var;
        e6c e6cVar = new e6c();
        e6cVar.m = gcc.b;
        this.d = e6cVar;
        this.e = new btb((byte) 1);
        this.f = new btb((byte) 0);
        this.g = po5.v(e6cVar, ki1Var);
        this.K = 1.0f;
        this.T = 0;
        this.V = new va0();
        of8 of8Var = of8.d;
        this.w = new ia3(of8Var, 0L, 0L);
        this.x = of8Var;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new ty0(this);
        this.l = new ty0(this);
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
            return (int) ((zue.b(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
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
                    String str = gcc.a;
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
                                        iy8.d();
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
                            iy8.d();
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
                                    String str2 = gcc.a;
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
                            return ok7.e(new zd1(16, bArr)).c;
                        case 18:
                            break;
                        default:
                            grb.i(uh9.k(i, "Unexpected audio encoding: "));
                            return 0;
                    }
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return ud3.b[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] << 8;
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

    public final void A(va0 va0Var) {
        if (this.V.equals(va0Var)) {
            return;
        }
        va0Var.getClass();
        if (this.t != null) {
            this.V.getClass();
        }
        this.V = va0Var;
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
        yve.p(this.N == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.d()) {
                int b0 = (int) gcc.b0(gcc.T(20L), ((s00) this.p.e).b, 1000000L, RoundingMode.UP);
                long l = l();
                long j = b0;
                if (l < j) {
                    oh2 oh2Var = this.p;
                    int i4 = ((s00) oh2Var.e).a;
                    int i5 = oh2Var.b;
                    int i6 = (int) l;
                    byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i6 < b0) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    h = gcc.h(byteBuffer.getFloat(), -1.0f, 1.0f);
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
                                            h = gcc.h(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        } else {
                                            if (i4 != 1912602624) {
                                                grb.g();
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
                                            grb.g();
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

    public final void C(of8 of8Var) {
        if (E()) {
            this.x = of8Var;
            x();
            return;
        }
        of8 of8Var2 = new of8(gcc.h(of8Var.a, 0.1f, 8.0f), gcc.h(of8Var.b, 0.1f, 8.0f));
        this.x = of8Var2;
        ia3 ia3Var = new ia3(of8Var2, -9223372036854775807L, -9223372036854775807L);
        if (p()) {
            this.v = ia3Var;
        } else {
            this.w = ia3Var;
        }
    }

    public final void D(long j) {
        long j2;
        oh2 oh2Var = this.p;
        this.q = (l20) oh2Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.J;
            if (((asb) oh2Var.g) != asb.a && oh2Var.h != null) {
                xrb xrbVar = new xrb();
                oh2 oh2Var2 = this.p;
                ((asb) oh2Var2.g).g(oh2Var2.h, xrbVar);
                j2 += xrbVar.e;
            }
        }
        l20 l20Var = this.q;
        n20 n20Var = new n20();
        oh2 oh2Var3 = this.p;
        n20Var.b = (asb) oh2Var3.g;
        n20Var.c = oh2Var3.h;
        n20Var.a = j2;
        o20 a = n20Var.a();
        j99 j99Var = l20Var.a;
        ArrayList arrayList = l20Var.b;
        arrayList.clear();
        l20Var.d = false;
        for (int i = 0; i < j99Var.d; i++) {
            q20 q20Var = (q20) j99Var.get(i);
            q20Var.c(a);
            if (q20Var.isActive()) {
                n20 n20Var2 = new n20();
                long j3 = a.a;
                n20Var2.a = j3;
                n20Var2.b = a.b;
                n20Var2.c = a.c;
                n20Var2.a = q20Var.g(j3);
                a = n20Var2.a();
                arrayList.add(q20Var);
            }
        }
        l20Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= l20Var.a(); i2++) {
            l20Var.c[i2] = ((q20) arrayList.get(i2)).b();
        }
    }

    public final boolean E() {
        oh2 oh2Var = this.p;
        return oh2Var != null && ((s00) oh2Var.e).j;
    }

    public final void a(long j) {
        of8 of8Var;
        boolean E = E();
        boolean z = false;
        rx6 rx6Var = this.b;
        if (E) {
            of8Var = of8.d;
        } else {
            if (this.Y || !this.p.d()) {
                of8Var = of8.d;
            } else {
                int i = ((ko4) this.p.c).Q;
                of8Var = this.x;
                goa goaVar = (goa) rx6Var.d;
                float f = of8Var.a;
                yve.f(f > 0.0f);
                if (goaVar.b != f) {
                    goaVar.b = f;
                    goaVar.h = true;
                }
                float f2 = of8Var.b;
                yve.f(f2 > 0.0f);
                if (goaVar.c != f2) {
                    goaVar.c = f2;
                    goaVar.h = true;
                }
            }
            this.x = of8Var;
        }
        of8 of8Var2 = of8Var;
        if (!this.Y && this.p.d()) {
            int i2 = ((ko4) this.p.c).Q;
            z = this.y;
            ((ela) rx6Var.c).j = z;
        }
        this.y = z;
        this.h.add(new ia3(of8Var2, Math.max(0L, j), gcc.Z(((s00) this.p.e).b, l())));
        D(j);
        v30 v30Var = this.n;
        if (v30Var != null) {
            v30Var.h(this.y);
        }
    }

    public final l40 b(s00 s00Var) {
        try {
            return ((n40) this.r).a(s00Var);
        } catch (q00 e) {
            u30 u30Var = new u30(s00Var.b, s00Var.c, s00Var.a, s00Var.f, (ko4) this.p.c, s00Var.e, e);
            v30 v30Var = this.n;
            if (v30Var == null) {
                throw u30Var;
            }
            v30Var.h0(u30Var);
            throw u30Var;
        }
    }

    public final void c(s30 s30Var) {
        int i;
        l20 l20Var;
        ko4 ko4Var;
        int i2;
        if (this.s == null && this.a != null) {
            ga3 ga3Var = new ga3(this);
            this.s = ga3Var;
            n40 n40Var = (n40) this.r;
            n40Var.f();
            e86 e86Var = n40Var.e;
            if (e86Var == null) {
                e86Var = new e86(Thread.currentThread());
                n40Var.e = e86Var;
            }
            e86Var.a(ga3Var);
        }
        ko4 ko4Var2 = s30Var.a;
        String str = ko4Var2.t;
        int i3 = ko4Var2.N;
        int i4 = ko4Var2.Q;
        if ("audio/raw".equals(str)) {
            yve.f(gcc.N(i4));
            int u = gcc.u(i4) * i3;
            mo5 mo5Var = new mo5(4);
            mo5Var.d(this.g);
            mo5Var.c(this.e);
            q20[] q20VarArr = (q20[]) this.b.b;
            int length = q20VarArr.length;
            rue.a(length, q20VarArr);
            mo5Var.e(length);
            System.arraycopy(q20VarArr, 0, mo5Var.a, mo5Var.b, length);
            mo5Var.b += length;
            l20 l20Var2 = new l20(mo5Var.f());
            if (l20Var2.equals(this.q)) {
                l20Var2 = this.q;
            }
            int i5 = ko4Var2.R;
            int i6 = ko4Var2.S;
            e6c e6cVar = this.d;
            e6cVar.i = i5;
            e6cVar.j = i6;
            this.c.i = s30Var.b;
            m20 m20Var = new m20(ko4Var2.P, i3, i4);
            try {
                j99 j99Var = l20Var2.a;
                if (m20Var.equals(m20.e)) {
                    throw new p20(m20Var);
                }
                for (int i7 = 0; i7 < j99Var.d; i7++) {
                    q20 q20Var = (q20) j99Var.get(i7);
                    m20 e = q20Var.e(m20Var);
                    if (q20Var.isActive()) {
                        yve.p(!e.equals(m20.e));
                        m20Var = e;
                    }
                }
                int i8 = m20Var.b;
                int i9 = m20Var.c;
                jo4 a = ko4Var2.a();
                a.P = i9;
                a.O = m20Var.a;
                a.M = i8;
                a.N = i8 == i3 ? ko4Var2.O : -1;
                ko4 ko4Var3 = new ko4(a);
                i = u;
                l20Var = l20Var2;
                i2 = gcc.u(i9) * i8;
                ko4Var = ko4Var3;
            } catch (p20 e2) {
                throw new t30(e2, ko4Var2);
            }
        } else {
            no5 no5Var = po5.b;
            i = -1;
            l20Var = new l20(j99.e);
            ko4Var = ko4Var2;
            i2 = -1;
        }
        o00 i10 = i(ko4Var);
        ko4 ko4Var4 = (ko4) i10.a;
        try {
            s00 c = ((n40) this.r).c(i10);
            boolean z = c.e;
            if (c.a == 0) {
                throw new t30("Invalid output encoding (isOffload=" + z + ")", ko4Var4);
            }
            if (c.c == 0) {
                throw new t30("Invalid output channel config (isOffload=" + z + ")", ko4Var4);
            }
            this.a0 = false;
            asb asbVar = s30Var.c;
            vz6 vz6Var = s30Var.d;
            oh2 oh2Var = new oh2(ko4Var2, ko4Var, i, i2, c, l20Var, asbVar, vz6Var != null ? vz6Var.a : null);
            if (p()) {
                this.o = oh2Var;
            } else {
                this.p = oh2Var;
            }
        } catch (n00 e3) {
            throw new t30(e3, ko4Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
        v30 v30Var;
        v30 v30Var2;
        boolean z;
        ty0 ty0Var = this.l;
        if (this.N == null) {
            return;
        }
        if (((Exception) ty0Var.c) != null) {
            ((n40) ((ja3) ty0Var.d).r).getClass();
            synchronized (l40.s) {
                z = l40.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ty0Var.b) {
                return;
            }
        }
        int remaining = this.N.remaining();
        try {
            boolean g = this.t.g(j, this.M, this.N);
            this.Z = SystemClock.elapsedRealtime();
            ty0Var.c = null;
            ty0Var.a = -9223372036854775807L;
            ty0Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.b0 = false;
                }
                if (this.R && (v30Var2 = this.n) != null && !g && !this.b0) {
                    v30Var2.D();
                }
            }
            int remaining2 = remaining - this.N.remaining();
            if (this.p.d()) {
                this.B += remaining2;
            }
            oh2 oh2Var = this.p;
            if (g) {
                if (!oh2Var.d()) {
                    yve.p(this.N == this.L);
                    this.C = ((this.D * this.M) - this.F) + this.C;
                    this.F = 0L;
                }
                this.N = null;
                return;
            }
            if (oh2Var.d() || remaining2 <= 0) {
                return;
            }
            yve.p(this.E > 0);
            long b0 = gcc.b0(this.E - this.N.remaining(), this.M * this.D, this.E, RoundingMode.CEILING);
            this.C += b0 - this.F;
            this.F = b0;
        } catch (m00 e) {
            boolean z2 = e.b;
            if (z2) {
                if (l() <= 0) {
                    if (this.t.c()) {
                        if (((s00) this.p.e).e) {
                            this.a0 = true;
                        }
                    }
                }
                x30 x30Var = new x30(e.a, (ko4) this.p.c, r2);
                v30Var = this.n;
                if (v30Var != null) {
                    v30Var.h0(x30Var);
                }
                if (!z2) {
                    throw x30Var;
                }
                ty0Var.b(x30Var);
                return;
            }
            r2 = false;
            x30 x30Var2 = new x30(e.a, (ko4) this.p.c, r2);
            v30Var = this.n;
            if (v30Var != null) {
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
        l20 l20Var = this.q;
        if (l20Var.c() && !l20Var.d) {
            l20Var.d = true;
            ((q20) l20Var.b.get(0)).f();
        }
        u(Long.MIN_VALUE);
        if (!this.q.b() || ((byteBuffer = this.N) != null && byteBuffer.hasRemaining())) {
        }
    }

    public final void f() {
        g40 g40Var;
        if (p()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.b0 = false;
            this.D = 0;
            this.E = 0;
            this.F = 0L;
            this.w = new ia3(this.x, 0L, 0L);
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
            oh2 oh2Var = this.o;
            if (oh2Var != null) {
                this.p = oh2Var;
                this.o = null;
            }
            l40 l40Var = this.t;
            if (l40Var.e.d.getPlayState() == 3) {
                l40Var.a.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && l40Var.c()) {
                k40 k40Var = l40Var.h;
                k40Var.getClass();
                k40Var.a();
            }
            if (i >= 24 && (g40Var = l40Var.d) != null) {
                g40Var.b();
                l40Var.d = null;
            }
            AudioTrack audioTrack = l40Var.a;
            e86 e86Var = l40Var.i;
            Handler q = gcc.q(null);
            synchronized (l40.s) {
                ScheduledExecutorService scheduledExecutorService = l40.t;
                if (scheduledExecutorService == null) {
                    scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new y20((byte) 9));
                    l40.t = scheduledExecutorService;
                }
                l40.u++;
                scheduledExecutorService.schedule(new es6((Object) audioTrack, (Object) q, (Object) e86Var, (byte) 14), 20L, TimeUnit.MILLISECONDS);
            }
            this.t = null;
        }
        ty0 ty0Var = this.l;
        ty0Var.c = null;
        ty0Var.a = -9223372036854775807L;
        ty0Var.b = -9223372036854775807L;
        ty0 ty0Var2 = this.k;
        ty0Var2.c = null;
        ty0Var2.a = -9223372036854775807L;
        ty0Var2.b = -9223372036854775807L;
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
            return gcc.Z(((s00) this.p.e).b, this.t.a.getBufferSizeInFrames());
        }
        long bufferSizeInFrames = this.t.a.getBufferSizeInFrames();
        int b = pke.b(((s00) this.p.e).a);
        yve.p(b != -2147483647);
        return gcc.b0(bufferSizeInFrames, 1000000L, b, RoundingMode.DOWN);
    }

    public final long h() {
        ArrayDeque arrayDeque;
        long j;
        if (!p() || this.H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.t.a(), gcc.Z(((s00) this.p.e).b, l()));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || min < ((ia3) arrayDeque.getFirst()).c) {
                break;
            }
            this.w = (ia3) arrayDeque.remove();
        }
        ia3 ia3Var = this.w;
        long j2 = min - ia3Var.c;
        long D = gcc.D(j2, ia3Var.a.a);
        boolean isEmpty = arrayDeque.isEmpty();
        rx6 rx6Var = this.b;
        if (isEmpty) {
            goa goaVar = (goa) rx6Var.d;
            if (goaVar.isActive()) {
                if (goaVar.m >= 1024) {
                    long j3 = goaVar.l;
                    goaVar.i.getClass();
                    long o = j3 - (r8.i.o() * (r8.j * r8.b));
                    int i = goaVar.g.a;
                    int i2 = goaVar.f.a;
                    long j4 = goaVar.m;
                    j2 = i == i2 ? gcc.b0(j2, o, j4, RoundingMode.DOWN) : gcc.b0(j2, o * i, j4 * i2, RoundingMode.DOWN);
                } else {
                    j2 = (long) (goaVar.b * j2);
                }
            }
            ia3 ia3Var2 = this.w;
            j = ia3Var2.b + j2;
            ia3Var2.d = j2 - D;
        } else {
            ia3 ia3Var3 = this.w;
            j = ia3Var3.b + D + ia3Var3.d;
        }
        long j5 = ((ela) rx6Var.c).l;
        long Z = gcc.Z(((s00) this.p.e).b, j5) + j;
        long j6 = this.c0;
        if (j5 > j6) {
            long Z2 = gcc.Z(((s00) this.p.e).b, j5 - j6);
            this.c0 = j5;
            this.d0 += Z2;
            Handler handler = this.e0;
            if (handler == null) {
                handler = new Handler(Looper.myLooper());
                this.e0 = handler;
            }
            handler.removeCallbacksAndMessages(null);
            this.e0.postDelayed(new vd2(this, (byte) 25), 100L);
        }
        return Z;
    }

    public final o00 i(ko4 ko4Var) {
        o00 o00Var = new o00();
        o00Var.a = ko4Var;
        o00Var.b = oz.i;
        o00Var.e = 0;
        o00Var.f = -1;
        o00Var.b = this.u;
        o00Var.d = this.i != 0;
        o00Var.c = this.W;
        o00Var.e = this.T;
        o00Var.g = this.Y;
        o00Var.f = this.X;
        o00 o00Var2 = new o00();
        o00Var2.a = (ko4) o00Var.a;
        o00Var2.b = (oz) o00Var.b;
        o00Var2.c = (AudioDeviceInfo) o00Var.c;
        o00Var2.d = o00Var.d;
        o00Var2.e = o00Var.e;
        o00Var2.f = o00Var.f;
        o00Var2.g = o00Var.g;
        return o00Var2;
    }

    public final int j(ko4 ko4Var) {
        boolean z;
        if (!gcc.N(ko4Var.Q) || ko4Var.Q == 2) {
            z = false;
        } else {
            jo4 a = ko4Var.a();
            a.P = 2;
            ko4Var = new ko4(a);
            z = true;
        }
        byte b = ((n40) this.r).b(i(ko4Var)).d;
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
        yve.f(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (e()) {
                if (this.t != null) {
                    s00 s00Var = (s00) this.p.e;
                    i((ko4) this.o.d);
                    if (!((s00) this.o.e).equals(s00Var)) {
                        s();
                        if (!n()) {
                            f();
                            a(j);
                        }
                    }
                }
                this.p = this.o;
                this.o = null;
                l40 l40Var = this.t;
                if (l40Var != null && l40Var.c() && ((s00) this.p.e).k) {
                    this.t.e();
                    l40 l40Var2 = this.t;
                    ko4 ko4Var = (ko4) this.p.c;
                    l40Var2.d(ko4Var.R, ko4Var.S);
                    this.b0 = true;
                }
                a(j);
            }
            return false;
        }
        boolean p = p();
        ty0 ty0Var = this.k;
        if (!p) {
            try {
            } catch (u30 e) {
                if (e.a) {
                    throw e;
                }
                ty0Var.b(e);
                return false;
            }
        }
        ty0Var.c = null;
        ty0Var.a = -9223372036854775807L;
        ty0Var.b = -9223372036854775807L;
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
            yve.f(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.hasRemaining()) {
                if (!this.p.d() && this.D == 0) {
                    int k = k(((s00) this.p.e).a, byteBuffer);
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
                oh2 oh2Var = this.p;
                j2 = -9223372036854775807L;
                long Z = gcc.Z(((ko4) oh2Var.c).P, (oh2Var.d() ? this.z / this.p.a : this.A) - this.d.o) + j3;
                if (!this.G && Math.abs(Z - j) > 200000) {
                    v30 v30Var = this.n;
                    if (v30Var != null) {
                        StringBuilder o = ik8.o(Z, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
                        o.append(j);
                        v30Var.h0(new w30(o.toString()));
                    }
                    this.G = true;
                }
                if (this.G) {
                    if (e()) {
                        long j4 = j - Z;
                        this.I += j4;
                        this.G = false;
                        a(j);
                        v30 v30Var2 = this.n;
                        if (v30Var2 != null && j4 != 0) {
                            v30Var2.l0();
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
        l40 l40Var3 = this.t;
        o40 o40Var = l40Var3.e;
        long b = l40Var3.b();
        if (o40Var.v != j2 && b > 0) {
            o40Var.b.getClass();
            if (SystemClock.elapsedRealtime() - o40Var.v >= 200) {
                efd.f("DefaultAudioSink", "Resetting stalled audio output");
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
        l40 l40Var = this.t;
        l40Var.getClass();
        return l > gcc.b0(a, (long) l40Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean o() {
        int b;
        l40 l40Var;
        boolean z;
        ty0 ty0Var = this.k;
        if (((Exception) ty0Var.c) != null) {
            ((n40) ((ja3) ty0Var.d).r).getClass();
            synchronized (l40.s) {
                z = l40.u > 0;
            }
            if (z || SystemClock.elapsedRealtime() < ty0Var.b) {
                return false;
            }
        }
        try {
            l40Var = b((s00) this.p.e);
        } catch (u30 e) {
            s00 s00Var = (s00) this.p.e;
            int i = s00Var.f;
            boolean N = gcc.N(s00Var.a);
            oh2 oh2Var = this.p;
            if (N) {
                b = ((s00) oh2Var.e).b * oh2Var.b;
            } else {
                int i2 = ((ko4) oh2Var.c).k;
                if (i2 != -1) {
                    b = i2 / 8;
                } else {
                    b = pke.b(((s00) oh2Var.e).a);
                    if (b == -2147483647) {
                        b = 1000000;
                    }
                }
            }
            s00 s00Var2 = (s00) this.p.e;
            int max = Math.max(b, AudioTrack.getMinBufferSize(s00Var2.b, s00Var2.c, s00Var2.a));
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
                r00 a = ((s00) this.p.e).a();
                a.f = i;
                s00 s00Var3 = new s00(a);
                try {
                    l40 b2 = b(s00Var3);
                    this.p = this.p.c(s00Var3);
                    l40Var = b2;
                } catch (u30 e2) {
                    e.addSuppressed(e2);
                }
            }
            if (!((s00) this.p.e).e) {
                throw e;
            }
            this.a0 = true;
            throw e;
        }
        this.t = l40Var;
        ha3 ha3Var = new ha3(this, (s00) this.p.e);
        this.j = ha3Var;
        l40Var.i.a(ha3Var);
        if (this.t.c()) {
            oh2 oh2Var2 = this.p;
            if (((s00) oh2Var2.e).k) {
                l40 l40Var2 = this.t;
                ko4 ko4Var = (ko4) oh2Var2.c;
                l40Var2.d(ko4Var.R, ko4Var.S);
            }
        }
        ig8 ig8Var = this.m;
        if (ig8Var != null) {
            this.t.f(ig8Var);
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
        v30 v30Var = this.n;
        if (v30Var != null) {
            Object obj = this.p.e;
            v30Var.M(new qf5((byte) 14));
            if (z2) {
                this.U = true;
                oh2 oh2Var3 = this.p;
                r00 a2 = ((s00) oh2Var3.e).a();
                a2.h = this.T;
                this.p = oh2Var3.c(new s00(a2));
                oh2 oh2Var4 = this.o;
                if (oh2Var4 != null) {
                    r00 a3 = ((s00) oh2Var4.e).a();
                    a3.h = this.T;
                    this.o = oh2Var4.c(new s00(a3));
                }
                this.n.d(this.T);
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
            l40 l40Var = this.t;
            o40 o40Var = l40Var.e;
            o40Var.e();
            if (o40Var.u == -9223372036854775807L) {
                o40Var.h.a(0);
            }
            o40Var.w = o40Var.a();
            if (!l40Var.j || l40Var.c()) {
                l40Var.a.pause();
            }
        }
    }

    public final void r() {
        this.R = true;
        if (p()) {
            l40 l40Var = this.t;
            o40 o40Var = l40Var.e;
            if (o40Var.u != -9223372036854775807L) {
                o40Var.b.getClass();
                o40Var.u = gcc.T(SystemClock.elapsedRealtime());
            }
            o40Var.j = gcc.Z(o40Var.e, o40Var.a());
            o40Var.h.a(0);
            if (!l40Var.j || l40Var.c()) {
                l40Var.a.play();
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
        l40 l40Var = this.t;
        if (l40Var.j) {
            return;
        }
        l40Var.j = true;
        o40 o40Var = l40Var.e;
        long b = l40Var.b();
        o40Var.w = o40Var.a();
        o40Var.b.getClass();
        o40Var.u = gcc.T(SystemClock.elapsedRealtime());
        o40Var.x = b;
        l40Var.a.stop();
        l40Var.o = 0;
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
                    l20 l20Var = this.q;
                    if (l20Var.c()) {
                        ByteBuffer byteBuffer3 = l20Var.c[l20Var.a()];
                        if (byteBuffer3.hasRemaining()) {
                            byteBuffer = byteBuffer3;
                        } else {
                            l20Var.d(q20.a);
                            byteBuffer = l20Var.c[l20Var.a()];
                        }
                    } else {
                        byteBuffer = q20.a;
                    }
                    if (byteBuffer.hasRemaining()) {
                        B(byteBuffer);
                        d(j);
                    } else {
                        ByteBuffer byteBuffer4 = this.L;
                        if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                            return;
                        }
                        l20 l20Var2 = this.q;
                        ByteBuffer byteBuffer5 = this.L;
                        if (l20Var2.c() && !l20Var2.d) {
                            l20Var2.d(byteBuffer5);
                        }
                    }
                } while (this.N == null);
                return;
            }
        }
    }

    public final void v() {
        oh2 oh2Var = this.p;
        if (oh2Var != null) {
            oh2 oh2Var2 = this.o;
            if (oh2Var2 != null) {
                this.p = oh2Var2;
                this.o = null;
                oh2Var = oh2Var2;
            }
            try {
                this.p = this.p.c(((n40) this.r).c(i((ko4) oh2Var.d)));
            } catch (n00 e) {
                vr9.l(new t30(e, (ko4) this.p.c));
                return;
            }
        }
        f();
    }

    public final void w() {
        f();
        no5 listIterator = this.g.listIterator(0);
        while (listIterator.hasNext()) {
            ((q20) listIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        l20 l20Var = this.q;
        if (l20Var != null) {
            j99 j99Var = l20Var.a;
            for (int i = 0; i < j99Var.d; i++) {
                q20 q20Var = (q20) j99Var.get(i);
                q20Var.c(o20.d);
                q20Var.reset();
            }
            l20Var.b.clear();
            l20Var.c = new ByteBuffer[0];
            m20 m20Var = m20.e;
            l20Var.d = false;
        }
        this.R = false;
        this.a0 = false;
    }

    public final void x() {
        if (p()) {
            l40 l40Var = this.t;
            of8 of8Var = this.x;
            AudioTrack audioTrack = l40Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(gcc.h(of8Var.a, 0.1f, 8.0f)).setPitch(gcc.h(of8Var.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                efd.g("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            o40 o40Var = l40Var.e;
            o40Var.i = audioTrack.getPlaybackParams().getSpeed();
            o40Var.h.a(0);
            o40Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new of8(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    public final void y(t00 t00Var) {
        if (t00Var.equals(this.r)) {
            return;
        }
        ((n40) this.r).d();
        this.r = t00Var;
        ga3 ga3Var = this.s;
        if (ga3Var != null) {
            n40 n40Var = (n40) t00Var;
            n40Var.f();
            e86 e86Var = n40Var.e;
            if (e86Var == null) {
                e86Var = new e86(Thread.currentThread());
                n40Var.e = e86Var;
            }
            e86Var.a(ga3Var);
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
