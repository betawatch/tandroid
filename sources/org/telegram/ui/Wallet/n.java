package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ((org.telegram.ui.Cells.w0) this.b).invalidate();
                return;
            case 7:
                AndroidUtilities.removeFromParent((ei.x3) this.b);
                return;
            case 8:
                j5 j5Var = (j5) this.b;
                u61 u61Var = j5Var.c;
                if (u61Var == null || u61Var.getScrollState() != 0) {
                    return;
                }
                a71 u02 = j5Var.j.u0();
                if ((u02 == null || u02.getScrollState() == 0) && (d = j5Var.d(j5Var.c.V2)) != null) {
                    s4.b0 b0Var = j5Var.c.V2;
                    b0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                    if (i10 != 0) {
                        j5Var.c.v0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 10:
                i8 i8Var = (i8) this.b;
                boolean z10 = i8Var.h != -1;
                if (!z10 && !i8Var.s) {
                    i8Var.c = i8Var.c();
                    i8Var.d = 0.0f;
                }
                boolean z11 = z10 || i8Var.s || i8Var.e > 1.001f;
                l3 l3Var = i8Var.b;
                float f7 = i8Var.c;
                float f10 = i8Var.d;
                l3Var.r = f7;
                l3Var.s = f10;
                l3Var.v = z11;
                l3Var.w = z11;
                return;
            case 11:
                p8 p8Var = (p8) this.b;
                p8Var.removeSelfFromStack();
                Runnable runnable2 = p8Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Cells.t3) this.b).requestLayout();
                return;
            case 13:
                xc.a0((r9) this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((y9) this.b).U();
                return;
        }
    }
}
