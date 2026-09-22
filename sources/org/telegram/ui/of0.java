package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        gs[] gsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        bg0 bg0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.nj0 nj0Var = bg0Var.G;
                ds dsVar = bg0Var.f;
                int i13 = bg0Var.f0;
                if (i13 != 3 && (gsVarArr = dsVar.f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f[length].length() != 0) {
                            dsVar.f[length].requestFocus();
                            gs gsVar = dsVar.f[length];
                            gsVar.setSelection(gsVar.length());
                            yg0.T0(bg0Var.s0, dsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.kj0 kj0Var = bg0Var.a;
                if (kj0Var != null) {
                    kj0Var.start();
                }
                if (i13 == 15) {
                    nj0Var.getAnimatedDrawable().N(0, false, false);
                    nj0Var.getAnimatedDrawable().start();
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
                    gs[] gsVarArr2 = bg0Var.f.f;
                    if (i12 < gsVarArr2.length) {
                        gsVarArr2[i12].i(0.0f);
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
                org.telegram.ui.Components.nj0 nj0Var2 = bg0Var.s;
                nj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.kj0 kj0Var2 = bg0Var.O;
                kj0Var2.N(0, false, false);
                kj0Var2.K(1);
                nj0Var2.setAnimation(kj0Var2);
                nj0Var2.d();
                break;
            case 5:
                try {
                    bg0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.rk.h(new StringBuilder("+"), bg0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new xf0(bg0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.kj0 kj0Var3 = bg0Var.P;
                kj0Var3.t0 = new of0(bg0Var, 8);
                org.telegram.ui.Components.nj0 nj0Var3 = bg0Var.s;
                nj0Var3.setAutoRepeat(false);
                kj0Var3.N(0, false, false);
                nj0Var3.setAnimation(kj0Var3);
                nj0Var3.d();
                break;
            case 7:
                bg0Var.postDelayed(new of0(bg0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new of0(bg0Var, 10));
                break;
            case 9:
                ds dsVar2 = bg0Var.f;
                dsVar2.e = false;
                dsVar2.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = dsVar2.f;
                    if (i12 >= gsVarArr3.length) {
                        break;
                    } else {
                        gsVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.nj0 nj0Var4 = bg0Var.s;
                nj0Var4.setAutoRepeat(false);
                nj0Var4.setAnimation(bg0Var.a);
                break;
        }
    }
}
