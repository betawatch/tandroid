package j3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n0 implements g {
    public final String B;
    public final String C;
    public final int D;
    public final List E;
    public final o3.g F;
    public final long G;
    public final int H;
    public final int I;
    public final float J;
    public final int K;
    public final float L;
    public final byte[] M;
    public final int N;
    public final i5.b O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public int Y;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;
    public final int n;
    public final String r;
    public final e4.c s;
    public boolean v;
    public long w;
    public int x;
    public String y;
    public static final n0 Z = new n0(new m0());
    public static final String a0 = Integer.toString(0, 36);
    public static final String b0 = Integer.toString(1, 36);
    public static final String c0 = Integer.toString(2, 36);
    public static final String d0 = Integer.toString(3, 36);
    public static final String e0 = Integer.toString(4, 36);
    public static final String f0 = Integer.toString(5, 36);
    public static final String g0 = Integer.toString(6, 36);
    public static final String h0 = Integer.toString(7, 36);
    public static final String i0 = Integer.toString(8, 36);
    public static final String j0 = Integer.toString(9, 36);
    public static final String k0 = Integer.toString(10, 36);
    public static final String l0 = Integer.toString(11, 36);
    public static final String m0 = Integer.toString(12, 36);
    public static final String n0 = Integer.toString(13, 36);
    public static final String o0 = Integer.toString(14, 36);
    public static final String p0 = Integer.toString(15, 36);
    public static final String q0 = Integer.toString(16, 36);
    public static final String r0 = Integer.toString(17, 36);
    public static final String s0 = Integer.toString(18, 36);
    public static final String t0 = Integer.toString(19, 36);
    public static final String u0 = Integer.toString(20, 36);
    public static final String v0 = Integer.toString(21, 36);
    public static final String w0 = Integer.toString(22, 36);
    public static final String x0 = Integer.toString(23, 36);
    public static final String y0 = Integer.toString(24, 36);
    public static final String z0 = Integer.toString(25, 36);
    public static final String A0 = Integer.toString(26, 36);
    public static final String B0 = Integer.toString(27, 36);
    public static final String C0 = Integer.toString(28, 36);
    public static final String D0 = Integer.toString(29, 36);
    public static final String E0 = Integer.toString(30, 36);
    public static final String F0 = Integer.toString(31, 36);
    public static final f5.u G0 = new f5.u(27);

    public n0(m0 m0Var) {
        this.a = m0Var.a;
        this.b = m0Var.b;
        this.c = h5.d0.H(m0Var.c);
        this.d = m0Var.d;
        this.e = m0Var.e;
        int i10 = m0Var.f;
        this.f = i10;
        int i11 = m0Var.g;
        this.h = i11;
        this.n = i11 != -1 ? i11 : i10;
        this.r = m0Var.h;
        this.s = m0Var.i;
        this.v = m0Var.j;
        this.w = m0Var.k;
        this.x = m0Var.m;
        this.y = m0Var.l;
        this.B = m0Var.n;
        this.C = m0Var.o;
        this.D = m0Var.p;
        List list = m0Var.q;
        this.E = list == null ? Collections.EMPTY_LIST : list;
        o3.g gVar = m0Var.r;
        this.F = gVar;
        this.G = m0Var.s;
        this.H = m0Var.t;
        this.I = m0Var.u;
        this.J = m0Var.v;
        int i12 = m0Var.w;
        this.K = i12 == -1 ? 0 : i12;
        float f10 = m0Var.x;
        this.L = f10 == -1.0f ? 1.0f : f10;
        this.M = m0Var.y;
        this.N = m0Var.z;
        this.O = m0Var.A;
        this.P = m0Var.B;
        this.Q = m0Var.C;
        this.R = m0Var.D;
        int i13 = m0Var.E;
        this.S = i13 == -1 ? 0 : i13;
        int i14 = m0Var.F;
        this.T = i14 != -1 ? i14 : 0;
        this.U = m0Var.G;
        this.V = m0Var.H;
        this.W = m0Var.I;
        int i15 = m0Var.J;
        if (i15 != 0 || gVar == null) {
            this.X = i15;
        } else {
            this.X = 1;
        }
    }

    public final m0 a() {
        m0 m0Var = new m0();
        m0Var.a = this.a;
        m0Var.b = this.b;
        m0Var.c = this.c;
        m0Var.d = this.d;
        m0Var.e = this.e;
        m0Var.f = this.f;
        m0Var.g = this.h;
        m0Var.h = this.r;
        m0Var.i = this.s;
        m0Var.n = this.B;
        m0Var.o = this.C;
        m0Var.p = this.D;
        m0Var.q = this.E;
        m0Var.r = this.F;
        m0Var.s = this.G;
        m0Var.t = this.H;
        m0Var.u = this.I;
        m0Var.v = this.J;
        m0Var.w = this.K;
        m0Var.x = this.L;
        m0Var.y = this.M;
        m0Var.z = this.N;
        m0Var.A = this.O;
        m0Var.B = this.P;
        m0Var.C = this.Q;
        m0Var.D = this.R;
        m0Var.E = this.S;
        m0Var.F = this.T;
        m0Var.G = this.U;
        m0Var.H = this.V;
        m0Var.I = this.W;
        m0Var.J = this.X;
        m0Var.j = this.v;
        m0Var.k = this.w;
        m0Var.m = this.x;
        m0Var.l = this.y;
        return m0Var;
    }

    public final boolean b(n0 n0Var) {
        List list = this.E;
        if (list.size() != n0Var.E.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) n0Var.E.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final n0 c(n0 n0Var) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == n0Var) {
            return this;
        }
        int g10 = h5.o.g(this.C);
        String str3 = n0Var.a;
        e4.c cVar = n0Var.s;
        String str4 = n0Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if ((g10 != 3 && g10 != 1) || (str = n0Var.c) == null) {
            str = this.c;
        }
        int i12 = this.f;
        if (i12 == -1) {
            i12 = n0Var.f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = n0Var.h;
        }
        String str5 = this.r;
        if (str5 == null) {
            String p10 = h5.d0.p(g10, n0Var.r);
            if (h5.d0.P(p10).length == 1) {
                str5 = p10;
            }
        }
        e4.c cVar2 = this.s;
        if (cVar2 != null) {
            cVar = cVar == null ? cVar2 : cVar2.a(cVar.a);
        }
        float f10 = this.J;
        if (f10 == -1.0f && g10 == 2) {
            f10 = n0Var.J;
        }
        int i14 = this.d | n0Var.d;
        int i15 = this.e | n0Var.e;
        o3.g gVar = n0Var.F;
        ArrayList arrayList = new ArrayList();
        if (gVar != null) {
            str2 = gVar.c;
            o3.f[] fVarArr = gVar.a;
            int length = fVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                o3.f[] fVarArr2 = fVarArr;
                o3.f fVar = fVarArr2[i16];
                int i17 = length;
                if (fVar.e != null) {
                    arrayList.add(fVar);
                }
                i16++;
                fVarArr = fVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        o3.g gVar2 = this.F;
        if (gVar2 != null) {
            if (str2 == null) {
                str2 = gVar2.c;
            }
            int size = arrayList.size();
            o3.f[] fVarArr3 = gVar2.a;
            int length2 = fVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                o3.f fVar2 = fVarArr3[i19];
                o3.f[] fVarArr4 = fVarArr3;
                if (fVar2.e != null) {
                    UUID uuid = fVar2.b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i10 = size;
                            arrayList.add(fVar2);
                            break;
                        }
                        i10 = size;
                        if (((o3.f) arrayList.get(i20)).b.equals(uuid)) {
                            break;
                        }
                        i20++;
                        size = i10;
                    }
                } else {
                    i10 = size;
                    i11 = length2;
                }
                i18 = i19 + 1;
                fVarArr3 = fVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        o3.g gVar3 = arrayList.isEmpty() ? null : new o3.g(str2, arrayList);
        m0 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = str;
        a2.d = i14;
        a2.e = i15;
        a2.f = i12;
        a2.g = i13;
        a2.h = str5;
        a2.i = cVar;
        a2.r = gVar3;
        a2.v = f10;
        return new n0(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            int i11 = this.Y;
            if ((i11 == 0 || (i10 = n0Var.Y) == 0 || i11 == i10) && this.d == n0Var.d && this.e == n0Var.e && this.f == n0Var.f && this.h == n0Var.h && this.D == n0Var.D && this.G == n0Var.G && this.H == n0Var.H && this.I == n0Var.I && this.K == n0Var.K && this.N == n0Var.N && this.P == n0Var.P && this.Q == n0Var.Q && this.R == n0Var.R && this.S == n0Var.S && this.T == n0Var.T && this.U == n0Var.U && this.V == n0Var.V && this.W == n0Var.W && this.X == n0Var.X && Float.compare(this.J, n0Var.J) == 0 && Float.compare(this.L, n0Var.L) == 0 && h5.d0.a(this.a, n0Var.a) && h5.d0.a(this.b, n0Var.b) && h5.d0.a(this.r, n0Var.r) && h5.d0.a(this.B, n0Var.B) && h5.d0.a(this.C, n0Var.C) && h5.d0.a(this.c, n0Var.c) && Arrays.equals(this.M, n0Var.M) && h5.d0.a(this.s, n0Var.s) && h5.d0.a(this.O, n0Var.O) && h5.d0.a(this.F, n0Var.F) && b(n0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.Y == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.h) * 31;
            String str4 = this.r;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            e4.c cVar = this.s;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.B;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.C;
            this.Y = ((((((((((((((((((((Float.floatToIntBits(this.L) + ((((Float.floatToIntBits(this.J) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.D) * 31) + ((int) this.G)) * 31) + this.H) * 31) + this.I) * 31)) * 31) + this.K) * 31)) * 31) + this.N) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X;
        }
        return this.Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.C);
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", [");
        sb.append(this.H);
        sb.append(", ");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.O);
        sb.append("], [");
        sb.append(this.P);
        sb.append(", ");
        return android.support.v4.media.a.m(this.Q, "])", sb);
    }
}
