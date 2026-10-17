package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ m3(l5 l5Var, int i10) {
        this.a = i10;
        this.b = l5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var;
        switch (this.a) {
            case 0:
                l5.e0(this.b);
                break;
            case 1:
                l5 l5Var = this.b;
                l5Var.getClass();
                l5Var.presentFragment(new k8());
                break;
            case 2:
                l5 l5Var2 = this.b;
                l5Var2.getClass();
                l5Var2.presentFragment(new fi.g());
                break;
            case 3:
                l5 l5Var3 = this.b;
                w7 w7Var = l5Var3.k0;
                if (w7Var != null && (e0Var = l5Var3.F0) != null) {
                    w7Var.a0(e0Var);
                }
                e0 e0Var2 = l5Var3.F0;
                boolean z10 = (e0Var2 == null || e0Var2.a.isEmpty()) ? false : true;
                if (l5Var3.g0 != z10) {
                    l5Var3.E0(z10);
                }
                if (z10 && l5Var3.G0) {
                    l5Var3.H0();
                }
                u61 u61Var = l5Var3.a;
                if (u61Var != null && u61Var.W2 != null) {
                    l5Var3.Q0(true);
                    break;
                }
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.x0();
                break;
            case 6:
                this.b.w0();
                break;
            case 7:
                xc.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 8:
                l5 l5Var4 = this.b;
                if (l5Var4.S.isAttachedToWindow()) {
                    if (!l5Var4.a.canScrollVertically(-1)) {
                        l5Var4.a.V2.h1(0, 0);
                    }
                    l5Var4.S.requestLayout();
                    break;
                }
                break;
            case 9:
                l5 l5Var5 = this.b;
                l5Var5.G = false;
                l5Var5.E.invalidate();
                break;
            case 10:
                l5.b0(this.b);
                break;
            case 11:
                this.b.M0();
                break;
            case 12:
                l5 l5Var6 = this.b;
                l5Var6.S.post(new m3(l5Var6, 8));
                break;
            case 13:
                this.b.w0();
                break;
            default:
                this.b.w0();
                break;
        }
    }
}
