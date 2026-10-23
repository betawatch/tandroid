package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ o3(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        switch (this.a) {
            case 0:
                o5.Z(this.b);
                break;
            case 1:
                o5 o5Var = this.b;
                o5Var.getClass();
                o5Var.presentFragment(new i8());
                break;
            case 2:
                o5 o5Var2 = this.b;
                o5Var2.getClass();
                o5Var2.presentFragment(new fi.g());
                break;
            case 3:
                o5 o5Var3 = this.b;
                t7 t7Var = o5Var3.i0;
                if (t7Var != null && (d0Var = o5Var3.D0) != null) {
                    t7Var.Y(d0Var);
                }
                d0 d0Var2 = o5Var3.D0;
                boolean z10 = (d0Var2 == null || d0Var2.a.isEmpty()) ? false : true;
                if (o5Var3.e0 != z10) {
                    o5Var3.G0(z10);
                }
                if (z10 && o5Var3.E0) {
                    o8 o8Var = o5Var3.h0;
                    if (o8Var != null) {
                        o8Var.b(false);
                    }
                    if (o5Var3.e0) {
                        o5Var3.E0 = false;
                        o5Var3.d0 = 1;
                        ei.h1 h1Var = o5Var3.o0;
                        if (h1Var != null) {
                            h1Var.setPosition(1);
                        }
                    } else {
                        o5Var3.E0 = true;
                    }
                }
                d71 d71Var = o5Var3.a;
                if (d71Var != null && d71Var.Z2 != null) {
                    o5Var3.S0(true);
                    break;
                }
                break;
            case 4:
                this.b.n0(false);
                break;
            case 5:
                this.b.z0();
                break;
            case 6:
                this.b.y0();
                break;
            case 7:
                o5 o5Var4 = this.b;
                if (o5Var4.Q.isAttachedToWindow()) {
                    if (!o5Var4.a.canScrollVertically(-1)) {
                        o5Var4.a.Y2.h1(0, 0);
                    }
                    o5Var4.Q.requestLayout();
                    break;
                }
                break;
            case 8:
                this.b.L0 = null;
                break;
            case 9:
                o5.c0(this.b);
                break;
            case 10:
                this.b.O0();
                break;
            case 11:
                xc.a0(this.b).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 12:
                o5 o5Var5 = this.b;
                o5Var5.Q.post(new o3(o5Var5, 7));
                break;
            case 13:
                this.b.y0();
                break;
            default:
                this.b.y0();
                break;
        }
    }
}
