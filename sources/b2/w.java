package b2;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class w {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final w V = new w(new v());
    public static final String W = Integer.toString(0, 36);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String Z = Integer.toString(3, 36);
    public static final String a0 = Integer.toString(4, 36);
    public static final String b0 = Integer.toString(5, 36);
    public static final String c0 = Integer.toString(6, 36);
    public static final String d0 = Integer.toString(7, 36);
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final int A;
    public final int B;
    public final int C;
    public final float D;
    public final int E;
    public final float F;
    public final byte[] G;
    public final int H;
    public final n I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public final String a;
    public final String b;
    public final e9.n0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final t0 l;
    public final String m;
    public boolean n;
    public long o;
    public int p;
    public String q;
    public final String r;
    public final String s;
    public final int t;
    public final int u;
    public final List v;
    public final s w;
    public final long x;
    public final boolean y;
    public final int z;

    static {
        Integer.toString(8, 36);
        e0 = Integer.toString(9, 36);
        f0 = Integer.toString(10, 36);
        g0 = Integer.toString(11, 36);
        h0 = Integer.toString(12, 36);
        i0 = Integer.toString(13, 36);
        j0 = Integer.toString(14, 36);
        k0 = Integer.toString(15, 36);
        l0 = Integer.toString(16, 36);
        m0 = Integer.toString(17, 36);
        n0 = Integer.toString(18, 36);
        o0 = Integer.toString(19, 36);
        p0 = Integer.toString(20, 36);
        q0 = Integer.toString(21, 36);
        r0 = Integer.toString(22, 36);
        s0 = Integer.toString(23, 36);
        t0 = Integer.toString(24, 36);
        u0 = Integer.toString(25, 36);
        v0 = Integer.toString(26, 36);
        w0 = Integer.toString(27, 36);
        x0 = Integer.toString(28, 36);
        y0 = Integer.toString(29, 36);
        z0 = Integer.toString(30, 36);
        A0 = Integer.toString(31, 36);
        B0 = Integer.toString(32, 36);
        C0 = Integer.toString(33, 36);
        D0 = Integer.toString(34, 36);
        E0 = Integer.toString(35, 36);
        F0 = Integer.toString(36, 36);
        G0 = Integer.toString(37, 36);
    }

    public w(v vVar) {
        boolean z10;
        String str;
        this.a = vVar.a;
        String T = e2.m0.T(vVar.d);
        this.d = T;
        if (vVar.c.isEmpty() && vVar.b != null) {
            this.c = e9.n0.y(new a0(T, vVar.b));
            this.b = vVar.b;
        } else if (vVar.c.isEmpty() || vVar.b != null) {
            if (!vVar.c.isEmpty() || vVar.b != null) {
                for (int i10 = 0; i10 < vVar.c.size(); i10++) {
                    if (!((a0) vVar.c.get(i10)).b.equals(vVar.b)) {
                    }
                }
                z10 = false;
                u6.p(z10);
                this.c = vVar.c;
                this.b = vVar.b;
            }
            z10 = true;
            u6.p(z10);
            this.c = vVar.c;
            this.b = vVar.b;
        } else {
            e9.n0 n0Var = vVar.c;
            this.c = n0Var;
            int size = n0Var.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    str = ((a0) n0Var.get(0)).b;
                    break;
                }
                Object obj = n0Var.get(i11);
                i11++;
                a0 a0Var = (a0) obj;
                if (TextUtils.equals(a0Var.a, T)) {
                    str = a0Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = vVar.e;
        u6.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", vVar.g == 0 || (vVar.f & 32768) != 0);
        this.f = vVar.f;
        this.g = vVar.g;
        int i12 = vVar.h;
        this.h = i12;
        int i13 = vVar.i;
        this.i = i13;
        this.j = i13 != -1 ? i13 : i12;
        this.k = vVar.j;
        this.l = vVar.k;
        this.m = vVar.l;
        this.n = vVar.m;
        this.o = vVar.n;
        this.p = vVar.p;
        this.q = vVar.o;
        this.r = vVar.q;
        this.s = vVar.r;
        this.t = vVar.s;
        this.u = vVar.t;
        List list = vVar.u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        s sVar = vVar.v;
        this.w = sVar;
        this.x = vVar.w;
        this.y = vVar.x;
        this.z = vVar.y;
        this.A = vVar.z;
        this.B = vVar.A;
        this.C = vVar.B;
        this.D = vVar.C;
        int i14 = vVar.D;
        this.E = i14 == -1 ? 0 : i14;
        float f7 = vVar.E;
        this.F = f7 == -1.0f ? 1.0f : f7;
        this.G = vVar.F;
        this.H = vVar.G;
        this.I = vVar.H;
        this.J = vVar.I;
        this.K = vVar.J;
        this.L = vVar.K;
        this.M = vVar.L;
        int i15 = vVar.M;
        this.N = i15 == -1 ? 0 : i15;
        int i16 = vVar.N;
        this.O = i16 != -1 ? i16 : 0;
        this.P = vVar.O;
        this.Q = vVar.P;
        this.R = vVar.Q;
        this.S = vVar.R;
        int i17 = vVar.S;
        if (i17 != 0 || sVar == null) {
            this.T = i17;
        } else {
            this.T = 1;
        }
    }

    public static String c(w wVar) {
        int i10;
        String str;
        String str2;
        if (wVar == null) {
            return "null";
        }
        int i11 = wVar.e;
        e9.n0 n0Var = wVar.c;
        String str3 = wVar.d;
        int i12 = wVar.L;
        int i13 = wVar.K;
        int i14 = wVar.J;
        float f7 = wVar.D;
        n nVar = wVar.I;
        float f10 = wVar.F;
        int i15 = wVar.C;
        int i16 = wVar.B;
        int i17 = wVar.A;
        int i18 = wVar.z;
        s sVar = wVar.w;
        String str4 = wVar.k;
        int i19 = wVar.j;
        String str5 = wVar.m;
        String str6 = wVar.r;
        int i20 = wVar.f;
        d9.l lVar = new d9.l(String.valueOf(','), 0);
        StringBuilder u10 = a1.g.u("id=");
        u10.append(wVar.a);
        u10.append(", mimeType=");
        u10.append(wVar.s);
        if (str6 != null) {
            u10.append(", container=");
            u10.append(str6);
        }
        if (str5 != null) {
            u10.append(", primaryGroupId=");
            u10.append(str5);
        }
        if (i19 != -1) {
            u10.append(", bitrate=");
            u10.append(i19);
        }
        if (str4 != null) {
            u10.append(", codecs=");
            u10.append(str4);
        }
        if (sVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < sVar.d; i21++) {
                UUID uuid = sVar.a[i21].b;
                if (uuid.equals(m.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(m.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(m.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(m.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(m.b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            u10.append(", drm=[");
            lVar.a(u10, linkedHashSet.iterator());
            u10.append(']');
        }
        if (i18 != -1 && i17 != -1) {
            u10.append(", res=");
            u10.append(i18);
            u10.append("x");
            u10.append(i17);
        }
        if (i16 != -1 && i15 != -1) {
            u10.append(", decRes=");
            u10.append(i16);
            u10.append("x");
            u10.append(i15);
        }
        double d = f10;
        int i22 = g9.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str7 = e2.m0.a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (nVar != null) {
            int i23 = nVar.f;
            int i24 = nVar.e;
            if ((i24 != -1 && i23 != -1) || nVar.d()) {
                u10.append(", color=");
                if (nVar.d()) {
                    String b10 = n.b(nVar.a);
                    String a2 = n.a(nVar.b);
                    String c10 = n.c(nVar.c);
                    String str8 = e2.m0.a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                u10.append(str2 + "/" + ((i24 == -1 || i23 == -1) ? "NA/NA" : a1.g.k(i24, i23, "/")));
            }
        }
        if (f7 != -1.0f) {
            u10.append(", fps=");
            u10.append(f7);
        }
        if (i14 != -1) {
            u10.append(", maxSubLayers=");
            u10.append(i14);
        }
        if (i13 != -1) {
            u10.append(", channels=");
            u10.append(i13);
        }
        if (i12 != -1) {
            u10.append(", sample_rate=");
            u10.append(i12);
        }
        if (str3 != null) {
            u10.append(", language=");
            u10.append(str3);
        }
        if (!n0Var.isEmpty()) {
            u10.append(", labels=[");
            lVar.a(u10, e9.s.x(n0Var, new aa.a(19)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.m0.a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            lVar.a(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.m0.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i20 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i20 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i20 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i20 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i20 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i20 & 64) != 0) {
                arrayList2.add("caption");
            }
            i10 = i20;
            if ((i10 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i10 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i10 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i10 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i10 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i10 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i10 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i10 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i10 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            lVar.a(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = wVar.g;
            String str11 = e2.m0.a;
            if (i25 == 0) {
                str = "undefined";
            } else if (i25 == 1) {
                str = "original";
            } else if (i25 == 2) {
                str = "depth-linear";
            } else if (i25 == 3) {
                str = "depth-inverse";
            } else {
                if (i25 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            u10.append(str);
        }
        return u10.toString();
    }

    public final v a() {
        v vVar = new v();
        vVar.a = this.a;
        vVar.b = this.b;
        vVar.c = this.c;
        vVar.d = this.d;
        vVar.e = this.e;
        vVar.f = this.f;
        vVar.h = this.h;
        vVar.i = this.i;
        vVar.j = this.k;
        vVar.k = this.l;
        vVar.l = this.m;
        vVar.q = this.r;
        vVar.r = this.s;
        vVar.s = this.t;
        vVar.t = this.u;
        vVar.u = this.v;
        vVar.v = this.w;
        vVar.w = this.x;
        vVar.x = this.y;
        vVar.y = this.z;
        vVar.z = this.A;
        vVar.A = this.B;
        vVar.B = this.C;
        vVar.C = this.D;
        vVar.D = this.E;
        vVar.E = this.F;
        vVar.F = this.G;
        vVar.G = this.H;
        vVar.H = this.I;
        vVar.I = this.J;
        vVar.J = this.K;
        vVar.K = this.L;
        vVar.L = this.M;
        vVar.M = this.N;
        vVar.N = this.O;
        vVar.O = this.P;
        vVar.P = this.Q;
        vVar.Q = this.R;
        vVar.R = this.S;
        vVar.S = this.T;
        vVar.m = this.n;
        vVar.n = this.o;
        vVar.p = this.p;
        vVar.o = this.q;
        return vVar;
    }

    public final boolean b(w wVar) {
        List list = this.v;
        if (list.size() != wVar.v.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) wVar.v.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final w d(w wVar) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == wVar) {
            return this;
        }
        int h = v0.h(this.s);
        String str3 = wVar.a;
        t0 t0Var = wVar.l;
        e9.n0 n0Var = wVar.c;
        int i12 = wVar.R;
        int i13 = wVar.S;
        String str4 = wVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (n0Var.isEmpty()) {
            n0Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = wVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = wVar.h;
        }
        int i15 = this.i;
        if (i15 == -1) {
            i15 = wVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String w9 = e2.m0.w(h, wVar.k);
            if (e2.m0.d0(w9).length == 1) {
                str5 = w9;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = wVar.m;
        }
        t0 t0Var2 = this.l;
        if (t0Var2 != null) {
            t0Var = t0Var2.b(t0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = wVar.D;
        }
        int i16 = this.e | wVar.e;
        e9.n0 n0Var2 = n0Var;
        int i17 = wVar.f | this.f;
        s sVar = wVar.w;
        ArrayList arrayList = new ArrayList();
        if (sVar != null) {
            String str7 = sVar.c;
            r[] rVarArr = sVar.a;
            int length = rVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                r rVar = rVarArr[i19];
                int i20 = length;
                if (rVar.e != null) {
                    arrayList.add(rVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        s sVar2 = this.w;
        if (sVar2 != null) {
            if (str2 == null) {
                str2 = sVar2.c;
            }
            int size = arrayList.size();
            r[] rVarArr2 = sVar2.a;
            String str8 = str2;
            int length2 = rVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                r rVar2 = rVarArr2[i22];
                int i23 = length2;
                if (rVar2.e != null) {
                    UUID uuid = rVar2.b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            i10 = size;
                            arrayList.add(rVar2);
                            break;
                        }
                        i10 = size;
                        if (((r) arrayList.get(i24)).b.equals(uuid)) {
                            break;
                        }
                        i24++;
                        size = i10;
                    }
                } else {
                    i10 = size;
                    i11 = i12;
                }
                i21 = i22 + 1;
                length2 = i23;
                i12 = i11;
                size = i10;
            }
            str2 = str8;
        }
        int i25 = i12;
        s sVar3 = arrayList.isEmpty() ? null : new s(str2, arrayList);
        v a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = e9.n0.u(n0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f = i17;
        a2.h = i14;
        a2.i = i15;
        a2.j = str5;
        a2.k = t0Var;
        a2.l = str6;
        a2.v = sVar3;
        a2.C = f7;
        a2.Q = i25;
        a2.R = i13;
        return new w(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        int i11 = this.U;
        return (i11 == 0 || (i10 = wVar.U) == 0 || i11 == i10) && this.e == wVar.e && this.f == wVar.f && this.g == wVar.g && this.h == wVar.h && this.i == wVar.i && this.t == wVar.t && this.x == wVar.x && this.z == wVar.z && this.A == wVar.A && this.B == wVar.B && this.C == wVar.C && this.E == wVar.E && this.H == wVar.H && this.J == wVar.J && this.K == wVar.K && this.L == wVar.L && this.M == wVar.M && this.N == wVar.N && this.O == wVar.O && this.P == wVar.P && this.R == wVar.R && this.S == wVar.S && this.T == wVar.T && Float.compare(this.D, wVar.D) == 0 && Float.compare(this.F, wVar.F) == 0 && Objects.equals(this.a, wVar.a) && Objects.equals(this.b, wVar.b) && this.c.equals(wVar.c) && Objects.equals(this.k, wVar.k) && Objects.equals(this.m, wVar.m) && Objects.equals(this.r, wVar.r) && Objects.equals(this.s, wVar.s) && Objects.equals(this.d, wVar.d) && Arrays.equals(this.G, wVar.G) && Objects.equals(this.l, wVar.l) && Objects.equals(this.I, wVar.I) && Objects.equals(this.w, wVar.w) && b(wVar);
    }

    public final int hashCode() {
        if (this.U == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            t0 t0Var = this.l;
            int hashCode5 = (hashCode4 + (t0Var == null ? 0 : t0Var.hashCode())) * 961;
            String str5 = this.m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.r;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.s;
            this.U = ((((((((((((((((((((((Float.floatToIntBits(this.F) + ((((Float.floatToIntBits(this.D) + ((((((((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.t) * 31) + ((int) this.x)) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31) + this.E) * 31)) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        }
        return this.U;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b);
        sb2.append(", ");
        sb2.append(this.r);
        sb2.append(", ");
        sb2.append(this.s);
        sb2.append(", ");
        sb2.append(this.k);
        sb2.append(", ");
        sb2.append(this.j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.z);
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append(", ");
        sb2.append(this.I);
        sb2.append("], [");
        sb2.append(this.K);
        sb2.append(", ");
        return a1.g.n(this.L, "])", sb2);
    }
}
