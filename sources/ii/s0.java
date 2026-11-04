package ii;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import b8.nf;
import gi.qb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hk0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public s0(Context context, int i3, long j10) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i3;
        this.c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i3, 0);
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
        Context context = org.telegram.messenger.t0.b;
        if (context == null) {
            return;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            context.getSharedPreferences("botlocation_" + i3, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static s0 e(Context context, int i3, long j10) {
        Pair pair = new Pair(Integer.valueOf(i3), Long.valueOf(j10));
        HashMap hashMap = g;
        s0 s0Var = (s0) hashMap.get(pair);
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(context, i3, j10);
        hashMap.put(pair, s0Var2);
        return s0Var2;
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
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i3 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i3 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i3 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e10) {
            a8.g(e10, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
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
        Activity activity = LaunchActivity.K1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(this.a);
        }
        return activity == null ? org.telegram.messenger.g0.W(org.telegram.messenger.t0.b) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final void i(final org.telegram.ui.web.p pVar) {
        Activity f10;
        Activity f11 = f();
        if (f11 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            pVar.a(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            pVar.a(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i3 = 1;
        final boolean[] zArr = new boolean[1];
        int i10 = this.b;
        TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(this.c));
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f11, null);
        int i12 = 2;
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753057, l10.p(a22), l10.p(a22)));
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.U = X2;
        r0 r0Var = new r0(this.a, h10.i(i10).f(), a22);
        int i13 = k6.L5;
        int x02 = k6.x0(null, i13, false);
        s1Var.c0 = r0Var;
        s1Var.d0 = x02;
        s1Var.e0 = -1;
        alertDialog$Builder.n(i13, null);
        if (a() || (f10 = f()) == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            alertDialog$Builder.k(bd.M0(2131753059, null), new org.telegram.ui.ActionBar.p1(this) { // from class: ii.p0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                    switch (i11) {
                        case 0:
                            s0 s0Var = this.b;
                            s0Var.getClass();
                            zArr[0] = true;
                            boolean a10 = s0Var.a();
                            org.telegram.ui.web.p pVar2 = pVar;
                            if (!a10) {
                                nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(20, s0Var, pVar2));
                                break;
                            } else {
                                s0Var.d = true;
                                s0Var.e = true;
                                s0Var.k();
                                Iterator it = s0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                pVar2.a(bool2, bool2);
                                break;
                            }
                        default:
                            s0 s0Var2 = this.b;
                            s0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                s0Var2.d = true;
                                s0Var2.e = false;
                                s0Var2.k();
                                Iterator it2 = s0Var2.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                pVar.a(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(bd.M0(2131753053, null), new aa.a(f11, zArr, pVar, 8));
        }
        alertDialog$Builder.h(bd.M0(2131753058, null), new org.telegram.ui.ActionBar.p1(this) { // from class: ii.p0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                switch (i3) {
                    case 0:
                        s0 s0Var = this.b;
                        s0Var.getClass();
                        zArr[0] = true;
                        boolean a10 = s0Var.a();
                        org.telegram.ui.web.p pVar2 = pVar;
                        if (!a10) {
                            nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(20, s0Var, pVar2));
                            break;
                        } else {
                            s0Var.d = true;
                            s0Var.e = true;
                            s0Var.k();
                            Iterator it = s0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            pVar2.a(bool2, bool2);
                            break;
                        }
                    default:
                        s0 s0Var2 = this.b;
                        s0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            s0Var2.d = true;
                            s0Var2.e = false;
                            s0Var2.k();
                            Iterator it2 = s0Var2.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            pVar.a(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new ai.o(this, zArr, pVar, i12));
        alertDialog$Builder.p();
    }

    public final void j(u10 u10Var) {
        JSONObject jSONObject = new JSONObject();
        int i3 = 1;
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            u10Var.a(jSONObject);
            return;
        }
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
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
                u10Var.a(h(location));
                return;
            }
            try {
                q0 q0Var = new q0(this, locationManager, new LocationListener[]{q0Var}, u10Var);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, q0Var);
                return;
            } catch (Exception e11) {
                a8.g(e11, true);
                u10Var.a(h(null));
                return;
            }
        }
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                int i10 = k6.L5;
                alertDialog$Builder.m(R.raw.permission_request_location, 72, k6.x0(null, i10, false), null);
                alertDialog$Builder.n(i10, null);
                alertDialog$Builder.a.U = bd.M0(2131749538, null);
                alertDialog$Builder.k(bd.M0(2131751161, null), new qb(context, i3));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.p();
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
        u10Var.a(h(null));
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.c;
        edit.putBoolean(a1.g.r(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final hk0 hk0Var) {
        final int i3 = 1;
        this.d = true;
        if (!z10 || a()) {
            this.e = z10;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (hk0Var != null) {
                hk0Var.run();
            }
        } else {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i10 = this.b;
            TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(this.c));
            final int i11 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753057, l10.p(a22), l10.p(a22)));
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.U = X2;
            r0 r0Var = new r0(this.a, h10.i(i10).f(), a22);
            int i12 = k6.L5;
            int x02 = k6.x0(null, i12, false);
            s1Var.c0 = r0Var;
            s1Var.d0 = x02;
            s1Var.e0 = -1;
            alertDialog$Builder.n(i12, null);
            Activity f11 = f();
            if (f11 == null || (f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(bd.M0(2131753059, null), new org.telegram.ui.ActionBar.p1(this) { // from class: ii.o0
                    public final /* synthetic */ s0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                        switch (i11) {
                            case 0:
                                s0 s0Var = this.b;
                                if (!s0Var.a()) {
                                    nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(21, s0Var, hk0Var));
                                    break;
                                } else {
                                    s0Var.d = true;
                                    s0Var.e = true;
                                    s0Var.k();
                                    Iterator it2 = s0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                s0 s0Var2 = this.b;
                                s0Var2.d = true;
                                s0Var2.e = false;
                                s0Var2.k();
                                Iterator it3 = s0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = hk0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(bd.M0(2131753053, null), new n0(f10, i11));
            }
            alertDialog$Builder.h(bd.M0(2131753058, null), new org.telegram.ui.ActionBar.p1(this) { // from class: ii.o0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i13) {
                    switch (i3) {
                        case 0:
                            s0 s0Var = this.b;
                            if (!s0Var.a()) {
                                nf.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.o1(21, s0Var, hk0Var));
                                break;
                            } else {
                                s0Var.d = true;
                                s0Var.e = true;
                                s0Var.k();
                                Iterator it2 = s0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            s0 s0Var2 = this.b;
                            s0Var2.d = true;
                            s0Var2.e = false;
                            s0Var2.k();
                            Iterator it3 = s0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = hk0Var;
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
