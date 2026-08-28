package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a1 {
    public static final q5.b j = new q5.b("ApplicationAnalytics", null);
    public final p0 a;
    public final d b;
    public final c1 c;
    public final SharedPreferences f;
    public b1 g;
    public n5.c h;
    public boolean i;
    public final c2.u0 e = new c2.u0(Looper.getMainLooper(), 1);
    public final w d = new w(this, 1);

    public a1(SharedPreferences sharedPreferences, p0 p0Var, d dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = p0Var;
        this.b = dVar;
        this.c = new c1(str, bundle);
    }

    public static void a(a1 a1Var, int i9) {
        j.b("log session ended with error = %d", Integer.valueOf(i9));
        a1Var.c();
        a1Var.a.a(a1Var.c.a(a1Var.g, i9), 228);
        a1Var.e.removeCallbacks(a1Var.d);
        if (a1Var.i) {
            return;
        }
        a1Var.g = null;
    }

    public static void b(a1 a1Var) {
        b1 b1Var = a1Var.g;
        SharedPreferences sharedPreferences = a1Var.f;
        b1Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        b1.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", b1Var.b);
        edit.putString("receiver_metrics_id", b1Var.c);
        edit.putLong("analytics_session_id", b1Var.d);
        edit.putInt("event_sequence_number", b1Var.e);
        edit.putString("receiver_session_id", b1Var.f);
        edit.putInt("device_capabilities", b1Var.g);
        edit.putString("device_model_name", b1Var.h);
        edit.putInt("analytics_session_start_type", b1Var.j);
        edit.putBoolean("is_output_switcher_enabled", b1Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        b1 b1Var;
        if (!f()) {
            q5.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        n5.c cVar = this.h;
        if (cVar != null) {
            x5.l.e("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.w;
            if (!TextUtils.equals(this.g.c, str) && (b1Var = this.g) != null) {
                b1Var.c = str;
                b1Var.g = castDevice.r;
                b1Var.h = castDevice.e;
            }
        }
        x5.l.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        b1 b1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        b1 b1Var2 = new b1(this.b);
        b1.l++;
        this.g = b1Var2;
        n5.c cVar = this.h;
        b1Var2.i = cVar != null && cVar.g.i;
        q5.b bVar = n5.a.l;
        x5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        x5.l.h(aVar);
        x5.l.e("Must be called from the main thread.");
        b1Var2.b = aVar.e.a;
        n5.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            x5.l.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (b1Var = this.g) != null) {
            b1Var.c = castDevice.w;
            b1Var.g = castDevice.r;
            b1Var.h = castDevice.e;
        }
        b1 b1Var3 = this.g;
        x5.l.h(b1Var3);
        n5.c cVar3 = this.h;
        b1Var3.j = cVar3 != null ? cVar3.e() : 0;
        x5.l.h(this.g);
    }

    public final void e() {
        c2.u0 u0Var = this.e;
        x5.l.h(u0Var);
        w wVar = this.d;
        x5.l.h(wVar);
        u0Var.postDelayed(wVar, 300000L);
    }

    public final boolean f() {
        String str;
        q5.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        q5.b bVar2 = n5.a.l;
        x5.l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.n;
        x5.l.h(aVar);
        x5.l.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        x5.l.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        x5.l.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
