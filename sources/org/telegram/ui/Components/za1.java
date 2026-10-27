package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class za1 implements cc1 {
    public volatile JSONObject a;
    public volatile dc1 b;
    public volatile JSONObject c;
    public volatile boolean[] d;
    public final ArrayList e = new ArrayList();
    public final Object f = new Object();

    @Override // org.telegram.ui.Components.cc1
    public final void d(boolean z10, boolean z11, boolean z12) {
        synchronized (this.f) {
            this.d = new boolean[]{z10, z11, z12};
            this.f.notifyAll();
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void g(JSONObject jSONObject) {
        synchronized (this.e) {
            this.e.add(jSONObject);
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void i(long j10, String str) {
        JSONObject optJSONObject = this.c == null ? null : this.c.optJSONObject(str);
        dc1 dc1Var = this.b;
        if (dc1Var == null) {
            return;
        }
        if (optJSONObject == null) {
            dc1Var.a(3, null, j10);
        } else {
            dc1Var.a(0, optJSONObject.has("result") ? optJSONObject.optString("result").replace("{n}", "1").replace("{from}", "Tester").replace("{time}", "12:00") : null, j10);
        }
    }

    public final void k(Utilities.CallbackReturn callbackReturn, long j10) {
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        synchronized (this.f) {
            while (true) {
                try {
                    if (this.a != null && ((Boolean) callbackReturn.run(this.a)).booleanValue()) {
                        return;
                    }
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        return;
                    } else {
                        this.f.wait(uptimeMillis2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void a(boolean z10) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void b(String str) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void c(String str) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final void e(String str) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final void f(dc1 dc1Var) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final void h(JSONObject jSONObject) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
    }
}
