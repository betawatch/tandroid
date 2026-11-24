// default package

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cn4 implements s84 {
    public final yw7 a = new yw7(4);
    public final yw7 b = new yw7(9);
    public final yw7 c = new yw7(11);
    public final yw7 d = new yw7();
    public final ws9 e;
    public u84 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public z40 o;
    public kec p;

    public cn4() {
        ws9 ws9Var = new ws9(new ip3());
        ws9Var.b = -9223372036854775807L;
        ws9Var.c = new long[0];
        ws9Var.d = new long[0];
        this.e = ws9Var;
        this.g = (byte) 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int, short] */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
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
                yw7 yw7Var = this.b;
                if (!((vb3) t84Var).c(yw7Var.a, 0, 9, true)) {
                    return -1;
                }
                yw7Var.N(0);
                yw7Var.O(4);
                int A = yw7Var.A();
                boolean z4 = (A & 4) != 0;
                boolean z5 = (A & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new z40(this.f.c0(8, 1));
                }
                if (z5 && this.p == null) {
                    b = 2;
                    this.p = new kec(this.f.c0(9, 2));
                } else {
                    b = 2;
                }
                this.f.B();
                this.j = yw7Var.m() - 5;
                this.g = b;
            } else if (b2 == 2) {
                ((vb3) t84Var).m(this.j, false);
                this.j = 0;
                this.g = (byte) 3;
            } else if (b2 == 3) {
                yw7 yw7Var2 = this.c;
                if (!((vb3) t84Var).c(yw7Var2.a, 0, 11, true)) {
                    return -1;
                }
                yw7Var2.N(0);
                this.k = yw7Var2.A();
                this.l = yw7Var2.D();
                this.m = yw7Var2.D();
                this.m = ((yw7Var2.A() << 24) | this.m) * 1000;
                yw7Var2.O(3);
                this.g = (byte) 4;
            } else {
                if (b2 != 4) {
                    rjb.h();
                    return 0;
                }
                boolean z6 = this.h;
                ws9 ws9Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (ws9Var.b == -9223372036854775807L) {
                    j2 = 0;
                    s = this.k;
                    if (s == 8 || this.o == null) {
                        int i = 4;
                        if (s == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (s == 18 || this.n) {
                                ((vb3) t84Var).m(this.l, false);
                                z = false;
                                z2 = false;
                            } else {
                                yw7 g = g((vb3) t84Var);
                                if (g.A() == 2 && "onMetaData".equals(ws9.j(g)) && g.a() != 0 && g.A() == 8) {
                                    HashMap i2 = ws9.i(g);
                                    Object obj = i2.get("duration");
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            ws9Var.b = (long) (doubleValue * 1000000.0d);
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
                                            ws9Var.c = new long[size];
                                            ws9Var.d = new long[size];
                                            for (int i3 = 0; i3 < size; i3++) {
                                                Object obj5 = list.get(i3);
                                                Object obj6 = list2.get(i3);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    ws9Var.c = new long[0];
                                                    ws9Var.d = new long[0];
                                                    break;
                                                }
                                                ws9Var.c[i3] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                ws9Var.d[i3] = ((Double) obj5).longValue();
                                            }
                                        }
                                    }
                                }
                                long j4 = ws9Var.b;
                                if (j4 != -9223372036854775807L) {
                                    this.f.f0(new ip5(j4, ws9Var.d, ws9Var.c));
                                    this.n = true;
                                }
                                z2 = true;
                                z = false;
                            }
                        } else {
                            if (!this.n) {
                                this.f.f0(new od0(-9223372036854775807L));
                                this.n = true;
                            }
                            kec kecVar = this.p;
                            yw7 g2 = g((vb3) t84Var);
                            kecVar.getClass();
                            int A2 = g2.A();
                            int i4 = (A2 >> 4) & 15;
                            int i5 = A2 & 15;
                            if (i5 != 7) {
                                throw new yhb(hg9.j(i5, "Video format not supported: "));
                            }
                            kecVar.g = i4;
                            if (i4 != 5) {
                                yw7 yw7Var3 = kecVar.b;
                                yzb yzbVar = (yzb) kecVar.a;
                                yw7 yw7Var4 = kecVar.c;
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
                                if (A3 == 0 && !kecVar.e) {
                                    byte[] bArr2 = new byte[g2.a()];
                                    yw7 yw7Var5 = new yw7(bArr2);
                                    g2.k(0, g2.a(), bArr2);
                                    kd0 a = kd0.a(yw7Var5);
                                    kecVar.d = a.b;
                                    fo4 fo4Var = new fo4();
                                    fo4Var.r = wf7.n("video/x-flv");
                                    fo4Var.s = wf7.n("video/avc");
                                    fo4Var.k = a.l;
                                    fo4Var.z = a.c;
                                    fo4Var.A = a.d;
                                    fo4Var.H = a.k;
                                    fo4Var.v = a.a;
                                    mlb.w(fo4Var, yzbVar);
                                    kecVar.e = true;
                                } else if (A3 == 1 && kecVar.e) {
                                    int i10 = kecVar.g == 1 ? 1 : 0;
                                    if (kecVar.f || i10 != 0) {
                                        byte[] bArr3 = yw7Var4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i11 = 4 - kecVar.d;
                                        int i12 = 0;
                                        while (g2.a() > 0) {
                                            g2.k(i11, kecVar.d, yw7Var4.a);
                                            yw7Var4.N(0);
                                            int E = yw7Var4.E();
                                            yw7Var3.N(0);
                                            yzbVar.e(i, yw7Var3);
                                            yzbVar.e(E, g2);
                                            i12 = i12 + 4 + E;
                                            i = 4;
                                        }
                                        ((yzb) kecVar.a).a(j5, i10, i12, 0, null);
                                        kecVar.f = true;
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
                            this.f.f0(new od0(-9223372036854775807L));
                            this.n = true;
                        }
                        z40 z40Var = this.o;
                        yw7 g3 = g((vb3) t84Var);
                        yzb yzbVar2 = (yzb) z40Var.a;
                        if (z40Var.b) {
                            g3.O(1);
                        } else {
                            int A4 = g3.A();
                            int i13 = (A4 >> 4) & 15;
                            z40Var.d = i13;
                            if (i13 == 2) {
                                int i14 = z40.e[(A4 >> 2) & 3];
                                fo4 fo4Var2 = new fo4();
                                fo4Var2.r = wf7.n("video/x-flv");
                                fo4Var2.s = wf7.n("audio/mpeg");
                                fo4Var2.M = 1;
                                fo4Var2.O = i14;
                                mlb.w(fo4Var2, yzbVar2);
                                z40Var.c = true;
                            } else {
                                if (i13 == 7) {
                                    str = "audio/g711-alaw";
                                } else if (i13 == 8) {
                                    str = "audio/g711-mlaw";
                                } else if (i13 != 10) {
                                    throw new yhb("Audio format not supported: " + z40Var.d);
                                }
                                fo4 fo4Var3 = new fo4();
                                fo4Var3.r = wf7.n("video/x-flv");
                                fo4Var3.s = wf7.n(str);
                                fo4Var3.M = 1;
                                fo4Var3.O = 8000;
                                mlb.w(fo4Var3, yzbVar2);
                                z40Var.c = true;
                            }
                            z40Var.b = true;
                        }
                        yzb yzbVar3 = (yzb) z40Var.a;
                        if (z40Var.d == 2) {
                            int a2 = g3.a();
                            yzbVar3.e(a2, g3);
                            ((yzb) z40Var.a).a(j2, 1, a2, 0, null);
                        } else {
                            int A5 = g3.A();
                            if (A5 == 0 && !z40Var.c) {
                                int a3 = g3.a();
                                byte[] bArr4 = new byte[a3];
                                g3.k(0, a3, bArr4);
                                g1 j6 = bo2.j(new ye1(a3, bArr4), false);
                                fo4 fo4Var4 = new fo4();
                                fo4Var4.r = wf7.n("video/x-flv");
                                fo4Var4.s = wf7.n("audio/mp4a-latm");
                                fo4Var4.k = j6.c;
                                fo4Var4.M = j6.b;
                                fo4Var4.O = j6.a;
                                fo4Var4.v = Collections.singletonList(bArr4);
                                mlb.w(fo4Var4, yzbVar3);
                                z40Var.c = true;
                            } else if (z40Var.d != 10 || A5 == 1) {
                                int a4 = g3.a();
                                yzbVar3.e(a4, g3);
                                ((yzb) z40Var.a).a(j2, 1, a4, 0, null);
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
                        this.i = ws9Var.b != j3 ? -this.m : 0L;
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
                ((vb3) t84Var).m(this.l, false);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = ws9Var.b != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = (byte) 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        yw7 yw7Var = this.a;
        vb3 vb3Var = (vb3) t84Var;
        vb3Var.d(yw7Var.a, 0, 3, false);
        yw7Var.N(0);
        if (yw7Var.D() == 4607062) {
            vb3Var.d(yw7Var.a, 0, 2, false);
            yw7Var.N(0);
            if ((yw7Var.H() & nm7.Y3) == 0) {
                vb3Var.d(yw7Var.a, 0, 4, false);
                yw7Var.N(0);
                int m = yw7Var.m();
                vb3Var.f = 0;
                vb3Var.a(m, false);
                vb3Var.d(yw7Var.a, 0, 4, false);
                yw7Var.N(0);
                if (yw7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s84
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.f = u84Var;
    }

    public final yw7 g(vb3 vb3Var) {
        int i = this.l;
        yw7 yw7Var = this.d;
        byte[] bArr = yw7Var.a;
        if (i > bArr.length) {
            yw7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            yw7Var.N(0);
        }
        yw7Var.M(this.l);
        vb3Var.c(yw7Var.a, 0, this.l, false);
        return yw7Var;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }
}
