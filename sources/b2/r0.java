package b2;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class r0 {
    public static final r0 L = new r0(new q0());
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
    public final e9.n0 K;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final g1 i;
    public final g1 j;
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
        String str = e2.m0.a;
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
        u0 = Integer.toString(MediaDataController.MAX_STYLE_RUNS_COUNT, 36);
    }

    public r0(q0 q0Var) {
        Boolean bool = q0Var.r;
        Integer num = q0Var.q;
        Integer num2 = q0Var.H;
        int i10 = 1;
        int i11 = 0;
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
                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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
                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                    i11 = i10;
                }
                num = Integer.valueOf(i11);
            }
        } else if (num != null) {
            boolean z10 = num.intValue() != -1;
            bool = Boolean.valueOf(z10);
            if (z10 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                num2 = Integer.valueOf(i11);
            }
        }
        this.a = q0Var.a;
        this.b = q0Var.b;
        this.c = q0Var.c;
        this.d = q0Var.d;
        this.e = q0Var.e;
        this.f = q0Var.f;
        this.g = q0Var.g;
        this.h = q0Var.h;
        this.i = q0Var.i;
        this.j = q0Var.j;
        this.k = q0Var.k;
        this.l = q0Var.l;
        this.m = q0Var.m;
        this.n = q0Var.n;
        this.o = q0Var.o;
        this.p = q0Var.p;
        this.q = num;
        this.r = bool;
        this.s = q0Var.s;
        Integer num3 = q0Var.t;
        this.t = num3;
        this.u = num3;
        this.v = q0Var.u;
        this.w = q0Var.v;
        this.x = q0Var.w;
        this.y = q0Var.x;
        this.z = q0Var.y;
        this.A = q0Var.z;
        this.B = q0Var.A;
        this.C = q0Var.B;
        this.D = q0Var.C;
        this.E = q0Var.D;
        this.F = q0Var.E;
        this.G = q0Var.F;
        this.H = q0Var.G;
        this.I = num2;
        this.K = q0Var.J;
        this.J = q0Var.I;
    }

    public static r0 b(int i10, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        q0 q0Var = new q0();
        q0Var.a = bundle.getCharSequence(M);
        q0Var.b = bundle.getCharSequence(N);
        q0Var.c = bundle.getCharSequence(O);
        q0Var.d = bundle.getCharSequence(P);
        q0Var.e = bundle.getCharSequence(Q);
        q0Var.f = bundle.getCharSequence(R);
        q0Var.g = bundle.getCharSequence(S);
        q0Var.n = (Uri) bundle.getParcelable(W);
        q0Var.z = bundle.getCharSequence(h0);
        q0Var.A = bundle.getCharSequence(i0);
        q0Var.B = bundle.getCharSequence(j0);
        q0Var.E = bundle.getCharSequence(m0);
        q0Var.F = bundle.getCharSequence(n0);
        q0Var.G = bundle.getCharSequence(p0);
        q0Var.I = e2.m0.o(bundle.getBundle(u0));
        String str = V;
        if (bundle.containsKey(str)) {
            String str2 = o0;
            byte[] bArr = null;
            Integer valueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
            if (i10 >= 9) {
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
                    q0Var.b(bArr, valueOf);
                }
            } else {
                q0Var.b(bundle.getByteArray(str), valueOf);
            }
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            q0Var.i = g1.a(bundle3);
        }
        String str4 = U;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            q0Var.j = g1.a(bundle2);
        }
        String str5 = s0;
        if (bundle.containsKey(str5)) {
            long j10 = bundle.getLong(str5);
            Long valueOf2 = Long.valueOf(j10);
            u6.g(j10 >= 0);
            q0Var.h = valueOf2;
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            q0Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            q0Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = Z;
        if (bundle.containsKey(str8)) {
            q0Var.q = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = r0;
        if (bundle.containsKey(str9)) {
            q0Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            q0Var.s = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            q0Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            q0Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            q0Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            q0Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            q0Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = g0;
        if (bundle.containsKey(str16)) {
            q0Var.y = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            q0Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = l0;
        if (bundle.containsKey(str18)) {
            q0Var.D = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = q0;
        if (bundle.containsKey(str19)) {
            q0Var.H = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(t0);
        if (stringArrayList != null) {
            q0Var.J = e9.n0.u(stringArrayList);
        }
        return new r0(q0Var);
    }

    public final q0 a() {
        q0 q0Var = new q0();
        q0Var.a = this.a;
        q0Var.b = this.b;
        q0Var.c = this.c;
        q0Var.d = this.d;
        q0Var.e = this.e;
        q0Var.f = this.f;
        q0Var.g = this.g;
        q0Var.h = this.h;
        q0Var.i = this.i;
        q0Var.j = this.j;
        q0Var.k = this.k;
        q0Var.l = this.l;
        q0Var.m = this.m;
        q0Var.n = this.n;
        q0Var.o = this.o;
        q0Var.p = this.p;
        q0Var.q = this.q;
        q0Var.r = this.r;
        q0Var.s = this.s;
        q0Var.t = this.u;
        q0Var.u = this.v;
        q0Var.v = this.w;
        q0Var.w = this.x;
        q0Var.x = this.y;
        q0Var.y = this.z;
        q0Var.z = this.A;
        q0Var.A = this.B;
        q0Var.B = this.C;
        q0Var.C = this.D;
        q0Var.D = this.E;
        q0Var.E = this.F;
        q0Var.F = this.G;
        q0Var.G = this.H;
        q0Var.H = this.I;
        q0Var.J = this.K;
        q0Var.I = this.J;
        return q0Var;
    }

    public final Bundle c(int i10) {
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
        Long l4 = this.h;
        if (l4 != null) {
            bundle.putLong(s0, l4.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            String str = V;
            if (i10 >= 9) {
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
                int i11 = k.b;
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
        g1 g1Var = this.i;
        if (g1Var != null) {
            bundle.putBundle(T, g1Var.c());
        }
        g1 g1Var2 = this.j;
        if (g1Var2 != null) {
            bundle.putBundle(U, g1Var2.c());
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
        e9.n0 n0Var = this.K;
        if (!n0Var.isEmpty()) {
            bundle.putStringArrayList(t0, new ArrayList<>(n0Var));
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
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (TextUtils.equals(this.a, r0Var.a) && TextUtils.equals(this.b, r0Var.b) && TextUtils.equals(this.c, r0Var.c) && TextUtils.equals(this.d, r0Var.d) && TextUtils.equals(this.e, r0Var.e) && TextUtils.equals(this.f, r0Var.f) && TextUtils.equals(this.g, r0Var.g) && Objects.equals(this.h, r0Var.h) && Objects.equals(this.i, r0Var.i) && Objects.equals(this.j, r0Var.j) && Arrays.equals(this.k, r0Var.k) && Objects.equals(this.m, r0Var.m) && Objects.equals(this.n, r0Var.n) && Objects.equals(this.o, r0Var.o) && Objects.equals(this.p, r0Var.p) && Objects.equals(this.q, r0Var.q) && Objects.equals(this.r, r0Var.r) && Objects.equals(this.s, r0Var.s) && Objects.equals(this.u, r0Var.u) && Objects.equals(this.v, r0Var.v) && Objects.equals(this.w, r0Var.w) && Objects.equals(this.x, r0Var.x) && Objects.equals(this.y, r0Var.y) && Objects.equals(this.z, r0Var.z) && TextUtils.equals(this.A, r0Var.A) && TextUtils.equals(this.B, r0Var.B) && TextUtils.equals(this.C, r0Var.C) && Objects.equals(this.D, r0Var.D) && Objects.equals(this.E, r0Var.E) && TextUtils.equals(this.F, r0Var.F) && TextUtils.equals(this.G, r0Var.G) && TextUtils.equals(this.H, r0Var.H) && Objects.equals(this.I, r0Var.I) && Objects.equals(this.K, r0Var.K)) {
                if ((this.J == null) == (r0Var.J == null)) {
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
