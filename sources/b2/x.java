package b2;

import a8.yb;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final x V = new x(new w());
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
    public final o I;
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
    public final f9.i0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final u0 l;
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
    public final t w;
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

    public x(w wVar) {
        boolean z10;
        String str;
        this.a = wVar.a;
        String T = e2.n0.T(wVar.d);
        this.d = T;
        if (wVar.c.isEmpty() && wVar.b != null) {
            this.c = f9.i0.y(new b0(T, wVar.b));
            this.b = wVar.b;
        } else if (wVar.c.isEmpty() || wVar.b != null) {
            if (!wVar.c.isEmpty() || wVar.b != null) {
                for (int i10 = 0; i10 < wVar.c.size(); i10++) {
                    if (!((b0) wVar.c.get(i10)).b.equals(wVar.b)) {
                    }
                }
                z10 = false;
                yb.p(z10);
                this.c = wVar.c;
                this.b = wVar.b;
            }
            z10 = true;
            yb.p(z10);
            this.c = wVar.c;
            this.b = wVar.b;
        } else {
            f9.i0 i0Var = wVar.c;
            this.c = i0Var;
            int size = i0Var.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    str = ((b0) i0Var.get(0)).b;
                    break;
                }
                Object obj = i0Var.get(i11);
                i11++;
                b0 b0Var = (b0) obj;
                if (TextUtils.equals(b0Var.a, T)) {
                    str = b0Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = wVar.e;
        yb.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", wVar.g == 0 || (wVar.f & 32768) != 0);
        this.f = wVar.f;
        this.g = wVar.g;
        int i12 = wVar.h;
        this.h = i12;
        int i13 = wVar.i;
        this.i = i13;
        this.j = i13 != -1 ? i13 : i12;
        this.k = wVar.j;
        this.l = wVar.k;
        this.m = wVar.l;
        this.n = wVar.m;
        this.o = wVar.n;
        this.p = wVar.p;
        this.q = wVar.o;
        this.r = wVar.q;
        this.s = wVar.r;
        this.t = wVar.s;
        this.u = wVar.t;
        List list = wVar.u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        t tVar = wVar.v;
        this.w = tVar;
        this.x = wVar.w;
        this.y = wVar.x;
        this.z = wVar.y;
        this.A = wVar.z;
        this.B = wVar.A;
        this.C = wVar.B;
        this.D = wVar.C;
        int i14 = wVar.D;
        this.E = i14 == -1 ? 0 : i14;
        float f7 = wVar.E;
        this.F = f7 == -1.0f ? 1.0f : f7;
        this.G = wVar.F;
        this.H = wVar.G;
        this.I = wVar.H;
        this.J = wVar.I;
        this.K = wVar.J;
        this.L = wVar.K;
        this.M = wVar.L;
        int i15 = wVar.M;
        this.N = i15 == -1 ? 0 : i15;
        int i16 = wVar.N;
        this.O = i16 != -1 ? i16 : 0;
        this.P = wVar.O;
        this.Q = wVar.P;
        this.R = wVar.Q;
        this.S = wVar.R;
        int i17 = wVar.S;
        if (i17 != 0 || tVar == null) {
            this.T = i17;
        } else {
            this.T = 1;
        }
    }

    public static String c(x xVar) {
        char c10;
        int i10;
        String str;
        String str2;
        if (xVar == null) {
            return BuildConfig.BETA_URL;
        }
        int i11 = xVar.e;
        f9.i0 i0Var = xVar.c;
        String str3 = xVar.d;
        int i12 = xVar.L;
        int i13 = xVar.K;
        int i14 = xVar.J;
        float f7 = xVar.D;
        o oVar = xVar.I;
        float f10 = xVar.F;
        int i15 = xVar.C;
        int i16 = xVar.B;
        int i17 = xVar.A;
        int i18 = xVar.z;
        t tVar = xVar.w;
        String str4 = xVar.k;
        int i19 = xVar.j;
        String str5 = xVar.m;
        String str6 = xVar.r;
        int i20 = xVar.f;
        d5.j jVar = new d5.j(String.valueOf(','));
        StringBuilder u10 = a1.g.u("id=");
        u10.append(xVar.a);
        u10.append(", mimeType=");
        u10.append(xVar.s);
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
        if (tVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < tVar.d; i21++) {
                UUID uuid = tVar.a[i21].b;
                if (uuid.equals(n.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(n.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(n.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(n.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(n.b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c10 = 0;
            u10.append(", drm=[");
            jVar.a(u10, linkedHashSet.iterator());
            u10.append(']');
        } else {
            c10 = 0;
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
        int i22 = h9.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str7 = e2.n0.a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (oVar != null) {
            int i23 = oVar.f;
            int i24 = oVar.e;
            if ((i24 != -1 && i23 != -1) || oVar.d()) {
                u10.append(", color=");
                if (oVar.d()) {
                    String b10 = o.b(oVar.a);
                    String a2 = o.a(oVar.b);
                    String c11 = o.c(oVar.c);
                    String str8 = e2.n0.a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
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
        if (!i0Var.isEmpty()) {
            u10.append(", labels=[");
            jVar.a(u10, f9.o.x(i0Var, new ag.w(5)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str9 = e2.n0.a;
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
            jVar.a(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str10 = e2.n0.a;
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
            jVar.a(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i25 = xVar.g;
            String str11 = e2.n0.a;
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

    public final w a() {
        w wVar = new w();
        wVar.a = this.a;
        wVar.b = this.b;
        wVar.c = this.c;
        wVar.d = this.d;
        wVar.e = this.e;
        wVar.f = this.f;
        wVar.h = this.h;
        wVar.i = this.i;
        wVar.j = this.k;
        wVar.k = this.l;
        wVar.l = this.m;
        wVar.q = this.r;
        wVar.r = this.s;
        wVar.s = this.t;
        wVar.t = this.u;
        wVar.u = this.v;
        wVar.v = this.w;
        wVar.w = this.x;
        wVar.x = this.y;
        wVar.y = this.z;
        wVar.z = this.A;
        wVar.A = this.B;
        wVar.B = this.C;
        wVar.C = this.D;
        wVar.D = this.E;
        wVar.E = this.F;
        wVar.F = this.G;
        wVar.G = this.H;
        wVar.H = this.I;
        wVar.I = this.J;
        wVar.J = this.K;
        wVar.K = this.L;
        wVar.L = this.M;
        wVar.M = this.N;
        wVar.N = this.O;
        wVar.O = this.P;
        wVar.P = this.Q;
        wVar.Q = this.R;
        wVar.R = this.S;
        wVar.S = this.T;
        wVar.m = this.n;
        wVar.n = this.o;
        wVar.p = this.p;
        wVar.o = this.q;
        return wVar;
    }

    public final boolean b(x xVar) {
        List list = this.v;
        if (list.size() != xVar.v.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) xVar.v.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final x d(x xVar) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == xVar) {
            return this;
        }
        int h = w0.h(this.s);
        String str3 = xVar.a;
        u0 u0Var = xVar.l;
        f9.i0 i0Var = xVar.c;
        int i12 = xVar.R;
        int i13 = xVar.S;
        String str4 = xVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = xVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = xVar.h;
        }
        int i15 = this.i;
        if (i15 == -1) {
            i15 = xVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String w10 = e2.n0.w(h, xVar.k);
            if (e2.n0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = xVar.m;
        }
        u0 u0Var2 = this.l;
        if (u0Var2 != null) {
            u0Var = u0Var2.b(u0Var);
        }
        float f7 = this.D;
        if (f7 == -1.0f && h == 2) {
            f7 = xVar.D;
        }
        int i16 = this.e | xVar.e;
        f9.i0 i0Var2 = i0Var;
        int i17 = xVar.f | this.f;
        t tVar = xVar.w;
        ArrayList arrayList = new ArrayList();
        if (tVar != null) {
            String str7 = tVar.c;
            s[] sVarArr = tVar.a;
            int length = sVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                s sVar = sVarArr[i19];
                int i20 = length;
                if (sVar.e != null) {
                    arrayList.add(sVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        t tVar2 = this.w;
        if (tVar2 != null) {
            if (str2 == null) {
                str2 = tVar2.c;
            }
            int size = arrayList.size();
            s[] sVarArr2 = tVar2.a;
            String str8 = str2;
            int length2 = sVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                s sVar2 = sVarArr2[i22];
                int i23 = length2;
                if (sVar2.e != null) {
                    UUID uuid = sVar2.b;
                    i11 = i12;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            i10 = size;
                            arrayList.add(sVar2);
                            break;
                        }
                        i10 = size;
                        if (((s) arrayList.get(i24)).b.equals(uuid)) {
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
        t tVar3 = arrayList.isEmpty() ? null : new t(str2, arrayList);
        w a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = f9.i0.u(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f = i17;
        a2.h = i14;
        a2.i = i15;
        a2.j = str5;
        a2.k = u0Var;
        a2.l = str6;
        a2.v = tVar3;
        a2.C = f7;
        a2.Q = i25;
        a2.R = i13;
        return new x(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        int i11 = this.U;
        return (i11 == 0 || (i10 = xVar.U) == 0 || i11 == i10) && this.e == xVar.e && this.f == xVar.f && this.g == xVar.g && this.h == xVar.h && this.i == xVar.i && this.t == xVar.t && this.x == xVar.x && this.z == xVar.z && this.A == xVar.A && this.B == xVar.B && this.C == xVar.C && this.E == xVar.E && this.H == xVar.H && this.J == xVar.J && this.K == xVar.K && this.L == xVar.L && this.M == xVar.M && this.N == xVar.N && this.O == xVar.O && this.P == xVar.P && this.R == xVar.R && this.S == xVar.S && this.T == xVar.T && Float.compare(this.D, xVar.D) == 0 && Float.compare(this.F, xVar.F) == 0 && Objects.equals(this.a, xVar.a) && Objects.equals(this.b, xVar.b) && this.c.equals(xVar.c) && Objects.equals(this.k, xVar.k) && Objects.equals(this.m, xVar.m) && Objects.equals(this.r, xVar.r) && Objects.equals(this.s, xVar.s) && Objects.equals(this.d, xVar.d) && Arrays.equals(this.G, xVar.G) && Objects.equals(this.l, xVar.l) && Objects.equals(this.I, xVar.I) && Objects.equals(this.w, xVar.w) && b(xVar);
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
            u0 u0Var = this.l;
            int hashCode5 = (hashCode4 + (u0Var == null ? 0 : u0Var.hashCode())) * 961;
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
