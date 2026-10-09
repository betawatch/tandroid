package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i10) {
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
                if (w7.f6.b == v0Var) {
                    w7.f6.b = null;
                    return;
                }
                return;
            case 4:
                ((h2) this.b).dismiss();
                return;
            case 5:
                ((org.telegram.ui.Cells.w0) this.b).invalidate();
                return;
            case 6:
                AndroidUtilities.removeFromParent((ci.d4) this.b);
                return;
            case 7:
                v4 v4Var = (v4) this.b;
                e71 e71Var = v4Var.c;
                if (e71Var == null || e71Var.getScrollState() != 0) {
                    return;
                }
                k71 n02 = v4Var.j.n0();
                if ((n02 == null || n02.getScrollState() == 0) && (d = v4Var.d(v4Var.c.V2)) != null) {
                    s4.d0 d0Var = v4Var.c.V2;
                    d0Var.getClass();
                    int i10 = new int[]{0, s4.p0.z(d) - d0Var.F()}[1];
                    if (i10 != 0) {
                        v4Var.c.v0(0, i10, null);
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
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                if (ad.a(n2Var)) {
                    ad.a0(n2Var).M(LocaleController.getString(R.string.WalletCreated), LocaleController.getString(R.string.WalletCreatedInfo), R.raw.contact_check).j();
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
                ad.a0((s8) this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                return;
            default:
                ((z8) this.b).U();
                return;
        }
    }
}
