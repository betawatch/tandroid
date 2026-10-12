package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a() {
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
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        View d;
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                synchronized (xVar) {
                    if (xVar.a) {
                        return;
                    }
                    xVar.a = true;
                    Runnable runnable = xVar.b;
                    if (runnable != null) {
                        runnable.run();
                        xVar.b = null;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                ((g0) this.b).close();
                return;
            case 3:
                u0 u0Var = (u0) this.b;
                u0Var.c("AUTH_CANCELED");
                u0Var.e();
                if (w7.i6.b == u0Var) {
                    w7.i6.b = null;
                    return;
                }
                return;
            case 4:
                ((h2) this.b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.x0) this.b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((di.d4) this.b);
                return;
            case 7:
                v4 v4Var = (v4) this.b;
                b71 b71Var = v4Var.c;
                if (b71Var == null || b71Var.getScrollState() != 0) {
                    return;
                }
                h71 n02 = v4Var.j.n0();
                if ((n02 == null || n02.getScrollState() == 0) && (d = v4Var.d(v4Var.c.V2)) != null) {
                    s4.b0 b0Var = v4Var.c.V2;
                    b0Var.getClass();
                    int i10 = new int[]{0, s4.n0.z(d) - b0Var.F()}[1];
                    if (i10 != 0) {
                        v4Var.c.v0(0, i10, null);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((c5) this.b).performClick();
                return;
            case 9:
                ((p5) this.b).performClick();
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
                o7 o7Var = (o7) this.b;
                o7Var.removeSelfFromStack();
                Runnable runnable2 = o7Var.f;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 13:
                ((org.telegram.ui.Cells.u3) this.b).requestLayout();
                return;
            case 14:
                zc.a0((r8) this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.b).U();
                return;
        }
    }
}
