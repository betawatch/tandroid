package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
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
                v0 v0Var = (v0) this.b;
                v0Var.c("AUTH_CANCELED");
                v0Var.e();
                if (w7.h6.b == v0Var) {
                    w7.h6.b = null;
                    return;
                }
                return;
            case 4:
                ((i2) this.b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((di.d4) this.b);
                return;
            case 7:
                w4 w4Var = (w4) this.b;
                c71 c71Var = w4Var.c;
                if (c71Var == null || c71Var.getScrollState() != 0) {
                    return;
                }
                i71 n02 = w4Var.j.n0();
                if ((n02 == null || n02.getScrollState() == 0) && (d = w4Var.d(w4Var.c.V2)) != null) {
                    s4.b0 b0Var = w4Var.c.V2;
                    b0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                    if (i10 != 0) {
                        w4Var.c.v0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((d5) this.b).performClick();
                return;
            case 9:
                ((q5) this.b).performClick();
                return;
            case 10:
                ((WalletEngine2) this.b).lambda$close$53();
                return;
            case 11:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.b;
                if (zc.a(m2Var)) {
                    zc.a0(m2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
                    return;
                }
                return;
            case 12:
                p7 p7Var = (p7) this.b;
                p7Var.removeSelfFromStack();
                Runnable runnable2 = p7Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.b).requestLayout();
                return;
            case 14:
                zc.a0((s8) this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.b).U();
                return;
        }
    }
}
