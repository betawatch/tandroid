package org.telegram.ui.Components;

import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb1 b;

    public /* synthetic */ na1(yb1 yb1Var, int i10) {
        this.a = i10;
        this.b = yb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vb1 vb1Var;
        JSONObject jSONObject;
        xb1 xb1Var;
        int i10;
        switch (this.a) {
            case 0:
                yb1 yb1Var = this.b;
                long j10 = yb1Var.r;
                if (yb1Var.s || j10 == 0) {
                    return;
                }
                WidgetSandboxNative.touch(j10, 0, 5.0f, 5.0f, 0, true, false, 0, 0);
                return;
            case 1:
                yb1 yb1Var2 = this.b;
                long j11 = yb1Var2.r;
                if (yb1Var2.s || j11 == 0) {
                    return;
                }
                WidgetSandboxNative.touch(j11, 2, 5.0f, 5.0f, 0, true, false, 0, 0);
                return;
            case 2:
                this.b.a();
                return;
            case 3:
                this.b.c();
                return;
            case 4:
                yb1 yb1Var3 = this.b;
                yb1Var3.n.set(true);
                yb1Var3.c();
                return;
            default:
                yb1 yb1Var4 = this.b;
                synchronized (yb1Var4.o) {
                    vb1Var = yb1Var4.E;
                    yb1Var4.E = null;
                    jSONObject = yb1Var4.F;
                    yb1Var4.F = null;
                    yb1Var4.G = false;
                }
                if (yb1Var4.s) {
                    if (vb1Var != null) {
                        vb1Var.a.c();
                        return;
                    }
                    return;
                }
                if (vb1Var != null && (i10 = yb1Var4.C) != 0 && Math.abs(vb1Var.d - i10) > 1) {
                    vb1Var.a.c();
                    yb1Var4.A = false;
                    vb1Var = null;
                }
                if (vb1Var != null) {
                    yb1Var4.D = vb1Var;
                    yb1Var4.A = false;
                    xb1 xb1Var2 = yb1Var4.H;
                    if (xb1Var2 != null) {
                        xb1Var2.d(yb1Var4);
                    }
                }
                if (jSONObject == null || (xb1Var = yb1Var4.H) == null) {
                    return;
                }
                xb1Var.f(jSONObject);
                return;
        }
    }
}
