package h3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 implements g {
    public final String A;
    public final String B;
    public final int C;
    public final List D;
    public final l3.d E;
    public final long F;
    public final int G;
    public final int H;
    public final float I;
    public final int J;
    public final float K;
    public final byte[] L;
    public final int M;
    public final e5.b N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public int X;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int h;
    public final int n;
    public final String r;
    public final z3.c s;
    public boolean v;
    public long w;
    public int x;
    public String y;
    public static final t0 Y = new t0(new s0());
    public static final String Z = Integer.toString(0, 36);
    public static final String a0 = Integer.toString(1, 36);
    public static final String b0 = Integer.toString(2, 36);
    public static final String c0 = Integer.toString(3, 36);
    public static final String d0 = Integer.toString(4, 36);
    public static final String e0 = Integer.toString(5, 36);
    public static final String f0 = Integer.toString(6, 36);
    public static final String g0 = Integer.toString(7, 36);
    public static final String h0 = Integer.toString(8, 36);
    public static final String i0 = Integer.toString(9, 36);
    public static final String j0 = Integer.toString(10, 36);
    public static final String k0 = Integer.toString(11, 36);
    public static final String l0 = Integer.toString(12, 36);
    public static final String m0 = Integer.toString(13, 36);
    public static final String n0 = Integer.toString(14, 36);
    public static final String o0 = Integer.toString(15, 36);
    public static final String p0 = Integer.toString(16, 36);
    public static final String q0 = Integer.toString(17, 36);
    public static final String r0 = Integer.toString(18, 36);
    public static final String s0 = Integer.toString(19, 36);
    public static final String t0 = Integer.toString(20, 36);
    public static final String u0 = Integer.toString(21, 36);
    public static final String v0 = Integer.toString(22, 36);
    public static final String w0 = Integer.toString(23, 36);
    public static final String x0 = Integer.toString(24, 36);
    public static final String y0 = Integer.toString(25, 36);
    public static final String z0 = Integer.toString(26, 36);
    public static final String A0 = Integer.toString(27, 36);
    public static final String B0 = Integer.toString(28, 36);
    public static final String C0 = Integer.toString(29, 36);
    public static final String D0 = Integer.toString(30, 36);
    public static final String E0 = Integer.toString(31, 36);
    public static final f9.z F0 = new f9.z(18);

    public t0(s0 s0Var) {
        this.a = s0Var.a;
        this.b = s0Var.b;
        this.c = d5.g0.I(s0Var.c);
        this.d = s0Var.d;
        this.e = s0Var.e;
        int i10 = s0Var.f;
        this.f = i10;
        int i11 = s0Var.g;
        this.h = i11;
        this.n = i11 != -1 ? i11 : i10;
        this.r = s0Var.h;
        this.s = s0Var.i;
        this.v = s0Var.j;
        this.w = s0Var.k;
        this.x = s0Var.m;
        this.y = s0Var.l;
        this.A = s0Var.n;
        this.B = s0Var.o;
        this.C = s0Var.p;
        List list = s0Var.q;
        this.D = list == null ? Collections.EMPTY_LIST : list;
        l3.d dVar = s0Var.r;
        this.E = dVar;
        this.F = s0Var.s;
        this.G = s0Var.t;
        this.H = s0Var.u;
        this.I = s0Var.v;
        int i12 = s0Var.w;
        this.J = i12 == -1 ? 0 : i12;
        float f10 = s0Var.x;
        this.K = f10 == -1.0f ? 1.0f : f10;
        this.L = s0Var.y;
        this.M = s0Var.z;
        this.N = s0Var.A;
        this.O = s0Var.B;
        this.P = s0Var.C;
        this.Q = s0Var.D;
        int i13 = s0Var.E;
        this.R = i13 == -1 ? 0 : i13;
        int i14 = s0Var.F;
        this.S = i14 != -1 ? i14 : 0;
        this.T = s0Var.G;
        this.U = s0Var.H;
        this.V = s0Var.I;
        int i15 = s0Var.J;
        if (i15 != 0 || dVar == null) {
            this.W = i15;
        } else {
            this.W = 1;
        }
    }

    public final s0 a() {
        s0 s0Var = new s0();
        s0Var.a = this.a;
        s0Var.b = this.b;
        s0Var.c = this.c;
        s0Var.d = this.d;
        s0Var.e = this.e;
        s0Var.f = this.f;
        s0Var.g = this.h;
        s0Var.h = this.r;
        s0Var.i = this.s;
        s0Var.n = this.A;
        s0Var.o = this.B;
        s0Var.p = this.C;
        s0Var.q = this.D;
        s0Var.r = this.E;
        s0Var.s = this.F;
        s0Var.t = this.G;
        s0Var.u = this.H;
        s0Var.v = this.I;
        s0Var.w = this.J;
        s0Var.x = this.K;
        s0Var.y = this.L;
        s0Var.z = this.M;
        s0Var.A = this.N;
        s0Var.B = this.O;
        s0Var.C = this.P;
        s0Var.D = this.Q;
        s0Var.E = this.R;
        s0Var.F = this.S;
        s0Var.G = this.T;
        s0Var.H = this.U;
        s0Var.I = this.V;
        s0Var.J = this.W;
        s0Var.j = this.v;
        s0Var.k = this.w;
        s0Var.m = this.x;
        s0Var.l = this.y;
        return s0Var;
    }

    public final boolean b(t0 t0Var) {
        List list = this.D;
        if (list.size() != t0Var.D.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) t0Var.D.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final t0 c(t0 t0Var) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == t0Var) {
            return this;
        }
        int g10 = d5.q.g(this.B);
        String str3 = t0Var.a;
        z3.c cVar = t0Var.s;
        String str4 = t0Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if ((g10 != 3 && g10 != 1) || (str = t0Var.c) == null) {
            str = this.c;
        }
        int i12 = this.f;
        if (i12 == -1) {
            i12 = t0Var.f;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = t0Var.h;
        }
        String str5 = this.r;
        if (str5 == null) {
            String o10 = d5.g0.o(g10, t0Var.r);
            if (d5.g0.Q(o10).length == 1) {
                str5 = o10;
            }
        }
        z3.c cVar2 = this.s;
        if (cVar2 != null) {
            cVar = cVar2.a(cVar);
        }
        float f10 = this.I;
        if (f10 == -1.0f && g10 == 2) {
            f10 = t0Var.I;
        }
        int i14 = this.d | t0Var.d;
        int i15 = this.e | t0Var.e;
        l3.d dVar = t0Var.E;
        ArrayList arrayList = new ArrayList();
        if (dVar != null) {
            str2 = dVar.c;
            l3.c[] cVarArr = dVar.a;
            int length = cVarArr.length;
            int i16 = 0;
            while (i16 < length) {
                l3.c[] cVarArr2 = cVarArr;
                l3.c cVar3 = cVarArr2[i16];
                int i17 = length;
                if (cVar3.e != null) {
                    arrayList.add(cVar3);
                }
                i16++;
                cVarArr = cVarArr2;
                length = i17;
            }
        } else {
            str2 = null;
        }
        l3.d dVar2 = this.E;
        if (dVar2 != null) {
            if (str2 == null) {
                str2 = dVar2.c;
            }
            int size = arrayList.size();
            l3.c[] cVarArr3 = dVar2.a;
            int length2 = cVarArr3.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = i18;
                l3.c cVar4 = cVarArr3[i19];
                l3.c[] cVarArr4 = cVarArr3;
                if (cVar4.e != null) {
                    UUID uuid = cVar4.b;
                    i11 = length2;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i10 = size;
                            arrayList.add(cVar4);
                            break;
                        }
                        i10 = size;
                        if (((l3.c) arrayList.get(i20)).b.equals(uuid)) {
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
                cVarArr3 = cVarArr4;
                length2 = i11;
                size = i10;
            }
        }
        l3.d dVar3 = arrayList.isEmpty() ? null : new l3.d(str2, arrayList);
        s0 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = str;
        a2.d = i14;
        a2.e = i15;
        a2.f = i12;
        a2.g = i13;
        a2.h = str5;
        a2.i = cVar;
        a2.r = dVar3;
        a2.v = f10;
        return new t0(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && t0.class == obj.getClass()) {
            t0 t0Var = (t0) obj;
            int i11 = this.X;
            if ((i11 == 0 || (i10 = t0Var.X) == 0 || i11 == i10) && this.d == t0Var.d && this.e == t0Var.e && this.f == t0Var.f && this.h == t0Var.h && this.C == t0Var.C && this.F == t0Var.F && this.G == t0Var.G && this.H == t0Var.H && this.J == t0Var.J && this.M == t0Var.M && this.O == t0Var.O && this.P == t0Var.P && this.Q == t0Var.Q && this.R == t0Var.R && this.S == t0Var.S && this.T == t0Var.T && this.U == t0Var.U && this.V == t0Var.V && this.W == t0Var.W && Float.compare(this.I, t0Var.I) == 0 && Float.compare(this.K, t0Var.K) == 0 && d5.g0.a(this.a, t0Var.a) && d5.g0.a(this.b, t0Var.b) && d5.g0.a(this.r, t0Var.r) && d5.g0.a(this.A, t0Var.A) && d5.g0.a(this.B, t0Var.B) && d5.g0.a(this.c, t0Var.c) && Arrays.equals(this.L, t0Var.L) && d5.g0.a(this.s, t0Var.s) && d5.g0.a(this.N, t0Var.N) && d5.g0.a(this.E, t0Var.E) && b(t0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.X == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.h) * 31;
            String str4 = this.r;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            z3.c cVar = this.s;
            int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.A;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.B;
            this.X = ((((((((((((((((((((Float.floatToIntBits(this.K) + ((((Float.floatToIntBits(this.I) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.C) * 31) + ((int) this.F)) * 31) + this.G) * 31) + this.H) * 31)) * 31) + this.J) * 31)) * 31) + this.M) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W;
        }
        return this.X;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.B);
        sb2.append(", ");
        sb2.append(this.r);
        sb2.append(", ");
        sb2.append(this.n);
        sb2.append(", ");
        sb2.append(this.c);
        sb2.append(", [");
        sb2.append(this.G);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.O);
        sb2.append(", ");
        return a9.p.k(this.P, "])", sb2);
    }
}
