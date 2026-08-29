package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b1 {
    public static final s5.b j = new s5.b("ApplicationAnalytics", null);
    public final p0 a;
    public final d b;
    public final d1 c;
    public final SharedPreferences f;
    public c1 g;
    public p5.c h;
    public boolean i;
    public final c2.v0 e = new c2.v0(Looper.getMainLooper(), 1);
    public final w d = new w(this, 1);

    public b1(SharedPreferences sharedPreferences, p0 p0Var, d dVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = p0Var;
        this.b = dVar;
        this.c = new d1(str, bundle);
    }

    public static void a(b1 b1Var, int i10) {
        j.b("log session ended with error = %d", Integer.valueOf(i10));
        b1Var.c();
        b1Var.a.a(b1Var.c.a(b1Var.g, i10), 228);
        b1Var.e.removeCallbacks(b1Var.d);
        if (b1Var.i) {
            return;
        }
        b1Var.g = null;
    }

    public static void b(b1 b1Var) {
        c1 c1Var = b1Var.g;
        SharedPreferences sharedPreferences = b1Var.f;
        c1Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        c1.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", c1Var.b);
        edit.putString("receiver_metrics_id", c1Var.c);
        edit.putLong("analytics_session_id", c1Var.d);
        edit.putInt("event_sequence_number", c1Var.e);
        edit.putString("receiver_session_id", c1Var.f);
        edit.putInt("device_capabilities", c1Var.g);
        edit.putString("device_model_name", c1Var.h);
        edit.putInt("analytics_session_start_type", c1Var.j);
        edit.putBoolean("is_output_switcher_enabled", c1Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        c1 c1Var;
        if (!f()) {
            s5.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        p5.c cVar = this.h;
        if (cVar != null) {
            z5.l.e("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.w;
            if (!TextUtils.equals(this.g.c, str) && (c1Var = this.g) != null) {
                c1Var.c = str;
                c1Var.g = castDevice.r;
                c1Var.h = castDevice.e;
            }
        }
        z5.l.h(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        c1 c1Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        c1 c1Var2 = new c1(this.b);
        c1.l++;
        this.g = c1Var2;
        p5.c cVar = this.h;
        c1Var2.i = cVar != null && cVar.g.i;
        s5.b bVar = p5.a.l;
        z5.l.e("Must be called from the main thread.");
        p5.a aVar = p5.a.n;
        z5.l.h(aVar);
        z5.l.e("Must be called from the main thread.");
        c1Var2.b = aVar.e.a;
        p5.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            z5.l.e("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (c1Var = this.g) != null) {
            c1Var.c = castDevice.w;
            c1Var.g = castDevice.r;
            c1Var.h = castDevice.e;
        }
        c1 c1Var3 = this.g;
        z5.l.h(c1Var3);
        p5.c cVar3 = this.h;
        c1Var3.j = cVar3 != null ? cVar3.e() : 0;
        z5.l.h(this.g);
    }

    public final void e() {
        c2.v0 v0Var = this.e;
        z5.l.h(v0Var);
        w wVar = this.d;
        z5.l.h(wVar);
        v0Var.postDelayed(wVar, 300000L);
    }

    public final boolean f() {
        String str;
        s5.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        s5.b bVar2 = p5.a.l;
        z5.l.e("Must be called from the main thread.");
        p5.a aVar = p5.a.n;
        z5.l.h(aVar);
        z5.l.e("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        z5.l.h(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        z5.l.h(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
