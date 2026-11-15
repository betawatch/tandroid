package a3;

import e2.m1;
import h9.i0;
import h9.n1;
import h9.q1;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r extends q {
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final int K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final int O;
    public final boolean P;
    public final String Q;
    public final boolean e;
    public final n f;
    public final boolean h;
    public final boolean n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0120 A[EDGE_INSN: B:162:0x0120->B:84:0x0120 BREAK  A[LOOP:1: B:77:0x0109->B:160:0x011d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(int i7, m1 m1Var, int i10, n nVar, int i11, String str, int i12, boolean z10) {
        super(i7, m1Var, i10);
        boolean z11;
        boolean z12;
        int i13;
        int size;
        int i14;
        int i15;
        String str2;
        int i16;
        int i17;
        boolean z13;
        int i18;
        boolean z14;
        boolean z15;
        n nVar2;
        e2.u uVar;
        boolean z16;
        String c10;
        int i19;
        e2.u uVar2;
        int i20;
        int i21;
        float f10;
        int i22;
        e2.u uVar3;
        int i23;
        int i24;
        int i25;
        this.f = nVar;
        boolean z17 = nVar.x0;
        i0 i0Var = nVar.m;
        i0 i0Var2 = nVar.o;
        int i26 = z17 ? 24 : 16;
        int i27 = 0;
        this.J = false;
        if (z10 && (((i23 = (uVar3 = this.d).z) == -1 || i23 <= nVar.a) && ((i24 = uVar3.A) == -1 || i24 <= nVar.b))) {
            float f11 = uVar3.D;
            if ((f11 == -1.0f || f11 <= nVar.c) && ((i25 = uVar3.j) == -1 || i25 <= nVar.d)) {
                z11 = true;
                this.e = z11;
                if (z10 && (((i20 = (uVar2 = this.d).z) == -1 || i20 >= nVar.e) && ((i21 = uVar2.A) == -1 || i21 >= nVar.f))) {
                    f10 = uVar2.D;
                    if ((f10 != -1.0f || f10 >= nVar.g) && ((i22 = uVar2.j) == -1 || i22 >= nVar.h)) {
                        z12 = true;
                        this.h = z12;
                        this.n = i5.c.b(i11, false);
                        e2.u uVar4 = this.d;
                        float f12 = uVar4.D;
                        this.r = f12 == -1.0f && f12 >= 10.0f;
                        this.s = uVar4.j;
                        int i28 = uVar4.z;
                        this.w = (i28 != -1 || (i19 = uVar4.A) == -1) ? -1 : i28 * i19;
                        i13 = 0;
                        while (true) {
                            size = i0Var2.size();
                            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            if (i13 < size) {
                                i15 = 0;
                                i13 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i15 = s.i(this.d, (String) i0Var2.get(i13), false);
                                if (i15 > 0) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                        }
                        this.y = i13;
                        this.E = i15;
                        int i29 = this.d.f;
                        int i30 = nVar.p;
                        q1 q1Var = s.l;
                        this.F = (i29 == 0 && i29 == i30) ? Integer.MAX_VALUE : Integer.bitCount(i29 & i30);
                        int i31 = this.d.f;
                        this.H = (i31 == 0 && (i31 & 1) == 0) ? false : true;
                        this.I = s.i(this.d, str, s.l(str) != null);
                        e2.u uVar5 = this.d;
                        str2 = uVar5.s;
                        i16 = i11 & 384;
                        if (i16 == 256 && (c10 = u2.w.c(uVar5)) != null) {
                            str2 = c10;
                        }
                        i17 = 0;
                        while (true) {
                            if (i17 < i0Var.size()) {
                                if (str2 != null && str2.equals(i0Var.get(i17))) {
                                    i14 = i17;
                                    break;
                                }
                                i17++;
                            } else {
                                break;
                            }
                        }
                        this.x = i14;
                        this.G = s.c(this.d, nVar.n);
                        this.L = i16 != 128 || i16 == 256;
                        z13 = i16 != 128;
                        this.M = z13;
                        this.N = (i11 & 64) != 64;
                        this.Q = str2;
                        if (str2 != null) {
                            i18 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        z16 = false;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        z16 = true;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        z16 = 2;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        z16 = 3;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        z16 = 4;
                                        break;
                                    }
                                    z16 = -1;
                                    break;
                                default:
                                    z16 = -1;
                                    break;
                            }
                            switch (z16) {
                                case false:
                                    i18 = 5;
                                    break;
                                case true:
                                    i18 = 3;
                                    break;
                                case true:
                                    i18 = 1;
                                    break;
                                case true:
                                    i18 = 2;
                                    break;
                            }
                            this.O = i18;
                            if (z13) {
                                e2.m mVar = this.d.I;
                                if (mVar != null) {
                                    int i32 = mVar.c;
                                    if (i32 == 7 || i32 == 6) {
                                        z14 = true;
                                        this.P = z14;
                                        z15 = this.e;
                                        nVar2 = this.f;
                                        uVar = this.d;
                                        if ((uVar.f & TLObject.FLAG_14) == 0 && i5.c.b(i11, nVar2.B0) && (z15 || nVar2.w0)) {
                                            i27 = (i5.c.b(i11, false) || !this.h || !z15 || uVar.j == -1 || nVar2.G || nVar2.F || (i26 & i11) == 0) ? 1 : 2;
                                        }
                                        this.K = i27;
                                    }
                                } else {
                                    e2.m mVar2 = e2.m.h;
                                }
                            }
                            z14 = false;
                            this.P = z14;
                            z15 = this.e;
                            nVar2 = this.f;
                            uVar = this.d;
                            if ((uVar.f & TLObject.FLAG_14) == 0) {
                                if (i5.c.b(i11, false)) {
                                }
                            }
                            this.K = i27;
                        }
                        i18 = 0;
                        this.O = i18;
                        if (z13) {
                        }
                        z14 = false;
                        this.P = z14;
                        z15 = this.e;
                        nVar2 = this.f;
                        uVar = this.d;
                        if ((uVar.f & TLObject.FLAG_14) == 0) {
                        }
                        this.K = i27;
                    }
                }
                z12 = false;
                this.h = z12;
                this.n = i5.c.b(i11, false);
                e2.u uVar42 = this.d;
                float f122 = uVar42.D;
                this.r = f122 == -1.0f && f122 >= 10.0f;
                this.s = uVar42.j;
                int i282 = uVar42.z;
                this.w = (i282 != -1 || (i19 = uVar42.A) == -1) ? -1 : i282 * i19;
                i13 = 0;
                while (true) {
                    size = i0Var2.size();
                    i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    if (i13 < size) {
                    }
                    i13++;
                }
                this.y = i13;
                this.E = i15;
                int i292 = this.d.f;
                int i302 = nVar.p;
                q1 q1Var2 = s.l;
                this.F = (i292 == 0 && i292 == i302) ? Integer.MAX_VALUE : Integer.bitCount(i292 & i302);
                int i312 = this.d.f;
                this.H = (i312 == 0 && (i312 & 1) == 0) ? false : true;
                this.I = s.i(this.d, str, s.l(str) != null);
                e2.u uVar52 = this.d;
                str2 = uVar52.s;
                i16 = i11 & 384;
                if (i16 == 256) {
                    str2 = c10;
                }
                i17 = 0;
                while (true) {
                    if (i17 < i0Var.size()) {
                    }
                    i17++;
                }
                this.x = i14;
                this.G = s.c(this.d, nVar.n);
                this.L = i16 != 128 || i16 == 256;
                if (i16 != 128) {
                }
                this.M = z13;
                this.N = (i11 & 64) != 64;
                this.Q = str2;
                if (str2 != null) {
                }
                i18 = 0;
                this.O = i18;
                if (z13) {
                }
                z14 = false;
                this.P = z14;
                z15 = this.e;
                nVar2 = this.f;
                uVar = this.d;
                if ((uVar.f & TLObject.FLAG_14) == 0) {
                }
                this.K = i27;
            }
        }
        z11 = false;
        this.e = z11;
        if (z10) {
            f10 = uVar2.D;
            if (f10 != -1.0f) {
            }
            z12 = true;
            this.h = z12;
            this.n = i5.c.b(i11, false);
            e2.u uVar422 = this.d;
            float f1222 = uVar422.D;
            this.r = f1222 == -1.0f && f1222 >= 10.0f;
            this.s = uVar422.j;
            int i2822 = uVar422.z;
            this.w = (i2822 != -1 || (i19 = uVar422.A) == -1) ? -1 : i2822 * i19;
            i13 = 0;
            while (true) {
                size = i0Var2.size();
                i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i13 < size) {
                }
                i13++;
            }
            this.y = i13;
            this.E = i15;
            int i2922 = this.d.f;
            int i3022 = nVar.p;
            q1 q1Var22 = s.l;
            this.F = (i2922 == 0 && i2922 == i3022) ? Integer.MAX_VALUE : Integer.bitCount(i2922 & i3022);
            int i3122 = this.d.f;
            this.H = (i3122 == 0 && (i3122 & 1) == 0) ? false : true;
            this.I = s.i(this.d, str, s.l(str) != null);
            e2.u uVar522 = this.d;
            str2 = uVar522.s;
            i16 = i11 & 384;
            if (i16 == 256) {
            }
            i17 = 0;
            while (true) {
                if (i17 < i0Var.size()) {
                }
                i17++;
            }
            this.x = i14;
            this.G = s.c(this.d, nVar.n);
            this.L = i16 != 128 || i16 == 256;
            if (i16 != 128) {
            }
            this.M = z13;
            this.N = (i11 & 64) != 64;
            this.Q = str2;
            if (str2 != null) {
            }
            i18 = 0;
            this.O = i18;
            if (z13) {
            }
            z14 = false;
            this.P = z14;
            z15 = this.e;
            nVar2 = this.f;
            uVar = this.d;
            if ((uVar.f & TLObject.FLAG_14) == 0) {
            }
            this.K = i27;
        }
        z12 = false;
        this.h = z12;
        this.n = i5.c.b(i11, false);
        e2.u uVar4222 = this.d;
        float f12222 = uVar4222.D;
        this.r = f12222 == -1.0f && f12222 >= 10.0f;
        this.s = uVar4222.j;
        int i28222 = uVar4222.z;
        this.w = (i28222 != -1 || (i19 = uVar4222.A) == -1) ? -1 : i28222 * i19;
        i13 = 0;
        while (true) {
            size = i0Var2.size();
            i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i13 < size) {
            }
            i13++;
        }
        this.y = i13;
        this.E = i15;
        int i29222 = this.d.f;
        int i30222 = nVar.p;
        q1 q1Var222 = s.l;
        this.F = (i29222 == 0 && i29222 == i30222) ? Integer.MAX_VALUE : Integer.bitCount(i29222 & i30222);
        int i31222 = this.d.f;
        this.H = (i31222 == 0 && (i31222 & 1) == 0) ? false : true;
        this.I = s.i(this.d, str, s.l(str) != null);
        e2.u uVar5222 = this.d;
        str2 = uVar5222.s;
        i16 = i11 & 384;
        if (i16 == 256) {
        }
        i17 = 0;
        while (true) {
            if (i17 < i0Var.size()) {
            }
            i17++;
        }
        this.x = i14;
        this.G = s.c(this.d, nVar.n);
        this.L = i16 != 128 || i16 == 256;
        if (i16 != 128) {
        }
        this.M = z13;
        this.N = (i11 & 64) != 64;
        this.Q = str2;
        if (str2 != null) {
        }
        i18 = 0;
        this.O = i18;
        if (z13) {
        }
        z14 = false;
        this.P = z14;
        z15 = this.e;
        nVar2 = this.f;
        uVar = this.d;
        if ((uVar.f & TLObject.FLAG_14) == 0) {
        }
        this.K = i27;
    }

    public static int c(r rVar, r rVar2) {
        h9.w c10 = h9.w.a.c(rVar.n, rVar2.n);
        Integer valueOf = Integer.valueOf(rVar.y);
        Integer valueOf2 = Integer.valueOf(rVar2.y);
        n1 n1Var = n1.c;
        return c10.b(valueOf, valueOf2, n1Var).a(rVar.E, rVar2.E).a(rVar.F, rVar2.F).b(Integer.valueOf(rVar.G), Integer.valueOf(rVar2.G), n1Var).c(rVar.H, rVar2.H).a(rVar.I, rVar2.I).c(rVar.r, rVar2.r).c(rVar.e, rVar2.e).c(rVar.h, rVar2.h).b(Integer.valueOf(rVar.x), Integer.valueOf(rVar2.x), n1Var).c(rVar.L, rVar2.L).c(rVar.N, rVar2.N).e();
    }

    @Override // a3.q
    public final int a() {
        return this.K;
    }

    @Override // a3.q
    public final boolean b(q qVar) {
        r rVar = (r) qVar;
        if (!this.J && !Objects.equals(this.Q, rVar.Q)) {
            return false;
        }
        this.f.getClass();
        return this.L == rVar.L && this.N == rVar.N;
    }
}
