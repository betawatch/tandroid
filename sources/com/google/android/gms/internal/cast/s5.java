package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s5 implements n5.i {
    public static final b5 b = new b5(1);
    public final Object a;

    public s5(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // n5.i
    public /* synthetic */ void a(n5.g gVar) {
        ((z0) this.a).h = (n5.c) gVar;
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void b(n5.g gVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0.a(z0Var, i10);
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void c(n5.g gVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0.a(z0Var, i10);
    }

    @Override // n5.i
    public void d(n5.g gVar) {
        r5.b bVar = z0.j;
        bVar.b("onSessionStarting", new Object[0]);
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        if (z0Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        z0Var.d();
        b1 b1Var = z0Var.c;
        a1 a1Var = z0Var.g;
        q1 b10 = b1Var.b(a1Var);
        if (a1Var.j == 1) {
            l1 m10 = m1.m(b10.d());
            m10.c();
            m1.r((m1) m10.b, 17);
            b10.e((m1) m10.a());
        }
        z0Var.a.a((r1) b10.a(), 221);
    }

    @Override // n5.i
    public void e(n5.g gVar, boolean z10) {
        z0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0Var.c();
        y5.l.h(z0Var.g);
        q1 b10 = z0Var.c.b(z0Var.g);
        l1 m10 = m1.m(b10.d());
        m10.c();
        m1.p((m1) m10.b, z10);
        b10.c();
        r1.p((r1) b10.b, (m1) m10.a());
        z0Var.a.a((r1) b10.a(), 227);
        z0.b(z0Var);
        z0Var.e();
    }

    @Override // n5.i
    public void f(n5.g gVar, int i10) {
        z0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0Var.c();
        y5.l.h(z0Var.g);
        z0Var.a.a(z0Var.c.a(z0Var.g, i10), 225);
        z0.b(z0Var);
        z0Var.e.removeCallbacks(z0Var.d);
    }

    public void g(int i10, Object obj, f6 f6Var) {
        w4 w4Var = (w4) this.a;
        w4Var.i(i10, 3);
        f6Var.e((r4) obj, w4Var.a);
        w4Var.i(i10, 4);
    }

    @Override // n5.i
    public /* bridge */ /* synthetic */ void h(n5.g gVar, int i10) {
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0.a(z0Var, i10);
    }

    @Override // n5.i
    public void i(n5.g gVar, String str) {
        z0.j.b("onSessionStarted with sessionId = %s", str);
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        z0Var.c();
        a1 a1Var = z0Var.g;
        a1Var.f = str;
        z0Var.a.a((r1) z0Var.c.b(a1Var).a(), 222);
        z0.b(z0Var);
        z0Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    @Override // n5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(n5.g gVar, String str) {
        a1 a1Var;
        r5.b bVar = z0.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        z0 z0Var = (z0) this.a;
        z0Var.h = (n5.c) gVar;
        SharedPreferences sharedPreferences = z0Var.f;
        boolean g10 = z0Var.g(str);
        d dVar = z0Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            y5.l.h(z0Var.g);
        } else {
            if (sharedPreferences == null) {
                r5.b bVar2 = a1.k;
            } else {
                a1Var = new a1(dVar);
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
                                        a1 a1Var2 = new a1(dVar);
                                        a1.l++;
                                        z0Var.g = a1Var2;
                                        n5.c cVar = z0Var.h;
                                        if (cVar != null && cVar.g.i) {
                                            z10 = true;
                                        }
                                        a1Var2.i = z10;
                                        r5.b bVar3 = n5.a.l;
                                        y5.l.e("Must be called from the main thread.");
                                        n5.a aVar = n5.a.n;
                                        y5.l.h(aVar);
                                        y5.l.e("Must be called from the main thread.");
                                        a1Var2.b = aVar.e.a;
                                        a1 a1Var3 = z0Var.g;
                                        y5.l.h(a1Var3);
                                        a1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        y5.l.h(z0Var.g);
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
        y5.l.h(z0Var.g);
        q1 b10 = z0Var.c.b(z0Var.g);
        l1 m10 = m1.m(b10.d());
        m10.c();
        m1.r((m1) m10.b, 10);
        b10.e((m1) m10.a());
        l1 m11 = m1.m(b10.d());
        m11.c();
        m1.p((m1) m11.b, true);
        b10.c();
        r1.p((r1) b10.b, (m1) m11.a());
        z0Var.a.a((r1) b10.a(), 226);
    }

    public void k(int i10, Object obj, f6 f6Var) {
        r4 r4Var = (r4) obj;
        w4 w4Var = (w4) this.a;
        w4Var.j((i10 << 3) | 2);
        w4Var.j(r4Var.a(f6Var));
        f6Var.e(r4Var, w4Var.a);
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

    public s5(w4 w4Var) {
        Charset charset = j5.a;
        this.a = w4Var;
        w4Var.a = this;
    }
}
