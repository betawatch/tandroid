package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;

    public /* synthetic */ n3(m5 m5Var, int i10) {
        this.a = i10;
        this.b = m5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var;
        switch (this.a) {
            case 0:
                m5.e0(this.b);
                break;
            case 1:
                m5 m5Var = this.b;
                m5Var.getClass();
                m5Var.presentFragment(new n8());
                break;
            case 2:
                m5 m5Var2 = this.b;
                m5Var2.getClass();
                m5Var2.presentFragment(new fi.g());
                break;
            case 3:
                m5 m5Var3 = this.b;
                z7 z7Var = m5Var3.k0;
                if (z7Var != null && (e0Var = m5Var3.F0) != null) {
                    z7Var.a0(e0Var);
                }
                e0 e0Var2 = m5Var3.F0;
                boolean z10 = (e0Var2 == null || e0Var2.a.isEmpty()) ? false : true;
                if (m5Var3.g0 != z10) {
                    m5Var3.E0(z10);
                }
                if (z10 && m5Var3.G0) {
                    m5Var3.H0();
                }
                u61 u61Var = m5Var3.a;
                if (u61Var != null && u61Var.W2 != null) {
                    m5Var3.Q0(true);
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
                m5 m5Var4 = this.b;
                if (m5Var4.S.isAttachedToWindow()) {
                    if (!m5Var4.a.canScrollVertically(-1)) {
                        m5Var4.a.V2.h1(0, 0);
                    }
                    m5Var4.S.requestLayout();
                    break;
                }
                break;
            case 9:
                m5 m5Var5 = this.b;
                m5Var5.G = false;
                m5Var5.E.invalidate();
                break;
            case 10:
                m5.b0(this.b);
                break;
            case 11:
                this.b.M0();
                break;
            case 12:
                m5 m5Var6 = this.b;
                m5Var6.S.post(new n3(m5Var6, 8));
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
