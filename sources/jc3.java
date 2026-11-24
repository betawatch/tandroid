// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jc3 extends qc3 implements Comparable {
    public final boolean E;
    public final boolean F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final byte e;
    public final boolean f;
    public final String h;
    public final nc3 n;
    public final boolean r;
    public final int s;
    public final int w;
    public final int x;
    public final int y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jc3(int i, sxb sxbVar, int i2, nc3 nc3Var, int i3, boolean z, ic3 ic3Var, int i4) {
        super(i, sxbVar, i2);
        int i5;
        int i6;
        boolean z2;
        String[] I;
        int i7;
        int i8;
        int i9;
        fm4 fm4Var;
        boolean z3;
        nc3 nc3Var2;
        boolean z4;
        zxb zxbVar;
        boolean z5;
        this.n = nc3Var;
        boolean z6 = nc3Var.z0;
        w59 w59Var = nc3Var.v;
        w59 w59Var2 = nc3Var.q;
        int i10 = z6 ? 24 : 16;
        byte b = 0;
        this.E = false;
        this.h = sc3.h(this.d.d);
        this.r = ls6.c(i3, false);
        int i11 = 0;
        while (true) {
            int i12 = w59Var2.d;
            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i11 >= i12) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = sc3.g(this.d, (String) w59Var2.get(i11), false);
                if (i6 > 0) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.w = i11;
        this.s = i6;
        int i13 = this.d.f;
        int i14 = nc3Var.s;
        this.x = (i13 == 0 || i13 != i14) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.y = sc3.f(this.d, nc3Var.r);
        fm4 fm4Var2 = this.d;
        int i15 = fm4Var2.f;
        this.F = i15 == 0 || (i15 & 1) != 0;
        this.I = (fm4Var2.e & 1) != 0;
        String str = fm4Var2.t;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        z5 = false;
                        break;
                    }
                    z5 = -1;
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        z5 = true;
                        break;
                    }
                    z5 = -1;
                    break;
                case 1504698186:
                    if (str.equals("audio/iamf")) {
                        z5 = 2;
                        break;
                    }
                    z5 = -1;
                    break;
                default:
                    z5 = -1;
                    break;
            }
            switch (z5) {
                case false:
                case true:
                case true:
                    z2 = true;
                    break;
            }
            this.P = z2;
            int i16 = fm4Var2.N;
            this.J = i16;
            this.K = fm4Var2.P;
            int i17 = fm4Var2.k;
            this.L = i17;
            this.f = (i17 != -1 || i17 <= nc3Var.u) && (i16 == -1 || i16 <= nc3Var.t) && ic3Var.apply(fm4Var2);
            I = g8c.I();
            i7 = 0;
            while (true) {
                if (i7 >= I.length) {
                    i8 = sc3.g(this.d, I[i7], false);
                    if (i8 <= 0) {
                        i7++;
                    }
                } else {
                    i8 = 0;
                    i7 = Integer.MAX_VALUE;
                }
            }
            this.G = i7;
            this.H = i8;
            i9 = 0;
            while (true) {
                if (i9 < w59Var.d) {
                    String str2 = this.d.t;
                    if (str2 == null || !str2.equals(w59Var.get(i9))) {
                        i9++;
                    } else {
                        i5 = i9;
                    }
                }
            }
            this.M = i5;
            this.N = (i3 & 384) != 128;
            this.O = (i3 & 64) != 64;
            fm4Var = this.d;
            z3 = this.f;
            nc3Var2 = this.n;
            z4 = nc3Var2.B0;
            zxbVar = nc3Var2.w;
            if (ls6.c(i3, z4) && ((z3 || nc3Var2.y0) && (zxbVar.a != 2 || sc3.j(nc3Var2, i3, fm4Var)))) {
                b = (ls6.c(i3, false) || !z3 || fm4Var.k == -1 || nc3Var2.G || nc3Var2.F || (!nc3Var2.C0 && z) || zxbVar.a == 2 || (i3 & i10) == 0) ? (byte) 1 : (byte) 2;
            }
            this.e = b;
        }
        z2 = false;
        this.P = z2;
        int i162 = fm4Var2.N;
        this.J = i162;
        this.K = fm4Var2.P;
        int i172 = fm4Var2.k;
        this.L = i172;
        this.f = (i172 != -1 || i172 <= nc3Var.u) && (i162 == -1 || i162 <= nc3Var.t) && ic3Var.apply(fm4Var2);
        I = g8c.I();
        i7 = 0;
        while (true) {
            if (i7 >= I.length) {
            }
            i7++;
        }
        this.G = i7;
        this.H = i8;
        i9 = 0;
        while (true) {
            if (i9 < w59Var.d) {
            }
            i9++;
        }
        this.M = i5;
        this.N = (i3 & 384) != 128;
        this.O = (i3 & 64) != 64;
        fm4Var = this.d;
        z3 = this.f;
        nc3Var2 = this.n;
        z4 = nc3Var2.B0;
        zxbVar = nc3Var2.w;
        if (ls6.c(i3, z4)) {
            if (ls6.c(i3, false)) {
            }
        }
        this.e = b;
    }

    @Override // qc3
    public final int a() {
        return this.e;
    }

    @Override // qc3
    public final boolean b(qc3 qc3Var) {
        int i;
        String str;
        jc3 jc3Var = (jc3) qc3Var;
        fm4 fm4Var = jc3Var.d;
        this.n.getClass();
        fm4 fm4Var2 = this.d;
        int i2 = fm4Var2.N;
        if (i2 == -1 || i2 != fm4Var.N) {
            return false;
        }
        return (this.E || ((str = fm4Var2.t) != null && TextUtils.equals(str, fm4Var.t))) && (i = fm4Var2.P) != -1 && i == fm4Var.P && this.N == jc3Var.N && this.O == jc3Var.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jc3 jc3Var) {
        yq7 yq7Var;
        yq7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = sc3.l;
            yq7Var = a;
        } else {
            yq7 yq7Var2 = sc3.l;
            yq7Var = yq7Var2;
            a = yq7Var2.a();
        }
        boolean z3 = jc3Var.r;
        int i = jc3Var.L;
        wo2 c = wo2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(jc3Var.w);
        hi7 hi7Var = hi7.c;
        wo2 b = c.b(valueOf, valueOf2, hi7Var).a(this.s, jc3Var.s).a(this.x, jc3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(jc3Var.y), hi7Var).c(this.I, jc3Var.I).c(this.F, jc3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(jc3Var.G), hi7Var).a(this.H, jc3Var.H).c(z2, jc3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(jc3Var.M), hi7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), yq7Var.a());
        }
        wo2 b2 = b.c(this.N, jc3Var.N).c(this.O, jc3Var.O).c(this.P, jc3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(jc3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(jc3Var.K), a);
        if (Objects.equals(this.h, jc3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
