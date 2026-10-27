package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x0 {
    public static final h6.b j = new h6.b("ApplicationAnalytics", null);
    public final m0 a;
    public final c b;
    public final z0 c;
    public final SharedPreferences f;
    public y0 g;
    public e6.c h;
    public boolean i;
    public final y e = new y(Looper.getMainLooper(), 0);
    public final u d = new u(this, 1);

    public x0(SharedPreferences sharedPreferences, m0 m0Var, c cVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = m0Var;
        this.b = cVar;
        this.c = new z0(str, bundle);
    }

    public static void a(x0 x0Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        x0Var.c();
        x0Var.a.a(x0Var.c.a(x0Var.g, i10), 228);
        x0Var.e.removeCallbacks(x0Var.d);
        if (x0Var.i) {
            return;
        }
        x0Var.g = null;
    }

    public static void b(x0 x0Var) {
        y0 y0Var = x0Var.g;
        SharedPreferences sharedPreferences = x0Var.f;
        y0Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        y0.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", y0Var.b);
        edit.putString("receiver_metrics_id", y0Var.c);
        edit.putLong("analytics_session_id", y0Var.d);
        edit.putInt("event_sequence_number", y0Var.e);
        edit.putString("receiver_session_id", y0Var.f);
        edit.putInt("device_capabilities", y0Var.g);
        edit.putString("device_model_name", y0Var.h);
        edit.putInt("analytics_session_start_type", y0Var.j);
        edit.putBoolean("is_output_switcher_enabled", y0Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        y0 y0Var;
        if (!f()) {
            h6.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        e6.c cVar = this.h;
        if (cVar != null) {
            o6.l.e("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.w;
            if (!TextUtils.equals(this.g.c, str) && (y0Var = this.g) != null) {
                y0Var.c = str;
                y0Var.g = castDevice.r;
                y0Var.h = castDevice.e;
            }
        }
        o6.l.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        y0 y0Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        y0 y0Var2 = new y0(this.b);
        y0.l++;
        this.g = y0Var2;
        e6.c cVar = this.h;
        y0Var2.i = cVar != null && cVar.g.i;
        h6.b bVar = e6.a.l;
        o6.l.e("Must be called from the main thread.");
        e6.a aVar = e6.a.n;
        o6.l.h(aVar);
        o6.l.e("Must be called from the main thread.");
        y0Var2.b = aVar.e.a;
        e6.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            o6.l.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (y0Var = this.g) != null) {
            y0Var.c = castDevice.w;
            y0Var.g = castDevice.r;
            y0Var.h = castDevice.e;
        }
        y0 y0Var3 = this.g;
        o6.l.h(y0Var3);
        e6.c cVar3 = this.h;
        y0Var3.j = cVar3 != null ? cVar3.e() : 0;
        o6.l.h(this.g);
    }

    public final void e() {
        y yVar = this.e;
        o6.l.h(yVar);
        u uVar = this.d;
        o6.l.h(uVar);
        yVar.postDelayed(uVar, 300000L);
    }

    public final boolean f() {
        String str;
        h6.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        h6.b bVar2 = e6.a.l;
        o6.l.e("Must be called from the main thread.");
        e6.a aVar = e6.a.n;
        o6.l.h(aVar);
        o6.l.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        o6.l.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        o6.l.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
