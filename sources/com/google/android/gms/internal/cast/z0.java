package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z0 {
    public static final r5.b j = new r5.b("ApplicationAnalytics", null);
    public final o0 a;
    public final d b;
    public final b1 c;
    public final SharedPreferences f;
    public a1 g;
    public n5.c h;
    public boolean i;
    public final c2.t0 e = new c2.t0(Looper.getMainLooper(), 1);
    public final v d = new v(this, 1);

    public z0(SharedPreferences sharedPreferences, o0 o0Var, d dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = o0Var;
        this.b = dVar;
        this.c = new b1(str, bundle);
    }

    public static void a(z0 z0Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        z0Var.c();
        z0Var.a.a(z0Var.c.a(z0Var.g, i10), 228);
        z0Var.e.removeCallbacks(z0Var.d);
        if (z0Var.i) {
            return;
        }
        z0Var.g = null;
    }

    public static void b(z0 z0Var) {
        a1 a1Var = z0Var.g;
        SharedPreferences sharedPreferences = z0Var.f;
        a1Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        a1.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", a1Var.b);
        edit.putString("receiver_metrics_id", a1Var.c);
        edit.putLong("analytics_session_id", a1Var.d);
        edit.putInt("event_sequence_number", a1Var.e);
        edit.putString("receiver_session_id", a1Var.f);
        edit.putInt("device_capabilities", a1Var.g);
        edit.putString("device_model_name", a1Var.h);
        edit.putInt("analytics_session_start_type", a1Var.j);
        edit.putBoolean("is_output_switcher_enabled", a1Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        a1 a1Var;
        if (!f()) {
            r5.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        n5.c cVar = this.h;
        if (cVar != null) {
            y5.l.e("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.w;
            if (!TextUtils.equals(this.g.c, str) && (a1Var = this.g) != null) {
                a1Var.c = str;
                a1Var.g = castDevice.r;
                a1Var.h = castDevice.e;
            }
        }
        y5.l.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        a1 a1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        a1 a1Var2 = new a1(this.b);
        a1.l++;
        this.g = a1Var2;
        n5.c cVar = this.h;
        a1Var2.i = cVar != null && cVar.g.i;
        r5.b bVar = n5.a.l;
        y5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        y5.l.h(aVar);
        y5.l.e("Must be called from the main thread.");
        a1Var2.b = aVar.e.a;
        n5.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            y5.l.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (a1Var = this.g) != null) {
            a1Var.c = castDevice.w;
            a1Var.g = castDevice.r;
            a1Var.h = castDevice.e;
        }
        a1 a1Var3 = this.g;
        y5.l.h(a1Var3);
        n5.c cVar3 = this.h;
        a1Var3.j = cVar3 != null ? cVar3.e() : 0;
        y5.l.h(this.g);
    }

    public final void e() {
        c2.t0 t0Var = this.e;
        y5.l.h(t0Var);
        v vVar = this.d;
        y5.l.h(vVar);
        t0Var.postDelayed(vVar, 300000L);
    }

    public final boolean f() {
        String str;
        r5.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        r5.b bVar2 = n5.a.l;
        y5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        y5.l.h(aVar);
        y5.l.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        y5.l.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        y5.l.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
