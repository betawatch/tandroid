package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qa1 implements cc1 {
    public volatile JSONObject a;
    public volatile String b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    @Override // org.telegram.ui.Components.cc1
    public final void e(String str) {
        synchronized (this.e) {
            this.b = str;
            this.e.notifyAll();
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void g(JSONObject jSONObject) {
        synchronized (this.c) {
            this.c.add(jSONObject);
        }
    }

    @Override // org.telegram.ui.Components.cc1
    public final void h(JSONObject jSONObject) {
        synchronized (this.e) {
            this.a = jSONObject;
            this.e.notifyAll();
        }
    }

    public final int k() {
        int size;
        synchronized (this.c) {
            size = this.c.size();
        }
        return size;
    }

    public final String l() {
        String obj;
        synchronized (this.c) {
            obj = this.c.toString();
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m() {
        long uptimeMillis = SystemClock.uptimeMillis() + 10000;
        synchronized (this.e) {
            while (true) {
                try {
                    if (this.a != null && (this.a.optBoolean("loaded") || !this.a.optString("dead").isEmpty())) {
                        break;
                    }
                    if (this.b != null) {
                        return;
                    }
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        return;
                    } else {
                        this.e.wait(uptimeMillis2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final int n() {
        int i10;
        synchronized (this.c) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    if ("haptic".equals(((JSONObject) obj).optString("kind"))) {
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final int o(int i10) {
        int i11;
        synchronized (this.c) {
            i11 = 0;
            while (i10 < this.c.size()) {
                try {
                    if ("haptic".equals(((JSONObject) this.c.get(i10)).optString("kind"))) {
                        i11++;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return i11;
    }

    public final int p(int i10) {
        int i11;
        synchronized (this.c) {
            i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                try {
                    if (i12 >= this.c.size()) {
                        break;
                    }
                    if ("haptic".equals(((JSONObject) this.c.get(i12)).optString("kind"))) {
                        i11++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return i11;
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
    public final void f(dc1 dc1Var) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void i(long j10, String str) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final /* synthetic */ void j(String str, JSONObject jSONObject) {
    }

    @Override // org.telegram.ui.Components.cc1
    public final void d(boolean z10, boolean z11, boolean z12) {
    }
}
