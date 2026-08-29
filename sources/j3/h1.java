package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h1 implements g {
    public static final String A0;
    public static final String B0;
    public static final d0 C0;
    public static final h1 U = new h1(new g1());
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
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final Integer A;
    public final Boolean B;
    public final Boolean C;
    public final Integer D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final CharSequence K;
    public final CharSequence L;
    public final CharSequence M;
    public final Integer N;
    public final Integer O;
    public final CharSequence P;
    public final CharSequence Q;
    public final CharSequence R;
    public final Integer S;
    public final Bundle T;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence h;
    public final g2 n;
    public final g2 r;
    public final byte[] s;
    public final Integer v;
    public final Uri w;
    public final Integer x;
    public final Integer y;

    static {
        int i10 = f5.d0.a;
        V = Integer.toString(0, 36);
        W = Integer.toString(1, 36);
        X = Integer.toString(2, 36);
        Y = Integer.toString(3, 36);
        Z = Integer.toString(4, 36);
        a0 = Integer.toString(5, 36);
        b0 = Integer.toString(6, 36);
        c0 = Integer.toString(8, 36);
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
        B0 = Integer.toString(MediaDataController.MAX_STYLE_RUNS_COUNT, 36);
        C0 = new d0(7);
    }

    public h1(g1 g1Var) {
        Boolean bool = g1Var.p;
        Integer num = g1Var.o;
        Integer num2 = g1Var.F;
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
        this.a = g1Var.a;
        this.b = g1Var.b;
        this.c = g1Var.c;
        this.d = g1Var.d;
        this.e = g1Var.e;
        this.f = g1Var.f;
        this.h = g1Var.g;
        this.n = g1Var.h;
        this.r = g1Var.i;
        this.s = g1Var.j;
        this.v = g1Var.k;
        this.w = g1Var.l;
        this.x = g1Var.m;
        this.y = g1Var.n;
        this.A = num;
        this.B = bool;
        this.C = g1Var.q;
        Integer num3 = g1Var.r;
        this.D = num3;
        this.E = num3;
        this.F = g1Var.s;
        this.G = g1Var.t;
        this.H = g1Var.u;
        this.I = g1Var.v;
        this.J = g1Var.w;
        this.K = g1Var.x;
        this.L = g1Var.y;
        this.M = g1Var.z;
        this.N = g1Var.A;
        this.O = g1Var.B;
        this.P = g1Var.C;
        this.Q = g1Var.D;
        this.R = g1Var.E;
        this.S = num2;
        this.T = g1Var.G;
    }

    public final g1 a() {
        g1 g1Var = new g1();
        g1Var.a = this.a;
        g1Var.b = this.b;
        g1Var.c = this.c;
        g1Var.d = this.d;
        g1Var.e = this.e;
        g1Var.f = this.f;
        g1Var.g = this.h;
        g1Var.h = this.n;
        g1Var.i = this.r;
        g1Var.j = this.s;
        g1Var.k = this.v;
        g1Var.l = this.w;
        g1Var.m = this.x;
        g1Var.n = this.y;
        g1Var.o = this.A;
        g1Var.p = this.B;
        g1Var.q = this.C;
        g1Var.r = this.E;
        g1Var.s = this.F;
        g1Var.t = this.G;
        g1Var.u = this.H;
        g1Var.v = this.I;
        g1Var.w = this.J;
        g1Var.x = this.K;
        g1Var.y = this.L;
        g1Var.z = this.M;
        g1Var.A = this.N;
        g1Var.B = this.O;
        g1Var.C = this.P;
        g1Var.D = this.Q;
        g1Var.E = this.R;
        g1Var.F = this.S;
        g1Var.G = this.T;
        return g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (f5.d0.a(this.a, h1Var.a) && f5.d0.a(this.b, h1Var.b) && f5.d0.a(this.c, h1Var.c) && f5.d0.a(this.d, h1Var.d) && f5.d0.a(this.e, h1Var.e) && f5.d0.a(this.f, h1Var.f) && f5.d0.a(this.h, h1Var.h) && f5.d0.a(this.n, h1Var.n) && f5.d0.a(this.r, h1Var.r) && Arrays.equals(this.s, h1Var.s) && f5.d0.a(this.v, h1Var.v) && f5.d0.a(this.w, h1Var.w) && f5.d0.a(this.x, h1Var.x) && f5.d0.a(this.y, h1Var.y) && f5.d0.a(this.A, h1Var.A) && f5.d0.a(this.B, h1Var.B) && f5.d0.a(this.C, h1Var.C) && f5.d0.a(this.E, h1Var.E) && f5.d0.a(this.F, h1Var.F) && f5.d0.a(this.G, h1Var.G) && f5.d0.a(this.H, h1Var.H) && f5.d0.a(this.I, h1Var.I) && f5.d0.a(this.J, h1Var.J) && f5.d0.a(this.K, h1Var.K) && f5.d0.a(this.L, h1Var.L) && f5.d0.a(this.M, h1Var.M) && f5.d0.a(this.N, h1Var.N) && f5.d0.a(this.O, h1Var.O) && f5.d0.a(this.P, h1Var.P) && f5.d0.a(this.Q, h1Var.Q) && f5.d0.a(this.R, h1Var.R) && f5.d0.a(this.S, h1Var.S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, Integer.valueOf(Arrays.hashCode(this.s)), this.v, this.w, this.x, this.y, this.A, this.B, this.C, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S});
    }
}
