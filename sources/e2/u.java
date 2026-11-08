package e2;

import a8.ia;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final u V = new u(new t());
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
    public final m I;
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
    public final h9.i0 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final q0 l;
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
    public final r w;
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

    public u(t tVar) {
        boolean z9;
        String str;
        this.a = tVar.a;
        String T = h2.m0.T(tVar.d);
        this.d = T;
        if (tVar.c.isEmpty() && tVar.b != null) {
            this.c = h9.i0.u(new x(T, tVar.b));
            this.b = tVar.b;
        } else if (tVar.c.isEmpty() || tVar.b != null) {
            if (!tVar.c.isEmpty() || tVar.b != null) {
                for (int i7 = 0; i7 < tVar.c.size(); i7++) {
                    if (!((x) tVar.c.get(i7)).b.equals(tVar.b)) {
                    }
                }
                z9 = false;
                ia.p(z9);
                this.c = tVar.c;
                this.b = tVar.b;
            }
            z9 = true;
            ia.p(z9);
            this.c = tVar.c;
            this.b = tVar.b;
        } else {
            h9.i0 i0Var = tVar.c;
            this.c = i0Var;
            int size = i0Var.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    str = ((x) i0Var.get(0)).b;
                    break;
                }
                Object obj = i0Var.get(i10);
                i10++;
                x xVar = (x) obj;
                if (TextUtils.equals(xVar.a, T)) {
                    str = xVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = tVar.e;
        ia.o("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", tVar.g == 0 || (tVar.f & 32768) != 0);
        this.f = tVar.f;
        this.g = tVar.g;
        int i11 = tVar.h;
        this.h = i11;
        int i12 = tVar.i;
        this.i = i12;
        this.j = i12 != -1 ? i12 : i11;
        this.k = tVar.j;
        this.l = tVar.k;
        this.m = tVar.l;
        this.n = tVar.m;
        this.o = tVar.n;
        this.p = tVar.p;
        this.q = tVar.o;
        this.r = tVar.q;
        this.s = tVar.r;
        this.t = tVar.s;
        this.u = tVar.t;
        List list = tVar.u;
        this.v = list == null ? Collections.EMPTY_LIST : list;
        r rVar = tVar.v;
        this.w = rVar;
        this.x = tVar.w;
        this.y = tVar.x;
        this.z = tVar.y;
        this.A = tVar.z;
        this.B = tVar.A;
        this.C = tVar.B;
        this.D = tVar.C;
        int i13 = tVar.D;
        this.E = i13 == -1 ? 0 : i13;
        float f10 = tVar.E;
        this.F = f10 == -1.0f ? 1.0f : f10;
        this.G = tVar.F;
        this.H = tVar.G;
        this.I = tVar.H;
        this.J = tVar.I;
        this.K = tVar.J;
        this.L = tVar.K;
        this.M = tVar.L;
        int i14 = tVar.M;
        this.N = i14 == -1 ? 0 : i14;
        int i15 = tVar.N;
        this.O = i15 != -1 ? i15 : 0;
        this.P = tVar.O;
        this.Q = tVar.P;
        this.R = tVar.Q;
        this.S = tVar.R;
        int i16 = tVar.S;
        if (i16 != 0 || rVar == null) {
            this.T = i16;
        } else {
            this.T = 1;
        }
    }

    public static String c(u uVar) {
        int i7;
        String str;
        String str2;
        if (uVar == null) {
            return "null";
        }
        int i10 = uVar.e;
        h9.i0 i0Var = uVar.c;
        String str3 = uVar.d;
        int i11 = uVar.L;
        int i12 = uVar.K;
        int i13 = uVar.J;
        float f10 = uVar.D;
        m mVar = uVar.I;
        float f11 = uVar.F;
        int i14 = uVar.C;
        int i15 = uVar.B;
        int i16 = uVar.A;
        int i17 = uVar.z;
        r rVar = uVar.w;
        String str4 = uVar.k;
        int i18 = uVar.j;
        String str5 = uVar.m;
        String str6 = uVar.r;
        int i19 = uVar.f;
        g9.l lVar = new g9.l(String.valueOf(','), 0);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("id=");
        m10.append(uVar.a);
        m10.append(", mimeType=");
        m10.append(uVar.s);
        if (str6 != null) {
            m10.append(", container=");
            m10.append(str6);
        }
        if (str5 != null) {
            m10.append(", primaryGroupId=");
            m10.append(str5);
        }
        if (i18 != -1) {
            m10.append(", bitrate=");
            m10.append(i18);
        }
        if (str4 != null) {
            m10.append(", codecs=");
            m10.append(str4);
        }
        if (rVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i20 = 0; i20 < rVar.d; i20++) {
                UUID uuid = rVar.a[i20].b;
                if (uuid.equals(l.c)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(l.d)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.f)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.e)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.b)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            m10.append(", drm=[");
            lVar.a(m10, linkedHashSet.iterator());
            m10.append(']');
        }
        if (i17 != -1 && i16 != -1) {
            m10.append(", res=");
            m10.append(i17);
            m10.append("x");
            m10.append(i16);
        }
        if (i15 != -1 && i14 != -1) {
            m10.append(", decRes=");
            m10.append(i15);
            m10.append("x");
            m10.append(i14);
        }
        double d = f11;
        int i21 = j9.c.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            m10.append(", par=");
            Object[] objArr = {Float.valueOf(f11)};
            String str7 = h2.m0.a;
            m10.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (mVar != null) {
            int i22 = mVar.f;
            int i23 = mVar.e;
            if ((i23 != -1 && i22 != -1) || mVar.d()) {
                m10.append(", color=");
                if (mVar.d()) {
                    String b10 = m.b(mVar.a);
                    String a10 = m.a(mVar.b);
                    String c10 = m.c(mVar.c);
                    String str8 = h2.m0.a;
                    Locale locale = Locale.US;
                    str2 = b10 + "/" + a10 + "/" + c10;
                } else {
                    str2 = "NA/NA/NA";
                }
                m10.append(str2 + "/" + ((i23 == -1 || i22 == -1) ? "NA/NA" : com.google.android.recaptcha.internal.a.j(i23, "/", i22)));
            }
        }
        if (f10 != -1.0f) {
            m10.append(", fps=");
            m10.append(f10);
        }
        if (i13 != -1) {
            m10.append(", maxSubLayers=");
            m10.append(i13);
        }
        if (i12 != -1) {
            m10.append(", channels=");
            m10.append(i12);
        }
        if (i11 != -1) {
            m10.append(", sample_rate=");
            m10.append(i11);
        }
        if (str3 != null) {
            m10.append(", language=");
            m10.append(str3);
        }
        boolean isEmpty = i0Var.isEmpty();
        int i24 = 4;
        if (!isEmpty) {
            m10.append(", labels=[");
            lVar.a(m10, h9.o.y(i0Var, new di.a1(i24)).iterator());
            m10.append("]");
        }
        if (i10 != 0) {
            m10.append(", selectionFlags=[");
            String str9 = h2.m0.a;
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
            lVar.a(m10, arrayList.iterator());
            m10.append("]");
        }
        if (i19 != 0) {
            m10.append(", roleFlags=[");
            String str10 = h2.m0.a;
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
            i7 = i19;
            if ((i7 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i7 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i7 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i7 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i7 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i7 & TLObject.FLAG_12) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i7 & TLObject.FLAG_13) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i7 & TLObject.FLAG_14) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i7 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            lVar.a(m10, arrayList2.iterator());
            m10.append("]");
        } else {
            i7 = i19;
        }
        if ((i7 & 32768) != 0) {
            m10.append(", auxiliaryTrackType=");
            int i25 = uVar.g;
            String str11 = h2.m0.a;
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
            m10.append(str);
        }
        return m10.toString();
    }

    public final t a() {
        t tVar = new t();
        tVar.a = this.a;
        tVar.b = this.b;
        tVar.c = this.c;
        tVar.d = this.d;
        tVar.e = this.e;
        tVar.f = this.f;
        tVar.h = this.h;
        tVar.i = this.i;
        tVar.j = this.k;
        tVar.k = this.l;
        tVar.l = this.m;
        tVar.q = this.r;
        tVar.r = this.s;
        tVar.s = this.t;
        tVar.t = this.u;
        tVar.u = this.v;
        tVar.v = this.w;
        tVar.w = this.x;
        tVar.x = this.y;
        tVar.y = this.z;
        tVar.z = this.A;
        tVar.A = this.B;
        tVar.B = this.C;
        tVar.C = this.D;
        tVar.D = this.E;
        tVar.E = this.F;
        tVar.F = this.G;
        tVar.G = this.H;
        tVar.H = this.I;
        tVar.I = this.J;
        tVar.J = this.K;
        tVar.K = this.L;
        tVar.L = this.M;
        tVar.M = this.N;
        tVar.N = this.O;
        tVar.O = this.P;
        tVar.P = this.Q;
        tVar.Q = this.R;
        tVar.R = this.S;
        tVar.S = this.T;
        tVar.m = this.n;
        tVar.n = this.o;
        tVar.p = this.p;
        tVar.o = this.q;
        return tVar;
    }

    public final boolean b(u uVar) {
        List list = this.v;
        if (list.size() != uVar.v.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) uVar.v.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final u d(u uVar) {
        String str;
        String str2;
        int i7;
        int i10;
        if (this == uVar) {
            return this;
        }
        int h = s0.h(this.s);
        String str3 = uVar.a;
        q0 q0Var = uVar.l;
        h9.i0 i0Var = uVar.c;
        int i11 = uVar.R;
        int i12 = uVar.S;
        String str4 = uVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (i0Var.isEmpty()) {
            i0Var = this.c;
        }
        if ((h != 3 && h != 1) || (str = uVar.d) == null) {
            str = this.d;
        }
        int i13 = this.h;
        if (i13 == -1) {
            i13 = uVar.h;
        }
        int i14 = this.i;
        if (i14 == -1) {
            i14 = uVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String w10 = h2.m0.w(h, uVar.k);
            if (h2.m0.d0(w10).length == 1) {
                str5 = w10;
            }
        }
        String str6 = this.m;
        if (str6 == null) {
            str6 = uVar.m;
        }
        q0 q0Var2 = this.l;
        if (q0Var2 != null) {
            q0Var = q0Var2.b(q0Var);
        }
        float f10 = this.D;
        if (f10 == -1.0f && h == 2) {
            f10 = uVar.D;
        }
        int i15 = this.e | uVar.e;
        h9.i0 i0Var2 = i0Var;
        int i16 = uVar.f | this.f;
        r rVar = uVar.w;
        ArrayList arrayList = new ArrayList();
        if (rVar != null) {
            String str7 = rVar.c;
            q[] qVarArr = rVar.a;
            int length = qVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                q qVar = qVarArr[i18];
                int i19 = length;
                if (qVar.e != null) {
                    arrayList.add(qVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        r rVar2 = this.w;
        if (rVar2 != null) {
            if (str2 == null) {
                str2 = rVar2.c;
            }
            int size = arrayList.size();
            q[] qVarArr2 = rVar2.a;
            String str8 = str2;
            int length2 = qVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                q qVar2 = qVarArr2[i21];
                int i22 = length2;
                if (qVar2.e != null) {
                    UUID uuid = qVar2.b;
                    i10 = i11;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= size) {
                            i7 = size;
                            arrayList.add(qVar2);
                            break;
                        }
                        i7 = size;
                        if (((q) arrayList.get(i23)).b.equals(uuid)) {
                            break;
                        }
                        i23++;
                        size = i7;
                    }
                } else {
                    i7 = size;
                    i10 = i11;
                }
                i20 = i21 + 1;
                length2 = i22;
                i11 = i10;
                size = i7;
            }
            str2 = str8;
        }
        int i24 = i11;
        r rVar3 = arrayList.isEmpty() ? null : new r(str2, arrayList);
        t a10 = a();
        a10.a = str3;
        a10.b = str4;
        a10.c = h9.i0.q(i0Var2);
        a10.d = str;
        a10.e = i15;
        a10.f = i16;
        a10.h = i13;
        a10.i = i14;
        a10.j = str5;
        a10.k = q0Var;
        a10.l = str6;
        a10.v = rVar3;
        a10.C = f10;
        a10.Q = i24;
        a10.R = i12;
        return new u(a10);
    }

    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        int i10 = this.U;
        return (i10 == 0 || (i7 = uVar.U) == 0 || i10 == i7) && this.e == uVar.e && this.f == uVar.f && this.g == uVar.g && this.h == uVar.h && this.i == uVar.i && this.t == uVar.t && this.x == uVar.x && this.z == uVar.z && this.A == uVar.A && this.B == uVar.B && this.C == uVar.C && this.E == uVar.E && this.H == uVar.H && this.J == uVar.J && this.K == uVar.K && this.L == uVar.L && this.M == uVar.M && this.N == uVar.N && this.O == uVar.O && this.P == uVar.P && this.R == uVar.R && this.S == uVar.S && this.T == uVar.T && Float.compare(this.D, uVar.D) == 0 && Float.compare(this.F, uVar.F) == 0 && Objects.equals(this.a, uVar.a) && Objects.equals(this.b, uVar.b) && this.c.equals(uVar.c) && Objects.equals(this.k, uVar.k) && Objects.equals(this.m, uVar.m) && Objects.equals(this.r, uVar.r) && Objects.equals(this.s, uVar.s) && Objects.equals(this.d, uVar.d) && Arrays.equals(this.G, uVar.G) && Objects.equals(this.l, uVar.l) && Objects.equals(this.I, uVar.I) && Objects.equals(this.w, uVar.w) && b(uVar);
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
            q0 q0Var = this.l;
            int hashCode5 = (hashCode4 + (q0Var == null ? 0 : q0Var.hashCode())) * 961;
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
        return a8.p0.n(this.L, "])", sb2);
    }
}
