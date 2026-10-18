package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5 b;

    public /* synthetic */ o3(n5 n5Var, int i10) {
        this.a = i10;
        this.b = n5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var;
        switch (this.a) {
            case 0:
                n5.b0(this.b);
                break;
            case 1:
                n5 n5Var = this.b;
                n5Var.getClass();
                n5Var.presentFragment(new h8());
                break;
            case 2:
                n5 n5Var2 = this.b;
                n5Var2.getClass();
                n5Var2.presentFragment(new fi.g());
                break;
            case 3:
                n5 n5Var3 = this.b;
                t7 t7Var = n5Var3.i0;
                if (t7Var != null && (e0Var = n5Var3.D0) != null) {
                    t7Var.Y(e0Var);
                }
                e0 e0Var2 = n5Var3.D0;
                boolean z10 = (e0Var2 == null || e0Var2.a.isEmpty()) ? false : true;
                if (n5Var3.e0 != z10) {
                    n5Var3.F0(z10);
                }
                if (z10 && n5Var3.E0) {
                    n8 n8Var = n5Var3.h0;
                    if (n8Var != null) {
                        n8Var.b(false);
                    }
                    if (n5Var3.e0) {
                        n5Var3.E0 = false;
                        n5Var3.d0 = 1;
                        ei.h1 h1Var = n5Var3.o0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    } else {
                        n5Var3.E0 = true;
                    }
                }
                u61 u61Var = n5Var3.a;
                if (u61Var != null && u61Var.W2 != null) {
                    n5Var3.Q0(true);
                    break;
                }
                break;
            case 4:
                this.b.o0(false);
                break;
            case 5:
                this.b.y0();
                break;
            case 6:
                this.b.x0();
                break;
            case 7:
                xc.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 8:
                n5 n5Var4 = this.b;
                if (n5Var4.Q.isAttachedToWindow()) {
                    if (!n5Var4.a.canScrollVertically(-1)) {
                        n5Var4.a.V2.h1(0, 0);
                    }
                    n5Var4.Q.requestLayout();
                    break;
                }
                break;
            case 9:
                n5.c0(this.b);
                break;
            case 10:
                this.b.M0();
                break;
            case 11:
                n5 n5Var5 = this.b;
                n5Var5.Q.post(new o3(n5Var5, 8));
                break;
            case 12:
                this.b.x0();
                break;
            default:
                this.b.x0();
                break;
        }
    }
}
