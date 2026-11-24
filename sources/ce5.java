// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ce5 implements rv3 {
    public final xx9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public yzb j;
    public be5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final rj7 d = new rj7(7);
    public final rj7 e = new rj7(8);
    public final rj7 f = new rj7(6);
    public long m = -9223372036854775807L;
    public final yw7 o = new yw7();

    public ce5(xx9 xx9Var, boolean z, boolean z2) {
        this.a = xx9Var;
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
        rj7 rj7Var;
        be5 be5Var;
        boolean z2;
        long j3;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        kp kpVar = this.a.d;
        if (!this.l || this.k.c) {
            rj7 rj7Var2 = this.d;
            rj7Var2.b(i2);
            rj7 rj7Var3 = this.e;
            rj7Var3.b(i2);
            boolean z7 = this.l;
            boolean z8 = rj7Var2.c;
            if (z7) {
                i3 = 2;
                z = false;
                if (z8) {
                    zj7 k = add.k(3, rj7Var2.e, rj7Var2.d);
                    kpVar.l(k.s);
                    this.k.d.append(k.d, k);
                    rj7Var2.c();
                } else if (rj7Var3.c) {
                    rh6 rh6Var = new rh6(rj7Var3.d, 4, rj7Var3.e);
                    int f = rh6Var.f();
                    int f2 = rh6Var.f();
                    rh6Var.j();
                    this.k.e.append(f, new yj7(f, f2, rh6Var.d()));
                    rj7Var3.c();
                }
            } else if (z8 && rj7Var3.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(rj7Var2.d, rj7Var2.e));
                arrayList.add(Arrays.copyOf(rj7Var3.d, rj7Var3.e));
                zj7 k2 = add.k(3, rj7Var2.e, rj7Var2.d);
                int i6 = k2.s;
                rh6 rh6Var2 = new rh6(rj7Var3.d, 4, rj7Var3.e);
                int f3 = rh6Var2.f();
                int f4 = rh6Var2.f();
                rh6Var2.j();
                i3 = 2;
                yj7 yj7Var = new yj7(f3, f4, rh6Var2.d());
                int i7 = k2.a;
                int i8 = k2.b;
                z = false;
                int i9 = k2.c;
                byte[] bArr = jl2.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
                yzb yzbVar = this.j;
                fo4 fo4Var = new fo4();
                fo4Var.a = this.i;
                fo4Var.r = wf7.n("video/mp2t");
                fo4Var.s = wf7.n("video/avc");
                fo4Var.k = format;
                fo4Var.z = k2.e;
                fo4Var.A = k2.f;
                fo4Var.K = new tm2(k2.p, k2.q, k2.r, null, k2.h + 8, k2.i + 8);
                fo4Var.H = k2.g;
                fo4Var.v = arrayList;
                fo4Var.u = i6;
                mlb.w(fo4Var, yzbVar);
                this.l = true;
                kpVar.l(i6);
                this.k.d.append(k2.d, k2);
                this.k.e.append(f3, yj7Var);
                rj7Var2.c();
                rj7Var3.c();
            }
            rj7Var = this.f;
            if (rj7Var.b(i2)) {
                int m = add.m(rj7Var.e, rj7Var.d);
                byte[] bArr2 = rj7Var.d;
                yw7 yw7Var = this.o;
                yw7Var.L(m, bArr2);
                yw7Var.N(4);
                kpVar.a(j2, yw7Var);
            }
            be5Var = this.k;
            z2 = this.l;
            if (be5Var.i != 9) {
                if (be5Var.c) {
                    ae5 ae5Var = be5Var.n;
                    ae5 ae5Var2 = be5Var.m;
                    if (ae5Var.a) {
                        if (ae5Var2.a) {
                            zj7 zj7Var = ae5Var.c;
                            zj7Var.getClass();
                            zj7 zj7Var2 = ae5Var2.c;
                            zj7Var2.getClass();
                            int i10 = zj7Var2.m;
                            if (ae5Var.f == ae5Var2.f) {
                                if (ae5Var.g == ae5Var2.g) {
                                    if (ae5Var.h == ae5Var2.h) {
                                        if (ae5Var.i) {
                                            if (ae5Var2.i) {
                                            }
                                        }
                                        int i11 = ae5Var.d;
                                        int i12 = ae5Var2.d;
                                        if (i11 != i12) {
                                            if (i11 != 0) {
                                            }
                                        }
                                        int i13 = zj7Var.m;
                                        if (i13 == 0) {
                                            if (i10 == 0) {
                                                if (ae5Var.m == ae5Var2.m) {
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                            if (i10 == 1) {
                                                if (ae5Var.o == ae5Var2.o) {
                                                }
                                            }
                                        }
                                        boolean z9 = ae5Var.k;
                                        if (z9 == ae5Var2.k) {
                                            if (z9) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (be5Var.b) {
                    ae5 ae5Var3 = be5Var.n;
                    z3 = ae5Var3.b && ((i5 = ae5Var3.e) == 7 || i5 == i3);
                } else {
                    z3 = be5Var.s;
                }
                boolean z10 = be5Var.r;
                i4 = be5Var.i;
                if (i4 != 5) {
                    z6 = z3 ? true : true;
                    z4 = false;
                    z5 = z10 | z4;
                    be5Var.r = z5;
                    be5Var.i = 24;
                    if (z5) {
                        return;
                    }
                    this.n = false;
                    return;
                }
                z4 = z6;
                z5 = z10 | z4;
                be5Var.r = z5;
                be5Var.i = 24;
                if (z5) {
                }
            }
            if (z2 && be5Var.o) {
                long j4 = be5Var.j;
                int i14 = i + ((int) (j - j4));
                j3 = be5Var.q;
                if (j3 != -9223372036854775807L) {
                    long j5 = be5Var.p;
                    if (j4 != j5) {
                        be5Var.a.a(j3, be5Var.r ? 1 : 0, (int) (j4 - j5), i14, null);
                    }
                }
            }
            be5Var.p = be5Var.j;
            be5Var.q = be5Var.l;
            be5Var.r = z;
            be5Var.o = true;
            if (be5Var.b) {
            }
            boolean z102 = be5Var.r;
            i4 = be5Var.i;
            if (i4 != 5) {
            }
            z4 = z6;
            z5 = z102 | z4;
            be5Var.r = z5;
            be5Var.i = 24;
            if (z5) {
            }
        }
        i3 = 2;
        z = false;
        rj7Var = this.f;
        if (rj7Var.b(i2)) {
        }
        be5Var = this.k;
        z2 = this.l;
        if (be5Var.i != 9) {
        }
        if (z2) {
            long j42 = be5Var.j;
            int i142 = i + ((int) (j - j42));
            j3 = be5Var.q;
            if (j3 != -9223372036854775807L) {
            }
        }
        be5Var.p = be5Var.j;
        be5Var.q = be5Var.l;
        be5Var.r = z;
        be5Var.o = true;
        if (be5Var.b) {
        }
        boolean z1022 = be5Var.r;
        i4 = be5Var.i;
        if (i4 != 5) {
        }
        z4 = z6;
        z5 = z1022 | z4;
        be5Var.r = z5;
        be5Var.i = 24;
        if (z5) {
        }
    }

    @Override // rv3
    public final void b(yw7 yw7Var) {
        int i;
        this.j.getClass();
        String str = hac.a;
        int i2 = yw7Var.b;
        int i3 = yw7Var.c;
        byte[] bArr = yw7Var.a;
        this.g += yw7Var.a();
        this.j.e(yw7Var.a(), yw7Var);
        while (true) {
            int b = add.b(bArr, i2, i3, this.h);
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
        be5 be5Var = this.k;
        SparseArray sparseArray = be5Var.e;
        rh6 rh6Var = be5Var.f;
        if (be5Var.k) {
            int i8 = i2 - i;
            byte[] bArr2 = be5Var.g;
            int length = bArr2.length;
            int i9 = be5Var.h + i8;
            if (length < i9) {
                bArr2 = Arrays.copyOf(bArr2, i9 << 1);
                be5Var.g = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, be5Var.h, i8);
            int i10 = be5Var.h + i8;
            be5Var.h = i10;
            rh6Var.e = be5Var.g;
            rh6Var.b = 0;
            rh6Var.c = 0;
            rh6Var.a = i10;
            rh6Var.d = 0;
            rh6Var.a();
            if (rh6Var.b(8)) {
                rh6Var.j();
                int e = rh6Var.e(2);
                rh6Var.k(5);
                if (rh6Var.c()) {
                    rh6Var.f();
                    if (rh6Var.c()) {
                        int f = rh6Var.f();
                        if (!be5Var.c) {
                            be5Var.k = false;
                            ae5 ae5Var = be5Var.n;
                            ae5Var.e = f;
                            ae5Var.b = true;
                            return;
                        }
                        if (rh6Var.c()) {
                            int f2 = rh6Var.f();
                            if (sparseArray.indexOfKey(f2) < 0) {
                                be5Var.k = false;
                                return;
                            }
                            yj7 yj7Var = (yj7) sparseArray.get(f2);
                            SparseArray sparseArray2 = be5Var.d;
                            int i11 = yj7Var.a;
                            boolean z5 = yj7Var.b;
                            zj7 zj7Var = (zj7) sparseArray2.get(i11);
                            boolean z6 = zj7Var.j;
                            int i12 = zj7Var.n;
                            int i13 = zj7Var.l;
                            if (z6) {
                                if (!rh6Var.b(2)) {
                                    return;
                                } else {
                                    rh6Var.k(2);
                                }
                            }
                            if (rh6Var.b(i13)) {
                                int e2 = rh6Var.e(i13);
                                if (zj7Var.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!rh6Var.b(1)) {
                                        return;
                                    }
                                    z = rh6Var.d();
                                    if (z) {
                                        if (rh6Var.b(1)) {
                                            z2 = rh6Var.d();
                                            z3 = true;
                                            z4 = be5Var.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!rh6Var.c()) {
                                                return;
                                            } else {
                                                i3 = rh6Var.f();
                                            }
                                            i4 = zj7Var.m;
                                            if (i4 != 0) {
                                                if (!rh6Var.b(i12)) {
                                                    return;
                                                }
                                                i5 = rh6Var.e(i12);
                                                if (z5 && !z) {
                                                    if (rh6Var.c()) {
                                                        i7 = rh6Var.g();
                                                        i6 = 0;
                                                        g = 0;
                                                        ae5 ae5Var2 = be5Var.n;
                                                        ae5Var2.c = zj7Var;
                                                        ae5Var2.d = e;
                                                        ae5Var2.e = f;
                                                        ae5Var2.f = e2;
                                                        ae5Var2.g = f2;
                                                        ae5Var2.h = z;
                                                        ae5Var2.i = z3;
                                                        ae5Var2.j = z2;
                                                        ae5Var2.k = z4;
                                                        ae5Var2.l = i3;
                                                        ae5Var2.m = i5;
                                                        ae5Var2.n = i7;
                                                        ae5Var2.o = i6;
                                                        ae5Var2.p = g;
                                                        ae5Var2.a = true;
                                                        ae5Var2.b = true;
                                                        be5Var.k = false;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                if (i4 == 1 && !zj7Var.o) {
                                                    if (rh6Var.c()) {
                                                        int g2 = rh6Var.g();
                                                        if (!z5 || z) {
                                                            i6 = g2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            g = 0;
                                                            ae5 ae5Var22 = be5Var.n;
                                                            ae5Var22.c = zj7Var;
                                                            ae5Var22.d = e;
                                                            ae5Var22.e = f;
                                                            ae5Var22.f = e2;
                                                            ae5Var22.g = f2;
                                                            ae5Var22.h = z;
                                                            ae5Var22.i = z3;
                                                            ae5Var22.j = z2;
                                                            ae5Var22.k = z4;
                                                            ae5Var22.l = i3;
                                                            ae5Var22.m = i5;
                                                            ae5Var22.n = i7;
                                                            ae5Var22.o = i6;
                                                            ae5Var22.p = g;
                                                            ae5Var22.a = true;
                                                            ae5Var22.b = true;
                                                            be5Var.k = false;
                                                        }
                                                        if (rh6Var.c()) {
                                                            g = rh6Var.g();
                                                            i7 = 0;
                                                            i6 = g2;
                                                            i5 = 0;
                                                            ae5 ae5Var222 = be5Var.n;
                                                            ae5Var222.c = zj7Var;
                                                            ae5Var222.d = e;
                                                            ae5Var222.e = f;
                                                            ae5Var222.f = e2;
                                                            ae5Var222.g = f2;
                                                            ae5Var222.h = z;
                                                            ae5Var222.i = z3;
                                                            ae5Var222.j = z2;
                                                            ae5Var222.k = z4;
                                                            ae5Var222.l = i3;
                                                            ae5Var222.m = i5;
                                                            ae5Var222.n = i7;
                                                            ae5Var222.o = i6;
                                                            ae5Var222.p = g;
                                                            ae5Var222.a = true;
                                                            ae5Var222.b = true;
                                                            be5Var.k = false;
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
                                            ae5 ae5Var2222 = be5Var.n;
                                            ae5Var2222.c = zj7Var;
                                            ae5Var2222.d = e;
                                            ae5Var2222.e = f;
                                            ae5Var2222.f = e2;
                                            ae5Var2222.g = f2;
                                            ae5Var2222.h = z;
                                            ae5Var2222.i = z3;
                                            ae5Var2222.j = z2;
                                            ae5Var2222.k = z4;
                                            ae5Var2222.l = i3;
                                            ae5Var2222.m = i5;
                                            ae5Var2222.n = i7;
                                            ae5Var2222.o = i6;
                                            ae5Var2222.p = g;
                                            ae5Var2222.a = true;
                                            ae5Var2222.b = true;
                                            be5Var.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (be5Var.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = zj7Var.m;
                                if (i4 != 0) {
                                }
                                i6 = 0;
                                i7 = 0;
                                g = 0;
                                ae5 ae5Var22222 = be5Var.n;
                                ae5Var22222.c = zj7Var;
                                ae5Var22222.d = e;
                                ae5Var22222.e = f;
                                ae5Var22222.f = e2;
                                ae5Var22222.g = f2;
                                ae5Var22222.h = z;
                                ae5Var22222.i = z3;
                                ae5Var22222.j = z2;
                                ae5Var22222.k = z4;
                                ae5Var22222.l = i3;
                                ae5Var22222.m = i5;
                                ae5Var22222.n = i7;
                                ae5Var22222.o = i6;
                                ae5Var22222.p = g;
                                ae5Var22222.a = true;
                                ae5Var22222.b = true;
                                be5Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // rv3
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        add.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        be5 be5Var = this.k;
        if (be5Var != null) {
            be5Var.k = false;
            be5Var.o = false;
            ae5 ae5Var = be5Var.n;
            ae5Var.b = false;
            ae5Var.a = false;
        }
    }

    @Override // rv3
    public final void f() {
        this.j.getClass();
        String str = hac.a;
        this.a.d.d(0);
        a(0, 0, this.g, this.m);
        i(this.g, 9, this.m);
        a(0, 0, this.g, this.m);
    }

    @Override // rv3
    public final void g(int i, long j) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    @Override // rv3
    public final void h(u84 u84Var, l4c l4cVar) {
        l4cVar.a();
        l4cVar.b();
        this.i = l4cVar.e;
        l4cVar.b();
        yzb c0 = u84Var.c0(l4cVar.d, 2);
        this.j = c0;
        this.k = new be5(c0, this.b, this.c);
        this.a.b(u84Var, l4cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        be5 be5Var = this.k;
        boolean z = this.n;
        be5Var.i = i;
        be5Var.l = j2;
        be5Var.j = j;
        be5Var.s = z;
        if (!be5Var.b || i != 1) {
            if (!be5Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        ae5 ae5Var = be5Var.m;
        be5Var.m = be5Var.n;
        be5Var.n = ae5Var;
        ae5Var.b = false;
        ae5Var.a = false;
        be5Var.h = 0;
        be5Var.k = true;
    }

    @Override // rv3
    public final void e() {
    }
}
