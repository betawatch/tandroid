// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fe5 implements av3 {
    public final oz9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public x1c j;
    public ee5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final yj7 d = new yj7(7);
    public final yj7 e = new yj7(8);
    public final yj7 f = new yj7(6);
    public long m = -9223372036854775807L;
    public final ey7 o = new ey7();

    public fe5(oz9 oz9Var, boolean z, boolean z2) {
        this.a = oz9Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01b4, code lost:
    
        if (r3.j == r4.j) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01be, code lost:
    
        if (r8 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d0, code lost:
    
        if (r3.n == r4.n) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
    
        if (r3.p == r4.p) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ef, code lost:
    
        if (r3.l == r4.l) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024b, code lost:
    
        if (r3 != 1) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, long j, long j2) {
        int i3;
        boolean z;
        yj7 yj7Var;
        ee5 ee5Var;
        boolean z2;
        long j3;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        lo loVar = this.a.d;
        if (!this.l || this.k.c) {
            yj7 yj7Var2 = this.d;
            yj7Var2.b(i2);
            yj7 yj7Var3 = this.e;
            yj7Var3.b(i2);
            boolean z7 = this.l;
            boolean z8 = yj7Var2.c;
            if (z7) {
                i3 = 2;
                z = false;
                if (z8) {
                    gk7 k = rfd.k(3, yj7Var2.e, yj7Var2.d);
                    loVar.l(k.s);
                    this.k.d.append(k.d, k);
                    yj7Var2.c();
                } else if (yj7Var3.c) {
                    vh6 vh6Var = new vh6(yj7Var3.d, 4, yj7Var3.e);
                    int f = vh6Var.f();
                    int f2 = vh6Var.f();
                    vh6Var.j();
                    this.k.e.append(f, new fk7(f, f2, vh6Var.d()));
                    yj7Var3.c();
                }
            } else if (z8 && yj7Var3.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(yj7Var2.d, yj7Var2.e));
                arrayList.add(Arrays.copyOf(yj7Var3.d, yj7Var3.e));
                gk7 k2 = rfd.k(3, yj7Var2.e, yj7Var2.d);
                int i6 = k2.s;
                vh6 vh6Var2 = new vh6(yj7Var3.d, 4, yj7Var3.e);
                int f3 = vh6Var2.f();
                int f4 = vh6Var2.f();
                vh6Var2.j();
                i3 = 2;
                fk7 fk7Var = new fk7(f3, f4, vh6Var2.d());
                int i7 = k2.a;
                int i8 = k2.b;
                z = false;
                int i9 = k2.c;
                byte[] bArr = rk2.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
                x1c x1cVar = this.j;
                jo4 jo4Var = new jo4();
                jo4Var.a = this.i;
                jo4Var.r = eg7.n("video/mp2t");
                jo4Var.s = eg7.n("video/avc");
                jo4Var.k = format;
                jo4Var.z = k2.e;
                jo4Var.A = k2.f;
                jo4Var.K = new bm2(k2.p, k2.q, k2.r, null, k2.h + 8, k2.i + 8);
                jo4Var.H = k2.g;
                jo4Var.v = arrayList;
                jo4Var.u = i6;
                xnb.v(jo4Var, x1cVar);
                this.l = true;
                loVar.l(i6);
                this.k.d.append(k2.d, k2);
                this.k.e.append(f3, fk7Var);
                yj7Var2.c();
                yj7Var3.c();
            }
            yj7Var = this.f;
            if (yj7Var.b(i2)) {
                int m = rfd.m(yj7Var.e, yj7Var.d);
                byte[] bArr2 = yj7Var.d;
                ey7 ey7Var = this.o;
                ey7Var.L(m, bArr2);
                ey7Var.N(4);
                loVar.a(j2, ey7Var);
            }
            ee5Var = this.k;
            z2 = this.l;
            if (ee5Var.i != 9) {
                if (ee5Var.c) {
                    de5 de5Var = ee5Var.n;
                    de5 de5Var2 = ee5Var.m;
                    if (de5Var.a) {
                        if (de5Var2.a) {
                            gk7 gk7Var = de5Var.c;
                            gk7Var.getClass();
                            gk7 gk7Var2 = de5Var2.c;
                            gk7Var2.getClass();
                            int i10 = gk7Var2.m;
                            if (de5Var.f == de5Var2.f) {
                                if (de5Var.g == de5Var2.g) {
                                    if (de5Var.h == de5Var2.h) {
                                        if (de5Var.i) {
                                            if (de5Var2.i) {
                                            }
                                        }
                                        int i11 = de5Var.d;
                                        int i12 = de5Var2.d;
                                        if (i11 != i12) {
                                            if (i11 != 0) {
                                            }
                                        }
                                        int i13 = gk7Var.m;
                                        if (i13 == 0) {
                                            if (i10 == 0) {
                                                if (de5Var.m == de5Var2.m) {
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                            if (i10 == 1) {
                                                if (de5Var.o == de5Var2.o) {
                                                }
                                            }
                                        }
                                        boolean z9 = de5Var.k;
                                        if (z9 == de5Var2.k) {
                                            if (z9) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (ee5Var.b) {
                    de5 de5Var3 = ee5Var.n;
                    z3 = de5Var3.b && ((i5 = de5Var3.e) == 7 || i5 == i3);
                } else {
                    z3 = ee5Var.s;
                }
                boolean z10 = ee5Var.r;
                i4 = ee5Var.i;
                if (i4 != 5) {
                    z6 = z3 ? true : true;
                    z4 = false;
                    z5 = z10 | z4;
                    ee5Var.r = z5;
                    ee5Var.i = 24;
                    if (z5) {
                        return;
                    }
                    this.n = false;
                    return;
                }
                z4 = z6;
                z5 = z10 | z4;
                ee5Var.r = z5;
                ee5Var.i = 24;
                if (z5) {
                }
            }
            if (z2 && ee5Var.o) {
                long j4 = ee5Var.j;
                int i14 = i + ((int) (j - j4));
                j3 = ee5Var.q;
                if (j3 != -9223372036854775807L) {
                    long j5 = ee5Var.p;
                    if (j4 != j5) {
                        ee5Var.a.a(j3, ee5Var.r ? 1 : 0, (int) (j4 - j5), i14, null);
                    }
                }
            }
            ee5Var.p = ee5Var.j;
            ee5Var.q = ee5Var.l;
            ee5Var.r = z;
            ee5Var.o = true;
            if (ee5Var.b) {
            }
            boolean z102 = ee5Var.r;
            i4 = ee5Var.i;
            if (i4 != 5) {
            }
            z4 = z6;
            z5 = z102 | z4;
            ee5Var.r = z5;
            ee5Var.i = 24;
            if (z5) {
            }
        }
        i3 = 2;
        z = false;
        yj7Var = this.f;
        if (yj7Var.b(i2)) {
        }
        ee5Var = this.k;
        z2 = this.l;
        if (ee5Var.i != 9) {
        }
        if (z2) {
            long j42 = ee5Var.j;
            int i142 = i + ((int) (j - j42));
            j3 = ee5Var.q;
            if (j3 != -9223372036854775807L) {
            }
        }
        ee5Var.p = ee5Var.j;
        ee5Var.q = ee5Var.l;
        ee5Var.r = z;
        ee5Var.o = true;
        if (ee5Var.b) {
        }
        boolean z1022 = ee5Var.r;
        i4 = ee5Var.i;
        if (i4 != 5) {
        }
        z4 = z6;
        z5 = z1022 | z4;
        ee5Var.r = z5;
        ee5Var.i = 24;
        if (z5) {
        }
    }

    @Override // av3
    public final void b(ey7 ey7Var) {
        int i;
        this.j.getClass();
        String str = gcc.a;
        int i2 = ey7Var.b;
        int i3 = ey7Var.c;
        byte[] bArr = ey7Var.a;
        this.g += ey7Var.a();
        this.j.e(ey7Var.a(), ey7Var);
        while (true) {
            int b = rfd.b(bArr, i2, i3, this.h);
            if (b == i3) {
                c(i2, i3, bArr);
                return;
            }
            int i4 = bArr[b + 3] & 31;
            if (b <= 0 || bArr[b - 1] != 0) {
                i = 3;
            } else {
                b--;
                i = 4;
            }
            int i5 = b;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                c(i2, i5, bArr);
            }
            int i8 = i3 - i5;
            long j = this.g - i8;
            a(i8, i7 < 0 ? -i7 : 0, j, this.m);
            i(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f2  */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int g;
        int i7;
        if (!this.l || this.k.c) {
            this.d.a(i, i2, bArr);
            this.e.a(i, i2, bArr);
        }
        this.f.a(i, i2, bArr);
        ee5 ee5Var = this.k;
        SparseArray sparseArray = ee5Var.e;
        vh6 vh6Var = ee5Var.f;
        if (ee5Var.k) {
            int i8 = i2 - i;
            byte[] bArr2 = ee5Var.g;
            int length = bArr2.length;
            int i9 = ee5Var.h + i8;
            if (length < i9) {
                bArr2 = Arrays.copyOf(bArr2, i9 << 1);
                ee5Var.g = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, ee5Var.h, i8);
            int i10 = ee5Var.h + i8;
            ee5Var.h = i10;
            vh6Var.e = ee5Var.g;
            vh6Var.b = 0;
            vh6Var.c = 0;
            vh6Var.a = i10;
            vh6Var.d = 0;
            vh6Var.a();
            if (vh6Var.b(8)) {
                vh6Var.j();
                int e = vh6Var.e(2);
                vh6Var.k(5);
                if (vh6Var.c()) {
                    vh6Var.f();
                    if (vh6Var.c()) {
                        int f = vh6Var.f();
                        if (!ee5Var.c) {
                            ee5Var.k = false;
                            de5 de5Var = ee5Var.n;
                            de5Var.e = f;
                            de5Var.b = true;
                            return;
                        }
                        if (vh6Var.c()) {
                            int f2 = vh6Var.f();
                            if (sparseArray.indexOfKey(f2) < 0) {
                                ee5Var.k = false;
                                return;
                            }
                            fk7 fk7Var = (fk7) sparseArray.get(f2);
                            SparseArray sparseArray2 = ee5Var.d;
                            int i11 = fk7Var.a;
                            boolean z5 = fk7Var.b;
                            gk7 gk7Var = (gk7) sparseArray2.get(i11);
                            boolean z6 = gk7Var.j;
                            int i12 = gk7Var.n;
                            int i13 = gk7Var.l;
                            if (z6) {
                                if (!vh6Var.b(2)) {
                                    return;
                                } else {
                                    vh6Var.k(2);
                                }
                            }
                            if (vh6Var.b(i13)) {
                                int e2 = vh6Var.e(i13);
                                if (gk7Var.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!vh6Var.b(1)) {
                                        return;
                                    }
                                    z = vh6Var.d();
                                    if (z) {
                                        if (vh6Var.b(1)) {
                                            z2 = vh6Var.d();
                                            z3 = true;
                                            z4 = ee5Var.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!vh6Var.c()) {
                                                return;
                                            } else {
                                                i3 = vh6Var.f();
                                            }
                                            i4 = gk7Var.m;
                                            if (i4 != 0) {
                                                if (!vh6Var.b(i12)) {
                                                    return;
                                                }
                                                i5 = vh6Var.e(i12);
                                                if (z5 && !z) {
                                                    if (vh6Var.c()) {
                                                        i7 = vh6Var.g();
                                                        i6 = 0;
                                                        g = 0;
                                                        de5 de5Var2 = ee5Var.n;
                                                        de5Var2.c = gk7Var;
                                                        de5Var2.d = e;
                                                        de5Var2.e = f;
                                                        de5Var2.f = e2;
                                                        de5Var2.g = f2;
                                                        de5Var2.h = z;
                                                        de5Var2.i = z3;
                                                        de5Var2.j = z2;
                                                        de5Var2.k = z4;
                                                        de5Var2.l = i3;
                                                        de5Var2.m = i5;
                                                        de5Var2.n = i7;
                                                        de5Var2.o = i6;
                                                        de5Var2.p = g;
                                                        de5Var2.a = true;
                                                        de5Var2.b = true;
                                                        ee5Var.k = false;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                if (i4 == 1 && !gk7Var.o) {
                                                    if (vh6Var.c()) {
                                                        int g2 = vh6Var.g();
                                                        if (!z5 || z) {
                                                            i6 = g2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            g = 0;
                                                            de5 de5Var22 = ee5Var.n;
                                                            de5Var22.c = gk7Var;
                                                            de5Var22.d = e;
                                                            de5Var22.e = f;
                                                            de5Var22.f = e2;
                                                            de5Var22.g = f2;
                                                            de5Var22.h = z;
                                                            de5Var22.i = z3;
                                                            de5Var22.j = z2;
                                                            de5Var22.k = z4;
                                                            de5Var22.l = i3;
                                                            de5Var22.m = i5;
                                                            de5Var22.n = i7;
                                                            de5Var22.o = i6;
                                                            de5Var22.p = g;
                                                            de5Var22.a = true;
                                                            de5Var22.b = true;
                                                            ee5Var.k = false;
                                                        }
                                                        if (vh6Var.c()) {
                                                            g = vh6Var.g();
                                                            i7 = 0;
                                                            i6 = g2;
                                                            i5 = 0;
                                                            de5 de5Var222 = ee5Var.n;
                                                            de5Var222.c = gk7Var;
                                                            de5Var222.d = e;
                                                            de5Var222.e = f;
                                                            de5Var222.f = e2;
                                                            de5Var222.g = f2;
                                                            de5Var222.h = z;
                                                            de5Var222.i = z3;
                                                            de5Var222.j = z2;
                                                            de5Var222.k = z4;
                                                            de5Var222.l = i3;
                                                            de5Var222.m = i5;
                                                            de5Var222.n = i7;
                                                            de5Var222.o = i6;
                                                            de5Var222.p = g;
                                                            de5Var222.a = true;
                                                            de5Var222.b = true;
                                                            ee5Var.k = false;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i5 = 0;
                                            }
                                            i6 = 0;
                                            i7 = 0;
                                            g = 0;
                                            de5 de5Var2222 = ee5Var.n;
                                            de5Var2222.c = gk7Var;
                                            de5Var2222.d = e;
                                            de5Var2222.e = f;
                                            de5Var2222.f = e2;
                                            de5Var2222.g = f2;
                                            de5Var2222.h = z;
                                            de5Var2222.i = z3;
                                            de5Var2222.j = z2;
                                            de5Var2222.k = z4;
                                            de5Var2222.l = i3;
                                            de5Var2222.m = i5;
                                            de5Var2222.n = i7;
                                            de5Var2222.o = i6;
                                            de5Var2222.p = g;
                                            de5Var2222.a = true;
                                            de5Var2222.b = true;
                                            ee5Var.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (ee5Var.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = gk7Var.m;
                                if (i4 != 0) {
                                }
                                i6 = 0;
                                i7 = 0;
                                g = 0;
                                de5 de5Var22222 = ee5Var.n;
                                de5Var22222.c = gk7Var;
                                de5Var22222.d = e;
                                de5Var22222.e = f;
                                de5Var22222.f = e2;
                                de5Var22222.g = f2;
                                de5Var22222.h = z;
                                de5Var22222.i = z3;
                                de5Var22222.j = z2;
                                de5Var22222.k = z4;
                                de5Var22222.l = i3;
                                de5Var22222.m = i5;
                                de5Var22222.n = i7;
                                de5Var22222.o = i6;
                                de5Var22222.p = g;
                                de5Var22222.a = true;
                                de5Var22222.b = true;
                                ee5Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // av3
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        rfd.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        ee5 ee5Var = this.k;
        if (ee5Var != null) {
            ee5Var.k = false;
            ee5Var.o = false;
            de5 de5Var = ee5Var.n;
            de5Var.b = false;
            de5Var.a = false;
        }
    }

    @Override // av3
    public final void f() {
        this.j.getClass();
        String str = gcc.a;
        this.a.d.d(0);
        a(0, 0, this.g, this.m);
        i(this.g, 9, this.m);
        a(0, 0, this.g, this.m);
    }

    @Override // av3
    public final void g(int i, long j) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.i = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 2);
        this.j = e0;
        this.k = new ee5(e0, this.b, this.c);
        this.a.b(g84Var, l6cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        ee5 ee5Var = this.k;
        boolean z = this.n;
        ee5Var.i = i;
        ee5Var.l = j2;
        ee5Var.j = j;
        ee5Var.s = z;
        if (!ee5Var.b || i != 1) {
            if (!ee5Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        de5 de5Var = ee5Var.m;
        ee5Var.m = ee5Var.n;
        ee5Var.n = de5Var;
        de5Var.b = false;
        de5Var.a = false;
        ee5Var.h = 0;
        ee5Var.k = true;
    }

    @Override // av3
    public final void e() {
    }
}
