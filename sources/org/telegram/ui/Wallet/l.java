package org.telegram.ui.Wallet;

import android.view.View;
import c8.xa;
import org.telegram.ui.Components.u41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
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
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                synchronized (zVar) {
                    if (zVar.a) {
                        return;
                    }
                    zVar.a = true;
                    Runnable runnable = zVar.b;
                    if (runnable != null) {
                        runnable.run();
                        zVar.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((i0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                u0 u0Var = (u0) this.b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (xa.b == u0Var) {
                    xa.b = null;
                    return;
                }
                return;
            case 5:
                ((w2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((hi.l3) this.b);
                return;
            case 8:
                u5 u5Var = (u5) this.b;
                bi.v3 v3Var = u5Var.c;
                if (v3Var == null || v3Var.getScrollState() != 0) {
                    return;
                }
                u41 y02 = u5Var.j.y0();
                if ((y02 == null || y02.getScrollState() == 0) && (d = u5Var.d(u5Var.c.f3)) != null) {
                    v4.b0 b0Var = u5Var.c.f3;
                    b0Var.getClass();
                    int i7 = new int[]{0, v4.o0.z(d) - b0Var.F()}[1];
                    if (i7 != 0) {
                        u5Var.c.w0(0, i7, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fi.w2 w2Var = (fi.w2) this.b;
                ci.f fVar = (ci.f) w2Var.b;
                ci.e eVar = (ci.e) w2Var.c;
                if (eVar == null) {
                    return;
                }
                fVar.a(eVar);
                fVar.D = 0.0f;
                w2Var.c = null;
                w2Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                q8 q8Var = (q8) this.b;
                boolean z10 = q8Var.h != -1;
                if (!z10 && !q8Var.s) {
                    q8Var.c = q8Var.c();
                    q8Var.d = 0.0f;
                }
                boolean z11 = z10 || q8Var.s || q8Var.e > 1.001f;
                b4 b4Var = q8Var.b;
                float f10 = q8Var.c;
                float f11 = q8Var.d;
                b4Var.r = f10;
                b4Var.s = f11;
                b4Var.w = z11;
                b4Var.x = z11;
                return;
            case 12:
                w8 w8Var = (w8) this.b;
                w8Var.removeSelfFromStack();
                Runnable runnable2 = w8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.b).requestLayout();
                return;
            default:
                ((ha) this.b).Z();
                return;
        }
    }
}
