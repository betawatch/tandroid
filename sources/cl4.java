// default package

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cl4 implements j74 {
    public final xu7 a = new xu7(4);
    public final xu7 b = new xu7(9);
    public final xu7 c = new xu7(11);
    public final xu7 d = new xu7();
    public final uq9 e;
    public l74 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public z30 o;
    public jcc p;

    public cl4() {
        uq9 uq9Var = new uq9(new yn3());
        uq9Var.b = -9223372036854775807L;
        uq9Var.c = new long[0];
        uq9Var.d = new long[0];
        this.e = uq9Var;
        this.g = (byte) 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int, short] */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        long j;
        long j2;
        short s;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        byte b;
        this.f.getClass();
        while (true) {
            byte b2 = this.g;
            if (b2 == 1) {
                xu7 xu7Var = this.b;
                if (!((ja3) k74Var).c(xu7Var.a, 0, 9, true)) {
                    return -1;
                }
                xu7Var.N(0);
                xu7Var.O(4);
                int A = xu7Var.A();
                boolean z4 = (A & 4) != 0;
                boolean z5 = (A & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new z30(this.f.T(8, 1));
                }
                if (z5 && this.p == null) {
                    b = 2;
                    this.p = new jcc(this.f.T(9, 2));
                } else {
                    b = 2;
                }
                this.f.B();
                this.j = xu7Var.m() - 5;
                this.g = b;
            } else if (b2 == 2) {
                ((ja3) k74Var).l(this.j, false);
                this.j = 0;
                this.g = (byte) 3;
            } else if (b2 == 3) {
                xu7 xu7Var2 = this.c;
                if (!((ja3) k74Var).c(xu7Var2.a, 0, 11, true)) {
                    return -1;
                }
                xu7Var2.N(0);
                this.k = xu7Var2.A();
                this.l = xu7Var2.D();
                this.m = xu7Var2.D();
                this.m = ((xu7Var2.A() << 24) | this.m) * 1000;
                xu7Var2.O(3);
                this.g = (byte) 4;
            } else {
                if (b2 != 4) {
                    sdb.a();
                    return 0;
                }
                boolean z6 = this.h;
                uq9 uq9Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (uq9Var.b == -9223372036854775807L) {
                    j2 = 0;
                    s = this.k;
                    if (s == 8 || this.o == null) {
                        int i = 4;
                        if (s == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (s == 18 || this.n) {
                                ((ja3) k74Var).l(this.l, false);
                                z = false;
                                z2 = false;
                            } else {
                                xu7 g = g((ja3) k74Var);
                                if (g.A() == 2 && "onMetaData".equals(uq9.j(g)) && g.a() != 0 && g.A() == 8) {
                                    HashMap i2 = uq9.i(g);
                                    Object obj = i2.get("duration");
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            uq9Var.b = (long) (doubleValue * 1000000.0d);
                                        }
                                    }
                                    Object obj2 = i2.get("keyframes");
                                    if (obj2 instanceof Map) {
                                        Map map = (Map) obj2;
                                        Object obj3 = map.get("filepositions");
                                        Object obj4 = map.get("times");
                                        if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                            List list = (List) obj3;
                                            List list2 = (List) obj4;
                                            int size = list2.size();
                                            uq9Var.c = new long[size];
                                            uq9Var.d = new long[size];
                                            for (int i3 = 0; i3 < size; i3++) {
                                                Object obj5 = list.get(i3);
                                                Object obj6 = list2.get(i3);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    uq9Var.c = new long[0];
                                                    uq9Var.d = new long[0];
                                                    break;
                                                }
                                                uq9Var.c[i3] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                uq9Var.d[i3] = ((Double) obj5).longValue();
                                            }
                                        }
                                    }
                                }
                                long j4 = uq9Var.b;
                                if (j4 != -9223372036854775807L) {
                                    this.f.f0(new in5(j4, uq9Var.d, uq9Var.c));
                                    this.n = true;
                                }
                                z2 = true;
                                z = false;
                            }
                        } else {
                            if (!this.n) {
                                this.f.f0(new oc0(-9223372036854775807L));
                                this.n = true;
                            }
                            jcc jccVar = this.p;
                            xu7 g2 = g((ja3) k74Var);
                            jccVar.getClass();
                            int A2 = g2.A();
                            int i4 = (A2 >> 4) & 15;
                            int i5 = A2 & 15;
                            if (i5 != 7) {
                                throw new xfb(de9.k(i5, "Video format not supported: "));
                            }
                            jccVar.g = i4;
                            if (i4 != 5) {
                                xu7 xu7Var3 = jccVar.b;
                                wxb wxbVar = (wxb) jccVar.a;
                                xu7 xu7Var4 = jccVar.c;
                                int A3 = g2.A();
                                g2.f(3);
                                byte[] bArr = g2.a;
                                j3 = -9223372036854775807L;
                                int i6 = g2.b;
                                int i7 = i6 + 1;
                                g2.b = i7;
                                int i8 = ((bArr[i6] & 255) << 24) >> 8;
                                g2.b = i6 + 2;
                                int i9 = i8 | ((bArr[i7] & 255) << 8);
                                g2.b = i6 + 3;
                                long j5 = ((i9 | (bArr[r5] & 255)) * 1000) + j2;
                                if (A3 == 0 && !jccVar.e) {
                                    byte[] bArr2 = new byte[g2.a()];
                                    xu7 xu7Var5 = new xu7(bArr2);
                                    g2.k(0, g2.a(), bArr2);
                                    kc0 a = kc0.a(xu7Var5);
                                    jccVar.d = a.b;
                                    em4 em4Var = new em4();
                                    em4Var.r = ud7.n("video/x-flv");
                                    em4Var.s = ud7.n("video/avc");
                                    em4Var.k = a.l;
                                    em4Var.z = a.c;
                                    em4Var.A = a.d;
                                    em4Var.H = a.k;
                                    em4Var.v = a.a;
                                    yjb.v(em4Var, wxbVar);
                                    jccVar.e = true;
                                } else if (A3 == 1 && jccVar.e) {
                                    int i10 = jccVar.g == 1 ? 1 : 0;
                                    if (jccVar.f || i10 != 0) {
                                        byte[] bArr3 = xu7Var4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i11 = 4 - jccVar.d;
                                        int i12 = 0;
                                        while (g2.a() > 0) {
                                            g2.k(i11, jccVar.d, xu7Var4.a);
                                            xu7Var4.N(0);
                                            int E = xu7Var4.E();
                                            xu7Var3.N(0);
                                            wxbVar.e(i, xu7Var3);
                                            wxbVar.e(E, g2);
                                            i12 = i12 + 4 + E;
                                            i = 4;
                                        }
                                        ((wxb) jccVar.a).a(j5, i10, i12, 0, null);
                                        jccVar.f = true;
                                        z3 = true;
                                        if (z3) {
                                            z = true;
                                            z2 = true;
                                        }
                                    }
                                }
                                z3 = false;
                                if (z3) {
                                }
                            } else {
                                j3 = -9223372036854775807L;
                            }
                            z = false;
                            z2 = true;
                        }
                    } else {
                        if (!this.n) {
                            this.f.f0(new oc0(-9223372036854775807L));
                            this.n = true;
                        }
                        z30 z30Var = this.o;
                        xu7 g3 = g((ja3) k74Var);
                        wxb wxbVar2 = (wxb) z30Var.a;
                        if (z30Var.b) {
                            g3.O(1);
                        } else {
                            int A4 = g3.A();
                            int i13 = (A4 >> 4) & 15;
                            z30Var.d = i13;
                            if (i13 == 2) {
                                int i14 = z30.e[(A4 >> 2) & 3];
                                em4 em4Var2 = new em4();
                                em4Var2.r = ud7.n("video/x-flv");
                                em4Var2.s = ud7.n("audio/mpeg");
                                em4Var2.M = 1;
                                em4Var2.O = i14;
                                yjb.v(em4Var2, wxbVar2);
                                z30Var.c = true;
                            } else {
                                if (i13 == 7) {
                                    str = "audio/g711-alaw";
                                } else if (i13 == 8) {
                                    str = "audio/g711-mlaw";
                                } else if (i13 != 10) {
                                    throw new xfb("Audio format not supported: " + z30Var.d);
                                }
                                em4 em4Var3 = new em4();
                                em4Var3.r = ud7.n("video/x-flv");
                                em4Var3.s = ud7.n(str);
                                em4Var3.M = 1;
                                em4Var3.O = 8000;
                                yjb.v(em4Var3, wxbVar2);
                                z30Var.c = true;
                            }
                            z30Var.b = true;
                        }
                        wxb wxbVar3 = (wxb) z30Var.a;
                        if (z30Var.d == 2) {
                            int a2 = g3.a();
                            wxbVar3.e(a2, g3);
                            ((wxb) z30Var.a).a(j2, 1, a2, 0, null);
                        } else {
                            int A5 = g3.A();
                            if (A5 == 0 && !z30Var.c) {
                                int a3 = g3.a();
                                byte[] bArr4 = new byte[a3];
                                g3.k(0, a3, bArr4);
                                g1 j6 = pm2.j(new qd1(a3, bArr4), false);
                                em4 em4Var4 = new em4();
                                em4Var4.r = ud7.n("video/x-flv");
                                em4Var4.s = ud7.n("audio/mp4a-latm");
                                em4Var4.k = j6.c;
                                em4Var4.M = j6.b;
                                em4Var4.O = j6.a;
                                em4Var4.v = Collections.singletonList(bArr4);
                                yjb.v(em4Var4, wxbVar3);
                                z30Var.c = true;
                            } else if (z30Var.d != 10 || A5 == 1) {
                                int a4 = g3.a();
                                wxbVar3.e(a4, g3);
                                ((wxb) z30Var.a).a(j2, 1, a4, 0, null);
                            }
                            z = false;
                            z2 = true;
                            j3 = -9223372036854775807L;
                        }
                        z = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = uq9Var.b != j3 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = (byte) 2;
                    if (!z2) {
                        return 0;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                s = this.k;
                if (s == 8) {
                }
                int i15 = 4;
                if (s == 9) {
                }
                j3 = -9223372036854775807L;
                if (s == 18) {
                }
                ((ja3) k74Var).l(this.l, false);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = uq9Var.b != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = (byte) 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        xu7 xu7Var = this.a;
        ja3 ja3Var = (ja3) k74Var;
        ja3Var.d(xu7Var.a, 0, 3, false);
        xu7Var.N(0);
        if (xu7Var.D() == 4607062) {
            ja3Var.d(xu7Var.a, 0, 2, false);
            xu7Var.N(0);
            if ((xu7Var.H() & kk7.Y3) == 0) {
                ja3Var.d(xu7Var.a, 0, 4, false);
                xu7Var.N(0);
                int m = xu7Var.m();
                ja3Var.f = 0;
                ja3Var.a(m, false);
                ja3Var.d(xu7Var.a, 0, 4, false);
                xu7Var.N(0);
                if (xu7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // j74
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.f = l74Var;
    }

    public final xu7 g(ja3 ja3Var) {
        int i = this.l;
        xu7 xu7Var = this.d;
        byte[] bArr = xu7Var.a;
        if (i > bArr.length) {
            xu7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            xu7Var.N(0);
        }
        xu7Var.M(this.l);
        ja3Var.c(xu7Var.a, 0, this.l, false);
        return xu7Var;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }
}
