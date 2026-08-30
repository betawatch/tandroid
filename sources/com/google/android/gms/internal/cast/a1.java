package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a1 {
    public static final u5.b j = new u5.b("ApplicationAnalytics", null);
    public final o0 a;
    public final c b;
    public final c1 c;
    public final SharedPreferences f;
    public b1 g;
    public r5.c h;
    public boolean i;
    public final a7.e e = new a7.e(Looper.getMainLooper(), 2);
    public final v d = new v(this, 1);

    public a1(SharedPreferences sharedPreferences, o0 o0Var, c cVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = o0Var;
        this.b = cVar;
        this.c = new c1(str, bundle);
    }

    public static void a(a1 a1Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        a1Var.c();
        a1Var.a.a(a1Var.c.a(a1Var.g, i10), 228);
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
            if (!TextUtils.equals(this.g.c, str) && (b1Var = this.g) != null) {
                b1Var.c = str;
                b1Var.g = castDevice.r;
                b1Var.h = castDevice.e;
            }
        }
        b6.m.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        b1 b1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        b1 b1Var2 = new b1(this.b);
        b1.l++;
        this.g = b1Var2;
        r5.c cVar = this.h;
        b1Var2.i = cVar != null && cVar.g.i;
        u5.b bVar = r5.a.l;
        b6.m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.n;
        b6.m.h(aVar);
        b6.m.e("Must be called from the main thread.");
        b1Var2.b = aVar.e.a;
        r5.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            b6.m.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (b1Var = this.g) != null) {
            b1Var.c = castDevice.w;
            b1Var.g = castDevice.r;
            b1Var.h = castDevice.e;
        }
        b1 b1Var3 = this.g;
        b6.m.h(b1Var3);
        r5.c cVar3 = this.h;
        b1Var3.j = cVar3 != null ? cVar3.e() : 0;
        b6.m.h(this.g);
    }

    public final void e() {
        a7.e eVar = this.e;
        b6.m.h(eVar);
        v vVar = this.d;
        b6.m.h(vVar);
        eVar.postDelayed(vVar, 300000L);
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
