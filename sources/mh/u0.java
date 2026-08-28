package mh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.rc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ys0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public u0(Context context, int i9, long j10) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i9;
        this.c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i9, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z10;
        if (!z10 || a()) {
            return;
        }
        this.e = false;
        this.d = false;
        l();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i9 = 0; i9 < 4; i9++) {
            context.getSharedPreferences("botlocation_" + i9, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static u0 e(Context context, int i9, long j10) {
        Pair pair = new Pair(Integer.valueOf(i9), Long.valueOf(j10));
        HashMap hashMap = g;
        u0 u0Var = (u0) hashMap.get(pair);
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(context, i9, j10);
        hashMap.put(pair, u0Var2);
        return u0Var2;
    }

    public static JSONObject h(Location location) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available", location != null);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i9 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i9 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i9 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e10) {
            FileLog.e(e10);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (f10 != null) {
            return f10.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f10.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        return false;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        return f() != null && f().getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public final Activity f() {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.a);
        }
        return activity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final boolean i() {
        Activity f10;
        if (Build.VERSION.SDK_INT >= 23 && (f10 = f()) != null) {
            return (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) ? false : true;
        }
        return false;
    }

    public final void j(final org.telegram.ui.web.r rVar) {
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            rVar.run(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            rVar.run(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i9 = 1;
        final boolean[] zArr = new boolean[1];
        int i10 = this.b;
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
        int i12 = 2;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.P = replaceTags;
        t0 t0Var = new t0(this.a, UserConfig.getInstance(i10).getCurrentUser(), user);
        int w02 = f6.w0(null, f6.L5, false);
        c2Var.X = t0Var;
        c2Var.Y = w02;
        if (a() || !i()) {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) { // from class: mh.r0
                public final /* synthetic */ u0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                    switch (i11) {
                        case 0:
                            u0 u0Var = this.b;
                            u0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = u0Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(17, u0Var, rVar2));
                                break;
                            } else {
                                u0Var.d = true;
                                u0Var.e = true;
                                u0Var.l();
                                Iterator it = u0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                break;
                            }
                        default:
                            u0 u0Var2 = this.b;
                            u0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                u0Var2.d = true;
                                u0Var2.e = false;
                                u0Var2.l();
                                Iterator it2 = u0Var2.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                rVar.run(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f10, zArr, rVar, 12));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) { // from class: mh.r0
            public final /* synthetic */ u0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i13) {
                switch (i9) {
                    case 0:
                        u0 u0Var = this.b;
                        u0Var.getClass();
                        zArr[0] = true;
                        boolean a2 = u0Var.a();
                        org.telegram.ui.web.r rVar2 = rVar;
                        if (!a2) {
                            kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(17, u0Var, rVar2));
                            break;
                        } else {
                            u0Var.d = true;
                            u0Var.e = true;
                            u0Var.l();
                            Iterator it = u0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            break;
                        }
                    default:
                        u0 u0Var2 = this.b;
                        u0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            u0Var2.d = true;
                            u0Var2.e = false;
                            u0Var2.l();
                            Iterator it2 = u0Var2.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            rVar.run(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new fh.j(this, zArr, rVar, i12));
        alertDialog$Builder.o();
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            callback.run(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                break;
            }
        }
        if (location != null || locationManager.isProviderEnabled("gps")) {
            if (location != null) {
                callback.run(h(location));
                return;
            }
            try {
                s0 s0Var = new s0(this, locationManager, new LocationListener[]{s0Var}, callback);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, s0Var);
                return;
            } catch (Exception e11) {
                FileLog.e(e11);
                callback.run(h(null));
                return;
            }
        }
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.m(R.raw.permission_request_location, 72, f6.w0(null, f6.L5, false), null);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new rc(context, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.o();
            } catch (Exception e12) {
                FileLog.e(e12);
            }
        }
        callback.run(h(null));
    }

    public final void l() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.c;
        edit.putBoolean(aa.d.q(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z10, final ys0 ys0Var) {
        final int i9 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.e = z10;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (ys0Var != null) {
                ys0Var.run();
            }
        } else {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i10 = this.b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
            final int i11 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.P = replaceTags;
            t0 t0Var = new t0(this.a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = f6.w0(null, f6.L5, false);
            c2Var.X = t0Var;
            c2Var.Y = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new p0(f10, i11));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) { // from class: mh.q0
                    public final /* synthetic */ u0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                        switch (i11) {
                            case 0:
                                u0 u0Var = this.b;
                                if (!u0Var.a()) {
                                    kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(18, u0Var, ys0Var));
                                    break;
                                } else {
                                    u0Var.d = true;
                                    u0Var.e = true;
                                    u0Var.l();
                                    Iterator it2 = u0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                u0 u0Var2 = this.b;
                                u0Var2.d = true;
                                u0Var2.e = false;
                                u0Var2.l();
                                Iterator it3 = u0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = ys0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) { // from class: mh.q0
                public final /* synthetic */ u0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i12) {
                    switch (i9) {
                        case 0:
                            u0 u0Var = this.b;
                            if (!u0Var.a()) {
                                kd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new fh.f1(18, u0Var, ys0Var));
                                break;
                            } else {
                                u0Var.d = true;
                                u0Var.e = true;
                                u0Var.l();
                                Iterator it2 = u0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            u0 u0Var2 = this.b;
                            u0Var2.d = true;
                            u0Var2.e = false;
                            u0Var2.l();
                            Iterator it3 = u0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = ys0Var;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        l();
    }
}
