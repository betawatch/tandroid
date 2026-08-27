package b5;

import d5.g0;
import h3.t0;
import j4.i1;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import p8.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p extends o {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean e;
    public final i f;
    public final boolean h;
    public final boolean n;
    public final int r;
    public final int s;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00da A[EDGE_INSN: B:132:0x00da->B:70:0x00da BREAK  A[LOOP:0: B:62:0x00bf->B:130:0x00d7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(int i10, i1 i1Var, int i11, i iVar, int i12, int i13, boolean z10) {
        super(i10, i1Var, i11);
        boolean z11;
        boolean z12;
        int i14;
        t0 t0Var;
        String str;
        int i15;
        boolean z13;
        i iVar2;
        char c10;
        int i16;
        t0 t0Var2;
        int i17;
        int i18;
        float f10;
        int i19;
        t0 t0Var3;
        int i20;
        int i21;
        int i22;
        this.f = iVar;
        boolean z14 = iVar.O;
        p8.z zVar = iVar.w;
        int i23 = z14 ? 24 : 16;
        int i24 = 0;
        this.y = iVar.N && (i13 & i23) != 0;
        if (z10 && (((i20 = (t0Var3 = this.d).G) == -1 || i20 <= iVar.a) && ((i21 = t0Var3.H) == -1 || i21 <= iVar.b))) {
            float f11 = t0Var3.I;
            if ((f11 == -1.0f || f11 <= iVar.c) && ((i22 = t0Var3.n) == -1 || i22 <= iVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i17 = (t0Var2 = this.d).G) == -1 || i17 >= iVar.e) && ((i18 = t0Var2.H) == -1 || i18 >= iVar.f))) {
                    f10 = t0Var2.I;
                    if ((f10 != -1.0f || f10 >= iVar.h) && ((i19 = t0Var2.n) == -1 || i19 >= iVar.n)) {
                        z12 = true;
                        this.h = z12;
                        this.n = q.f(i12, false);
                        t0 t0Var4 = this.d;
                        this.r = t0Var4.n;
                        int i25 = t0Var4.G;
                        this.s = (i25 != -1 || (i16 = t0Var4.H) == -1) ? -1 : i25 * i16;
                        int i26 = t0Var4.e;
                        int i27 = iVar.x;
                        int i28 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        this.w = (i26 == 0 && i26 == i27) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i26 & i27);
                        int i29 = this.d.e;
                        this.x = (i29 == 0 && (i29 & 1) == 0) ? false : true;
                        i14 = 0;
                        while (true) {
                            if (i14 < zVar.size()) {
                                String str2 = this.d.B;
                                if (str2 != null && str2.equals(zVar.get(i14))) {
                                    i28 = i14;
                                    break;
                                }
                                i14++;
                            } else {
                                break;
                            }
                        }
                        this.v = i28;
                        this.B = (i12 & 384) != 128;
                        this.C = (i12 & 64) != 64;
                        t0Var = this.d;
                        str = t0Var.B;
                        if (str != null) {
                            i15 = 4;
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals(MediaController.VIDEO_MIME_TYPE)) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    i15 = 5;
                                    break;
                                case 2:
                                    i15 = 3;
                                    break;
                                case 3:
                                    i15 = 1;
                                    break;
                                case 4:
                                    i15 = 2;
                                    break;
                            }
                            this.D = i15;
                            z13 = this.e;
                            iVar2 = this.f;
                            if ((t0Var.e & 16384) == 0 && q.f(i12, iVar2.W) && (z13 || iVar2.M)) {
                                i24 = (q.f(i12, false) || !this.h || !z13 || t0Var.n == -1 || iVar2.J || iVar2.I || (i23 & i12) == 0) ? 1 : 2;
                            }
                            this.A = i24;
                        }
                        i15 = 0;
                        this.D = i15;
                        z13 = this.e;
                        iVar2 = this.f;
                        if ((t0Var.e & 16384) == 0) {
                            if (q.f(i12, false)) {
                            }
                        }
                        this.A = i24;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = q.f(i12, false);
                t0 t0Var42 = this.d;
                this.r = t0Var42.n;
                int i252 = t0Var42.G;
                this.s = (i252 != -1 || (i16 = t0Var42.H) == -1) ? -1 : i252 * i16;
                int i262 = t0Var42.e;
                int i272 = iVar.x;
                int i282 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                this.w = (i262 == 0 && i262 == i272) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i262 & i272);
                int i292 = this.d.e;
                this.x = (i292 == 0 && (i292 & 1) == 0) ? false : true;
                i14 = 0;
                while (true) {
                    if (i14 < zVar.size()) {
                    }
                    i14++;
                }
                this.v = i282;
                this.B = (i12 & 384) != 128;
                this.C = (i12 & 64) != 64;
                t0Var = this.d;
                str = t0Var.B;
                if (str != null) {
                }
                i15 = 0;
                this.D = i15;
                z13 = this.e;
                iVar2 = this.f;
                if ((t0Var.e & 16384) == 0) {
                }
                this.A = i24;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f10 = t0Var2.I;
            if (f10 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = q.f(i12, false);
            t0 t0Var422 = this.d;
            this.r = t0Var422.n;
            int i2522 = t0Var422.G;
            this.s = (i2522 != -1 || (i16 = t0Var422.H) == -1) ? -1 : i2522 * i16;
            int i2622 = t0Var422.e;
            int i2722 = iVar.x;
            int i2822 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.w = (i2622 == 0 && i2622 == i2722) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i2622 & i2722);
            int i2922 = this.d.e;
            this.x = (i2922 == 0 && (i2922 & 1) == 0) ? false : true;
            i14 = 0;
            while (true) {
                if (i14 < zVar.size()) {
                }
                i14++;
            }
            this.v = i2822;
            this.B = (i12 & 384) != 128;
            this.C = (i12 & 64) != 64;
            t0Var = this.d;
            str = t0Var.B;
            if (str != null) {
            }
            i15 = 0;
            this.D = i15;
            z13 = this.e;
            iVar2 = this.f;
            if ((t0Var.e & 16384) == 0) {
            }
            this.A = i24;
        }
        z12 = false;
        this.h = z12;
        this.n = q.f(i12, false);
        t0 t0Var4222 = this.d;
        this.r = t0Var4222.n;
        int i25222 = t0Var4222.G;
        this.s = (i25222 != -1 || (i16 = t0Var4222.H) == -1) ? -1 : i25222 * i16;
        int i26222 = t0Var4222.e;
        int i27222 = iVar.x;
        int i28222 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.w = (i26222 == 0 && i26222 == i27222) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i26222 & i27222);
        int i29222 = this.d.e;
        this.x = (i29222 == 0 && (i29222 & 1) == 0) ? false : true;
        i14 = 0;
        while (true) {
            if (i14 < zVar.size()) {
            }
            i14++;
        }
        this.v = i28222;
        this.B = (i12 & 384) != 128;
        this.C = (i12 & 64) != 64;
        t0Var = this.d;
        str = t0Var.B;
        if (str != null) {
        }
        i15 = 0;
        this.D = i15;
        z13 = this.e;
        iVar2 = this.f;
        if ((t0Var.e & 16384) == 0) {
        }
        this.A = i24;
    }

    public static int c(p pVar, p pVar2) {
        p8.t b10 = p8.t.a.c(pVar.n, pVar2.n).a(pVar.w, pVar2.w).c(pVar.x, pVar2.x).c(pVar.e, pVar2.e).c(pVar.h, pVar2.h).b(Integer.valueOf(pVar.v), Integer.valueOf(pVar2.v), j0.c);
        boolean z10 = pVar.B;
        p8.t c10 = b10.c(z10, pVar2.B);
        boolean z11 = pVar.C;
        p8.t c11 = c10.c(z11, pVar2.C);
        if (z10 && z11) {
            c11 = c11.a(pVar.D, pVar2.D);
        }
        return c11.e();
    }

    @Override // b5.o
    public final int a() {
        return this.A;
    }

    @Override // b5.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.y && !g0.a(this.d.B, pVar.d.B)) {
            return false;
        }
        if (this.f.P) {
            return true;
        }
        return this.B == pVar.B && this.C == pVar.C;
    }
}
