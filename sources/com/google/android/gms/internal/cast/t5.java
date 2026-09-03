package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t5 implements r5.h {
    public static final c5 b = new c5(1);
    public final Object a;

    public t5(a1 a1Var) {
        this.a = a1Var;
    }

    public void a(int i10, Object obj, g6 g6Var) {
        y4 y4Var = (y4) this.a;
        y4Var.i(i10, 3);
        g6Var.e((t4) obj, y4Var.a);
        y4Var.i(i10, 4);
    }

    public void b(int i10, Object obj, g6 g6Var) {
        t4 t4Var = (t4) obj;
        y4 y4Var = (y4) this.a;
        y4Var.j((i10 << 3) | 2);
        y4Var.j(t4Var.a(g6Var));
        g6Var.e(t4Var, y4Var.a);
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void d(r5.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1.a(a1Var, i10);
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        a1.j.b("onSessionStarted with sessionId = %s", str);
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1Var.c();
        b1 b1Var = a1Var.g;
        b1Var.f = str;
        a1Var.a.a((s1) a1Var.c.b(b1Var).a(), 222);
        a1.b(a1Var);
        a1Var.e();
    }

    @Override // r5.h
    public void g(r5.f fVar, boolean z4) {
        a1.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z4));
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1Var.c();
        b6.m.h(a1Var.g);
        r1 b10 = a1Var.c.b(a1Var.g);
        m1 m9 = n1.m(b10.d());
        m9.c();
        n1.p((n1) m9.b, z4);
        b10.c();
        s1.p((s1) b10.b, (n1) m9.a());
        a1Var.a.a((s1) b10.a(), 227);
        a1.b(a1Var);
        a1Var.e();
    }

    @Override // r5.h
    public void i(r5.f fVar, int i10) {
        a1.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1Var.c();
        b6.m.h(a1Var.g);
        a1Var.a.a(a1Var.c.a(a1Var.g, i10), 225);
        a1.b(a1Var);
        a1Var.e.removeCallbacks(a1Var.d);
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void j(r5.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1.a(a1Var, i10);
    }

    @Override // r5.h
    public void k(r5.f fVar) {
        u5.b bVar = a1.j;
        bVar.b("onSessionStarting", new Object[0]);
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        if (a1Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        a1Var.d();
        c1 c1Var = a1Var.c;
        b1 b1Var = a1Var.g;
        r1 b10 = c1Var.b(b1Var);
        if (b1Var.j == 1) {
            m1 m9 = n1.m(b10.d());
            m9.c();
            n1.r((n1) m9.b, 17);
            b10.e((n1) m9.a());
        }
        a1Var.a.a((s1) b10.a(), 221);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    @Override // r5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(r5.f fVar, String str) {
        b1 b1Var;
        u5.b bVar = a1.j;
        boolean z4 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        SharedPreferences sharedPreferences = a1Var.f;
        boolean g10 = a1Var.g(str);
        c cVar = a1Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            b6.m.h(a1Var.g);
        } else {
            if (sharedPreferences == null) {
                u5.b bVar2 = b1.k;
            } else {
                b1Var = new b1(cVar);
                b1Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    b1Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        b1Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            b1Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                b1Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    b1Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    b1Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    b1Var.h = sharedPreferences.getString("device_model_name", "");
                                    b1Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    a1Var.g = b1Var;
                                    if (a1Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        b1 b1Var2 = new b1(cVar);
                                        b1.l++;
                                        a1Var.g = b1Var2;
                                        r5.c cVar2 = a1Var.h;
                                        if (cVar2 != null && cVar2.g.i) {
                                            z4 = true;
                                        }
                                        b1Var2.i = z4;
                                        u5.b bVar3 = r5.a.l;
                                        b6.m.e("Must be called from the main thread.");
                                        r5.a aVar = r5.a.n;
                                        b6.m.h(aVar);
                                        b6.m.e("Must be called from the main thread.");
                                        b1Var2.b = aVar.e.a;
                                        b1 b1Var3 = a1Var.g;
                                        b6.m.h(b1Var3);
                                        b1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        b6.m.h(a1Var.g);
                                        b1.l = a1Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b1Var = null;
            a1Var.g = b1Var;
            if (a1Var.g(str)) {
            }
        }
        b6.m.h(a1Var.g);
        r1 b10 = a1Var.c.b(a1Var.g);
        m1 m9 = n1.m(b10.d());
        m9.c();
        n1.r((n1) m9.b, 10);
        b10.e((n1) m9.a());
        m1 m10 = n1.m(b10.d());
        m10.c();
        n1.p((n1) m10.b, true);
        b10.c();
        s1.p((s1) b10.b, (n1) m10.a());
        a1Var.a.a((s1) b10.a(), 226);
    }

    @Override // r5.h
    public /* synthetic */ void m(r5.f fVar) {
        ((a1) this.a).h = (r5.c) fVar;
    }

    @Override // r5.h
    public /* bridge */ /* synthetic */ void o(r5.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (r5.c) fVar;
        a1.a(a1Var, i10);
    }

    public t5() {
        w5 w5Var;
        try {
            w5Var = (w5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            w5Var = b;
        }
        s5 s5Var = new s5(c5.b, w5Var);
        Charset charset = k5.a;
        this.a = s5Var;
    }

    public t5(y4 y4Var) {
        Charset charset = k5.a;
        this.a = y4Var;
        y4Var.a = this;
    }
}
