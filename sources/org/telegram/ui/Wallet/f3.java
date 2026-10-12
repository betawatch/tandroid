package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z4 b;

    public /* synthetic */ f3(z4 z4Var, int i10) {
        this.a = i10;
        this.b = z4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z4 z4Var = this.b;
                z4Var.S.post(new f3(z4Var, 8));
                break;
            case 1:
                z4.e0(this.b);
                break;
            case 2:
                z4 z4Var2 = this.b;
                z4Var2.getClass();
                z4Var2.presentFragment(new k7());
                break;
            case 3:
                z4 z4Var3 = this.b;
                z4Var3.getClass();
                z4Var3.presentFragment(new ei.i());
                break;
            case 4:
                z4 z4Var4 = this.b;
                b0 b0Var = z4Var4.A0;
                boolean z10 = (b0Var == null || b0Var.a.isEmpty()) ? false : true;
                if (z4Var4.g0 != z10) {
                    z4Var4.w0(z10);
                }
                b71 b71Var = z4Var4.a;
                if (b71Var != null && b71Var.W2 != null) {
                    z4Var4.F0(true);
                    break;
                }
                break;
            case 5:
                this.b.q0();
                break;
            case 6:
                this.b.p0();
                break;
            case 7:
                zc.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 8:
                z4 z4Var5 = this.b;
                if (z4Var5.S.isAttachedToWindow()) {
                    if (!z4Var5.a.canScrollVertically(-1)) {
                        z4Var5.a.V2.h1(0, 0);
                    }
                    z4Var5.S.requestLayout();
                    break;
                }
                break;
            case 9:
                z4 z4Var6 = this.b;
                z4Var6.G = false;
                z4Var6.E.invalidate();
                break;
            case 10:
                z4.b0(this.b);
                break;
            case 11:
                this.b.C0();
                break;
            case 12:
                this.b.p0();
                break;
            default:
                this.b.p0();
                break;
        }
    }
}
