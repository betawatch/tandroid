package a4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import e2.x;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import v7.u6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class h extends k {
    public final x h = new x();
    public final g i = new g();
    public int j = -1;
    public final int k;
    public final f[] l;
    public f m;
    public List n;
    public List o;
    public g p;
    public int q;

    public h(int i10, List list) {
        this.k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.g.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new f[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.l[i11] = new f();
        }
        this.m = this.l[0];
    }

    @Override // a4.k
    public final l f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override // a4.k, h2.e
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // a4.k
    public final void g(i iVar) {
        ByteBuffer byteBuffer = iVar.c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        while (xVar.a() >= 3) {
            int A = xVar.A();
            int i10 = A & 3;
            boolean z10 = (A & 4) == 4;
            byte A2 = (byte) xVar.A();
            byte A3 = (byte) xVar.A();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (A2 & 192) >> 6;
                        int i12 = this.j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i11);
                        }
                        this.j = i11;
                        int i13 = A2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        g gVar = new g(i11, i13);
                        this.p = gVar;
                        byte[] bArr = gVar.b;
                        gVar.e = 1;
                        bArr[0] = A3;
                    } else {
                        u6.g(i10 == 2);
                        g gVar2 = this.p;
                        if (gVar2 == null) {
                            e2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = gVar2.b;
                            int i14 = gVar2.e;
                            int i15 = i14 + 1;
                            gVar2.e = i15;
                            bArr2[i14] = A2;
                            gVar2.e = i14 + 2;
                            bArr2[i15] = A3;
                        }
                    }
                    g gVar3 = this.p;
                    if (gVar3.e == (gVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // h2.e
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // a4.k
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        char c10;
        int i10;
        boolean z10;
        g gVar = this.p;
        if (gVar == null) {
            return;
        }
        int i11 = 2;
        if (gVar.e != (gVar.d * 2) - 1) {
            e2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        g gVar2 = this.p;
        byte[] bArr = gVar2.b;
        int i12 = gVar2.e;
        g gVar3 = this.i;
        gVar3.k(i12, bArr);
        boolean z11 = false;
        while (true) {
            if (gVar3.b() > 0) {
                int i13 = 3;
                int g10 = gVar3.g(3);
                int g11 = gVar3.g(5);
                if (g10 == 7) {
                    gVar3.o(i11);
                    g10 = gVar3.g(6);
                    if (g10 < 7) {
                        a1.g.x(g10, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (g11 == 0) {
                    if (g10 != 0) {
                        e2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + g10 + ") when blockSize is 0");
                    }
                } else if (g10 != this.k) {
                    gVar3.p(g11);
                } else {
                    int e = (g11 * 8) + gVar3.e();
                    while (gVar3.e() < e) {
                        int g12 = gVar3.g(8);
                        if (g12 != 16) {
                            if (g12 <= 31) {
                                if (g12 != 0) {
                                    if (g12 == i13) {
                                        this.n = k();
                                    } else if (g12 != 8) {
                                        switch (g12) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (g12 < 17 || g12 > 23) {
                                                    if (g12 < 24 || g12 > 31) {
                                                        a1.g.x(g12, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + g12);
                                                        gVar3.o(16);
                                                        break;
                                                    }
                                                } else {
                                                    e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + g12);
                                                    gVar3.o(8);
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
                                i10 = i11;
                            } else if (g12 <= 127) {
                                if (g12 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (g12 & 255));
                                }
                                i10 = i11;
                                z11 = true;
                            } else {
                                if (g12 <= 159) {
                                    f[] fVarArr = this.l;
                                    switch (g12) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i14 = g12 - 128;
                                            if (this.q != i14) {
                                                this.q = i14;
                                                this.m = fVarArr[i14];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (gVar3.f()) {
                                                    f fVar = fVarArr[8 - i15];
                                                    fVar.a.clear();
                                                    fVar.b.clear();
                                                    fVar.o = -1;
                                                    fVar.p = -1;
                                                    fVar.q = -1;
                                                    fVar.s = -1;
                                                    fVar.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i16].d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i17].d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i18].d = !r1.d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (gVar3.f()) {
                                                    fVarArr[8 - i19].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            gVar3.o(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            z10 = true;
                                            break;
                                        case 143:
                                            l();
                                            z10 = true;
                                            break;
                                        case 144:
                                            int i20 = i11;
                                            if (!this.m.c) {
                                                gVar3.o(16);
                                                z10 = true;
                                                i13 = 3;
                                                break;
                                            } else {
                                                gVar3.g(4);
                                                gVar3.g(i20);
                                                gVar3.g(i20);
                                                boolean f7 = gVar3.f();
                                                boolean f10 = gVar3.f();
                                                i13 = 3;
                                                gVar3.g(3);
                                                gVar3.g(3);
                                                this.m.e(f7, f10);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c11 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                int c12 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                gVar3.o(2);
                                                f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), 0);
                                                this.m.f(c11, c12);
                                            } else {
                                                gVar3.o(24);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                gVar3.o(4);
                                                int g13 = gVar3.g(4);
                                                gVar3.o(2);
                                                gVar3.g(6);
                                                f fVar2 = this.m;
                                                if (fVar2.u != g13) {
                                                    fVar2.a('\n');
                                                }
                                                fVar2.u = g13;
                                            } else {
                                                gVar3.o(16);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                        default:
                                            a1.g.x(g12, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c13 = f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), gVar3.g(2));
                                                gVar3.g(2);
                                                f.c(gVar3.g(2), gVar3.g(2), gVar3.g(2), 0);
                                                gVar3.f();
                                                gVar3.f();
                                                gVar3.g(2);
                                                gVar3.g(2);
                                                int g14 = gVar3.g(2);
                                                gVar3.o(8);
                                                f fVar3 = this.m;
                                                fVar3.n = c13;
                                                fVar3.k = g14;
                                            } else {
                                                gVar3.o(32);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i21 = g12 - 152;
                                            f fVar4 = fVarArr[i21];
                                            gVar3.o(i11);
                                            boolean f11 = gVar3.f();
                                            gVar3.o(i11);
                                            int g15 = gVar3.g(i13);
                                            boolean f12 = gVar3.f();
                                            int g16 = gVar3.g(7);
                                            int g17 = gVar3.g(8);
                                            int g18 = gVar3.g(4);
                                            int g19 = gVar3.g(4);
                                            gVar3.o(i11);
                                            gVar3.o(6);
                                            gVar3.o(i11);
                                            int g20 = gVar3.g(3);
                                            int g21 = gVar3.g(3);
                                            ArrayList arrayList = fVar4.a;
                                            fVar4.c = true;
                                            fVar4.d = f11;
                                            fVar4.e = g15;
                                            fVar4.f = f12;
                                            fVar4.g = g16;
                                            fVar4.h = g17;
                                            fVar4.i = g18;
                                            int i22 = g19 + 1;
                                            if (fVar4.j != i22) {
                                                fVar4.j = i22;
                                                while (true) {
                                                    if (arrayList.size() >= fVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g20 != 0 && fVar4.l != g20) {
                                                fVar4.l = g20;
                                                int i23 = g20 - 1;
                                                int i24 = f.B[i23];
                                                boolean z12 = f.A[i23];
                                                int i25 = f.y[i23];
                                                int i26 = f.z[i23];
                                                int i27 = f.x[i23];
                                                fVar4.n = i24;
                                                fVar4.k = i27;
                                            }
                                            if (g21 != 0 && fVar4.m != g21) {
                                                fVar4.m = g21;
                                                int i28 = g21 - 1;
                                                int i29 = f.D[i28];
                                                int i30 = f.C[i28];
                                                fVar4.e(false, false);
                                                fVar4.f(f.v, f.E[i28]);
                                            }
                                            if (this.q != i21) {
                                                this.q = i21;
                                                this.m = fVarArr[i21];
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (g12 <= 255) {
                                        this.m.a((char) (g12 & 255));
                                    } else {
                                        a1.g.x(g12, "Invalid base command: ", "Cea708Decoder");
                                        i10 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z10;
                                i10 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int g22 = gVar3.g(8);
                            if (g22 <= 31) {
                                c10 = 7;
                                if (g22 > 7) {
                                    if (g22 <= 15) {
                                        gVar3.o(8);
                                    } else if (g22 <= 23) {
                                        gVar3.o(16);
                                    } else if (g22 <= 31) {
                                        gVar3.o(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (g22 <= 127) {
                                    if (g22 == 32) {
                                        this.m.a(' ');
                                    } else if (g22 == 33) {
                                        this.m.a((char) 160);
                                    } else if (g22 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (g22 == 42) {
                                        this.m.a((char) 352);
                                    } else if (g22 == 44) {
                                        this.m.a((char) 338);
                                    } else if (g22 == 63) {
                                        this.m.a((char) 376);
                                    } else if (g22 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (g22 == 58) {
                                        this.m.a((char) 353);
                                    } else if (g22 == 60) {
                                        this.m.a((char) 339);
                                    } else if (g22 != 61) {
                                        switch (g22) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                this.m.a((char) 8216);
                                                break;
                                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (g22) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        a1.g.x(g22, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i10 = 2;
                                    z11 = true;
                                } else if (g22 > 159) {
                                    i10 = 2;
                                    if (g22 <= 255) {
                                        if (g22 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            a1.g.x(g22, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        a1.g.x(g22, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (g22 <= 135) {
                                    gVar3.o(32);
                                } else if (g22 <= 143) {
                                    gVar3.o(40);
                                } else if (g22 <= 159) {
                                    i10 = 2;
                                    gVar3.o(2);
                                    gVar3.o(gVar3.g(6) * 8);
                                }
                            }
                            i10 = 2;
                        }
                        i11 = i10;
                    }
                }
            }
        }
        if (z11) {
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
        e eVar;
        Layout.Alignment alignment;
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            f[] fVarArr = this.l;
            f fVar = fVarArr[i13];
            if (fVar.c && (!fVar.a.isEmpty() || fVar.b.length() != 0)) {
                f fVar2 = fVarArr[i13];
                if (fVar2.d) {
                    ArrayList arrayList2 = fVar2.a;
                    if (!fVar2.c || (arrayList2.isEmpty() && fVar2.b.length() == 0)) {
                        eVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) fVar2.b());
                        int i15 = fVar2.k;
                        if (i15 != 0) {
                            if (i15 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i15 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i15 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + fVar2.k);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (fVar2.f) {
                                f7 = fVar2.h / 209.0f;
                                f10 = fVar2.g / 74.0f;
                            } else {
                                f7 = fVar2.h / 99.0f;
                                f10 = fVar2.g / 99.0f;
                            }
                            float f11 = (f7 * 0.9f) + 0.05f;
                            float f12 = (f10 * 0.9f) + 0.05f;
                            int i16 = fVar2.i;
                            i10 = i16 / 3;
                            if (i10 != 0) {
                                i11 = i16;
                                i12 = 0;
                            } else if (i10 == 1) {
                                i11 = i16;
                                i12 = 1;
                            } else {
                                i11 = i16;
                                i12 = 2;
                            }
                            int i17 = i11 % 3;
                            int i18 = i17 != 0 ? 0 : i17 == 1 ? 1 : 2;
                            int i19 = fVar2.n;
                            eVar = new e(spannableStringBuilder, alignment2, f12, i12, f11, i18, i19 == f.w, i19, fVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (fVar2.f) {
                        }
                        float f112 = (f7 * 0.9f) + 0.05f;
                        float f122 = (f10 * 0.9f) + 0.05f;
                        int i162 = fVar2.i;
                        i10 = i162 / 3;
                        if (i10 != 0) {
                        }
                        int i172 = i11 % 3;
                        if (i172 != 0) {
                        }
                        int i192 = fVar2.n;
                        eVar = new e(spannableStringBuilder, alignment22, f122, i12, f112, i18, i192 == f.w, i192, fVar2.e);
                    }
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, e.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            arrayList3.add(((e) arrayList.get(i20)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10].d();
        }
    }
}
