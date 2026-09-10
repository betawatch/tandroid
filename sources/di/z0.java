package di;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import bi.bf;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.me0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public z0(Context context, int i10, long j3) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i10;
        this.c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j3 + "_granted", false);
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
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static z0 e(Context context, int i10, long j3) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j3));
        HashMap hashMap = g;
        z0 z0Var = (z0) hashMap.get(pair);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0(context, i10, j3);
        hashMap.put(pair, z0Var2);
        return z0Var2;
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
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i10 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i10 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i10 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f7 = f();
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (f7 != null) {
            return f7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
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
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.a);
        }
        return activity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final boolean i() {
        Activity f7;
        if (Build.VERSION.SDK_INT >= 23 && (f7 = f()) != null) {
            return (f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) ? false : true;
        }
        return false;
    }

    public final void j(final org.telegram.ui.web.r rVar) {
        Activity f7 = f();
        if (f7 == null) {
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
        final int i10 = 1;
        final boolean[] zArr = new boolean[1];
        int i11 = this.b;
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.c));
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f7, 0, null);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.T = replaceTags;
        y0 y0Var = new y0(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
        int w02 = j6.w0(null, j6.L5, false);
        d2Var.b0 = y0Var;
        d2Var.c0 = w02;
        if (a() || !i()) {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) { // from class: di.v0
                public final /* synthetic */ z0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    switch (i12) {
                        case 0:
                            z0 z0Var = this.b;
                            z0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = z0Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                me0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new bi.y2(8, z0Var, rVar2));
                                break;
                            } else {
                                z0Var.d = true;
                                z0Var.e = true;
                                z0Var.l();
                                Iterator it = z0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                break;
                            }
                        default:
                            z0 z0Var2 = this.b;
                            z0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                z0Var2.d = true;
                                z0Var2.e = false;
                                z0Var2.l();
                                Iterator it2 = z0Var2.f.iterator();
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
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f7, zArr, rVar, 5));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) { // from class: di.v0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.c2
            public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                switch (i10) {
                    case 0:
                        z0 z0Var = this.b;
                        z0Var.getClass();
                        zArr[0] = true;
                        boolean a2 = z0Var.a();
                        org.telegram.ui.web.r rVar2 = rVar;
                        if (!a2) {
                            me0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new bi.y2(8, z0Var, rVar2));
                            break;
                        } else {
                            z0Var.d = true;
                            z0Var.e = true;
                            z0Var.l();
                            Iterator it = z0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            break;
                        }
                    default:
                        z0 z0Var2 = this.b;
                        z0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            z0Var2.d = true;
                            z0Var2.e = false;
                            z0Var2.l();
                            Iterator it2 = z0Var2.f.iterator();
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
        alertDialog$Builder.j(new w0(this, zArr, rVar, i12));
        alertDialog$Builder.o();
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e) {
                FileLog.e(e);
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
                x0 x0Var = new x0(this, locationManager, new LocationListener[]{x0Var}, callback);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, x0Var);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                callback.run(h(null));
                return;
            }
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.m(R.raw.permission_request_location, 72, j6.w0(null, j6.L5, false), null);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bf(context, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.o();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        callback.run(h(null));
    }

    public final void l() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.c;
        edit.putBoolean(a4.a.r(sb2, j3, "_granted"), this.e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z10, final ey0 ey0Var) {
        final int i10 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.e = z10;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (ey0Var != null) {
                ey0Var.run();
            }
        } else {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i11 = this.b;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.c));
            final int i12 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.T = replaceTags;
            y0 y0Var = new y0(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
            int w02 = j6.w0(null, j6.L5, false);
            d2Var.b0 = y0Var;
            d2Var.c0 = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new t0(f7, i12));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) { // from class: di.u0
                    public final /* synthetic */ z0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                        switch (i12) {
                            case 0:
                                z0 z0Var = this.b;
                                if (!z0Var.a()) {
                                    me0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new bi.y2(9, z0Var, ey0Var));
                                    break;
                                } else {
                                    z0Var.d = true;
                                    z0Var.e = true;
                                    z0Var.l();
                                    Iterator it2 = z0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                z0 z0Var2 = this.b;
                                z0Var2.d = true;
                                z0Var2.e = false;
                                z0Var2.l();
                                Iterator it3 = z0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = ey0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) { // from class: di.u0
                public final /* synthetic */ z0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i13) {
                    switch (i10) {
                        case 0:
                            z0 z0Var = this.b;
                            if (!z0Var.a()) {
                                me0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new bi.y2(9, z0Var, ey0Var));
                                break;
                            } else {
                                z0Var.d = true;
                                z0Var.e = true;
                                z0Var.l();
                                Iterator it2 = z0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            z0 z0Var2 = this.b;
                            z0Var2.d = true;
                            z0Var2.e = false;
                            z0Var2.l();
                            Iterator it3 = z0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = ey0Var;
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
