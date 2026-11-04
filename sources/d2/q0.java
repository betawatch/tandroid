package d2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q0 {
    public static final q0 L = new q0(new p0());
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
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
    public final CharSequence A;
    public final CharSequence B;
    public final CharSequence C;
    public final Integer D;
    public final Integer E;
    public final CharSequence F;
    public final CharSequence G;
    public final CharSequence H;
    public final Integer I;
    public final Bundle J;
    public final g9.i0 K;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final f1 i;
    public final f1 j;
    public final byte[] k;
    public l l;
    public final Integer m;
    public final Uri n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Boolean r;
    public final Boolean s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final Integer z;

    static {
        String str = g2.n0.a;
        M = Integer.toString(0, 36);
        N = Integer.toString(1, 36);
        O = Integer.toString(2, 36);
        P = Integer.toString(3, 36);
        Q = Integer.toString(4, 36);
        R = Integer.toString(5, 36);
        S = Integer.toString(6, 36);
        T = Integer.toString(8, 36);
        U = Integer.toString(9, 36);
        V = Integer.toString(10, 36);
        W = Integer.toString(11, 36);
        X = Integer.toString(12, 36);
        Y = Integer.toString(13, 36);
        Z = Integer.toString(14, 36);
        a0 = Integer.toString(15, 36);
        b0 = Integer.toString(16, 36);
        c0 = Integer.toString(17, 36);
        d0 = Integer.toString(18, 36);
        e0 = Integer.toString(19, 36);
        f0 = Integer.toString(20, 36);
        g0 = Integer.toString(21, 36);
        h0 = Integer.toString(22, 36);
        i0 = Integer.toString(23, 36);
        j0 = Integer.toString(24, 36);
        k0 = Integer.toString(25, 36);
        l0 = Integer.toString(26, 36);
        m0 = Integer.toString(27, 36);
        n0 = Integer.toString(28, 36);
        o0 = Integer.toString(29, 36);
        p0 = Integer.toString(30, 36);
        q0 = Integer.toString(31, 36);
        r0 = Integer.toString(32, 36);
        s0 = Integer.toString(33, 36);
        t0 = Integer.toString(34, 36);
        u0 = Integer.toString(1000, 36);
    }

    public q0(p0 p0Var) {
        Boolean bool = p0Var.r;
        Integer num = p0Var.q;
        Integer num2 = p0Var.H;
        int i3 = 1;
        int i10 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case hs.U /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case hs.T /* 30 */:
                        default:
                            i3 = 0;
                            break;
                        case 21:
                            i3 = 2;
                            break;
                        case 22:
                            i3 = 3;
                            break;
                        case 23:
                            i3 = 4;
                            break;
                        case 24:
                            i3 = 5;
                            break;
                        case 25:
                            i3 = 6;
                            break;
                    }
                    i10 = i3;
                }
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num2 = Integer.valueOf(i10);
            }
        }
        this.a = p0Var.a;
        this.b = p0Var.b;
        this.c = p0Var.c;
        this.d = p0Var.d;
        this.e = p0Var.e;
        this.f = p0Var.f;
        this.g = p0Var.g;
        this.h = p0Var.h;
        this.i = p0Var.i;
        this.j = p0Var.j;
        this.k = p0Var.k;
        this.l = p0Var.l;
        this.m = p0Var.m;
        this.n = p0Var.n;
        this.o = p0Var.o;
        this.p = p0Var.p;
        this.q = num;
        this.r = bool;
        this.s = p0Var.s;
        Integer num3 = p0Var.t;
        this.t = num3;
        this.u = num3;
        this.v = p0Var.u;
        this.w = p0Var.v;
        this.x = p0Var.w;
        this.y = p0Var.x;
        this.z = p0Var.y;
        this.A = p0Var.z;
        this.B = p0Var.A;
        this.C = p0Var.B;
        this.D = p0Var.C;
        this.E = p0Var.D;
        this.F = p0Var.E;
        this.G = p0Var.F;
        this.H = p0Var.G;
        this.I = num2;
        this.K = p0Var.J;
        this.J = p0Var.I;
    }

    public static q0 b(int i3, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        p0 p0Var = new p0();
        p0Var.a = bundle.getCharSequence(M);
        p0Var.b = bundle.getCharSequence(N);
        p0Var.c = bundle.getCharSequence(O);
        p0Var.d = bundle.getCharSequence(P);
        p0Var.e = bundle.getCharSequence(Q);
        p0Var.f = bundle.getCharSequence(R);
        p0Var.g = bundle.getCharSequence(S);
        p0Var.n = (Uri) bundle.getParcelable(W);
        p0Var.z = bundle.getCharSequence(h0);
        p0Var.A = bundle.getCharSequence(i0);
        p0Var.B = bundle.getCharSequence(j0);
        p0Var.E = bundle.getCharSequence(m0);
        p0Var.F = bundle.getCharSequence(n0);
        p0Var.G = bundle.getCharSequence(p0);
        p0Var.I = g2.n0.o(bundle.getBundle(u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = o0;
            byte[] bArr = null;
            Integer valueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
            if (i3 >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(l.e);
                    if (binder != null) {
                        if (binder instanceof i) {
                            bArr = ((i) binder).a.a;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = j.b(bundle4)) == null) {
                            bArr = k.a(bundle4);
                        }
                    }
                    p0Var.b(bArr, valueOf);
                }
            } else {
                p0Var.b(bundle.getByteArray(str), valueOf);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            p0Var.i = f1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            p0Var.j = f1.a(bundle2);
        }
        String str5 = s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf2 = Long.valueOf(j10);
            zb.f(j10 >= 0);
            p0Var.h = valueOf2;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            p0Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            p0Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            p0Var.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = r0;
        if (bundle.containsKey(str9)) {
            p0Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            p0Var.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            p0Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            p0Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            p0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            p0Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            p0Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = g0;
        if (bundle.containsKey(str16)) {
            p0Var.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            p0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = l0;
        if (bundle.containsKey(str18)) {
            p0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = q0;
        if (bundle.containsKey(str19)) {
            p0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(t0);
        if (stringArrayList != null) {
            p0Var.J = g9.i0.q(stringArrayList);
        }
        return new q0(p0Var);
    }

    public final p0 a() {
        p0 p0Var = new p0();
        p0Var.a = this.a;
        p0Var.b = this.b;
        p0Var.c = this.c;
        p0Var.d = this.d;
        p0Var.e = this.e;
        p0Var.f = this.f;
        p0Var.g = this.g;
        p0Var.h = this.h;
        p0Var.i = this.i;
        p0Var.j = this.j;
        p0Var.k = this.k;
        p0Var.l = this.l;
        p0Var.m = this.m;
        p0Var.n = this.n;
        p0Var.o = this.o;
        p0Var.p = this.p;
        p0Var.q = this.q;
        p0Var.r = this.r;
        p0Var.s = this.s;
        p0Var.t = this.u;
        p0Var.u = this.v;
        p0Var.v = this.w;
        p0Var.w = this.x;
        p0Var.x = this.y;
        p0Var.y = this.z;
        p0Var.z = this.A;
        p0Var.A = this.B;
        p0Var.B = this.C;
        p0Var.C = this.D;
        p0Var.D = this.E;
        p0Var.E = this.F;
        p0Var.F = this.G;
        p0Var.G = this.H;
        p0Var.H = this.I;
        p0Var.J = this.K;
        p0Var.I = this.J;
        return p0Var;
    }

    public final Bundle c(int i3) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(M, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(N, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(O, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(P, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(Q, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(R, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(S, charSequence7);
        }
        Long l10 = this.h;
        if (l10 != null) {
            bundle.putLong(s0, l10.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            String str = V;
            if (i3 >= 9) {
                if (this.l == null) {
                    this.l = new l(bArr);
                }
                l lVar = this.l;
                byte[] bArr2 = lVar.a;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(l.e, lVar.b);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (lVar.c == null) {
                        lVar.c = j.a(bArr2);
                    }
                    j jVar = lVar.c;
                    if (jVar != null) {
                        bundle2.putParcelable(l.f, jVar.a);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (lVar.d == null) {
                    lVar.d = new k(bArr2);
                }
                k kVar = lVar.d;
                int i10 = k.b;
                kVar.getClass();
                bundle2.putBinder(l.g, kVar.a);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.n;
        if (uri != null) {
            bundle.putParcelable(W, uri);
        }
        CharSequence charSequence8 = this.A;
        if (charSequence8 != null) {
            bundle.putCharSequence(h0, charSequence8);
        }
        CharSequence charSequence9 = this.B;
        if (charSequence9 != null) {
            bundle.putCharSequence(i0, charSequence9);
        }
        CharSequence charSequence10 = this.C;
        if (charSequence10 != null) {
            bundle.putCharSequence(j0, charSequence10);
        }
        CharSequence charSequence11 = this.F;
        if (charSequence11 != null) {
            bundle.putCharSequence(m0, charSequence11);
        }
        CharSequence charSequence12 = this.G;
        if (charSequence12 != null) {
            bundle.putCharSequence(n0, charSequence12);
        }
        CharSequence charSequence13 = this.H;
        if (charSequence13 != null) {
            bundle.putCharSequence(p0, charSequence13);
        }
        f1 f1Var = this.i;
        if (f1Var != null) {
            bundle.putBundle(T, f1Var.c());
        }
        f1 f1Var2 = this.j;
        if (f1Var2 != null) {
            bundle.putBundle(U, f1Var2.c());
        }
        Integer num = this.o;
        if (num != null) {
            bundle.putInt(X, num.intValue());
        }
        Integer num2 = this.p;
        if (num2 != null) {
            bundle.putInt(Y, num2.intValue());
        }
        Integer num3 = this.q;
        if (num3 != null) {
            bundle.putInt(Z, num3.intValue());
        }
        Boolean bool = this.r;
        if (bool != null) {
            bundle.putBoolean(r0, bool.booleanValue());
        }
        Boolean bool2 = this.s;
        if (bool2 != null) {
            bundle.putBoolean(a0, bool2.booleanValue());
        }
        Integer num4 = this.u;
        if (num4 != null) {
            bundle.putInt(b0, num4.intValue());
        }
        Integer num5 = this.v;
        if (num5 != null) {
            bundle.putInt(c0, num5.intValue());
        }
        Integer num6 = this.w;
        if (num6 != null) {
            bundle.putInt(d0, num6.intValue());
        }
        Integer num7 = this.x;
        if (num7 != null) {
            bundle.putInt(e0, num7.intValue());
        }
        Integer num8 = this.y;
        if (num8 != null) {
            bundle.putInt(f0, num8.intValue());
        }
        Integer num9 = this.z;
        if (num9 != null) {
            bundle.putInt(g0, num9.intValue());
        }
        Integer num10 = this.D;
        if (num10 != null) {
            bundle.putInt(k0, num10.intValue());
        }
        Integer num11 = this.E;
        if (num11 != null) {
            bundle.putInt(l0, num11.intValue());
        }
        Integer num12 = this.m;
        if (num12 != null) {
            bundle.putInt(o0, num12.intValue());
        }
        Integer num13 = this.I;
        if (num13 != null) {
            bundle.putInt(q0, num13.intValue());
        }
        g9.i0 i0Var = this.K;
        if (!i0Var.isEmpty()) {
            bundle.putStringArrayList(t0, new ArrayList<>(i0Var));
        }
        Bundle bundle3 = this.J;
        if (bundle3 != null) {
            bundle.putBundle(u0, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (TextUtils.equals(this.a, q0Var.a) && TextUtils.equals(this.b, q0Var.b) && TextUtils.equals(this.c, q0Var.c) && TextUtils.equals(this.d, q0Var.d) && TextUtils.equals(this.e, q0Var.e) && TextUtils.equals(this.f, q0Var.f) && TextUtils.equals(this.g, q0Var.g) && Objects.equals(this.h, q0Var.h) && Objects.equals(this.i, q0Var.i) && Objects.equals(this.j, q0Var.j) && Arrays.equals(this.k, q0Var.k) && Objects.equals(this.m, q0Var.m) && Objects.equals(this.n, q0Var.n) && Objects.equals(this.o, q0Var.o) && Objects.equals(this.p, q0Var.p) && Objects.equals(this.q, q0Var.q) && Objects.equals(this.r, q0Var.r) && Objects.equals(this.s, q0Var.s) && Objects.equals(this.u, q0Var.u) && Objects.equals(this.v, q0Var.v) && Objects.equals(this.w, q0Var.w) && Objects.equals(this.x, q0Var.x) && Objects.equals(this.y, q0Var.y) && Objects.equals(this.z, q0Var.z) && TextUtils.equals(this.A, q0Var.A) && TextUtils.equals(this.B, q0Var.B) && TextUtils.equals(this.C, q0Var.C) && Objects.equals(this.D, q0Var.D) && Objects.equals(this.E, q0Var.E) && TextUtils.equals(this.F, q0Var.F) && TextUtils.equals(this.G, q0Var.G) && TextUtils.equals(this.H, q0Var.H) && Objects.equals(this.I, q0Var.I) && Objects.equals(this.K, q0Var.K)) {
                if ((this.J == null) == (q0Var.J == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, Boolean.valueOf(this.J == null), this.K);
    }
}
