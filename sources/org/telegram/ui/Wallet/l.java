package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
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
                u0 u0Var = (u0) this.b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (w7.k6.b == u0Var) {
                    w7.k6.b = null;
                    return;
                }
                return;
            case 5:
                ((y2) this.b).dismiss();
                return;
            case 6:
                ((org.telegram.ui.Cells.s0) this.b).invalidate();
                return;
            case 7:
                org.telegram.messenger.i0.E2((vh.p2) this.b);
                return;
            case 8:
                x5 x5Var = (x5) this.b;
                ii iiVar = x5Var.c;
                if (iiVar == null || iiVar.getScrollState() != 0) {
                    return;
                }
                u51 x02 = x5Var.j.x0();
                if ((x02 == null || x02.getScrollState() == 0) && (d = x5Var.d(x5Var.c.e3)) != null) {
                    s4.a0 a0Var = x5Var.c.e3;
                    a0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - a0Var.F()}[1];
                    if (i10 != 0) {
                        x5Var.c.w0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ih.c cVar = (ih.c) this.b;
                qh.g gVar = (qh.g) cVar.b;
                qh.f fVar = (qh.f) cVar.c;
                if (fVar == null) {
                    return;
                }
                gVar.a(fVar);
                gVar.D = 0.0f;
                cVar.c = null;
                cVar.invalidate();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                u8 u8Var = (u8) this.b;
                boolean z10 = u8Var.h != -1;
                if (!z10 && !u8Var.s) {
                    u8Var.c = u8Var.c();
                    u8Var.d = 0.0f;
                }
                boolean z11 = z10 || u8Var.s || u8Var.e > 1.001f;
                c4 c4Var = u8Var.b;
                float f7 = u8Var.c;
                float f10 = u8Var.d;
                c4Var.r = f7;
                c4Var.s = f10;
                c4Var.w = z11;
                c4Var.x = z11;
                return;
            case 12:
                a9 a9Var = (a9) this.b;
                a9Var.removeSelfFromStack();
                Runnable runnable2 = a9Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.y3) this.b).requestLayout();
                return;
            default:
                ((ja) this.b).Y();
                return;
        }
    }
}
