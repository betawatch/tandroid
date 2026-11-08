package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a2 {
    public static final j6.b i = new j6.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static a2 k;
    public final m0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final y e = new y(Looper.getMainLooper(), 0);
    public final u d = new u(this, 2);

    public a2(SharedPreferences sharedPreferences, m0 m0Var, String str) {
        this.b = sharedPreferences;
        this.a = m0Var;
        this.c = str;
    }

    public static void a(a1 a1Var) {
        a2 a2Var;
        if (!m0.j || (a2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = a2Var.b;
        String num = Integer.toString(a1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String i7 = rf.b.i("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(i7)) {
            i7 = rf.b.i("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(i7, System.currentTimeMillis()).apply();
        a2Var.f.add(a1Var);
        a2Var.e.post(a2Var.d);
    }

    public static a1 b(String str) {
        a1 a1Var = a1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return a1Var;
            case 1:
                return a1.c;
            case 2:
                return a1.d;
            case 3:
                return a1.e;
            case 4:
                return a1.f;
            case 5:
                return a1.h;
            case 6:
                return a1.n;
            case 7:
                return a1.r;
            case 8:
                return a1.s;
            case 9:
                return a1.w;
            case 10:
                return a1.x;
            case 11:
                return a1.y;
            case 12:
                return a1.D;
            case 13:
                return a1.E;
            case 14:
                return a1.F;
            case 15:
                return a1.G;
            case 16:
                return a1.H;
            case 17:
                return a1.I;
            case 18:
                return a1.J;
            case 19:
                return a1.K;
            case 20:
                return a1.L;
            case 21:
                return a1.M;
            case 22:
                return a1.N;
            case 23:
                return a1.O;
            case 24:
                return a1.P;
            case 25:
                return a1.Q;
            case 26:
                return a1.R;
            case 27:
                return a1.S;
            case 28:
                return a1.T;
            case 29:
                return a1.U;
            case qs.T /* 30 */:
                return a1.V;
            case qs.U /* 31 */:
                return a1.W;
            case 32:
                return a1.X;
            case 33:
                return a1.Y;
            case 34:
                return a1.Z;
            case 35:
                return a1.a0;
            case 36:
                return a1.b0;
            case 37:
                return a1.c0;
            case 38:
                return a1.d0;
            case 39:
                return a1.e0;
            case 40:
                return a1.f0;
            case 41:
                return a1.g0;
            case 42:
                return a1.h0;
            case 43:
                return a1.i0;
            case 44:
                return a1.j0;
            case 45:
                return a1.k0;
            case 46:
                return a1.l0;
            case 47:
                return a1.m0;
            case 48:
                return a1.n0;
            case 49:
                return a1.o0;
            case 50:
                return a1.p0;
            case qs.o0 /* 51 */:
                return a1.q0;
            case qs.p0 /* 52 */:
                return a1.r0;
            case qs.q0 /* 53 */:
                return a1.s0;
            case qs.r0 /* 54 */:
                return a1.t0;
            case qs.s0 /* 55 */:
                return a1.u0;
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
