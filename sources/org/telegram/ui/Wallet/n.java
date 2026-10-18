package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a() {
        c0 c0Var = (c0) this.b;
        synchronized (c0Var) {
            if (c0Var.a) {
                return;
            }
            c0Var.a = true;
            Runnable runnable = c0Var.b;
            if (runnable != null) {
                runnable.run();
                c0Var.b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
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
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((j0) this.b).close();
                return;
            case 3:
                ((boolean[]) this.b)[0] = true;
                return;
            case 4:
                w0 w0Var = (w0) this.b;
                w0Var.c("AUTH_CANCELED");
                w0Var.e();
                if (w7.h6.b == w0Var) {
                    w7.h6.b = null;
                    return;
                }
                return;
            case 5:
                ((j2) this.b).dismiss();
                return;
            case 6:
                y2 y2Var = (y2) this.b;
                if (y2Var.P || y2Var.O) {
                    return;
                }
                hh.d.c(y2Var.E, y2Var.h);
                y2Var.F.d();
                y2Var.a(1.0f);
                return;
            case 7:
                ((org.telegram.ui.Cells.w0) this.b).invalidate();
                return;
            case 8:
                AndroidUtilities.removeFromParent((ei.x3) this.b);
                return;
            case 9:
                i5 i5Var = (i5) this.b;
                u61 u61Var = i5Var.c;
                if (u61Var == null || u61Var.getScrollState() != 0) {
                    return;
                }
                a71 t02 = i5Var.j.t0();
                if ((t02 == null || t02.getScrollState() == 0) && (d = i5Var.d(i5Var.c.V2)) != null) {
                    s4.b0 b0Var = i5Var.c.V2;
                    b0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                    if (i10 != 0) {
                        i5Var.c.v0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((p5) this.b).performClick();
                return;
            case 11:
                ((f6) this.b).performClick();
                return;
            case 12:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 13:
                o8 o8Var = (o8) this.b;
                boolean z10 = o8Var.h != -1;
                if (!z10 && !o8Var.s) {
                    o8Var.c = o8Var.c();
                    o8Var.d = 0.0f;
                }
                boolean z11 = z10 || o8Var.s || o8Var.e > 1.001f;
                k3 k3Var = o8Var.b;
                float f7 = o8Var.c;
                float f10 = o8Var.d;
                k3Var.r = f7;
                k3Var.s = f10;
                k3Var.v = z11;
                k3Var.w = z11;
                return;
            case 14:
                v8 v8Var = (v8) this.b;
                v8Var.removeSelfFromStack();
                Runnable runnable2 = v8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 15:
                ((org.telegram.ui.Cells.t3) this.b).requestLayout();
                return;
            case 16:
                xc.a0((w9) this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((da) this.b).U();
                return;
        }
    }
}
