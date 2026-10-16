package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ g3(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                a5Var.S.post(new g3(a5Var, 8));
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
                a5Var3.presentFragment(new ei.i());
                break;
            case 4:
                a5 a5Var4 = this.b;
                c0 c0Var = a5Var4.A0;
                boolean z10 = (c0Var == null || c0Var.a.isEmpty()) ? false : true;
                if (a5Var4.g0 != z10) {
                    a5Var4.w0(z10);
                }
                c71 c71Var = a5Var4.a;
                if (c71Var != null && c71Var.W2 != null) {
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
                zc.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
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
