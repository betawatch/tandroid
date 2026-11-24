// default package

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k7f {
    public static final ce6 i = new ce6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static k7f k;
    public final i8e a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final q79 e = new q79(Looper.getMainLooper(), (byte) 3);
    public final eqd d = new eqd(this, (byte) 2);

    public k7f(SharedPreferences sharedPreferences, i8e i8eVar, String str) {
        this.b = sharedPreferences;
        this.a = i8eVar;
        this.c = str;
    }

    public static void a(m3f m3fVar) {
        k7f k7fVar;
        if (!i8e.j || (k7fVar = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = k7fVar.b;
        String num = Integer.toString(m3fVar.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String h = b10.h("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(h)) {
            h = b10.h("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(h, System.currentTimeMillis()).apply();
        k7fVar.f.add(m3fVar);
        k7fVar.e.post(k7fVar.d);
    }

    public static m3f b(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return m3f.b;
            case 1:
                return m3f.c;
            case 2:
                return m3f.d;
            case 3:
                return m3f.e;
            case 4:
                return m3f.f;
            case 5:
                return m3f.h;
            case 6:
                return m3f.n;
            case 7:
                return m3f.r;
            case 8:
                return m3f.s;
            case 9:
                return m3f.w;
            case 10:
                return m3f.x;
            case 11:
                return m3f.y;
            case 12:
                return m3f.E;
            case 13:
                return m3f.F;
            case 14:
                return m3f.G;
            case 15:
                return m3f.H;
            case 16:
                return m3f.I;
            case 17:
                return m3f.J;
            case 18:
                return m3f.K;
            case 19:
                return m3f.L;
            case 20:
                return m3f.M;
            case 21:
                return m3f.N;
            case 22:
                return m3f.O;
            case 23:
                return m3f.P;
            case 24:
                return m3f.Q;
            case 25:
                return m3f.R;
            case 26:
                return m3f.S;
            case 27:
                return m3f.T;
            case 28:
                return m3f.U;
            case 29:
                return m3f.V;
            case nm7.S /* 30 */:
                return m3f.W;
            case 31:
                return m3f.X;
            case 32:
                return m3f.Y;
            case 33:
                return m3f.Z;
            case 34:
                return m3f.a0;
            case 35:
                return m3f.b0;
            case 36:
                return m3f.c0;
            case 37:
                return m3f.d0;
            case 38:
                return m3f.e0;
            case 39:
                return m3f.f0;
            case 40:
                return m3f.g0;
            case 41:
                return m3f.h0;
            case 42:
                return m3f.i0;
            case 43:
                return m3f.j0;
            case 44:
                return m3f.k0;
            case 45:
                return m3f.l0;
            case 46:
                return m3f.m0;
            case 47:
                return m3f.n0;
            case 48:
                return m3f.o0;
            case 49:
                return m3f.p0;
            case 50:
                return m3f.q0;
            case nm7.n0 /* 51 */:
                return m3f.r0;
            case nm7.o0 /* 52 */:
                return m3f.s0;
            case nm7.p0 /* 53 */:
                return m3f.t0;
            case nm7.q0 /* 54 */:
                return m3f.u0;
            case nm7.r0 /* 55 */:
                return m3f.v0;
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
