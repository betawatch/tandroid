package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b2 {
    public static final i6.b i = new i6.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static b2 k;
    public final n0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final z e = new z(Looper.getMainLooper(), 0);
    public final v d = new v(this, 2);

    public b2(SharedPreferences sharedPreferences, n0 n0Var, String str) {
        this.b = sharedPreferences;
        this.a = n0Var;
        this.c = str;
    }

    public static void a(b1 b1Var) {
        b2 b2Var;
        if (!n0.j || (b2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = b2Var.b;
        String num = Integer.toString(b1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String f10 = t4.c.f("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(f10)) {
            f10 = t4.c.f("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(f10, System.currentTimeMillis()).apply();
        b2Var.f.add(b1Var);
        b2Var.e.post(b2Var.d);
    }

    public static b1 b(String str) {
        b1 b1Var = b1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return b1Var;
            case 1:
                return b1.c;
            case 2:
                return b1.d;
            case 3:
                return b1.e;
            case 4:
                return b1.f;
            case 5:
                return b1.h;
            case 6:
                return b1.n;
            case 7:
                return b1.r;
            case 8:
                return b1.s;
            case 9:
                return b1.w;
            case 10:
                return b1.x;
            case 11:
                return b1.y;
            case 12:
                return b1.E;
            case 13:
                return b1.F;
            case 14:
                return b1.G;
            case 15:
                return b1.H;
            case 16:
                return b1.I;
            case 17:
                return b1.J;
            case 18:
                return b1.K;
            case 19:
                return b1.L;
            case 20:
                return b1.M;
            case 21:
                return b1.N;
            case 22:
                return b1.O;
            case 23:
                return b1.P;
            case 24:
                return b1.Q;
            case 25:
                return b1.R;
            case 26:
                return b1.S;
            case 27:
                return b1.T;
            case 28:
                return b1.U;
            case 29:
                return b1.V;
            case hs.T /* 30 */:
                return b1.W;
            case hs.U /* 31 */:
                return b1.X;
            case 32:
                return b1.Y;
            case 33:
                return b1.Z;
            case 34:
                return b1.a0;
            case 35:
                return b1.b0;
            case 36:
                return b1.c0;
            case 37:
                return b1.d0;
            case 38:
                return b1.e0;
            case 39:
                return b1.f0;
            case 40:
                return b1.g0;
            case 41:
                return b1.h0;
            case 42:
                return b1.i0;
            case 43:
                return b1.j0;
            case 44:
                return b1.k0;
            case 45:
                return b1.l0;
            case 46:
                return b1.m0;
            case 47:
                return b1.n0;
            case 48:
                return b1.o0;
            case 49:
                return b1.p0;
            case 50:
                return b1.q0;
            case hs.o0 /* 51 */:
                return b1.r0;
            case hs.p0 /* 52 */:
                return b1.s0;
            case hs.q0 /* 53 */:
                return b1.t0;
            case hs.r0 /* 54 */:
                return b1.u0;
            case hs.s0 /* 55 */:
                return b1.v0;
            default:
                return null;
        }
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
