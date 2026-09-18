package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ of0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        is[] isVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        bg0 bg0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bj0 bj0Var = bg0Var.G;
                fs fsVar = bg0Var.f;
                int i13 = bg0Var.f0;
                if (i13 != 3 && (isVarArr = fsVar.f) != null) {
                    for (int length = isVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || fsVar.f[length].length() != 0) {
                            fsVar.f[length].requestFocus();
                            is isVar = fsVar.f[length];
                            isVar.setSelection(isVar.length());
                            yg0.T0(bg0Var.s0, fsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yi0 yi0Var = bg0Var.a;
                if (yi0Var != null) {
                    yi0Var.start();
                }
                if (i13 == 15) {
                    bj0Var.getAnimatedDrawable().N(0, false, false);
                    bj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 6));
                break;
            case 2:
                he0 he0Var = bg0Var.w;
                bg0Var.q0 = false;
                while (true) {
                    is[] isVarArr2 = bg0Var.f.f;
                    if (i12 < isVarArr2.length) {
                        isVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (he0Var.getCurrentView() != (bg0Var.f0 == 15 ? bg0Var.F : bg0Var.y)) {
                        he0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.bj0 bj0Var2 = bg0Var.s;
                bj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yi0 yi0Var2 = bg0Var.O;
                yi0Var2.N(0, false, false);
                yi0Var2.K(1);
                bj0Var2.setAnimation(yi0Var2);
                bj0Var2.d();
                break;
            case 5:
                try {
                    bg0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.w1.j(new StringBuilder("+"), bg0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new xf0(bg0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.yi0 yi0Var3 = bg0Var.P;
                yi0Var3.t0 = new of0(bg0Var, 8);
                org.telegram.ui.Components.bj0 bj0Var3 = bg0Var.s;
                bj0Var3.setAutoRepeat(false);
                yi0Var3.N(0, false, false);
                bj0Var3.setAnimation(yi0Var3);
                bj0Var3.d();
                break;
            case 7:
                bg0Var.postDelayed(new of0(bg0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 10));
                break;
            case 9:
                fs fsVar2 = bg0Var.f;
                fsVar2.e = false;
                fsVar2.f[0].requestFocus();
                while (true) {
                    is[] isVarArr3 = fsVar2.f;
                    if (i12 >= isVarArr3.length) {
                        break;
                    } else {
                        isVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.bj0 bj0Var4 = bg0Var.s;
                bj0Var4.setAutoRepeat(false);
                bj0Var4.setAnimation(bg0Var.a);
                break;
        }
    }
}
