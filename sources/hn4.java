// default package

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hn4 implements e84 {
    public final ey7 a = new ey7(4);
    public final ey7 b = new ey7(9);
    public final ey7 c = new ey7(11);
    public final ey7 d = new ey7();
    public final nu9 e;
    public g84 f;
    public byte g;
    public boolean h;
    public long i;
    public int j;
    public short k;
    public int l;
    public long m;
    public boolean n;
    public a40 o;
    public hgc p;

    public hn4() {
        nu9 nu9Var = new nu9(new po3());
        nu9Var.b = -9223372036854775807L;
        nu9Var.c = new long[0];
        nu9Var.d = new long[0];
        this.e = nu9Var;
        this.g = (byte) 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int, short] */
    @Override // e84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(f84 f84Var, v11 v11Var) {
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
                ey7 ey7Var = this.b;
                if (!((cb3) f84Var).c(ey7Var.a, 0, 9, true)) {
                    return -1;
                }
                ey7Var.N(0);
                ey7Var.O(4);
                int A = ey7Var.A();
                boolean z4 = (A & 4) != 0;
                boolean z5 = (A & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new a40(this.f.e0(8, 1));
                }
                if (z5 && this.p == null) {
                    b = 2;
                    this.p = new hgc(this.f.e0(9, 2));
                } else {
                    b = 2;
                }
                this.f.D();
                this.j = ey7Var.m() - 5;
                this.g = b;
            } else if (b2 == 2) {
                ((cb3) f84Var).l(this.j, false);
                this.j = 0;
                this.g = (byte) 3;
            } else if (b2 == 3) {
                ey7 ey7Var2 = this.c;
                if (!((cb3) f84Var).c(ey7Var2.a, 0, 11, true)) {
                    return -1;
                }
                ey7Var2.N(0);
                this.k = ey7Var2.A();
                this.l = ey7Var2.D();
                this.m = ey7Var2.D();
                this.m = ((ey7Var2.A() << 24) | this.m) * 1000;
                ey7Var2.O(3);
                this.g = (byte) 4;
            } else {
                if (b2 != 4) {
                    grb.g();
                    return 0;
                }
                boolean z6 = this.h;
                nu9 nu9Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (nu9Var.b == -9223372036854775807L) {
                    j2 = 0;
                    s = this.k;
                    if (s == 8 || this.o == null) {
                        int i = 4;
                        if (s == 9 || this.p == null) {
                            j3 = -9223372036854775807L;
                            if (s == 18 || this.n) {
                                ((cb3) f84Var).l(this.l, false);
                                z = false;
                                z2 = false;
                            } else {
                                ey7 g = g((cb3) f84Var);
                                if (g.A() == 2 && "onMetaData".equals(nu9.j(g)) && g.a() != 0 && g.A() == 8) {
                                    HashMap i2 = nu9.i(g);
                                    Object obj = i2.get("duration");
                                    if (obj instanceof Double) {
                                        double doubleValue = ((Double) obj).doubleValue();
                                        if (doubleValue > 0.0d) {
                                            nu9Var.b = (long) (doubleValue * 1000000.0d);
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
                                            nu9Var.c = new long[size];
                                            nu9Var.d = new long[size];
                                            for (int i3 = 0; i3 < size; i3++) {
                                                Object obj5 = list.get(i3);
                                                Object obj6 = list2.get(i3);
                                                if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                    nu9Var.c = new long[0];
                                                    nu9Var.d = new long[0];
                                                    break;
                                                }
                                                nu9Var.c[i3] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                nu9Var.d[i3] = ((Double) obj5).longValue();
                                            }
                                        }
                                    }
                                }
                                long j4 = nu9Var.b;
                                if (j4 != -9223372036854775807L) {
                                    this.f.m0(new lp5(j4, nu9Var.d, nu9Var.c));
                                    this.n = true;
                                }
                                z2 = true;
                                z = false;
                            }
                        } else {
                            if (!this.n) {
                                this.f.m0(new qc0(-9223372036854775807L));
                                this.n = true;
                            }
                            hgc hgcVar = this.p;
                            ey7 g2 = g((cb3) f84Var);
                            hgcVar.getClass();
                            int A2 = g2.A();
                            int i4 = (A2 >> 4) & 15;
                            int i5 = A2 & 15;
                            if (i5 != 7) {
                                throw new tjb(uh9.k(i5, "Video format not supported: "));
                            }
                            hgcVar.g = i4;
                            if (i4 != 5) {
                                ey7 ey7Var3 = hgcVar.b;
                                x1c x1cVar = (x1c) hgcVar.a;
                                ey7 ey7Var4 = hgcVar.c;
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
                                if (A3 == 0 && !hgcVar.e) {
                                    byte[] bArr2 = new byte[g2.a()];
                                    ey7 ey7Var5 = new ey7(bArr2);
                                    g2.k(0, g2.a(), bArr2);
                                    mc0 a = mc0.a(ey7Var5);
                                    hgcVar.d = a.b;
                                    jo4 jo4Var = new jo4();
                                    jo4Var.r = eg7.n("video/x-flv");
                                    jo4Var.s = eg7.n("video/avc");
                                    jo4Var.k = a.l;
                                    jo4Var.z = a.c;
                                    jo4Var.A = a.d;
                                    jo4Var.H = a.k;
                                    jo4Var.v = a.a;
                                    xnb.v(jo4Var, x1cVar);
                                    hgcVar.e = true;
                                } else if (A3 == 1 && hgcVar.e) {
                                    int i10 = hgcVar.g == 1 ? 1 : 0;
                                    if (hgcVar.f || i10 != 0) {
                                        byte[] bArr3 = ey7Var4.a;
                                        bArr3[0] = 0;
                                        bArr3[1] = 0;
                                        bArr3[2] = 0;
                                        int i11 = 4 - hgcVar.d;
                                        int i12 = 0;
                                        while (g2.a() > 0) {
                                            g2.k(i11, hgcVar.d, ey7Var4.a);
                                            ey7Var4.N(0);
                                            int E = ey7Var4.E();
                                            ey7Var3.N(0);
                                            x1cVar.e(i, ey7Var3);
                                            x1cVar.e(E, g2);
                                            i12 = i12 + 4 + E;
                                            i = 4;
                                        }
                                        ((x1c) hgcVar.a).a(j5, i10, i12, 0, null);
                                        hgcVar.f = true;
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
                            this.f.m0(new qc0(-9223372036854775807L));
                            this.n = true;
                        }
                        a40 a40Var = this.o;
                        ey7 g3 = g((cb3) f84Var);
                        x1c x1cVar2 = (x1c) a40Var.a;
                        if (a40Var.b) {
                            g3.O(1);
                        } else {
                            int A4 = g3.A();
                            int i13 = (A4 >> 4) & 15;
                            a40Var.d = i13;
                            if (i13 == 2) {
                                int i14 = a40.e[(A4 >> 2) & 3];
                                jo4 jo4Var2 = new jo4();
                                jo4Var2.r = eg7.n("video/x-flv");
                                jo4Var2.s = eg7.n("audio/mpeg");
                                jo4Var2.M = 1;
                                jo4Var2.O = i14;
                                xnb.v(jo4Var2, x1cVar2);
                                a40Var.c = true;
                            } else {
                                if (i13 == 7) {
                                    str = "audio/g711-alaw";
                                } else if (i13 == 8) {
                                    str = "audio/g711-mlaw";
                                } else if (i13 != 10) {
                                    throw new tjb("Audio format not supported: " + a40Var.d);
                                }
                                jo4 jo4Var3 = new jo4();
                                jo4Var3.r = eg7.n("video/x-flv");
                                jo4Var3.s = eg7.n(str);
                                jo4Var3.M = 1;
                                jo4Var3.O = 8000;
                                xnb.v(jo4Var3, x1cVar2);
                                a40Var.c = true;
                            }
                            a40Var.b = true;
                        }
                        x1c x1cVar3 = (x1c) a40Var.a;
                        if (a40Var.d == 2) {
                            int a2 = g3.a();
                            x1cVar3.e(a2, g3);
                            ((x1c) a40Var.a).a(j2, 1, a2, 0, null);
                        } else {
                            int A5 = g3.A();
                            if (A5 == 0 && !a40Var.c) {
                                int a3 = g3.a();
                                byte[] bArr4 = new byte[a3];
                                g3.k(0, a3, bArr4);
                                h1 j6 = jn2.j(new zd1(a3, bArr4), false);
                                jo4 jo4Var4 = new jo4();
                                jo4Var4.r = eg7.n("video/x-flv");
                                jo4Var4.s = eg7.n("audio/mp4a-latm");
                                jo4Var4.k = j6.c;
                                jo4Var4.M = j6.b;
                                jo4Var4.O = j6.a;
                                jo4Var4.v = Collections.singletonList(bArr4);
                                xnb.v(jo4Var4, x1cVar3);
                                a40Var.c = true;
                            } else if (a40Var.d != 10 || A5 == 1) {
                                int a4 = g3.a();
                                x1cVar3.e(a4, g3);
                                ((x1c) a40Var.a).a(j2, 1, a4, 0, null);
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
                        this.i = nu9Var.b != j3 ? -this.m : 0L;
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
                ((cb3) f84Var).l(this.l, false);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = nu9Var.b != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = (byte) 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        ey7 ey7Var = this.a;
        cb3 cb3Var = (cb3) f84Var;
        cb3Var.d(ey7Var.a, 0, 3, false);
        ey7Var.N(0);
        if (ey7Var.D() == 4607062) {
            cb3Var.d(ey7Var.a, 0, 2, false);
            ey7Var.N(0);
            if ((ey7Var.H() & jn7.Y3) == 0) {
                cb3Var.d(ey7Var.a, 0, 4, false);
                ey7Var.N(0);
                int m = ey7Var.m();
                cb3Var.f = 0;
                cb3Var.a(m, false);
                cb3Var.d(ey7Var.a, 0, 4, false);
                ey7Var.N(0);
                if (ey7Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e84
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = (byte) 1;
            this.h = false;
        } else {
            this.g = (byte) 3;
        }
        this.j = 0;
    }

    @Override // e84
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        this.f = g84Var;
    }

    public final ey7 g(cb3 cb3Var) {
        int i = this.l;
        ey7 ey7Var = this.d;
        byte[] bArr = ey7Var.a;
        if (i > bArr.length) {
            ey7Var.L(0, new byte[Math.max(bArr.length << 1, i)]);
        } else {
            ey7Var.N(0);
        }
        ey7Var.M(this.l);
        cb3Var.c(ey7Var.a, 0, this.l, false);
        return ey7Var;
    }

    @Override // e84
    public final e84 a() {
        return this;
    }

    @Override // e84
    public final void release() {
    }
}
