package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class q5 implements g6.h {
    public static final z4 b = new z4(1);
    public final Object a;

    public q5(x0 x0Var) {
        this.a = x0Var;
    }

    public void a(int i7, Object obj, d6 d6Var) {
        v4 v4Var = (v4) this.a;
        v4Var.i(i7, 3);
        d6Var.e((q4) obj, v4Var.a);
        v4Var.i(i7, 4);
    }

    @Override // g6.h
    public void b(g6.f fVar, boolean z9) {
        x0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z9));
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0Var.c();
        q6.m.g(x0Var.g);
        o1 b10 = x0Var.c.b(x0Var.g);
        j1 m10 = k1.m(b10.d());
        m10.c();
        k1.p((k1) m10.b, z9);
        b10.c();
        p1.p((p1) b10.b, (k1) m10.a());
        x0Var.a.a((p1) b10.a(), 227);
        x0.b(x0Var);
        x0Var.e();
    }

    @Override // g6.h
    public void c(g6.f fVar, int i7) {
        x0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i7));
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0Var.c();
        q6.m.g(x0Var.g);
        x0Var.a.a(x0Var.c.a(x0Var.g, i7), qs.C3);
        x0.b(x0Var);
        x0Var.e.removeCallbacks(x0Var.d);
    }

    public void d(int i7, Object obj, d6 d6Var) {
        q4 q4Var = (q4) obj;
        v4 v4Var = (v4) this.a;
        v4Var.j((i7 << 3) | 2);
        v4Var.j(q4Var.a(d6Var));
        d6Var.e(q4Var, v4Var.a);
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void e(g6.f fVar, int i7) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0.a(x0Var, i7);
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void f(g6.f fVar, int i7) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0.a(x0Var, i7);
    }

    @Override // g6.h
    public void i(g6.f fVar, String str) {
        x0.j.b("onSessionStarted with sessionId = %s", str);
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0Var.c();
        y0 y0Var = x0Var.g;
        y0Var.f = str;
        x0Var.a.a((p1) x0Var.c.b(y0Var).a(), qs.z3);
        x0.b(x0Var);
        x0Var.e();
    }

    @Override // g6.h
    public /* bridge */ /* synthetic */ void j(g6.f fVar, int i7) {
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        x0.a(x0Var, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // g6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(g6.f fVar, String str) {
        y0 y0Var;
        j6.b bVar = x0.j;
        boolean z9 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
        SharedPreferences sharedPreferences = x0Var.f;
        boolean g10 = x0Var.g(str);
        c cVar = x0Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            q6.m.g(x0Var.g);
        } else {
            if (sharedPreferences == null) {
                j6.b bVar2 = y0.k;
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
                                        g6.c cVar2 = x0Var.h;
                                        if (cVar2 != null && cVar2.g.i) {
                                            z9 = true;
                                        }
                                        y0Var2.i = z9;
                                        j6.b bVar3 = g6.a.l;
                                        q6.m.d("Must be called from the main thread.");
                                        g6.a aVar = g6.a.n;
                                        q6.m.g(aVar);
                                        q6.m.d("Must be called from the main thread.");
                                        y0Var2.b = aVar.e.a;
                                        y0 y0Var3 = x0Var.g;
                                        q6.m.g(y0Var3);
                                        y0Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        q6.m.g(x0Var.g);
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
        q6.m.g(x0Var.g);
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
        x0Var.a.a((p1) b10.a(), qs.D3);
    }

    @Override // g6.h
    public void s(g6.f fVar) {
        j6.b bVar = x0.j;
        bVar.b("onSessionStarting", new Object[0]);
        x0 x0Var = (x0) this.a;
        x0Var.h = (g6.c) fVar;
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
        x0Var.a.a((p1) b10.a(), qs.y3);
    }

    @Override // g6.h
    public /* synthetic */ void t(g6.f fVar) {
        ((x0) this.a).h = (g6.c) fVar;
    }

    public q5() {
        t5 t5Var;
        try {
            t5Var = (t5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            t5Var = b;
        }
        p5 p5Var = new p5(z4.b, t5Var);
        Charset charset = h5.a;
        this.a = p5Var;
    }

    public q5(v4 v4Var) {
        Charset charset = h5.a;
        this.a = v4Var;
        v4Var.a = this;
    }
}
