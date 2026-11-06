package org.telegram.ui.Wallet;

import android.view.View;
import c8.ua;
import org.telegram.ui.Components.k41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        d0 d0Var = (d0) this.b;
        synchronized (d0Var) {
            if (d0Var.a) {
                return;
            }
            d0Var.a = true;
            Runnable runnable = d0Var.b;
            if (runnable != null) {
                runnable.run();
                d0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                synchronized (b0Var) {
                    if (b0Var.a) {
                        return;
                    }
                    b0Var.a = true;
                    Runnable runnable = b0Var.b;
                    if (runnable != null) {
                        runnable.run();
                        b0Var.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((k0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (ua.b == w0Var) {
                    ua.b = null;
                    return;
                }
                return;
            case 5:
                ((z2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.b);
                return;
            case 8:
                u5 u5Var = (u5) this.b;
                fi.w3 w3Var = u5Var.c;
                if (w3Var == null || w3Var.getScrollState() != 0) {
                    return;
                }
                k41 y02 = u5Var.j.y0();
                if ((y02 == null || y02.getScrollState() == 0) && (d = u5Var.d(u5Var.c.e3)) != null) {
                    v4.b0 b0Var2 = u5Var.c.e3;
                    b0Var2.getClass();
                    int i7 = new int[]{0, v4.n0.z(d) - b0Var2.F()}[1];
                    if (i7 != 0) {
                        u5Var.c.w0(0, i7, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                di.b3 b3Var = (di.b3) this.b;
                ai.h hVar = (ai.h) b3Var.b;
                ai.g gVar = (ai.g) b3Var.c;
                if (gVar == null) {
                    return;
                }
                hVar.a(gVar);
                hVar.D = 0.0f;
                b3Var.c = null;
                b3Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                p8 p8Var = (p8) this.b;
                boolean z9 = p8Var.h != -1;
                if (!z9 && !p8Var.s) {
                    p8Var.c = p8Var.c();
                    p8Var.d = 0.0f;
                }
                boolean z10 = z9 || p8Var.s || p8Var.e > 1.001f;
                c4 c4Var = p8Var.b;
                float f10 = p8Var.c;
                float f11 = p8Var.d;
                c4Var.r = f10;
                c4Var.s = f11;
                c4Var.w = z10;
                c4Var.x = z10;
                return;
            case 12:
                v8 v8Var = (v8) this.b;
                v8Var.removeSelfFromStack();
                Runnable runnable2 = v8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.b).requestLayout();
                return;
            default:
                ((fa) this.b).Z();
                return;
        }
    }
}
