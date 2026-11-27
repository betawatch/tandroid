// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ce5 implements av3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final oz9 a;
    public final ey7 b;
    public final boolean[] c = new boolean[4];
    public final ae5 d;
    public final xj7 e;
    public be5 f;
    public long g;
    public String h;
    public x1c i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public ce5(oz9 oz9Var) {
        this.a = oz9Var;
        ae5 ae5Var = new ae5();
        ae5Var.e = new byte[128];
        this.d = ae5Var;
        this.k = -9223372036854775807L;
        this.e = new xj7(jn7.H2);
        this.b = new ey7();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    @Override // av3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ey7 ey7Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = ey7Var.b;
        int i6 = ey7Var.c;
        byte[] bArr = ey7Var.a;
        this.g += ey7Var.a();
        this.i.e(ey7Var.a(), ey7Var);
        while (true) {
            int b = rfd.b(bArr, i5, i6, this.c);
            ae5 ae5Var = this.d;
            xj7 xj7Var = this.e;
            if (b == i6) {
                if (!this.j) {
                    ae5Var.b(i5, i6, bArr);
                }
                this.f.a(i5, i6, bArr);
                if (xj7Var != null) {
                    xj7Var.a(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = b + 3;
            byte b2 = ey7Var.a[i7];
            int i8 = b2 & 255;
            int i9 = b - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    ae5Var.b(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                byte b3 = ae5Var.d;
                if (b3 != 0) {
                    i = i6;
                    if (b3 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            efd.f("H263Reader", "Unexpected start code value");
                            ae5Var.c = false;
                            ae5Var.a = 0;
                            ae5Var.d = (byte) 0;
                        } else {
                            ae5Var.d = (byte) 2;
                        }
                    } else if (b3 != 2) {
                        i2 = i7;
                        if (b3 != 3) {
                            if (b3 != 4) {
                                grb.g();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                ae5Var.a -= i10;
                                ae5Var.c = false;
                                x1c x1cVar = this.i;
                                int i11 = ae5Var.b;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf((byte[]) ae5Var.e, ae5Var.a);
                                zd1 zd1Var = new zd1(copyOf.length, copyOf);
                                zd1Var.o(i11);
                                zd1Var.o(4);
                                zd1Var.m();
                                zd1Var.n(8);
                                if (zd1Var.e()) {
                                    zd1Var.n(4);
                                    zd1Var.n(3);
                                }
                                int f2 = zd1Var.f(4);
                                if (f2 == 15) {
                                    int f3 = zd1Var.f(8);
                                    int f4 = zd1Var.f(8);
                                    if (f4 == 0) {
                                        efd.f("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (zd1Var.e()) {
                                            zd1Var.n(2);
                                            zd1Var.n(1);
                                            if (zd1Var.e()) {
                                                zd1Var.n(15);
                                                zd1Var.m();
                                                zd1Var.n(15);
                                                zd1Var.m();
                                                zd1Var.n(15);
                                                zd1Var.m();
                                                zd1Var.n(3);
                                                zd1Var.n(11);
                                                zd1Var.m();
                                                zd1Var.n(15);
                                                zd1Var.m();
                                            }
                                        }
                                        if (zd1Var.f(2) != 0) {
                                            efd.f("H263Reader", "Unhandled video object layer shape");
                                        }
                                        zd1Var.m();
                                        int f5 = zd1Var.f(16);
                                        zd1Var.m();
                                        if (zd1Var.e()) {
                                            if (f5 == 0) {
                                                efd.f("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i12 = 0;
                                                for (int i13 = f5 - 1; i13 > 0; i13 >>= 1) {
                                                    i12++;
                                                }
                                                zd1Var.n(i12);
                                            }
                                        }
                                        zd1Var.m();
                                        int f6 = zd1Var.f(13);
                                        zd1Var.m();
                                        int f7 = zd1Var.f(13);
                                        zd1Var.m();
                                        zd1Var.m();
                                        jo4 jo4Var = new jo4();
                                        jo4Var.a = str;
                                        jo4Var.r = dg7.n("video/mp2t");
                                        jo4Var.s = dg7.n("video/mp4v-es");
                                        jo4Var.z = f6;
                                        jo4Var.A = f7;
                                        jo4Var.H = f;
                                        jo4Var.v = Collections.singletonList(copyOf);
                                        xnb.v(jo4Var, x1cVar);
                                        this.j = true;
                                    } else {
                                        f = f3 / f4;
                                        if (zd1Var.e()) {
                                        }
                                        if (zd1Var.f(2) != 0) {
                                        }
                                        zd1Var.m();
                                        int f52 = zd1Var.f(16);
                                        zd1Var.m();
                                        if (zd1Var.e()) {
                                        }
                                        zd1Var.m();
                                        int f62 = zd1Var.f(13);
                                        zd1Var.m();
                                        int f72 = zd1Var.f(13);
                                        zd1Var.m();
                                        zd1Var.m();
                                        jo4 jo4Var2 = new jo4();
                                        jo4Var2.a = str;
                                        jo4Var2.r = dg7.n("video/mp2t");
                                        jo4Var2.s = dg7.n("video/mp4v-es");
                                        jo4Var2.z = f62;
                                        jo4Var2.A = f72;
                                        jo4Var2.H = f;
                                        jo4Var2.v = Collections.singletonList(copyOf);
                                        xnb.v(jo4Var2, x1cVar);
                                        this.j = true;
                                    }
                                } else if (f2 < 7) {
                                    f = l[f2];
                                    if (zd1Var.e()) {
                                    }
                                    if (zd1Var.f(2) != 0) {
                                    }
                                    zd1Var.m();
                                    int f522 = zd1Var.f(16);
                                    zd1Var.m();
                                    if (zd1Var.e()) {
                                    }
                                    zd1Var.m();
                                    int f622 = zd1Var.f(13);
                                    zd1Var.m();
                                    int f722 = zd1Var.f(13);
                                    zd1Var.m();
                                    zd1Var.m();
                                    jo4 jo4Var22 = new jo4();
                                    jo4Var22.a = str;
                                    jo4Var22.r = dg7.n("video/mp2t");
                                    jo4Var22.s = dg7.n("video/mp4v-es");
                                    jo4Var22.z = f622;
                                    jo4Var22.A = f722;
                                    jo4Var22.H = f;
                                    jo4Var22.v = Collections.singletonList(copyOf);
                                    xnb.v(jo4Var22, x1cVar);
                                    this.j = true;
                                } else {
                                    efd.f("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (zd1Var.e()) {
                                    }
                                    if (zd1Var.f(2) != 0) {
                                    }
                                    zd1Var.m();
                                    int f5222 = zd1Var.f(16);
                                    zd1Var.m();
                                    if (zd1Var.e()) {
                                    }
                                    zd1Var.m();
                                    int f6222 = zd1Var.f(13);
                                    zd1Var.m();
                                    int f7222 = zd1Var.f(13);
                                    zd1Var.m();
                                    zd1Var.m();
                                    jo4 jo4Var222 = new jo4();
                                    jo4Var222.a = str;
                                    jo4Var222.r = dg7.n("video/mp2t");
                                    jo4Var222.s = dg7.n("video/mp4v-es");
                                    jo4Var222.z = f6222;
                                    jo4Var222.A = f7222;
                                    jo4Var222.H = f;
                                    jo4Var222.v = Collections.singletonList(copyOf);
                                    xnb.v(jo4Var222, x1cVar);
                                    this.j = true;
                                }
                            } else {
                                i4 = 0;
                            }
                        } else if ((b2 & 240) != 32) {
                            efd.f("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            ae5Var.c = false;
                            ae5Var.a = 0;
                            ae5Var.d = (byte) 0;
                        } else {
                            i4 = 0;
                            ae5Var.b = ae5Var.a;
                            ae5Var.d = (byte) 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            efd.f("H263Reader", "Unexpected start code value");
                            ae5Var.c = false;
                            ae5Var.a = 0;
                            ae5Var.d = (byte) 0;
                        } else {
                            ae5Var.d = (byte) 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        ae5Var.d = (byte) 1;
                        ae5Var.c = true;
                    }
                }
                ae5Var.b(i4, 3, ae5.f);
            }
            this.f.a(i5, b, bArr);
            if (xj7Var != null) {
                if (i9 > 0) {
                    xj7Var.a(i5, b, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (xj7Var.b(i3)) {
                    int m = rfd.m(xj7Var.e, xj7Var.d);
                    String str2 = gcc.a;
                    byte[] bArr2 = xj7Var.d;
                    ey7 ey7Var2 = this.b;
                    ey7Var2.L(m, bArr2);
                    this.a.a(this.k, ey7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (ey7Var.a[b + 2] == 1) {
                        xj7Var.d(i8);
                    }
                    int i14 = i - b;
                    this.f.b(i14, this.g - i14, this.j);
                    be5 be5Var = this.f;
                    long j = this.k;
                    be5Var.e = i8;
                    be5Var.d = false;
                    be5Var.b = (i8 != 182 || i8 == 179) ? z : false;
                    be5Var.c = i8 != 182 ? z : false;
                    be5Var.f = 0;
                    be5Var.h = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i142 = i - b;
            this.f.b(i142, this.g - i142, this.j);
            be5 be5Var2 = this.f;
            long j2 = this.k;
            be5Var2.e = i8;
            be5Var2.d = false;
            be5Var2.b = (i8 != 182 || i8 == 179) ? z : false;
            be5Var2.c = i8 != 182 ? z : false;
            be5Var2.f = 0;
            be5Var2.h = j2;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // av3
    public final void d() {
        rfd.a(this.c);
        ae5 ae5Var = this.d;
        ae5Var.c = false;
        ae5Var.a = 0;
        ae5Var.d = (byte) 0;
        be5 be5Var = this.f;
        if (be5Var != null) {
            be5Var.b = false;
            be5Var.c = false;
            be5Var.d = false;
            be5Var.e = -1;
        }
        xj7 xj7Var = this.e;
        if (xj7Var != null) {
            xj7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // av3
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        be5 be5Var = this.f;
        be5Var.b = false;
        be5Var.c = false;
        be5Var.d = false;
        be5Var.e = -1;
    }

    @Override // av3
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override // av3
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.h = l6cVar.e;
        l6cVar.b();
        x1c e0 = g84Var.e0(l6cVar.d, 2);
        this.i = e0;
        this.f = new be5(e0);
        this.a.b(g84Var, l6cVar);
    }

    @Override // av3
    public final void e() {
    }
}
