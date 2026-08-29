package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e2 {
    public static final s5.b i = new s5.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static e2 k;
    public final p0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final c2.v0 e = new c2.v0(Looper.getMainLooper(), 1);
    public final w d = new w(this, 2);

    public e2(SharedPreferences sharedPreferences, p0 p0Var, String str) {
        this.b = sharedPreferences;
        this.a = p0Var;
        this.c = str;
    }

    public static void a(e1 e1Var) {
        e2 e2Var;
        if (!p0.j || (e2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = e2Var.b;
        String num = Integer.toString(e1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String e10 = u3.c.e("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(e10)) {
            e10 = u3.c.e("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(e10, System.currentTimeMillis()).apply();
        e2Var.f.add(e1Var);
        e2Var.e.post(e2Var.d);
    }

    public static e1 b(String str) {
        e1 e1Var = e1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return e1Var;
            case 1:
                return e1.c;
            case 2:
                return e1.d;
            case 3:
                return e1.e;
            case 4:
                return e1.f;
            case 5:
                return e1.h;
            case 6:
                return e1.n;
            case 7:
                return e1.r;
            case 8:
                return e1.s;
            case 9:
                return e1.v;
            case 10:
                return e1.w;
            case 11:
                return e1.x;
            case 12:
                return e1.y;
            case 13:
                return e1.A;
            case 14:
                return e1.B;
            case 15:
                return e1.C;
            case 16:
                return e1.D;
            case 17:
                return e1.E;
            case 18:
                return e1.F;
            case 19:
                return e1.G;
            case 20:
                return e1.H;
            case 21:
                return e1.I;
            case 22:
                return e1.J;
            case 23:
                return e1.K;
            case 24:
                return e1.L;
            case 25:
                return e1.M;
            case 26:
                return e1.N;
            case 27:
                return e1.O;
            case 28:
                return e1.P;
            case 29:
                return e1.Q;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return e1.R;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return e1.S;
            case 32:
                return e1.T;
            case 33:
                return e1.U;
            case 34:
                return e1.V;
            case 35:
                return e1.W;
            case 36:
                return e1.X;
            case 37:
                return e1.Y;
            case 38:
                return e1.Z;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return e1.a0;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return e1.b0;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return e1.c0;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return e1.d0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return e1.e0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return e1.f0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return e1.g0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return e1.h0;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return e1.i0;
            case 48:
                return e1.j0;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return e1.k0;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return e1.l0;
            case 51:
                return e1.m0;
            case 52:
                return e1.n0;
            case 53:
                return e1.o0;
            case 54:
                return e1.p0;
            case 55:
                return e1.q0;
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
