package d2;

import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final v V = new v(new u());
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
    public final g9.i0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final s0 l;
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

    public v(u uVar) {
        boolean z10;
        String str;
        this.a = uVar.a;
        String T = g2.n0.T(uVar.d);
        this.d = T;
        if (uVar.c.isEmpty() && uVar.b != null) {
            this.c = g9.i0.u(new z(T, uVar.b));
            this.b = uVar.b;
        } else if (uVar.c.isEmpty() || uVar.b != null) {
            if (!uVar.c.isEmpty() || uVar.b != null) {
                for (int i3 = 0; i3 < uVar.c.size(); i3++) {
                    if (!((z) uVar.c.get(i3)).b.equals(uVar.b)) {
                    }
                }
                z10 = false;
                zb.p(z10);
                this.c = uVar.c;
                this.b = uVar.b;
            }
            z10 = true;
            zb.p(z10);
            this.c = uVar.c;
            this.b = uVar.b;
        } else {
            g9.i0 i0Var = uVar.c;
            this.c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    str = ((z) i0Var.get(0)).b;
                    break;
                }
                Object obj = i0Var.get(i10);
                i10++;
                z zVar = (z) obj;
                if (TextUtils.equals(zVar.a, T)) {
                    str = zVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = uVar.e;
        zb.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", uVar.g == 0 || (uVar.f & 32768) != 0);
        this.f = uVar.f;
        this.g = uVar.g;
        int i11 = uVar.h;
        this.h = i11;
        int i12 = uVar.i;
        this.i = i12;
        this.j = i12 != -1 ? i12 : i11;
        this.k = uVar.j;
        this.l = uVar.k;
        this.m = uVar.l;
        this.n = uVar.m;
        this.o = uVar.n;
        this.p = uVar.p;
        this.q = uVar.o;
        this.r = uVar.q;
        this.s = uVar.r;
        this.t = uVar.s;
        this.u = uVar.t;
        List list = uVar.u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        s sVar = uVar.v;
        this.w = sVar;
        this.x = uVar.w;
        this.y = uVar.x;
        this.z = uVar.y;
        this.A = uVar.z;
        this.B = uVar.A;
        this.C = uVar.B;
        this.D = uVar.C;
        int i13 = uVar.D;
        this.E = i13 == -1 ? 0 : i13;
        float f10 = uVar.E;
        this.F = f10 == -1.0f ? 1.0f : f10;
        this.G = uVar.F;
        this.H = uVar.G;
        this.I = uVar.H;
        this.J = uVar.I;
        this.K = uVar.J;
        this.L = uVar.K;
        this.M = uVar.L;
        int i14 = uVar.M;
        this.N = i14 == -1 ? 0 : i14;
        int i15 = uVar.N;
        this.O = i15 != -1 ? i15 : 0;
        this.P = uVar.O;
        this.Q = uVar.P;
        this.R = uVar.Q;
        this.S = uVar.R;
        int i16 = uVar.S;
        if (i16 != 0 || sVar == null) {
            this.T = i16;
        } else {
            this.T = 1;
        }
    }

    public static String c(v vVar) {
        char c2;
        int i3;
        String str;
        String str2;
        if (vVar == null) {
            return "null";
        }
        int i10 = vVar.e;
        g9.i0 i0Var = vVar.c;
        String str3 = vVar.d;
        int i11 = vVar.L;
        int i12 = vVar.K;
        int i13 = vVar.J;
        float f10 = vVar.D;
        n nVar = vVar.I;
        float f11 = vVar.F;
        int i14 = vVar.C;
        int i15 = vVar.B;
        int i16 = vVar.A;
        int i17 = vVar.z;
        s sVar = vVar.w;
        String str4 = vVar.k;
        int i18 = vVar.j;
        String str5 = vVar.m;
        String str6 = vVar.r;
        int i19 = vVar.f;
        com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e(String.valueOf(','));
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("id=");
        l10.append(vVar.a);
        l10.append(", mimeType=");
        l10.append(vVar.s);
        if (str6 != null) {
            l10.append(", container=");
            l10.append(str6);
        }
        if (str5 != null) {
            l10.append(", primaryGroupId=");
            l10.append(str5);
        }
        if (i18 != -1) {
            l10.append(", bitrate=");
            l10.append(i18);
        }
        if (str4 != null) {
            l10.append(", codecs=");
            l10.append(str4);
        }
        if (sVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i20 = 0; i20 < sVar.d; i20++) {
                UUID uuid = sVar.a[i20].b;
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
            c2 = 0;
            l10.append(", drm=[");
            eVar.a(l10, linkedHashSet.iterator());
            l10.append(']');
        } else {
            c2 = 0;
        }
        if (i17 != -1 && i16 != -1) {
            l10.append(", res=");
            l10.append(i17);
            l10.append("x");
            l10.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            l10.append(", decRes=");
            l10.append(i15);
            l10.append("x");
            l10.append(i14);
        }
        double d = f11;
        int i21 = i9.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            l10.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c2] = Float.valueOf(f11);
            String str7 = g2.n0.a;
            l10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (nVar != null) {
            int i22 = nVar.f;
            int i23 = nVar.e;
            if ((i23 != -1 && i22 != -1) || nVar.d()) {
                l10.append(", color=");
                if (nVar.d()) {
                    String b10 = n.b(nVar.a);
                    String a10 = n.a(nVar.b);
                    String c10 = n.c(nVar.c);
                    String str8 = g2.n0.a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a10 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                l10.append(str2 + "/" + ((i23 == -1 || i22 == -1) ? "NA/NA" : com.google.android.recaptcha.internal.a.i(i23, "/", i22)));
            }
        }
        if (f10 != -1.0f) {
            l10.append(", fps=");
            l10.append(f10);
        }
        if (i13 != -1) {
            l10.append(", maxSubLayers=");
            l10.append(i13);
        }
        if (i12 != -1) {
            l10.append(", channels=");
            l10.append(i12);
        }
        if (i11 != -1) {
            l10.append(", sample_rate=");
            l10.append(i11);
        }
        if (str3 != null) {
            l10.append(", language=");
            l10.append(str3);
        }
        if (!i0Var.isEmpty()) {
            l10.append(", labels=[");
            eVar.a(l10, g9.o.y(i0Var, new a3.j(24)).iterator());
            l10.append("]");
        }
        if (i10 != 0) {
            l10.append(", selectionFlags=[");
            String str9 = g2.n0.a;
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            eVar.a(l10, arrayList.iterator());
            l10.append("]");
        }
        if (i19 != 0) {
            l10.append(", roleFlags=[");
            String str10 = g2.n0.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i19 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i19 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i19 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i19 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i19 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i19 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i19 & 64) != 0) {
                arrayList2.add("caption");
            }
            i3 = i19;
            if ((i3 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i3 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i3 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i3 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i3 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i3 & TLObject.FLAG_12) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i3 & TLObject.FLAG_13) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i3 & TLObject.FLAG_14) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i3 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            eVar.a(l10, arrayList2.iterator());
            l10.append("]");
        } else {
            i3 = i19;
        }
        if ((i3 & 32768) != 0) {
            l10.append(", auxiliaryTrackType=");
            int i24 = vVar.g;
            String str11 = g2.n0.a;
            if (i24 == 0) {
                str = "undefined";
            } else if (i24 == 1) {
                str = "original";
            } else if (i24 == 2) {
                str = "depth-linear";
            } else if (i24 == 3) {
                str = "depth-inverse";
            } else {
                if (i24 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            l10.append(str);
        }
        return l10.toString();
    }

    public final u a() {
        u uVar = new u();
        uVar.a = this.a;
        uVar.b = this.b;
        uVar.c = this.c;
        uVar.d = this.d;
        uVar.e = this.e;
        uVar.f = this.f;
        uVar.h = this.h;
        uVar.i = this.i;
        uVar.j = this.k;
        uVar.k = this.l;
        uVar.l = this.m;
        uVar.q = this.r;
        uVar.r = this.s;
        uVar.s = this.t;
        uVar.t = this.u;
        uVar.u = this.v;
        uVar.v = this.w;
        uVar.w = this.x;
        uVar.x = this.y;
        uVar.y = this.z;
        uVar.z = this.A;
        uVar.A = this.B;
        uVar.B = this.C;
        uVar.C = this.D;
        uVar.D = this.E;
        uVar.E = this.F;
        uVar.F = this.G;
        uVar.G = this.H;
        uVar.H = this.I;
        uVar.I = this.J;
        uVar.J = this.K;
        uVar.K = this.L;
        uVar.L = this.M;
        uVar.M = this.N;
        uVar.N = this.O;
        uVar.O = this.P;
        uVar.P = this.Q;
        uVar.Q = this.R;
        uVar.R = this.S;
        uVar.S = this.T;
        uVar.m = this.n;
        uVar.n = this.o;
        uVar.p = this.p;
        uVar.o = this.q;
        return uVar;
    }

    public final boolean b(v vVar) {
        List list = this.v;
        if (list.size() != vVar.v.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) vVar.v.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final v d(v vVar) {
        String str;
        String str2;
        int i3;
        int i10;
        if (this == vVar) {
            return this;
        }
        int h = u0.h(this.s);
        String str3 = vVar.a;
        s0 s0Var = vVar.l;
        g9.i0 i0Var = vVar.c;
        int i11 = vVar.R;
        int i12 = vVar.S;
        String str4 = vVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = vVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = vVar.h;
        }
        int i14 = this.i;
        if (i14 == -1) {
            i14 = vVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String w10 = g2.n0.w(h, vVar.k);
            if (g2.n0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = vVar.m;
        }
        s0 s0Var2 = this.l;
        if (s0Var2 != null) {
            s0Var = s0Var2.b(s0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = vVar.D;
        }
        int i15 = this.e | vVar.e;
        g9.i0 i0Var2 = i0Var;
        int i16 = vVar.f | this.f;
        s sVar = vVar.w;
        ArrayList arrayList = new ArrayList();
        if (sVar != null) {
            String str7 = sVar.c;
            r[] rVarArr = sVar.a;
            int length = rVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                r rVar = rVarArr[i18];
                int i19 = length;
                if (rVar.e != null) {
                    arrayList.add(rVar);
                }
                i17 = i18 + 1;
                length = i19;
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
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                r rVar2 = rVarArr2[i21];
                int i22 = length2;
                if (rVar2.e != null) {
                    UUID uuid = rVar2.b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= size) {
                            i3 = size;
                            arrayList.add(rVar2);
                            break;
                        }
                        i3 = size;
                        if (((r) arrayList.get(i23)).b.equals(uuid)) {
                            break;
                        }
                        i23++;
                        size = i3;
                    }
                } else {
                    i3 = size;
                    i10 = i11;
                }
                i20 = i21 + 1;
                length2 = i22;
                i11 = i10;
                size = i3;
            }
            str2 = str8;
        }
        int i24 = i11;
        s sVar3 = arrayList.isEmpty() ? null : new s(str2, arrayList);
        u a10 = a();
        a10.a = str3;
        a10.b = str4;
        a10.c = g9.i0.q(i0Var2);
        a10.d = str;
        a10.e = i15;
        a10.f = i16;
        a10.h = i13;
        a10.i = i14;
        a10.j = str5;
        a10.k = s0Var;
        a10.l = str6;
        a10.v = sVar3;
        a10.C = f10;
        a10.Q = i24;
        a10.R = i12;
        return new v(a10);
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = this.U;
        return (i10 == 0 || (i3 = vVar.U) == 0 || i10 == i3) && this.e == vVar.e && this.f == vVar.f && this.g == vVar.g && this.h == vVar.h && this.i == vVar.i && this.t == vVar.t && this.x == vVar.x && this.z == vVar.z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.E == vVar.E && this.H == vVar.H && this.J == vVar.J && this.K == vVar.K && this.L == vVar.L && this.M == vVar.M && this.N == vVar.N && this.O == vVar.O && this.P == vVar.P && this.R == vVar.R && this.S == vVar.S && this.T == vVar.T && Float.compare(this.D, vVar.D) == 0 && Float.compare(this.F, vVar.F) == 0 && Objects.equals(this.a, vVar.a) && Objects.equals(this.b, vVar.b) && this.c.equals(vVar.c) && Objects.equals(this.k, vVar.k) && Objects.equals(this.m, vVar.m) && Objects.equals(this.r, vVar.r) && Objects.equals(this.s, vVar.s) && Objects.equals(this.d, vVar.d) && Arrays.equals(this.G, vVar.G) && Objects.equals(this.l, vVar.l) && Objects.equals(this.I, vVar.I) && Objects.equals(this.w, vVar.w) && b(vVar);
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
            s0 s0Var = this.l;
            int hashCode5 = (hashCode4 + (s0Var == null ? 0 : s0Var.hashCode())) * 961;
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
        return a1.g.o(this.L, "])", sb2);
    }
}
