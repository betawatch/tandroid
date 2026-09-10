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
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final s U = new s(new r());
    public static final String V = Integer.toString(0, 36);
    public static final String W = Integer.toString(1, 36);
    public static final String X = Integer.toString(2, 36);
    public static final String Y = Integer.toString(3, 36);
    public static final String Z = Integer.toString(4, 36);
    public static final String a0 = Integer.toString(5, 36);
    public static final String b0 = Integer.toString(6, 36);
    public static final String c0 = Integer.toString(7, 36);
    public static final String d0;
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
    public final float C;
    public final int D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final j H;
    public final int I;
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
    public int T;
    public final String a;
    public final String b;
    public final e9.i0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final p0 l;
    public boolean m;
    public long n;
    public int o;
    public String p;
    public final String q;
    public final String r;
    public final int s;
    public final int t;
    public final List u;
    public final o v;
    public final long w;
    public final boolean x;
    public final int y;
    public final int z;

    static {
        e2.d0.J(8);
        d0 = Integer.toString(9, 36);
        e0 = Integer.toString(10, 36);
        f0 = Integer.toString(11, 36);
        g0 = Integer.toString(12, 36);
        h0 = Integer.toString(13, 36);
        i0 = Integer.toString(14, 36);
        j0 = Integer.toString(15, 36);
        k0 = Integer.toString(16, 36);
        l0 = Integer.toString(17, 36);
        m0 = Integer.toString(18, 36);
        n0 = Integer.toString(19, 36);
        o0 = Integer.toString(20, 36);
        p0 = Integer.toString(21, 36);
        q0 = Integer.toString(22, 36);
        r0 = Integer.toString(23, 36);
        s0 = Integer.toString(24, 36);
        t0 = Integer.toString(25, 36);
        u0 = Integer.toString(26, 36);
        v0 = Integer.toString(27, 36);
        w0 = Integer.toString(28, 36);
        x0 = Integer.toString(29, 36);
        y0 = Integer.toString(30, 36);
        z0 = Integer.toString(31, 36);
        A0 = Integer.toString(32, 36);
        B0 = Integer.toString(33, 36);
        C0 = Integer.toString(34, 36);
        D0 = Integer.toString(35, 36);
        E0 = Integer.toString(36, 36);
    }

    public s(r rVar) {
        boolean z10;
        String str;
        this.a = rVar.a;
        String R = e2.d0.R(rVar.d);
        this.d = R;
        if (rVar.c.isEmpty() && rVar.b != null) {
            this.c = e9.i0.z(new w(R, rVar.b));
            this.b = rVar.b;
        } else if (rVar.c.isEmpty() || rVar.b != null) {
            if (!rVar.c.isEmpty() || rVar.b != null) {
                for (int i10 = 0; i10 < rVar.c.size(); i10++) {
                    if (!((w) rVar.c.get(i10)).b.equals(rVar.b)) {
                    }
                }
                z10 = false;
                e2.d.g(z10);
                this.c = rVar.c;
                this.b = rVar.b;
            }
            z10 = true;
            e2.d.g(z10);
            this.c = rVar.c;
            this.b = rVar.b;
        } else {
            e9.i0 i0Var = rVar.c;
            this.c = i0Var;
            int size = i0Var.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    str = ((w) i0Var.get(0)).b;
                    break;
                }
                Object obj = i0Var.get(i11);
                i11++;
                w wVar = (w) obj;
                if (TextUtils.equals(wVar.a, R)) {
                    str = wVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = rVar.e;
        e2.d.f("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", rVar.g == 0 || (rVar.f & 32768) != 0);
        this.f = rVar.f;
        this.g = rVar.g;
        int i12 = rVar.h;
        this.h = i12;
        int i13 = rVar.i;
        this.i = i13;
        this.j = i13 != -1 ? i13 : i12;
        this.k = rVar.j;
        this.l = rVar.k;
        this.m = rVar.l;
        this.n = rVar.m;
        this.o = rVar.o;
        this.p = rVar.n;
        this.q = rVar.p;
        this.r = rVar.q;
        this.s = rVar.r;
        this.t = rVar.s;
        List list = rVar.t;
        this.u = list == null ? Collections.EMPTY_LIST : list;
        o oVar = rVar.u;
        this.v = oVar;
        this.w = rVar.v;
        this.x = rVar.w;
        this.y = rVar.x;
        this.z = rVar.y;
        this.A = rVar.z;
        this.B = rVar.A;
        this.C = rVar.B;
        int i14 = rVar.C;
        this.D = i14 == -1 ? 0 : i14;
        float f7 = rVar.D;
        this.E = f7 == -1.0f ? 1.0f : f7;
        this.F = rVar.E;
        this.G = rVar.F;
        this.H = rVar.G;
        this.I = rVar.H;
        this.J = rVar.I;
        this.K = rVar.J;
        this.L = rVar.K;
        int i15 = rVar.L;
        this.M = i15 == -1 ? 0 : i15;
        int i16 = rVar.M;
        this.N = i16 != -1 ? i16 : 0;
        this.O = rVar.N;
        this.P = rVar.O;
        this.Q = rVar.P;
        this.R = rVar.Q;
        int i17 = rVar.R;
        if (i17 != 0 || oVar == null) {
            this.S = i17;
        } else {
            this.S = 1;
        }
    }

    public static String c(s sVar) {
        char c10;
        int i10;
        String str;
        String str2;
        o oVar;
        if (sVar == null) {
            return BuildConfig.BETA_URL;
        }
        int i11 = sVar.e;
        e9.i0 i0Var = sVar.c;
        String str3 = sVar.d;
        int i12 = sVar.K;
        int i13 = sVar.J;
        int i14 = sVar.I;
        float f7 = sVar.C;
        j jVar = sVar.H;
        float f10 = sVar.E;
        int i15 = sVar.B;
        int i16 = sVar.A;
        int i17 = sVar.z;
        int i18 = sVar.y;
        o oVar2 = sVar.v;
        String str4 = sVar.k;
        int i19 = sVar.j;
        String str5 = sVar.q;
        int i20 = sVar.f;
        a4.m mVar = new a4.m(String.valueOf(','));
        StringBuilder u10 = a4.a.u("id=");
        u10.append(sVar.a);
        u10.append(", mimeType=");
        u10.append(sVar.r);
        if (str5 != null) {
            u10.append(", container=");
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
        if (oVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i21 = 0;
            c10 = 0;
            while (i21 < oVar2.d) {
                UUID uuid = oVar2.a[i21].b;
                if (uuid.equals(i.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.a)) {
                    linkedHashSet.add("universal");
                } else {
                    oVar = oVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i21++;
                    oVar2 = oVar;
                }
                oVar = oVar2;
                i21++;
                oVar2 = oVar;
            }
            u10.append(", drm=[");
            mVar.O(u10, linkedHashSet.iterator());
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
        int i22 = g9.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            u10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c10] = Float.valueOf(f10);
            String str6 = e2.d0.a;
            u10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (jVar != null) {
            int i23 = jVar.f;
            int i24 = jVar.e;
            if ((i24 != -1 && i23 != -1) || jVar.d()) {
                u10.append(", color=");
                if (jVar.d()) {
                    String b10 = j.b(jVar.a);
                    String a2 = j.a(jVar.b);
                    String c11 = j.c(jVar.c);
                    String str7 = e2.d0.a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a2 + "/" + c11;
                } else {
                    str2 = "NA/NA/NA";
                }
                u10.append(str2 + "/" + ((i24 == -1 || i23 == -1) ? "NA/NA" : a4.a.k(i24, i23, "/")));
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
        boolean isEmpty = i0Var.isEmpty();
        int i25 = 3;
        if (!isEmpty) {
            u10.append(", labels=[");
            mVar.O(u10, e9.q.w(i0Var, new androidx.emoji2.text.w(i25)).iterator());
            u10.append("]");
        }
        if (i11 != 0) {
            u10.append(", selectionFlags=[");
            String str8 = e2.d0.a;
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
            mVar.O(u10, arrayList.iterator());
            u10.append("]");
        }
        if (i20 != 0) {
            u10.append(", roleFlags=[");
            String str9 = e2.d0.a;
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
            mVar.O(u10, arrayList2.iterator());
            u10.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            u10.append(", auxiliaryTrackType=");
            int i26 = sVar.g;
            String str10 = e2.d0.a;
            if (i26 == 0) {
                str = "undefined";
            } else if (i26 == 1) {
                str = "original";
            } else if (i26 == 2) {
                str = "depth-linear";
            } else if (i26 == 3) {
                str = "depth-inverse";
            } else {
                if (i26 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            u10.append(str);
        }
        return u10.toString();
    }

    public final r a() {
        r rVar = new r();
        rVar.a = this.a;
        rVar.b = this.b;
        rVar.c = this.c;
        rVar.d = this.d;
        rVar.e = this.e;
        rVar.f = this.f;
        rVar.h = this.h;
        rVar.i = this.i;
        rVar.j = this.k;
        rVar.k = this.l;
        rVar.p = this.q;
        rVar.q = this.r;
        rVar.r = this.s;
        rVar.s = this.t;
        rVar.t = this.u;
        rVar.u = this.v;
        rVar.v = this.w;
        rVar.w = this.x;
        rVar.x = this.y;
        rVar.y = this.z;
        rVar.z = this.A;
        rVar.A = this.B;
        rVar.B = this.C;
        rVar.C = this.D;
        rVar.D = this.E;
        rVar.E = this.F;
        rVar.F = this.G;
        rVar.G = this.H;
        rVar.H = this.I;
        rVar.I = this.J;
        rVar.J = this.K;
        rVar.K = this.L;
        rVar.L = this.M;
        rVar.M = this.N;
        rVar.N = this.O;
        rVar.O = this.P;
        rVar.P = this.Q;
        rVar.Q = this.R;
        rVar.R = this.S;
        rVar.l = this.m;
        rVar.m = this.n;
        rVar.o = this.o;
        rVar.n = this.p;
        return rVar;
    }

    public final boolean b(s sVar) {
        List list = this.u;
        if (list.size() != sVar.u.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) sVar.u.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final s d(s sVar) {
        String str;
        String str2;
        int i10;
        int i11;
        if (this == sVar) {
            return this;
        }
        int h = r0.h(this.r);
        String str3 = sVar.a;
        p0 p0Var = sVar.l;
        e9.i0 i0Var = sVar.c;
        int i12 = sVar.Q;
        int i13 = sVar.R;
        String str4 = sVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = sVar.d) == null) {
            str = this.d;
        }
        int i14 = this.h;
        if (i14 == -1) {
            i14 = sVar.h;
        }
        int i15 = this.i;
        if (i15 == -1) {
            i15 = sVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String v = e2.d0.v(h, sVar.k);
            if (e2.d0.b0(v).length == 1) {
                str5 = v;
            }
        }
        p0 p0Var2 = this.l;
        if (p0Var2 != null) {
            p0Var = p0Var2.b(p0Var);
        }
        float f7 = this.C;
        if (f7 == -1.0f && h == 2) {
            f7 = sVar.C;
        }
        int i16 = this.e | sVar.e;
        int i17 = this.f | sVar.f;
        o oVar = sVar.v;
        ArrayList arrayList = new ArrayList();
        e9.i0 i0Var2 = i0Var;
        if (oVar != null) {
            String str6 = oVar.c;
            n[] nVarArr = oVar.a;
            int length = nVarArr.length;
            int i18 = 0;
            while (i18 < length) {
                int i19 = i18;
                n nVar = nVarArr[i19];
                int i20 = length;
                if (nVar.e != null) {
                    arrayList.add(nVar);
                }
                i18 = i19 + 1;
                length = i20;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        o oVar2 = this.v;
        if (oVar2 != null) {
            if (str2 == null) {
                str2 = oVar2.c;
            }
            int size = arrayList.size();
            n[] nVarArr2 = oVar2.a;
            String str7 = str2;
            int length2 = nVarArr2.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21;
                n nVar2 = nVarArr2[i22];
                int i23 = length2;
                if (nVar2.e != null) {
                    UUID uuid = nVar2.b;
                    i11 = i13;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            i10 = size;
                            arrayList.add(nVar2);
                            break;
                        }
                        i10 = size;
                        if (((n) arrayList.get(i24)).b.equals(uuid)) {
                            break;
                        }
                        i24++;
                        size = i10;
                    }
                } else {
                    i10 = size;
                    i11 = i13;
                }
                i21 = i22 + 1;
                length2 = i23;
                i13 = i11;
                size = i10;
            }
            str2 = str7;
        }
        int i25 = i13;
        o oVar3 = arrayList.isEmpty() ? null : new o(str2, arrayList);
        r a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = e9.i0.v(i0Var2);
        a2.d = str;
        a2.e = i16;
        a2.f = i17;
        a2.h = i14;
        a2.i = i15;
        a2.j = str5;
        a2.k = p0Var;
        a2.u = oVar3;
        a2.B = f7;
        a2.P = i12;
        a2.Q = i25;
        return new s(a2);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        int i11 = this.T;
        return (i11 == 0 || (i10 = sVar.T) == 0 || i11 == i10) && this.e == sVar.e && this.f == sVar.f && this.g == sVar.g && this.h == sVar.h && this.i == sVar.i && this.s == sVar.s && this.w == sVar.w && this.y == sVar.y && this.z == sVar.z && this.A == sVar.A && this.B == sVar.B && this.D == sVar.D && this.G == sVar.G && this.I == sVar.I && this.J == sVar.J && this.K == sVar.K && this.L == sVar.L && this.M == sVar.M && this.N == sVar.N && this.O == sVar.O && this.Q == sVar.Q && this.R == sVar.R && this.S == sVar.S && Float.compare(this.C, sVar.C) == 0 && Float.compare(this.E, sVar.E) == 0 && Objects.equals(this.a, sVar.a) && Objects.equals(this.b, sVar.b) && this.c.equals(sVar.c) && Objects.equals(this.k, sVar.k) && Objects.equals(this.q, sVar.q) && Objects.equals(this.r, sVar.r) && Objects.equals(this.d, sVar.d) && Arrays.equals(this.F, sVar.F) && Objects.equals(this.l, sVar.l) && Objects.equals(this.H, sVar.H) && Objects.equals(this.v, sVar.v) && b(sVar);
    }

    public final int hashCode() {
        if (this.T == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            p0 p0Var = this.l;
            int hashCode5 = (hashCode4 + (p0Var == null ? 0 : p0Var.hashCode())) * 961;
            String str5 = this.q;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.r;
            this.T = ((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((Float.floatToIntBits(this.C) + ((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.s) * 31) + ((int) this.w)) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.Q) * 31) + this.R) * 31) + this.S;
        }
        return this.T;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.b);
        sb2.append(", ");
        sb2.append(this.q);
        sb2.append(", ");
        sb2.append(this.r);
        sb2.append(", ");
        sb2.append(this.k);
        sb2.append(", ");
        sb2.append(this.j);
        sb2.append(", ");
        sb2.append(this.d);
        sb2.append(", [");
        sb2.append(this.y);
        sb2.append(", ");
        sb2.append(this.z);
        sb2.append(", ");
        sb2.append(this.C);
        sb2.append(", ");
        sb2.append(this.H);
        sb2.append("], [");
        sb2.append(this.J);
        sb2.append(", ");
        return a4.a.n(this.K, "])", sb2);
    }
}
