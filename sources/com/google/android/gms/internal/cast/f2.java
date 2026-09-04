package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class f2 {
    public static final g6.b i = new g6.b("FeatureUsageAnalytics", null);
    public static final String j = "21.4.0";
    public static f2 k;
    public final r0 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final c0 e = new c0(Looper.getMainLooper(), 0);
    public final x d = new x(this, 2);

    public f2(SharedPreferences sharedPreferences, r0 r0Var, String str) {
        this.b = sharedPreferences;
        this.a = r0Var;
        this.c = str;
    }

    public static void a(f1 f1Var) {
        f2 f2Var;
        if (!r0.j || (f2Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = f2Var.b;
        String num = Integer.toString(f1Var.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String i10 = org.telegram.ui.Cells.p6.i("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(i10)) {
            i10 = org.telegram.ui.Cells.p6.i("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(i10, System.currentTimeMillis()).apply();
        f2Var.f.add(f1Var);
        f2Var.e.post(f2Var.d);
    }

    public static f1 b(String str) {
        f1 f1Var = f1.b;
        switch (Integer.parseInt(str)) {
            case 0:
                return f1Var;
            case 1:
                return f1.c;
            case 2:
                return f1.d;
            case 3:
                return f1.e;
            case 4:
                return f1.f;
            case 5:
                return f1.h;
            case 6:
                return f1.n;
            case 7:
                return f1.r;
            case 8:
                return f1.s;
            case 9:
                return f1.v;
            case 10:
                return f1.w;
            case 11:
                return f1.x;
            case 12:
                return f1.y;
            case 13:
                return f1.E;
            case 14:
                return f1.F;
            case 15:
                return f1.G;
            case 16:
                return f1.H;
            case 17:
                return f1.I;
            case 18:
                return f1.J;
            case 19:
                return f1.K;
            case 20:
                return f1.L;
            case 21:
                return f1.M;
            case 22:
                return f1.N;
            case 23:
                return f1.O;
            case 24:
                return f1.P;
            case 25:
                return f1.Q;
            case 26:
                return f1.R;
            case 27:
                return f1.S;
            case 28:
                return f1.T;
            case 29:
                return f1.U;
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return f1.V;
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return f1.W;
            case 32:
                return f1.X;
            case 33:
                return f1.Y;
            case 34:
                return f1.Z;
            case 35:
                return f1.a0;
            case 36:
                return f1.b0;
            case 37:
                return f1.c0;
            case 38:
                return f1.d0;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return f1.e0;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return f1.f0;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return f1.g0;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return f1.h0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return f1.i0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return f1.j0;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return f1.k0;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return f1.l0;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return f1.m0;
            case 48:
                return f1.n0;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return f1.o0;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return f1.p0;
            case 51:
                return f1.q0;
            case 52:
                return f1.r0;
            case 53:
                return f1.s0;
            case 54:
                return f1.t0;
            case 55:
                return f1.u0;
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
