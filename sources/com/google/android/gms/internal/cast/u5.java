package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u5 implements p5.h {
    public static final d5 b = new d5(1);
    public final Object a;

    public u5(b1 b1Var) {
        this.a = b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    @Override // p5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(p5.f fVar, String str) {
        c1 c1Var;
        s5.b bVar = b1.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        SharedPreferences sharedPreferences = b1Var.f;
        boolean g10 = b1Var.g(str);
        d dVar = b1Var.b;
        if (g10) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            z5.l.h(b1Var.g);
        } else {
            if (sharedPreferences == null) {
                s5.b bVar2 = c1.k;
            } else {
                c1Var = new c1(dVar);
                c1Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    c1Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        c1Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            c1Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                c1Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    c1Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    c1Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    c1Var.h = sharedPreferences.getString("device_model_name", "");
                                    c1Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    b1Var.g = c1Var;
                                    if (b1Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        c1 c1Var2 = new c1(dVar);
                                        c1.l++;
                                        b1Var.g = c1Var2;
                                        p5.c cVar = b1Var.h;
                                        if (cVar != null && cVar.g.i) {
                                            z10 = true;
                                        }
                                        c1Var2.i = z10;
                                        s5.b bVar3 = p5.a.l;
                                        z5.l.e("Must be called from the main thread.");
                                        p5.a aVar = p5.a.n;
                                        z5.l.h(aVar);
                                        z5.l.e("Must be called from the main thread.");
                                        c1Var2.b = aVar.e.a;
                                        c1 c1Var3 = b1Var.g;
                                        z5.l.h(c1Var3);
                                        c1Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        z5.l.h(b1Var.g);
                                        c1.l = b1Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            c1Var = null;
            b1Var.g = c1Var;
            if (b1Var.g(str)) {
            }
        }
        z5.l.h(b1Var.g);
        s1 b10 = b1Var.c.b(b1Var.g);
        n1 m10 = o1.m(b10.d());
        m10.c();
        o1.r((o1) m10.b, 10);
        b10.e((o1) m10.a());
        n1 m11 = o1.m(b10.d());
        m11.c();
        o1.p((o1) m11.b, true);
        b10.c();
        t1.p((t1) b10.b, (o1) m11.a());
        b1Var.a.a((t1) b10.a(), 226);
    }

    @Override // p5.h
    public void b(p5.f fVar) {
        s5.b bVar = b1.j;
        bVar.b("onSessionStarting", new Object[0]);
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        if (b1Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        b1Var.d();
        d1 d1Var = b1Var.c;
        c1 c1Var = b1Var.g;
        s1 b10 = d1Var.b(c1Var);
        if (c1Var.j == 1) {
            n1 m10 = o1.m(b10.d());
            m10.c();
            o1.r((o1) m10.b, 17);
            b10.e((o1) m10.a());
        }
        b1Var.a.a((t1) b10.a(), 221);
    }

    @Override // p5.h
    public void c(p5.f fVar, int i10) {
        b1.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i10));
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1Var.c();
        z5.l.h(b1Var.g);
        b1Var.a.a(b1Var.c.a(b1Var.g, i10), 225);
        b1.b(b1Var);
        b1Var.e.removeCallbacks(b1Var.d);
    }

    @Override // p5.h
    public /* synthetic */ void d(p5.f fVar) {
        ((b1) this.a).h = (p5.c) fVar;
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void e(p5.f fVar, int i10) {
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1.a(b1Var, i10);
    }

    @Override // p5.h
    public void f(p5.f fVar, String str) {
        b1.j.b("onSessionStarted with sessionId = %s", str);
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1Var.c();
        c1 c1Var = b1Var.g;
        c1Var.f = str;
        b1Var.a.a((t1) b1Var.c.b(c1Var).a(), 222);
        b1.b(b1Var);
        b1Var.e();
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void g(p5.f fVar, int i10) {
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1.a(b1Var, i10);
    }

    @Override // p5.h
    public void h(p5.f fVar, boolean z10) {
        b1.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1Var.c();
        z5.l.h(b1Var.g);
        s1 b10 = b1Var.c.b(b1Var.g);
        n1 m10 = o1.m(b10.d());
        m10.c();
        o1.p((o1) m10.b, z10);
        b10.c();
        t1.p((t1) b10.b, (o1) m10.a());
        b1Var.a.a((t1) b10.a(), 227);
        b1.b(b1Var);
        b1Var.e();
    }

    public void i(int i10, Object obj, h6 h6Var) {
        y4 y4Var = (y4) this.a;
        y4Var.i(i10, 3);
        h6Var.e((t4) obj, y4Var.a);
        y4Var.i(i10, 4);
    }

    @Override // p5.h
    public /* bridge */ /* synthetic */ void j(p5.f fVar, int i10) {
        b1 b1Var = (b1) this.a;
        b1Var.h = (p5.c) fVar;
        b1.a(b1Var, i10);
    }

    public void k(int i10, Object obj, h6 h6Var) {
        t4 t4Var = (t4) obj;
        y4 y4Var = (y4) this.a;
        y4Var.j((i10 << 3) | 2);
        y4Var.j(t4Var.a(h6Var));
        h6Var.e(t4Var, y4Var.a);
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
