// default package

import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kh7 implements s84 {
    public static final bh7 w = new bh7((byte) 1);
    public final int a;
    public final long b;
    public final yw7 c;
    public final wh7 d;
    public final au4 e;
    public final fk3 f;
    public final ip3 g;
    public u84 h;
    public yzb i;
    public yzb j;
    public int k;
    public nf7 l;
    public nf7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public nx9 s;
    public boolean t;
    public boolean u;
    public long v;

    public kh7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new yw7(10);
        this.d = new wh7();
        this.e = new au4();
        this.n = -9223372036854775807L;
        this.f = new fk3((byte) 11);
        ip3 ip3Var = new ip3();
        this.g = ip3Var;
        this.j = ip3Var;
        this.q = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r3 != 1231971951) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x034d, code lost:
    
        if (ji8.a.apply(r9) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0384, code lost:
    
        if (((ojb) r10).a.equals("TLEN") == false) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0663  */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        au4 au4Var;
        wh7 wh7Var;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        long j5;
        int i4;
        boolean z;
        int f;
        ?? r4;
        int i5;
        int i6;
        int m;
        long[] jArr;
        int i7;
        int i8;
        mh7 mh7Var;
        boolean z2;
        nf7 nf7Var;
        int i9;
        nx9 bu2Var;
        nf7 nf7Var2;
        nx9 nx9Var;
        boolean z3;
        nx9 nx9Var2;
        nx9 bu2Var2;
        nf7 nf7Var3;
        lf7 lf7Var;
        lf7 lf7Var2;
        char c;
        long T;
        au4 au4Var2;
        int A;
        this.i.getClass();
        String str = hac.a;
        int i10 = this.k;
        au4 au4Var3 = this.e;
        wh7 wh7Var2 = this.d;
        if (i10 == 0) {
            try {
                j((vb3) t84Var, false);
            } catch (EOFException unused) {
                au4Var = au4Var3;
                wh7Var = wh7Var2;
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = -9223372036854775807L;
            }
        }
        if (this.s == null) {
            j = 1000000;
            yw7 yw7Var = new yw7(wh7Var2.c);
            j2 = 1;
            ((vb3) t84Var).d(yw7Var.a, 0, wh7Var2.c, false);
            int i11 = wh7Var2.a & 1;
            byte b = wh7Var2.e;
            int i12 = 21;
            if (i11 != 0) {
                if (b != 1) {
                    i12 = 36;
                }
            } else if (b == 1) {
                i12 = 13;
            }
            j5 = 0;
            if (yw7Var.c >= i12 + 4) {
                yw7Var.N(i12);
                i6 = yw7Var.m();
                if (i6 != 1483304551) {
                }
                if (i6 != 1231971951) {
                    if (i6 == 1447187017) {
                        vb3 vb3Var = (vb3) t84Var;
                        long j6 = vb3Var.c;
                        long j7 = vb3Var.d;
                        yw7Var.O(6);
                        long j8 = j7 + wh7Var2.c;
                        long m2 = j8 + yw7Var.m();
                        int m3 = yw7Var.m();
                        if (m3 <= 0) {
                            au4Var2 = au4Var3;
                            wh7Var = wh7Var2;
                        } else {
                            au4 au4Var4 = au4Var3;
                            long Z = hac.Z(wh7Var2.d, (m3 * wh7Var2.g) - 1);
                            int H = yw7Var.H();
                            int H2 = yw7Var.H();
                            int H3 = yw7Var.H();
                            yw7Var.O(2);
                            wh7Var = wh7Var2;
                            long j9 = j7 + wh7Var.c;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i13 = 0;
                            while (true) {
                                au4Var2 = au4Var4;
                                long[] jArr4 = jArr2;
                                if (i13 < H) {
                                    jArr4[i13] = (i13 * Z) / H;
                                    jArr3[i13] = j9;
                                    if (H3 == 1) {
                                        A = yw7Var.A();
                                    } else if (H3 == 2) {
                                        A = yw7Var.H();
                                    } else if (H3 == 3) {
                                        A = yw7Var.D();
                                    } else {
                                        if (H3 != 4) {
                                            break;
                                        }
                                        A = yw7Var.E();
                                    }
                                    j9 += H2 * A;
                                    i13++;
                                    jArr2 = jArr4;
                                    au4Var4 = au4Var2;
                                } else {
                                    if (j6 != -1 && j6 != m2) {
                                        StringBuilder o = wi8.o(j6, "VBRI data size mismatch: ", ", ");
                                        o.append(m2);
                                        ncd.f("VbriSeeker", o.toString());
                                    }
                                    if (m2 != j9) {
                                        StringBuilder o2 = wi8.o(m2, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        o2.append(j9);
                                        o2.append("\nSeeking will be inaccurate.");
                                        ncd.f("VbriSeeker", o2.toString());
                                        m2 = Math.max(m2, j9);
                                    }
                                    bu2Var = new fbc(jArr4, jArr3, Z, j8, m2);
                                }
                            }
                            vb3Var.m(wh7Var.c, false);
                            au4Var = au4Var2;
                            nf7Var2 = this.l;
                            vb3 vb3Var2 = (vb3) t84Var;
                            long j10 = vb3Var2.d;
                            if (nf7Var2 != null) {
                            }
                            nx9Var = null;
                            z3 = this.t;
                            int i14 = this.a;
                            if (z3) {
                            }
                            this.s = nx9Var2;
                            this.i.d(nx9Var2.h());
                            this.h.f0(this.s);
                            nf7Var3 = this.l;
                            if (nf7Var3 == null) {
                            }
                            nf7Var3 = this.m;
                            fo4 fo4Var = new fo4();
                            fo4Var.r = wf7.n("audio/mpeg");
                            fo4Var.s = wf7.n(wh7Var.b);
                            fo4Var.t = TLObject.FLAG_12;
                            fo4Var.M = wh7Var.e;
                            fo4Var.O = wh7Var.d;
                            fo4Var.Q = au4Var.a;
                            fo4Var.R = au4Var.b;
                            fo4Var.l = nf7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            mlb.w(fo4Var, this.j);
                            this.p = vb3Var2.d;
                        }
                        bu2Var = null;
                        vb3Var.m(wh7Var.c, false);
                        au4Var = au4Var2;
                        nf7Var2 = this.l;
                        vb3 vb3Var22 = (vb3) t84Var;
                        long j102 = vb3Var22.d;
                        if (nf7Var2 != null) {
                        }
                        nx9Var = null;
                        z3 = this.t;
                        int i142 = this.a;
                        if (z3) {
                        }
                        this.s = nx9Var2;
                        this.i.d(nx9Var2.h());
                        this.h.f0(this.s);
                        nf7Var3 = this.l;
                        if (nf7Var3 == null) {
                        }
                        nf7Var3 = this.m;
                        fo4 fo4Var2 = new fo4();
                        fo4Var2.r = wf7.n("audio/mpeg");
                        fo4Var2.s = wf7.n(wh7Var.b);
                        fo4Var2.t = TLObject.FLAG_12;
                        fo4Var2.M = wh7Var.e;
                        fo4Var2.O = wh7Var.d;
                        fo4Var2.Q = au4Var.a;
                        fo4Var2.R = au4Var.b;
                        fo4Var2.l = nf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        mlb.w(fo4Var2, this.j);
                        this.p = vb3Var22.d;
                    } else if (i6 != 1483304551) {
                        ((vb3) t84Var).f = 0;
                        au4Var = au4Var3;
                        wh7Var = wh7Var2;
                        bu2Var = null;
                        nf7Var2 = this.l;
                        vb3 vb3Var222 = (vb3) t84Var;
                        long j1022 = vb3Var222.d;
                        if (nf7Var2 != null) {
                            lf7[] lf7VarArr = nf7Var2.a;
                            int length = lf7VarArr.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    lf7Var = null;
                                    break;
                                }
                                lf7 lf7Var3 = lf7VarArr[i15];
                                if (fg7.class.isAssignableFrom(lf7Var3.getClass())) {
                                    lf7Var = (lf7) fg7.class.cast(lf7Var3);
                                }
                                lf7Var = null;
                                if (lf7Var != null) {
                                    break;
                                }
                                i15++;
                            }
                            fg7 fg7Var = (fg7) lf7Var;
                            if (fg7Var != null) {
                                int[] iArr = fg7Var.e;
                                lf7[] lf7VarArr2 = nf7Var2.a;
                                int length2 = lf7VarArr2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        lf7Var2 = null;
                                        break;
                                    }
                                    lf7 lf7Var4 = lf7VarArr2[i16];
                                    if (ojb.class.isAssignableFrom(lf7Var4.getClass())) {
                                        lf7Var2 = (lf7) ojb.class.cast(lf7Var4);
                                    }
                                    lf7Var2 = null;
                                    if (lf7Var2 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                ojb ojbVar = (ojb) lf7Var2;
                                if (ojbVar == null) {
                                    T = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    T = hac.T(Long.parseLong((String) ojbVar.c.get(0)));
                                }
                                int length3 = iArr.length;
                                int i17 = length3 + 1;
                                long[] jArr5 = new long[i17];
                                long[] jArr6 = new long[i17];
                                jArr5[c] = j1022;
                                jArr6[c] = 0;
                                long j11 = 0;
                                int i18 = 1;
                                while (i18 <= length3) {
                                    int i19 = i18 - 1;
                                    long j12 = j1022 + fg7Var.c + iArr[i19];
                                    j11 += fg7Var.d + fg7Var.f[i19];
                                    jArr5[i18] = j12;
                                    jArr6[i18] = j11;
                                    i18++;
                                    length3 = length3;
                                    j1022 = j12;
                                }
                                nx9Var = new gg7(T, jArr5, jArr6);
                                z3 = this.t;
                                int i1422 = this.a;
                                if (z3) {
                                    if (nx9Var == null) {
                                        if (bu2Var == null) {
                                            bu2Var = g(vb3Var222);
                                        }
                                        nx9Var = bu2Var;
                                    }
                                    if ((i1422 & 4) != 0 && !nx9Var.c()) {
                                        bu2Var2 = new jp5(nx9Var.h(), vb3Var222.d, nx9Var.a());
                                    } else if ((nx9Var instanceof bu2) || nx9Var.c() || (i1422 & 1) == 0) {
                                        nx9Var2 = nx9Var;
                                    } else {
                                        long h = nx9Var.h();
                                        long a = nx9Var.a() != -1 ? nx9Var.a() : vb3Var222.c;
                                        if (h == -9223372036854775807L || a == -1) {
                                            nx9Var2 = g(vb3Var222);
                                        } else {
                                            long b2 = nx9Var.b() != -1 ? nx9Var.b() : 0L;
                                            int a2 = jre.a(a - b2, h);
                                            if (a2 == -2147483647) {
                                                nx9Var2 = g(vb3Var222);
                                            } else {
                                                bu2Var2 = new bu2(a, b2, a2, -1, false, true, h);
                                            }
                                        }
                                    }
                                    nx9Var2 = bu2Var2;
                                } else {
                                    nx9Var2 = new mx9(-9223372036854775807L);
                                }
                                this.s = nx9Var2;
                                this.i.d(nx9Var2.h());
                                this.h.f0(this.s);
                                nf7Var3 = this.l;
                                if (nf7Var3 == null && (i1422 & 8) == 0) {
                                    nf7 nf7Var4 = this.m;
                                    if (nf7Var4 != null) {
                                        nf7Var3 = nf7Var3.b(nf7Var4);
                                    }
                                } else {
                                    nf7Var3 = this.m;
                                }
                                fo4 fo4Var22 = new fo4();
                                fo4Var22.r = wf7.n("audio/mpeg");
                                fo4Var22.s = wf7.n(wh7Var.b);
                                fo4Var22.t = TLObject.FLAG_12;
                                fo4Var22.M = wh7Var.e;
                                fo4Var22.O = wh7Var.d;
                                fo4Var22.Q = au4Var.a;
                                fo4Var22.R = au4Var.b;
                                fo4Var22.l = nf7Var3;
                                if (this.s.g() != -2147483647) {
                                    fo4Var22.i = this.s.g();
                                }
                                mlb.w(fo4Var22, this.j);
                                this.p = vb3Var222.d;
                            }
                        }
                        nx9Var = null;
                        z3 = this.t;
                        int i14222 = this.a;
                        if (z3) {
                        }
                        this.s = nx9Var2;
                        this.i.d(nx9Var2.h());
                        this.h.f0(this.s);
                        nf7Var3 = this.l;
                        if (nf7Var3 == null) {
                        }
                        nf7Var3 = this.m;
                        fo4 fo4Var222 = new fo4();
                        fo4Var222.r = wf7.n("audio/mpeg");
                        fo4Var222.s = wf7.n(wh7Var.b);
                        fo4Var222.t = TLObject.FLAG_12;
                        fo4Var222.M = wh7Var.e;
                        fo4Var222.O = wh7Var.d;
                        fo4Var222.Q = au4Var.a;
                        fo4Var222.R = au4Var.b;
                        fo4Var222.l = nf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        mlb.w(fo4Var222, this.j);
                        this.p = vb3Var222.d;
                    }
                }
                wh7Var = wh7Var2;
                m = yw7Var.m();
                int E = (m & 1) != 0 ? yw7Var.E() : -1;
                long C = (m & 2) != 0 ? yw7Var.C() : -1L;
                if ((m & 4) == 4) {
                    long[] jArr7 = new long[100];
                    for (int i20 = 0; i20 < 100; i20++) {
                        jArr7[i20] = yw7Var.A();
                    }
                    jArr = jArr7;
                } else {
                    jArr = null;
                }
                if ((m & 8) != 0) {
                    yw7Var.O(4);
                }
                if (yw7Var.a() >= 24) {
                    String y = yw7Var.y(9, StandardCharsets.UTF_8);
                    yw7Var.O(2);
                    float intBitsToFloat = Float.intBitsToFloat(yw7Var.m());
                    int H4 = yw7Var.H();
                    int H5 = yw7Var.H();
                    lh7 a3 = lh7.a(H4);
                    lh7 a4 = lh7.a(H5);
                    mh7Var = (intBitsToFloat <= 0.0f && a3 == null && a4 == null) ? null : new mh7(intBitsToFloat, a3, a4);
                    yw7Var.O(2);
                    int D = yw7Var.D();
                    i8 = (16773120 & D) >> 12;
                    i7 = D & 4095;
                    if (y.startsWith("LAME") || y.startsWith("Lavf") || y.startsWith("Lavc")) {
                        i8 += 529;
                        i7 = Math.max(0, i7 - 529);
                    }
                } else {
                    i7 = -1;
                    i8 = -1;
                    mh7Var = null;
                }
                long j13 = E;
                nl6 nl6Var = new nl6();
                wh7 wh7Var3 = new wh7();
                wh7Var3.a = wh7Var.a;
                wh7Var3.b = wh7Var.b;
                wh7Var3.c = wh7Var.c;
                wh7Var3.d = wh7Var.d;
                wh7Var3.e = wh7Var.e;
                wh7Var3.f = wh7Var.f;
                wh7Var3.g = wh7Var.g;
                nl6Var.d = wh7Var3;
                nl6Var.a = j13;
                nl6Var.b = i8;
                nl6Var.c = i7;
                wh7 wh7Var4 = (wh7) nl6Var.d;
                au4Var = au4Var3;
                if ((au4Var.a != -1 || au4Var.b == -1) && i8 != -1 && i7 != -1) {
                    au4Var.a = i8;
                    au4Var.b = i7;
                }
                if (mh7Var != null) {
                    z2 = false;
                    nf7Var = new nf7(mh7Var);
                } else {
                    z2 = false;
                    nf7Var = null;
                }
                this.m = nf7Var;
                vb3 vb3Var3 = (vb3) t84Var;
                long j14 = vb3Var3.d;
                vb3Var3.m(wh7Var.c, z2);
                long j15 = vb3Var3.c;
                if (i6 == 1483304551) {
                    long a5 = nl6Var.a();
                    if (a5 != -9223372036854775807L) {
                        if (C != -1 && j15 != -1 && j14 + C != j15) {
                            long j16 = j15 - j14;
                            StringBuilder o3 = wi8.o(j16, "Data size mismatch between stream (", ") and Xing frame (");
                            o3.append(C);
                            o3.append("), using smaller value.");
                            ncd.e("XingSeeker", o3.toString());
                            C = Math.min(C, j16);
                        }
                        bu2Var = new y0d(j14, wh7Var4.c, a5, C, jArr);
                        nf7Var2 = this.l;
                        vb3 vb3Var2222 = (vb3) t84Var;
                        long j10222 = vb3Var2222.d;
                        if (nf7Var2 != null) {
                        }
                        nx9Var = null;
                        z3 = this.t;
                        int i142222 = this.a;
                        if (z3) {
                        }
                        this.s = nx9Var2;
                        this.i.d(nx9Var2.h());
                        this.h.f0(this.s);
                        nf7Var3 = this.l;
                        if (nf7Var3 == null) {
                        }
                        nf7Var3 = this.m;
                        fo4 fo4Var2222 = new fo4();
                        fo4Var2222.r = wf7.n("audio/mpeg");
                        fo4Var2222.s = wf7.n(wh7Var.b);
                        fo4Var2222.t = TLObject.FLAG_12;
                        fo4Var2222.M = wh7Var.e;
                        fo4Var2222.O = wh7Var.d;
                        fo4Var2222.Q = au4Var.a;
                        fo4Var2222.R = au4Var.b;
                        fo4Var2222.l = nf7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        mlb.w(fo4Var2222, this.j);
                        this.p = vb3Var2222.d;
                    }
                    bu2Var = null;
                    nf7Var2 = this.l;
                    vb3 vb3Var22222 = (vb3) t84Var;
                    long j102222 = vb3Var22222.d;
                    if (nf7Var2 != null) {
                    }
                    nx9Var = null;
                    z3 = this.t;
                    int i1422222 = this.a;
                    if (z3) {
                    }
                    this.s = nx9Var2;
                    this.i.d(nx9Var2.h());
                    this.h.f0(this.s);
                    nf7Var3 = this.l;
                    if (nf7Var3 == null) {
                    }
                    nf7Var3 = this.m;
                    fo4 fo4Var22222 = new fo4();
                    fo4Var22222.r = wf7.n("audio/mpeg");
                    fo4Var22222.s = wf7.n(wh7Var.b);
                    fo4Var22222.t = TLObject.FLAG_12;
                    fo4Var22222.M = wh7Var.e;
                    fo4Var22222.O = wh7Var.d;
                    fo4Var22222.Q = au4Var.a;
                    fo4Var22222.R = au4Var.b;
                    fo4Var22222.l = nf7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    mlb.w(fo4Var22222, this.j);
                    this.p = vb3Var22222.d;
                } else {
                    long a6 = nl6Var.a();
                    if (a6 != -9223372036854775807L) {
                        if (C != -1) {
                            j15 = j14 + C;
                            i9 = wh7Var4.c;
                        } else if (j15 != -1) {
                            C = j15 - j14;
                            i9 = wh7Var4.c;
                        }
                        long j17 = C - i9;
                        long j18 = j15;
                        int a7 = jre.a(j17, a6);
                        if (a7 != -2147483647) {
                            bu2Var = new bu2(j18, j14 + wh7Var4.c, a7, ine.b(bqe.b(j17, j13, RoundingMode.HALF_UP)), false, true, a6);
                            nf7Var2 = this.l;
                            vb3 vb3Var222222 = (vb3) t84Var;
                            long j1022222 = vb3Var222222.d;
                            if (nf7Var2 != null) {
                            }
                            nx9Var = null;
                            z3 = this.t;
                            int i14222222 = this.a;
                            if (z3) {
                            }
                            this.s = nx9Var2;
                            this.i.d(nx9Var2.h());
                            this.h.f0(this.s);
                            nf7Var3 = this.l;
                            if (nf7Var3 == null) {
                            }
                            nf7Var3 = this.m;
                            fo4 fo4Var222222 = new fo4();
                            fo4Var222222.r = wf7.n("audio/mpeg");
                            fo4Var222222.s = wf7.n(wh7Var.b);
                            fo4Var222222.t = TLObject.FLAG_12;
                            fo4Var222222.M = wh7Var.e;
                            fo4Var222222.O = wh7Var.d;
                            fo4Var222222.Q = au4Var.a;
                            fo4Var222222.R = au4Var.b;
                            fo4Var222222.l = nf7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            mlb.w(fo4Var222222, this.j);
                            this.p = vb3Var222222.d;
                        }
                    }
                    bu2Var = null;
                    nf7Var2 = this.l;
                    vb3 vb3Var2222222 = (vb3) t84Var;
                    long j10222222 = vb3Var2222222.d;
                    if (nf7Var2 != null) {
                    }
                    nx9Var = null;
                    z3 = this.t;
                    int i142222222 = this.a;
                    if (z3) {
                    }
                    this.s = nx9Var2;
                    this.i.d(nx9Var2.h());
                    this.h.f0(this.s);
                    nf7Var3 = this.l;
                    if (nf7Var3 == null) {
                    }
                    nf7Var3 = this.m;
                    fo4 fo4Var2222222 = new fo4();
                    fo4Var2222222.r = wf7.n("audio/mpeg");
                    fo4Var2222222.s = wf7.n(wh7Var.b);
                    fo4Var2222222.t = TLObject.FLAG_12;
                    fo4Var2222222.M = wh7Var.e;
                    fo4Var2222222.O = wh7Var.d;
                    fo4Var2222222.Q = au4Var.a;
                    fo4Var2222222.R = au4Var.b;
                    fo4Var2222222.l = nf7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    mlb.w(fo4Var2222222, this.j);
                    this.p = vb3Var2222222.d;
                }
            }
            if (yw7Var.c >= 40) {
                yw7Var.N(36);
                if (yw7Var.m() == 1447187017) {
                    i6 = 1447187017;
                    if (i6 != 1231971951) {
                    }
                    wh7Var = wh7Var2;
                    m = yw7Var.m();
                    if ((m & 1) != 0) {
                    }
                    if ((m & 2) != 0) {
                    }
                    if ((m & 4) == 4) {
                    }
                    if ((m & 8) != 0) {
                    }
                    if (yw7Var.a() >= 24) {
                    }
                    long j132 = E;
                    nl6 nl6Var2 = new nl6();
                    wh7 wh7Var32 = new wh7();
                    wh7Var32.a = wh7Var.a;
                    wh7Var32.b = wh7Var.b;
                    wh7Var32.c = wh7Var.c;
                    wh7Var32.d = wh7Var.d;
                    wh7Var32.e = wh7Var.e;
                    wh7Var32.f = wh7Var.f;
                    wh7Var32.g = wh7Var.g;
                    nl6Var2.d = wh7Var32;
                    nl6Var2.a = j132;
                    nl6Var2.b = i8;
                    nl6Var2.c = i7;
                    wh7 wh7Var42 = (wh7) nl6Var2.d;
                    au4Var = au4Var3;
                    if (au4Var.a != -1) {
                    }
                    au4Var.a = i8;
                    au4Var.b = i7;
                    if (mh7Var != null) {
                    }
                    this.m = nf7Var;
                    vb3 vb3Var32 = (vb3) t84Var;
                    long j142 = vb3Var32.d;
                    vb3Var32.m(wh7Var.c, z2);
                    long j152 = vb3Var32.c;
                    if (i6 == 1483304551) {
                    }
                }
            }
            i6 = 0;
            if (i6 != 1231971951) {
            }
            wh7Var = wh7Var2;
            m = yw7Var.m();
            if ((m & 1) != 0) {
            }
            if ((m & 2) != 0) {
            }
            if ((m & 4) == 4) {
            }
            if ((m & 8) != 0) {
            }
            if (yw7Var.a() >= 24) {
            }
            long j1322 = E;
            nl6 nl6Var22 = new nl6();
            wh7 wh7Var322 = new wh7();
            wh7Var322.a = wh7Var.a;
            wh7Var322.b = wh7Var.b;
            wh7Var322.c = wh7Var.c;
            wh7Var322.d = wh7Var.d;
            wh7Var322.e = wh7Var.e;
            wh7Var322.f = wh7Var.f;
            wh7Var322.g = wh7Var.g;
            nl6Var22.d = wh7Var322;
            nl6Var22.a = j1322;
            nl6Var22.b = i8;
            nl6Var22.c = i7;
            wh7 wh7Var422 = (wh7) nl6Var22.d;
            au4Var = au4Var3;
            if (au4Var.a != -1) {
            }
            au4Var.a = i8;
            au4Var.b = i7;
            if (mh7Var != null) {
            }
            this.m = nf7Var;
            vb3 vb3Var322 = (vb3) t84Var;
            long j1422 = vb3Var322.d;
            vb3Var322.m(wh7Var.c, z2);
            long j1522 = vb3Var322.c;
            if (i6 == 1483304551) {
            }
        } else {
            au4Var = au4Var3;
            wh7Var = wh7Var2;
            j = 1000000;
            j2 = 1;
            j5 = 0;
            long j19 = this.p;
            if (j19 != 0) {
                long j20 = ((vb3) t84Var).d;
                if (j20 < j19) {
                    int i21 = (int) (j19 - j20);
                    i4 = 0;
                    ((vb3) t84Var).m(i21, false);
                    if (this.r != 0) {
                        ((vb3) t84Var).f = i4;
                        vb3 vb3Var4 = (vb3) t84Var;
                        if (i(vb3Var4)) {
                            j3 = -9223372036854775807L;
                            i = -1;
                            i2 = -1;
                            if (i2 == i) {
                                nx9 nx9Var3 = this.s;
                                if (nx9Var3 instanceof jp5) {
                                    long j21 = this.o - j2;
                                    if (j21 >= 0) {
                                        int i22 = au4Var.a;
                                        if (i22 != i && (i3 = au4Var.b) != i) {
                                            j21 = (j21 - i22) - i3;
                                        }
                                        if (j21 >= 0) {
                                            j4 = ((j21 * j) / wh7Var.d) + this.n;
                                            if (nx9Var3.h() != j4) {
                                                nx9 nx9Var4 = this.s;
                                                ((jp5) nx9Var4).d.c = j4;
                                                this.h.f0(nx9Var4);
                                                this.i.d(this.s.h());
                                            }
                                        }
                                    }
                                    j4 = j3;
                                    if (nx9Var3.h() != j4) {
                                    }
                                }
                            }
                            return i2;
                        }
                        yw7 yw7Var2 = this.c;
                        yw7Var2.N(i4);
                        int m4 = yw7Var2.m();
                        if (((-128000) & m4) != (this.k & (-128000))) {
                            r4 = 0;
                            j3 = -9223372036854775807L;
                            i5 = 1;
                        } else if (wcd.a(m4) == -1) {
                            r4 = 0;
                            i5 = 1;
                            j3 = -9223372036854775807L;
                        } else {
                            wh7Var.a(m4);
                            long j22 = this.n;
                            j3 = -9223372036854775807L;
                            if (j22 == -9223372036854775807L) {
                                j22 = this.s.e(vb3Var4.d);
                                this.n = j22;
                                long j23 = this.b;
                                if (j23 != -9223372036854775807L) {
                                    j22 = (j23 - this.s.e(j5)) + this.n;
                                    this.n = j22;
                                }
                            }
                            int i23 = wh7Var.c;
                            this.r = i23;
                            long j24 = vb3Var4.d + i23;
                            this.q = j24;
                            nx9 nx9Var5 = this.s;
                            if (nx9Var5 instanceof jp5) {
                                ip5 ip5Var = ((jp5) nx9Var5).d;
                                long j25 = (((this.o + wh7Var.g) * j) / wh7Var.d) + j22;
                                de deVar = ip5Var.b;
                                int i24 = deVar.b;
                                if (i24 == 0 || j25 - deVar.g0(i24 - 1) >= 100000) {
                                    ip5Var.i(j25, j24);
                                }
                                if (this.u) {
                                    long j26 = this.v;
                                    de deVar2 = ip5Var.b;
                                    int i25 = deVar2.b;
                                    if (i25 != 0 && j26 - deVar2.g0(i25 - 1) < 100000) {
                                        this.u = false;
                                        this.j = this.i;
                                    }
                                }
                            }
                            z = true;
                        }
                        vb3Var4.m(i5, r4);
                        this.k = r4;
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                    z = true;
                    j3 = -9223372036854775807L;
                    f = this.j.f(t84Var, this.r, z);
                    if (f != -1) {
                        int i26 = this.r - f;
                        this.r = i26;
                        if (i26 <= 0) {
                            this.j.a(this.n + ((this.o * j) / wh7Var.d), 1, wh7Var.c, 0, null);
                            this.o += wh7Var.g;
                            this.r = 0;
                            i2 = 0;
                            i = -1;
                            if (i2 == i) {
                            }
                            return i2;
                        }
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                    i = -1;
                    i2 = -1;
                    if (i2 == i) {
                    }
                    return i2;
                }
            }
        }
        i4 = 0;
        if (this.r != 0) {
        }
        f = this.j.f(t84Var, this.r, z);
        if (f != -1) {
        }
        i = -1;
        i2 = -1;
        if (i2 == i) {
        }
        return i2;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        return j((vb3) t84Var, true);
    }

    @Override // s84
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        nx9 nx9Var = this.s;
        if (nx9Var instanceof jp5) {
            de deVar = ((jp5) nx9Var).d.b;
            int i = deVar.b;
            if (i == 0 || j2 - deVar.g0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        this.h = u84Var;
        yzb c0 = u84Var.c0(0, 1);
        this.i = c0;
        this.j = c0;
        this.h.B();
    }

    public final bu2 g(vb3 vb3Var) {
        yw7 yw7Var = this.c;
        vb3Var.d(yw7Var.a, 0, 4, false);
        yw7Var.N(0);
        int m = yw7Var.m();
        wh7 wh7Var = this.d;
        wh7Var.a(m);
        return new bu2(vb3Var.c, vb3Var.d, wh7Var.f, wh7Var.c, (this.a & 2) != 0, true, -9223372036854775807L);
    }

    public final void h() {
        Object obj = this.s;
        if ((obj instanceof bu2) && ((au2) obj).c()) {
            long j = this.q;
            if (j == -1 || j == this.s.a()) {
                return;
            }
            bu2 bu2Var = (bu2) this.s;
            this.s = new bu2(this.q, bu2Var.b, bu2Var.e, bu2Var.c, bu2Var.g, false, bu2Var.i);
            u84 u84Var = this.h;
            u84Var.getClass();
            u84Var.f0(this.s);
            yzb yzbVar = this.i;
            yzbVar.getClass();
            yzbVar.d(this.s.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.f() > (r2 - 4)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(vb3 vb3Var) {
        nx9 nx9Var = this.s;
        if (nx9Var != null) {
            long a = nx9Var.a();
            if (a != -1) {
            }
        }
        try {
            return !vb3Var.d(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean j(vb3 vb3Var, boolean z) {
        int i;
        int i2;
        int a;
        vb3Var.f = 0;
        if (vb3Var.d == 0) {
            int i3 = this.a;
            nf7 Z = this.f.Z(vb3Var, !((i3 & 8) == 0) ? w : (i3 & 16) != 0 ? sl5.c : null, 131072);
            this.l = Z;
            if (Z != null) {
                this.e.b(Z);
            }
            i = (int) vb3Var.f();
            if (!z) {
                vb3Var.m(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!i(vb3Var)) {
                yw7 yw7Var = this.c;
                yw7Var.N(0);
                int m = yw7Var.m();
                if ((i2 == 0 || ((-128000) & m) == (i2 & (-128000))) && (a = wcd.a(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m);
                        i2 = m;
                    }
                    vb3Var.a(a - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == 131072) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        vb3Var.f = 0;
                        vb3Var.a(i + i6, false);
                    } else {
                        vb3Var.m(1, false);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                h();
                throw new EOFException();
            }
        }
        if (z) {
            vb3Var.m(i + i5, false);
        } else {
            vb3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }

    @Override // s84
    public final void release() {
    }

    public kh7(int i) {
        this(i, -9223372036854775807L);
    }
}
