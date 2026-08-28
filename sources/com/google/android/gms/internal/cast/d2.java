package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d2 {
    public static final q5.b i = new q5.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static d2 k;
    public final p0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final c2.u0 e = new c2.u0(Looper.getMainLooper(), 1);
    public final w d = new w(this, 2);

    public d2(SharedPreferences sharedPreferences, p0 p0Var, String str) {
        this.b = sharedPreferences;
        this.a = p0Var;
        this.c = str;
    }

    public static void a(d1 d1Var) {
        d2 d2Var;
        if (!p0.j || (d2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = d2Var.b;
        String num = Integer.toString(d1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String d = ta.b.d("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(d)) {
            d = ta.b.d("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(d, System.currentTimeMillis()).apply();
        d2Var.f.add(d1Var);
        d2Var.e.post(d2Var.d);
    }

    public static d1 b(String str) {
        d1 d1Var = d1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return d1Var;
            case 1:
                return d1.c;
            case 2:
                return d1.d;
            case 3:
                return d1.e;
            case 4:
                return d1.f;
            case 5:
                return d1.h;
            case 6:
                return d1.n;
            case 7:
                return d1.r;
            case 8:
                return d1.s;
            case 9:
                return d1.v;
            case 10:
                return d1.w;
            case 11:
                return d1.x;
            case 12:
                return d1.y;
            case 13:
                return d1.A;
            case 14:
                return d1.B;
            case 15:
                return d1.C;
            case 16:
                return d1.D;
            case 17:
                return d1.E;
            case 18:
                return d1.F;
            case 19:
                return d1.G;
            case 20:
                return d1.H;
            case 21:
                return d1.I;
            case 22:
                return d1.J;
            case 23:
                return d1.K;
            case 24:
                return d1.L;
            case 25:
                return d1.M;
            case 26:
                return d1.N;
            case 27:
                return d1.O;
            case 28:
                return d1.P;
            case 29:
                return d1.Q;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return d1.R;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return d1.S;
            case 32:
                return d1.T;
            case 33:
                return d1.U;
            case 34:
                return d1.V;
            case 35:
                return d1.W;
            case 36:
                return d1.X;
            case 37:
                return d1.Y;
            case 38:
                return d1.Z;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return d1.a0;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return d1.b0;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return d1.c0;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return d1.d0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return d1.e0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return d1.f0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return d1.g0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return d1.h0;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return d1.i0;
            case 48:
                return d1.j0;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return d1.k0;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return d1.l0;
            case 51:
                return d1.m0;
            case 52:
                return d1.n0;
            case 53:
                return d1.o0;
            case 54:
                return d1.p0;
            case 55:
                return d1.q0;
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
