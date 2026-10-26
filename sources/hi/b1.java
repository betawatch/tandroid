package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import fi.nc;
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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fy0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b1 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public b1(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i10;
        this.c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z10;
        if (!z10 || a()) {
            return;
        }
        this.e = false;
        this.d = false;
        k();
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

    public static b1 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = g;
        b1 b1Var = (b1) hashMap.get(pair);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(context, i10, j10);
        hashMap.put(pair, b1Var2);
        return b1Var2;
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
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.a);
        }
        return activity == null ? AndroidUtilities.findActivity(ApplicationLoader.applicationContext) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final void i(final org.telegram.ui.web.r rVar) {
        Activity f7;
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
        final int i10 = 1;
        final boolean[] zArr = new boolean[1];
        int i11 = this.b;
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.c));
        final int i12 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.T = replaceTags;
        a1 a1Var = new a1(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
        int i13 = y6.L5;
        int x02 = y6.x0(null, i13, false);
        e2Var.b0 = a1Var;
        e2Var.c0 = x02;
        e2Var.d0 = -1;
        alertDialog$Builder.n(i13, null);
        if (a() || (f7 = f()) == null || (f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) { // from class: hi.x0
                public final /* synthetic */ b1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                    switch (i12) {
                        case 0:
                            b1 b1Var = this.b;
                            b1Var.getClass();
                            zArr[0] = true;
                            boolean a2 = b1Var.a();
                            org.telegram.ui.web.r rVar2 = rVar;
                            if (!a2) {
                                xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(17, b1Var, rVar2));
                                break;
                            } else {
                                b1Var.d = true;
                                b1Var.e = true;
                                b1Var.k();
                                Iterator it = b1Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                rVar2.run(bool2, bool2);
                                break;
                            }
                        default:
                            b1 b1Var2 = this.b;
                            b1Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                b1Var2.d = true;
                                b1Var2.e = false;
                                b1Var2.k();
                                Iterator it2 = b1Var2.f.iterator();
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
            alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new androidx.car.app.utils.a(f10, zArr, rVar, 8));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) { // from class: hi.x0
            public final /* synthetic */ b1 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                switch (i10) {
                    case 0:
                        b1 b1Var = this.b;
                        b1Var.getClass();
                        zArr[0] = true;
                        boolean a2 = b1Var.a();
                        org.telegram.ui.web.r rVar2 = rVar;
                        if (!a2) {
                            xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(17, b1Var, rVar2));
                            break;
                        } else {
                            b1Var.d = true;
                            b1Var.e = true;
                            b1Var.k();
                            Iterator it = b1Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            rVar2.run(bool2, bool2);
                            break;
                        }
                    default:
                        b1 b1Var2 = this.b;
                        b1Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            b1Var2.d = true;
                            b1Var2.e = false;
                            b1Var2.k();
                            Iterator it2 = b1Var2.f.iterator();
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
        alertDialog$Builder.j(new y0(this, zArr, rVar, i12));
        alertDialog$Builder.p();
    }

    public final void j(Utilities.Callback callback) {
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
                z0 z0Var = new z0(this, locationManager, new LocationListener[]{z0Var}, callback);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, z0Var);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                callback.run(h(null));
                return;
            }
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                int i10 = R.raw.permission_request_location;
                int i11 = y6.L5;
                alertDialog$Builder.m(i10, 72, y6.x0(null, i11, false), null);
                alertDialog$Builder.n(i11, null);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new nc(context, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.p();
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        callback.run(h(null));
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.c;
        edit.putBoolean(a1.g.r(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final fy0 fy0Var) {
        final int i10 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.e = z10;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (fy0Var != null) {
                fy0Var.run();
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
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.T = replaceTags;
            a1 a1Var = new a1(this.a, UserConfig.getInstance(i11).getCurrentUser(), user);
            int i13 = y6.L5;
            int x02 = y6.x0(null, i13, false);
            e2Var.b0 = a1Var;
            e2Var.c0 = x02;
            e2Var.d0 = -1;
            alertDialog$Builder.n(i13, null);
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) { // from class: hi.w0
                    public final /* synthetic */ b1 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                        switch (i12) {
                            case 0:
                                b1 b1Var = this.b;
                                if (!b1Var.a()) {
                                    xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(18, b1Var, fy0Var));
                                    break;
                                } else {
                                    b1Var.d = true;
                                    b1Var.e = true;
                                    b1Var.k();
                                    Iterator it2 = b1Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                b1 b1Var2 = this.b;
                                b1Var2.d = true;
                                b1Var2.e = false;
                                b1Var2.k();
                                Iterator it3 = b1Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = fy0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new v0(f7, i12));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) { // from class: hi.w0
                public final /* synthetic */ b1 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i14) {
                    switch (i10) {
                        case 0:
                            b1 b1Var = this.b;
                            if (!b1Var.a()) {
                                xe0.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.n1(18, b1Var, fy0Var));
                                break;
                            } else {
                                b1Var.d = true;
                                b1Var.e = true;
                                b1Var.k();
                                Iterator it2 = b1Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            b1 b1Var2 = this.b;
                            b1Var2.d = true;
                            b1Var2.e = false;
                            b1Var2.k();
                            Iterator it3 = b1Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = fy0Var;
                            if (runnable != null) {
                                runnable.run();
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        k();
    }
}
