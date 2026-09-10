package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w5 implements d6.h {
    public static final f5 b = new f5(1);
    public final Object a;

    public w5(c1 c1Var) {
        this.a = c1Var;
    }

    @Override // d6.h
    public void A(d6.f fVar, String str) {
        c1.j.b("onSessionStarted with sessionId = %s", str);
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1Var.c();
        d1 d1Var = c1Var.g;
        d1Var.f = str;
        c1Var.a.a((u1) c1Var.c.b(d1Var).a(), 222);
        c1.b(c1Var);
        c1Var.e();
    }

    @Override // d6.h
    public void B(d6.f fVar, int i10) {
        c1.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1Var.c();
        n6.l.h(c1Var.g);
        c1Var.a.a(c1Var.c.a(c1Var.g, i10), 225);
        c1.b(c1Var);
        c1Var.e.removeCallbacks(c1Var.d);
    }

    public void a(int i10, Object obj, j6 j6Var) {
        a5 a5Var = (a5) this.a;
        a5Var.i(i10, 3);
        j6Var.e((v4) obj, a5Var.a);
        a5Var.i(i10, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    @Override // d6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(d6.f fVar, String str) {
        d1 d1Var;
        g6.b bVar = c1.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        SharedPreferences sharedPreferences = c1Var.f;
        boolean g10 = c1Var.g(str);
        d dVar = c1Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            n6.l.h(c1Var.g);
        } else {
            if (sharedPreferences == null) {
                g6.b bVar2 = d1.k;
            } else {
                d1Var = new d1(dVar);
                d1Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    d1Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        d1Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            d1Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                d1Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    d1Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    d1Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    d1Var.h = sharedPreferences.getString("device_model_name", "");
                                    d1Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    c1Var.g = d1Var;
                                    if (c1Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        d1 d1Var2 = new d1(dVar);
                                        d1.l++;
                                        c1Var.g = d1Var2;
                                        d6.c cVar = c1Var.h;
                                        if (cVar != null && cVar.g.i) {
                                            z10 = true;
                                        }
                                        d1Var2.i = z10;
                                        g6.b bVar3 = d6.a.l;
                                        n6.l.e("Must be called from the main thread.");
                                        d6.a aVar = d6.a.n;
                                        n6.l.h(aVar);
                                        n6.l.e("Must be called from the main thread.");
                                        d1Var2.b = aVar.e.a;
                                        d1 d1Var3 = c1Var.g;
                                        n6.l.h(d1Var3);
                                        d1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        n6.l.h(c1Var.g);
                                        d1.l = c1Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            d1Var = null;
            c1Var.g = d1Var;
            if (c1Var.g(str)) {
            }
        }
        n6.l.h(c1Var.g);
        t1 b10 = c1Var.c.b(c1Var.g);
        o1 m10 = p1.m(b10.d());
        m10.c();
        p1.r((p1) m10.b, 10);
        b10.e((p1) m10.a());
        o1 m11 = p1.m(b10.d());
        m11.c();
        p1.p((p1) m11.b, true);
        b10.c();
        u1.p((u1) b10.b, (p1) m11.a());
        c1Var.a.a((u1) b10.a(), 226);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void c(d6.f fVar, int i10) {
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1.a(c1Var, i10);
    }

    @Override // d6.h
    public void d(d6.f fVar, boolean z10) {
        c1.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1Var.c();
        n6.l.h(c1Var.g);
        t1 b10 = c1Var.c.b(c1Var.g);
        o1 m10 = p1.m(b10.d());
        m10.c();
        p1.p((p1) m10.b, z10);
        b10.c();
        u1.p((u1) b10.b, (p1) m10.a());
        c1Var.a.a((u1) b10.a(), 227);
        c1.b(c1Var);
        c1Var.e();
    }

    public void e(int i10, Object obj, j6 j6Var) {
        v4 v4Var = (v4) obj;
        a5 a5Var = (a5) this.a;
        a5Var.j((i10 << 3) | 2);
        a5Var.j(v4Var.a(j6Var));
        j6Var.e(v4Var, a5Var.a);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void p(d6.f fVar, int i10) {
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1.a(c1Var, i10);
    }

    @Override // d6.h
    public void r(d6.f fVar) {
        g6.b bVar = c1.j;
        bVar.b("onSessionStarting", new Object[0]);
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        if (c1Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        c1Var.d();
        e1 e1Var = c1Var.c;
        d1 d1Var = c1Var.g;
        t1 b10 = e1Var.b(d1Var);
        if (d1Var.j == 1) {
            o1 m10 = p1.m(b10.d());
            m10.c();
            p1.r((p1) m10.b, 17);
            b10.e((p1) m10.a());
        }
        c1Var.a.a((u1) b10.a(), 221);
    }

    @Override // d6.h
    public /* bridge */ /* synthetic */ void v(d6.f fVar, int i10) {
        c1 c1Var = (c1) this.a;
        c1Var.h = (d6.c) fVar;
        c1.a(c1Var, i10);
    }

    @Override // d6.h
    public /* synthetic */ void z(d6.f fVar) {
        ((c1) this.a).h = (d6.c) fVar;
    }

    public w5() {
        z5 z5Var;
        try {
            z5Var = (z5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            z5Var = b;
        }
        v5 v5Var = new v5(f5.b, z5Var);
        Charset charset = n5.a;
        this.a = v5Var;
    }

    public w5(a5 a5Var) {
        Charset charset = n5.a;
        this.a = a5Var;
        a5Var.a = this;
    }
}
