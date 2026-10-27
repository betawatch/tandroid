package org.telegram.ui.Components;

import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dc1 b;

    public /* synthetic */ oa1(dc1 dc1Var, int i10) {
        this.a = i10;
        this.b = dc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ac1 ac1Var;
        JSONObject jSONObject;
        cc1 cc1Var;
        int i10;
        switch (this.a) {
            case 0:
                dc1 dc1Var = this.b;
                long j10 = dc1Var.s;
                if (dc1Var.t || j10 == 0) {
                    return;
                }
                WidgetSandboxNative.touch(j10, 0, 5.0f, 5.0f, 0, true, false, 0, 0);
                return;
            case 1:
                dc1 dc1Var2 = this.b;
                long j11 = dc1Var2.s;
                if (dc1Var2.t || j11 == 0) {
                    return;
                }
                WidgetSandboxNative.touch(j11, 2, 5.0f, 5.0f, 0, true, false, 0, 0);
                return;
            case 2:
                this.b.b();
                return;
            case 3:
                dc1 dc1Var3 = this.b;
                synchronized (dc1Var3.p) {
                    ac1Var = dc1Var3.F;
                    dc1Var3.F = null;
                    jSONObject = dc1Var3.G;
                    dc1Var3.G = null;
                    dc1Var3.H = false;
                }
                if (dc1Var3.t) {
                    if (ac1Var != null) {
                        ac1Var.a.c();
                        return;
                    }
                    return;
                }
                if (ac1Var != null && (i10 = dc1Var3.D) != 0 && Math.abs(ac1Var.d - i10) > 1) {
                    ac1Var.a.c();
                    dc1Var3.B = false;
                    ac1Var = null;
                }
                if (ac1Var != null) {
                    dc1Var3.E = ac1Var;
                    dc1Var3.B = false;
                    cc1 cc1Var2 = dc1Var3.I;
                    if (cc1Var2 != null) {
                        cc1Var2.f(dc1Var3);
                    }
                }
                if (jSONObject == null || (cc1Var = dc1Var3.I) == null) {
                    return;
                }
                cc1Var.h(jSONObject);
                return;
            case 4:
                this.b.d();
                return;
            default:
                dc1 dc1Var4 = this.b;
                dc1Var4.o.set(true);
                dc1Var4.d();
                return;
        }
    }
}
