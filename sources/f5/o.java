package f5;

import h5.d0;
import j3.n0;
import o4.s0;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import s8.g0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends n {
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean e;
    public final h f;
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
    public o(int i10, s0 s0Var, int i11, h hVar, int i12, int i13, boolean z4) {
        super(i10, s0Var, i11);
        boolean z10;
        boolean z11;
        int i14;
        n0 n0Var;
        String str;
        int i15;
        boolean z12;
        h hVar2;
        char c3;
        int i16;
        n0 n0Var2;
        int i17;
        int i18;
        float f10;
        int i19;
        n0 n0Var3;
        int i20;
        int i21;
        int i22;
        this.f = hVar;
        boolean z13 = hVar.P;
        s8.v vVar = hVar.w;
        int i23 = z13 ? 24 : 16;
        int i24 = 0;
        this.y = hVar.O && (i13 & i23) != 0;
        if (z4 && (((i20 = (n0Var3 = this.d).H) == -1 || i20 <= hVar.a) && ((i21 = n0Var3.I) == -1 || i21 <= hVar.b))) {
            float f11 = n0Var3.J;
            if ((f11 == -1.0f || f11 <= hVar.c) && ((i22 = n0Var3.n) == -1 || i22 <= hVar.d)) {
                z10 = true;
                this.e = z10;
                if (z4 && (((i17 = (n0Var2 = this.d).H) == -1 || i17 >= hVar.e) && ((i18 = n0Var2.I) == -1 || i18 >= hVar.f))) {
                    f10 = n0Var2.J;
                    if ((f10 != -1.0f || f10 >= hVar.h) && ((i19 = n0Var2.n) == -1 || i19 >= hVar.n)) {
                        z11 = true;
                        this.h = z11;
                        this.n = p.f(i12, false);
                        n0 n0Var4 = this.d;
                        this.r = n0Var4.n;
                        int i25 = n0Var4.H;
                        this.s = (i25 != -1 || (i16 = n0Var4.I) == -1) ? -1 : i25 * i16;
                        int i26 = n0Var4.e;
                        int i27 = hVar.x;
                        int i28 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        this.w = (i26 == 0 && i26 == i27) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i26 & i27);
                        int i29 = this.d.e;
                        this.x = (i29 == 0 && (i29 & 1) == 0) ? false : true;
                        i14 = 0;
                        while (true) {
                            if (i14 < vVar.size()) {
                                String str2 = this.d.C;
                                if (str2 != null && str2.equals(vVar.get(i14))) {
                                    i28 = i14;
                                    break;
                                }
                                i14++;
                            } else {
                                break;
                            }
                        }
                        this.v = i28;
                        this.C = (i12 & 384) != 128;
                        this.D = (i12 & 64) != 64;
                        n0Var = this.d;
                        str = n0Var.C;
                        if (str != null) {
                            i15 = 4;
                            switch (str.hashCode()) {
                                case -1851077871:
                                    if (str.equals("video/dolby-vision")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals(MediaController.VIDEO_MIME_TYPE)) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
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
                            this.E = i15;
                            z12 = this.e;
                            hVar2 = this.f;
                            if ((n0Var.e & 16384) == 0 && p.f(i12, hVar2.X) && (z12 || hVar2.N)) {
                                i24 = (p.f(i12, false) || !this.h || !z12 || n0Var.n == -1 || hVar2.K || hVar2.J || (i23 & i12) == 0) ? 1 : 2;
                            }
                            this.B = i24;
                        }
                        i15 = 0;
                        this.E = i15;
                        z12 = this.e;
                        hVar2 = this.f;
                        if ((n0Var.e & 16384) == 0) {
                            if (p.f(i12, false)) {
                            }
                        }
                        this.B = i24;
                    }
                }
                z11 = false;
                this.h = z11;
                this.n = p.f(i12, false);
                n0 n0Var42 = this.d;
                this.r = n0Var42.n;
                int i252 = n0Var42.H;
                this.s = (i252 != -1 || (i16 = n0Var42.I) == -1) ? -1 : i252 * i16;
                int i262 = n0Var42.e;
                int i272 = hVar.x;
                int i282 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                this.w = (i262 == 0 && i262 == i272) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i262 & i272);
                int i292 = this.d.e;
                this.x = (i292 == 0 && (i292 & 1) == 0) ? false : true;
                i14 = 0;
                while (true) {
                    if (i14 < vVar.size()) {
                    }
                    i14++;
                }
                this.v = i282;
                this.C = (i12 & 384) != 128;
                this.D = (i12 & 64) != 64;
                n0Var = this.d;
                str = n0Var.C;
                if (str != null) {
                }
                i15 = 0;
                this.E = i15;
                z12 = this.e;
                hVar2 = this.f;
                if ((n0Var.e & 16384) == 0) {
                }
                this.B = i24;
            }
        }
        z10 = false;
        this.e = z10;
        if (z4) {
            f10 = n0Var2.J;
            if (f10 != -1.0f) {
            }
            z11 = true;
            this.h = z11;
            this.n = p.f(i12, false);
            n0 n0Var422 = this.d;
            this.r = n0Var422.n;
            int i2522 = n0Var422.H;
            this.s = (i2522 != -1 || (i16 = n0Var422.I) == -1) ? -1 : i2522 * i16;
            int i2622 = n0Var422.e;
            int i2722 = hVar.x;
            int i2822 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.w = (i2622 == 0 && i2622 == i2722) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i2622 & i2722);
            int i2922 = this.d.e;
            this.x = (i2922 == 0 && (i2922 & 1) == 0) ? false : true;
            i14 = 0;
            while (true) {
                if (i14 < vVar.size()) {
                }
                i14++;
            }
            this.v = i2822;
            this.C = (i12 & 384) != 128;
            this.D = (i12 & 64) != 64;
            n0Var = this.d;
            str = n0Var.C;
            if (str != null) {
            }
            i15 = 0;
            this.E = i15;
            z12 = this.e;
            hVar2 = this.f;
            if ((n0Var.e & 16384) == 0) {
            }
            this.B = i24;
        }
        z11 = false;
        this.h = z11;
        this.n = p.f(i12, false);
        n0 n0Var4222 = this.d;
        this.r = n0Var4222.n;
        int i25222 = n0Var4222.H;
        this.s = (i25222 != -1 || (i16 = n0Var4222.I) == -1) ? -1 : i25222 * i16;
        int i26222 = n0Var4222.e;
        int i27222 = hVar.x;
        int i28222 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.w = (i26222 == 0 && i26222 == i27222) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i26222 & i27222);
        int i29222 = this.d.e;
        this.x = (i29222 == 0 && (i29222 & 1) == 0) ? false : true;
        i14 = 0;
        while (true) {
            if (i14 < vVar.size()) {
            }
            i14++;
        }
        this.v = i28222;
        this.C = (i12 & 384) != 128;
        this.D = (i12 & 64) != 64;
        n0Var = this.d;
        str = n0Var.C;
        if (str != null) {
        }
        i15 = 0;
        this.E = i15;
        z12 = this.e;
        hVar2 = this.f;
        if ((n0Var.e & 16384) == 0) {
        }
        this.B = i24;
    }

    public static int c(o oVar, o oVar2) {
        s8.p b10 = s8.p.a.c(oVar.n, oVar2.n).a(oVar.w, oVar2.w).c(oVar.x, oVar2.x).c(oVar.e, oVar2.e).c(oVar.h, oVar2.h).b(Integer.valueOf(oVar.v), Integer.valueOf(oVar2.v), g0.c);
        boolean z4 = oVar.C;
        s8.p c3 = b10.c(z4, oVar2.C);
        boolean z10 = oVar.D;
        s8.p c10 = c3.c(z10, oVar2.D);
        if (z4 && z10) {
            c10 = c10.a(oVar.E, oVar2.E);
        }
        return c10.e();
    }

    @Override // f5.n
    public final int a() {
        return this.B;
    }

    @Override // f5.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.y && !d0.a(this.d.C, oVar.d.C)) {
            return false;
        }
        if (this.f.Q) {
            return true;
        }
        return this.C == oVar.C && this.D == oVar.D;
    }
}
