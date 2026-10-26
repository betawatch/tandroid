package org.telegram.ui.Components;

import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pa1 implements xb1 {
    public volatile JSONObject a;
    public volatile String b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    @Override // org.telegram.ui.Components.xb1
    public final void c(String str) {
        synchronized (this.e) {
            this.b = str;
            this.e.notifyAll();
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void e(JSONObject jSONObject) {
        synchronized (this.c) {
            this.c.add(jSONObject);
        }
    }

    @Override // org.telegram.ui.Components.xb1
    public final void f(JSONObject jSONObject) {
        synchronized (this.e) {
            this.a = jSONObject;
            this.e.notifyAll();
        }
    }

    public final int h() {
        int size;
        synchronized (this.c) {
            size = this.c.size();
        }
        return size;
    }

    public final String i() {
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
    public final void j() {
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

    @Override // org.telegram.ui.Components.xb1
    public final /* synthetic */ void a(String str) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final void d(yb1 yb1Var) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final /* synthetic */ void g(String str, JSONObject jSONObject) {
    }

    @Override // org.telegram.ui.Components.xb1
    public final void b(boolean z10, boolean z11, boolean z12) {
    }
}
