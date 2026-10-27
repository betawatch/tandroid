package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r5 implements e6.h {
    public static final a5 b = new a5(1);
    public final Object a;

    public r5(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // e6.h
    public void a(e6.f fVar, String str) {
        x0.j.b("onSessionStarted with sessionId = %s", str);
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0Var.c();
        y0 y0Var = x0Var.g;
        y0Var.f = str;
        x0Var.a.a((p1) x0Var.c.b(y0Var).a(), 222);
        x0.b(x0Var);
        x0Var.e();
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void b(e6.f fVar, int i10) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0.a(x0Var, i10);
    }

    public void c(int i10, Object obj, e6 e6Var) {
        v4 v4Var = (v4) this.a;
        v4Var.i(i10, 3);
        e6Var.e((q4) obj, v4Var.a);
        v4Var.i(i10, 4);
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void d(e6.f fVar, int i10) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0.a(x0Var, i10);
    }

    @Override // e6.h
    public void e(e6.f fVar, int i10) {
        x0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0Var.c();
        o6.l.h(x0Var.g);
        x0Var.a.a(x0Var.c.a(x0Var.g, i10), 225);
        x0.b(x0Var);
        x0Var.e.removeCallbacks(x0Var.d);
    }

    public void f(int i10, Object obj, e6 e6Var) {
        q4 q4Var = (q4) obj;
        v4 v4Var = (v4) this.a;
        v4Var.j((i10 << 3) | 2);
        v4Var.j(q4Var.a(e6Var));
        e6Var.e(q4Var, v4Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    @Override // e6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(e6.f fVar, String str) {
        y0 y0Var;
        h6.b bVar = x0.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        SharedPreferences sharedPreferences = x0Var.f;
        boolean g7 = x0Var.g(str);
        c cVar = x0Var.b;
        if (g7) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            o6.l.h(x0Var.g);
        } else {
            if (sharedPreferences == null) {
                h6.b bVar2 = y0.k;
            } else {
                y0Var = new y0(cVar);
                y0Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    y0Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        y0Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            y0Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                y0Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    y0Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    y0Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    y0Var.h = sharedPreferences.getString("device_model_name", "");
                                    y0Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    x0Var.g = y0Var;
                                    if (x0Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        y0 y0Var2 = new y0(cVar);
                                        y0.l++;
                                        x0Var.g = y0Var2;
                                        e6.c cVar2 = x0Var.h;
                                        if (cVar2 != null && cVar2.g.i) {
                                            z10 = true;
                                        }
                                        y0Var2.i = z10;
                                        h6.b bVar3 = e6.a.l;
                                        o6.l.e("Must be called from the main thread.");
                                        e6.a aVar = e6.a.n;
                                        o6.l.h(aVar);
                                        o6.l.e("Must be called from the main thread.");
                                        y0Var2.b = aVar.e.a;
                                        y0 y0Var3 = x0Var.g;
                                        o6.l.h(y0Var3);
                                        y0Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        o6.l.h(x0Var.g);
                                        y0.l = x0Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            y0Var = null;
            x0Var.g = y0Var;
            if (x0Var.g(str)) {
            }
        }
        o6.l.h(x0Var.g);
        o1 b10 = x0Var.c.b(x0Var.g);
        j1 m10 = k1.m(b10.d());
        m10.c();
        k1.r((k1) m10.b, 10);
        b10.e((k1) m10.a());
        j1 m11 = k1.m(b10.d());
        m11.c();
        k1.p((k1) m11.b, true);
        b10.c();
        p1.p((p1) b10.b, (k1) m11.a());
        x0Var.a.a((p1) b10.a(), 226);
    }

    @Override // e6.h
    public void l(e6.f fVar) {
        h6.b bVar = x0.j;
        bVar.b("onSessionStarting", new Object[0]);
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        if (x0Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        x0Var.d();
        z0 z0Var = x0Var.c;
        y0 y0Var = x0Var.g;
        o1 b10 = z0Var.b(y0Var);
        if (y0Var.j == 1) {
            j1 m10 = k1.m(b10.d());
            m10.c();
            k1.r((k1) m10.b, 17);
            b10.e((k1) m10.a());
        }
        x0Var.a.a((p1) b10.a(), 221);
    }

    @Override // e6.h
    public /* synthetic */ void r(e6.f fVar) {
        ((x0) this.a).h = (e6.c) fVar;
    }

    @Override // e6.h
    public void v(e6.f fVar, boolean z10) {
        x0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0Var.c();
        o6.l.h(x0Var.g);
        o1 b10 = x0Var.c.b(x0Var.g);
        j1 m10 = k1.m(b10.d());
        m10.c();
        k1.p((k1) m10.b, z10);
        b10.c();
        p1.p((p1) b10.b, (k1) m10.a());
        x0Var.a.a((p1) b10.a(), 227);
        x0.b(x0Var);
        x0Var.e();
    }

    @Override // e6.h
    public /* bridge */ /* synthetic */ void x(e6.f fVar, int i10) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (e6.c) fVar;
        x0.a(x0Var, i10);
    }

    public r5() {
        u5 u5Var;
        try {
            u5Var = (u5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            u5Var = b;
        }
        q5 q5Var = new q5(a5.b, u5Var);
        Charset charset = i5.a;
        this.a = q5Var;
    }

    public r5(v4 v4Var) {
        Charset charset = i5.a;
        this.a = v4Var;
        v4Var.a = this;
    }
}
