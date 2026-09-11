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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i extends l {
    public final v h = new v();
    public final h i = new h();
    public int j = -1;
    public final int k;
    public final g[] l;
    public g m;
    public List n;
    public List o;
    public h p;
    public int q;

    public i(int i10, List list) {
        this.k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.e.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new g[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.l[i11] = new g();
        }
        this.m = this.l[0];
    }

    @Override // a4.l
    public final m f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new m(list, 0);
    }

    @Override // a4.l, h2.d
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // a4.l
    public final void g(j jVar) {
        ByteBuffer byteBuffer = jVar.e;
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
                        h hVar = new h(i11, i13);
                        this.p = hVar;
                        byte[] bArr = hVar.b;
                        hVar.e = 1;
                        bArr[0] = x12;
                    } else {
                        e2.d.b(i10 == 2);
                        h hVar2 = this.p;
                        if (hVar2 == null) {
                            e2.a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = hVar2.b;
                            int i14 = hVar2.e;
                            int i15 = i14 + 1;
                            hVar2.e = i15;
                            bArr2[i14] = x11;
                            hVar2.e = i14 + 2;
                            bArr2[i15] = x12;
                        }
                    }
                    h hVar3 = this.p;
                    if (hVar3.e == (hVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // a4.l
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void j() {
        h hVar = this.p;
        if (hVar == null) {
            return;
        }
        int i10 = 2;
        if (hVar.e != (hVar.d * 2) - 1) {
            e2.a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        h hVar2 = this.p;
        byte[] bArr = hVar2.b;
        int i11 = hVar2.e;
        h hVar3 = this.i;
        hVar3.o(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (hVar3.b() > 0) {
                int i12 = 3;
                int i13 = hVar3.i(3);
                int i14 = hVar3.i(5);
                if (i13 == 7) {
                    hVar3.t(i10);
                    i13 = hVar3.i(6);
                    if (i13 < 7) {
                        e2.n(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        e2.a.n("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.k) {
                    hVar3.u(i14);
                } else {
                    int g10 = (i14 * 8) + hVar3.g();
                    while (hVar3.g() < g10) {
                        int i15 = hVar3.i(8);
                        if (i15 == 16) {
                            int i16 = hVar3.i(8);
                            if (i16 <= 31) {
                                if (i16 > 7) {
                                    if (i16 <= 15) {
                                        hVar3.t(8);
                                    } else if (i16 <= 23) {
                                        hVar3.t(16);
                                    } else if (i16 <= 31) {
                                        hVar3.t(24);
                                    }
                                }
                            } else if (i16 <= 127) {
                                if (i16 == 32) {
                                    this.m.a(' ');
                                } else if (i16 == 33) {
                                    this.m.a((char) 160);
                                } else if (i16 == 37) {
                                    this.m.a((char) 8230);
                                } else if (i16 == 42) {
                                    this.m.a((char) 352);
                                } else if (i16 == 44) {
                                    this.m.a((char) 338);
                                } else if (i16 == 63) {
                                    this.m.a((char) 376);
                                } else if (i16 == 57) {
                                    this.m.a((char) 8482);
                                } else if (i16 == 58) {
                                    this.m.a((char) 353);
                                } else if (i16 == 60) {
                                    this.m.a((char) 339);
                                } else if (i16 != 61) {
                                    switch (i16) {
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
                                            switch (i16) {
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
                                                    e2.n(i16, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                z10 = true;
                            } else if (i16 <= 159) {
                                if (i16 <= 135) {
                                    hVar3.t(32);
                                } else if (i16 <= 143) {
                                    hVar3.t(40);
                                } else if (i16 <= 159) {
                                    hVar3.t(2);
                                    hVar3.t(hVar3.i(6) * 8);
                                }
                            } else if (i16 <= 255) {
                                if (i16 == 160) {
                                    this.m.a((char) 13252);
                                } else {
                                    e2.n(i16, "Invalid G3 character: ", "Cea708Decoder");
                                    this.m.a('_');
                                }
                                z10 = true;
                            } else {
                                e2.n(i16, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i12) {
                                    this.n = k();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 < 17 || i15 > 23) {
                                                if (i15 < 24 || i15 > 31) {
                                                    e2.n(i15, "Invalid C0 command: ", "Cea708Decoder");
                                                    break;
                                                } else {
                                                    e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                    hVar3.t(16);
                                                    break;
                                                }
                                            } else {
                                                e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                hVar3.t(8);
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
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.m.a((char) 9835);
                            } else {
                                this.m.a((char) (i15 & 255));
                            }
                            z10 = true;
                        } else {
                            if (i15 <= 159) {
                                g[] gVarArr = this.l;
                                switch (i15) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i17 = i15 - 128;
                                        if (this.q != i17) {
                                            this.q = i17;
                                            this.m = gVarArr[i17];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (hVar3.h()) {
                                                g gVar = gVarArr[8 - i18];
                                                gVar.a.clear();
                                                gVar.b.clear();
                                                gVar.o = -1;
                                                gVar.p = -1;
                                                gVar.q = -1;
                                                gVar.s = -1;
                                                gVar.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (hVar3.h()) {
                                                gVarArr[8 - i19].d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (hVar3.h()) {
                                                gVarArr[8 - i20].d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (hVar3.h()) {
                                                gVarArr[8 - i21].d = !r1.d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (hVar3.h()) {
                                                gVarArr[8 - i22].d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        hVar3.t(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        l();
                                        break;
                                    case 144:
                                        if (!this.m.c) {
                                            hVar3.t(16);
                                            i12 = 3;
                                            break;
                                        } else {
                                            hVar3.i(4);
                                            hVar3.i(2);
                                            hVar3.i(2);
                                            boolean h = hVar3.h();
                                            boolean h10 = hVar3.h();
                                            i12 = 3;
                                            hVar3.i(3);
                                            hVar3.i(3);
                                            this.m.e(h, h10);
                                        }
                                    case 145:
                                        if (this.m.c) {
                                            int c10 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                            int c11 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                            hVar3.t(2);
                                            g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), 0);
                                            this.m.f(c10, c11);
                                        } else {
                                            hVar3.t(24);
                                        }
                                        i12 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            hVar3.t(4);
                                            int i23 = hVar3.i(4);
                                            hVar3.t(2);
                                            hVar3.i(6);
                                            g gVar2 = this.m;
                                            if (gVar2.u != i23) {
                                                gVar2.a('\n');
                                            }
                                            gVar2.u = i23;
                                        } else {
                                            hVar3.t(16);
                                        }
                                        i12 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case ImageReceiver.DEFAULT_CROSSFADE_DURATION /* 150 */:
                                    default:
                                        e2.n(i15, "Invalid C1 command: ", "Cea708Decoder");
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int c12 = g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), hVar3.i(2));
                                            hVar3.i(2);
                                            g.c(hVar3.i(2), hVar3.i(2), hVar3.i(2), 0);
                                            hVar3.h();
                                            hVar3.h();
                                            hVar3.i(2);
                                            hVar3.i(2);
                                            int i24 = hVar3.i(2);
                                            hVar3.t(8);
                                            g gVar3 = this.m;
                                            gVar3.n = c12;
                                            gVar3.k = i24;
                                        } else {
                                            hVar3.t(32);
                                        }
                                        i12 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i25 = i15 - 152;
                                        g gVar4 = gVarArr[i25];
                                        hVar3.t(i10);
                                        boolean h11 = hVar3.h();
                                        hVar3.t(i10);
                                        int i26 = hVar3.i(i12);
                                        boolean h12 = hVar3.h();
                                        int i27 = hVar3.i(7);
                                        int i28 = hVar3.i(8);
                                        int i29 = hVar3.i(4);
                                        int i30 = hVar3.i(4);
                                        hVar3.t(i10);
                                        hVar3.t(6);
                                        hVar3.t(i10);
                                        int i31 = hVar3.i(3);
                                        int i32 = hVar3.i(3);
                                        ArrayList arrayList = gVar4.a;
                                        gVar4.c = true;
                                        gVar4.d = h11;
                                        gVar4.e = i26;
                                        gVar4.f = h12;
                                        gVar4.g = i27;
                                        gVar4.h = i28;
                                        gVar4.i = i29;
                                        int i33 = i30 + 1;
                                        if (gVar4.j != i33) {
                                            gVar4.j = i33;
                                            while (true) {
                                                if (arrayList.size() >= gVar4.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i31 != 0 && gVar4.l != i31) {
                                            gVar4.l = i31;
                                            int i34 = i31 - 1;
                                            int i35 = g.B[i34];
                                            boolean z11 = g.A[i34];
                                            int i36 = g.y[i34];
                                            int i37 = g.z[i34];
                                            int i38 = g.x[i34];
                                            gVar4.n = i35;
                                            gVar4.k = i38;
                                        }
                                        if (i32 != 0 && gVar4.m != i32) {
                                            gVar4.m = i32;
                                            int i39 = i32 - 1;
                                            int i40 = g.D[i39];
                                            int i41 = g.C[i39];
                                            gVar4.e(false, false);
                                            gVar4.f(g.v, g.E[i39]);
                                        }
                                        if (this.q != i25) {
                                            this.q = i25;
                                            this.m = gVarArr[i25];
                                        }
                                        i12 = 3;
                                        break;
                                }
                            } else if (i15 <= 255) {
                                this.m.a((char) (i15 & 255));
                            } else {
                                e2.n(i15, "Invalid base command: ", "Cea708Decoder");
                            }
                            z10 = true;
                        }
                        i10 = 2;
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
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List k() {
        f fVar;
        Layout.Alignment alignment;
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            g[] gVarArr = this.l;
            g gVar = gVarArr[i13];
            if (gVar.c && (!gVar.a.isEmpty() || gVar.b.length() != 0)) {
                g gVar2 = gVarArr[i13];
                if (gVar2.d) {
                    ArrayList arrayList2 = gVar2.a;
                    if (!gVar2.c || (arrayList2.isEmpty() && gVar2.b.length() == 0)) {
                        fVar = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i14));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) gVar2.b());
                        int i15 = gVar2.k;
                        if (i15 != 0) {
                            if (i15 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i15 == 2) {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            } else if (i15 != 3) {
                                throw new IllegalArgumentException("Unexpected justification value: " + gVar2.k);
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (gVar2.f) {
                                f7 = gVar2.h / 209.0f;
                                f10 = gVar2.g / 74.0f;
                            } else {
                                f7 = gVar2.h / 99.0f;
                                f10 = gVar2.g / 99.0f;
                            }
                            float f11 = (f7 * 0.9f) + 0.05f;
                            float f12 = (f10 * 0.9f) + 0.05f;
                            int i16 = gVar2.i;
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
                            int i19 = gVar2.n;
                            fVar = new f(spannableStringBuilder, alignment2, f12, i12, f11, i18, i19 == g.w, i19, gVar2.e);
                        }
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                        Layout.Alignment alignment22 = alignment;
                        if (gVar2.f) {
                        }
                        float f112 = (f7 * 0.9f) + 0.05f;
                        float f122 = (f10 * 0.9f) + 0.05f;
                        int i162 = gVar2.i;
                        i10 = i162 / 3;
                        if (i10 != 0) {
                        }
                        int i172 = i11 % 3;
                        if (i172 != 0) {
                        }
                        int i192 = gVar2.n;
                        fVar = new f(spannableStringBuilder, alignment22, f122, i12, f112, i18, i192 == g.w, i192, gVar2.e);
                    }
                    if (fVar != null) {
                        arrayList.add(fVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, f.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            arrayList3.add(((f) arrayList.get(i20)).a);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.l[i10].d();
        }
    }
}
