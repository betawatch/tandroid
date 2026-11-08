package d4;

import a8.ia;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import h2.x;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g extends j {
    public final x h = new x();
    public final f i = new f();
    public int j = -1;
    public final int k;
    public final e[] l;
    public e m;
    public List n;
    public List o;
    public f p;
    public int q;

    public g(int i7, List list) {
        this.k = i7 == -1 ? 1 : i7;
        if (list != null) {
            byte[] bArr = h2.g.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10] = new e();
        }
        this.m = this.l[0];
    }

    @Override // d4.j
    public final d6.i f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new d6.i(list, 16);
    }

    @Override // d4.j, k2.e
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // d4.j
    public final void g(h hVar) {
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        while (xVar.a() >= 3) {
            int A = xVar.A();
            int i7 = A & 3;
            boolean z9 = (A & 4) == 4;
            byte A2 = (byte) xVar.A();
            byte A3 = (byte) xVar.A();
            if (i7 == 2 || i7 == 3) {
                if (z9) {
                    if (i7 == 3) {
                        j();
                        int i10 = (A2 & 192) >> 6;
                        int i11 = this.j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            h2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i10);
                        }
                        this.j = i10;
                        int i12 = A2 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.p = fVar;
                        byte[] bArr = (byte[]) fVar.b;
                        fVar.e = 1;
                        bArr[0] = A3;
                    } else {
                        ia.f(i7 == 2);
                        f fVar2 = this.p;
                        if (fVar2 == null) {
                            h2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = (byte[]) fVar2.b;
                            int i13 = fVar2.e;
                            int i14 = i13 + 1;
                            fVar2.e = i14;
                            bArr2[i13] = A2;
                            fVar2.e = i13 + 2;
                            bArr2[i14] = A3;
                        }
                    }
                    f fVar3 = this.p;
                    if (fVar3.e == (fVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // k2.e
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // d4.j
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        char c10;
        int i7;
        boolean z9;
        f fVar = this.p;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        if (fVar.e != (fVar.d * 2) - 1) {
            h2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        f fVar2 = this.p;
        byte[] bArr = (byte[]) fVar2.b;
        int i11 = fVar2.e;
        f fVar3 = this.i;
        fVar3.H(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int j3 = fVar3.j(3);
                int j10 = fVar3.j(5);
                if (j3 == 7) {
                    fVar3.L(i10);
                    j3 = fVar3.j(6);
                    if (j3 < 7) {
                        com.google.android.recaptcha.internal.a.o(j3, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (j10 == 0) {
                    if (j3 != 0) {
                        h2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + j3 + ") when blockSize is 0");
                    }
                } else if (j3 != this.k) {
                    fVar3.M(j10);
                } else {
                    int f10 = (j10 * 8) + fVar3.f();
                    while (fVar3.f() < f10) {
                        int j11 = fVar3.j(8);
                        if (j11 != 16) {
                            if (j11 <= 31) {
                                if (j11 != 0) {
                                    if (j11 == i12) {
                                        this.n = k();
                                    } else if (j11 != 8) {
                                        switch (j11) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (j11 < 17 || j11 > 23) {
                                                    if (j11 < 24 || j11 > 31) {
                                                        com.google.android.recaptcha.internal.a.o(j11, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        h2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + j11);
                                                        fVar3.L(16);
                                                        break;
                                                    }
                                                } else {
                                                    h2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + j11);
                                                    fVar3.L(8);
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
                                i7 = i10;
                            } else if (j11 <= 127) {
                                if (j11 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (j11 & qs.e4));
                                }
                                i7 = i10;
                                z10 = true;
                            } else {
                                if (j11 <= 159) {
                                    e[] eVarArr = this.l;
                                    switch (j11) {
                                        case 128:
                                        case qs.N1 /* 129 */:
                                        case qs.O1 /* 130 */:
                                        case qs.P1 /* 131 */:
                                        case qs.Q1 /* 132 */:
                                        case 133:
                                        case 134:
                                        case qs.R1 /* 135 */:
                                            z9 = true;
                                            int i13 = j11 - 128;
                                            if (this.q != i13) {
                                                this.q = i13;
                                                this.m = eVarArr[i13];
                                                break;
                                            }
                                            break;
                                        case qs.S1 /* 136 */:
                                            z9 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (fVar3.i()) {
                                                    e eVar = eVarArr[8 - i14];
                                                    eVar.a.clear();
                                                    eVar.b.clear();
                                                    eVar.o = -1;
                                                    eVar.p = -1;
                                                    eVar.q = -1;
                                                    eVar.s = -1;
                                                    eVar.u = 0;
                                                }
                                            }
                                            break;
                                        case qs.T1 /* 137 */:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i15].d = true;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case qs.U1 /* 138 */:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i16].d = false;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case qs.V1 /* 139 */:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i17].d = !r1.d;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case qs.W1 /* 140 */:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i18].d();
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case qs.X1 /* 141 */:
                                            fVar3.L(8);
                                            z9 = true;
                                            break;
                                        case qs.Y1 /* 142 */:
                                            z9 = true;
                                            break;
                                        case qs.Z1 /* 143 */:
                                            l();
                                            z9 = true;
                                            break;
                                        case qs.a2 /* 144 */:
                                            int i19 = i10;
                                            if (!this.m.c) {
                                                fVar3.L(16);
                                                z9 = true;
                                                i12 = 3;
                                                break;
                                            } else {
                                                fVar3.j(4);
                                                fVar3.j(i19);
                                                fVar3.j(i19);
                                                boolean i20 = fVar3.i();
                                                boolean i21 = fVar3.i();
                                                i12 = 3;
                                                fVar3.j(3);
                                                fVar3.j(3);
                                                this.m.e(i20, i21);
                                                z9 = true;
                                            }
                                        case qs.b2 /* 145 */:
                                            if (this.m.c) {
                                                int c11 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                int c12 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.L(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                this.m.f(c11, c12);
                                            } else {
                                                fVar3.L(24);
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case qs.c2 /* 146 */:
                                            if (this.m.c) {
                                                fVar3.L(4);
                                                int j12 = fVar3.j(4);
                                                fVar3.L(2);
                                                fVar3.j(6);
                                                e eVar2 = this.m;
                                                if (eVar2.u != j12) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.u = j12;
                                            } else {
                                                fVar3.L(16);
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case qs.d2 /* 147 */:
                                        case qs.e2 /* 148 */:
                                        case qs.f2 /* 149 */:
                                        case qs.g2 /* 150 */:
                                        default:
                                            com.google.android.recaptcha.internal.a.o(j11, "Invalid C1 command: ", "Cea708Decoder");
                                            z9 = true;
                                            break;
                                        case qs.h2 /* 151 */:
                                            if (this.m.c) {
                                                int c13 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.j(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                fVar3.i();
                                                fVar3.i();
                                                fVar3.j(2);
                                                fVar3.j(2);
                                                int j13 = fVar3.j(2);
                                                fVar3.L(8);
                                                e eVar3 = this.m;
                                                eVar3.n = c13;
                                                eVar3.k = j13;
                                            } else {
                                                fVar3.L(32);
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case qs.i2 /* 152 */:
                                        case qs.j2 /* 153 */:
                                        case qs.k2 /* 154 */:
                                        case qs.l2 /* 155 */:
                                        case qs.m2 /* 156 */:
                                        case qs.n2 /* 157 */:
                                        case qs.o2 /* 158 */:
                                        case qs.p2 /* 159 */:
                                            int i22 = j11 - 152;
                                            e eVar4 = eVarArr[i22];
                                            fVar3.L(i10);
                                            boolean i23 = fVar3.i();
                                            fVar3.L(i10);
                                            int j14 = fVar3.j(i12);
                                            boolean i24 = fVar3.i();
                                            int j15 = fVar3.j(7);
                                            int j16 = fVar3.j(8);
                                            int j17 = fVar3.j(4);
                                            int j18 = fVar3.j(4);
                                            fVar3.L(i10);
                                            fVar3.L(6);
                                            fVar3.L(i10);
                                            int j19 = fVar3.j(3);
                                            int j20 = fVar3.j(3);
                                            ArrayList arrayList = eVar4.a;
                                            eVar4.c = true;
                                            eVar4.d = i23;
                                            eVar4.e = j14;
                                            eVar4.f = i24;
                                            eVar4.g = j15;
                                            eVar4.h = j16;
                                            eVar4.i = j17;
                                            int i25 = j18 + 1;
                                            if (eVar4.j != i25) {
                                                eVar4.j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= eVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (j19 != 0 && eVar4.l != j19) {
                                                eVar4.l = j19;
                                                int i26 = j19 - 1;
                                                int i27 = e.B[i26];
                                                boolean z11 = e.A[i26];
                                                int i28 = e.y[i26];
                                                int i29 = e.z[i26];
                                                int i30 = e.x[i26];
                                                eVar4.n = i27;
                                                eVar4.k = i30;
                                            }
                                            if (j20 != 0 && eVar4.m != j20) {
                                                eVar4.m = j20;
                                                int i31 = j20 - 1;
                                                int i32 = e.D[i31];
                                                int i33 = e.C[i31];
                                                eVar4.e(false, false);
                                                eVar4.f(e.v, e.E[i31]);
                                            }
                                            if (this.q != i22) {
                                                this.q = i22;
                                                this.m = eVarArr[i22];
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                    }
                                } else {
                                    z9 = true;
                                    if (j11 <= 255) {
                                        this.m.a((char) (j11 & qs.e4));
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j11, "Invalid base command: ", "Cea708Decoder");
                                        i7 = 2;
                                        c10 = 7;
                                    }
                                }
                                z10 = z9;
                                i7 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int j21 = fVar3.j(8);
                            if (j21 <= 31) {
                                c10 = 7;
                                if (j21 > 7) {
                                    if (j21 <= 15) {
                                        fVar3.L(8);
                                    } else if (j21 <= 23) {
                                        fVar3.L(16);
                                    } else if (j21 <= 31) {
                                        fVar3.L(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (j21 <= 127) {
                                    if (j21 == 32) {
                                        this.m.a(' ');
                                    } else if (j21 == 33) {
                                        this.m.a((char) 160);
                                    } else if (j21 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (j21 == 42) {
                                        this.m.a((char) 352);
                                    } else if (j21 == 44) {
                                        this.m.a((char) 338);
                                    } else if (j21 == 63) {
                                        this.m.a((char) 376);
                                    } else if (j21 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (j21 == 58) {
                                        this.m.a((char) 353);
                                    } else if (j21 == 60) {
                                        this.m.a((char) 339);
                                    } else if (j21 != 61) {
                                        switch (j21) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case qs.o0 /* 51 */:
                                                this.m.a((char) 8220);
                                                break;
                                            case qs.p0 /* 52 */:
                                                this.m.a((char) 8221);
                                                break;
                                            case qs.q0 /* 53 */:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (j21) {
                                                    case qs.D1 /* 118 */:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case qs.E1 /* 119 */:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case qs.F1 /* 121 */:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case qs.G1 /* 122 */:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case qs.H1 /* 123 */:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case qs.I1 /* 124 */:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case qs.J1 /* 125 */:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case qs.K1 /* 126 */:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case qs.L1 /* 127 */:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        com.google.android.recaptcha.internal.a.o(j21, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i7 = 2;
                                    z10 = true;
                                } else if (j21 > 159) {
                                    i7 = 2;
                                    if (j21 <= 255) {
                                        if (j21 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            com.google.android.recaptcha.internal.a.o(j21, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j21, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (j21 <= 135) {
                                    fVar3.L(32);
                                } else if (j21 <= 143) {
                                    fVar3.L(40);
                                } else if (j21 <= 159) {
                                    i7 = 2;
                                    fVar3.L(2);
                                    fVar3.L(fVar3.j(6) * 8);
                                }
                            }
                            i7 = 2;
                        }
                        i10 = i7;
                    }
                }
            }
        }
        if (z10) {
            this.n = k();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        d dVar;
        Layout.Alignment alignment;
        float f10;
        float f11;
        int i7;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 8; i12++) {
            e[] eVarArr = this.l;
            e eVar = eVarArr[i12];
            if (eVar.c && (!eVar.a.isEmpty() || eVar.b.length() != 0)) {
                e eVar2 = eVarArr[i12];
                if (eVar2.d) {
                    ArrayList arrayList2 = eVar2.a;
                    if (!eVar2.c || (arrayList2.isEmpty() && eVar2.b.length() == 0)) {
                        dVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i13));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) eVar2.b());
                        int i14 = eVar2.k;
                        if (i14 != 0) {
                            if (i14 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i14 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i14 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + eVar2.k);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (eVar2.f) {
                                f10 = eVar2.h / 209.0f;
                                f11 = eVar2.g / 74.0f;
                            } else {
                                f10 = eVar2.h / 99.0f;
                                f11 = eVar2.g / 99.0f;
                            }
                            float f12 = (f10 * 0.9f) + 0.05f;
                            float f13 = (f11 * 0.9f) + 0.05f;
                            int i15 = eVar2.i;
                            i7 = i15 / 3;
                            if (i7 != 0) {
                                i10 = i15;
                                i11 = 0;
                            } else if (i7 == 1) {
                                i10 = i15;
                                i11 = 1;
                            } else {
                                i10 = i15;
                                i11 = 2;
                            }
                            int i16 = i10 % 3;
                            int i17 = i16 != 0 ? 0 : i16 == 1 ? 1 : 2;
                            int i18 = eVar2.n;
                            dVar = new d(spannableStringBuilder, alignment2, f13, i11, f12, i17, i18 == e.w, i18, eVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (eVar2.f) {
                        }
                        float f122 = (f10 * 0.9f) + 0.05f;
                        float f132 = (f11 * 0.9f) + 0.05f;
                        int i152 = eVar2.i;
                        i7 = i152 / 3;
                        if (i7 != 0) {
                        }
                        int i162 = i10 % 3;
                        if (i162 != 0) {
                        }
                        int i182 = eVar2.n;
                        dVar = new d(spannableStringBuilder, alignment22, f132, i11, f122, i17, i182 == e.w, i182, eVar2.e);
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            arrayList3.add(((d) arrayList.get(i19)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.l[i7].d();
        }
    }
}
