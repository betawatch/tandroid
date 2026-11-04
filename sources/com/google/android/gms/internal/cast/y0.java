package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 {
    public static final i6.b j = new i6.b("ApplicationAnalytics", null);
    public final n0 a;
    public final c b;
    public final a1 c;
    public final SharedPreferences f;
    public z0 g;
    public f6.c h;
    public boolean i;
    public final z e = new z(Looper.getMainLooper(), 0);
    public final v d = new v(this, 1);

    public y0(SharedPreferences sharedPreferences, n0 n0Var, c cVar, Bundle bundle, String str) {
        this.f = sharedPreferences;
        this.a = n0Var;
        this.b = cVar;
        this.c = new a1(str, bundle);
    }

    public static void a(y0 y0Var, int i3) {
        j.b("log session ended with error = %d", Integer.valueOf(i3));
        y0Var.c();
        y0Var.a.a(y0Var.c.a(y0Var.g, i3), hs.E3);
        y0Var.e.removeCallbacks(y0Var.d);
        if (y0Var.i) {
            return;
        }
        y0Var.g = null;
    }

    public static void b(y0 y0Var) {
        z0 z0Var = y0Var.g;
        SharedPreferences sharedPreferences = y0Var.f;
        z0Var.getClass();
        if (sharedPreferences == null) {
            return;
        }
        z0.k.b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", z0Var.b);
        edit.putString("receiver_metrics_id", z0Var.c);
        edit.putLong("analytics_session_id", z0Var.d);
        edit.putInt("event_sequence_number", z0Var.e);
        edit.putString("receiver_session_id", z0Var.f);
        edit.putInt("device_capabilities", z0Var.g);
        edit.putString("device_model_name", z0Var.h);
        edit.putInt("analytics_session_start_type", z0Var.j);
        edit.putBoolean("is_output_switcher_enabled", z0Var.i);
        edit.apply();
    }

    public final void c() {
        CastDevice castDevice;
        z0 z0Var;
        if (!f()) {
            i6.b bVar = j;
            Log.w(bVar.a, bVar.d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            d();
            return;
        }
        f6.c cVar = this.h;
        if (cVar != null) {
            p6.m.d("Must be called from the main thread.");
            castDevice = cVar.k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = castDevice.x;
            if (!TextUtils.equals(this.g.c, str) && (z0Var = this.g) != null) {
                z0Var.c = str;
                z0Var.g = castDevice.r;
                z0Var.h = castDevice.e;
            }
        }
        p6.m.g(this.g);
    }

    public final void d() {
        CastDevice castDevice;
        z0 z0Var;
        j.b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        z0 z0Var2 = new z0(this.b);
        z0.l++;
        this.g = z0Var2;
        f6.c cVar = this.h;
        z0Var2.i = cVar != null && cVar.g.i;
        i6.b bVar = f6.a.l;
        p6.m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.n;
        p6.m.g(aVar);
        p6.m.d("Must be called from the main thread.");
        z0Var2.b = aVar.e.a;
        f6.c cVar2 = this.h;
        if (cVar2 == null) {
            castDevice = null;
        } else {
            p6.m.d("Must be called from the main thread.");
            castDevice = cVar2.k;
        }
        if (castDevice != null && (z0Var = this.g) != null) {
            z0Var.c = castDevice.x;
            z0Var.g = castDevice.r;
            z0Var.h = castDevice.e;
        }
        z0 z0Var3 = this.g;
        p6.m.g(z0Var3);
        f6.c cVar3 = this.h;
        z0Var3.j = cVar3 != null ? cVar3.e() : 0;
        p6.m.g(this.g);
    }

    public final void e() {
        z zVar = this.e;
        p6.m.g(zVar);
        v vVar = this.d;
        p6.m.g(vVar);
        zVar.postDelayed(vVar, 300000L);
    }

    public final boolean f() {
        String str;
        i6.b bVar = j;
        if (this.g == null) {
            bVar.b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        i6.b bVar2 = f6.a.l;
        p6.m.d("Must be called from the main thread.");
        f6.a aVar = f6.a.n;
        p6.m.g(aVar);
        p6.m.d("Must be called from the main thread.");
        String str2 = aVar.e.a;
        if (str2 == null || (str = this.g.b) == null || !TextUtils.equals(str, str2)) {
            bVar.b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        p6.m.g(this.g);
        return true;
    }

    public final boolean g(String str) {
        String str2;
        if (!f()) {
            return false;
        }
        p6.m.g(this.g);
        if (str != null && (str2 = this.g.f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        j.b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
