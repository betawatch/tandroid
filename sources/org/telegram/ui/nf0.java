package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag0 b;

    public /* synthetic */ nf0(ag0 ag0Var, int i10) {
        this.a = i10;
        this.b = ag0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gs[] gsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ag0 ag0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.lj0 lj0Var = ag0Var.G;
                ds dsVar = ag0Var.f;
                int i13 = ag0Var.f0;
                if (i13 != 3 && (gsVarArr = dsVar.f) != null) {
                    for (int length = gsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || dsVar.f[length].length() != 0) {
                            dsVar.f[length].requestFocus();
                            gs gsVar = dsVar.f[length];
                            gsVar.setSelection(gsVar.length());
                            xg0.T0(ag0Var.s0, dsVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ij0 ij0Var = ag0Var.a;
                if (ij0Var != null) {
                    ij0Var.start();
                }
                if (i13 == 15) {
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 6));
                break;
            case 2:
                ge0 ge0Var = ag0Var.w;
                ag0Var.q0 = false;
                while (true) {
                    gs[] gsVarArr2 = ag0Var.f.f;
                    if (i12 < gsVarArr2.length) {
                        gsVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (ge0Var.getCurrentView() != (ag0Var.f0 == 15 ? ag0Var.F : ag0Var.y)) {
                        ge0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.lj0 lj0Var2 = ag0Var.s;
                lj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ij0 ij0Var2 = ag0Var.O;
                ij0Var2.N(0, false, false);
                ij0Var2.K(1);
                lj0Var2.setAnimation(ij0Var2);
                lj0Var2.d();
                break;
            case 5:
                try {
                    ag0Var.s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ag0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.wh.g(new StringBuilder("+"), ag0Var.d, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new wf0(ag0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.ij0 ij0Var3 = ag0Var.P;
                ij0Var3.t0 = new nf0(ag0Var, 8);
                org.telegram.ui.Components.lj0 lj0Var3 = ag0Var.s;
                lj0Var3.setAutoRepeat(false);
                ij0Var3.N(0, false, false);
                lj0Var3.setAnimation(ij0Var3);
                lj0Var3.d();
                break;
            case 7:
                ag0Var.postDelayed(new nf0(ag0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new nf0(ag0Var, 10));
                break;
            case 9:
                ds dsVar2 = ag0Var.f;
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
                org.telegram.ui.Components.lj0 lj0Var4 = ag0Var.s;
                lj0Var4.setAutoRepeat(false);
                lj0Var4.setAnimation(ag0Var.a);
                break;
        }
    }
}
