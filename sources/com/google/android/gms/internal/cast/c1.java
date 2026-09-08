package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class c1 {
    public static final g6.b j = new g6.b("ApplicationAnalytics", null);
    public final r0 a;
    public final d b;
    public final e1 c;
    public final SharedPreferences f;
    public d1 g;
    public d6.c h;
    public boolean i;
    public final c0 e = new c0(Looper.getMainLooper(), 0);
    public final x d = new x(this, 1);

    public c1(SharedPreferences sharedPreferences, r0 r0Var, d dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = r0Var;
        this.b = dVar;
        this.c = new e1(str, bundle);
    }

    public static void a(c1 c1Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        c1Var.c();
        c1Var.a.a(c1Var.c.a(c1Var.g, i10), 228);
        c1Var.e.removeCallbacks(c1Var.d);
        if (c1Var.i) {
            return;
        }
        c1Var.g = null;
    }

    public static void b(c1 c1Var) {
        d1 d1Var = c1Var.g;
        SharedPreferences sharedPreferences = c1Var.f;
        d1Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        d1.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", d1Var.b);
        edit.putString("receiver_metrics_id", d1Var.c);
        edit.putLong("analytics_session_id", d1Var.d);
        edit.putInt("event_sequence_number", d1Var.e);
        edit.putString("receiver_session_id", d1Var.f);
        edit.putInt("device_capabilities", d1Var.g);
        edit.putString("device_model_name", d1Var.h);
        edit.putInt("analytics_session_start_type", d1Var.j);
        edit.putBoolean("is_output_switcher_enabled", d1Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        d1 d1Var;
        if (!f()) {
            g6.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        d6.c cVar = this.h;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.w;
            if (!TextUtils.equals(this.g.c, str) && (d1Var = this.g) != null) {
                d1Var.c = str;
                d1Var.g = castDevice.r;
                d1Var.h = castDevice.e;
            }
        }
        n6.l.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        d1 d1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        d1 d1Var2 = new d1(this.b);
        d1.l++;
        this.g = d1Var2;
        d6.c cVar = this.h;
        d1Var2.i = cVar != null && cVar.g.i;
        g6.b bVar = d6.a.l;
        n6.l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.h(aVar);
        n6.l.e("Must be called from the main thread.");
        d1Var2.b = aVar.e.a;
        d6.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            n6.l.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (d1Var = this.g) != null) {
            d1Var.c = castDevice.w;
            d1Var.g = castDevice.r;
            d1Var.h = castDevice.e;
        }
        d1 d1Var3 = this.g;
        n6.l.h(d1Var3);
        d6.c cVar3 = this.h;
        d1Var3.j = cVar3 != null ? cVar3.e() : 0;
        n6.l.h(this.g);
    }

    public final void e() {
        c0 c0Var = this.e;
        n6.l.h(c0Var);
        x xVar = this.d;
        n6.l.h(xVar);
        c0Var.postDelayed(xVar, 300000L);
    }

    public final boolean f() {
        String str;
        g6.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        g6.b bVar2 = d6.a.l;
        n6.l.e("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.h(aVar);
        n6.l.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        n6.l.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        n6.l.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
