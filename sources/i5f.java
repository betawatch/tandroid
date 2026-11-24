// default package

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class i5f {
    public static final dc6 i = new dc6("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static i5f k;
    public final h6e a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final o59 e = new o59(Looper.getMainLooper(), (byte) 3);
    public final bod d = new bod(this, (byte) 2);

    public i5f(SharedPreferences sharedPreferences, h6e h6eVar, String str) {
        this.b = sharedPreferences;
        this.a = h6eVar;
        this.c = str;
    }

    public static void a(k1f k1fVar) {
        i5f i5fVar;
        if (!h6e.j || (i5fVar = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = i5fVar.b;
        String num = Integer.toString(k1fVar.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String h = b00.h("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(h)) {
            h = b00.h("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(h, System.currentTimeMillis()).apply();
        i5fVar.f.add(k1fVar);
        i5fVar.e.post(i5fVar.d);
    }

    public static k1f b(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return k1f.b;
            case 1:
                return k1f.c;
            case 2:
                return k1f.d;
            case 3:
                return k1f.e;
            case 4:
                return k1f.f;
            case 5:
                return k1f.h;
            case 6:
                return k1f.n;
            case 7:
                return k1f.r;
            case 8:
                return k1f.s;
            case 9:
                return k1f.w;
            case 10:
                return k1f.x;
            case 11:
                return k1f.y;
            case 12:
                return k1f.E;
            case 13:
                return k1f.F;
            case 14:
                return k1f.G;
            case 15:
                return k1f.H;
            case 16:
                return k1f.I;
            case 17:
                return k1f.J;
            case 18:
                return k1f.K;
            case 19:
                return k1f.L;
            case 20:
                return k1f.M;
            case 21:
                return k1f.N;
            case 22:
                return k1f.O;
            case 23:
                return k1f.P;
            case 24:
                return k1f.Q;
            case 25:
                return k1f.R;
            case 26:
                return k1f.S;
            case 27:
                return k1f.T;
            case 28:
                return k1f.U;
            case 29:
                return k1f.V;
            case kk7.S /* 30 */:
                return k1f.W;
            case 31:
                return k1f.X;
            case 32:
                return k1f.Y;
            case 33:
                return k1f.Z;
            case 34:
                return k1f.a0;
            case 35:
                return k1f.b0;
            case 36:
                return k1f.c0;
            case 37:
                return k1f.d0;
            case 38:
                return k1f.e0;
            case 39:
                return k1f.f0;
            case 40:
                return k1f.g0;
            case 41:
                return k1f.h0;
            case 42:
                return k1f.i0;
            case 43:
                return k1f.j0;
            case 44:
                return k1f.k0;
            case 45:
                return k1f.l0;
            case 46:
                return k1f.m0;
            case 47:
                return k1f.n0;
            case 48:
                return k1f.o0;
            case 49:
                return k1f.p0;
            case 50:
                return k1f.q0;
            case kk7.n0 /* 51 */:
                return k1f.r0;
            case kk7.o0 /* 52 */:
                return k1f.s0;
            case kk7.p0 /* 53 */:
                return k1f.t0;
            case kk7.q0 /* 54 */:
                return k1f.u0;
            case kk7.r0 /* 55 */:
                return k1f.v0;
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
