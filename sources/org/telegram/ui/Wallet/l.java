package org.telegram.ui.Wallet;

import android.view.View;
import b8.vf;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void a() {
        a0 a0Var = (a0) this.b;
        synchronized (a0Var) {
            if (a0Var.a) {
                return;
            }
            a0Var.a = true;
            Runnable runnable = a0Var.b;
            if (runnable != null) {
                runnable.run();
                a0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                synchronized (yVar) {
                    if (yVar.a) {
                        return;
                    }
                    yVar.a = true;
                    Runnable runnable = yVar.b;
                    if (runnable != null) {
                        runnable.run();
                        yVar.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((h0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                t0 t0Var = (t0) this.b;
                t0Var.c("AUTH_CANCELED");
                t0Var.e();
                if (vf.b == t0Var) {
                    vf.b = null;
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
                org.telegram.messenger.g0.E2((gi.l3) this.b);
                return;
            case 8:
                s5 s5Var = (s5) this.b;
                ai.h4 h4Var = s5Var.c;
                if (h4Var == null || h4Var.getScrollState() != 0) {
                    return;
                }
                l41 y02 = s5Var.j.y0();
                if ((y02 == null || y02.getScrollState() == 0) && (d = s5Var.d(s5Var.c.f3)) != null) {
                    u4.b0 b0Var = s5Var.c.f3;
                    b0Var.getClass();
                    int i3 = new int[]{0, u4.o0.z(d) - b0Var.F()}[1];
                    if (i3 != 0) {
                        s5Var.c.w0(0, i3, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ei.e3 e3Var = (ei.e3) this.b;
                bi.f fVar = (bi.f) e3Var.b;
                bi.e eVar = (bi.e) e3Var.c;
                if (eVar == null) {
                    return;
                }
                fVar.a(eVar);
                fVar.D = 0.0f;
                e3Var.c = null;
                e3Var.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                o8 o8Var = (o8) this.b;
                boolean z10 = o8Var.h != -1;
                if (!z10 && !o8Var.s) {
                    o8Var.c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                boolean z11 = z10 || o8Var.s || o8Var.e > 1.001f;
                a4 a4Var = o8Var.b;
                float f10 = o8Var.c;
                float f11 = o8Var.d;
                a4Var.r = f10;
                a4Var.s = f11;
                a4Var.w = z11;
                a4Var.x = z11;
                return;
            case 12:
                u8 u8Var = (u8) this.b;
                u8Var.removeSelfFromStack();
                Runnable runnable2 = u8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.w3) this.b).requestLayout();
                return;
            default:
                ((ea) this.b).Z();
                return;
        }
    }
}
