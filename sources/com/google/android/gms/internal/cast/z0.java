package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z0 {
    public static final u5.b j = new u5.b("ApplicationAnalytics", null);
    public final n0 a;
    public final c b;
    public final b1 c;
    public final SharedPreferences f;
    public a1 g;
    public r5.c h;
    public boolean i;
    public final a7.e e = new a7.e(Looper.getMainLooper(), 2);
    public final u d = new u(this, 1);

    public z0(SharedPreferences sharedPreferences, n0 n0Var, c cVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = n0Var;
        this.b = cVar;
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
            u5.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        r5.c cVar = this.h;
        if (cVar != null) {
            b6.m.e("Must be called from the main thread.");
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
        b6.m.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        a1 a1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        a1 a1Var2 = new a1(this.b);
        a1.l++;
        this.g = a1Var2;
        r5.c cVar = this.h;
        a1Var2.i = cVar != null && cVar.g.i;
        u5.b bVar = r5.a.l;
        b6.m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.n;
        b6.m.h(aVar);
        b6.m.e("Must be called from the main thread.");
        a1Var2.b = aVar.e.a;
        r5.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            b6.m.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (a1Var = this.g) != null) {
            a1Var.c = castDevice.w;
            a1Var.g = castDevice.r;
            a1Var.h = castDevice.e;
        }
        a1 a1Var3 = this.g;
        b6.m.h(a1Var3);
        r5.c cVar3 = this.h;
        a1Var3.j = cVar3 != null ? cVar3.e() : 0;
        b6.m.h(this.g);
    }

    public final void e() {
        a7.e eVar = this.e;
        b6.m.h(eVar);
        u uVar = this.d;
        b6.m.h(uVar);
        eVar.postDelayed(uVar, 300000L);
    }

    public final boolean f() {
        String str;
        u5.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        u5.b bVar2 = r5.a.l;
        b6.m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.n;
        b6.m.h(aVar);
        b6.m.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        b6.m.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        b6.m.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
