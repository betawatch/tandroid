package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a2 {
    public static final h6.b i = new h6.b("FeatureUsageAnalytics", null);
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
        String j10 = b10.j("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(j10)) {
            j10 = b10.j("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(j10, System.currentTimeMillis()).apply();
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
                return a1.v;
            case 10:
                return a1.w;
            case 11:
                return a1.x;
            case 12:
                return a1.y;
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
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return a1.V;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
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
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return a1.e0;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return a1.f0;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return a1.g0;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return a1.h0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return a1.i0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return a1.j0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return a1.k0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return a1.l0;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return a1.m0;
            case 48:
                return a1.n0;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return a1.o0;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return a1.p0;
            case 51:
                return a1.q0;
            case 52:
                return a1.r0;
            case 53:
                return a1.s0;
            case 54:
                return a1.t0;
            case 55:
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
