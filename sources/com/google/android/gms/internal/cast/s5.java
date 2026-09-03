package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s5 implements r5.h {
    public static final b5 b = new b5(1);
    public final Object a;

    public s5(z0 z0Var) {
        this.a = z0Var;
    }

    public void a(int i10, Object obj, f6 f6Var) {
        x4 x4Var = (x4) this.a;
        x4Var.i(i10, 3);
        f6Var.e((s4) obj, x4Var.a);
        x4Var.i(i10, 4);
    }

    public void b(int i10, Object obj, f6 f6Var) {
        s4 s4Var = (s4) obj;
        x4 x4Var = (x4) this.a;
        x4Var.j((i10 << 3) | 2);
        x4Var.j(s4Var.a(f6Var));
        f6Var.e(s4Var, x4Var.a);
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void e(r5.f fVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0.a(z0Var, i10);
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        z0.j.b("onSessionStarted with sessionId = %s", str);
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0Var.c();
        a1 a1Var = z0Var.g;
        a1Var.f = str;
        z0Var.a.a((r1) z0Var.c.b(a1Var).a(), 222);
        z0.b(z0Var);
        z0Var.e();
    }

    @Override // r5.h
    public void g(r5.f fVar, boolean z4) {
        z0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z4));
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0Var.c();
        b6.m.h(z0Var.g);
        q1 b10 = z0Var.c.b(z0Var.g);
        l1 m9 = m1.m(b10.d());
        m9.c();
        m1.p((m1) m9.b, z4);
        b10.c();
        r1.p((r1) b10.b, (m1) m9.a());
        z0Var.a.a((r1) b10.a(), 227);
        z0.b(z0Var);
        z0Var.e();
    }

    @Override // r5.h
    public void h(r5.f fVar, int i10) {
        z0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0Var.c();
        b6.m.h(z0Var.g);
        z0Var.a.a(z0Var.c.a(z0Var.g, i10), 225);
        z0.b(z0Var);
        z0Var.e.removeCallbacks(z0Var.d);
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void i(r5.f fVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0.a(z0Var, i10);
    }

    @Override // r5.h
    public void j(r5.f fVar) {
        u5.b bVar = z0.j;
        bVar.b("onSessionStarting", new Object[0]);
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        if (z0Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        z0Var.d();
        b1 b1Var = z0Var.c;
        a1 a1Var = z0Var.g;
        q1 b10 = b1Var.b(a1Var);
        if (a1Var.j == 1) {
            l1 m9 = m1.m(b10.d());
            m9.c();
            m1.r((m1) m9.b, 17);
            b10.e((m1) m9.a());
        }
        z0Var.a.a((r1) b10.a(), 221);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    @Override // r5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(r5.f fVar, String str) {
        a1 a1Var;
        u5.b bVar = z0.j;
        boolean z4 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        SharedPreferences sharedPreferences = z0Var.f;
        boolean g10 = z0Var.g(str);
        c cVar = z0Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            b6.m.h(z0Var.g);
        } else {
            if (sharedPreferences == null) {
                u5.b bVar2 = a1.k;
            } else {
                a1Var = new a1(cVar);
                a1Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    a1Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        a1Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            a1Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                a1Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    a1Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    a1Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    a1Var.h = sharedPreferences.getString("device_model_name", "");
                                    a1Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    z0Var.g = a1Var;
                                    if (z0Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        a1 a1Var2 = new a1(cVar);
                                        a1.l++;
                                        z0Var.g = a1Var2;
                                        r5.c cVar2 = z0Var.h;
                                        if (cVar2 != null && cVar2.g.i) {
                                            z4 = true;
                                        }
                                        a1Var2.i = z4;
                                        u5.b bVar3 = r5.a.l;
                                        b6.m.e("Must be called from the main thread.");
                                        r5.a aVar = r5.a.n;
                                        b6.m.h(aVar);
                                        b6.m.e("Must be called from the main thread.");
                                        a1Var2.b = aVar.e.a;
                                        a1 a1Var3 = z0Var.g;
                                        b6.m.h(a1Var3);
                                        a1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        b6.m.h(z0Var.g);
                                        a1.l = z0Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a1Var = null;
            z0Var.g = a1Var;
            if (z0Var.g(str)) {
            }
        }
        b6.m.h(z0Var.g);
        q1 b10 = z0Var.c.b(z0Var.g);
        l1 m9 = m1.m(b10.d());
        m9.c();
        m1.r((m1) m9.b, 10);
        b10.e((m1) m9.a());
        l1 m10 = m1.m(b10.d());
        m10.c();
        m1.p((m1) m10.b, true);
        b10.c();
        r1.p((r1) b10.b, (m1) m10.a());
        z0Var.a.a((r1) b10.a(), 226);
    }

    @Override // r5.h
    public /* synthetic */ void m(r5.f fVar) {
        ((z0) this.a).h = (r5.c) fVar;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void o(r5.f fVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (r5.c) fVar;
        z0.a(z0Var, i10);
    }

    public s5() {
        v5 v5Var;
        try {
            v5Var = (v5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            v5Var = b;
        }
        r5 r5Var = new r5(b5.b, v5Var);
        Charset charset = j5.a;
        this.a = r5Var;
    }

    public s5(x4 x4Var) {
        Charset charset = j5.a;
        this.a = x4Var;
        x4Var.a = this;
    }
}
