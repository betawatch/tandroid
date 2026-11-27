// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ae1 extends de1 {
    public final ey7 h = new ey7();
    public final zd1 i = new zd1();
    public int j = -1;
    public final int k;
    public final yd1[] l;
    public yd1 m;
    public List n;
    public List o;
    public zd1 p;
    public int q;

    public ae1(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = rk2.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new yd1[8];
        int i2 = 0;
        while (true) {
            yd1[] yd1VarArr = this.l;
            if (i2 >= 8) {
                this.m = yd1VarArr[0];
                return;
            } else {
                yd1VarArr[i2] = new yd1();
                i2++;
            }
        }
    }

    @Override // de1
    public final wz4 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new wz4(list);
    }

    @Override // de1, n93
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // de1
    public final void g(be1 be1Var) {
        zd1 zd1Var;
        ByteBuffer byteBuffer = be1Var.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ey7 ey7Var = this.h;
        ey7Var.L(limit, array);
        while (ey7Var.a() >= 3) {
            int A = ey7Var.A();
            int i = A & 3;
            boolean z = (A & 4) == 4;
            byte A2 = (byte) ey7Var.A();
            byte A3 = (byte) ey7Var.A();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (A2 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            efd.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = A2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        zd1Var = new zd1(i2, i4);
                        this.p = zd1Var;
                        byte[] bArr = zd1Var.b;
                        zd1Var.e = 1;
                        bArr[0] = A3;
                    } else {
                        yve.f(i == 2);
                        zd1 zd1Var2 = this.p;
                        if (zd1Var2 == null) {
                            efd.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = zd1Var2.b;
                            int i5 = zd1Var2.e;
                            int i6 = i5 + 1;
                            zd1Var2.e = i6;
                            bArr2[i5] = A2;
                            zd1Var2.e = i5 + 2;
                            bArr2[i6] = A3;
                            zd1Var = zd1Var2;
                        }
                    }
                    if (zd1Var.e == (zd1Var.d << 1) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // n93
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // de1
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        boolean z;
        int i;
        int i2;
        zd1 zd1Var = this.p;
        if (zd1Var == null) {
            return;
        }
        if (zd1Var.e != (zd1Var.d << 1) - 1) {
            efd.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d << 1) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        zd1 zd1Var2 = this.p;
        byte[] bArr = zd1Var2.b;
        int i3 = zd1Var2.e;
        zd1 zd1Var3 = this.i;
        zd1Var3.j(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (zd1Var3.b() > 0) {
                int i4 = 3;
                int f = zd1Var3.f(3);
                int f2 = zd1Var3.f(5);
                int i5 = 2;
                if (f == 7) {
                    zd1Var3.n(2);
                    f = zd1Var3.f(6);
                    if (f < 7) {
                        c00.p(f, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (f2 == 0) {
                    if (f != 0) {
                        efd.f("Cea708Decoder", "serviceNumber is non-zero (" + f + ") when blockSize is 0");
                    }
                } else if (f != this.k) {
                    zd1Var3.o(f2);
                } else {
                    int i6 = (zd1Var3.c << 3) + zd1Var3.d + (f2 << 3);
                    while ((zd1Var3.c << i4) + zd1Var3.d < i6) {
                        int f3 = zd1Var3.f(8);
                        if (f3 == 16) {
                            z = true;
                            int f4 = zd1Var3.f(8);
                            if (f4 <= 31) {
                                if (f4 > 7) {
                                    if (f4 <= 15) {
                                        zd1Var3.n(8);
                                    } else if (f4 <= 23) {
                                        zd1Var3.n(16);
                                    } else if (f4 <= 31) {
                                        zd1Var3.n(24);
                                    }
                                }
                            } else if (f4 <= 127) {
                                if (f4 == 32) {
                                    this.m.a(' ');
                                } else if (f4 == 33) {
                                    this.m.a((char) 160);
                                } else if (f4 == 37) {
                                    this.m.a((char) 8230);
                                } else if (f4 == 42) {
                                    this.m.a((char) 352);
                                } else if (f4 == 44) {
                                    this.m.a((char) 338);
                                } else if (f4 == 63) {
                                    this.m.a((char) 376);
                                } else if (f4 == 57) {
                                    this.m.a((char) 8482);
                                } else if (f4 == 58) {
                                    this.m.a((char) 353);
                                } else if (f4 == 60) {
                                    this.m.a((char) 339);
                                } else if (f4 != 61) {
                                    switch (f4) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.m.a((char) 8217);
                                            break;
                                        case jn7.n0 /* 51 */:
                                            this.m.a((char) 8220);
                                            break;
                                        case jn7.o0 /* 52 */:
                                            this.m.a((char) 8221);
                                            break;
                                        case jn7.p0 /* 53 */:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (f4) {
                                                case jn7.C1 /* 118 */:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case jn7.D1 /* 119 */:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case jn7.E1 /* 120 */:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case jn7.F1 /* 122 */:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case jn7.G1 /* 123 */:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case jn7.H1 /* 124 */:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case jn7.I1 /* 125 */:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case jn7.J1 /* 126 */:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case jn7.K1 /* 127 */:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    c00.p(f4, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z2 = z;
                            } else if (f4 > 159) {
                                i = 2;
                                i2 = 3;
                                if (f4 <= 255) {
                                    if (f4 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        c00.p(f4, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    c00.p(f4, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (f4 <= 135) {
                                zd1Var3.n(32);
                            } else if (f4 <= 143) {
                                zd1Var3.n(40);
                            } else if (f4 <= 159) {
                                i = 2;
                                zd1Var3.n(2);
                                i2 = 3;
                                zd1Var3.n(zd1Var3.f(6) << 3);
                            }
                            i = 2;
                            i2 = 3;
                        } else if (f3 <= 31) {
                            if (f3 != 0) {
                                if (f3 == i4) {
                                    this.n = k();
                                } else if (f3 != 8) {
                                    switch (f3) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (f3 < 17 || f3 > 23) {
                                                if (f3 < 24 || f3 > 31) {
                                                    c00.p(f3, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    efd.f("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + f3);
                                                    zd1Var3.n(16);
                                                    break;
                                                }
                                            } else {
                                                efd.f("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + f3);
                                                zd1Var3.n(8);
                                                break;
                                            }
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                            i2 = i4;
                            i = i5;
                        } else if (f3 <= 127) {
                            yd1 yd1Var = this.m;
                            if (f3 == 127) {
                                yd1Var.a((char) 9835);
                            } else {
                                yd1Var.a((char) (f3 & jn7.d4));
                            }
                            i2 = i4;
                            i = i5;
                            z2 = true;
                        } else {
                            if (f3 <= 159) {
                                yd1[] yd1VarArr = this.l;
                                switch (f3) {
                                    case 128:
                                    case jn7.M1 /* 129 */:
                                    case jn7.N1 /* 130 */:
                                    case jn7.O1 /* 131 */:
                                    case jn7.P1 /* 132 */:
                                    case jn7.Q1 /* 133 */:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i7 = f3 - 128;
                                        if (this.q != i7) {
                                            this.q = i7;
                                            this.m = yd1VarArr[i7];
                                            break;
                                        }
                                        break;
                                    case jn7.R1 /* 136 */:
                                        z = true;
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (zd1Var3.e()) {
                                                yd1 yd1Var2 = yd1VarArr[8 - i8];
                                                yd1Var2.a.clear();
                                                yd1Var2.b.clear();
                                                yd1Var2.o = -1;
                                                yd1Var2.p = -1;
                                                yd1Var2.q = -1;
                                                yd1Var2.s = -1;
                                                yd1Var2.u = 0;
                                            }
                                        }
                                        break;
                                    case jn7.S1 /* 137 */:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (zd1Var3.e()) {
                                                yd1VarArr[8 - i9].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case jn7.T1 /* 138 */:
                                        for (int i10 = 1; i10 <= 8; i10++) {
                                            if (zd1Var3.e()) {
                                                yd1VarArr[8 - i10].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case jn7.U1 /* 139 */:
                                        for (int i11 = 1; i11 <= 8; i11++) {
                                            if (zd1Var3.e()) {
                                                yd1VarArr[8 - i11].d = !r1.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case jn7.V1 /* 140 */:
                                        for (int i12 = 1; i12 <= 8; i12++) {
                                            if (zd1Var3.e()) {
                                                yd1VarArr[8 - i12].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case jn7.W1 /* 141 */:
                                        zd1Var3.n(8);
                                        z = true;
                                        break;
                                    case jn7.X1 /* 142 */:
                                        z = true;
                                        break;
                                    case jn7.Y1 /* 143 */:
                                        l();
                                        z = true;
                                        break;
                                    case jn7.Z1 /* 144 */:
                                        int i13 = i5;
                                        if (this.m.c) {
                                            zd1Var3.f(4);
                                            zd1Var3.f(i13);
                                            zd1Var3.f(i13);
                                            boolean e = zd1Var3.e();
                                            boolean e2 = zd1Var3.e();
                                            zd1Var3.f(3);
                                            zd1Var3.f(3);
                                            this.m.e(e, e2);
                                        } else {
                                            zd1Var3.n(16);
                                        }
                                        z = true;
                                        break;
                                    case jn7.a2 /* 145 */:
                                        if (this.m.c) {
                                            int c = yd1.c(zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2));
                                            int c2 = yd1.c(zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2));
                                            zd1Var3.n(2);
                                            yd1.c(zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2), 0);
                                            this.m.f(c, c2);
                                        } else {
                                            zd1Var3.n(24);
                                        }
                                        z = true;
                                        break;
                                    case jn7.b2 /* 146 */:
                                        if (this.m.c) {
                                            zd1Var3.n(4);
                                            int f5 = zd1Var3.f(4);
                                            zd1Var3.n(2);
                                            zd1Var3.f(6);
                                            yd1 yd1Var3 = this.m;
                                            if (yd1Var3.u != f5) {
                                                yd1Var3.a('\n');
                                            }
                                            yd1Var3.u = f5;
                                        } else {
                                            zd1Var3.n(16);
                                        }
                                        z = true;
                                        break;
                                    case jn7.c2 /* 147 */:
                                    case jn7.d2 /* 148 */:
                                    case jn7.e2 /* 149 */:
                                    case jn7.f2 /* 150 */:
                                    default:
                                        c00.p(f3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case jn7.g2 /* 151 */:
                                        if (this.m.c) {
                                            int c3 = yd1.c(zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2));
                                            zd1Var3.f(2);
                                            yd1.c(zd1Var3.f(2), zd1Var3.f(2), zd1Var3.f(2), 0);
                                            zd1Var3.e();
                                            zd1Var3.e();
                                            zd1Var3.f(2);
                                            zd1Var3.f(2);
                                            int f6 = zd1Var3.f(2);
                                            zd1Var3.n(8);
                                            yd1 yd1Var4 = this.m;
                                            yd1Var4.n = c3;
                                            yd1Var4.k = f6;
                                        } else {
                                            zd1Var3.n(32);
                                        }
                                        z = true;
                                        break;
                                    case jn7.h2 /* 152 */:
                                    case jn7.i2 /* 153 */:
                                    case jn7.j2 /* 154 */:
                                    case jn7.k2 /* 155 */:
                                    case jn7.l2 /* 156 */:
                                    case jn7.m2 /* 157 */:
                                    case jn7.n2 /* 158 */:
                                    case jn7.o2 /* 159 */:
                                        int i14 = f3 - 152;
                                        yd1 yd1Var5 = yd1VarArr[i14];
                                        zd1Var3.n(i5);
                                        boolean e3 = zd1Var3.e();
                                        zd1Var3.n(i5);
                                        int f7 = zd1Var3.f(i4);
                                        boolean e4 = zd1Var3.e();
                                        int f8 = zd1Var3.f(7);
                                        int f9 = zd1Var3.f(8);
                                        int f10 = zd1Var3.f(4);
                                        int f11 = zd1Var3.f(4);
                                        zd1Var3.n(i5);
                                        zd1Var3.n(6);
                                        zd1Var3.n(i5);
                                        int f12 = zd1Var3.f(3);
                                        int f13 = zd1Var3.f(3);
                                        ArrayList arrayList = yd1Var5.a;
                                        yd1Var5.c = true;
                                        yd1Var5.d = e3;
                                        yd1Var5.e = f7;
                                        yd1Var5.f = e4;
                                        yd1Var5.g = f8;
                                        yd1Var5.h = f9;
                                        yd1Var5.i = f10;
                                        int i15 = f11 + 1;
                                        if (yd1Var5.j != i15) {
                                            yd1Var5.j = i15;
                                            while (true) {
                                                if (arrayList.size() >= yd1Var5.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (f12 != 0 && yd1Var5.l != f12) {
                                            yd1Var5.l = f12;
                                            int i16 = f12 - 1;
                                            int i17 = yd1.B[i16];
                                            boolean z3 = yd1.A[i16];
                                            int i18 = yd1.y[i16];
                                            int i19 = yd1.z[i16];
                                            int i20 = yd1.x[i16];
                                            yd1Var5.n = i17;
                                            yd1Var5.k = i20;
                                        }
                                        if (f13 != 0 && yd1Var5.m != f13) {
                                            yd1Var5.m = f13;
                                            int i21 = f13 - 1;
                                            int i22 = yd1.D[i21];
                                            int i23 = yd1.C[i21];
                                            yd1Var5.e(false, false);
                                            yd1Var5.f(yd1.v, yd1.E[i21]);
                                        }
                                        if (this.q != i14) {
                                            this.q = i14;
                                            this.m = yd1VarArr[i14];
                                        }
                                        z = true;
                                        break;
                                }
                            } else {
                                z = true;
                                if (f3 <= 255) {
                                    this.m.a((char) (f3 & jn7.d4));
                                } else {
                                    c00.p(f3, "Invalid base command: ", "Cea708Decoder");
                                    i = 2;
                                    i2 = 3;
                                }
                            }
                            z2 = z;
                            i = 2;
                            i2 = 3;
                        }
                        i5 = i;
                        i4 = i2;
                    }
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        Layout.Alignment alignment;
        boolean z;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            yd1[] yd1VarArr = this.l;
            yd1 yd1Var = yd1VarArr[i];
            if (yd1Var.c && (!yd1Var.a.isEmpty() || yd1Var.b.length() != 0)) {
                yd1 yd1Var2 = yd1VarArr[i];
                if (yd1Var2.d) {
                    ArrayList arrayList2 = yd1Var2.a;
                    xd1 xd1Var = null;
                    if (yd1Var2.c && (!arrayList2.isEmpty() || yd1Var2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) yd1Var2.b());
                        int i3 = yd1Var2.k;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i3 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i3 != 3) {
                                xi4.g(yd1Var2.k, "Unexpected justification value: ");
                                return null;
                            }
                            Layout.Alignment alignment2 = alignment;
                            z = yd1Var2.f;
                            int i4 = yd1Var2.h;
                            int i5 = yd1Var2.g;
                            if (z) {
                                f = i4 / 209.0f;
                                f2 = i5 / 74.0f;
                            } else {
                                f = i4 / 99.0f;
                                f2 = i5 / 99.0f;
                            }
                            float f3 = (f * 0.9f) + 0.05f;
                            float f4 = (f2 * 0.9f) + 0.05f;
                            int i6 = yd1Var2.i;
                            int i7 = i6 / 3;
                            int i8 = i7 != 0 ? 0 : i7 == 1 ? 1 : 2;
                            int i9 = i6 % 3;
                            int i10 = i9 != 0 ? 0 : i9 == 1 ? 1 : 2;
                            int i11 = yd1Var2.n;
                            xd1Var = new xd1(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 == yd1.w, i11, yd1Var2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        z = yd1Var2.f;
                        int i42 = yd1Var2.h;
                        int i52 = yd1Var2.g;
                        if (z) {
                        }
                        float f32 = (f * 0.9f) + 0.05f;
                        float f42 = (f2 * 0.9f) + 0.05f;
                        int i62 = yd1Var2.i;
                        int i72 = i62 / 3;
                        if (i72 != 0) {
                        }
                        int i92 = i62 % 3;
                        if (i92 != 0) {
                        }
                        int i112 = yd1Var2.n;
                        xd1Var = new xd1(spannableStringBuilder, alignment22, f42, i8, f32, i10, i112 == yd1.w, i112, yd1Var2.e);
                    }
                    if (xd1Var != null) {
                        arrayList.add(xd1Var);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, xd1.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((xd1) arrayList.get(i12)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
