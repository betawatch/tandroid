package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ya1 implements xb1 {
    public volatile JSONObject a;
    public volatile boolean[] b;
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();

    @Override // org.telegram.ui.Components.xb1
    public final void b(boolean z10, boolean z11, boolean z12) {
        synchronized (this.d) {
            this.b = new boolean[]{z10, z11, z12};
            this.d.notifyAll();
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void e(JSONObject jSONObject) {
        synchronized (this.c) {
            this.c.add(jSONObject);
        }
    }

    public final void h(Utilities.CallbackReturn callbackReturn, long j10) {
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        synchronized (this.d) {
            while (true) {
                try {
                    if (this.a != null && ((Boolean) callbackReturn.run(this.a)).booleanValue()) {
                        return;
                    }
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        return;
                    } else {
                        this.d.wait(uptimeMillis2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final /* synthetic */ void a(String str) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final void c(String str) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final void d(yb1 yb1Var) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final void f(JSONObject jSONObject) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final /* synthetic */ void g(String str, JSONObject jSONObject) {
    }
}
