package org.telegram.ui.Wallet;

import android.view.View;
import c8.va;
import org.telegram.ui.Components.r41;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                if (va.b == u0Var) {
                    va.b = null;
                    return;
                }
                return;
            case 5:
                ((x2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.t0) this.b).invalidate();
                return;
            case 7:
                org.telegram.messenger.g0.E2((fi.m3) this.b);
                return;
            case 8:
                s5 s5Var = (s5) this.b;
                fi.w3 w3Var = s5Var.c;
                if (w3Var == null || w3Var.getScrollState() != 0) {
                    return;
                }
                r41 y02 = s5Var.j.y0();
                if ((y02 == null || y02.getScrollState() == 0) && (d = s5Var.d(s5Var.c.e3)) != null) {
                    v4.b0 b0Var = s5Var.c.e3;
                    b0Var.getClass();
                    int i7 = new int[]{0, v4.n0.z(d) - b0Var.F()}[1];
                    if (i7 != 0) {
                        s5Var.c.w0(0, i7, null);
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
                n8 n8Var = (n8) this.b;
                boolean z9 = n8Var.h != -1;
                if (!z9 && !n8Var.s) {
                    n8Var.c = n8Var.c();
                    n8Var.d = 0.0f;
                }
                boolean z10 = z9 || n8Var.s || n8Var.e > 1.001f;
                a4 a4Var = n8Var.b;
                float f10 = n8Var.c;
                float f11 = n8Var.d;
                a4Var.r = f10;
                a4Var.s = f11;
                a4Var.w = z10;
                a4Var.x = z10;
                return;
            case 12:
                t8 t8Var = (t8) this.b;
                t8Var.removeSelfFromStack();
                Runnable runnable2 = t8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.b).requestLayout();
                return;
            default:
                ((da) this.b).Z();
                return;
        }
    }
}
