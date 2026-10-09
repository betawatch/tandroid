package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u5 implements d6.h {
    public static final d5 b = new d5(1);
    public final Object a;

    public u5(a1 a1Var) {
        this.a = a1Var;
    }

    public void a(int i10, Object obj, h6 h6Var) {
        y4 y4Var = (y4) this.a;
        y4Var.i(i10, 3);
        h6Var.e((t4) obj, y4Var.a);
        y4Var.i(i10, 4);
    }

    public void b(int i10, Object obj, h6 h6Var) {
        t4 t4Var = (t4) obj;
        y4 y4Var = (y4) this.a;
        y4Var.j((i10 << 3) | 2);
        y4Var.j(t4Var.a(h6Var));
        h6Var.e(t4Var, y4Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    @Override // d6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(d6.f fVar, String str) {
        b1 b1Var;
        g6.b bVar = a1.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        SharedPreferences sharedPreferences = a1Var.f;
        boolean g10 = a1Var.g(str);
        d dVar = a1Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            n6.l.h(a1Var.g);
        } else {
            if (sharedPreferences == null) {
                g6.b bVar2 = b1.k;
            } else {
                b1Var = new b1(dVar);
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
                                        b1 b1Var2 = new b1(dVar);
                                        b1.l++;
                                        a1Var.g = b1Var2;
                                        d6.c cVar = a1Var.h;
                                        if (cVar != null && cVar.g.i) {
                                            z10 = true;
                                        }
                                        b1Var2.i = z10;
                                        g6.b bVar3 = d6.a.l;
                                        n6.l.e("Must be called from the main thread.");
                                        d6.a aVar = d6.a.n;
                                        n6.l.h(aVar);
                                        n6.l.e("Must be called from the main thread.");
                                        b1Var2.b = aVar.e.a;
                                        b1 b1Var3 = a1Var.g;
                                        n6.l.h(b1Var3);
                                        b1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        n6.l.h(a1Var.g);
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
        n6.l.h(a1Var.g);
        r1 b10 = a1Var.c.b(a1Var.g);
        m1 m10 = n1.m(b10.d());
        m10.c();
        n1.r((n1) m10.b, 10);
        b10.e((n1) m10.a());
        m1 m11 = n1.m(b10.d());
        m11.c();
        n1.p((n1) m11.b, true);
        b10.c();
        s1.p((s1) b10.b, (n1) m11.a());
        a1Var.a.a((s1) b10.a(), 226);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void g(d6.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1.a(a1Var, i10);
    }

    @Override // d6.h
    public void h(d6.f fVar, boolean z10) {
        a1.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1Var.c();
        n6.l.h(a1Var.g);
        r1 b10 = a1Var.c.b(a1Var.g);
        m1 m10 = n1.m(b10.d());
        m10.c();
        n1.p((n1) m10.b, z10);
        b10.c();
        s1.p((s1) b10.b, (n1) m10.a());
        a1Var.a.a((s1) b10.a(), 227);
        a1.b(a1Var);
        a1Var.e();
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void j(d6.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1.a(a1Var, i10);
    }

    @Override // d6.h
    public void o(d6.f fVar) {
        g6.b bVar = a1.j;
        bVar.b("onSessionStarting", new Object[0]);
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        if (a1Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        a1Var.d();
        c1 c1Var = a1Var.c;
        b1 b1Var = a1Var.g;
        r1 b10 = c1Var.b(b1Var);
        if (b1Var.j == 1) {
            m1 m10 = n1.m(b10.d());
            m10.c();
            n1.r((n1) m10.b, 17);
            b10.e((n1) m10.a());
        }
        a1Var.a.a((s1) b10.a(), 221);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void u(d6.f fVar, int i10) {
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1.a(a1Var, i10);
    }

    @Override // d6.h
    public /* synthetic */ void v(d6.f fVar) {
        ((a1) this.a).h = (d6.c) fVar;
    }

    @Override // d6.h
    public void x(d6.f fVar, String str) {
        a1.j.b("onSessionStarted with sessionId = %s", str);
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1Var.c();
        b1 b1Var = a1Var.g;
        b1Var.f = str;
        a1Var.a.a((s1) a1Var.c.b(b1Var).a(), 222);
        a1.b(a1Var);
        a1Var.e();
    }

    @Override // d6.h
    public void y(d6.f fVar, int i10) {
        a1.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        a1 a1Var = (a1) this.a;
        a1Var.h = (d6.c) fVar;
        a1Var.c();
        n6.l.h(a1Var.g);
        a1Var.a.a(a1Var.c.a(a1Var.g, i10), 225);
        a1.b(a1Var);
        a1Var.e.removeCallbacks(a1Var.d);
    }

    public u5() {
        x5 x5Var;
        try {
            x5Var = (x5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            x5Var = b;
        }
        t5 t5Var = new t5(d5.b, x5Var);
        Charset charset = l5.a;
        this.a = t5Var;
    }

    public u5(y4 y4Var) {
        Charset charset = l5.a;
        this.a = y4Var;
        y4Var.a = this;
    }
}
