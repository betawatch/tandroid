// default package

import java.io.EOFException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hf7 implements j74 {
    public static final yw6 w = new yw6((byte) 29);
    public final int a;
    public final long b;
    public final xu7 c;
    public final tf7 d;
    public final zr4 e;
    public final s34 f;
    public final yn3 g;
    public l74 h;
    public wxb i;
    public wxb j;
    public int k;
    public ld7 l;
    public ld7 m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public kv9 s;
    public boolean t;
    public boolean u;
    public long v;

    public hf7(int i, long j) {
        this.a = i;
        this.b = j;
        this.c = new xu7(10);
        this.d = new tf7();
        this.e = new zr4();
        this.n = -9223372036854775807L;
        this.f = new s34((byte) 8);
        yn3 yn3Var = new yn3();
        this.g = yn3Var;
        this.j = yn3Var;
        this.q = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r3 != 1231971951) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x034d, code lost:
    
        if (hg8.a.apply(r9) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0384, code lost:
    
        if (((nhb) r10).a.equals("TLEN") == false) goto L152;
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
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        zr4 zr4Var;
        tf7 tf7Var;
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
        jf7 jf7Var;
        boolean z2;
        ld7 ld7Var;
        int i9;
        kv9 qs2Var;
        ld7 ld7Var2;
        kv9 kv9Var;
        boolean z3;
        kv9 kv9Var2;
        kv9 qs2Var2;
        ld7 ld7Var3;
        jd7 jd7Var;
        jd7 jd7Var2;
        char c;
        long T;
        zr4 zr4Var2;
        int A;
        this.i.getClass();
        String str = g8c.a;
        int i10 = this.k;
        zr4 zr4Var3 = this.e;
        tf7 tf7Var2 = this.d;
        if (i10 == 0) {
            try {
                j((ja3) k74Var, false);
            } catch (EOFException unused) {
                zr4Var = zr4Var3;
                tf7Var = tf7Var2;
                i = -1;
                i2 = -1;
                j = 1000000;
                j2 = 1;
                j3 = -9223372036854775807L;
            }
        }
        if (this.s == null) {
            j = 1000000;
            xu7 xu7Var = new xu7(tf7Var2.c);
            j2 = 1;
            ((ja3) k74Var).d(xu7Var.a, 0, tf7Var2.c, false);
            int i11 = tf7Var2.a & 1;
            byte b = tf7Var2.e;
            int i12 = 21;
            if (i11 != 0) {
                if (b != 1) {
                    i12 = 36;
                }
            } else if (b == 1) {
                i12 = 13;
            }
            j5 = 0;
            if (xu7Var.c >= i12 + 4) {
                xu7Var.N(i12);
                i6 = xu7Var.m();
                if (i6 != 1483304551) {
                }
                if (i6 != 1231971951) {
                    if (i6 == 1447187017) {
                        ja3 ja3Var = (ja3) k74Var;
                        long j6 = ja3Var.c;
                        long j7 = ja3Var.d;
                        xu7Var.O(6);
                        long j8 = j7 + tf7Var2.c;
                        long m2 = j8 + xu7Var.m();
                        int m3 = xu7Var.m();
                        if (m3 <= 0) {
                            zr4Var2 = zr4Var3;
                            tf7Var = tf7Var2;
                        } else {
                            zr4 zr4Var4 = zr4Var3;
                            long Z = g8c.Z(tf7Var2.d, (m3 * tf7Var2.g) - 1);
                            int H = xu7Var.H();
                            int H2 = xu7Var.H();
                            int H3 = xu7Var.H();
                            xu7Var.O(2);
                            tf7Var = tf7Var2;
                            long j9 = j7 + tf7Var.c;
                            long[] jArr2 = new long[H];
                            long[] jArr3 = new long[H];
                            int i13 = 0;
                            while (true) {
                                zr4Var2 = zr4Var4;
                                long[] jArr4 = jArr2;
                                if (i13 < H) {
                                    jArr4[i13] = (i13 * Z) / H;
                                    jArr3[i13] = j9;
                                    if (H3 == 1) {
                                        A = xu7Var.A();
                                    } else if (H3 == 2) {
                                        A = xu7Var.H();
                                    } else if (H3 == 3) {
                                        A = xu7Var.D();
                                    } else {
                                        if (H3 != 4) {
                                            break;
                                        }
                                        A = xu7Var.E();
                                    }
                                    j9 += H2 * A;
                                    i13++;
                                    jArr2 = jArr4;
                                    zr4Var4 = zr4Var2;
                                } else {
                                    if (j6 != -1 && j6 != m2) {
                                        StringBuilder o = ug8.o(j6, "VBRI data size mismatch: ", ", ");
                                        o.append(m2);
                                        lad.f("VbriSeeker", o.toString());
                                    }
                                    if (m2 != j9) {
                                        StringBuilder o2 = ug8.o(m2, "VBRI bytes and ToC mismatch (using max): ", ", ");
                                        o2.append(j9);
                                        o2.append("\nSeeking will be inaccurate.");
                                        lad.f("VbriSeeker", o2.toString());
                                        m2 = Math.max(m2, j9);
                                    }
                                    qs2Var = new e9c(jArr4, jArr3, Z, j8, m2);
                                }
                            }
                            ja3Var.l(tf7Var.c, false);
                            zr4Var = zr4Var2;
                            ld7Var2 = this.l;
                            ja3 ja3Var2 = (ja3) k74Var;
                            long j10 = ja3Var2.d;
                            if (ld7Var2 != null) {
                            }
                            kv9Var = null;
                            z3 = this.t;
                            int i14 = this.a;
                            if (z3) {
                            }
                            this.s = kv9Var2;
                            this.i.d(kv9Var2.h());
                            this.h.g0(this.s);
                            ld7Var3 = this.l;
                            if (ld7Var3 == null) {
                            }
                            ld7Var3 = this.m;
                            em4 em4Var = new em4();
                            em4Var.r = ud7.n("audio/mpeg");
                            em4Var.s = ud7.n(tf7Var.b);
                            em4Var.t = TLObject.FLAG_12;
                            em4Var.M = tf7Var.e;
                            em4Var.O = tf7Var.d;
                            em4Var.Q = zr4Var.a;
                            em4Var.R = zr4Var.b;
                            em4Var.l = ld7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            yjb.v(em4Var, this.j);
                            this.p = ja3Var2.d;
                        }
                        qs2Var = null;
                        ja3Var.l(tf7Var.c, false);
                        zr4Var = zr4Var2;
                        ld7Var2 = this.l;
                        ja3 ja3Var22 = (ja3) k74Var;
                        long j102 = ja3Var22.d;
                        if (ld7Var2 != null) {
                        }
                        kv9Var = null;
                        z3 = this.t;
                        int i142 = this.a;
                        if (z3) {
                        }
                        this.s = kv9Var2;
                        this.i.d(kv9Var2.h());
                        this.h.g0(this.s);
                        ld7Var3 = this.l;
                        if (ld7Var3 == null) {
                        }
                        ld7Var3 = this.m;
                        em4 em4Var2 = new em4();
                        em4Var2.r = ud7.n("audio/mpeg");
                        em4Var2.s = ud7.n(tf7Var.b);
                        em4Var2.t = TLObject.FLAG_12;
                        em4Var2.M = tf7Var.e;
                        em4Var2.O = tf7Var.d;
                        em4Var2.Q = zr4Var.a;
                        em4Var2.R = zr4Var.b;
                        em4Var2.l = ld7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        yjb.v(em4Var2, this.j);
                        this.p = ja3Var22.d;
                    } else if (i6 != 1483304551) {
                        ((ja3) k74Var).f = 0;
                        zr4Var = zr4Var3;
                        tf7Var = tf7Var2;
                        qs2Var = null;
                        ld7Var2 = this.l;
                        ja3 ja3Var222 = (ja3) k74Var;
                        long j1022 = ja3Var222.d;
                        if (ld7Var2 != null) {
                            jd7[] jd7VarArr = ld7Var2.a;
                            int length = jd7VarArr.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    jd7Var = null;
                                    break;
                                }
                                jd7 jd7Var3 = jd7VarArr[i15];
                                if (de7.class.isAssignableFrom(jd7Var3.getClass())) {
                                    jd7Var = (jd7) de7.class.cast(jd7Var3);
                                }
                                jd7Var = null;
                                if (jd7Var != null) {
                                    break;
                                }
                                i15++;
                            }
                            de7 de7Var = (de7) jd7Var;
                            if (de7Var != null) {
                                int[] iArr = de7Var.e;
                                jd7[] jd7VarArr2 = ld7Var2.a;
                                int length2 = jd7VarArr2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= length2) {
                                        jd7Var2 = null;
                                        break;
                                    }
                                    jd7 jd7Var4 = jd7VarArr2[i16];
                                    if (nhb.class.isAssignableFrom(jd7Var4.getClass())) {
                                        jd7Var2 = (jd7) nhb.class.cast(jd7Var4);
                                    }
                                    jd7Var2 = null;
                                    if (jd7Var2 != null) {
                                        break;
                                    }
                                    i16++;
                                }
                                nhb nhbVar = (nhb) jd7Var2;
                                if (nhbVar == null) {
                                    T = -9223372036854775807L;
                                    c = 0;
                                } else {
                                    c = 0;
                                    T = g8c.T(Long.parseLong((String) nhbVar.c.get(0)));
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
                                    long j12 = j1022 + de7Var.c + iArr[i19];
                                    j11 += de7Var.d + de7Var.f[i19];
                                    jArr5[i18] = j12;
                                    jArr6[i18] = j11;
                                    i18++;
                                    length3 = length3;
                                    j1022 = j12;
                                }
                                kv9Var = new ee7(T, jArr5, jArr6);
                                z3 = this.t;
                                int i1422 = this.a;
                                if (z3) {
                                    if (kv9Var == null) {
                                        if (qs2Var == null) {
                                            qs2Var = g(ja3Var222);
                                        }
                                        kv9Var = qs2Var;
                                    }
                                    if ((i1422 & 4) != 0 && !kv9Var.c()) {
                                        qs2Var2 = new jn5(kv9Var.h(), ja3Var222.d, kv9Var.a());
                                    } else if ((kv9Var instanceof qs2) || kv9Var.c() || (i1422 & 1) == 0) {
                                        kv9Var2 = kv9Var;
                                    } else {
                                        long h = kv9Var.h();
                                        long a = kv9Var.a() != -1 ? kv9Var.a() : ja3Var222.c;
                                        if (h == -9223372036854775807L || a == -1) {
                                            kv9Var2 = g(ja3Var222);
                                        } else {
                                            long b2 = kv9Var.b() != -1 ? kv9Var.b() : 0L;
                                            int a2 = gpe.a(a - b2, h);
                                            if (a2 == -2147483647) {
                                                kv9Var2 = g(ja3Var222);
                                            } else {
                                                qs2Var2 = new qs2(a, b2, a2, -1, false, true, h);
                                            }
                                        }
                                    }
                                    kv9Var2 = qs2Var2;
                                } else {
                                    kv9Var2 = new jv9(-9223372036854775807L);
                                }
                                this.s = kv9Var2;
                                this.i.d(kv9Var2.h());
                                this.h.g0(this.s);
                                ld7Var3 = this.l;
                                if (ld7Var3 == null && (i1422 & 8) == 0) {
                                    ld7 ld7Var4 = this.m;
                                    if (ld7Var4 != null) {
                                        ld7Var3 = ld7Var3.b(ld7Var4);
                                    }
                                } else {
                                    ld7Var3 = this.m;
                                }
                                em4 em4Var22 = new em4();
                                em4Var22.r = ud7.n("audio/mpeg");
                                em4Var22.s = ud7.n(tf7Var.b);
                                em4Var22.t = TLObject.FLAG_12;
                                em4Var22.M = tf7Var.e;
                                em4Var22.O = tf7Var.d;
                                em4Var22.Q = zr4Var.a;
                                em4Var22.R = zr4Var.b;
                                em4Var22.l = ld7Var3;
                                if (this.s.g() != -2147483647) {
                                    em4Var22.i = this.s.g();
                                }
                                yjb.v(em4Var22, this.j);
                                this.p = ja3Var222.d;
                            }
                        }
                        kv9Var = null;
                        z3 = this.t;
                        int i14222 = this.a;
                        if (z3) {
                        }
                        this.s = kv9Var2;
                        this.i.d(kv9Var2.h());
                        this.h.g0(this.s);
                        ld7Var3 = this.l;
                        if (ld7Var3 == null) {
                        }
                        ld7Var3 = this.m;
                        em4 em4Var222 = new em4();
                        em4Var222.r = ud7.n("audio/mpeg");
                        em4Var222.s = ud7.n(tf7Var.b);
                        em4Var222.t = TLObject.FLAG_12;
                        em4Var222.M = tf7Var.e;
                        em4Var222.O = tf7Var.d;
                        em4Var222.Q = zr4Var.a;
                        em4Var222.R = zr4Var.b;
                        em4Var222.l = ld7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        yjb.v(em4Var222, this.j);
                        this.p = ja3Var222.d;
                    }
                }
                tf7Var = tf7Var2;
                m = xu7Var.m();
                int E = (m & 1) != 0 ? xu7Var.E() : -1;
                long C = (m & 2) != 0 ? xu7Var.C() : -1L;
                if ((m & 4) == 4) {
                    long[] jArr7 = new long[100];
                    for (int i20 = 0; i20 < 100; i20++) {
                        jArr7[i20] = xu7Var.A();
                    }
                    jArr = jArr7;
                } else {
                    jArr = null;
                }
                if ((m & 8) != 0) {
                    xu7Var.O(4);
                }
                if (xu7Var.a() >= 24) {
                    String y = xu7Var.y(9, StandardCharsets.UTF_8);
                    xu7Var.O(2);
                    float intBitsToFloat = Float.intBitsToFloat(xu7Var.m());
                    int H4 = xu7Var.H();
                    int H5 = xu7Var.H();
                    if7 a3 = if7.a(H4);
                    if7 a4 = if7.a(H5);
                    jf7Var = (intBitsToFloat <= 0.0f && a3 == null && a4 == null) ? null : new jf7(intBitsToFloat, a3, a4);
                    xu7Var.O(2);
                    int D = xu7Var.D();
                    i8 = (16773120 & D) >> 12;
                    i7 = D & 4095;
                    if (y.startsWith("LAME") || y.startsWith("Lavf") || y.startsWith("Lavc")) {
                        i8 += 529;
                        i7 = Math.max(0, i7 - 529);
                    }
                } else {
                    i7 = -1;
                    i8 = -1;
                    jf7Var = null;
                }
                long j13 = E;
                kj6 kj6Var = new kj6();
                tf7 tf7Var3 = new tf7();
                tf7Var3.a = tf7Var.a;
                tf7Var3.b = tf7Var.b;
                tf7Var3.c = tf7Var.c;
                tf7Var3.d = tf7Var.d;
                tf7Var3.e = tf7Var.e;
                tf7Var3.f = tf7Var.f;
                tf7Var3.g = tf7Var.g;
                kj6Var.d = tf7Var3;
                kj6Var.a = j13;
                kj6Var.b = i8;
                kj6Var.c = i7;
                tf7 tf7Var4 = (tf7) kj6Var.d;
                zr4Var = zr4Var3;
                if ((zr4Var.a != -1 || zr4Var.b == -1) && i8 != -1 && i7 != -1) {
                    zr4Var.a = i8;
                    zr4Var.b = i7;
                }
                if (jf7Var != null) {
                    z2 = false;
                    ld7Var = new ld7(jf7Var);
                } else {
                    z2 = false;
                    ld7Var = null;
                }
                this.m = ld7Var;
                ja3 ja3Var3 = (ja3) k74Var;
                long j14 = ja3Var3.d;
                ja3Var3.l(tf7Var.c, z2);
                long j15 = ja3Var3.c;
                if (i6 == 1483304551) {
                    long a5 = kj6Var.a();
                    if (a5 != -9223372036854775807L) {
                        if (C != -1 && j15 != -1 && j14 + C != j15) {
                            long j16 = j15 - j14;
                            StringBuilder o3 = ug8.o(j16, "Data size mismatch between stream (", ") and Xing frame (");
                            o3.append(C);
                            o3.append("), using smaller value.");
                            lad.e("XingSeeker", o3.toString());
                            C = Math.min(C, j16);
                        }
                        qs2Var = new xyc(j14, tf7Var4.c, a5, C, jArr);
                        ld7Var2 = this.l;
                        ja3 ja3Var2222 = (ja3) k74Var;
                        long j10222 = ja3Var2222.d;
                        if (ld7Var2 != null) {
                        }
                        kv9Var = null;
                        z3 = this.t;
                        int i142222 = this.a;
                        if (z3) {
                        }
                        this.s = kv9Var2;
                        this.i.d(kv9Var2.h());
                        this.h.g0(this.s);
                        ld7Var3 = this.l;
                        if (ld7Var3 == null) {
                        }
                        ld7Var3 = this.m;
                        em4 em4Var2222 = new em4();
                        em4Var2222.r = ud7.n("audio/mpeg");
                        em4Var2222.s = ud7.n(tf7Var.b);
                        em4Var2222.t = TLObject.FLAG_12;
                        em4Var2222.M = tf7Var.e;
                        em4Var2222.O = tf7Var.d;
                        em4Var2222.Q = zr4Var.a;
                        em4Var2222.R = zr4Var.b;
                        em4Var2222.l = ld7Var3;
                        if (this.s.g() != -2147483647) {
                        }
                        yjb.v(em4Var2222, this.j);
                        this.p = ja3Var2222.d;
                    }
                    qs2Var = null;
                    ld7Var2 = this.l;
                    ja3 ja3Var22222 = (ja3) k74Var;
                    long j102222 = ja3Var22222.d;
                    if (ld7Var2 != null) {
                    }
                    kv9Var = null;
                    z3 = this.t;
                    int i1422222 = this.a;
                    if (z3) {
                    }
                    this.s = kv9Var2;
                    this.i.d(kv9Var2.h());
                    this.h.g0(this.s);
                    ld7Var3 = this.l;
                    if (ld7Var3 == null) {
                    }
                    ld7Var3 = this.m;
                    em4 em4Var22222 = new em4();
                    em4Var22222.r = ud7.n("audio/mpeg");
                    em4Var22222.s = ud7.n(tf7Var.b);
                    em4Var22222.t = TLObject.FLAG_12;
                    em4Var22222.M = tf7Var.e;
                    em4Var22222.O = tf7Var.d;
                    em4Var22222.Q = zr4Var.a;
                    em4Var22222.R = zr4Var.b;
                    em4Var22222.l = ld7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    yjb.v(em4Var22222, this.j);
                    this.p = ja3Var22222.d;
                } else {
                    long a6 = kj6Var.a();
                    if (a6 != -9223372036854775807L) {
                        if (C != -1) {
                            j15 = j14 + C;
                            i9 = tf7Var4.c;
                        } else if (j15 != -1) {
                            C = j15 - j14;
                            i9 = tf7Var4.c;
                        }
                        long j17 = C - i9;
                        long j18 = j15;
                        int a7 = gpe.a(j17, a6);
                        if (a7 != -2147483647) {
                            qs2Var = new qs2(j18, j14 + tf7Var4.c, a7, gle.b(yne.b(j17, j13, RoundingMode.HALF_UP)), false, true, a6);
                            ld7Var2 = this.l;
                            ja3 ja3Var222222 = (ja3) k74Var;
                            long j1022222 = ja3Var222222.d;
                            if (ld7Var2 != null) {
                            }
                            kv9Var = null;
                            z3 = this.t;
                            int i14222222 = this.a;
                            if (z3) {
                            }
                            this.s = kv9Var2;
                            this.i.d(kv9Var2.h());
                            this.h.g0(this.s);
                            ld7Var3 = this.l;
                            if (ld7Var3 == null) {
                            }
                            ld7Var3 = this.m;
                            em4 em4Var222222 = new em4();
                            em4Var222222.r = ud7.n("audio/mpeg");
                            em4Var222222.s = ud7.n(tf7Var.b);
                            em4Var222222.t = TLObject.FLAG_12;
                            em4Var222222.M = tf7Var.e;
                            em4Var222222.O = tf7Var.d;
                            em4Var222222.Q = zr4Var.a;
                            em4Var222222.R = zr4Var.b;
                            em4Var222222.l = ld7Var3;
                            if (this.s.g() != -2147483647) {
                            }
                            yjb.v(em4Var222222, this.j);
                            this.p = ja3Var222222.d;
                        }
                    }
                    qs2Var = null;
                    ld7Var2 = this.l;
                    ja3 ja3Var2222222 = (ja3) k74Var;
                    long j10222222 = ja3Var2222222.d;
                    if (ld7Var2 != null) {
                    }
                    kv9Var = null;
                    z3 = this.t;
                    int i142222222 = this.a;
                    if (z3) {
                    }
                    this.s = kv9Var2;
                    this.i.d(kv9Var2.h());
                    this.h.g0(this.s);
                    ld7Var3 = this.l;
                    if (ld7Var3 == null) {
                    }
                    ld7Var3 = this.m;
                    em4 em4Var2222222 = new em4();
                    em4Var2222222.r = ud7.n("audio/mpeg");
                    em4Var2222222.s = ud7.n(tf7Var.b);
                    em4Var2222222.t = TLObject.FLAG_12;
                    em4Var2222222.M = tf7Var.e;
                    em4Var2222222.O = tf7Var.d;
                    em4Var2222222.Q = zr4Var.a;
                    em4Var2222222.R = zr4Var.b;
                    em4Var2222222.l = ld7Var3;
                    if (this.s.g() != -2147483647) {
                    }
                    yjb.v(em4Var2222222, this.j);
                    this.p = ja3Var2222222.d;
                }
            }
            if (xu7Var.c >= 40) {
                xu7Var.N(36);
                if (xu7Var.m() == 1447187017) {
                    i6 = 1447187017;
                    if (i6 != 1231971951) {
                    }
                    tf7Var = tf7Var2;
                    m = xu7Var.m();
                    if ((m & 1) != 0) {
                    }
                    if ((m & 2) != 0) {
                    }
                    if ((m & 4) == 4) {
                    }
                    if ((m & 8) != 0) {
                    }
                    if (xu7Var.a() >= 24) {
                    }
                    long j132 = E;
                    kj6 kj6Var2 = new kj6();
                    tf7 tf7Var32 = new tf7();
                    tf7Var32.a = tf7Var.a;
                    tf7Var32.b = tf7Var.b;
                    tf7Var32.c = tf7Var.c;
                    tf7Var32.d = tf7Var.d;
                    tf7Var32.e = tf7Var.e;
                    tf7Var32.f = tf7Var.f;
                    tf7Var32.g = tf7Var.g;
                    kj6Var2.d = tf7Var32;
                    kj6Var2.a = j132;
                    kj6Var2.b = i8;
                    kj6Var2.c = i7;
                    tf7 tf7Var42 = (tf7) kj6Var2.d;
                    zr4Var = zr4Var3;
                    if (zr4Var.a != -1) {
                    }
                    zr4Var.a = i8;
                    zr4Var.b = i7;
                    if (jf7Var != null) {
                    }
                    this.m = ld7Var;
                    ja3 ja3Var32 = (ja3) k74Var;
                    long j142 = ja3Var32.d;
                    ja3Var32.l(tf7Var.c, z2);
                    long j152 = ja3Var32.c;
                    if (i6 == 1483304551) {
                    }
                }
            }
            i6 = 0;
            if (i6 != 1231971951) {
            }
            tf7Var = tf7Var2;
            m = xu7Var.m();
            if ((m & 1) != 0) {
            }
            if ((m & 2) != 0) {
            }
            if ((m & 4) == 4) {
            }
            if ((m & 8) != 0) {
            }
            if (xu7Var.a() >= 24) {
            }
            long j1322 = E;
            kj6 kj6Var22 = new kj6();
            tf7 tf7Var322 = new tf7();
            tf7Var322.a = tf7Var.a;
            tf7Var322.b = tf7Var.b;
            tf7Var322.c = tf7Var.c;
            tf7Var322.d = tf7Var.d;
            tf7Var322.e = tf7Var.e;
            tf7Var322.f = tf7Var.f;
            tf7Var322.g = tf7Var.g;
            kj6Var22.d = tf7Var322;
            kj6Var22.a = j1322;
            kj6Var22.b = i8;
            kj6Var22.c = i7;
            tf7 tf7Var422 = (tf7) kj6Var22.d;
            zr4Var = zr4Var3;
            if (zr4Var.a != -1) {
            }
            zr4Var.a = i8;
            zr4Var.b = i7;
            if (jf7Var != null) {
            }
            this.m = ld7Var;
            ja3 ja3Var322 = (ja3) k74Var;
            long j1422 = ja3Var322.d;
            ja3Var322.l(tf7Var.c, z2);
            long j1522 = ja3Var322.c;
            if (i6 == 1483304551) {
            }
        } else {
            zr4Var = zr4Var3;
            tf7Var = tf7Var2;
            j = 1000000;
            j2 = 1;
            j5 = 0;
            long j19 = this.p;
            if (j19 != 0) {
                long j20 = ((ja3) k74Var).d;
                if (j20 < j19) {
                    int i21 = (int) (j19 - j20);
                    i4 = 0;
                    ((ja3) k74Var).l(i21, false);
                    if (this.r != 0) {
                        ((ja3) k74Var).f = i4;
                        ja3 ja3Var4 = (ja3) k74Var;
                        if (i(ja3Var4)) {
                            j3 = -9223372036854775807L;
                            i = -1;
                            i2 = -1;
                            if (i2 == i) {
                                kv9 kv9Var3 = this.s;
                                if (kv9Var3 instanceof jn5) {
                                    long j21 = this.o - j2;
                                    if (j21 >= 0) {
                                        int i22 = zr4Var.a;
                                        if (i22 != i && (i3 = zr4Var.b) != i) {
                                            j21 = (j21 - i22) - i3;
                                        }
                                        if (j21 >= 0) {
                                            j4 = ((j21 * j) / tf7Var.d) + this.n;
                                            if (kv9Var3.h() != j4) {
                                                kv9 kv9Var4 = this.s;
                                                ((jn5) kv9Var4).d.c = j4;
                                                this.h.g0(kv9Var4);
                                                this.i.d(this.s.h());
                                            }
                                        }
                                    }
                                    j4 = j3;
                                    if (kv9Var3.h() != j4) {
                                    }
                                }
                            }
                            return i2;
                        }
                        xu7 xu7Var2 = this.c;
                        xu7Var2.N(i4);
                        int m4 = xu7Var2.m();
                        if (((-128000) & m4) != (this.k & (-128000))) {
                            r4 = 0;
                            j3 = -9223372036854775807L;
                            i5 = 1;
                        } else if (uad.a(m4) == -1) {
                            r4 = 0;
                            i5 = 1;
                            j3 = -9223372036854775807L;
                        } else {
                            tf7Var.a(m4);
                            long j22 = this.n;
                            j3 = -9223372036854775807L;
                            if (j22 == -9223372036854775807L) {
                                j22 = this.s.e(ja3Var4.d);
                                this.n = j22;
                                long j23 = this.b;
                                if (j23 != -9223372036854775807L) {
                                    j22 = (j23 - this.s.e(j5)) + this.n;
                                    this.n = j22;
                                }
                            }
                            int i23 = tf7Var.c;
                            this.r = i23;
                            long j24 = ja3Var4.d + i23;
                            this.q = j24;
                            kv9 kv9Var5 = this.s;
                            if (kv9Var5 instanceof jn5) {
                                in5 in5Var = ((jn5) kv9Var5).d;
                                long j25 = (((this.o + tf7Var.g) * j) / tf7Var.d) + j22;
                                dd ddVar = in5Var.b;
                                int i24 = ddVar.b;
                                if (i24 == 0 || j25 - ddVar.f0(i24 - 1) >= 100000) {
                                    in5Var.i(j25, j24);
                                }
                                if (this.u) {
                                    long j26 = this.v;
                                    dd ddVar2 = in5Var.b;
                                    int i25 = ddVar2.b;
                                    if (i25 != 0 && j26 - ddVar2.f0(i25 - 1) < 100000) {
                                        this.u = false;
                                        this.j = this.i;
                                    }
                                }
                            }
                            z = true;
                        }
                        ja3Var4.l(i5, r4);
                        this.k = r4;
                        i = -1;
                        i2 = 0;
                        if (i2 == i) {
                        }
                        return i2;
                    }
                    z = true;
                    j3 = -9223372036854775807L;
                    f = this.j.f(k74Var, this.r, z);
                    if (f != -1) {
                        int i26 = this.r - f;
                        this.r = i26;
                        if (i26 <= 0) {
                            this.j.a(this.n + ((this.o * j) / tf7Var.d), 1, tf7Var.c, 0, null);
                            this.o += tf7Var.g;
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
        f = this.j.f(k74Var, this.r, z);
        if (f != -1) {
        }
        i = -1;
        i2 = -1;
        if (i2 == i) {
        }
        return i2;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        return j((ja3) k74Var, true);
    }

    @Override // j74
    public final void d(long j, long j2) {
        this.k = 0;
        this.n = -9223372036854775807L;
        this.o = 0L;
        this.r = 0;
        this.q = -1L;
        this.v = j2;
        kv9 kv9Var = this.s;
        if (kv9Var instanceof jn5) {
            dd ddVar = ((jn5) kv9Var).d.b;
            int i = ddVar.b;
            if (i == 0 || j2 - ddVar.f0(i - 1) >= 100000) {
                this.u = true;
                this.j = this.g;
            }
        }
    }

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        this.h = l74Var;
        wxb S = l74Var.S(0, 1);
        this.i = S;
        this.j = S;
        this.h.z();
    }

    public final qs2 g(ja3 ja3Var) {
        xu7 xu7Var = this.c;
        ja3Var.d(xu7Var.a, 0, 4, false);
        xu7Var.N(0);
        int m = xu7Var.m();
        tf7 tf7Var = this.d;
        tf7Var.a(m);
        return new qs2(ja3Var.c, ja3Var.d, tf7Var.f, tf7Var.c, (this.a & 2) != 0, true, -9223372036854775807L);
    }

    public final void h() {
        fv9 fv9Var = this.s;
        if ((fv9Var instanceof qs2) && ((ps2) fv9Var).c()) {
            long j = this.q;
            if (j == -1 || j == this.s.a()) {
                return;
            }
            qs2 qs2Var = (qs2) this.s;
            this.s = new qs2(this.q, qs2Var.b, qs2Var.e, qs2Var.c, qs2Var.g, false, qs2Var.i);
            l74 l74Var = this.h;
            l74Var.getClass();
            l74Var.g0(this.s);
            wxb wxbVar = this.i;
            wxbVar.getClass();
            wxbVar.d(this.s.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.f() > (r2 - 4)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(ja3 ja3Var) {
        kv9 kv9Var = this.s;
        if (kv9Var != null) {
            long a = kv9Var.a();
            if (a != -1) {
            }
        }
        try {
            return !ja3Var.d(this.c.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean j(ja3 ja3Var, boolean z) {
        int i;
        int i2;
        int a;
        ja3Var.f = 0;
        if (ja3Var.d == 0) {
            int i3 = this.a;
            ld7 O = this.f.O(ja3Var, !((i3 & 8) == 0) ? w : (i3 & 16) != 0 ? tj5.c : null, 131072);
            this.l = O;
            if (O != null) {
                this.e.b(O);
            }
            i = (int) ja3Var.f();
            if (!z) {
                ja3Var.l(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!i(ja3Var)) {
                xu7 xu7Var = this.c;
                xu7Var.N(0);
                int m = xu7Var.m();
                if ((i2 == 0 || ((-128000) & m) == (i2 & (-128000))) && (a = uad.a(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.d.a(m);
                        i2 = m;
                    }
                    ja3Var.a(a - 4, false);
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
                        ja3Var.f = 0;
                        ja3Var.a(i + i6, false);
                    } else {
                        ja3Var.l(1, false);
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
            ja3Var.l(i + i5, false);
        } else {
            ja3Var.f = 0;
        }
        this.k = i2;
        return true;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }

    @Override // j74
    public final void release() {
    }

    public hf7(int i) {
        this(i, -9223372036854775807L);
    }
}
