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
import c8.ia;
import fi.qb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class r0 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public final HashSet f;

    public r0(Context context, int i7, long j3) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.a = context;
        this.b = i7;
        this.c = j3;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i7, 0);
        this.d = sharedPreferences.getBoolean(j3 + "_requested", false);
        boolean z9 = sharedPreferences.getBoolean(j3 + "_granted", false);
        this.e = z9;
        if (!z9 || a()) {
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
        for (int i7 = 0; i7 < 4; i7++) {
            context.getSharedPreferences("botlocation_" + i7, 0).edit().clear().apply();
        }
        g.clear();
    }

    public static r0 e(Context context, int i7, long j3) {
        Pair pair = new Pair(Integer.valueOf(i7), Long.valueOf(j3));
        HashMap hashMap = g;
        r0 r0Var = (r0) hashMap.get(pair);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(context, i7, j3);
        hashMap.put(pair, r0Var2);
        return r0Var2;
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
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i7 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i7 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i7 >= 26) {
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
        Activity activity = LaunchActivity.G1;
        if (activity == null) {
            activity = org.telegram.messenger.g0.W(this.a);
        }
        return activity == null ? org.telegram.messenger.g0.W(org.telegram.messenger.t0.b) : activity;
    }

    public final boolean g() {
        return a() && this.e;
    }

    public final void i(final org.telegram.ui.web.n nVar) {
        Activity f10;
        Activity f11 = f();
        if (f11 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            nVar.a(bool, bool);
            return;
        }
        if (a() && (this.d || this.e)) {
            nVar.a(Boolean.FALSE, Boolean.TRUE);
            return;
        }
        final int i7 = 1;
        final boolean[] zArr = new boolean[1];
        int i10 = this.b;
        TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(this.c));
        final int i11 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f11, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, 2131753057, t10.p(a22), t10.p(a22)));
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = X2;
        q0 q0Var = new q0(this.a, p10.i(i10).f(), a22);
        int i12 = k6.L5;
        int x02 = k6.x0(null, i12, false);
        u1Var.b0 = q0Var;
        u1Var.c0 = x02;
        u1Var.d0 = -1;
        alertDialog$Builder.n(i12, null);
        if (a() || (f10 = f()) == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
            alertDialog$Builder.k(id.M0(2131753059, null), new org.telegram.ui.ActionBar.r1(this) { // from class: hi.n0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                    switch (i11) {
                        case 0:
                            r0 r0Var = this.b;
                            r0Var.getClass();
                            zArr[0] = true;
                            boolean a10 = r0Var.a();
                            org.telegram.ui.web.n nVar2 = nVar;
                            if (!a10) {
                                ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(16, r0Var, nVar2));
                                break;
                            } else {
                                r0Var.d = true;
                                r0Var.e = true;
                                r0Var.k();
                                Iterator it = r0Var.f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                nVar2.a(bool2, bool2);
                                break;
                            }
                        default:
                            r0 r0Var2 = this.b;
                            r0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                r0Var2.d = true;
                                r0Var2.e = false;
                                r0Var2.k();
                                Iterator it2 = r0Var2.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                nVar.a(Boolean.TRUE, Boolean.FALSE);
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            alertDialog$Builder.k(id.M0(2131753053, null), new a3.h(f11, zArr, nVar, 11));
        }
        alertDialog$Builder.h(id.M0(2131753058, null), new org.telegram.ui.ActionBar.r1(this) { // from class: hi.n0
            public final /* synthetic */ r0 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.r1
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                switch (i7) {
                    case 0:
                        r0 r0Var = this.b;
                        r0Var.getClass();
                        zArr[0] = true;
                        boolean a10 = r0Var.a();
                        org.telegram.ui.web.n nVar2 = nVar;
                        if (!a10) {
                            ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(16, r0Var, nVar2));
                            break;
                        } else {
                            r0Var.d = true;
                            r0Var.e = true;
                            r0Var.k();
                            Iterator it = r0Var.f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            nVar2.a(bool2, bool2);
                            break;
                        }
                    default:
                        r0 r0Var2 = this.b;
                        r0Var2.getClass();
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            r0Var2.d = true;
                            r0Var2.e = false;
                            r0Var2.k();
                            Iterator it2 = r0Var2.f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            nVar.a(Boolean.TRUE, Boolean.FALSE);
                            break;
                        }
                        break;
                }
            }
        });
        alertDialog$Builder.j(new o0(this, zArr, nVar, i11));
        alertDialog$Builder.p();
    }

    public final void j(c20 c20Var) {
        JSONObject jSONObject = new JSONObject();
        int i7 = 1;
        if (!this.e || !a() || !d()) {
            try {
                jSONObject.put("available", false);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            c20Var.a(jSONObject);
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
                c20Var.a(h(location));
                return;
            }
            try {
                p0 p0Var = new p0(this, locationManager, new LocationListener[]{p0Var}, c20Var);
                locationManager.requestLocationUpdates("gps", 1L, 0.0f, p0Var);
                return;
            } catch (Exception e11) {
                a8.g(e11, true);
                c20Var.a(h(null));
                return;
            }
        }
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = org.telegram.messenger.t0.b;
        }
        if (context != null) {
            try {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                int i10 = k6.L5;
                alertDialog$Builder.m(R.raw.permission_request_location, 72, k6.x0(null, i10, false), null);
                alertDialog$Builder.n(i10, null);
                alertDialog$Builder.a.T = id.M0(2131749531, null);
                alertDialog$Builder.k(id.M0(2131751161, null), new qb(context, i7));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                alertDialog$Builder.p();
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
        c20Var.a(h(null));
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("botlocation_" + this.b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j3 = this.c;
        edit.putBoolean(a8.p0.r(sb2, j3, "_granted"), this.e);
        edit.putBoolean(j3 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z9, final qn0 qn0Var) {
        final int i7 = 1;
        this.d = true;
        if (!z9 || a()) {
            this.e = z9;
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (qn0Var != null) {
                qn0Var.run();
            }
        } else {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i10 = this.b;
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(this.c));
            final int i11 = 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, 2131753057, t10.p(a22), t10.p(a22)));
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = X2;
            q0 q0Var = new q0(this.a, p10.i(i10).f(), a22);
            int i12 = k6.L5;
            int x02 = k6.x0(null, i12, false);
            u1Var.b0 = q0Var;
            u1Var.c0 = x02;
            u1Var.d0 = -1;
            alertDialog$Builder.n(i12, null);
            Activity f11 = f();
            if (f11 == null || (f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f11.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(id.M0(2131753059, null), new org.telegram.ui.ActionBar.r1(this) { // from class: hi.m0
                    public final /* synthetic */ r0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                        switch (i11) {
                            case 0:
                                r0 r0Var = this.b;
                                if (!r0Var.a()) {
                                    ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(17, r0Var, qn0Var));
                                    break;
                                } else {
                                    r0Var.d = true;
                                    r0Var.e = true;
                                    r0Var.k();
                                    Iterator it2 = r0Var.f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    break;
                                }
                            default:
                                r0 r0Var2 = this.b;
                                r0Var2.d = true;
                                r0Var2.e = false;
                                r0Var2.k();
                                Iterator it3 = r0Var2.f.iterator();
                                while (it3.hasNext()) {
                                    ((Runnable) it3.next()).run();
                                }
                                Runnable runnable = qn0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                                break;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(id.M0(2131753053, null), new l0(f10, i11));
            }
            alertDialog$Builder.h(id.M0(2131753058, null), new org.telegram.ui.ActionBar.r1(this) { // from class: hi.m0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i13) {
                    switch (i7) {
                        case 0:
                            r0 r0Var = this.b;
                            if (!r0Var.a()) {
                                ia.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new ai.f1(17, r0Var, qn0Var));
                                break;
                            } else {
                                r0Var.d = true;
                                r0Var.e = true;
                                r0Var.k();
                                Iterator it2 = r0Var.f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                break;
                            }
                        default:
                            r0 r0Var2 = this.b;
                            r0Var2.d = true;
                            r0Var2.e = false;
                            r0Var2.k();
                            Iterator it3 = r0Var2.f.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            Runnable runnable = qn0Var;
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
