package j3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e1 implements g {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final q0 D0;
    public static final e1 V = new e1(new d1());
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
    public final Integer B;
    public final Boolean C;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public final Integer G;
    public final Integer H;
    public final Integer I;
    public final Integer J;
    public final Integer K;
    public final CharSequence L;
    public final CharSequence M;
    public final CharSequence N;
    public final Integer O;
    public final Integer P;
    public final CharSequence Q;
    public final CharSequence R;
    public final CharSequence S;
    public final Integer T;
    public final Bundle U;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence h;
    public final f2 n;
    public final f2 r;
    public final byte[] s;
    public final Integer v;
    public final Uri w;
    public final Integer x;
    public final Integer y;

    static {
        int i10 = h5.d0.a;
        W = Integer.toString(0, 36);
        X = Integer.toString(1, 36);
        Y = Integer.toString(2, 36);
        Z = Integer.toString(3, 36);
        a0 = Integer.toString(4, 36);
        b0 = Integer.toString(5, 36);
        c0 = Integer.toString(6, 36);
        d0 = Integer.toString(8, 36);
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
        C0 = Integer.toString(MediaDataController.MAX_STYLE_RUNS_COUNT, 36);
        D0 = new q0(8);
    }

    public e1(d1 d1Var) {
        Boolean bool = d1Var.p;
        Integer num = d1Var.o;
        Integer num2 = d1Var.F;
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
            boolean z4 = num.intValue() != -1;
            bool = Boolean.valueOf(z4);
            if (z4 && num2 == null) {
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
        this.a = d1Var.a;
        this.b = d1Var.b;
        this.c = d1Var.c;
        this.d = d1Var.d;
        this.e = d1Var.e;
        this.f = d1Var.f;
        this.h = d1Var.g;
        this.n = d1Var.h;
        this.r = d1Var.i;
        this.s = d1Var.j;
        this.v = d1Var.k;
        this.w = d1Var.l;
        this.x = d1Var.m;
        this.y = d1Var.n;
        this.B = num;
        this.C = bool;
        this.D = d1Var.q;
        Integer num3 = d1Var.r;
        this.E = num3;
        this.F = num3;
        this.G = d1Var.s;
        this.H = d1Var.t;
        this.I = d1Var.u;
        this.J = d1Var.v;
        this.K = d1Var.w;
        this.L = d1Var.x;
        this.M = d1Var.y;
        this.N = d1Var.z;
        this.O = d1Var.A;
        this.P = d1Var.B;
        this.Q = d1Var.C;
        this.R = d1Var.D;
        this.S = d1Var.E;
        this.T = num2;
        this.U = d1Var.G;
    }

    public final d1 a() {
        d1 d1Var = new d1();
        d1Var.a = this.a;
        d1Var.b = this.b;
        d1Var.c = this.c;
        d1Var.d = this.d;
        d1Var.e = this.e;
        d1Var.f = this.f;
        d1Var.g = this.h;
        d1Var.h = this.n;
        d1Var.i = this.r;
        d1Var.j = this.s;
        d1Var.k = this.v;
        d1Var.l = this.w;
        d1Var.m = this.x;
        d1Var.n = this.y;
        d1Var.o = this.B;
        d1Var.p = this.C;
        d1Var.q = this.D;
        d1Var.r = this.F;
        d1Var.s = this.G;
        d1Var.t = this.H;
        d1Var.u = this.I;
        d1Var.v = this.J;
        d1Var.w = this.K;
        d1Var.x = this.L;
        d1Var.y = this.M;
        d1Var.z = this.N;
        d1Var.A = this.O;
        d1Var.B = this.P;
        d1Var.C = this.Q;
        d1Var.D = this.R;
        d1Var.E = this.S;
        d1Var.F = this.T;
        d1Var.G = this.U;
        return d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (h5.d0.a(this.a, e1Var.a) && h5.d0.a(this.b, e1Var.b) && h5.d0.a(this.c, e1Var.c) && h5.d0.a(this.d, e1Var.d) && h5.d0.a(this.e, e1Var.e) && h5.d0.a(this.f, e1Var.f) && h5.d0.a(this.h, e1Var.h) && h5.d0.a(this.n, e1Var.n) && h5.d0.a(this.r, e1Var.r) && Arrays.equals(this.s, e1Var.s) && h5.d0.a(this.v, e1Var.v) && h5.d0.a(this.w, e1Var.w) && h5.d0.a(this.x, e1Var.x) && h5.d0.a(this.y, e1Var.y) && h5.d0.a(this.B, e1Var.B) && h5.d0.a(this.C, e1Var.C) && h5.d0.a(this.D, e1Var.D) && h5.d0.a(this.F, e1Var.F) && h5.d0.a(this.G, e1Var.G) && h5.d0.a(this.H, e1Var.H) && h5.d0.a(this.I, e1Var.I) && h5.d0.a(this.J, e1Var.J) && h5.d0.a(this.K, e1Var.K) && h5.d0.a(this.L, e1Var.L) && h5.d0.a(this.M, e1Var.M) && h5.d0.a(this.N, e1Var.N) && h5.d0.a(this.O, e1Var.O) && h5.d0.a(this.P, e1Var.P) && h5.d0.a(this.Q, e1Var.Q) && h5.d0.a(this.R, e1Var.R) && h5.d0.a(this.S, e1Var.S) && h5.d0.a(this.T, e1Var.T)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.n, this.r, Integer.valueOf(Arrays.hashCode(this.s)), this.v, this.w, this.x, this.y, this.B, this.C, this.D, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T});
    }
}
