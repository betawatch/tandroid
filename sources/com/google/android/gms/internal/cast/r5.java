package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r5 implements f6.h {
    public static final a5 b = new a5(1);
    public final Object a;

    public r5(y0 y0Var) {
        this.a = y0Var;
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void a(f6.f fVar, int i3) {
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0.a(y0Var, i3);
    }

    public void b(int i3, Object obj, e6 e6Var) {
        w4 w4Var = (w4) this.a;
        w4Var.i(i3, 3);
        e6Var.e((r4) obj, w4Var.a);
        w4Var.i(i3, 4);
    }

    public void c(int i3, Object obj, e6 e6Var) {
        r4 r4Var = (r4) obj;
        w4 w4Var = (w4) this.a;
        w4Var.j((i3 << 3) | 2);
        w4Var.j(r4Var.a(e6Var));
        e6Var.e(r4Var, w4Var.a);
    }

    @Override // f6.h
    public void d(f6.f fVar, int i3) {
        y0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i3));
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0Var.c();
        p6.m.g(y0Var.g);
        y0Var.a.a(y0Var.c.a(y0Var.g, i3), hs.C3);
        y0.b(y0Var);
        y0Var.e.removeCallbacks(y0Var.d);
    }

    @Override // f6.h
    public void f(f6.f fVar, String str) {
        y0.j.b("onSessionStarted with sessionId = %s", str);
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0Var.c();
        z0 z0Var = y0Var.g;
        z0Var.f = str;
        y0Var.a.a((q1) y0Var.c.b(z0Var).a(), hs.z3);
        y0.b(y0Var);
        y0Var.e();
    }

    @Override // f6.h
    public void g(f6.f fVar) {
        i6.b bVar = y0.j;
        bVar.b("onSessionStarting", new Object[0]);
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        if (y0Var.g != null) {
            Log.w(bVar.a, bVar.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        y0Var.d();
        a1 a1Var = y0Var.c;
        z0 z0Var = y0Var.g;
        p1 b10 = a1Var.b(z0Var);
        if (z0Var.j == 1) {
            k1 m10 = l1.m(b10.d());
            m10.c();
            l1.r((l1) m10.b, 17);
            b10.e((l1) m10.a());
        }
        y0Var.a.a((q1) b10.a(), hs.y3);
    }

    @Override // f6.h
    public /* synthetic */ void h(f6.f fVar) {
        ((y0) this.a).h = (f6.c) fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // f6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(f6.f fVar, String str) {
        z0 z0Var;
        i6.b bVar = y0.j;
        boolean z10 = false;
        bVar.b("onSessionResuming with sessionId = %s", str);
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        SharedPreferences sharedPreferences = y0Var.f;
        boolean g7 = y0Var.g(str);
        c cVar = y0Var.b;
        if (g7) {
            bVar.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            p6.m.g(y0Var.g);
        } else {
            if (sharedPreferences == null) {
                i6.b bVar2 = z0.k;
            } else {
                z0Var = new z0(cVar);
                z0Var.i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    z0Var.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        z0Var.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            z0Var.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                z0Var.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    z0Var.f = sharedPreferences.getString("receiver_session_id", "");
                                    z0Var.g = sharedPreferences.getInt("device_capabilities", 0);
                                    z0Var.h = sharedPreferences.getString("device_model_name", "");
                                    z0Var.j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    y0Var.g = z0Var;
                                    if (y0Var.g(str)) {
                                        bVar.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        z0 z0Var2 = new z0(cVar);
                                        z0.l++;
                                        y0Var.g = z0Var2;
                                        f6.c cVar2 = y0Var.h;
                                        if (cVar2 != null && cVar2.g.i) {
                                            z10 = true;
                                        }
                                        z0Var2.i = z10;
                                        i6.b bVar3 = f6.a.l;
                                        p6.m.d("Must be called from the main thread.");
                                        f6.a aVar = f6.a.n;
                                        p6.m.g(aVar);
                                        p6.m.d("Must be called from the main thread.");
                                        z0Var2.b = aVar.e.a;
                                        z0 z0Var3 = y0Var.g;
                                        p6.m.g(z0Var3);
                                        z0Var3.f = str;
                                    } else {
                                        bVar.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        p6.m.g(y0Var.g);
                                        z0.l = y0Var.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z0Var = null;
            y0Var.g = z0Var;
            if (y0Var.g(str)) {
            }
        }
        p6.m.g(y0Var.g);
        p1 b10 = y0Var.c.b(y0Var.g);
        k1 m10 = l1.m(b10.d());
        m10.c();
        l1.r((l1) m10.b, 10);
        b10.e((l1) m10.a());
        k1 m11 = l1.m(b10.d());
        m11.c();
        l1.p((l1) m11.b, true);
        b10.c();
        q1.p((q1) b10.b, (l1) m11.a());
        y0Var.a.a((q1) b10.a(), hs.D3);
    }

    @Override // f6.h
    public void l(f6.f fVar, boolean z10) {
        y0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z10));
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0Var.c();
        p6.m.g(y0Var.g);
        p1 b10 = y0Var.c.b(y0Var.g);
        k1 m10 = l1.m(b10.d());
        m10.c();
        l1.p((l1) m10.b, z10);
        b10.c();
        q1.p((q1) b10.b, (l1) m10.a());
        y0Var.a.a((q1) b10.a(), 227);
        y0.b(y0Var);
        y0Var.e();
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void m(f6.f fVar, int i3) {
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0.a(y0Var, i3);
    }

    @Override // f6.h
    public /* bridge */ /* synthetic */ void n(f6.f fVar, int i3) {
        y0 y0Var = (y0) this.a;
        y0Var.h = (f6.c) fVar;
        y0.a(y0Var, i3);
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

    public r5(w4 w4Var) {
        Charset charset = i5.a;
        this.a = w4Var;
        w4Var.a = this;
    }
}
