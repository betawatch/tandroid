package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ f3(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                a5Var.S.post(new f3(a5Var, 8));
                break;
            case 1:
                a5.e0(this.b);
                break;
            case 2:
                a5 a5Var2 = this.b;
                a5Var2.getClass();
                a5Var2.presentFragment(new l7());
                break;
            case 3:
                a5 a5Var3 = this.b;
                a5Var3.getClass();
                a5Var3.presentFragment(new di.i());
                break;
            case 4:
                a5 a5Var4 = this.b;
                c0 c0Var = a5Var4.A0;
                boolean z10 = (c0Var == null || c0Var.a.isEmpty()) ? false : true;
                if (a5Var4.g0 != z10) {
                    a5Var4.w0(z10);
                }
                e71 e71Var = a5Var4.a;
                if (e71Var != null && e71Var.W2 != null) {
                    a5Var4.F0(true);
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
                ad.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 8:
                a5 a5Var5 = this.b;
                if (a5Var5.S.isAttachedToWindow()) {
                    if (!a5Var5.a.canScrollVertically(-1)) {
                        a5Var5.a.V2.h1(0, 0);
                    }
                    a5Var5.S.requestLayout();
                    break;
                }
                break;
            case 9:
                a5 a5Var6 = this.b;
                a5Var6.G = false;
                a5Var6.E.invalidate();
                break;
            case 10:
                a5.b0(this.b);
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
