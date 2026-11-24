// default package

import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bc5 implements gu3 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final uv9 a;
    public final xu7 b;
    public final boolean[] c = new boolean[4];
    public final zb5 d;
    public final oh7 e;
    public ac5 f;
    public long g;
    public String h;
    public wxb i;
    public boolean j;
    public long k;

    /* JADX WARN: Type inference failed for: r0v1, types: [byte[], java.io.Serializable] */
    public bc5(uv9 uv9Var) {
        this.a = uv9Var;
        zb5 zb5Var = new zb5();
        zb5Var.e = new byte[128];
        this.d = zb5Var;
        this.k = -9223372036854775807L;
        this.e = new oh7(kk7.H2);
        this.b = new xu7();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    @Override // gu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(xu7 xu7Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = xu7Var.b;
        int i6 = xu7Var.c;
        byte[] bArr = xu7Var.a;
        this.g += xu7Var.a();
        this.i.e(xu7Var.a(), xu7Var);
        while (true) {
            int b = yad.b(bArr, i5, i6, this.c);
            zb5 zb5Var = this.d;
            oh7 oh7Var = this.e;
            if (b == i6) {
                if (!this.j) {
                    zb5Var.b(i5, i6, bArr);
                }
                this.f.a(i5, i6, bArr);
                if (oh7Var != null) {
                    oh7Var.a(i5, i6, bArr);
                    return;
                }
                return;
            }
            int i7 = b + 3;
            byte b2 = xu7Var.a[i7];
            int i8 = b2 & 255;
            int i9 = b - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    zb5Var.b(i5, b, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                byte b3 = zb5Var.d;
                if (b3 != 0) {
                    i = i6;
                    if (b3 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            lad.f("H263Reader", "Unexpected start code value");
                            zb5Var.c = false;
                            zb5Var.a = 0;
                            zb5Var.d = (byte) 0;
                        } else {
                            zb5Var.d = (byte) 2;
                        }
                    } else if (b3 != 2) {
                        i2 = i7;
                        if (b3 != 3) {
                            if (b3 != 4) {
                                sdb.a();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                zb5Var.a -= i10;
                                zb5Var.c = false;
                                wxb wxbVar = this.i;
                                int i11 = zb5Var.b;
                                String str = this.h;
                                str.getClass();
                                byte[] copyOf = Arrays.copyOf((byte[]) zb5Var.e, zb5Var.a);
                                qd1 qd1Var = new qd1(copyOf.length, copyOf);
                                qd1Var.o(i11);
                                qd1Var.o(4);
                                qd1Var.m();
                                qd1Var.n(8);
                                if (qd1Var.e()) {
                                    qd1Var.n(4);
                                    qd1Var.n(3);
                                }
                                int f2 = qd1Var.f(4);
                                if (f2 == 15) {
                                    int f3 = qd1Var.f(8);
                                    int f4 = qd1Var.f(8);
                                    if (f4 == 0) {
                                        lad.f("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (qd1Var.e()) {
                                            qd1Var.n(2);
                                            qd1Var.n(1);
                                            if (qd1Var.e()) {
                                                qd1Var.n(15);
                                                qd1Var.m();
                                                qd1Var.n(15);
                                                qd1Var.m();
                                                qd1Var.n(15);
                                                qd1Var.m();
                                                qd1Var.n(3);
                                                qd1Var.n(11);
                                                qd1Var.m();
                                                qd1Var.n(15);
                                                qd1Var.m();
                                            }
                                        }
                                        if (qd1Var.f(2) != 0) {
                                            lad.f("H263Reader", "Unhandled video object layer shape");
                                        }
                                        qd1Var.m();
                                        int f5 = qd1Var.f(16);
                                        qd1Var.m();
                                        if (qd1Var.e()) {
                                            if (f5 == 0) {
                                                lad.f("H263Reader", "Invalid vop_increment_time_resolution");
                                            } else {
                                                int i12 = 0;
                                                for (int i13 = f5 - 1; i13 > 0; i13 >>= 1) {
                                                    i12++;
                                                }
                                                qd1Var.n(i12);
                                            }
                                        }
                                        qd1Var.m();
                                        int f6 = qd1Var.f(13);
                                        qd1Var.m();
                                        int f7 = qd1Var.f(13);
                                        qd1Var.m();
                                        qd1Var.m();
                                        em4 em4Var = new em4();
                                        em4Var.a = str;
                                        em4Var.r = ud7.n("video/mp2t");
                                        em4Var.s = ud7.n("video/mp4v-es");
                                        em4Var.z = f6;
                                        em4Var.A = f7;
                                        em4Var.H = f;
                                        em4Var.v = Collections.singletonList(copyOf);
                                        yjb.v(em4Var, wxbVar);
                                        this.j = true;
                                    } else {
                                        f = f3 / f4;
                                        if (qd1Var.e()) {
                                        }
                                        if (qd1Var.f(2) != 0) {
                                        }
                                        qd1Var.m();
                                        int f52 = qd1Var.f(16);
                                        qd1Var.m();
                                        if (qd1Var.e()) {
                                        }
                                        qd1Var.m();
                                        int f62 = qd1Var.f(13);
                                        qd1Var.m();
                                        int f72 = qd1Var.f(13);
                                        qd1Var.m();
                                        qd1Var.m();
                                        em4 em4Var2 = new em4();
                                        em4Var2.a = str;
                                        em4Var2.r = ud7.n("video/mp2t");
                                        em4Var2.s = ud7.n("video/mp4v-es");
                                        em4Var2.z = f62;
                                        em4Var2.A = f72;
                                        em4Var2.H = f;
                                        em4Var2.v = Collections.singletonList(copyOf);
                                        yjb.v(em4Var2, wxbVar);
                                        this.j = true;
                                    }
                                } else if (f2 < 7) {
                                    f = l[f2];
                                    if (qd1Var.e()) {
                                    }
                                    if (qd1Var.f(2) != 0) {
                                    }
                                    qd1Var.m();
                                    int f522 = qd1Var.f(16);
                                    qd1Var.m();
                                    if (qd1Var.e()) {
                                    }
                                    qd1Var.m();
                                    int f622 = qd1Var.f(13);
                                    qd1Var.m();
                                    int f722 = qd1Var.f(13);
                                    qd1Var.m();
                                    qd1Var.m();
                                    em4 em4Var22 = new em4();
                                    em4Var22.a = str;
                                    em4Var22.r = ud7.n("video/mp2t");
                                    em4Var22.s = ud7.n("video/mp4v-es");
                                    em4Var22.z = f622;
                                    em4Var22.A = f722;
                                    em4Var22.H = f;
                                    em4Var22.v = Collections.singletonList(copyOf);
                                    yjb.v(em4Var22, wxbVar);
                                    this.j = true;
                                } else {
                                    lad.f("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                    if (qd1Var.e()) {
                                    }
                                    if (qd1Var.f(2) != 0) {
                                    }
                                    qd1Var.m();
                                    int f5222 = qd1Var.f(16);
                                    qd1Var.m();
                                    if (qd1Var.e()) {
                                    }
                                    qd1Var.m();
                                    int f6222 = qd1Var.f(13);
                                    qd1Var.m();
                                    int f7222 = qd1Var.f(13);
                                    qd1Var.m();
                                    qd1Var.m();
                                    em4 em4Var222 = new em4();
                                    em4Var222.a = str;
                                    em4Var222.r = ud7.n("video/mp2t");
                                    em4Var222.s = ud7.n("video/mp4v-es");
                                    em4Var222.z = f6222;
                                    em4Var222.A = f7222;
                                    em4Var222.H = f;
                                    em4Var222.v = Collections.singletonList(copyOf);
                                    yjb.v(em4Var222, wxbVar);
                                    this.j = true;
                                }
                            } else {
                                i4 = 0;
                            }
                        } else if ((b2 & 240) != 32) {
                            lad.f("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            zb5Var.c = false;
                            zb5Var.a = 0;
                            zb5Var.d = (byte) 0;
                        } else {
                            i4 = 0;
                            zb5Var.b = zb5Var.a;
                            zb5Var.d = (byte) 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            lad.f("H263Reader", "Unexpected start code value");
                            zb5Var.c = false;
                            zb5Var.a = 0;
                            zb5Var.d = (byte) 0;
                        } else {
                            zb5Var.d = (byte) 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        zb5Var.d = (byte) 1;
                        zb5Var.c = true;
                    }
                }
                zb5Var.b(i4, 3, zb5.f);
            }
            this.f.a(i5, b, bArr);
            if (oh7Var != null) {
                if (i9 > 0) {
                    oh7Var.a(i5, b, bArr);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (oh7Var.b(i3)) {
                    int m = yad.m(oh7Var.e, oh7Var.d);
                    String str2 = g8c.a;
                    byte[] bArr2 = oh7Var.d;
                    xu7 xu7Var2 = this.b;
                    xu7Var2.L(m, bArr2);
                    this.a.a(this.k, xu7Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (xu7Var.a[b + 2] == 1) {
                        oh7Var.d(i8);
                    }
                    int i14 = i - b;
                    this.f.b(i14, this.g - i14, this.j);
                    ac5 ac5Var = this.f;
                    long j = this.k;
                    ac5Var.e = i8;
                    ac5Var.d = false;
                    ac5Var.b = (i8 != 182 || i8 == 179) ? z : false;
                    ac5Var.c = i8 != 182 ? z : false;
                    ac5Var.f = 0;
                    ac5Var.h = j;
                    i6 = i;
                    i5 = i2;
                }
            }
            z = true;
            int i142 = i - b;
            this.f.b(i142, this.g - i142, this.j);
            ac5 ac5Var2 = this.f;
            long j2 = this.k;
            ac5Var2.e = i8;
            ac5Var2.d = false;
            ac5Var2.b = (i8 != 182 || i8 == 179) ? z : false;
            ac5Var2.c = i8 != 182 ? z : false;
            ac5Var2.f = 0;
            ac5Var2.h = j2;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // gu3
    public final void d() {
        yad.a(this.c);
        zb5 zb5Var = this.d;
        zb5Var.c = false;
        zb5Var.a = 0;
        zb5Var.d = (byte) 0;
        ac5 ac5Var = this.f;
        if (ac5Var != null) {
            ac5Var.b = false;
            ac5Var.c = false;
            ac5Var.d = false;
            ac5Var.e = -1;
        }
        oh7 oh7Var = this.e;
        if (oh7Var != null) {
            oh7Var.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // gu3
    public final void f() {
        this.f.getClass();
        this.f.b(0, this.g, this.j);
        ac5 ac5Var = this.f;
        ac5Var.b = false;
        ac5Var.c = false;
        ac5Var.d = false;
        ac5Var.e = -1;
    }

    @Override // gu3
    public final void g(int i, long j) {
        this.k = j;
    }

    @Override // gu3
    public final void h(l74 l74Var, l2c l2cVar) {
        l2cVar.a();
        l2cVar.b();
        this.h = l2cVar.e;
        l2cVar.b();
        wxb S = l74Var.S(l2cVar.d, 2);
        this.i = S;
        this.f = new ac5(S);
        this.a.b(l74Var, l2cVar);
    }

    @Override // gu3
    public final void e() {
    }
}
