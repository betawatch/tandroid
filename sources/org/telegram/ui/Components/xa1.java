package org.telegram.ui.Components;

import android.os.SystemClock;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xa1 {
    public final yb1 a;
    public final ya1 b;
    public final c3.s c = new c3.s();
    public boolean d;
    public final /* synthetic */ za1 e;

    public xa1(za1 za1Var, yb1 yb1Var, ya1 ya1Var) {
        this.e = za1Var;
        this.a = yb1Var;
        this.b = ya1Var;
    }

    public final void a(float f7, float f10, int i10) {
        if (i10 == -1 || (i10 & 32) == 0) {
            return;
        }
        this.e.g(new wa1(this.a, 3, f7, f10));
        this.d = true;
    }

    public final void b(float f7, float f10) {
        boolean[] zArr;
        this.d = false;
        this.b.b = null;
        this.e.g(new wa1(this.a, 0, f7, f10));
        ya1 ya1Var = this.b;
        long uptimeMillis = SystemClock.uptimeMillis() + 150;
        synchronized (ya1Var.d) {
            while (ya1Var.b == null) {
                try {
                    long uptimeMillis2 = uptimeMillis - SystemClock.uptimeMillis();
                    if (uptimeMillis2 <= 0) {
                        break;
                    } else {
                        ya1Var.d.wait(uptimeMillis2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zArr = ya1Var.b;
        }
        c3.s sVar = this.c;
        double uptimeMillis3 = SystemClock.uptimeMillis();
        double d = f7;
        double d10 = f10;
        boolean z10 = zArr != null && zArr[0];
        boolean z11 = zArr != null && zArr[1];
        boolean z12 = zArr != null && zArr[2];
        if (sVar.a == 0) {
            sVar.a = WidgetSandboxNative.arbiterCreate();
        }
        a(f7, f10, WidgetSandboxNative.arbiterDown(sVar.a, uptimeMillis3, d, d10, z10, z11, z12, false, 0));
    }

    public final void c(float[] fArr, long j10) {
        b(fArr[0], fArr[1]);
        float f7 = fArr[0];
        float f10 = fArr[1];
        long uptimeMillis = SystemClock.uptimeMillis() + j10;
        while (true) {
            boolean z10 = this.d;
            double d = -1.0d;
            c3.s sVar = this.c;
            if (!z10) {
                long j11 = sVar.a;
                if (j11 != 0) {
                    d = WidgetSandboxNative.arbiterHoldDeadline(j11);
                }
            }
            boolean z11 = d >= 0.0d && d <= ((double) uptimeMillis);
            Thread.sleep(Math.max(0L, (z11 ? (long) Math.ceil(d) : uptimeMillis) - SystemClock.uptimeMillis()));
            if (!z11) {
                d(fArr[0], fArr[1]);
                return;
            } else {
                double uptimeMillis2 = SystemClock.uptimeMillis();
                long j12 = sVar.a;
                a(f7, f10, j12 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j12, uptimeMillis2));
            }
        }
    }

    public final void d(float f7, float f10) {
        if (this.d) {
            return;
        }
        double uptimeMillis = SystemClock.uptimeMillis();
        double d = f7;
        double d10 = f10;
        long j10 = this.c.a;
        int arbiterUp = j10 == 0 ? -1 : WidgetSandboxNative.arbiterUp(j10, uptimeMillis, d, d10);
        this.e.g(new wa1(this.a, (arbiterUp == -1 || (arbiterUp & 32) == 0) ? 2 : 3, f7, f10));
    }
}
