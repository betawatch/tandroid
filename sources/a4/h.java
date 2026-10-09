package a4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.internal.vision.e2;
import e2.v;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h extends k {
    public final v h = new v();
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
            byte[] bArr = e2.e.a;
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
        v vVar = this.h;
        vVar.H(limit, array);
        while (vVar.a() >= 3) {
            int x10 = vVar.x();
            int i10 = x10 & 3;
            boolean z10 = (x10 & 4) == 4;
            byte x11 = (byte) vVar.x();
            byte x12 = (byte) vVar.x();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (x11 & 192) >> 6;
                        int i12 = this.j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.n("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i11);
                        }
                        this.j = i11;
                        int i13 = x11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        g gVar = new g(i11, i13);
                        this.p = gVar;
                        byte[] bArr = gVar.b;
                        gVar.e = 1;
                        bArr[0] = x12;
                    } else {
                        e2.d.b(i10 == 2);
                        g gVar2 = this.p;
                        if (gVar2 == null) {
                            e2.a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = gVar2.b;
                            int i14 = gVar2.e;
                            int i15 = i14 + 1;
                            gVar2.e = i15;
                            bArr2[i14] = x11;
                            gVar2.e = i14 + 2;
                            bArr2[i15] = x12;
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
            e2.a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        g gVar2 = this.p;
        byte[] bArr = gVar2.b;
        int i12 = gVar2.e;
        g gVar3 = this.i;
        gVar3.o(i12, bArr);
        boolean z11 = false;
        while (true) {
            if (gVar3.b() > 0) {
                int i13 = 3;
                int i14 = gVar3.i(3);
                int i15 = gVar3.i(5);
                if (i14 == 7) {
                    gVar3.t(i11);
                    i14 = gVar3.i(6);
                    if (i14 < 7) {
                        e2.m(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        e2.a.n("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.k) {
                    gVar3.u(i15);
                } else {
                    int g10 = (i15 * 8) + gVar3.g();
                    while (gVar3.g() < g10) {
                        int i16 = gVar3.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 == i13) {
                                        this.n = k();
                                    } else if (i16 != 8) {
                                        switch (i16) {
                                            case 12:
                                                l();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i16 < 17 || i16 > 23) {
                                                    if (i16 < 24 || i16 > 31) {
                                                        e2.m(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        gVar3.t(16);
                                                        break;
                                                    }
                                                } else {
                                                    e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                    gVar3.t(8);
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
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.m.a((char) 9835);
                                } else {
                                    this.m.a((char) (i16 & 255));
                                }
                                i10 = i11;
                                z11 = true;
                            } else {
                                if (i16 <= 159) {
                                    f[] fVarArr = this.l;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i17 = i16 - 128;
                                            if (this.q != i17) {
                                                this.q = i17;
                                                this.m = fVarArr[i17];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (gVar3.h()) {
                                                    f fVar = fVarArr[8 - i18];
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
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i19].d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i20].d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i21].d = !r1.d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i22].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            gVar3.t(8);
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
                                            int i23 = i11;
                                            if (!this.m.c) {
                                                gVar3.t(16);
                                                z10 = true;
                                                i13 = 3;
                                                break;
                                            } else {
                                                gVar3.i(4);
                                                gVar3.i(i23);
                                                gVar3.i(i23);
                                                boolean h = gVar3.h();
                                                boolean h10 = gVar3.h();
                                                i13 = 3;
                                                gVar3.i(3);
                                                gVar3.i(3);
                                                this.m.e(h, h10);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (this.m.c) {
                                                int c11 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                int c12 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.t(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                this.m.f(c11, c12);
                                            } else {
                                                gVar3.t(24);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                gVar3.t(4);
                                                int i24 = gVar3.i(4);
                                                gVar3.t(2);
                                                gVar3.i(6);
                                                f fVar2 = this.m;
                                                if (fVar2.u != i24) {
                                                    fVar2.a('\n');
                                                }
                                                fVar2.u = i24;
                                            } else {
                                                gVar3.t(16);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                        default:
                                            e2.m(i16, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int c13 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.i(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                gVar3.h();
                                                gVar3.h();
                                                gVar3.i(2);
                                                gVar3.i(2);
                                                int i25 = gVar3.i(2);
                                                gVar3.t(8);
                                                f fVar3 = this.m;
                                                fVar3.n = c13;
                                                fVar3.k = i25;
                                            } else {
                                                gVar3.t(32);
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
                                            int i26 = i16 - 152;
                                            f fVar4 = fVarArr[i26];
                                            gVar3.t(i11);
                                            boolean h11 = gVar3.h();
                                            gVar3.t(i11);
                                            int i27 = gVar3.i(i13);
                                            boolean h12 = gVar3.h();
                                            int i28 = gVar3.i(7);
                                            int i29 = gVar3.i(8);
                                            int i30 = gVar3.i(4);
                                            int i31 = gVar3.i(4);
                                            gVar3.t(i11);
                                            gVar3.t(6);
                                            gVar3.t(i11);
                                            int i32 = gVar3.i(3);
                                            int i33 = gVar3.i(3);
                                            ArrayList arrayList = fVar4.a;
                                            fVar4.c = true;
                                            fVar4.d = h11;
                                            fVar4.e = i27;
                                            fVar4.f = h12;
                                            fVar4.g = i28;
                                            fVar4.h = i29;
                                            fVar4.i = i30;
                                            int i34 = i31 + 1;
                                            if (fVar4.j != i34) {
                                                fVar4.j = i34;
                                                while (true) {
                                                    if (arrayList.size() >= fVar4.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i32 != 0 && fVar4.l != i32) {
                                                fVar4.l = i32;
                                                int i35 = i32 - 1;
                                                int i36 = f.B[i35];
                                                boolean z12 = f.A[i35];
                                                int i37 = f.y[i35];
                                                int i38 = f.z[i35];
                                                int i39 = f.x[i35];
                                                fVar4.n = i36;
                                                fVar4.k = i39;
                                            }
                                            if (i33 != 0 && fVar4.m != i33) {
                                                fVar4.m = i33;
                                                int i40 = i33 - 1;
                                                int i41 = f.D[i40];
                                                int i42 = f.C[i40];
                                                fVar4.e(false, false);
                                                fVar4.f(f.v, f.E[i40]);
                                            }
                                            if (this.q != i26) {
                                                this.q = i26;
                                                this.m = fVarArr[i26];
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (i16 <= 255) {
                                        this.m.a((char) (i16 & 255));
                                    } else {
                                        e2.m(i16, "Invalid base command: ", "Cea708Decoder");
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
                            int i43 = gVar3.i(8);
                            if (i43 <= 31) {
                                c10 = 7;
                                if (i43 > 7) {
                                    if (i43 <= 15) {
                                        gVar3.t(8);
                                    } else if (i43 <= 23) {
                                        gVar3.t(16);
                                    } else if (i43 <= 31) {
                                        gVar3.t(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i43 <= 127) {
                                    if (i43 == 32) {
                                        this.m.a(' ');
                                    } else if (i43 == 33) {
                                        this.m.a((char) 160);
                                    } else if (i43 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (i43 == 42) {
                                        this.m.a((char) 352);
                                    } else if (i43 == 44) {
                                        this.m.a((char) 338);
                                    } else if (i43 == 63) {
                                        this.m.a((char) 376);
                                    } else if (i43 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (i43 == 58) {
                                        this.m.a((char) 353);
                                    } else if (i43 == 60) {
                                        this.m.a((char) 339);
                                    } else if (i43 != 61) {
                                        switch (i43) {
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
                                                switch (i43) {
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
                                                        e2.m(i43, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i10 = 2;
                                    z11 = true;
                                } else if (i43 > 159) {
                                    i10 = 2;
                                    if (i43 <= 255) {
                                        if (i43 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            e2.m(i43, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        e2.m(i43, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (i43 <= 135) {
                                    gVar3.t(32);
                                } else if (i43 <= 143) {
                                    gVar3.t(40);
                                } else if (i43 <= 159) {
                                    i10 = 2;
                                    gVar3.t(2);
                                    gVar3.t(gVar3.i(6) * 8);
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
