package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z0 {
    public static final g6.b j = new g6.b("ApplicationAnalytics", null);
    public final o0 a;
    public final c b;
    public final b1 c;
    public final SharedPreferences f;
    public a1 g;
    public d6.c h;
    public boolean i;
    public final z e = new z(Looper.getMainLooper(), 0);
    public final v d = new v(this, 1);

    public z0(SharedPreferences sharedPreferences, o0 o0Var, c cVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = o0Var;
        this.b = cVar;
        this.c = new b1(str, bundle);
    }

    public static void a(z0 z0Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        z0Var.c();
        z0Var.a.a(z0Var.c.a(z0Var.g, i10), zs.E3);
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
            g6.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        d6.c cVar = this.h;
        if (cVar != null) {
            n6.l.d("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.x;
            if (!TextUtils.equals(this.g.c, str) && (a1Var = this.g) != null) {
                a1Var.c = str;
                a1Var.g = castDevice.r;
                a1Var.h = castDevice.e;
            }
        }
        n6.l.g(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        a1 a1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        a1 a1Var2 = new a1(this.b);
        a1.l++;
        this.g = a1Var2;
        d6.c cVar = this.h;
        a1Var2.i = cVar != null && cVar.g.i;
        g6.b bVar = d6.a.l;
        n6.l.d("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.g(aVar);
        n6.l.d("Must be called from the main thread.");
        a1Var2.b = aVar.e.a;
        d6.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            n6.l.d("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (a1Var = this.g) != null) {
            a1Var.c = castDevice.x;
            a1Var.g = castDevice.r;
            a1Var.h = castDevice.e;
        }
        a1 a1Var3 = this.g;
        n6.l.g(a1Var3);
        d6.c cVar3 = this.h;
        a1Var3.j = cVar3 != null ? cVar3.e() : 0;
        n6.l.g(this.g);
    }

    public final void e() {
        z zVar = this.e;
        n6.l.g(zVar);
        v vVar = this.d;
        n6.l.g(vVar);
        zVar.postDelayed(vVar, 300000L);
    }

    public final boolean f() {
        String str;
        g6.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        g6.b bVar2 = d6.a.l;
        n6.l.d("Must be called from the main thread.");
        d6.a aVar = d6.a.n;
        n6.l.g(aVar);
        n6.l.d("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        n6.l.g(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        n6.l.g(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
