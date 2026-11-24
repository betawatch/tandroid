// default package

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ec5 implements gu3 {
    public final uv9 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public wxb j;
    public dc5 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final oh7 d = new oh7(7);
    public final oh7 e = new oh7(8);
    public final oh7 f = new oh7(6);
    public long m = -9223372036854775807L;
    public final xu7 o = new xu7();

    public ec5(uv9 uv9Var, boolean z, boolean z2) {
        this.a = uv9Var;
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
        oh7 oh7Var;
        dc5 dc5Var;
        boolean z2;
        long j3;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        int i5;
        ko koVar = this.a.d;
        if (!this.l || this.k.c) {
            oh7 oh7Var2 = this.d;
            oh7Var2.b(i2);
            oh7 oh7Var3 = this.e;
            oh7Var3.b(i2);
            boolean z7 = this.l;
            boolean z8 = oh7Var2.c;
            if (z7) {
                i3 = 2;
                z = false;
                if (z8) {
                    wh7 k = yad.k(3, oh7Var2.e, oh7Var2.d);
                    koVar.l(k.s);
                    this.k.d.append(k.d, k);
                    oh7Var2.c();
                } else if (oh7Var3.c) {
                    rf6 rf6Var = new rf6(oh7Var3.d, 4, oh7Var3.e);
                    int f = rf6Var.f();
                    int f2 = rf6Var.f();
                    rf6Var.j();
                    this.k.e.append(f, new vh7(f, f2, rf6Var.d()));
                    oh7Var3.c();
                }
            } else if (z8 && oh7Var3.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(oh7Var2.d, oh7Var2.e));
                arrayList.add(Arrays.copyOf(oh7Var3.d, oh7Var3.e));
                wh7 k2 = yad.k(3, oh7Var2.e, oh7Var2.d);
                int i6 = k2.s;
                rf6 rf6Var2 = new rf6(oh7Var3.d, 4, oh7Var3.e);
                int f3 = rf6Var2.f();
                int f4 = rf6Var2.f();
                rf6Var2.j();
                i3 = 2;
                vh7 vh7Var = new vh7(f3, f4, rf6Var2.d());
                int i7 = k2.a;
                int i8 = k2.b;
                z = false;
                int i9 = k2.c;
                byte[] bArr = wj2.a;
                String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
                wxb wxbVar = this.j;
                em4 em4Var = new em4();
                em4Var.a = this.i;
                em4Var.r = ud7.n("video/mp2t");
                em4Var.s = ud7.n("video/avc");
                em4Var.k = format;
                em4Var.z = k2.e;
                em4Var.A = k2.f;
                em4Var.K = new hl2(k2.p, k2.q, k2.r, null, k2.h + 8, k2.i + 8);
                em4Var.H = k2.g;
                em4Var.v = arrayList;
                em4Var.u = i6;
                yjb.v(em4Var, wxbVar);
                this.l = true;
                koVar.l(i6);
                this.k.d.append(k2.d, k2);
                this.k.e.append(f3, vh7Var);
                oh7Var2.c();
                oh7Var3.c();
            }
            oh7Var = this.f;
            if (oh7Var.b(i2)) {
                int m = yad.m(oh7Var.e, oh7Var.d);
                byte[] bArr2 = oh7Var.d;
                xu7 xu7Var = this.o;
                xu7Var.L(m, bArr2);
                xu7Var.N(4);
                koVar.a(j2, xu7Var);
            }
            dc5Var = this.k;
            z2 = this.l;
            if (dc5Var.i != 9) {
                if (dc5Var.c) {
                    cc5 cc5Var = dc5Var.n;
                    cc5 cc5Var2 = dc5Var.m;
                    if (cc5Var.a) {
                        if (cc5Var2.a) {
                            wh7 wh7Var = cc5Var.c;
                            wh7Var.getClass();
                            wh7 wh7Var2 = cc5Var2.c;
                            wh7Var2.getClass();
                            int i10 = wh7Var2.m;
                            if (cc5Var.f == cc5Var2.f) {
                                if (cc5Var.g == cc5Var2.g) {
                                    if (cc5Var.h == cc5Var2.h) {
                                        if (cc5Var.i) {
                                            if (cc5Var2.i) {
                                            }
                                        }
                                        int i11 = cc5Var.d;
                                        int i12 = cc5Var2.d;
                                        if (i11 != i12) {
                                            if (i11 != 0) {
                                            }
                                        }
                                        int i13 = wh7Var.m;
                                        if (i13 == 0) {
                                            if (i10 == 0) {
                                                if (cc5Var.m == cc5Var2.m) {
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                            if (i10 == 1) {
                                                if (cc5Var.o == cc5Var2.o) {
                                                }
                                            }
                                        }
                                        boolean z9 = cc5Var.k;
                                        if (z9 == cc5Var2.k) {
                                            if (z9) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (dc5Var.b) {
                    cc5 cc5Var3 = dc5Var.n;
                    z3 = cc5Var3.b && ((i5 = cc5Var3.e) == 7 || i5 == i3);
                } else {
                    z3 = dc5Var.s;
                }
                boolean z10 = dc5Var.r;
                i4 = dc5Var.i;
                if (i4 != 5) {
                    z6 = z3 ? true : true;
                    z4 = false;
                    z5 = z10 | z4;
                    dc5Var.r = z5;
                    dc5Var.i = 24;
                    if (z5) {
                        return;
                    }
                    this.n = false;
                    return;
                }
                z4 = z6;
                z5 = z10 | z4;
                dc5Var.r = z5;
                dc5Var.i = 24;
                if (z5) {
                }
            }
            if (z2 && dc5Var.o) {
                long j4 = dc5Var.j;
                int i14 = i + ((int) (j - j4));
                j3 = dc5Var.q;
                if (j3 != -9223372036854775807L) {
                    long j5 = dc5Var.p;
                    if (j4 != j5) {
                        dc5Var.a.a(j3, dc5Var.r ? 1 : 0, (int) (j4 - j5), i14, null);
                    }
                }
            }
            dc5Var.p = dc5Var.j;
            dc5Var.q = dc5Var.l;
            dc5Var.r = z;
            dc5Var.o = true;
            if (dc5Var.b) {
            }
            boolean z102 = dc5Var.r;
            i4 = dc5Var.i;
            if (i4 != 5) {
            }
            z4 = z6;
            z5 = z102 | z4;
            dc5Var.r = z5;
            dc5Var.i = 24;
            if (z5) {
            }
        }
        i3 = 2;
        z = false;
        oh7Var = this.f;
        if (oh7Var.b(i2)) {
        }
        dc5Var = this.k;
        z2 = this.l;
        if (dc5Var.i != 9) {
        }
        if (z2) {
            long j42 = dc5Var.j;
            int i142 = i + ((int) (j - j42));
            j3 = dc5Var.q;
            if (j3 != -9223372036854775807L) {
            }
        }
        dc5Var.p = dc5Var.j;
        dc5Var.q = dc5Var.l;
        dc5Var.r = z;
        dc5Var.o = true;
        if (dc5Var.b) {
        }
        boolean z1022 = dc5Var.r;
        i4 = dc5Var.i;
        if (i4 != 5) {
        }
        z4 = z6;
        z5 = z1022 | z4;
        dc5Var.r = z5;
        dc5Var.i = 24;
        if (z5) {
        }
    }

    @Override // gu3
    public final void b(xu7 xu7Var) {
        int i;
        this.j.getClass();
        String str = g8c.a;
        int i2 = xu7Var.b;
        int i3 = xu7Var.c;
        byte[] bArr = xu7Var.a;
        this.g += xu7Var.a();
        this.j.e(xu7Var.a(), xu7Var);
        while (true) {
            int b = yad.b(bArr, i2, i3, this.h);
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
        dc5 dc5Var = this.k;
        SparseArray sparseArray = dc5Var.e;
        rf6 rf6Var = dc5Var.f;
        if (dc5Var.k) {
            int i8 = i2 - i;
            byte[] bArr2 = dc5Var.g;
            int length = bArr2.length;
            int i9 = dc5Var.h + i8;
            if (length < i9) {
                bArr2 = Arrays.copyOf(bArr2, i9 << 1);
                dc5Var.g = bArr2;
            }
            System.arraycopy(bArr, i, bArr2, dc5Var.h, i8);
            int i10 = dc5Var.h + i8;
            dc5Var.h = i10;
            rf6Var.e = dc5Var.g;
            rf6Var.b = 0;
            rf6Var.c = 0;
            rf6Var.a = i10;
            rf6Var.d = 0;
            rf6Var.a();
            if (rf6Var.b(8)) {
                rf6Var.j();
                int e = rf6Var.e(2);
                rf6Var.k(5);
                if (rf6Var.c()) {
                    rf6Var.f();
                    if (rf6Var.c()) {
                        int f = rf6Var.f();
                        if (!dc5Var.c) {
                            dc5Var.k = false;
                            cc5 cc5Var = dc5Var.n;
                            cc5Var.e = f;
                            cc5Var.b = true;
                            return;
                        }
                        if (rf6Var.c()) {
                            int f2 = rf6Var.f();
                            if (sparseArray.indexOfKey(f2) < 0) {
                                dc5Var.k = false;
                                return;
                            }
                            vh7 vh7Var = (vh7) sparseArray.get(f2);
                            SparseArray sparseArray2 = dc5Var.d;
                            int i11 = vh7Var.a;
                            boolean z5 = vh7Var.b;
                            wh7 wh7Var = (wh7) sparseArray2.get(i11);
                            boolean z6 = wh7Var.j;
                            int i12 = wh7Var.n;
                            int i13 = wh7Var.l;
                            if (z6) {
                                if (!rf6Var.b(2)) {
                                    return;
                                } else {
                                    rf6Var.k(2);
                                }
                            }
                            if (rf6Var.b(i13)) {
                                int e2 = rf6Var.e(i13);
                                if (wh7Var.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!rf6Var.b(1)) {
                                        return;
                                    }
                                    z = rf6Var.d();
                                    if (z) {
                                        if (rf6Var.b(1)) {
                                            z2 = rf6Var.d();
                                            z3 = true;
                                            z4 = dc5Var.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!rf6Var.c()) {
                                                return;
                                            } else {
                                                i3 = rf6Var.f();
                                            }
                                            i4 = wh7Var.m;
                                            if (i4 != 0) {
                                                if (!rf6Var.b(i12)) {
                                                    return;
                                                }
                                                i5 = rf6Var.e(i12);
                                                if (z5 && !z) {
                                                    if (rf6Var.c()) {
                                                        i7 = rf6Var.g();
                                                        i6 = 0;
                                                        g = 0;
                                                        cc5 cc5Var2 = dc5Var.n;
                                                        cc5Var2.c = wh7Var;
                                                        cc5Var2.d = e;
                                                        cc5Var2.e = f;
                                                        cc5Var2.f = e2;
                                                        cc5Var2.g = f2;
                                                        cc5Var2.h = z;
                                                        cc5Var2.i = z3;
                                                        cc5Var2.j = z2;
                                                        cc5Var2.k = z4;
                                                        cc5Var2.l = i3;
                                                        cc5Var2.m = i5;
                                                        cc5Var2.n = i7;
                                                        cc5Var2.o = i6;
                                                        cc5Var2.p = g;
                                                        cc5Var2.a = true;
                                                        cc5Var2.b = true;
                                                        dc5Var.k = false;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                if (i4 == 1 && !wh7Var.o) {
                                                    if (rf6Var.c()) {
                                                        int g2 = rf6Var.g();
                                                        if (!z5 || z) {
                                                            i6 = g2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            g = 0;
                                                            cc5 cc5Var22 = dc5Var.n;
                                                            cc5Var22.c = wh7Var;
                                                            cc5Var22.d = e;
                                                            cc5Var22.e = f;
                                                            cc5Var22.f = e2;
                                                            cc5Var22.g = f2;
                                                            cc5Var22.h = z;
                                                            cc5Var22.i = z3;
                                                            cc5Var22.j = z2;
                                                            cc5Var22.k = z4;
                                                            cc5Var22.l = i3;
                                                            cc5Var22.m = i5;
                                                            cc5Var22.n = i7;
                                                            cc5Var22.o = i6;
                                                            cc5Var22.p = g;
                                                            cc5Var22.a = true;
                                                            cc5Var22.b = true;
                                                            dc5Var.k = false;
                                                        }
                                                        if (rf6Var.c()) {
                                                            g = rf6Var.g();
                                                            i7 = 0;
                                                            i6 = g2;
                                                            i5 = 0;
                                                            cc5 cc5Var222 = dc5Var.n;
                                                            cc5Var222.c = wh7Var;
                                                            cc5Var222.d = e;
                                                            cc5Var222.e = f;
                                                            cc5Var222.f = e2;
                                                            cc5Var222.g = f2;
                                                            cc5Var222.h = z;
                                                            cc5Var222.i = z3;
                                                            cc5Var222.j = z2;
                                                            cc5Var222.k = z4;
                                                            cc5Var222.l = i3;
                                                            cc5Var222.m = i5;
                                                            cc5Var222.n = i7;
                                                            cc5Var222.o = i6;
                                                            cc5Var222.p = g;
                                                            cc5Var222.a = true;
                                                            cc5Var222.b = true;
                                                            dc5Var.k = false;
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
                                            cc5 cc5Var2222 = dc5Var.n;
                                            cc5Var2222.c = wh7Var;
                                            cc5Var2222.d = e;
                                            cc5Var2222.e = f;
                                            cc5Var2222.f = e2;
                                            cc5Var2222.g = f2;
                                            cc5Var2222.h = z;
                                            cc5Var2222.i = z3;
                                            cc5Var2222.j = z2;
                                            cc5Var2222.k = z4;
                                            cc5Var2222.l = i3;
                                            cc5Var2222.m = i5;
                                            cc5Var2222.n = i7;
                                            cc5Var2222.o = i6;
                                            cc5Var2222.p = g;
                                            cc5Var2222.a = true;
                                            cc5Var2222.b = true;
                                            dc5Var.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (dc5Var.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = wh7Var.m;
                                if (i4 != 0) {
                                }
                                i6 = 0;
                                i7 = 0;
                                g = 0;
                                cc5 cc5Var22222 = dc5Var.n;
                                cc5Var22222.c = wh7Var;
                                cc5Var22222.d = e;
                                cc5Var22222.e = f;
                                cc5Var22222.f = e2;
                                cc5Var22222.g = f2;
                                cc5Var22222.h = z;
                                cc5Var22222.i = z3;
                                cc5Var22222.j = z2;
                                cc5Var22222.k = z4;
                                cc5Var22222.l = i3;
                                cc5Var22222.m = i5;
                                cc5Var22222.n = i7;
                                cc5Var22222.o = i6;
                                cc5Var22222.p = g;
                                cc5Var22222.a = true;
                                cc5Var22222.b = true;
                                dc5Var.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // gu3
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        yad.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.d.d(0);
        dc5 dc5Var = this.k;
        if (dc5Var != null) {
            dc5Var.k = false;
            dc5Var.o = false;
            cc5 cc5Var = dc5Var.n;
            cc5Var.b = false;
            cc5Var.a = false;
        }
    }

    @Override // gu3
    public final void f() {
        this.j.getClass();
        String str = g8c.a;
        this.a.d.d(0);
        a(0, 0, this.g, this.m);
        i(this.g, 9, this.m);
        a(0, 0, this.g, this.m);
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.m = j;
        this.n |= (i & 2) != 0;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.i = l2cVar.e;
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 2);
        this.j = S;
        this.k = new dc5(S, this.b, this.c);
        this.a.b(l74Var, l2cVar);
    }

    public final void i(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        dc5 dc5Var = this.k;
        boolean z = this.n;
        dc5Var.i = i;
        dc5Var.l = j2;
        dc5Var.j = j;
        dc5Var.s = z;
        if (!dc5Var.b || i != 1) {
            if (!dc5Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        cc5 cc5Var = dc5Var.m;
        dc5Var.m = dc5Var.n;
        dc5Var.n = cc5Var;
        cc5Var.b = false;
        cc5Var.a = false;
        dc5Var.h = 0;
        dc5Var.k = true;
    }

    @Override // gu3
    public final void e() {
    }
}
