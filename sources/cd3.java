// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class cd3 extends jd3 implements Comparable {
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
    public final gd3 n;
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
    public cd3(int i, t1c t1cVar, int i2, gd3 gd3Var, int i3, boolean z, bd3 bd3Var, int i4) {
        super(i, t1cVar, i2);
        int i5;
        int i6;
        boolean z2;
        String[] I;
        int i7;
        int i8;
        int i9;
        ko4 ko4Var;
        boolean z3;
        gd3 gd3Var2;
        boolean z4;
        a2c a2cVar;
        boolean z5;
        this.n = gd3Var;
        boolean z6 = gd3Var.z0;
        j99 j99Var = gd3Var.v;
        j99 j99Var2 = gd3Var.q;
        int i10 = z6 ? 24 : 16;
        byte b = 0;
        this.E = false;
        this.h = ld3.h(this.d.d);
        this.r = qu6.c(i3, false);
        int i11 = 0;
        while (true) {
            int i12 = j99Var2.d;
            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (i11 >= i12) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = ld3.g(this.d, (String) j99Var2.get(i11), false);
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
        int i14 = gd3Var.s;
        this.x = (i13 == 0 || i13 != i14) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.y = ld3.f(this.d, gd3Var.r);
        ko4 ko4Var2 = this.d;
        int i15 = ko4Var2.f;
        this.F = i15 == 0 || (i15 & 1) != 0;
        this.I = (ko4Var2.e & 1) != 0;
        String str = ko4Var2.t;
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
            int i16 = ko4Var2.N;
            this.J = i16;
            this.K = ko4Var2.P;
            int i17 = ko4Var2.k;
            this.L = i17;
            this.f = (i17 != -1 || i17 <= gd3Var.u) && (i16 == -1 || i16 <= gd3Var.t) && bd3Var.apply(ko4Var2);
            I = gcc.I();
            i7 = 0;
            while (true) {
                if (i7 >= I.length) {
                    i8 = ld3.g(this.d, I[i7], false);
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
                if (i9 < j99Var.d) {
                    String str2 = this.d.t;
                    if (str2 == null || !str2.equals(j99Var.get(i9))) {
                        i9++;
                    } else {
                        i5 = i9;
                    }
                }
            }
            this.M = i5;
            this.N = (i3 & 384) != 128;
            this.O = (i3 & 64) != 64;
            ko4Var = this.d;
            z3 = this.f;
            gd3Var2 = this.n;
            z4 = gd3Var2.B0;
            a2cVar = gd3Var2.w;
            if (qu6.c(i3, z4) && ((z3 || gd3Var2.y0) && (a2cVar.a != 2 || ld3.j(gd3Var2, i3, ko4Var)))) {
                b = (qu6.c(i3, false) || !z3 || ko4Var.k == -1 || gd3Var2.G || gd3Var2.F || (!gd3Var2.C0 && z) || a2cVar.a == 2 || (i3 & i10) == 0) ? (byte) 1 : (byte) 2;
            }
            this.e = b;
        }
        z2 = false;
        this.P = z2;
        int i162 = ko4Var2.N;
        this.J = i162;
        this.K = ko4Var2.P;
        int i172 = ko4Var2.k;
        this.L = i172;
        this.f = (i172 != -1 || i172 <= gd3Var.u) && (i162 == -1 || i162 <= gd3Var.t) && bd3Var.apply(ko4Var2);
        I = gcc.I();
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
            if (i9 < j99Var.d) {
            }
            i9++;
        }
        this.M = i5;
        this.N = (i3 & 384) != 128;
        this.O = (i3 & 64) != 64;
        ko4Var = this.d;
        z3 = this.f;
        gd3Var2 = this.n;
        z4 = gd3Var2.B0;
        a2cVar = gd3Var2.w;
        if (qu6.c(i3, z4)) {
            if (qu6.c(i3, false)) {
            }
        }
        this.e = b;
    }

    @Override // jd3
    public final int a() {
        return this.e;
    }

    @Override // jd3
    public final boolean b(jd3 jd3Var) {
        int i;
        String str;
        cd3 cd3Var = (cd3) jd3Var;
        ko4 ko4Var = cd3Var.d;
        this.n.getClass();
        ko4 ko4Var2 = this.d;
        int i2 = ko4Var2.N;
        if (i2 == -1 || i2 != ko4Var.N) {
            return false;
        }
        return (this.E || ((str = ko4Var2.t) != null && TextUtils.equals(str, ko4Var.t))) && (i = ko4Var2.P) != -1 && i == ko4Var.P && this.N == cd3Var.N && this.O == cd3Var.O;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(cd3 cd3Var) {
        eu7 eu7Var;
        eu7 a;
        boolean z = this.r;
        boolean z2 = this.f;
        if (z2 && z) {
            a = ld3.l;
            eu7Var = a;
        } else {
            eu7 eu7Var2 = ld3.l;
            eu7Var = eu7Var2;
            a = eu7Var2.a();
        }
        boolean z3 = cd3Var.r;
        int i = cd3Var.L;
        pp2 c = pp2.a.c(z, z3);
        Integer valueOf = Integer.valueOf(this.w);
        Integer valueOf2 = Integer.valueOf(cd3Var.w);
        qk7 qk7Var = qk7.c;
        pp2 b = c.b(valueOf, valueOf2, qk7Var).a(this.s, cd3Var.s).a(this.x, cd3Var.x).b(Integer.valueOf(this.y), Integer.valueOf(cd3Var.y), qk7Var).c(this.I, cd3Var.I).c(this.F, cd3Var.F).b(Integer.valueOf(this.G), Integer.valueOf(cd3Var.G), qk7Var).a(this.H, cd3Var.H).c(z2, cd3Var.f).b(Integer.valueOf(this.M), Integer.valueOf(cd3Var.M), qk7Var);
        boolean z4 = this.n.F;
        int i2 = this.L;
        if (z4) {
            b = b.b(Integer.valueOf(i2), Integer.valueOf(i), eu7Var.a());
        }
        pp2 b2 = b.c(this.N, cd3Var.N).c(this.O, cd3Var.O).c(this.P, cd3Var.P).b(Integer.valueOf(this.J), Integer.valueOf(cd3Var.J), a).b(Integer.valueOf(this.K), Integer.valueOf(cd3Var.K), a);
        if (Objects.equals(this.h, cd3Var.h)) {
            b2 = b2.b(Integer.valueOf(i2), Integer.valueOf(i), a);
        }
        return b2.e();
    }
}
