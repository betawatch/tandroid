package b5;

import d5.f0;
import h3.t0;
import j4.i1;
import o8.j0;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q extends p {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean e;
    public final j f;
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
    public q(int i9, i1 i1Var, int i10, j jVar, int i11, int i12, boolean z10) {
        super(i9, i1Var, i10);
        boolean z11;
        boolean z12;
        int i13;
        t0 t0Var;
        String str;
        int i14;
        boolean z13;
        j jVar2;
        char c10;
        int i15;
        t0 t0Var2;
        int i16;
        int i17;
        float f10;
        int i18;
        t0 t0Var3;
        int i19;
        int i20;
        int i21;
        this.f = jVar;
        boolean z14 = jVar.O;
        o8.z zVar = jVar.w;
        int i22 = z14 ? 24 : 16;
        int i23 = 0;
        this.y = jVar.N && (i12 & i22) != 0;
        if (z10 && (((i19 = (t0Var3 = this.d).G) == -1 || i19 <= jVar.a) && ((i20 = t0Var3.H) == -1 || i20 <= jVar.b))) {
            float f11 = t0Var3.I;
            if ((f11 == -1.0f || f11 <= jVar.c) && ((i21 = t0Var3.n) == -1 || i21 <= jVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i16 = (t0Var2 = this.d).G) == -1 || i16 >= jVar.e) && ((i17 = t0Var2.H) == -1 || i17 >= jVar.f))) {
                    f10 = t0Var2.I;
                    if ((f10 != -1.0f || f10 >= jVar.h) && ((i18 = t0Var2.n) == -1 || i18 >= jVar.n)) {
                        z12 = true;
                        this.h = z12;
                        this.n = r.f(i11, false);
                        t0 t0Var4 = this.d;
                        this.r = t0Var4.n;
                        int i24 = t0Var4.G;
                        this.s = (i24 != -1 || (i15 = t0Var4.H) == -1) ? -1 : i24 * i15;
                        int i25 = t0Var4.e;
                        int i26 = jVar.x;
                        int i27 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        this.w = (i25 == 0 && i25 == i26) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i25 & i26);
                        int i28 = this.d.e;
                        this.x = (i28 == 0 && (i28 & 1) == 0) ? false : true;
                        i13 = 0;
                        while (true) {
                            if (i13 < zVar.size()) {
                                String str2 = this.d.B;
                                if (str2 != null && str2.equals(zVar.get(i13))) {
                                    i27 = i13;
                                    break;
                                }
                                i13++;
                            } else {
                                break;
                            }
                        }
                        this.v = i27;
                        this.B = (i11 & 384) != 128;
                        this.C = (i11 & 64) != 64;
                        t0Var = this.d;
                        str = t0Var.B;
                        if (str != null) {
                            i14 = 4;
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
                                    i14 = 5;
                                    break;
                                case 2:
                                    i14 = 3;
                                    break;
                                case 3:
                                    i14 = 1;
                                    break;
                                case 4:
                                    i14 = 2;
                                    break;
                            }
                            this.D = i14;
                            z13 = this.e;
                            jVar2 = this.f;
                            if ((t0Var.e & 16384) == 0 && r.f(i11, jVar2.W) && (z13 || jVar2.M)) {
                                i23 = (r.f(i11, false) || !this.h || !z13 || t0Var.n == -1 || jVar2.J || jVar2.I || (i22 & i11) == 0) ? 1 : 2;
                            }
                            this.A = i23;
                        }
                        i14 = 0;
                        this.D = i14;
                        z13 = this.e;
                        jVar2 = this.f;
                        if ((t0Var.e & 16384) == 0) {
                            if (r.f(i11, false)) {
                            }
                        }
                        this.A = i23;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = r.f(i11, false);
                t0 t0Var42 = this.d;
                this.r = t0Var42.n;
                int i242 = t0Var42.G;
                this.s = (i242 != -1 || (i15 = t0Var42.H) == -1) ? -1 : i242 * i15;
                int i252 = t0Var42.e;
                int i262 = jVar.x;
                int i272 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                this.w = (i252 == 0 && i252 == i262) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i252 & i262);
                int i282 = this.d.e;
                this.x = (i282 == 0 && (i282 & 1) == 0) ? false : true;
                i13 = 0;
                while (true) {
                    if (i13 < zVar.size()) {
                    }
                    i13++;
                }
                this.v = i272;
                this.B = (i11 & 384) != 128;
                this.C = (i11 & 64) != 64;
                t0Var = this.d;
                str = t0Var.B;
                if (str != null) {
                }
                i14 = 0;
                this.D = i14;
                z13 = this.e;
                jVar2 = this.f;
                if ((t0Var.e & 16384) == 0) {
                }
                this.A = i23;
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
            this.n = r.f(i11, false);
            t0 t0Var422 = this.d;
            this.r = t0Var422.n;
            int i2422 = t0Var422.G;
            this.s = (i2422 != -1 || (i15 = t0Var422.H) == -1) ? -1 : i2422 * i15;
            int i2522 = t0Var422.e;
            int i2622 = jVar.x;
            int i2722 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            this.w = (i2522 == 0 && i2522 == i2622) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i2522 & i2622);
            int i2822 = this.d.e;
            this.x = (i2822 == 0 && (i2822 & 1) == 0) ? false : true;
            i13 = 0;
            while (true) {
                if (i13 < zVar.size()) {
                }
                i13++;
            }
            this.v = i2722;
            this.B = (i11 & 384) != 128;
            this.C = (i11 & 64) != 64;
            t0Var = this.d;
            str = t0Var.B;
            if (str != null) {
            }
            i14 = 0;
            this.D = i14;
            z13 = this.e;
            jVar2 = this.f;
            if ((t0Var.e & 16384) == 0) {
            }
            this.A = i23;
        }
        z12 = false;
        this.h = z12;
        this.n = r.f(i11, false);
        t0 t0Var4222 = this.d;
        this.r = t0Var4222.n;
        int i24222 = t0Var4222.G;
        this.s = (i24222 != -1 || (i15 = t0Var4222.H) == -1) ? -1 : i24222 * i15;
        int i25222 = t0Var4222.e;
        int i26222 = jVar.x;
        int i27222 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.w = (i25222 == 0 && i25222 == i26222) ? ConnectionsManager.DEFAULT_DATACENTER_ID : Integer.bitCount(i25222 & i26222);
        int i28222 = this.d.e;
        this.x = (i28222 == 0 && (i28222 & 1) == 0) ? false : true;
        i13 = 0;
        while (true) {
            if (i13 < zVar.size()) {
            }
            i13++;
        }
        this.v = i27222;
        this.B = (i11 & 384) != 128;
        this.C = (i11 & 64) != 64;
        t0Var = this.d;
        str = t0Var.B;
        if (str != null) {
        }
        i14 = 0;
        this.D = i14;
        z13 = this.e;
        jVar2 = this.f;
        if ((t0Var.e & 16384) == 0) {
        }
        this.A = i23;
    }

    public static int c(q qVar, q qVar2) {
        o8.t b10 = o8.t.a.c(qVar.n, qVar2.n).a(qVar.w, qVar2.w).c(qVar.x, qVar2.x).c(qVar.e, qVar2.e).c(qVar.h, qVar2.h).b(Integer.valueOf(qVar.v), Integer.valueOf(qVar2.v), j0.c);
        boolean z10 = qVar.B;
        o8.t c10 = b10.c(z10, qVar2.B);
        boolean z11 = qVar.C;
        o8.t c11 = c10.c(z11, qVar2.C);
        if (z10 && z11) {
            c11 = c11.a(qVar.D, qVar2.D);
        }
        return c11.e();
    }

    @Override // b5.p
    public final int a() {
        return this.A;
    }

    @Override // b5.p
    public final boolean b(p pVar) {
        q qVar = (q) pVar;
        if (!this.y && !f0.a(this.d.B, qVar.d.B)) {
            return false;
        }
        if (this.f.P) {
            return true;
        }
        return this.B == qVar.B && this.C == qVar.C;
    }
}
