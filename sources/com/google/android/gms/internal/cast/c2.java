package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c2 {
    public static final r5.b i = new r5.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static c2 k;
    public final o0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final c2.t0 e = new c2.t0(Looper.getMainLooper(), 1);
    public final v d = new v(this, 2);

    public c2(SharedPreferences sharedPreferences, o0 o0Var, String str) {
        this.b = sharedPreferences;
        this.a = o0Var;
        this.c = str;
    }

    public static void a(c1 c1Var) {
        c2 c2Var;
        if (!o0.j || (c2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = c2Var.b;
        String num = Integer.toString(c1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String e9 = s3.c.e("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(e9)) {
            e9 = s3.c.e("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(e9, System.currentTimeMillis()).apply();
        c2Var.f.add(c1Var);
        c2Var.e.post(c2Var.d);
    }

    public static c1 b(String str) {
        c1 c1Var = c1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return c1Var;
            case 1:
                return c1.c;
            case 2:
                return c1.d;
            case 3:
                return c1.e;
            case 4:
                return c1.f;
            case 5:
                return c1.h;
            case 6:
                return c1.n;
            case 7:
                return c1.r;
            case 8:
                return c1.s;
            case 9:
                return c1.v;
            case 10:
                return c1.w;
            case 11:
                return c1.x;
            case 12:
                return c1.y;
            case 13:
                return c1.A;
            case 14:
                return c1.B;
            case 15:
                return c1.C;
            case 16:
                return c1.D;
            case 17:
                return c1.E;
            case 18:
                return c1.F;
            case 19:
                return c1.G;
            case 20:
                return c1.H;
            case 21:
                return c1.I;
            case 22:
                return c1.J;
            case 23:
                return c1.K;
            case 24:
                return c1.L;
            case 25:
                return c1.M;
            case 26:
                return c1.N;
            case 27:
                return c1.O;
            case 28:
                return c1.P;
            case 29:
                return c1.Q;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return c1.R;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return c1.S;
            case 32:
                return c1.T;
            case 33:
                return c1.U;
            case 34:
                return c1.V;
            case 35:
                return c1.W;
            case 36:
                return c1.X;
            case 37:
                return c1.Y;
            case 38:
                return c1.Z;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return c1.a0;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return c1.b0;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return c1.c0;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return c1.d0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return c1.e0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return c1.f0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return c1.g0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return c1.h0;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return c1.i0;
            case 48:
                return c1.j0;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return c1.k0;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return c1.l0;
            case 51:
                return c1.m0;
            case 52:
                return c1.n0;
            case 53:
                return c1.o0;
            case 54:
                return c1.p0;
            case 55:
                return c1.q0;
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
