// default package

import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kd3 extends jd3 {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final byte K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final byte O;
    public final boolean P;
    public final String Q;
    public final boolean e;
    public final gd3 f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0119 A[EDGE_INSN: B:162:0x0119->B:84:0x0119 BREAK  A[LOOP:1: B:77:0x0104->B:160:0x0116], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kd3(int i, t1c t1cVar, int i2, gd3 gd3Var, int i3, String str, int i4, boolean z) {
        super(i, t1cVar, i2);
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        boolean z4;
        byte b;
        boolean z5;
        boolean z6;
        gd3 gd3Var2;
        ko4 ko4Var;
        boolean z7;
        String c;
        int i11;
        ko4 ko4Var2;
        int i12;
        int i13;
        float f;
        int i14;
        ko4 ko4Var3;
        int i15;
        int i16;
        int i17;
        this.f = gd3Var;
        boolean z8 = gd3Var.x0;
        j99 j99Var = gd3Var.m;
        j99 j99Var2 = gd3Var.o;
        int i18 = z8 ? 24 : 16;
        byte b2 = 0;
        this.J = false;
        if (z && (((i15 = (ko4Var3 = this.d).A) == -1 || i15 <= gd3Var.a) && ((i16 = ko4Var3.B) == -1 || i16 <= gd3Var.b))) {
            float f2 = ko4Var3.F;
            if ((f2 == -1.0f || f2 <= gd3Var.c) && ((i17 = ko4Var3.k) == -1 || i17 <= gd3Var.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i12 = (ko4Var2 = this.d).A) == -1 || i12 >= gd3Var.e) && ((i13 = ko4Var2.B) == -1 || i13 >= gd3Var.f))) {
                    f = ko4Var2.F;
                    if ((f != -1.0f || f >= gd3Var.g) && ((i14 = ko4Var2.k) == -1 || i14 >= gd3Var.h)) {
                        z3 = true;
                        this.h = z3;
                        this.n = qu6.c(i3, false);
                        ko4 ko4Var4 = this.d;
                        float f3 = ko4Var4.F;
                        this.r = f3 == -1.0f && f3 >= 10.0f;
                        this.s = ko4Var4.k;
                        int i19 = ko4Var4.A;
                        this.w = (i19 != -1 || (i11 = ko4Var4.B) == -1) ? -1 : i19 * i11;
                        i5 = 0;
                        while (true) {
                            i6 = j99Var2.d;
                            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i5 < i6) {
                                i8 = 0;
                                i5 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i8 = ld3.g(this.d, (String) j99Var2.get(i5), false);
                                if (i8 > 0) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        this.y = i5;
                        this.E = i8;
                        int i20 = this.d.f;
                        int i21 = gd3Var.p;
                        eu7 eu7Var = ld3.l;
                        this.F = (i20 == 0 && i20 == i21) ? Integer.MAX_VALUE : Integer.bitCount(i20 & i21);
                        int i22 = this.d.f;
                        this.H = (i22 == 0 && (i22 & 1) == 0) ? false : true;
                        this.I = ld3.g(this.d, str, ld3.h(str) != null);
                        ko4 ko4Var5 = this.d;
                        str2 = ko4Var5.t;
                        i9 = i3 & 384;
                        if (i9 == 256 && (c = wm6.c(ko4Var5)) != null) {
                            str2 = c;
                        }
                        i10 = 0;
                        while (true) {
                            if (i10 < j99Var.d) {
                                if (str2 != null && str2.equals(j99Var.get(i10))) {
                                    i7 = i10;
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.x = i7;
                        this.G = ld3.f(this.d, gd3Var.n);
                        this.L = i9 != 128 || i9 == 256;
                        z4 = i9 != 128;
                        this.M = z4;
                        this.N = (i3 & 64) != 64;
                        this.Q = str2;
                        if (str2 != null) {
                            b = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z7 = false;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z7 = true;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z7 = 2;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z7 = 3;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z7 = 4;
                                        break;
                                    }
                                    z7 = -1;
                                    break;
                                default:
                                    z7 = -1;
                                    break;
                            }
                            switch (z7) {
                                case false:
                                    b = 5;
                                    break;
                                case true:
                                    b = 3;
                                    break;
                                case true:
                                    b = 1;
                                    break;
                                case true:
                                    b = 2;
                                    break;
                            }
                            this.O = b;
                            if (z4) {
                                bm2 bm2Var = this.d.L;
                                if (bm2Var != null) {
                                    int i23 = bm2Var.c;
                                    if (i23 == 7 || i23 == 6) {
                                        z5 = true;
                                        this.P = z5;
                                        z6 = this.e;
                                        gd3Var2 = this.f;
                                        ko4Var = this.d;
                                        if ((ko4Var.f & TLObject.FLAG_14) == 0 && qu6.c(i3, gd3Var2.B0) && (z6 || gd3Var2.w0)) {
                                            b2 = (qu6.c(i3, false) || !this.h || !z6 || ko4Var.k == -1 || gd3Var2.G || gd3Var2.F || (i3 & i18) == 0) ? (byte) 1 : (byte) 2;
                                        }
                                        this.K = b2;
                                    }
                                } else {
                                    bm2 bm2Var2 = bm2.h;
                                }
                            }
                            z5 = false;
                            this.P = z5;
                            z6 = this.e;
                            gd3Var2 = this.f;
                            ko4Var = this.d;
                            if ((ko4Var.f & TLObject.FLAG_14) == 0) {
                                if (qu6.c(i3, false)) {
                                }
                            }
                            this.K = b2;
                        }
                        b = 0;
                        this.O = b;
                        if (z4) {
                        }
                        z5 = false;
                        this.P = z5;
                        z6 = this.e;
                        gd3Var2 = this.f;
                        ko4Var = this.d;
                        if ((ko4Var.f & TLObject.FLAG_14) == 0) {
                        }
                        this.K = b2;
                    }
                }
                z3 = false;
                this.h = z3;
                this.n = qu6.c(i3, false);
                ko4 ko4Var42 = this.d;
                float f32 = ko4Var42.F;
                this.r = f32 == -1.0f && f32 >= 10.0f;
                this.s = ko4Var42.k;
                int i192 = ko4Var42.A;
                this.w = (i192 != -1 || (i11 = ko4Var42.B) == -1) ? -1 : i192 * i11;
                i5 = 0;
                while (true) {
                    i6 = j99Var2.d;
                    i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i5 < i6) {
                    }
                    i5++;
                }
                this.y = i5;
                this.E = i8;
                int i202 = this.d.f;
                int i212 = gd3Var.p;
                eu7 eu7Var2 = ld3.l;
                this.F = (i202 == 0 && i202 == i212) ? Integer.MAX_VALUE : Integer.bitCount(i202 & i212);
                int i222 = this.d.f;
                this.H = (i222 == 0 && (i222 & 1) == 0) ? false : true;
                this.I = ld3.g(this.d, str, ld3.h(str) != null);
                ko4 ko4Var52 = this.d;
                str2 = ko4Var52.t;
                i9 = i3 & 384;
                if (i9 == 256) {
                    str2 = c;
                }
                i10 = 0;
                while (true) {
                    if (i10 < j99Var.d) {
                    }
                    i10++;
                }
                this.x = i7;
                this.G = ld3.f(this.d, gd3Var.n);
                this.L = i9 != 128 || i9 == 256;
                if (i9 != 128) {
                }
                this.M = z4;
                this.N = (i3 & 64) != 64;
                this.Q = str2;
                if (str2 != null) {
                }
                b = 0;
                this.O = b;
                if (z4) {
                }
                z5 = false;
                this.P = z5;
                z6 = this.e;
                gd3Var2 = this.f;
                ko4Var = this.d;
                if ((ko4Var.f & TLObject.FLAG_14) == 0) {
                }
                this.K = b2;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = ko4Var2.F;
            if (f != -1.0f) {
            }
            z3 = true;
            this.h = z3;
            this.n = qu6.c(i3, false);
            ko4 ko4Var422 = this.d;
            float f322 = ko4Var422.F;
            this.r = f322 == -1.0f && f322 >= 10.0f;
            this.s = ko4Var422.k;
            int i1922 = ko4Var422.A;
            this.w = (i1922 != -1 || (i11 = ko4Var422.B) == -1) ? -1 : i1922 * i11;
            i5 = 0;
            while (true) {
                i6 = j99Var2.d;
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i5 < i6) {
                }
                i5++;
            }
            this.y = i5;
            this.E = i8;
            int i2022 = this.d.f;
            int i2122 = gd3Var.p;
            eu7 eu7Var22 = ld3.l;
            this.F = (i2022 == 0 && i2022 == i2122) ? Integer.MAX_VALUE : Integer.bitCount(i2022 & i2122);
            int i2222 = this.d.f;
            this.H = (i2222 == 0 && (i2222 & 1) == 0) ? false : true;
            this.I = ld3.g(this.d, str, ld3.h(str) != null);
            ko4 ko4Var522 = this.d;
            str2 = ko4Var522.t;
            i9 = i3 & 384;
            if (i9 == 256) {
            }
            i10 = 0;
            while (true) {
                if (i10 < j99Var.d) {
                }
                i10++;
            }
            this.x = i7;
            this.G = ld3.f(this.d, gd3Var.n);
            this.L = i9 != 128 || i9 == 256;
            if (i9 != 128) {
            }
            this.M = z4;
            this.N = (i3 & 64) != 64;
            this.Q = str2;
            if (str2 != null) {
            }
            b = 0;
            this.O = b;
            if (z4) {
            }
            z5 = false;
            this.P = z5;
            z6 = this.e;
            gd3Var2 = this.f;
            ko4Var = this.d;
            if ((ko4Var.f & TLObject.FLAG_14) == 0) {
            }
            this.K = b2;
        }
        z3 = false;
        this.h = z3;
        this.n = qu6.c(i3, false);
        ko4 ko4Var4222 = this.d;
        float f3222 = ko4Var4222.F;
        this.r = f3222 == -1.0f && f3222 >= 10.0f;
        this.s = ko4Var4222.k;
        int i19222 = ko4Var4222.A;
        this.w = (i19222 != -1 || (i11 = ko4Var4222.B) == -1) ? -1 : i19222 * i11;
        i5 = 0;
        while (true) {
            i6 = j99Var2.d;
            i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i5 < i6) {
            }
            i5++;
        }
        this.y = i5;
        this.E = i8;
        int i20222 = this.d.f;
        int i21222 = gd3Var.p;
        eu7 eu7Var222 = ld3.l;
        this.F = (i20222 == 0 && i20222 == i21222) ? Integer.MAX_VALUE : Integer.bitCount(i20222 & i21222);
        int i22222 = this.d.f;
        this.H = (i22222 == 0 && (i22222 & 1) == 0) ? false : true;
        this.I = ld3.g(this.d, str, ld3.h(str) != null);
        ko4 ko4Var5222 = this.d;
        str2 = ko4Var5222.t;
        i9 = i3 & 384;
        if (i9 == 256) {
        }
        i10 = 0;
        while (true) {
            if (i10 < j99Var.d) {
            }
            i10++;
        }
        this.x = i7;
        this.G = ld3.f(this.d, gd3Var.n);
        this.L = i9 != 128 || i9 == 256;
        if (i9 != 128) {
        }
        this.M = z4;
        this.N = (i3 & 64) != 64;
        this.Q = str2;
        if (str2 != null) {
        }
        b = 0;
        this.O = b;
        if (z4) {
        }
        z5 = false;
        this.P = z5;
        z6 = this.e;
        gd3Var2 = this.f;
        ko4Var = this.d;
        if ((ko4Var.f & TLObject.FLAG_14) == 0) {
        }
        this.K = b2;
    }

    public static int c(kd3 kd3Var, kd3 kd3Var2) {
        pp2 c = pp2.a.c(kd3Var.n, kd3Var2.n);
        Integer valueOf = Integer.valueOf(kd3Var.y);
        Integer valueOf2 = Integer.valueOf(kd3Var2.y);
        pk7 pk7Var = pk7.c;
        return c.b(valueOf, valueOf2, pk7Var).a(kd3Var.E, kd3Var2.E).a(kd3Var.F, kd3Var2.F).b(Integer.valueOf(kd3Var.G), Integer.valueOf(kd3Var2.G), pk7Var).c(kd3Var.H, kd3Var2.H).a(kd3Var.I, kd3Var2.I).c(kd3Var.r, kd3Var2.r).c(kd3Var.e, kd3Var2.e).c(kd3Var.h, kd3Var2.h).b(Integer.valueOf(kd3Var.x), Integer.valueOf(kd3Var2.x), pk7Var).c(kd3Var.L, kd3Var2.L).c(kd3Var.N, kd3Var2.N).e();
    }

    @Override // jd3
    public final int a() {
        return this.K;
    }

    @Override // jd3
    public final boolean b(jd3 jd3Var) {
        kd3 kd3Var = (kd3) jd3Var;
        if (!this.J && !Objects.equals(this.Q, kd3Var.Q)) {
            return false;
        }
        this.f.getClass();
        return this.L == kd3Var.L && this.N == kd3Var.N;
    }
}
